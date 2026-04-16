# Episode 3 — Values, Not Variables

Student code for **Clojure for Beginners in Neovim, Episode 3**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **def** — bind a name to a value at the top level of a namespace
- **let** — bind names locally, just for the body of one expression
- **Immutability** — names don't change; they're bound to values
- **Shadowing** — a `let` can temporarily shadow a `def` without changing it
- **Kebab-case** — the idiomatic naming convention in Clojure

## Try it yourself

```bash
clj
```

```clojure
(def pi 3.14159)
pi                              ;=> 3.14159

(def radius 5)
(* pi radius radius)            ;=> 78.53975

;; let — local bindings in a block
(let [r 5]
  (* pi r r))                   ;=> 78.53975

;; multiple bindings in one let
(let [w 10 h 4]
  (* w h))                      ;=> 40

;; shadowing — pi unchanged outside the let
(let [pi 3]
  (* pi 2))                     ;=> 6
pi                              ;=> 3.14159

;; kebab-case names
(def first-name "Ada")
first-name                      ;=> "Ada"
```

Exit with **Ctrl+D**.

## Run the file

```bash
clj -M values.clj
```

Expected output:

```
Circle area: 78.53975
Rectangle area: 40
Name: Ada Lovelace
Shadow inside: 3
pi outside is still: 3.14159
```

## Next episode

**Episode 4 — Functions with `defn`**: define, call, return values, parameters, and multi-arity functions.
