# Episode 20 — Namespaces and `require`

Student code for **Clojure for Beginners in Neovim, Episode 20**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **`ns`** — every Clojure file starts with a namespace declaration
- **`:require`** — pulling in code from another namespace
- **`:as`** — giving that namespace a short alias (`u/shout`)
- **`:refer`** — pulling specific names in unqualified (`join` instead of `str/join`)
- **File-to-namespace mapping** — `src/app/util.clj` ↔ `app.util`

## Project layout

```
practice/
  deps.edn
  src/
    app/
      core.clj      ; ns app.core   — the entry point (-main)
      util.clj      ; ns app.util   — a small utility namespace
```

The file path under `src/` must match the namespace name, with `-` in the
namespace name becoming `_` in the file (`my-ns` → `my_ns.clj`).

## Run it

```bash
cd practice
clj -M -m app.core
# or, via the :run alias in deps.edn
clj -M:run
# pass your own label
clj -M:run "structure and interpretation"
```

Expected output (default):

```
version: 0.1.0
label:   THE LITTLE SCHEMER!
slug:    the-little-schemer
boxed:   *THE LITTLE SCHEMER!*
```

## `:as` vs `:refer` — the rule

| form | you write | pulls in |
|---|---|---|
| `(:require [app.util :as u])` | `(u/shout ...)` | an **alias** for the whole namespace |
| `(:require [clojure.string :refer [join]])` | `(join ...)` | **only `join`**, unqualified |
| `(:require [app.util :refer :all])` | anything in `app.util` | every public var (avoid — hides origin) |

Default to `:as` — it keeps call sites readable and you can always see
where a function came from.

## Next episode

**Episode 21 — REPL-Driven Development**: how the connected-editor REPL
changes the way you write Clojure.
