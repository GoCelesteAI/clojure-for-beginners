# Episode 13 — Destructuring

Student code for **Clojure for Beginners in Neovim, Episode 13**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **Vector destructuring** — `[x y z]` binds by position
- **& rest** — capture remaining items
- **Map destructuring** — `{:keys [name age]}` binds by key
- **:or for defaults** — fallback values when a key is missing
- **:as keeps the whole** — bind to the original too
- **Nested destructuring** — reach into nested maps
- **Destructuring in function parameters** — pull fields out cleanly

## Try it yourself

```bash
clojure
```

```clojure
(let [[x y] [1 2]] x)              ;=> 1
(let [[h & t] [1 2 3]] t)          ;=> (2 3)
(let [{:keys [name]} {:name "Ada"}] name)  ;=> "Ada"
(let [{:keys [x] :or {x 0}} {}] x) ;=> 0
```

## Run the file

```bash
clj -M destructuring.clj
```

## Phase 2 complete!

This wraps up Phase 2: Collections & Sequences. In Phase 3 we dive into the functional core — map, filter, reduce, threading macros, and transducers.

## Next episode

**Episode 14 — map, filter, reduce**: the three essential higher-order functions.
