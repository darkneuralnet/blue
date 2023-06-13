package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
/* renamed from: Gt8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33196Gt8 extends C42246he7 {
    public C33196Gt8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    /* renamed from: e5 */
    public final void m104607e5(N68 n68) throws RemoteException {
        Parcel m36116c5 = m36116c5();
        C52195yQ7.m3509b(m36116c5, n68);
        m36115d5(4, m36116c5);
    }

    /* renamed from: f5 */
    public final void m104606f5(String str, InterfaceC33367Hm8 interfaceC33367Hm8) throws RemoteException {
        Parcel m36116c5 = m36116c5();
        m36116c5.writeString(str);
        C52195yQ7.m3509b(m36116c5, interfaceC33367Hm8);
        m36115d5(5, m36116c5);
    }

    /* renamed from: g5 */
    public final void m104605g5(IStatusCallback iStatusCallback) throws RemoteException {
        Parcel m36116c5 = m36116c5();
        C52195yQ7.m3509b(m36116c5, iStatusCallback);
        m36115d5(3, m36116c5);
    }

    /* renamed from: h5 */
    public final void m104604h5(IStatusCallback iStatusCallback) throws RemoteException {
        Parcel m36116c5 = m36116c5();
        C52195yQ7.m3509b(m36116c5, iStatusCallback);
        m36115d5(6, m36116c5);
    }

    /* renamed from: i5 */
    public final void m104603i5(InterfaceC44408lH8 interfaceC44408lH8) throws RemoteException {
        Parcel m36116c5 = m36116c5();
        C52195yQ7.m3509b(m36116c5, interfaceC44408lH8);
        m36115d5(1, m36116c5);
    }

    /* renamed from: j5 */
    public final void m104602j5(String str, InterfaceC44408lH8 interfaceC44408lH8) throws RemoteException {
        Parcel m36116c5 = m36116c5();
        m36116c5.writeString(str);
        C52195yQ7.m3509b(m36116c5, interfaceC44408lH8);
        m36115d5(2, m36116c5);
    }
}
