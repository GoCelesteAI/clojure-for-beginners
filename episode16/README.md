# Episode 16 — Recursion and `loop`/`recur`

Student code for **Clojure for Beginners in Neovim, Episode 16**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **`recur`** — tail-call jump that reuses the stack frame
- **`loop`** — a local recursion point with named bindings
- **Factorial and sum-to-n** — classic recursive patterns without stack overflow
- **Tree walker** — an explicit stack driven by `loop`/`recur`
- **When to reach for HOFs** — map, filter, reduce cover most walks

## Try it yourself

```bash
clojure
```

```clojure
(loop [i 0 acc 0] (if (> i 5) acc (recur (inc i) (+ acc i))))
;; returns 15

(defn fact [n] (loop [i n acc 1] (if (zero? i) acc (recur (dec i) (* acc i)))))
(fact 10)
;; returns 3628800
```

## Run the file

```bash
clj -M recursion.clj
```

## Why `recur` matters

The JVM has no tail-call optimization, so a plain recursive call on a deep
input would blow the stack. `recur` is Clojure's answer — it jumps back to
the nearest `loop` or `fn` without consuming a new frame, so even huge
inputs stay safe.

## Next episode

**Episode 17 — Function Composition and Partial Application**: `comp`, `partial`, `juxt`.
