package p000;

import android.util.Size;
import androidx.camera.core.impl.InterfaceC11206k;
import androidx.camera.core.impl.InterfaceC11225s;
/* renamed from: Wf6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36812Wf6 {
    private C36812Wf6() {
    }

    /* renamed from: a */
    public static void m78023a(InterfaceC11225s.InterfaceC11226a<?, ?, ?> interfaceC11226a, int i) {
        Size m69376u;
        InterfaceC11206k interfaceC11206k = (InterfaceC11206k) interfaceC11226a.mo1341d();
        int m69378s = interfaceC11206k.m69378s(-1);
        if (m69378s == -1 || m69378s != i) {
            ((InterfaceC11206k.InterfaceC11207a) interfaceC11226a).mo69158a(i);
        }
        if (m69378s != -1 && i != -1 && m69378s != i) {
            if (Math.abs(C38051ac0.m71099b(i) - C38051ac0.m71099b(m69378s)) % 180 == 90 && (m69376u = interfaceC11206k.m69376u(null)) != null) {
                ((InterfaceC11206k.InterfaceC11207a) interfaceC11226a).mo69157c(new Size(m69376u.getHeight(), m69376u.getWidth()));
            }
        }
    }
}
