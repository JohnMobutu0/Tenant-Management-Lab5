package com.example.tenantmanagementsystem2.data.repository
import androidx.lifecycle.asLiveData
import androidx.lifecycle.LiveData
import com.example.tenantmanagementsystem2.data.local.TenantDao
import com.example.tenantmanagementsystem2.data.model.Tenant

// The single door into the data layer. The ViewModel only talks to this class
class TenantRepository(private val tenantDao: TenantDao) {

    // All tenants, kept up to date by Room
    val tenants: LiveData<List<Tenant>> = tenantDao.getAllTenants().asLiveData()

    // suspend: must be called from a coroutine
    suspend fun addTenant(tenant: Tenant) {
        tenantDao.insertTenant(tenant)
    }
}