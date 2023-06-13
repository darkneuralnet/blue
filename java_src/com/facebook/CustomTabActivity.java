package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
/* loaded from: classes5.dex */
public class CustomTabActivity extends Activity {

    /* renamed from: c */
    public static final String f69326c = CustomTabActivity.class.getSimpleName() + ".action_customTabRedirect";

    /* renamed from: d */
    public static final String f69327d = CustomTabActivity.class.getSimpleName() + ".action_destroy";

    /* renamed from: b */
    public BroadcastReceiver f69328b;

    /* renamed from: com.facebook.CustomTabActivity$a */
    /* loaded from: classes5.dex */
    public class C17189a extends BroadcastReceiver {
        public C17189a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f69326c);
            intent2.putExtra(CustomTabMainActivity.f69333g, getIntent().getDataString());
            C34603Mu2.m94592b(this).m94590d(intent2);
            this.f69328b = new C17189a();
            C34603Mu2.m94592b(this).m94591c(this.f69328b, new IntentFilter(f69327d));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f69326c);
        intent.putExtra(CustomTabMainActivity.f69333g, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C34603Mu2.m94592b(this).m94589e(this.f69328b);
        super.onDestroy();
    }
}
