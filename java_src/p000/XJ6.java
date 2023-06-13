package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: XJ6 */
/* loaded from: classes6.dex */
public final class XJ6 extends C42690iO6 implements InterfaceC37893aK6 {
    public XJ6(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // p000.InterfaceC37893aK6
    /* renamed from: M0 */
    public final void mo71656M0(String str, Bundle bundle, InterfaceC40282eK6 interfaceC40282eK6) throws RemoteException {
        Parcel m34028c5 = m34028c5();
        m34028c5.writeString(str);
        C48027rO6.m16002b(m34028c5, bundle);
        C48027rO6.m16001c(m34028c5, interfaceC40282eK6);
        m34027d5(2, m34028c5);
    }
}
