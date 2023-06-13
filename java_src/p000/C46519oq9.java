package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsm;
import com.google.android.gms.internal.mlkit_vision_barcode.zztf;
import java.util.ArrayList;
import java.util.List;
/* renamed from: oq9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46519oq9 extends C47583qe7 {
    public C46519oq9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    /* renamed from: f5 */
    public final List m20461f5(WO1 wo1, zztf zztfVar) throws RemoteException {
        Parcel m17273c5 = m17273c5();
        C52779zP7.m1389b(m17273c5, wo1);
        C52779zP7.m1390a(m17273c5, zztfVar);
        Parcel m17272d5 = m17272d5(3, m17273c5);
        ArrayList createTypedArrayList = m17272d5.createTypedArrayList(zzsm.CREATOR);
        m17272d5.recycle();
        return createTypedArrayList;
    }

    /* renamed from: g5 */
    public final void m20460g5() throws RemoteException {
        m17271e5(2, m17273c5());
    }

    public final void zze() throws RemoteException {
        m17271e5(1, m17273c5());
    }
}
