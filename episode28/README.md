# Episode 28 — `future` and `promise`

Two small primitives that cover 80% of async code in Clojure.

## Run

```
clj -M:run
```

## The two primitives

| Form                  | What it does                                                                    |
|-----------------------|---------------------------------------------------------------------------------|
| `(future body)`       | Run `body` on a background thread; returns a future reference                   |
| `@f` / `(deref f)`    | Block until the future's body finishes; return its value                        |
| `(realized? f)`       | `true` if the future (or promise) has a value — non-blocking                    |
| `(promise)`           | An empty cell waiting for one value                                             |
| `(deliver p v)`       | Deliver `v` into `p`; any thread deref'ing `@p` unblocks                        |
| `@p` / `(deref p)`    | Block until someone delivers                                                    |

## future vs promise

- `future`: **you** supply the work. The future runs it.
- `promise`: **someone else** supplies the value — later, from any thread. Useful for producer/consumer handoffs where the producer isn't a simple "compute this fn" shape.

Both are synchronized one-shot values: once a future completes or a promise is delivered, the value is fixed for all future derefs.
