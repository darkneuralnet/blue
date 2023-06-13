package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.login.C17258b;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes5.dex */
public class FacebookActivity extends FragmentActivity {

    /* renamed from: c */
    public static String f69339c = "PassThrough";

    /* renamed from: d */
    public static String f69340d = "SingleFragment";

    /* renamed from: e */
    public static final String f69341e = "com.facebook.FacebookActivity";

    /* renamed from: b */
    public Fragment f69342b;

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (C52902zd1.m994h(str, printWriter, strArr)) {
                return;
            }
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    public Fragment getCurrentFragment() {
        return this.f69342b;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f69342b;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C17216a.m52722x()) {
            C52364yi6.m2853Y(f69341e, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            C17216a.m52750D(getApplicationContext());
        }
        setContentView(C49418tk4.com_facebook_activity_layout);
        if (f69339c.equals(intent.getAction())) {
            m52890w();
        } else {
            this.f69342b = m52891v();
        }
    }

    /* renamed from: v */
    public Fragment m52891v() {
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment m67322m0 = supportFragmentManager.m67322m0(f69340d);
        if (m67322m0 == null) {
            if ("FacebookDialogFragment".equals(intent.getAction())) {
                C44069kj1 c44069kj1 = new C44069kj1();
                c44069kj1.setRetainInstance(true);
                c44069kj1.show(supportFragmentManager, f69340d);
                return c44069kj1;
            } else if ("DeviceShareDialogFragment".equals(intent.getAction())) {
                DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
                deviceShareDialogFragment.setRetainInstance(true);
                deviceShareDialogFragment.m52412J9((ShareContent) intent.getParcelableExtra("content"));
                deviceShareDialogFragment.show(supportFragmentManager, f69340d);
                return deviceShareDialogFragment;
            } else if ("ReferralFragment".equals(intent.getAction())) {
                C45951nt4 c45951nt4 = new C45951nt4();
                c45951nt4.setRetainInstance(true);
                supportFragmentManager.m67311q().m67121c(C33327Hi4.com_facebook_fragment_container, c45951nt4, f69340d).mo67115i();
                return c45951nt4;
            } else {
                C17258b c17258b = new C17258b();
                c17258b.setRetainInstance(true);
                supportFragmentManager.m67311q().m67121c(C33327Hi4.com_facebook_fragment_container, c17258b, f69340d).mo67115i();
                return c17258b;
            }
        }
        return m67322m0;
    }

    /* renamed from: w */
    public final void m52890w() {
        setResult(0, C50483vY2.m8474n(getIntent(), null, C50483vY2.m8469s(C50483vY2.m8464x(getIntent()))));
        finish();
    }
}
