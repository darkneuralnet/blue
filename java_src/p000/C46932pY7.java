package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: pY7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46932pY7 extends C37038Xe7 implements InterfaceC33061Ge8 {
    public C46932pY7(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    @Override // p000.InterfaceC33061Ge8
    /* renamed from: e1 */
    public final void mo19122e1(Bundle bundle, InterfaceC50105ut8 interfaceC50105ut8) throws RemoteException {
        Parcel m76736c5 = m76736c5();
        C42116hQ7.m36430c(m76736c5, bundle);
        C42116hQ7.m36429d(m76736c5, interfaceC50105ut8);
        m76735d5(2, m76736c5);
    }
}
