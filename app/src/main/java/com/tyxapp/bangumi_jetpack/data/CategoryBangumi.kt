package com.tyxapp.bangumi_jetpack.data

open class CategoryBangumi(
    id: String,
    name: String,
    source: BangumiSource,
    cover: String,
    var isFollow: Boolean = false
) : Bangumi(id, source, name, cover)