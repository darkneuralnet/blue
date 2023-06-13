package p000;

import android.os.RemoteException;
import com.google.android.gms.common.util.PlatformVersion;
/* renamed from: u68  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49641u68 {
    /* renamed from: a */
    public static RemoteException m10853a(String str) {
        if (PlatformVersion.isAtLeastIceCreamSandwichMR1()) {
            return new RemoteException(str);
        }
        return new RemoteException();
    }
}
