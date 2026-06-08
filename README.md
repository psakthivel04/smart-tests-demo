# smart-tests-demo

Demo repository for verifying the Smart Tests GitHub App observation mode and confidence curve generation.

## Test Profile

| Test Class | Count | Behavior |
|---|---|---|
| AlwaysPassTests | 20 | Always pass |
| AlwaysFailTests | 10 | Always fail |
| FlakyTests | 15 | ~50% pass rate |
| MostlyPassTests | 10 | ~90% pass rate |
| MostlyFailTests | 10 | ~10% pass rate |
| **Total** | **65** | |

## CI

GitHub Actions runs `mvn test` on every push. The `smart-tests-results-upload-action` uploads Surefire XML results as an artifact for the Smart Tests GitHub App to ingest.
