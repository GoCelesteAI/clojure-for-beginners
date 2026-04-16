# Episode 4 — Functions with defn

Student code for **Clojure for Beginners in Neovim, Episode 4**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **defn** — the go-to way to define a named function
- **Parameters** — a vector of argument names after the function name
- **Return value** — always the value of the last expression in the body
- **Docstrings** — an optional string between the name and the parameter vector
- **Multi-arity** — a single function with different bodies for different argument counts

## Try it yourself

```bash
clj
```

```clojure
;; The shape is: (defn name [params] body)
(defn greet [name] (str "Hello, " name))
(greet "Ada")                    ;=> "Hello, Ada"

;; Multiple arguments
(defn add [a b] (+ a b))
(add 3 5)                        ;=> 8

;; The last expression is the return value — no `return` keyword
(defn square [x] (* x x))
(square 7)                       ;=> 49
```

Exit with **Ctrl+D**.

## Run the file

```bash
clj -M functions.clj
```

Expected output:

```
Hello, Ada!
Sum: 30
Square: 81
Cube: 64
Hello!
Hello, World!
```

## Next episode

**Episode 5 — Conditionals**: `if`, `when`, and `cond`. Branching as expressions that return values.
