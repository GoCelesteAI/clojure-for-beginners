# Episode 8 — Lists

Student code for **Clojure for Beginners in Neovim, Episode 8**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **List literal syntax** — `'(1 2 3)` or `(list 1 2 3)`
- **first and rest** — head and tail of a list
- **conj adds to the front** — opposite of vectors!
- **cons** — prepend one item
- **Lists vs vectors** — when to use each
- **Stack behavior** — push with conj, pop with pop, peek at the top

## Try it yourself

```bash
clojure
```

```clojure
'(1 2 3)                       ;=> (1 2 3)
(list 1 2 3)                   ;=> (1 2 3)
(first '(10 20 30))            ;=> 10
(rest '(10 20 30))             ;=> (20 30)
(conj '(1 2 3) 0)              ;=> (0 1 2 3)   — added to front!
(cons 0 '(1 2 3))              ;=> (0 1 2 3)
```

Exit with **Ctrl+D**.

## Run the file

```bash
clj -M lists.clj
```

## Next episode

**Episode 9 — Maps**: Clojure's key-value workhorse with keywords, `assoc`, `dissoc`, and `update`.
