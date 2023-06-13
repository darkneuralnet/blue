package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: lP6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44478lP6 extends C42690iO6 implements BP6 {
    public C44478lP6(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // p000.BP6
    /* renamed from: B1 */
    public final void mo27321B1(Bundle bundle) throws RemoteException {
        Parcel m34028c5 = m34028c5();
        C48027rO6.m16002b(m34028c5, bundle);
        m34027d5(3, m34028c5);
    }

    @Override // p000.BP6
    /* renamed from: k1 */
    public final void mo27320k1(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel m34028c5 = m34028c5();
        C48027rO6.m16002b(m34028c5, bundle);
        C48027rO6.m16002b(m34028c5, bundle2);
        m34027d5(2, m34028c5);
    }

    @Override // p000.BP6
    /* renamed from: p1 */
    public final void mo27319p1(Bundle bundle) throws RemoteException {
        Parcel m34028c5 = m34028c5();
        C48027rO6.m16002b(m34028c5, bundle);
        m34027d5(4, m34028c5);
    }
}
