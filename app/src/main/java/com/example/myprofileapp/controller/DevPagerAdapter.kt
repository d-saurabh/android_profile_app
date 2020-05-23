package com.example.myprofileapp.controller

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myprofileapp.view.AboutFragment
import com.example.myprofileapp.view.ContactFragment
import com.example.myprofileapp.view.SkillsFragment
import com.example.myprofileapp.view.WorkFragment

class DevPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return AboutFragment()
            1 -> return WorkFragment()
            2 -> return SkillsFragment()
            3 -> return ContactFragment()
        }
        return AboutFragment()
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "ABOUT"
            1 -> return "WORK"
            2 -> return "SKILLS"
            3 -> return "CONTACT"
        }
        return null
    }
}