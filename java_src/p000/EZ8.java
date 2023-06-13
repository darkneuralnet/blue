package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: EZ8 */
/* loaded from: classes5.dex */
public abstract class EZ8 extends FB7 implements OT8 {
    public EZ8() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override // p000.FB7
    /* renamed from: c5 */
    public final boolean mo107443c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo92236m0((Status) C52788zQ7.m1385a(parcel, Status.CREATOR));
                return true;
            case 2:
                zzb((Status) C52788zQ7.m1385a(parcel, Status.CREATOR));
                return true;
            case 3:
                mo92240f2((Status) C52788zQ7.m1385a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 4:
                mo92235w0((Status) C52788zQ7.m1385a(parcel, Status.CREATOR));
                return true;
            case 5:
                mo92241E3((Status) C52788zQ7.m1385a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 6:
                mo92238j1((Status) C52788zQ7.m1385a(parcel, Status.CREATOR), (zze[]) parcel.createTypedArray(zze.CREATOR));
                return true;
            case 7:
                mo92237l2((DataHolder) C52788zQ7.m1385a(parcel, DataHolder.CREATOR));
                return true;
            case 8:
                mo92239i0((Status) C52788zQ7.m1385a(parcel, Status.CREATOR), (zzc) C52788zQ7.m1385a(parcel, zzc.CREATOR));
                return true;
            case 9:
                mo92234y0((Status) C52788zQ7.m1385a(parcel, Status.CREATOR), (zzc) C52788zQ7.m1385a(parcel, zzc.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
