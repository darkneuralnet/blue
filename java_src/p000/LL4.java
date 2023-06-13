package p000;

import android.util.Size;
import androidx.camera.core.impl.InterfaceC11206k;
import androidx.camera.core.impl.InterfaceC11225s;
import java.util.List;
import java.util.Set;
/* renamed from: LL4 */
/* loaded from: classes.dex */
public class LL4 {
    private LL4() {
    }

    /* renamed from: a */
    public static List<Size> m97040a(List<Size> list, Size size, Set<InterfaceC11225s<?>> set) {
        for (InterfaceC11225s<?> interfaceC11225s : set) {
            List<Size> list2 = (List) interfaceC11225s.mo69360d(InterfaceC11206k.f52635u, null);
            if (list2 != null) {
                return list2;
            }
        }
        return list;
    }
}
