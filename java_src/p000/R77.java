package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboo;
import p000.WO1;
/* renamed from: R77 */
/* loaded from: classes5.dex */
public abstract class R77 extends BinderC44559lY6 implements S77 {
    public R77() {
        super("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
    }

    public static S77 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        if (queryLocalInterface instanceof S77) {
            return (S77) queryLocalInterface;
        }
        return new Q77(iBinder);
    }

    @Override // p000.BinderC44559lY6
    /* renamed from: c5 */
    public final boolean mo27162c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            C47533qZ6.m17447b(parcel);
            P77 newTextRecognizerWithOptions = newTextRecognizerWithOptions(WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder()), (zboo) C47533qZ6.m17448a(parcel, zboo.CREATOR));
            parcel2.writeNoException();
            C47533qZ6.m17446c(parcel2, newTextRecognizerWithOptions);
        } else {
            WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder());
            C47533qZ6.m17447b(parcel);
            P77 newTextRecognizer = newTextRecognizer(m78501c5);
            parcel2.writeNoException();
            C47533qZ6.m17446c(parcel2, newTextRecognizer);
        }
        return true;
    }
}
