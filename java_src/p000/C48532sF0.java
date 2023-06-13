package p000;

import android.content.ComponentName;
import android.net.Uri;
/* renamed from: sF0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48532sF0 extends AbstractServiceConnectionC52089yF0 {

    /* renamed from: b */
    public static C50310vF0 f108511b;

    /* renamed from: c */
    public static C52682zF0 f108512c;

    /* renamed from: a */
    public static C52682zF0 m14498a() {
        C52682zF0 c52682zF0 = f108512c;
        f108512c = null;
        return c52682zF0;
    }

    /* renamed from: b */
    public static void m14497b(Uri uri) {
        if (f108512c == null) {
            m14496c();
        }
        C52682zF0 c52682zF0 = f108512c;
        if (c52682zF0 != null) {
            c52682zF0.m1595f(uri, null, null);
        }
    }

    /* renamed from: c */
    public static void m14496c() {
        C50310vF0 c50310vF0;
        if (f108512c == null && (c50310vF0 = f108511b) != null) {
            f108512c = c50310vF0.m8957d(null);
        }
    }

    @Override // p000.AbstractServiceConnectionC52089yF0
    public void onCustomTabsServiceConnected(ComponentName componentName, C50310vF0 c50310vF0) {
        f108511b = c50310vF0;
        c50310vF0.m8955f(0L);
        m14496c();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
