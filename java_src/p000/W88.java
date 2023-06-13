package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: W88 */
/* loaded from: classes5.dex */
public final class W88 {

    /* renamed from: b */
    public static volatile W88 f40497b;

    /* renamed from: c */
    public static final W88 f40498c = new W88(true);

    /* renamed from: a */
    public final Map f40499a;

    public W88() {
        this.f40499a = new HashMap();
    }

    /* renamed from: a */
    public static W88 m78782a() {
        W88 w88 = f40497b;
        if (w88 == null) {
            synchronized (W88.class) {
                w88 = f40497b;
                if (w88 == null) {
                    w88 = f40498c;
                    f40497b = w88;
                }
            }
        }
        return w88;
    }

    public W88(boolean z) {
        this.f40499a = Collections.emptyMap();
    }
}
