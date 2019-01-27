package com.caoxing.dunhuang.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.caoxing.dunhuang.R
import com.caoxing.dunhuang.base.BaseFragment
import com.caoxing.dunhuang.utils.StatusBarUtil
import kotlinx.android.synthetic.main.fragment_mine.*

/**
 * Created by xuhao on 2017/11/9.
 * 我的
 */
class MineFragment : BaseFragment(),View.OnClickListener {


    private var mTitle:String? =null


    companion object {
        fun getInstance(title:String): MineFragment {
            val fragment = MineFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }


    override fun getLayoutId(): Int= R.layout.fragment_mine

    override fun initView() {
        //状态栏透明和间距处理
        activity?.let { StatusBarUtil.darkMode(it) }
        activity?.let { StatusBarUtil.setPaddingSmart(it, toolbar) }


    }

    override fun lazyLoad() {

    }



    override fun onClick(v: View?) {

    }





}