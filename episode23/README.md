# Episode 23 — Adding a Dependency

Add `cheshire` from Clojars to parse a JSON file into Clojure data.

## Run

```
clj -M:run
```

## What's in `deps.edn`

```clojure
{:deps {cheshire/cheshire {:mvn/version "5.13.0"}}}
```

That one coordinate — `group/artifact` + `:mvn/version` — tells the Clojure CLI where to fetch the library from Maven Central / Clojars and puts it on the classpath.

## Key moves in the REPL

```clojure
(require '[cheshire.core :as json])
(json/parse-string "{\"hi\": 1}" true)   ;; keywordize keys
```

After editing `deps.edn` to add or bump a version, **restart the REPL** — `require … :reload` only reloads code, not dependency resolution.
