# Episode 10 — Sets

Student code for **Clojure for Beginners in Neovim, Episode 10**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **Set literal syntax** — `#{:red :green :blue}`
- **conj and disj** — add and remove (duplicates ignored)
- **Sets as functions** — `(colors :blue)` returns `:blue` or `nil`
- **contains?** — membership test
- **clojure.set** — union, intersection, difference

## Try it yourself

```bash
clojure
```

```clojure
#{1 2 3}                               ;=> #{1 3 2}
(conj #{1 2} 3)                        ;=> #{1 3 2}
(disj #{1 2 3} 2)                      ;=> #{1 3}
(#{:a :b :c} :b)                       ;=> :b
(#{:a :b :c} :z)                       ;=> nil

(require '[clojure.set :as set])
(set/union #{1 2} #{2 3})              ;=> #{1 2 3}
(set/intersection #{1 2 3} #{2 3 4})   ;=> #{2 3}
(set/difference #{1 2 3} #{2})         ;=> #{1 3}
```

## Run the file

```bash
clj -M sets.clj
```

## Next episode

**Episode 11 — The Seq Abstraction**: one interface that works on every collection.
