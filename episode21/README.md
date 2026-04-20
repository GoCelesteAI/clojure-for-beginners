# Episode 21 — REPL-Driven Development

Build `parse-person` one evaluation at a time. Keep the REPL running. Reload on save. Use `(comment ...)` as a scratchpad.

## Run

```
clj -M:run
```

## The Inner Loop

1. Start the REPL once: `clojure` (or `clj`).
2. Load the file: `(load-file "src/app/core.clj")` — or `(require 'app.core :reload)` after the first load.
3. Evaluate forms from the `(comment ...)` block by copy-pasting into the REPL.
4. Edit the file in your editor.
5. Reload. Re-evaluate. Repeat.

The REPL holds state across reloads — your data, your bindings, your test inputs are all still there. That's the whole point.
