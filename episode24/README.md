# Episode 24 — Aliases and `deps.edn` Workflows

One config file, many workflows. Four aliases in `deps.edn`:

| Alias   | What it adds                                 | Typical use          |
|---------|----------------------------------------------|----------------------|
| `:run`  | `:main-opts ["-m" "app.core"]`               | `clj -M:run "alice"` |
| `:dev`  | `:extra-paths ["test"]`                      | `clj -A:dev` (REPL)  |
| `:test` | test path + cognitect test-runner + main-opt | `clj -M:test`        |
| `:json` | cheshire as `:extra-deps`                    | `clj -A:json` (REPL) |

## Stacking

Aliases combine — classpath modifications stack. Run a REPL with *both* the test path and cheshire available:

```
clj -A:dev:json
```

That's the workflow superpower: no more "I need to edit `deps.edn` to add cheshire just for this REPL session". Spin up the alias combination you need, then throw it away.

## `-M` vs `-A`

- `-M` applies modifications **and** runs `:main-opts`. Use for aliases with a main function (runner, CLI entry).
- `-A` applies classpath modifications **only**. Use for REPL sessions where you want tools available but no auto-run.
