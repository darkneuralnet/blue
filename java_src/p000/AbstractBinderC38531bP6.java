package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: bP6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC38531bP6 extends BinderC44469lO6 implements InterfaceC40327eP6 {
    /* renamed from: d5 */
    public static InterfaceC40327eP6 m64557d5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof InterfaceC40327eP6 ? (InterfaceC40327eP6) queryLocalInterface : new YO6(iBinder);
    }
}
