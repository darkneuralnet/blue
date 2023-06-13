package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
/* renamed from: gt8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41804gt8 extends C52325ye7 {
    public C41804gt8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    /* renamed from: f5 */
    public final zzl[] m37359f5(WO1 wo1, zzd zzdVar) throws RemoteException {
        Parcel m3041c5 = m3041c5();
        HP7.m103903b(m3041c5, wo1);
        HP7.m103904a(m3041c5, zzdVar);
        Parcel m3040d5 = m3040d5(1, m3041c5);
        zzl[] zzlVarArr = (zzl[]) m3040d5.createTypedArray(zzl.CREATOR);
        m3040d5.recycle();
        return zzlVarArr;
    }

    public final void zzd() throws RemoteException {
        m3039e5(2, m3041c5());
    }
}
