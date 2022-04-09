package com.demo.activity.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.demo.R


class SettingsFragment: PreferenceFragmentCompat() {

   override fun onCreatePreferences( savedInstanceState: Bundle?, rootKey: String? ) {
      setPreferencesFromResource( R.xml.settings_fragment, rootKey )
   }
}
