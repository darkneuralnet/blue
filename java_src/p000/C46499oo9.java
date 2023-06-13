package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsi;
/* renamed from: oo9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46499oo9 extends C52325ye7 implements InterfaceC51834xo9 {
    public C46499oo9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
    }

    @Override // p000.InterfaceC51834xo9
    /* renamed from: M3 */
    public final C43534jo9 mo4602M3(WO1 wo1) throws RemoteException {
        C43534jo9 c43534jo9;
        Parcel m3041c5 = m3041c5();
        HP7.m103903b(m3041c5, wo1);
        Parcel m3040d5 = m3040d5(1, m3041c5);
        IBinder readStrongBinder = m3040d5.readStrongBinder();
        if (readStrongBinder == null) {
            c43534jo9 = null;
        } else {
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

    @Override // p000.InterfaceC51834xo9
    /* renamed from: t0 */
    public final C43534jo9 mo4601t0(WO1 wo1, zzsi zzsiVar) throws RemoteException {
        C43534jo9 c43534jo9;
        Parcel m3041c5 = m3041c5();
        HP7.m103903b(m3041c5, wo1);
        HP7.m103904a(m3041c5, zzsiVar);
        Parcel m3040d5 = m3040d5(2, m3041c5);
        IBinder readStrongBinder = m3040d5.readStrongBinder();
        if (readStrongBinder == null) {
            c43534jo9 = null;
        } else {
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
