# Episode 30 — Concurrency Decision Guide

The question isn't "which primitive is best?" — it's "which one fits the shape of my problem?" This episode shows the same hit counter written four ways, then lays out a short decision tree.

## Run

```
clj -M:run
```

## The decision tree

| Shape of your problem                                | Pick                       |
|------------------------------------------------------|----------------------------|
| One value, caller wants the answer now               | **atom**                   |
| Multiple values must change together (invariant)     | **ref** + `dosync`/`alter` |
| Fire-and-forget state; fn may do side effects        | **agent** + `send`         |
| Producer/consumer, backpressure, many workers        | **core.async** channels    |
| One-shot async computation (not state)               | **future** / **promise**   |

## Common mistakes

- **Reaching for a lock.** You almost never need one. Pick a primitive and use it.
- **Using `atom` when you need coordination.** Two `swap!`s on two atoms are not atomic together. Two refs in one `dosync` are.
- **Putting side effects inside `swap!`.** `swap!`'s fn may retry under contention — duplicate side effects will happen. Use `agent` for this.
- **`<!!` inside a `go` block.** That pins a real thread. Use `<!` inside `go`; `<!!` only from real threads.
- **Forgetting `(shutdown-agents)` in `-main`.** The agent/async thread pools keep the JVM alive until you release them.
