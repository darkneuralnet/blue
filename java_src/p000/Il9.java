package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p000.WO1;
/* renamed from: Il9 */
/* loaded from: classes5.dex */
public final class Il9 extends C44025ke7 {
    public Il9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: c5 */
    public final WO1 m101731c5(WO1 wo1, String str, int i, WO1 wo12) throws RemoteException {
        Parcel zza = zza();
        C49815uP7.m10345f(zza, wo1);
        zza.writeString(str);
        zza.writeInt(i);
        C49815uP7.m10345f(zza, wo12);
        Parcel zzB = zzB(2, zza);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(zzB.readStrongBinder());
        zzB.recycle();
        return m78501c5;
    }

    /* renamed from: d5 */
    public final WO1 m101730d5(WO1 wo1, String str, int i, WO1 wo12) throws RemoteException {
        Parcel zza = zza();
        C49815uP7.m10345f(zza, wo1);
        zza.writeString(str);
        zza.writeInt(i);
        C49815uP7.m10345f(zza, wo12);
        Parcel zzB = zzB(3, zza);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(zzB.readStrongBinder());
        zzB.recycle();
        return m78501c5;
    }
}
