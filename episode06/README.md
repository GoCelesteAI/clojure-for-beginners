# Episode 6 — Your First Script

Student code for **Clojure for Beginners in Neovim, Episode 6**.

YouTube: https://www.youtube.com/@CelesteAI

## What this episode covers

- **deps.edn** — the project config file, replacing Leiningen's `project.clj`
- **:paths** — tells Clojure where your source files live
- **Namespace-to-path mapping** — `hello.core` becomes `src/hello/core.clj`
- **-main** — the entry point function, called when you run the project
- **& args** — variadic arguments for command-line input
- **clj -M -m hello.core** — run a namespace's `-main` from the terminal

## Project structure

```
my-app/
  deps.edn              {:paths ["src"]}
  src/
    hello/
      core.clj           (ns hello.core) + (defn -main ...)
```

## Run it

```bash
cd my-app

# No arguments
clj -M -m hello.core

# With arguments
clj -M -m hello.core Alice Bob
```

Expected output (no args):

```
Welcome to my first Clojure project!
Hello, World!
```

Expected output (with args):

```
Welcome to my first Clojure project!
Hello, World!
Arguments: (Alice Bob)
Hello, Alice!
Hello, Bob!
```

## Key rules

1. **deps.edn** must be in the project root
2. **Namespace = path**: dots become slashes, hyphens become underscores in filenames
3. **-main** is the convention for the entry point — the dash prefix is intentional
4. **& args** captures all remaining arguments as a sequence (or nil if none)

## Phase 1 complete!

This wraps up Phase 1: REPL & First Values. In Phase 2, we start working with Clojure's four core collections — vectors, lists, maps, and sets.

## Next episode

**Episode 7 — Vectors**: Clojure's go-to ordered collection.
