package com.caoxing.dunhuang.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import com.caoxing.dunhuang.R
import com.caoxing.dunhuang.base.BaseFragment
import com.caoxing.dunhuang.utils.StatusBarUtil
import kotlinx.android.synthetic.main.fragment_hot.*

/**
 * Created by xuhao on 2017/11/9.
 * 热门
 */
class HotFragment : BaseFragment(){


    private var mTitle: String? = null

    /**
     * 存放 tab 标题
     */
    private val mTabTitleList = ArrayList<String>()

    private val mFragmentList = ArrayList<Fragment>()

    companion object {
        fun getInstance(title: String): HotFragment {
            val fragment = HotFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }

    init {
    }


    override fun getLayoutId(): Int = R.layout.fragment_hot


    override fun lazyLoad() {
    }

    override fun initView() {

        mLayoutStatusView = multipleStatusView
        //状态栏透明和间距处理
        activity?.let { StatusBarUtil.darkMode(it) }
        activity?.let { StatusBarUtil.setPaddingSmart(it, toolbar) }
    }




}