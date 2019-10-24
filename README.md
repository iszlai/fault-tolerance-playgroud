# fault-tolerance-playgroud

A playground to explore different failture modes in two services communication via rest.

# Adder

Adder stores and maintains the current live time value, based on the transactions comming from the **ledger**

# Ledger

Store all incomming transactions to a system, for later accounting, calls **adder** for ltv calculations

# Experiment setup

Both services are transactional, and should maintain a consistent state of transactions.

**Sleeps** / **spin loops** will simmulate additional work.

Some additional chaos engineering worth simmulating:

- Memory leek
- Network failure to db
- Connection erros
- high latency
