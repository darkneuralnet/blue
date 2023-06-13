package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode.zzso;
/* renamed from: rq9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48298rq9 extends C47583qe7 implements InterfaceC51854xq9 {
    public C48298rq9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // p000.InterfaceC51854xq9
    /* renamed from: V2 */
    public final C46519oq9 mo4562V2(WO1 wo1, zzso zzsoVar) throws RemoteException {
        C46519oq9 c46519oq9;
        Parcel m17273c5 = m17273c5();
        C52779zP7.m1389b(m17273c5, wo1);
        C52779zP7.m1390a(m17273c5, zzsoVar);
        Parcel m17272d5 = m17272d5(1, m17273c5);
        IBinder readStrongBinder = m17272d5.readStrongBinder();
        if (readStrongBinder == null) {
            c46519oq9 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            if (queryLocalInterface instanceof C46519oq9) {
                c46519oq9 = (C46519oq9) queryLocalInterface;
            } else {
                c46519oq9 = new C46519oq9(readStrongBinder);
            }
        }
        m17272d5.recycle();
        return c46519oq9;
    }
}
