package com.demo.activity.settings

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.demo.R


class SettingsActivity : AppCompatActivity() {

   override fun onCreate( savedInstanceState: Bundle? ) {
      super.onCreate( savedInstanceState )
      setContentView( R.layout.settings_activity )

      supportFragmentManager
         .beginTransaction()
         .replace( R.id.settings_activity_layout, SettingsFragment() )
         .commit()
   }
}
