# Episode 25 — `atom` — Independent State

Clojure's primary answer to "I need a mutable thing" is `atom`. It holds a single value, and you swap that value out with a pure function — no locks, no dance.

## Run

```
clj -M:run
```

## The three primitives

| Form                              | What it does                                             |
|-----------------------------------|----------------------------------------------------------|
| `(atom 0)`                        | Create an atom with initial value                        |
| `@counter`  (or `(deref counter)`)| Read the current value                                   |
| `(swap! counter inc)`             | Apply a pure fn; atom's value becomes the fn's result     |
| `(reset! counter 0)`              | Replace the value unconditionally                        |

## Why it's safe

`swap!` is **compare-and-set** under the hood: Clojure reads the atom's value, applies your fn, and atomically stores the result — but only if no one else changed it in between. If someone did, Clojure retries your fn with the new value. Your function must therefore be side-effect free.

## Two shapes

- **Scalar atom** — a counter holding one integer. `swap! inc` wins.
- **Map atom** — an in-memory cache holding many keys. `swap! assoc :k v` wins.

Same primitive, same guarantees, completely different feel.
