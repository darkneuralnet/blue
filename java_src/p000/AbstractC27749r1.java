package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: r1 */
/* loaded from: classes8.dex */
public abstract class AbstractC27749r1 {

    /* renamed from: c */
    public static final Logger f106204c = Logger.getLogger(AbstractC27749r1.class.getName());

    /* renamed from: a */
    public final Set<InterfaceC35858Sd6<?>> f106205a = new HashSet();

    /* renamed from: b */
    public final Map<Class<Object>, InterfaceC35858Sd6> f106206b = new HashMap();

    /* renamed from: r1$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C27750a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f106207a;

        static {
            int[] iArr = new int[EnumC41059fe6.values().length];
            f106207a = iArr;
            try {
                iArr[EnumC41059fe6.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106207a[EnumC41059fe6.SYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106207a[EnumC41059fe6.NAME_AND_SYMBOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f106207a[EnumC41059fe6.SYMBOL_AND_LABEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f106207a[EnumC41059fe6.LABEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: r1$b */
    /* loaded from: classes8.dex */
    public static class C27751b {
        /* renamed from: a */
        public static <U extends InterfaceC35858Sd6<?>> U m16669a(Set<InterfaceC35858Sd6<?>> set, U u, String str, String str2) {
            return (U) m16668b(set, u, str, str2, EnumC41059fe6.NAME_AND_SYMBOL);
        }

        /* renamed from: b */
        public static <U extends InterfaceC35858Sd6<?>> U m16668b(Set<InterfaceC35858Sd6<?>> set, U u, String str, String str2, EnumC41059fe6 enumC41059fe6) {
            int i = C27750a.f106207a[enumC41059fe6.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        Logger logger = AbstractC27749r1.f106204c;
                        Level level = Level.FINEST;
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Unknown style " + enumC41059fe6 + "; unit " + u + " can't be rendered with '" + str2 + "'.");
                        }
                    } else if (str != null && str2 != null && (u instanceof AbstractC28986u1)) {
                        AbstractC28986u1 abstractC28986u1 = (AbstractC28986u1) u;
                        abstractC28986u1.m11090E(str);
                        if (EnumC41059fe6.SYMBOL.equals(enumC41059fe6) || EnumC41059fe6.SYMBOL_AND_LABEL.equals(enumC41059fe6)) {
                            abstractC28986u1.m11088H(str2);
                        }
                        if (EnumC41059fe6.LABEL.equals(enumC41059fe6) || EnumC41059fe6.SYMBOL_AND_LABEL.equals(enumC41059fe6)) {
                            AbstractC38404bB5.m64874k().mo64871n(u, str2);
                        }
                        set.add(abstractC28986u1);
                        return abstractC28986u1;
                    }
                } else if (u instanceof AbstractC28986u1) {
                    AbstractC28986u1 abstractC28986u12 = (AbstractC28986u1) u;
                    if (str != null && EnumC41059fe6.NAME_AND_SYMBOL.equals(enumC41059fe6)) {
                        abstractC28986u12.m11090E(str);
                    }
                    if (str != null && (EnumC41059fe6.SYMBOL.equals(enumC41059fe6) || EnumC41059fe6.NAME_AND_SYMBOL.equals(enumC41059fe6))) {
                        abstractC28986u12.m11088H(str2);
                    }
                    set.add(abstractC28986u12);
                    return abstractC28986u12;
                }
            } else if (str != null && (u instanceof AbstractC28986u1)) {
                AbstractC28986u1 abstractC28986u13 = (AbstractC28986u1) u;
                abstractC28986u13.m11090E(str);
                set.add(abstractC28986u13);
                return abstractC28986u13;
            }
            if (EnumC41059fe6.LABEL.equals(enumC41059fe6) || EnumC41059fe6.SYMBOL_AND_LABEL.equals(enumC41059fe6)) {
                AbstractC38404bB5.m64874k().mo64871n(u, str2);
            }
            set.add(u);
            return u;
        }
    }

    /* renamed from: a */
    public <Q> InterfaceC35858Sd6<Q> m16670a(Class<Q> cls) {
        return this.f106206b.get(cls);
    }
}
