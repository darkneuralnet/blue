package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.stripe.android.paymentsheet.p047ui.PrimaryButtonAnimator;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: qj1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class DialogC47627qj1 extends DialogC37226Xz6 {

    /* renamed from: q */
    public static final String f105681q = "qj1";

    /* renamed from: p */
    public boolean f105682p;

    /* renamed from: qj1$a */
    /* loaded from: classes5.dex */
    public class RunnableC27660a implements Runnable {
        public RunnableC27660a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                DialogC47627qj1.super.cancel();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    public DialogC47627qj1(Context context, String str, String str2) {
        super(context, str);
        m75903v(str2);
    }

    /* renamed from: A */
    public static DialogC47627qj1 m17185A(Context context, String str, String str2) {
        DialogC37226Xz6.m75910n(context);
        return new DialogC47627qj1(context, str, str2);
    }

    @Override // p000.DialogC37226Xz6, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView m75911m = m75911m();
        if (m75908p() && !m75909o() && m75911m != null && m75911m.isShown()) {
            if (this.f105682p) {
                return;
            }
            this.f105682p = true;
            m75911m.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC27660a(), PrimaryButtonAnimator.HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION);
            return;
        }
        super.cancel();
    }

    @Override // p000.DialogC37226Xz6
    /* renamed from: r */
    public Bundle mo17184r(String str) {
        Bundle m2842e0 = C52364yi6.m2842e0(Uri.parse(str).getQuery());
        String string = m2842e0.getString("bridge_args");
        m2842e0.remove("bridge_args");
        if (!C52364yi6.m2860R(string)) {
            try {
                m2842e0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C38953c70.m61926a(new JSONObject(string)));
            } catch (JSONException e) {
                C52364yi6.m2852Z(f105681q, "Unable to parse bridge_args JSON", e);
            }
        }
        String string2 = m2842e0.getString("method_results");
        m2842e0.remove("method_results");
        if (!C52364yi6.m2860R(string2)) {
            if (C52364yi6.m2860R(string2)) {
                string2 = "{}";
            }
            try {
                m2842e0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C38953c70.m61926a(new JSONObject(string2)));
            } catch (JSONException e2) {
                C52364yi6.m2852Z(f105681q, "Unable to parse bridge_args JSON", e2);
            }
        }
        m2842e0.remove("version");
        m2842e0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C50483vY2.m8465w());
        return m2842e0;
    }
}
