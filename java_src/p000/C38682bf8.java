package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* renamed from: bf8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38682bf8 extends TR8 {
    public C38682bf8(C42162hV8 c42162hV8) {
        super(c42162hV8);
    }

    @Override // p000.TR8
    /* renamed from: i */
    public final boolean mo11655i() {
        return false;
    }

    /* renamed from: j */
    public final boolean m64190j() {
        m83601f();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f100966a.mo22255z().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
