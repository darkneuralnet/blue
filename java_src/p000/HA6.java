package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
/* renamed from: HA6 */
/* loaded from: classes5.dex */
public class HA6 implements InterfaceC40298eM4<GA6> {
    @Override // p000.InterfaceC40298eM4
    /* renamed from: a */
    public EnumC41024fb1 mo7266a(C48964sy3 c48964sy3) {
        return EnumC41024fb1.SOURCE;
    }

    @Override // p000.InterfaceC45175mb1
    /* renamed from: c */
    public boolean mo7265b(VL4<GA6> vl4, File file, C48964sy3 c48964sy3) {
        try {
            E70.m109377f(vl4.get().m105667c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("WebpEncoder", 5)) {
                Log.w("WebpEncoder", "Failed to encode WebP drawable data", e);
            }
            return false;
        }
    }
}
