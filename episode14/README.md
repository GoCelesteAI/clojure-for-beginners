# Episode 14 — map, filter, reduce

Student code for **Clojure for Beginners in Neovim, Episode 14**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **`map`** — apply a function to every element
- **`filter`** — keep elements that match a predicate
- **`reduce`** — fold a collection into a single value
- **Anonymous functions** — `(fn [x] ...)` and the `#()` shorthand
- **Pipelines** — combine the three to transform data

## Try it yourself

```bash
clojure
```

```clojure
(map inc [1 2 3])          ;=> (2 3 4)
(filter even? (range 10))  ;=> (0 2 4 6 8)
(reduce + [1 2 3 4 5])     ;=> 15
(map #(* % %) [1 2 3])     ;=> (1 4 9)
```

## Run the file

```bash
clj -M mapfilterreduce.clj
```

## Phase 3 begins

This is the start of Phase 3: Functional Core. Map, filter, and reduce
are the three higher-order functions you'll reach for in almost every
Clojure program.

## Next episode

**Episode 15 — Threading macros**: `->` and `->>` for readable pipelines.
