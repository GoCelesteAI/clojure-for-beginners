# Episode 18 — Transducers

Student code for **Clojure for Beginners in Neovim, Episode 18**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **What a transducer is** — a transformation, independent of collection type
- **Creating one** — call `map`, `filter`, etc. *without* a collection
- **Composing** — `comp` chains transducers left-to-right
- **`transduce`** — apply a transducer and fold into one value
- **`into`** — apply a transducer and build a new collection
- **Why it matters** — single-pass, no intermediate collections

## Try it yourself

```bash
clojure
```

```clojure
(def xf (comp (filter even?) (map #(* % %))))
(sequence xf (range 1 11))         ;=> (4 16 36 64 100)
(transduce xf + (range 1 11))      ;=> 220
(into [] xf (range 1 11))          ;=> [4 16 36 64 100]
```

## Run the file

```bash
clj -M transducers.clj
```

## Why transducers?

Threaded pipelines like `(->> xs (filter p) (map f) (reduce +))` are readable,
but each step builds a new lazy sequence. For large inputs the intermediate
allocations add up. A transducer describes the same pipeline *once* and applies
it to the collection in a single pass, without building intermediate sequences.

## Next episode

**Episode 19 — `for`, `doseq`, and list comprehensions**: generate and iterate
with clarity.
