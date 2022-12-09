package com.example.hilt_daggar


import android.util.Log
import javax.inject.Inject


const val TAG = "UserRepository"
interface UserRepository
{
    fun saveUser(email:String,password: String)
}

class SQLRepository @Inject constructor():UserRepository {
    override fun saveUser(email: String, password: String)
    {
        Log.d(TAG,"User Saved in DB")
    }
}

class FireBassRepository():UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"User Saved in Firebase")
    }

}
