# Episode 11 — The Seq Abstraction

Student code for **Clojure for Beginners in Neovim, Episode 11**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **seq** — converts any collection to a sequence (or nil if empty)
- **first / rest / next** — head and tail on ANY seqable thing
- **Seqable types** — vectors, lists, maps, sets, and strings all work
- **One interface, every collection** — learn these functions once, use them everywhere
- **A polymorphic function** — same code works on vectors, lists, and strings

## Try it yourself

```bash
clojure
```

```clojure
(seq [1 2 3])              ;=> (1 2 3)
(seq {:a 1 :b 2})          ;=> ([:a 1] [:b 2])
(seq "hello")              ;=> (\h \e \l \l \o)
(seq [])                   ;=> nil

(first [10 20 30])         ;=> 10
(rest [10 20 30])          ;=> (20 30)
(first {:a 1 :b 2})        ;=> [:a 1]
(first "hello")            ;=> \h
```

## Run the file

```bash
clj -M seqs.clj
```

## Next episode

**Episode 12 — Lazy Sequences**: `range`, `take`, `repeat`, `iterate` — infinite data that costs nothing.
