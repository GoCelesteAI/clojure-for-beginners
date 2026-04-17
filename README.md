# Clojure for Beginners in Neovim

Student code for the **Clojure for Beginners in Neovim** YouTube series by **CelesteAI**.

YouTube: https://www.youtube.com/@CelesteAI
Playlist: [Clojure for Beginners](https://www.youtube.com/playlist?list=PL...) *(link updates with each new episode)*

## About this series

Clojure is a modern Lisp on the JVM with a REPL-driven workflow, immutable data, and world-class concurrency. This 45-episode series takes you from zero Clojure to a deployed web app.

**No prior Lisp or functional programming experience required.**

Every episode ships with:
- A short, focused video (4–8 minutes)
- A runnable `.clj` file in the `episodeNN/` folder
- Install/run instructions in the episode README

## Install Clojure

**macOS (Homebrew):**

```bash
brew install clojure/tools/clojure
```

**Linux (official install script):**

```bash
curl -O https://download.clojure.org/install/linux-install.sh
chmod +x linux-install.sh
sudo ./linux-install.sh
```

**Windows (PowerShell):**

```powershell
iwr -useb download.clojure.org/install/win-install.ps1 | iex
```

Verify:

```bash
clj --version
# Clojure CLI version 1.12.x
```

## How to run an episode

```bash
cd episode01
clj -M hello.clj
```

Or start a REPL in the folder:

```bash
clj
```

## Series Roadmap

### Phase 1 — REPL & First Values (Episodes 1–6)
1. **Hello REPL** — install, REPL, first function
2. **S-Expressions & Syntax** — prefix notation, nesting, variable arity, code-is-data
3. Values, Not Variables — `def` and `let`
4. Functions with `defn`
5. Conditionals — `if`, `when`, `cond`
6. Your First Script — `deps.edn` and `clj -M`

### Phase 2 — Collections & Sequences (Episodes 7–13)
Vectors, lists, maps, sets, the seq abstraction, lazy sequences, destructuring.

### Phase 3 — Functional Core (Episodes 14–19)
`map`/`filter`/`reduce`, threading macros, recursion with `loop`/`recur`, composition, transducers, list comprehensions.

### Phase 4 — Namespaces, Projects, Testing (Episodes 20–24)
Namespaces, REPL-driven development, `clojure.test`, dependencies, `deps.edn` workflows.

### Phase 5 — State & Concurrency (Episodes 25–30)
Atoms, refs/STM, agents, futures/promises, core.async, concurrency decision guide.

### Phase 6 — Data Modeling (Episodes 31–35)
Namespaced keywords, `clojure.spec`, `malli`, protocols/records, multimethods.

### Phase 7 — Macros & Metaprogramming (Episodes 36–38)
Quote/syntax-quote, writing macros, `macroexpand` and practical patterns.

### Phase 8 — JVM Interop & Tooling (Episodes 39–41)
Java interop, Babashka, uberjars.

### Phase 9 — Capstone: A Full Web App (Episodes 42–45)
Ring → Reitit routing → `next.jdbc` + SQLite → Dockerized deploy.

## Episodes in this repo

| #  | Title                                    | Folder        |
|----|------------------------------------------|---------------|
| 01 | Hello REPL                               | [episode01/](episode01/) |
| 02 | S-Expressions & Syntax                   | [episode02/](episode02/) |
| 03 | Values, Not Variables (def & let)        | [episode03/](episode03/) |
| 04 | Functions with defn                      | [episode04/](episode04/) |
| 05 | Conditionals (if, when, cond)            | [episode05/](episode05/) |
| 06 | Your First Script (deps.edn & -main)    | [clojure-first-script](https://github.com/GoCelesteAI/clojure-first-script) *(own repo — real project)* |
| 07 | Vectors                                  | [episode07/](episode07/) |
| 08 | Lists                                    | [episode08/](episode08/) |

More episodes land here as each video ships. Episodes with `deps.edn` project structure get their own repo.

## License

MIT — see [LICENSE](LICENSE). Use the code freely.

## Credits

Taught by **CelesteAI**. Like & subscribe for more Clojure tutorials on YouTube.
