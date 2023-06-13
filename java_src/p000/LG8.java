package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
/* renamed from: LG8 */
/* loaded from: classes5.dex */
public final class LG8 extends C49954ue7 {
    public LG8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    /* renamed from: f5 */
    public final zzf[] m97425f5(WO1 wo1, zzp zzpVar) throws RemoteException {
        Parcel m9920c5 = m9920c5();
        CP7.m112245b(m9920c5, wo1);
        CP7.m112246a(m9920c5, zzpVar);
        Parcel m9919d5 = m9919d5(1, m9920c5);
        zzf[] zzfVarArr = (zzf[]) m9919d5.createTypedArray(zzf.CREATOR);
        m9919d5.recycle();
        return zzfVarArr;
    }

    /* renamed from: g5 */
    public final zzf[] m97424g5(WO1 wo1, WO1 wo12, WO1 wo13, int i, int i2, int i3, int i4, int i5, int i6, zzp zzpVar) throws RemoteException {
        Parcel m9920c5 = m9920c5();
        CP7.m112245b(m9920c5, wo1);
        CP7.m112245b(m9920c5, wo12);
        CP7.m112245b(m9920c5, wo13);
        m9920c5.writeInt(i);
        m9920c5.writeInt(i2);
        m9920c5.writeInt(i3);
        m9920c5.writeInt(i4);
        m9920c5.writeInt(i5);
        m9920c5.writeInt(i6);
        CP7.m112246a(m9920c5, zzpVar);
        Parcel m9919d5 = m9919d5(4, m9920c5);
        zzf[] zzfVarArr = (zzf[]) m9919d5.createTypedArray(zzf.CREATOR);
        m9919d5.recycle();
        return zzfVarArr;
    }

    public final void zzd() throws RemoteException {
        m9918e5(3, m9920c5());
    }
}
