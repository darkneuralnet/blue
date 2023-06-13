package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: WO1 */
/* loaded from: classes5.dex */
public interface WO1 extends IInterface {

    /* renamed from: WO1$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractBinderC9015a extends HB7 implements WO1 {
        public AbstractBinderC9015a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: c5 */
        public static WO1 m78501c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof WO1) {
                return (WO1) queryLocalInterface;
            }
            return new C49698uC7(iBinder);
        }
    }
}
