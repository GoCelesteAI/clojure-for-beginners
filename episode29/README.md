# Episode 29 — core.async — Channels and Go Blocks

CSP-style concurrency in Clojure: independent lightweight processes (`go` blocks) coordinating through `chan`nels. Instead of "shared state with locks," you get "message passing through FIFOs."

## Run

```
clj -M:run
```

## The key primitives

| Form                          | What it does                                                     |
|-------------------------------|------------------------------------------------------------------|
| `(chan)`                      | Unbuffered channel — each `>!` blocks until a `<!` takes         |
| `(chan n)`                    | Buffered channel with capacity `n`                               |
| `(go body)`                   | A lightweight "goroutine" — non-blocking parking inside          |
| `(go-loop [] body)`           | Sugar for `(go (loop [] body))`                                  |
| `(>! ch v)` / `(<! ch)`       | Send / receive — **only inside `go`** (parking)                  |
| `(>!! ch v)` / `(<!! ch)`     | Send / receive **from a real thread** (blocking)                 |
| `(close! ch)`                 | Close the channel; subsequent `<!`s return `nil`                 |
| `(timeout ms)`                | A channel that closes after `ms` ms — handy for sleeps in `go`    |

## The golden rule

- Inside `go`: use **parking** ops (`<!`, `>!`) — they yield the thread instead of blocking it.
- Outside `go` (main thread, REPL, etc.): use **blocking** ops (`<!!`, `>!!`).

If you accidentally use `<!!` inside a `go`, you pin a real thread and defeat the whole point.
