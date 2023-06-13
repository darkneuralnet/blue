package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
/* renamed from: w89  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50847w89 extends C49954ue7 implements M89 {
    public C50847w89(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
    }

    @Override // p000.M89
    /* renamed from: U0 */
    public final C46105o89 mo7355U0(WO1 wo1, zznr zznrVar) throws RemoteException {
        C46105o89 c46105o89;
        Parcel m9920c5 = m9920c5();
        CP7.m112245b(m9920c5, wo1);
        CP7.m112246a(m9920c5, zznrVar);
        Parcel m9919d5 = m9919d5(1, m9920c5);
        IBinder readStrongBinder = m9919d5.readStrongBinder();
        if (readStrongBinder == null) {
            c46105o89 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
            if (queryLocalInterface instanceof C46105o89) {
                c46105o89 = (C46105o89) queryLocalInterface;
            } else {
                c46105o89 = new C46105o89(readStrongBinder);
            }
        }
        m9919d5.recycle();
        return c46105o89;
    }
}
