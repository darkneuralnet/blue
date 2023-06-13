package p000;

import java.util.List;
import java.util.RandomAccess;
/* renamed from: zO7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52770zO7 {
    /* renamed from: a */
    public static List m1413a(List list, InterfaceC42388hs9 interfaceC42388hs9) {
        if (list instanceof RandomAccess) {
            return new GN7(list, interfaceC42388hs9);
        }
        return new C51584xO7(list, interfaceC42388hs9);
    }
}
