package com.tyxapp.bangumi_jetpack.repository

import com.tyxapp.bangumi_jetpack.utilities.OkhttpUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONArray

const val UPDATE_INFO_URL = "https://gitee.com/tanyixiong/BangumiApk/raw/master/output.json"
object MainRepository {

    /**
     * 获取最新版本的的版本码和版本名
     * @return 版本码-版本名
     */
    suspend fun getAppVersionFromNet(): Pair<Int, String> = withContext(Dispatchers.IO) {
        val jsonArray = JSONArray(OkhttpUtil.getResponseData(UPDATE_INFO_URL))
        val infoJsonObject = jsonArray.getJSONObject(0).getJSONObject("apkData")
        Pair(
            infoJsonObject.getInt("versionCode"),
            infoJsonObject.getString("versionName")
        )
    }
}