package com.anant.codingguide.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.anant.codingguide.R


class DevelopmentFragment : Fragment() {


    lateinit var btnWeb:Button
    lateinit var btnMobile:Button
    lateinit var btnDS:Button
    lateinit var btnAPI:Button
    lateinit var btnSSD:Button
    lateinit var btnCC:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_development, container, false)


        btnWeb=view.findViewById(R.id.btnWeb)
        btnMobile=view.findViewById(R.id.btnMobile)
        btnDS=view.findViewById(R.id.btnDS)
        btnAPI=view.findViewById(R.id.btnAPI)
        btnSSD=view.findViewById(R.id.btnSSD)
        btnCC=view.findViewById(R.id.btnCC)

        btnWeb.setOnClickListener {

            activity?.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/can-start-learn-web-development/")))

        }


        btnMobile.setOnClickListener {

            activity?.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/mobile_development_tutorials.htm")))

        }

        btnDS.setOnClickListener {
            activity?.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/what-is-data-science/")))

        }

        btnAPI.setOnClickListener {
            activity?.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/introduction-to-apis/")))

        }


        btnSSD.setOnClickListener {
            activity?.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/principal-of-information-system-security-security-system-development-life-cycle/")))

        }


        btnCC.setOnClickListener {
            activity?.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/cloud-computing/")))

        }







        return view
    }

}
