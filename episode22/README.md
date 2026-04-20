# Episode 22 — Testing with `clojure.test`

Write unit tests for the `app.util` namespace from Episode 20. Run them from the REPL and from the command line.

## Run the tests

```
clj -M:test
```

## Key pieces

- `deftest` — declare a test
- `is` — a single assertion
- `testing` — label a group of related assertions
- `clojure.test/run-tests` — run tests from the REPL
- `:dev` alias — adds `test/` to the classpath so the REPL can `(require 'app.util-test)`
- `:test` alias — runs `cognitect.test-runner` across the `test/` path (for CI/CLI)

## The inner loop from Episode 21 still applies

Keep the REPL running. After editing `util.clj` or `util_test.clj`:

```
(require 'app.util-test :reload)
(clojure.test/run-tests 'app.util-test)
```

Red, refactor, green — in seconds, without leaving your editor.
