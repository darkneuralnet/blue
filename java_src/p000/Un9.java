package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsi;
/* renamed from: Un9 */
/* loaded from: classes5.dex */
public final class Un9 extends C52325ye7 implements InterfaceC40569eo9 {
    public Un9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
    }

    @Override // p000.InterfaceC40569eo9
    /* renamed from: t3 */
    public final C43534jo9 mo42535t3(WO1 wo1, WO1 wo12, zzsi zzsiVar) throws RemoteException {
        Parcel m3041c5 = m3041c5();
        HP7.m103903b(m3041c5, wo1);
        C43534jo9 c43534jo9 = null;
        HP7.m103903b(m3041c5, null);
        HP7.m103904a(m3041c5, zzsiVar);
        Parcel m3040d5 = m3040d5(1, m3041c5);
        IBinder readStrongBinder = m3040d5.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            if (queryLocalInterface instanceof C43534jo9) {
                c43534jo9 = (C43534jo9) queryLocalInterface;
            } else {
                c43534jo9 = new C43534jo9(readStrongBinder);
            }
        }
        m3040d5.recycle();
        return c43534jo9;
    }
}
