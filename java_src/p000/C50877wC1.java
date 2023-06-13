package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
/* renamed from: wC1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C50877wC1 implements InterfaceC40298eM4<C49692uC1> {
    @Override // p000.InterfaceC40298eM4
    /* renamed from: a */
    public EnumC41024fb1 mo7266a(C48964sy3 c48964sy3) {
        return EnumC41024fb1.SOURCE;
    }

    @Override // p000.InterfaceC45175mb1
    /* renamed from: c */
    public boolean mo7265b(VL4<C49692uC1> vl4, File file, C48964sy3 c48964sy3) {
        try {
            E70.m109377f(vl4.get().m10659c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
