package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsg;
/* renamed from: jo9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43534jo9 extends C52325ye7 {
    public C43534jo9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    /* renamed from: f5 */
    public final zzsg m29886f5(WO1 wo1, zzrr zzrrVar) throws RemoteException {
        zzsg createFromParcel;
        Parcel m3041c5 = m3041c5();
        HP7.m103903b(m3041c5, wo1);
        HP7.m103904a(m3041c5, zzrrVar);
        Parcel m3040d5 = m3040d5(3, m3041c5);
        Parcelable.Creator<zzsg> creator = zzsg.CREATOR;
        if (m3040d5.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(m3040d5);
        }
        zzsg zzsgVar = createFromParcel;
        m3040d5.recycle();
        return zzsgVar;
    }

    /* renamed from: g5 */
    public final void m29885g5() throws RemoteException {
        m3039e5(2, m3041c5());
    }

    public final void zze() throws RemoteException {
        m3039e5(1, m3041c5());
    }
}
