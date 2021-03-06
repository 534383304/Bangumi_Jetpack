package com.tyxapp.bangumi_jetpack

import androidx.test.runner.AndroidJUnit4
import com.tyxapp.bangumi_jetpack.data.db.AppDataBase
import com.tyxapp.bangumi_jetpack.data.parsers.BimiBimi
import com.tyxapp.bangumi_jetpack.data.parsers.Nico
import com.tyxapp.bangumi_jetpack.data.parsers.Qimi
import com.tyxapp.bangumi_jetpack.data.parsers.Zzzfun
import com.tyxapp.bangumi_jetpack.repository.MainRepository
import com.tyxapp.bangumi_jetpack.utilities.LOGI
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun homeData() {
        runBlocking {
            val b = BimiBimi()
            val playerUrl = b.getPlayerUrl("1994", 0, 12)
            LOGI(playerUrl.toString())
        }
    }
}
