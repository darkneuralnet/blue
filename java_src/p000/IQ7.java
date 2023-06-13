package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcl;
/* renamed from: IQ7 */
/* loaded from: classes5.dex */
public final class IQ7 extends C46815pL7 implements InterfaceC45683nR7 {
    public IQ7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // p000.InterfaceC45683nR7
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(str);
        m19441c5.writeLong(j);
        m19439e5(23, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(str);
        m19441c5.writeString(str2);
        UL7.m81613d(m19441c5, bundle);
        m19439e5(9, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(str);
        m19441c5.writeLong(j);
        m19439e5(24, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void generateEventId(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, interfaceC42134hS7);
        m19439e5(22, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void getCachedAppInstanceId(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, interfaceC42134hS7);
        m19439e5(19, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void getConditionalUserProperties(String str, String str2, InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(str);
        m19441c5.writeString(str2);
        UL7.m81612e(m19441c5, interfaceC42134hS7);
        m19439e5(10, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void getCurrentScreenClass(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, interfaceC42134hS7);
        m19439e5(17, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void getCurrentScreenName(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, interfaceC42134hS7);
        m19439e5(16, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void getGmpAppId(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, interfaceC42134hS7);
        m19439e5(21, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void getMaxUserProperties(String str, InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(str);
        UL7.m81612e(m19441c5, interfaceC42134hS7);
        m19439e5(6, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void getUserProperties(String str, String str2, boolean z, InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(str);
        m19441c5.writeString(str2);
        ClassLoader classLoader = UL7.f37280a;
        m19441c5.writeInt(z ? 1 : 0);
        UL7.m81612e(m19441c5, interfaceC42134hS7);
        m19439e5(5, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void initialize(WO1 wo1, zzcl zzclVar, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, wo1);
        UL7.m81613d(m19441c5, zzclVar);
        m19441c5.writeLong(j);
        m19439e5(1, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(str);
        m19441c5.writeString(str2);
        UL7.m81613d(m19441c5, bundle);
        m19441c5.writeInt(z ? 1 : 0);
        m19441c5.writeInt(z2 ? 1 : 0);
        m19441c5.writeLong(j);
        m19439e5(2, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void logHealthData(int i, String str, WO1 wo1, WO1 wo12, WO1 wo13) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeInt(5);
        m19441c5.writeString(str);
        UL7.m81612e(m19441c5, wo1);
        UL7.m81612e(m19441c5, wo12);
        UL7.m81612e(m19441c5, wo13);
        m19439e5(33, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void onActivityCreated(WO1 wo1, Bundle bundle, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, wo1);
        UL7.m81613d(m19441c5, bundle);
        m19441c5.writeLong(j);
        m19439e5(27, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void onActivityDestroyed(WO1 wo1, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, wo1);
        m19441c5.writeLong(j);
        m19439e5(28, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void onActivityPaused(WO1 wo1, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, wo1);
        m19441c5.writeLong(j);
        m19439e5(29, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void onActivityResumed(WO1 wo1, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, wo1);
        m19441c5.writeLong(j);
        m19439e5(30, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void onActivitySaveInstanceState(WO1 wo1, InterfaceC42134hS7 interfaceC42134hS7, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, wo1);
        UL7.m81612e(m19441c5, interfaceC42134hS7);
        m19441c5.writeLong(j);
        m19439e5(31, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void onActivityStarted(WO1 wo1, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, wo1);
        m19441c5.writeLong(j);
        m19439e5(25, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void onActivityStopped(WO1 wo1, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, wo1);
        m19441c5.writeLong(j);
        m19439e5(26, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void registerOnMeasurementEventListener(InterfaceC38568bT7 interfaceC38568bT7) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, interfaceC38568bT7);
        m19439e5(35, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81613d(m19441c5, bundle);
        m19441c5.writeLong(j);
        m19439e5(8, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void setCurrentScreen(WO1 wo1, String str, String str2, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81612e(m19441c5, wo1);
        m19441c5.writeString(str);
        m19441c5.writeString(str2);
        m19441c5.writeLong(j);
        m19439e5(15, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        ClassLoader classLoader = UL7.f37280a;
        m19441c5.writeInt(z ? 1 : 0);
        m19439e5(39, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(str);
        m19441c5.writeLong(j);
        m19439e5(7, m19441c5);
    }

    @Override // p000.InterfaceC45683nR7
    public final void setUserProperty(String str, String str2, WO1 wo1, boolean z, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(str);
        m19441c5.writeString(str2);
        UL7.m81612e(m19441c5, wo1);
        m19441c5.writeInt(z ? 1 : 0);
        m19441c5.writeLong(j);
        m19439e5(4, m19441c5);
    }
}
