package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
/* renamed from: kA8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43752kA8 extends C52325ye7 implements InterfaceC48612sN8 {
    public C43752kA8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
    }

    @Override // p000.InterfaceC48612sN8
    /* renamed from: w1 */
    public final C41804gt8 mo14249w1(WO1 wo1, zzp zzpVar) throws RemoteException {
        C41804gt8 c41804gt8;
        Parcel m3041c5 = m3041c5();
        HP7.m103903b(m3041c5, wo1);
        HP7.m103904a(m3041c5, zzpVar);
        Parcel m3040d5 = m3040d5(1, m3041c5);
        IBinder readStrongBinder = m3040d5.readStrongBinder();
        if (readStrongBinder == null) {
            c41804gt8 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            if (queryLocalInterface instanceof C41804gt8) {
                c41804gt8 = (C41804gt8) queryLocalInterface;
            } else {
                c41804gt8 = new C41804gt8(readStrongBinder);
            }
        }
        m3040d5.recycle();
        return c41804gt8;
    }
}
