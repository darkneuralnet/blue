package p000;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
/* renamed from: KV2 */
/* loaded from: classes6.dex */
public final class KV2 {

    /* renamed from: KV2$b */
    /* loaded from: classes6.dex */
    public static final class C4454b {

        /* renamed from: a */
        public final String f19690a;

        /* renamed from: b */
        public final C4456b f19691b;

        /* renamed from: c */
        public C4456b f19692c;

        /* renamed from: d */
        public boolean f19693d;

        /* renamed from: e */
        public boolean f19694e;

        /* renamed from: KV2$b$a */
        /* loaded from: classes6.dex */
        public static final class C4455a extends C4456b {
            private C4455a() {
                super();
            }
        }

        /* renamed from: KV2$b$b */
        /* loaded from: classes6.dex */
        public static class C4456b {

            /* renamed from: a */
            public String f19695a;

            /* renamed from: b */
            public Object f19696b;

            /* renamed from: c */
            public C4456b f19697c;

            private C4456b() {
            }
        }

        /* renamed from: i */
        public static boolean m98817i(Object obj) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() == 0) {
                    return true;
                }
                return false;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof AbstractC44221ky3) {
                    return !((AbstractC44221ky3) obj).mo28086b();
                }
                if (obj.getClass().isArray() && Array.getLength(obj) == 0) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: a */
        public C4454b m98825a(String str, int i) {
            return m98819g(str, String.valueOf(i));
        }

        /* renamed from: b */
        public C4454b m98824b(String str, Object obj) {
            return m98821e(str, obj);
        }

        /* renamed from: c */
        public final C4456b m98823c() {
            C4456b c4456b = new C4456b();
            this.f19692c.f19697c = c4456b;
            this.f19692c = c4456b;
            return c4456b;
        }

        /* renamed from: d */
        public final C4454b m98822d(Object obj) {
            m98823c().f19696b = obj;
            return this;
        }

        /* renamed from: e */
        public final C4454b m98821e(String str, Object obj) {
            C4456b m98823c = m98823c();
            m98823c.f19696b = obj;
            m98823c.f19695a = (String) EZ3.m108801n(str);
            return this;
        }

        /* renamed from: f */
        public final C4455a m98820f() {
            C4455a c4455a = new C4455a();
            this.f19692c.f19697c = c4455a;
            this.f19692c = c4455a;
            return c4455a;
        }

        /* renamed from: g */
        public final C4454b m98819g(String str, Object obj) {
            C4455a m98820f = m98820f();
            m98820f.f19696b = obj;
            m98820f.f19695a = (String) EZ3.m108801n(str);
            return this;
        }

        /* renamed from: h */
        public C4454b m98818h(Object obj) {
            return m98822d(obj);
        }

        public String toString() {
            boolean z = this.f19693d;
            boolean z2 = this.f19694e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f19690a);
            sb.append(CoreConstants.CURLY_LEFT);
            String str = "";
            for (C4456b c4456b = this.f19691b.f19697c; c4456b != null; c4456b = c4456b.f19697c) {
                Object obj = c4456b.f19696b;
                if (!(c4456b instanceof C4455a)) {
                    if (obj == null) {
                        if (z) {
                        }
                    } else if (z2 && m98817i(obj)) {
                    }
                }
                sb.append(str);
                String str2 = c4456b.f19695a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                } else {
                    sb.append(obj);
                }
                str = ", ";
            }
            sb.append(CoreConstants.CURLY_RIGHT);
            return sb.toString();
        }

        public C4454b(String str) {
            C4456b c4456b = new C4456b();
            this.f19691b = c4456b;
            this.f19692c = c4456b;
            this.f19693d = false;
            this.f19694e = false;
            this.f19690a = (String) EZ3.m108801n(str);
        }
    }

    private KV2() {
    }

    /* renamed from: a */
    public static <T> T m98828a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* renamed from: b */
    public static C4454b m98827b(Class<?> cls) {
        return new C4454b(cls.getSimpleName());
    }

    /* renamed from: c */
    public static C4454b m98826c(Object obj) {
        return new C4454b(obj.getClass().getSimpleName());
    }
}
