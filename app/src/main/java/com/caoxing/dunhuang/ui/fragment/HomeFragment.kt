package com.caoxing.dunhuang.ui.fragment

import android.os.Bundle
import com.caoxing.dunhuang.R
import com.caoxing.dunhuang.base.BaseFragment
import com.caoxing.dunhuang.utils.StatusBarUtil
import com.scwang.smartrefresh.header.MaterialHeader
import kotlinx.android.synthetic.main.fragment_home.*

@Suppress("DEPRECATION")
/**
 * Created by xuhao on 2017/11/8.
 * 首页精选
 */

class HomeFragment : BaseFragment(){

    override fun lazyLoad() {

    }


    private var mTitle: String? = null

    private var num: Int = 1


    private var loadingMore = false

    private var isRefresh = false
    private var mMaterialHeader: MaterialHeader? = null

    companion object {
        fun getInstance(title: String): HomeFragment {
            val fragment = HomeFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }


    override fun getLayoutId(): Int = R.layout.fragment_home


    /**
     * 初始化 ViewI
     */
    override fun initView() {
        mRefreshLayout.setEnableHeaderTranslationContent(true)


        mLayoutStatusView = multipleStatusView

        //状态栏透明和间距处理
        activity?.let { StatusBarUtil.darkMode(it) }
        activity?.let { StatusBarUtil.setPaddingSmart(it, toolbar) }

    }






    fun getColor(colorId: Int): Int {
        return resources.getColor(colorId)
    }


}
