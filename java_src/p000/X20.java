package p000;

import android.content.Context;
import android.util.Log;
import java.util.Arrays;
import org.json.JSONException;
/* renamed from: X20 */
/* loaded from: classes2.dex */
public class X20 {

    /* renamed from: a */
    public static final X20 f42550a = new X20();

    private X20() {
    }

    /* renamed from: c */
    public static X20 m77529c() {
        return f42550a;
    }

    /* renamed from: a */
    public void m77531a(Context context) {
        LR3.m96941c("browserSwitch.request", context);
    }

    /* renamed from: b */
    public Y20 m77530b(Context context) {
        String m96943a = LR3.m96943a("browserSwitch.request", context);
        if (m96943a != null) {
            try {
                return Y20.m75819a(m96943a);
            } catch (JSONException e) {
                Log.d("BrowserSwitch", e.getMessage());
                Log.d("BrowserSwitch", Arrays.toString(e.getStackTrace()));
            }
        }
        return null;
    }

    /* renamed from: d */
    public void m77528d(Y20 y20, Context context) {
        try {
            LR3.m96942b("browserSwitch.request", y20.m75812h(), context);
        } catch (JSONException e) {
            Log.d("BrowserSwitch", e.getMessage());
            Log.d("BrowserSwitch", Arrays.toString(e.getStackTrace()));
        }
    }
}
