# Episode 2 — S-Expressions and Syntax

Student code for **Clojure for Beginners in Neovim, Episode 2**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **Prefix notation** — the one syntactic rule in Clojure
- **Variable arity** — operators like `+` and `*` take any number of arguments
- **Nesting** — inner expressions evaluate first (inside-out)
- **Code is data** — a quoted list (`'(...)`) has the same shape as code

## Try it yourself

Start the REPL:

```bash
clj
```

Evaluate the building blocks:

```clojure
;; Prefix basics
(+ 1 2)              ;=> 3
(- 10 3)             ;=> 7
(* 4 5)              ;=> 20
(/ 20 4)             ;=> 5

;; Variable arity
(+ 1 2 3 4 5)        ;=> 15
(* 2 3 4)            ;=> 24
(str "a" "b" "c")    ;=> "abc"

;; Nesting — inside evaluates first
(+ 1 (* 2 3))        ;=> 7
(* (+ 1 2) (- 10 4)) ;=> 18

;; Code is data
'(+ 1 2 3)           ;=> (+ 1 2 3)
(first '(+ 1 2 3))   ;=> +
(count '(+ 1 2 3))   ;=> 4
```

Exit with **Ctrl+D**.

## Run the file

```bash
clj -M syntax.clj
```

Expected output:

```
6
120
16
(+ 1 2 3)
+
```

## Next episode

**Episode 3 — Values, Not Variables (def and let)**: why Clojure avoids the word "variable", how `def` and `let` bind names to values, and what immutability buys you.
