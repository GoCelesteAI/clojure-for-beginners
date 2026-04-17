# Episode 9 — Maps

Student code for **Clojure for Beginners in Neovim, Episode 9**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **Map literal syntax** — `{:name "Ada" :age 30}`
- **Keyword keys** — `:name`, `:age` — the idiomatic key type
- **Keywords as functions** — `(:name user)` instead of `(get user :name)`
- **assoc** — add or update a key
- **dissoc** — remove a key
- **update** — apply a function to a value
- **Immutability** — every operation returns a new map
- **Nested maps** — `get-in` for deep access

## Try it yourself

```bash
clojure
```

```clojure
{:name "Ada" :age 30}
(get {:name "Ada"} :name)         ;=> "Ada"
(:name {:name "Ada"})             ;=> "Ada"
(assoc {:a 1} :b 2)               ;=> {:a 1, :b 2}
(dissoc {:a 1 :b 2} :b)           ;=> {:a 1}
(update {:a 1} :a inc)            ;=> {:a 2}
(get-in {:a {:b 1}} [:a :b])      ;=> 1
```

Exit with **Ctrl+D**.

## Run the file

```bash
clj -M maps.clj
```

## Next episode

**Episode 10 — Sets**: unique collections, membership testing, and set operations.
