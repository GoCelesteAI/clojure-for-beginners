# Episode 15 — Threading Macros

Student code for **Clojure for Beginners in Neovim, Episode 15**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **The nested mess** — why deeply nested calls are hard to read
- **`->>` thread-last** — pass the value as the *last* argument at each step
- **`->` thread-first** — pass the value as the *first* argument at each step
- **When to use which** — `->` for maps/strings, `->>` for seq transforms
- **Pipelines** — rewrite an `Ep14` nested pipeline in one readable expression

## Try it yourself

```bash
clojure
```

```clojure
(->> [1 2 3 4 5 6] reverse (drop 1) (take 3))
;=> (5 4 3)

(-> {:name "Ada" :age 30}
    (assoc :role "engineer")
    (update :age inc))
;=> {:name "Ada" :age 31 :role "engineer"}
```

## Run the file

```bash
clj -M threading.clj
```

## Next episode

**Episode 16 — `reduce` deep dive**: the fold that underlies everything, accumulator patterns, reduced early-exit.
