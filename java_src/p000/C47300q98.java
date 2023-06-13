package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.List;
/* renamed from: q98  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47300q98 extends C46815pL7 implements V98 {
    public C47300q98(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p000.V98
    /* renamed from: C0 */
    public final void mo18054C0(zzq zzqVar) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81613d(m19441c5, zzqVar);
        m19439e5(6, m19441c5);
    }

    @Override // p000.V98
    /* renamed from: E0 */
    public final void mo18053E0(Bundle bundle, zzq zzqVar) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81613d(m19441c5, bundle);
        UL7.m81613d(m19441c5, zzqVar);
        m19439e5(19, m19441c5);
    }

    @Override // p000.V98
    /* renamed from: J2 */
    public final void mo18052J2(zzaw zzawVar, zzq zzqVar) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81613d(m19441c5, zzawVar);
        UL7.m81613d(m19441c5, zzqVar);
        m19439e5(1, m19441c5);
    }

    @Override // p000.V98
    /* renamed from: O2 */
    public final void mo18051O2(long j, String str, String str2, String str3) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeLong(j);
        m19441c5.writeString(str);
        m19441c5.writeString(str2);
        m19441c5.writeString(str3);
        m19439e5(10, m19441c5);
    }

    @Override // p000.V98
    /* renamed from: Q0 */
    public final List mo18050Q0(String str, String str2, String str3) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(null);
        m19441c5.writeString(str2);
        m19441c5.writeString(str3);
        Parcel m19440d5 = m19440d5(17, m19441c5);
        ArrayList createTypedArrayList = m19440d5.createTypedArrayList(zzac.CREATOR);
        m19440d5.recycle();
        return createTypedArrayList;
    }

    @Override // p000.V98
    /* renamed from: Q3 */
    public final List mo18049Q3(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(null);
        m19441c5.writeString(str2);
        m19441c5.writeString(str3);
        ClassLoader classLoader = UL7.f37280a;
        m19441c5.writeInt(z ? 1 : 0);
        Parcel m19440d5 = m19440d5(15, m19441c5);
        ArrayList createTypedArrayList = m19440d5.createTypedArrayList(zzlj.CREATOR);
        m19440d5.recycle();
        return createTypedArrayList;
    }

    @Override // p000.V98
    /* renamed from: R4 */
    public final void mo18048R4(zzac zzacVar, zzq zzqVar) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81613d(m19441c5, zzacVar);
        UL7.m81613d(m19441c5, zzqVar);
        m19439e5(12, m19441c5);
    }

    @Override // p000.V98
    /* renamed from: X3 */
    public final byte[] mo18047X3(zzaw zzawVar, String str) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81613d(m19441c5, zzawVar);
        m19441c5.writeString(str);
        Parcel m19440d5 = m19440d5(9, m19441c5);
        byte[] createByteArray = m19440d5.createByteArray();
        m19440d5.recycle();
        return createByteArray;
    }

    @Override // p000.V98
    /* renamed from: a0 */
    public final void mo18046a0(zzq zzqVar) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81613d(m19441c5, zzqVar);
        m19439e5(4, m19441c5);
    }

    @Override // p000.V98
    /* renamed from: d3 */
    public final List mo18045d3(String str, String str2, boolean z, zzq zzqVar) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(str);
        m19441c5.writeString(str2);
        ClassLoader classLoader = UL7.f37280a;
        m19441c5.writeInt(z ? 1 : 0);
        UL7.m81613d(m19441c5, zzqVar);
        Parcel m19440d5 = m19440d5(14, m19441c5);
        ArrayList createTypedArrayList = m19440d5.createTypedArrayList(zzlj.CREATOR);
        m19440d5.recycle();
        return createTypedArrayList;
    }

    @Override // p000.V98
    /* renamed from: d4 */
    public final String mo18044d4(zzq zzqVar) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81613d(m19441c5, zzqVar);
        Parcel m19440d5 = m19440d5(11, m19441c5);
        String readString = m19440d5.readString();
        m19440d5.recycle();
        return readString;
    }

    @Override // p000.V98
    /* renamed from: k0 */
    public final void mo18043k0(zzq zzqVar) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81613d(m19441c5, zzqVar);
        m19439e5(20, m19441c5);
    }

    @Override // p000.V98
    /* renamed from: q0 */
    public final void mo18042q0(zzq zzqVar) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81613d(m19441c5, zzqVar);
        m19439e5(18, m19441c5);
    }

    @Override // p000.V98
    /* renamed from: t4 */
    public final List mo18041t4(String str, String str2, zzq zzqVar) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(str);
        m19441c5.writeString(str2);
        UL7.m81613d(m19441c5, zzqVar);
        Parcel m19440d5 = m19440d5(16, m19441c5);
        ArrayList createTypedArrayList = m19440d5.createTypedArrayList(zzac.CREATOR);
        m19440d5.recycle();
        return createTypedArrayList;
    }

    @Override // p000.V98
    /* renamed from: z */
    public final void mo18040z(zzlj zzljVar, zzq zzqVar) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81613d(m19441c5, zzljVar);
        UL7.m81613d(m19441c5, zzqVar);
        m19439e5(2, m19441c5);
    }
}
