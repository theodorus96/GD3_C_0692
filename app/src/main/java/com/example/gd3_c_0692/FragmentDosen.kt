package com.example.gd3_c_0692

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_c_0692.entity.Dosen
import com.example.gd3_c_0692.entity.Mahasiswa

class FragmentDosen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dosen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        val adapter : RVDosenAdapter = RVDosenAdapter(Dosen.listOfDosen)

        val rvDosen : RecyclerView = view.findViewById(R.id.rv_dosen)

        rvDosen.layoutManager = layoutManager

        rvDosen.setHasFixedSize(true)

        rvDosen.adapter = adapter
    }

}