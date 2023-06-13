package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* renamed from: YO6 */
/* loaded from: classes6.dex */
public final class YO6 extends C42690iO6 implements InterfaceC40327eP6 {
    public YO6(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // p000.InterfaceC40327eP6
    /* renamed from: F0 */
    public final void mo42901F0(String str, List<Bundle> list, Bundle bundle, InterfaceC42699iP6 interfaceC42699iP6) throws RemoteException {
        Parcel m34028c5 = m34028c5();
        m34028c5.writeString(str);
        m34028c5.writeTypedList(list);
        C48027rO6.m16002b(m34028c5, bundle);
        C48027rO6.m16001c(m34028c5, interfaceC42699iP6);
        m34027d5(14, m34028c5);
    }

    @Override // p000.InterfaceC40327eP6
    /* renamed from: I2 */
    public final void mo42900I2(String str, Bundle bundle, Bundle bundle2, InterfaceC42699iP6 interfaceC42699iP6) throws RemoteException {
        Parcel m34028c5 = m34028c5();
        m34028c5.writeString(str);
        C48027rO6.m16002b(m34028c5, bundle);
        C48027rO6.m16002b(m34028c5, bundle2);
        C48027rO6.m16001c(m34028c5, interfaceC42699iP6);
        m34027d5(7, m34028c5);
    }

    @Override // p000.InterfaceC40327eP6
    /* renamed from: e2 */
    public final void mo42899e2(String str, Bundle bundle, Bundle bundle2, InterfaceC42699iP6 interfaceC42699iP6) throws RemoteException {
        Parcel m34028c5 = m34028c5();
        m34028c5.writeString(str);
        C48027rO6.m16002b(m34028c5, bundle);
        C48027rO6.m16002b(m34028c5, bundle2);
        C48027rO6.m16001c(m34028c5, interfaceC42699iP6);
        m34027d5(9, m34028c5);
    }

    @Override // p000.InterfaceC40327eP6
    /* renamed from: l1 */
    public final void mo42898l1(String str, Bundle bundle, InterfaceC42699iP6 interfaceC42699iP6) throws RemoteException {
        Parcel m34028c5 = m34028c5();
        m34028c5.writeString(str);
        C48027rO6.m16002b(m34028c5, bundle);
        C48027rO6.m16001c(m34028c5, interfaceC42699iP6);
        m34027d5(5, m34028c5);
    }

    @Override // p000.InterfaceC40327eP6
    /* renamed from: l3 */
    public final void mo42897l3(String str, Bundle bundle, Bundle bundle2, InterfaceC42699iP6 interfaceC42699iP6) throws RemoteException {
        Parcel m34028c5 = m34028c5();
        m34028c5.writeString(str);
        C48027rO6.m16002b(m34028c5, bundle);
        C48027rO6.m16002b(m34028c5, bundle2);
        C48027rO6.m16001c(m34028c5, interfaceC42699iP6);
        m34027d5(11, m34028c5);
    }

    @Override // p000.InterfaceC40327eP6
    /* renamed from: t */
    public final void mo42896t(String str, Bundle bundle, InterfaceC42699iP6 interfaceC42699iP6) throws RemoteException {
        Parcel m34028c5 = m34028c5();
        m34028c5.writeString(str);
        C48027rO6.m16002b(m34028c5, bundle);
        C48027rO6.m16001c(m34028c5, interfaceC42699iP6);
        m34027d5(10, m34028c5);
    }

    @Override // p000.InterfaceC40327eP6
    /* renamed from: z2 */
    public final void mo42895z2(String str, Bundle bundle, Bundle bundle2, InterfaceC42699iP6 interfaceC42699iP6) throws RemoteException {
        Parcel m34028c5 = m34028c5();
        m34028c5.writeString(str);
        C48027rO6.m16002b(m34028c5, bundle);
        C48027rO6.m16002b(m34028c5, bundle2);
        C48027rO6.m16001c(m34028c5, interfaceC42699iP6);
        m34027d5(6, m34028c5);
    }
}
