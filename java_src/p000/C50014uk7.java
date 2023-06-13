package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
/* renamed from: uk7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50014uk7 extends C47583qe7 {
    public C50014uk7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    /* renamed from: f5 */
    public final zzq[] m9803f5(WO1 wo1, zzaj zzajVar) throws RemoteException {
        Parcel m17273c5 = m17273c5();
        C52779zP7.m1389b(m17273c5, wo1);
        C52779zP7.m1390a(m17273c5, zzajVar);
        Parcel m17272d5 = m17272d5(1, m17273c5);
        zzq[] zzqVarArr = (zzq[]) m17272d5.createTypedArray(zzq.CREATOR);
        m17272d5.recycle();
        return zzqVarArr;
    }

    /* renamed from: g5 */
    public final zzq[] m9802g5(WO1 wo1, zzaj zzajVar) throws RemoteException {
        Parcel m17273c5 = m17273c5();
        C52779zP7.m1389b(m17273c5, wo1);
        C52779zP7.m1390a(m17273c5, zzajVar);
        Parcel m17272d5 = m17272d5(2, m17273c5);
        zzq[] zzqVarArr = (zzq[]) m17272d5.createTypedArray(zzq.CREATOR);
        m17272d5.recycle();
        return zzqVarArr;
    }

    public final void zzd() throws RemoteException {
        m17271e5(3, m17273c5());
    }
}
