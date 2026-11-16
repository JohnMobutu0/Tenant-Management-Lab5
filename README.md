# Tenant Management System
An Android app for landlords to record tenants, see total rent, and call tenants.
## Download
Latest APK: see **Releases** on the right of this page.
## Features
- Register and log in
- Dashboard with number of tenants and total rent
- Add tenants and view all tenants (saved with Room)
- Call a tenant, options menu and navigation drawer
## Architecture
ui/ Activities, Fragments and TenantViewModel (UI layer)
data/ Tenant, TenantDao, TenantDatabase, TenantRepository (data layer)
Screens → TenantViewModel (LiveData) → TenantRepository → Room
## Team
| Stage       | Member  | Admission No. | Pull request                                                  |
|-------------|---------|--------|----------------------------------------------------------------------|
| 1 Lead      | Cirhuza | 166010 | ([link](https://github.com/JohnMobutu0/Tenant-Management-Lab5.git)) |
| 2 ViewModel | Zulekha | 171369 | ([link](https://github.com/JohnMobutu0/Tenant-Management-Lab5/pull/1)) |
| 3 Room      | Brighton | 167297 | (https://github.com/JohnMobutu0/Tenant-Management-Lab5/pull/2) |
| 4 Screens   | Mary | 168837 | ([link](https://github.com/JohnMobutu0/Tenant-Management-Lab5/pull/5)) |
| 5 Data integration | Trizah | 192401 | (https://github.com/JohnMobutu0/Tenant-Management-Lab5/pull/6) |
| 6 Release | Cirhuza | 166010 | (https://github.com/JohnMobutu0/Tenant-Management-Lab5.git) |