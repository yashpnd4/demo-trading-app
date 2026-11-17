# Feature Status

Status values: COMPLETE | PARTIALLY COMPLETE | BLOCKED | NOT STARTED

| Feature | Implementation Status | API Integration Status | Test Status | Known Limitations | Required Credentials/Subscriptions | Remaining Work |
|---|---|---|---|---|---|---|
| Android project structure (multi-module) | COMPLETE | N/A | PARTIALLY COMPLETE | Cannot compile offline (no Gradle wrapper jar / Maven access) | Android SDK 36, Gradle | Generate wrapper jar, run `./gradlew build` with internet |
| Core: theme/design system | COMPLETE | N/A | PARTIALLY COMPLETE | Dark-first theme implemented | None | Add light theme toggle |
| Core: navigation (bottom nav 5 sections) | COMPLETE | N/A | PARTIALLY COMPLETE | All 5 sections wired | None | Add settings/strategies routes |
| Core: network (Retrofit + OkHttp) | COMPLETE | PARTIALLY COMPLETE | NOT STARTED | Requires internet for dependency resolution | None | None |
| Core: database (Room) | COMPLETE | N/A | NOT STARTED | Room KSP needs Gradle | None | None |
| Core: security (Keystore + EncryptedSharedPreferences + TokenManager) | COMPLETE | N/A | NOT STARTED | Biometric not yet wired | None | Wire biometric auth |
| Feature: Home dashboard | PARTIALLY COMPLETE | BLOCKED | NOT STARTED | Market data provider not configured; static index values | Market data provider API key | Connect live quotes via provider adapter |
| Feature: Markets / search | PARTIALLY COMPLETE | BLOCKED | NOT STARTED | Provider adapter not implemented | Market data API key | Implement OpenAlgo adapter |
| Feature: Watchlists | COMPLETE | PARTIALLY COMPLETE | NOT STARTED | Local Room DB only; no sync | None | Sync watchlists to backend |
| Feature: Charts | PARTIALLY COMPLETE | BLOCKED | NOT STARTED | Lightweight Charts wrapper isolated; no live candles | Market data subscription | Integrate TradingView lightweight-charts-android or WebView |
| Feature: Stock details | PARTIALLY COMPLETE | BLOCKED | NOT STARTED | No live data | Market data API key | Connect quote/fundamentals |
| Feature: Trading / order placement | PARTIALLY COMPLETE | PARTIALLY COMPLETE | NOT STARTED | Backend order lifecycle implemented; broker adapter not connected | Broker API key (OpenAlgo) | Connect OpenAlgo broker adapter |
| Feature: Orders (list, get, cancel) | COMPLETE | PARTIALLY COMPLETE | PARTIALLY COMPLETE | Backend tested; Android UI placeholder | Broker connection | Broker sync/reconciliation |
| Feature: Portfolio (holdings, positions, summary) | PARTIALLY COMPLETE | PARTIALLY COMPLETE | PARTIALLY COMPLETE | Backend tested; Android UI placeholder | Broker connection | Live holdings sync |
| Feature: Options analytics | NOT STARTED | BLOCKED | NOT STARTED | Requires NSE FO segment data | Options data subscription | Implement Greeks, payoff, strategy builder |
| Feature: Alerts | PARTIALLY COMPLETE | PARTIALLY COMPLETE | NOT STARTED | Backend CRUD done; no push notifications | FCM key | Push notifications |
| Feature: Risk management | COMPLETE | PARTIALLY COMPLETE | PARTIALLY COMPLETE | Backend risk engine tested; Android UI pending | None | Wire into order placement UI |
| Feature: Paper trading | PARTIALLY COMPLETE | PARTIALLY COMPLETE | NOT STARTED | Environment default = paper; backend simulation stub | None | Full paper portfolio engine |
| Feature: Backtesting (LEAN) | NOT STARTED | BLOCKED | NOT STARTED | LEAN runs independently; not integrated | LEAN installation | Backend service integration |
| Feature: Automated strategies (Freqtrade) | NOT STARTED | BLOCKED | NOT STARTED | Independent backend service; not integrated | Freqtrade installation | Backend service integration |
| Feature: Automated strategies (Hummingbot) | NOT STARTED | BLOCKED | NOT STARTED | Independent backend service; not integrated | Hummingbot installation | Backend service integration |
| Feature: Crypto (CCXT) | NOT STARTED | BLOCKED | NOT STARTED | Disabled by default | Exchange API keys | CCXT adapter |
| Feature: Settings | PARTIALLY COMPLETE | N/A | NOT STARTED | Basic settings screen | None | Theme persistence, broker config UI |
| Backend: Auth (register/login/refresh/logout, JWT) | COMPLETE | N/A | COMPLETE | 6 pytest tests pass | None | Rate limiting |
| Backend: Market data provider (normalized interface) | PARTIALLY COMPLETE | BLOCKED | PARTIALLY COMPLETE | Provider adapter not implemented | Market data API key | OpenAlgo adapter |
| Backend: Order lifecycle service | COMPLETE | PARTIALLY COMPLETE | PARTIALLY COMPLETE | Persistent CREATED->... lifecycle; broker sync stub | Broker API | Broker adapter reconciliation |
| Backend: Risk engine | COMPLETE | N/A | PARTIALLY COMPLETE | Order value, daily loss, position/order limits | None | Emergency kill switch (Redis) |
| Backend: Portfolio / holdings / positions | COMPLETE | PARTIALLY COMPLETE | PARTIALLY COMPLETE | Summary, holdings, positions endpoints | Broker connection | Live sync |
| Backend: Watchlists & alerts | COMPLETE | PARTIALLY COMPLETE | PARTIALLY COMPLETE | CRUD endpoints tested | None | Push notifications |
| Database: PostgreSQL + SQLAlchemy models | COMPLETE | N/A | PARTIALLY COMPLETE | SQLite fallback used locally | PostgreSQL for production | Migrations (alembic) |
| Cache: Redis | PARTIALLY COMPLETE | BLOCKED | NOT STARTED | Redis not running locally | Redis instance | Wire caching |
| Docker Compose | COMPLETE | N/A | NOT STARTED | postgres, redis, api-gateway | None | Production hardening |
| API documentation | PARTIALLY COMPLETE | N/A | NOT STARTED | OpenAPI auto-generated at /docs | None | Write docs/API.md |
| Security documentation | PARTIALLY COMPLETE | N/A | NOT STARTED | Keystore + encrypted prefs + JWT | None | Threat model, rotation |
