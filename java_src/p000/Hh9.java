package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p000.WO1;
/* renamed from: Hh9 */
/* loaded from: classes5.dex */
public final class Hh9 extends C44025ke7 {
    public Hh9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: c5 */
    public final int m103526c5() throws RemoteException {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    /* renamed from: d5 */
    public final int m103525d5(WO1 wo1, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        C49815uP7.m10345f(zza, wo1);
        zza.writeString(str);
        C49815uP7.m10348c(zza, z);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    /* renamed from: e5 */
    public final int m103524e5(WO1 wo1, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        C49815uP7.m10345f(zza, wo1);
        zza.writeString(str);
        C49815uP7.m10348c(zza, z);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    /* renamed from: f5 */
    public final WO1 m103523f5(WO1 wo1, String str, int i) throws RemoteException {
        Parcel zza = zza();
        C49815uP7.m10345f(zza, wo1);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zzB = zzB(2, zza);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(zzB.readStrongBinder());
        zzB.recycle();
        return m78501c5;
    }

    /* renamed from: g5 */
    public final WO1 m103522g5(WO1 wo1, String str, int i, WO1 wo12) throws RemoteException {
        Parcel zza = zza();
        C49815uP7.m10345f(zza, wo1);
        zza.writeString(str);
        zza.writeInt(i);
        C49815uP7.m10345f(zza, wo12);
        Parcel zzB = zzB(8, zza);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(zzB.readStrongBinder());
        zzB.recycle();
        return m78501c5;
    }

    /* renamed from: h5 */
    public final WO1 m103521h5(WO1 wo1, String str, int i) throws RemoteException {
        Parcel zza = zza();
        C49815uP7.m10345f(zza, wo1);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zzB = zzB(4, zza);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(zzB.readStrongBinder());
        zzB.recycle();
        return m78501c5;
    }

    /* renamed from: i5 */
    public final WO1 m103520i5(WO1 wo1, String str, boolean z, long j) throws RemoteException {
        Parcel zza = zza();
        C49815uP7.m10345f(zza, wo1);
        zza.writeString(str);
        C49815uP7.m10348c(zza, z);
        zza.writeLong(j);
        Parcel zzB = zzB(7, zza);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(zzB.readStrongBinder());
        zzB.recycle();
        return m78501c5;
    }
}
