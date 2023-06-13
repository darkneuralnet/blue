package p000;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C17216a;
import p000.C50903wF0;
/* renamed from: qF0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C47347qF0 {

    /* renamed from: a */
    public Uri f104993a;

    public C47347qF0(String str, Bundle bundle) {
        this.f104993a = m17737a(str, bundle == null ? new Bundle() : bundle);
    }

    /* renamed from: a */
    public static Uri m17737a(String str, Bundle bundle) {
        if (TD0.m84203d(C47347qF0.class)) {
            return null;
        }
        try {
            String m163b = C53066zt5.m163b();
            return C52364yi6.m2845d(m163b, C17216a.m52729q() + "/dialog/" + str, bundle);
        } catch (Throwable th) {
            TD0.m84205b(th, C47347qF0.class);
            return null;
        }
    }

    /* renamed from: b */
    public boolean m17736b(Activity activity, String str) {
        if (TD0.m84203d(this)) {
            return false;
        }
        try {
            C50903wF0 m7163a = new C50903wF0.C29819b(C48532sF0.m14498a()).m7163a();
            m7163a.f115676a.setPackage(str);
            try {
                m7163a.m7165a(activity, this.f104993a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return false;
        }
    }
}
