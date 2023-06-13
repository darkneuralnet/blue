package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.C17216a;
import com.facebook.CustomTabMainActivity;
import com.stripe.android.model.PaymentMethodOptionsParams;
/* renamed from: mt4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C45358mt4 {

    /* renamed from: a */
    public Fragment f98987a;

    /* renamed from: b */
    public String f98988b;

    /* renamed from: c */
    public String f98989c;

    public C45358mt4(Fragment fragment) {
        this.f98987a = fragment;
    }

    /* renamed from: c */
    public static String m24768c() {
        return "fb" + C17216a.m52740f() + "://authorize";
    }

    /* renamed from: a */
    public final void m24770a(int i, Intent intent) {
        FragmentActivity activity;
        if (this.f98987a.isAdded() && (activity = this.f98987a.getActivity()) != null) {
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    /* renamed from: b */
    public final String m24769b() {
        if (this.f98988b == null) {
            this.f98988b = C49125tF0.m12565a();
        }
        return this.f98988b;
    }

    /* renamed from: d */
    public final Bundle m24767d() {
        Bundle bundle = new Bundle();
        this.f98989c = C52364yi6.m2821p(20);
        bundle.putString("redirect_uri", C49125tF0.m12563c(m24768c()));
        bundle.putString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, C17216a.m52740f());
        bundle.putString(TransferTable.COLUMN_STATE, this.f98989c);
        return bundle;
    }

    /* renamed from: e */
    public final boolean m24766e() {
        return m24769b() != null;
    }

    /* renamed from: f */
    public void m24765f(int i, int i2, Intent intent) {
        String stringExtra;
        if (i != 1) {
            return;
        }
        if (intent != null && (stringExtra = intent.getStringExtra(CustomTabMainActivity.f69333g)) != null && stringExtra.startsWith(C49125tF0.m12563c(m24768c()))) {
            Bundle m2842e0 = C52364yi6.m2842e0(Uri.parse(stringExtra).getQuery());
            if (m24762i(m2842e0)) {
                intent.putExtras(m2842e0);
            } else {
                intent.putExtra("error_message", "The referral response was missing a valid challenge string.");
                i2 = 0;
            }
        }
        m24770a(i2, intent);
    }

    /* renamed from: g */
    public void m24764g() {
        if (!m24763h()) {
            Intent intent = new Intent();
            intent.putExtra("error_message", "Failed to open Referral dialog: Chrome custom tab could not be started. Please make sure internet permission is granted and Chrome is installed");
            m24770a(0, intent);
        }
    }

    /* renamed from: h */
    public final boolean m24763h() {
        if (this.f98987a.getActivity() != null && this.f98987a.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") == 0 && m24766e()) {
            Bundle m24767d = m24767d();
            if (C17216a.f69441q) {
                C48532sF0.m14497b(C47347qF0.m17737a("share_referral", m24767d));
            }
            Intent intent = new Intent(this.f98987a.getActivity(), CustomTabMainActivity.class);
            intent.putExtra(CustomTabMainActivity.f69330d, "share_referral");
            intent.putExtra(CustomTabMainActivity.f69331e, m24767d);
            intent.putExtra(CustomTabMainActivity.f69332f, m24769b());
            this.f98987a.startActivityForResult(intent, 1);
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m24762i(Bundle bundle) {
        if (this.f98989c != null) {
            boolean equals = this.f98989c.equals(bundle.getString(TransferTable.COLUMN_STATE));
            this.f98989c = null;
            return equals;
        }
        return true;
    }
}
