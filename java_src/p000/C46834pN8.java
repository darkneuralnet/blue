package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
/* renamed from: pN8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46834pN8 extends C49954ue7 implements InterfaceC41012fZ8 {
    public C46834pN8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    @Override // p000.InterfaceC41012fZ8
    /* renamed from: J4 */
    public final LG8 mo19360J4(WO1 wo1, zzh zzhVar) throws RemoteException {
        LG8 lg8;
        Parcel m9920c5 = m9920c5();
        CP7.m112245b(m9920c5, wo1);
        CP7.m112246a(m9920c5, zzhVar);
        Parcel m9919d5 = m9919d5(1, m9920c5);
        IBinder readStrongBinder = m9919d5.readStrongBinder();
        if (readStrongBinder == null) {
            lg8 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            if (queryLocalInterface instanceof LG8) {
                lg8 = (LG8) queryLocalInterface;
            } else {
                lg8 = new LG8(readStrongBinder);
            }
        }
        m9919d5.recycle();
        return lg8;
    }
}
