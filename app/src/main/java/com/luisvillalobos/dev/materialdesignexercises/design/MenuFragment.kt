package com.luisvillalobos.dev.materialdesignexercises

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.luisvillalobos.dev.materialdesignexercises.utils.RoundedBottomSheetDialogFragment

private const val PARAM_LIST = "param_list"

class MenuFragment : RoundedBottomSheetDialogFragment() {
    private var listener: OnFragmentInteractionListener? = null
    private var listParam: ArrayList<Option>? = null

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            listParam = it.getParcelableArrayList(PARAM_LIST)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewOptions)
        recyclerView.layoutManager = GridLayoutManager(activity, 1)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = listParam?.let {
            OptionAdapter(it) { item ->
                listener?.onItemClickRecyclerView(item)
            }
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnFragmentInteractionListener {
        fun onItemClickRecyclerView(item: Option)
    }

    companion object {
        @JvmStatic
        fun newInstance(list: ArrayList<Option>) =
            MenuFragment().apply {
                arguments = Bundle().apply {
                    putParcelableArrayList(PARAM_LIST, list)
                }
            }
    }
}
