package p000;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboo;
/* renamed from: S77 */
/* loaded from: classes5.dex */
public interface S77 extends IInterface {
    P77 newTextRecognizer(WO1 wo1) throws RemoteException;

    P77 newTextRecognizerWithOptions(WO1 wo1, zboo zbooVar) throws RemoteException;
}
