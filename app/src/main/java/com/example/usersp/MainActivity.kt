package com.example.usersp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.usersp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var mUserAdapter: UserAdapter
    private lateinit var mLinearLayoutManager: LinearLayoutManager
    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val preferences = getPreferences(Context.MODE_PRIVATE)

        val isFirstTime = preferences.getBoolean("first_time",true)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        mUserAdapter = UserAdapter(getUsers(), this)
        mLinearLayoutManager = LinearLayoutManager(this)

        mBinding.rvUser.apply {
            layoutManager = mLinearLayoutManager
            setHasFixedSize(true)
            adapter = mUserAdapter
        }
    }

    private fun getUsers(): MutableList<User>{
        val users = mutableListOf<User>()

        val emmanuel = User(1, "Emmanuel", "Morales", "https://cdn.pixabay.com/photo/2016/11/21/12/42/beard-1845166_960_720.jpg")
        val samanta = User(2, "Samanta", "Meza", "https://cdn.pixabay.com/photo/2016/11/21/12/42/beard-1845166_960_720.jpg")
        val nicolas = User(3, "nicolas", "Morales", "https://cdn.pixabay.com/photo/2016/11/21/12/42/beard-1845166_960_720.jpg")
        val samuel = User(4, "samuel", "Meza", "https://cdn.pixabay.com/photo/2016/11/21/12/42/beard-1845166_960_720.jpg")
        val jorge = User(5, "jorge", "Morales", "https://cdn.pixabay.com/photo/2016/11/21/12/42/beard-1845166_960_720.jpg")
        val esteban = User(6, "esteban", "Meza", "https://cdn.pixabay.com/photo/2016/11/21/12/42/beard-1845166_960_720.jpg")
        val enrique = User(7, "enrique", "Morales", "https://cdn.pixabay.com/photo/2016/11/21/12/42/beard-1845166_960_720.jpg")
        val luis = User(8, "luis", "Meza", "https://cdn.pixabay.com/photo/2016/11/21/12/42/beard-1845166_960_720.jpg")
        val carlos = User(9, "carlos", "Morales", "https://cdn.pixabay.com/photo/2016/11/21/12/42/beard-1845166_960_720.jpg")
        val ana = User(10, "ana", "Meza", "https://cdn.pixabay.com/photo/2016/11/29/13/14/attractive-1869761_960_720.jpg")

        users.add(emmanuel)
        users.add(samanta)
        users.add(nicolas)
        users.add(samuel)
        users.add(jorge)
        users.add(esteban)
        users.add(enrique)
        users.add(luis)
        users.add(carlos)
        users.add(ana)
        users.add(emmanuel)
        users.add(samanta)
        users.add(nicolas)
        users.add(samuel)
        users.add(jorge)
        users.add(esteban)
        users.add(enrique)
        users.add(luis)
        users.add(carlos)
        users.add(ana)
        users.add(emmanuel)
        users.add(samanta)
        users.add(nicolas)
        users.add(samuel)
        users.add(jorge)
        users.add(esteban)
        users.add(enrique)
        users.add(luis)
        users.add(carlos)
        users.add(ana)

        return users

    }

    override fun onClick(user: User, position: Int) {
        Toast.makeText(this, "${user.getFullName()} $position", Toast.LENGTH_SHORT).show()
    }
}
