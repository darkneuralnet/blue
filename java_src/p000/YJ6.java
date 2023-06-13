package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: YJ6 */
/* loaded from: classes6.dex */
public abstract class YJ6 extends BinderC44469lO6 implements InterfaceC37893aK6 {
    /* renamed from: d5 */
    public static InterfaceC37893aK6 m75255d5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof InterfaceC37893aK6 ? (InterfaceC37893aK6) queryLocalInterface : new XJ6(iBinder);
    }
}
