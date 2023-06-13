package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_face.zznn;
import com.google.android.gms.internal.mlkit_vision_face.zznt;
import java.util.ArrayList;
import java.util.List;
/* renamed from: o89  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46105o89 extends C49954ue7 {
    public C46105o89(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector");
    }

    /* renamed from: f5 */
    public final List m21724f5(WO1 wo1, zznn zznnVar) throws RemoteException {
        Parcel m9920c5 = m9920c5();
        CP7.m112245b(m9920c5, wo1);
        CP7.m112246a(m9920c5, zznnVar);
        Parcel m9919d5 = m9919d5(3, m9920c5);
        ArrayList createTypedArrayList = m9919d5.createTypedArrayList(zznt.CREATOR);
        m9919d5.recycle();
        return createTypedArrayList;
    }

    /* renamed from: g5 */
    public final void m21723g5() throws RemoteException {
        m9918e5(2, m9920c5());
    }

    public final void zze() throws RemoteException {
        m9918e5(1, m9920c5());
    }
}
