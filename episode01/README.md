# Episode 1 — Hello REPL

Student code for **Clojure for Beginners in Neovim, Episode 1**.

YouTube: https://www.youtube.com/@CelesteAI (search "Learn Clojure in Neovim — Ep 1")

## What this episode covers

- Installing Clojure on macOS / Linux / Windows
- Starting the REPL with `clj` and evaluating expressions
- Prefix notation — the one syntactic rule in Clojure
- Defining a function with `defn`
- Writing and running a `.clj` file from Neovim

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

Then verify:

```bash
clj --version
# Clojure CLI version 1.12.x
```

## Try the REPL

```bash
clj
```

Evaluate a few expressions:

```clojure
(println "Hello, Clojure!")
(+ 1 2 3)         ;=> 6
(* 6 7)           ;=> 42
(* 2 (+ 3 4))     ;=> 14
(str "Clojure" " is " "fun")
(count "hello")   ;=> 5
```

Exit with **Ctrl+D**.

## Run the file

```bash
clj -M hello.clj
```

Expected output:

```
Hello, Clojure!
Hello, World!
2 + 3 = 5
```

## Next episode

**Episode 2 — S-Expressions & Syntax**: why parens, how the reader works, and reading Clojure code fluently.
