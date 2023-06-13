package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
/* loaded from: classes5.dex */
public class CustomTabMainActivity extends Activity {

    /* renamed from: d */
    public static final String f69330d = CustomTabMainActivity.class.getSimpleName() + ".extra_action";

    /* renamed from: e */
    public static final String f69331e = CustomTabMainActivity.class.getSimpleName() + ".extra_params";

    /* renamed from: f */
    public static final String f69332f = CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage";

    /* renamed from: g */
    public static final String f69333g = CustomTabMainActivity.class.getSimpleName() + ".extra_url";

    /* renamed from: h */
    public static final String f69334h = CustomTabMainActivity.class.getSimpleName() + ".action_refresh";

    /* renamed from: i */
    public static final String f69335i = CustomTabMainActivity.class.getSimpleName() + ".no_activity_exception";

    /* renamed from: b */
    public boolean f69336b = true;

    /* renamed from: c */
    public BroadcastReceiver f69337c;

    /* renamed from: com.facebook.CustomTabMainActivity$a */
    /* loaded from: classes5.dex */
    public class C17190a extends BroadcastReceiver {
        public C17190a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f69334h);
            String str = CustomTabMainActivity.f69333g;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    /* renamed from: a */
    public static Bundle m52893a(String str) {
        Uri parse = Uri.parse(str);
        Bundle m2842e0 = C52364yi6.m2842e0(parse.getQuery());
        m2842e0.putAll(C52364yi6.m2842e0(parse.getFragment()));
        return m2842e0;
    }

    /* renamed from: b */
    public final void m52892b(int i, Intent intent) {
        Bundle bundle;
        C34603Mu2.m94592b(this).m94589e(this.f69337c);
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f69333g);
            if (stringExtra != null) {
                bundle = m52893a(stringExtra);
            } else {
                bundle = new Bundle();
            }
            Intent m8474n = C50483vY2.m8474n(getIntent(), bundle, null);
            if (m8474n != null) {
                intent = m8474n;
            }
            setResult(i, intent);
        } else {
            setResult(i, C50483vY2.m8474n(getIntent(), null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = CustomTabActivity.f69326c;
        if (str.equals(getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null) {
            String stringExtra = getIntent().getStringExtra(f69330d);
            Bundle bundleExtra = getIntent().getBundleExtra(f69331e);
            boolean m17736b = new C47347qF0(stringExtra, bundleExtra).m17736b(this, getIntent().getStringExtra(f69332f));
            this.f69336b = false;
            if (!m17736b) {
                setResult(0, getIntent().putExtra(f69335i, true));
                finish();
                return;
            }
            this.f69337c = new C17190a();
            C34603Mu2.m94592b(this).m94591c(this.f69337c, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f69334h.equals(intent.getAction())) {
            C34603Mu2.m94592b(this).m94590d(new Intent(CustomTabActivity.f69327d));
            m52892b(-1, intent);
        } else if (CustomTabActivity.f69326c.equals(intent.getAction())) {
            m52892b(-1, intent);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f69336b) {
            m52892b(0, null);
        }
        this.f69336b = true;
    }
}
