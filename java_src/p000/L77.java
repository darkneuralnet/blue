package p000;

import android.os.RemoteException;
/* renamed from: L77 */
/* loaded from: classes6.dex */
public abstract class L77 {
    /* renamed from: c */
    public static L77 m97682c(int i, RemoteException remoteException) {
        return new C46338oY6(i, I57.m102959e(remoteException));
    }

    /* renamed from: d */
    public static L77 m97681d() {
        return new C46338oY6(0, I57.m102960d());
    }

    /* renamed from: a */
    public abstract int mo20902a();

    /* renamed from: b */
    public abstract I57 mo20901b();

    /* renamed from: e */
    public final boolean m97680e() {
        return !mo20901b().mo4151c();
    }
}
