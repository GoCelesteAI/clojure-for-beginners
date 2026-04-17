# Episode 5 — Conditionals

Student code for **Clojure for Beginners in Neovim, Episode 5**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **if** — an expression that returns a value, not a statement
- **when** — single-branch conditional, returns nil when false
- **Truthiness** — only `nil` and `false` are falsy; everything else is truthy (including 0 and "")
- **cond** — multi-way branching with condition/result pairs

## Try it yourself

```bash
clojure
```

```clojure
(if true "yes" "no")           ;=> "yes"
(if false "yes" "no")          ;=> "no"
(if nil "yes" "no")            ;=> "no"   (nil is falsy)
(if 0 "yes" "no")              ;=> "yes"  (0 is truthy!)
(if "" "yes" "no")             ;=> "yes"  (empty string is truthy!)

(when true "hello")            ;=> "hello"
(when false "hello")           ;=> nil

(cond
  (< 5 0) "negative"
  (= 5 0) "zero"
  :else   "positive")          ;=> "positive"
```

Exit with **Ctrl+D**.

## Run the file

```bash
clj -M conditionals.clj
```

Expected output:

```
big
x is positive
truthy
truthy
falsy
negative
zero
positive
```

## Next episode

**Episode 6 — Your First Script**: `deps.edn`, `-main` function, and running a project with `clj -M`.
