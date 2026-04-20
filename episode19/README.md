# Episode 19 — `for`, `doseq`, and List Comprehensions

Student code for **Clojure for Beginners in Neovim, Episode 19**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **`for`** — a list comprehension that returns a lazy sequence
- **Multiple bindings** — nested generators; rightmost varies fastest
- **`:when`** — inline filter over bindings
- **`:let`** — name intermediate values mid-comprehension
- **`doseq`** — same shape as `for`, but eager and for side effects

## Try it yourself

```bash
clojure
```

```clojure
(for [x (range 3) y (range 3)] [x y])
;=> ([0 0] [0 1] [0 2] [1 0] [1 1] [1 2] [2 0] [2 1] [2 2])

(for [x (range 10) :when (odd? x)] x)
;=> (1 3 5 7 9)

(doseq [n (range 1 4)] (println "tick" n))
; tick 1
; tick 2
; tick 3
;=> nil
```

## Run the file

```bash
clj -M for_doseq.clj
```

## for vs doseq

| | returns | evaluates | use for |
|---|---|---|---|
| `for` | a lazy seq of results | lazily | **values** |
| `doseq` | `nil` | eagerly | **side effects** |

If you find yourself wrapping `for` in `dorun` or throwing the result away,
you want `doseq`.

## Next episode

**Episode 20 — Namespaces and `require`**: organising code across files,
kicking off Phase 4 (Namespaces, Projects, Testing).
