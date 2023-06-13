package p000;

import co.bird.android.model.persistence.common.ConstantsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: zb4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C52885zb4 {

    /* renamed from: a */
    public static final C52885zb4 f121574a;

    /* renamed from: b */
    public static final C52885zb4 f121575b;

    /* renamed from: c */
    public static final C52885zb4 f121576c;

    /* renamed from: d */
    public static final C52885zb4 f121577d;

    /* renamed from: e */
    public static final C52885zb4 f121578e;

    /* renamed from: f */
    public static final C52885zb4 f121579f;

    /* renamed from: g */
    public static final C52885zb4 f121580g;

    /* renamed from: h */
    public static final Set<C52885zb4> f121581h;

    /* renamed from: i */
    public static final List<C52885zb4> f121582i;

    /* renamed from: zb4$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC31050b extends C52885zb4 {
        public AbstractC31050b() {
            super();
        }

        /* renamed from: e */
        public static AbstractC31050b m1055e(int i, String str) {
            return new C12187au(i, str);
        }

        /* renamed from: c */
        public abstract String mo1057c();

        /* renamed from: d */
        public abstract int mo1056d();
    }

    static {
        AbstractC31050b m1055e = AbstractC31050b.m1055e(4, "SD");
        f121574a = m1055e;
        AbstractC31050b m1055e2 = AbstractC31050b.m1055e(5, "HD");
        f121575b = m1055e2;
        AbstractC31050b m1055e3 = AbstractC31050b.m1055e(6, "FHD");
        f121576c = m1055e3;
        AbstractC31050b m1055e4 = AbstractC31050b.m1055e(8, "UHD");
        f121577d = m1055e4;
        AbstractC31050b m1055e5 = AbstractC31050b.m1055e(0, "LOWEST");
        f121578e = m1055e5;
        AbstractC31050b m1055e6 = AbstractC31050b.m1055e(1, "HIGHEST");
        f121579f = m1055e6;
        f121580g = AbstractC31050b.m1055e(-1, ConstantsKt.NONE);
        f121581h = new HashSet(Arrays.asList(m1055e5, m1055e6, m1055e, m1055e2, m1055e3, m1055e4));
        f121582i = Arrays.asList(m1055e4, m1055e3, m1055e2, m1055e);
    }

    /* renamed from: a */
    public static boolean m1059a(C52885zb4 c52885zb4) {
        return f121581h.contains(c52885zb4);
    }

    /* renamed from: b */
    public static List<C52885zb4> m1058b() {
        return new ArrayList(f121582i);
    }

    private C52885zb4() {
    }
}
