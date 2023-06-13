package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
/* renamed from: pl7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47060pl7 extends C47583qe7 implements InterfaceC41743gn7 {
    public C47060pl7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // p000.InterfaceC41743gn7
    /* renamed from: U */
    public final C50014uk7 mo18787U(WO1 wo1, zzad zzadVar) throws RemoteException {
        C50014uk7 c50014uk7;
        Parcel m17273c5 = m17273c5();
        C52779zP7.m1389b(m17273c5, wo1);
        C52779zP7.m1390a(m17273c5, zzadVar);
        Parcel m17272d5 = m17272d5(1, m17273c5);
        IBinder readStrongBinder = m17272d5.readStrongBinder();
        if (readStrongBinder == null) {
            c50014uk7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (queryLocalInterface instanceof C50014uk7) {
                c50014uk7 = (C50014uk7) queryLocalInterface;
            } else {
                c50014uk7 = new C50014uk7(readStrongBinder);
            }
        }
        m17272d5.recycle();
        return c50014uk7;
    }
}
