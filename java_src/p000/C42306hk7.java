package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.recaptcha.zzag;
import com.google.android.gms.internal.recaptcha.zzv;
/* renamed from: hk7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42306hk7 extends C31890Be7 {
    public C42306hk7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.recaptcha.internal.IRecaptchaService");
    }

    /* renamed from: e5 */
    public final void m35902e5(InterfaceC52948zh7 interfaceC52948zh7, zzv zzvVar) throws RemoteException {
        Parcel m113738c5 = m113738c5();
        KP7.m98910c(m113738c5, interfaceC52948zh7);
        KP7.m98911b(m113738c5, zzvVar);
        m113737d5(6, m113738c5);
    }

    /* renamed from: f5 */
    public final void m35901f5(InterfaceC45854nj7 interfaceC45854nj7, zzag zzagVar) throws RemoteException {
        Parcel m113738c5 = m113738c5();
        KP7.m98910c(m113738c5, interfaceC45854nj7);
        KP7.m98911b(m113738c5, zzagVar);
        m113737d5(5, m113738c5);
    }
}
