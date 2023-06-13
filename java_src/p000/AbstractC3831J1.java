package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.AccessToken;
import com.facebook.C17216a;
/* renamed from: J1 */
/* loaded from: classes5.dex */
public abstract class AbstractC3831J1 {

    /* renamed from: d */
    public static final String f16564d = "J1";

    /* renamed from: a */
    public final BroadcastReceiver f16565a;

    /* renamed from: b */
    public final C34603Mu2 f16566b;

    /* renamed from: c */
    public boolean f16567c = false;

    /* renamed from: J1$b */
    /* loaded from: classes5.dex */
    public class C3833b extends BroadcastReceiver {
        public C3833b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                C52364yi6.m2853Y(AbstractC3831J1.f16564d, "AccessTokenChanged");
                AbstractC3831J1.this.mo52309d((AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    public AbstractC3831J1() {
        C48817sj6.m13763o();
        this.f16565a = new C3833b();
        this.f16566b = C34603Mu2.m94592b(C17216a.m52741e());
        m101393e();
    }

    /* renamed from: b */
    public final void m101395b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f16566b.m94591c(this.f16565a, intentFilter);
    }

    /* renamed from: c */
    public boolean m101394c() {
        return this.f16567c;
    }

    /* renamed from: d */
    public abstract void mo52309d(AccessToken accessToken, AccessToken accessToken2);

    /* renamed from: e */
    public void m101393e() {
        if (this.f16567c) {
            return;
        }
        m101395b();
        this.f16567c = true;
    }

    /* renamed from: f */
    public void m101392f() {
        if (!this.f16567c) {
            return;
        }
        this.f16566b.m94589e(this.f16565a);
        this.f16567c = false;
    }
}
