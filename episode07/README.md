# Episode 7 — Vectors

Student code for **Clojure for Beginners in Neovim, Episode 7**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **Vector literal syntax** — `["red" "green" "blue"]`
- **get and nth** — access by index
- **count** — how many items
- **conj** — add to the end (returns a new vector)
- **Immutability** — the original vector is never changed
- **peek and pop** — last item and everything-but-last
- **Vectors as functions** — `(colors 1)` returns the element at index 1

## Try it yourself

```bash
clojure
```

```clojure
[1 2 3]                        ;=> [1 2 3]
(conj [1 2 3] 4)               ;=> [1 2 3 4]
(get ["a" "b" "c"] 1)          ;=> "b"
(nth ["a" "b" "c"] 2)          ;=> "c"
(count [10 20 30])             ;=> 3
(peek [10 20 30])              ;=> 30
(pop [10 20 30])               ;=> [10 20]
(["a" "b" "c"] 0)              ;=> "a"
```

Exit with **Ctrl+D**.

## Run the file

```bash
clj -M vectors.clj
```

## Next episode

**Episode 8 — Lists**: prepend with conj, first/rest, and when to use lists vs vectors.
