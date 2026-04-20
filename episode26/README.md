# Episode 26 — `ref` and STM — Coordinated State

When multiple pieces of state must change together, atoms aren't enough. Clojure's answer is `ref` + Software Transactional Memory.

## Run

```
clj -M:run
```

## The three primitives

| Form                            | What it does                                                     |
|---------------------------------|------------------------------------------------------------------|
| `(ref 0)`                       | Create a ref with initial value                                  |
| `@account-a`                    | Read the current value                                           |
| `(dosync ...)`                  | Open a transaction — body runs atomically; may retry             |
| `(alter r f & args)`            | Update a ref inside a transaction with `f`                        |
| `(commute r f & args)`          | Like `alter`, but commutative — no retries under contention      |

## Why STM

An `alter` call outside `dosync` throws `IllegalStateException: No transaction running`. That's not a bug — it's the guarantee. STM forces every ref update into a transaction, so:

- **Atomic** — either all changes commit or none do
- **Consistent** — invariants (like `a + b = 100`) always hold between transactions
- **Isolated** — concurrent transactions don't see each other's partial work

## Why not atoms

`swap!` on one atom is pairwise atomic. `swap!` on two atoms is NOT — there's a window where A has changed but B hasn't. For money-like state (debit + credit), that window is a correctness bug. STM closes it.
