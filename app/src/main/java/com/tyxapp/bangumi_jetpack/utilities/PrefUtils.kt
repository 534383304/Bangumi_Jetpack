package com.tyxapp.bangumi_jetpack.utilities

import android.annotation.SuppressLint
import com.tyxapp.bangumi_jetpack.BangumiApp
import com.tyxapp.bangumi_jetpack.R
import com.tyxapp.bangumi_jetpack.data.BangumiSource
import org.jetbrains.anko.defaultSharedPreferences

@SuppressLint("StaticFieldLeak")
class PrefUtils {
    companion object {
        private val context = BangumiApp.getContext()
        fun getHomeSourceName(): String? {
            return context.defaultSharedPreferences.getString(
                context.getString(R.string.key_home_page),
                BangumiSource.DiliDili.name
            )
        }

        fun getDecodePlanName(defaultvalue: String): String? {
            return context.defaultSharedPreferences.getString(
                context.getString(R.string.key_decoder_plan),
                defaultvalue
            )
        }
    }

}