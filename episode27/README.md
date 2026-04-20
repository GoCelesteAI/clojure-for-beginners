# Episode 27 — `agent` — Asynchronous State

An agent is like an atom, but the update runs **asynchronously on a background thread**. You queue a function with `send`; the agent thread applies it later. Your caller doesn't block.

## Run

```
clj -M:run
```

## The primitives

| Form                        | What it does                                                      |
|-----------------------------|-------------------------------------------------------------------|
| `(agent initial-value)`     | Create an agent                                                   |
| `@a`                        | Read the current value (non-blocking)                             |
| `(send a f & args)`         | Queue `(apply f current-value args)` on the agent thread pool     |
| `(send-off a f & args)`     | Same, but for blocking/IO fns — separate, unbounded thread pool   |
| `(await a)`                 | Block until all sends queued from this thread have completed      |
| `(shutdown-agents)`         | Release the agent thread pools (required at the end of -main)     |

## atom vs agent vs ref

| Primitive | Update style     | When                                              |
|-----------|------------------|---------------------------------------------------|
| `atom`    | Synchronous      | Independent state, caller wants the result now    |
| `ref`     | Synchronous (TX) | Multiple values must change together              |
| `agent`   | Asynchronous     | Fire-and-forget; side effects OK in the fn        |

Unlike atoms, agent fns can have side effects — they run serially on one thread per agent, so you don't get concurrent retries.
