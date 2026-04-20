# Episode 17 — Function Composition and Partial Application

Student code for **Clojure for Beginners in Neovim, Episode 17**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **`comp`** — compose functions right-to-left
- **`partial`** — pre-fill arguments of a function
- **`juxt`** — apply many functions to one input, return a vector of results
- **`complement`** — flip any predicate
- **Point-free style** — build pipelines out of functions without naming the data

## Try it yourself

```bash
clojure
```

```clojure
((comp str inc) 5)              ;=> "6"
((partial + 10) 5)              ;=> 15
((juxt first last) [1 2 3 4 5]) ;=> [1 5]
((complement empty?) [1 2 3])   ;=> true
```

## Run the file

```bash
clj -M composition.clj
```

## Phase 3 — Functional Core

Build small functions, then compose them into pipelines. After map, filter,
and reduce, these four — comp, partial, juxt, complement — are the glue
that ties the toolkit together.

## Next episode

**Episode 18 — Transducers**: performance-friendly pipelines with no intermediate collections.
