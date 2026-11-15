package com.example.tenantmanagementsystem2.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Delete
import com.example.tenantmanagementsystem2.data.model.Tenant
import kotlinx.coroutines.flow.Flow

@Dao
interface TenantDao {

    @Insert
    suspend fun insertTenant(tenant: Tenant)

    @Query("SELECT * FROM tenants")
    fun getAllTenants(): Flow<List<Tenant>>

    @Delete
    suspend fun deleteTenant(tenant: Tenant)

    @Query("SELECT SUM(CAST(rent AS REAL)) FROM tenants")
    fun getTotalRent(): Flow<Double?>
}
