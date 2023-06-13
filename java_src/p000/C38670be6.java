package p000;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: be6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C38670be6 implements V31, Serializable {

    /* renamed from: c */
    public static final Logger f57822c = Logger.getLogger(C38670be6.class.getName());

    /* renamed from: d */
    public static final V31 f57823d = new C38670be6(AbstractC28986u1.f111479d);

    /* renamed from: e */
    public static final V31 f57824e = new C38670be6('L');

    /* renamed from: f */
    public static final V31 f57825f = new C38670be6('M');

    /* renamed from: g */
    public static final V31 f57826g = new C38670be6('T');

    /* renamed from: h */
    public static final V31 f57827h = new C38670be6('I');

    /* renamed from: i */
    public static final V31 f57828i = new C38670be6((char) 920);

    /* renamed from: j */
    public static final V31 f57829j = new C38670be6('N');

    /* renamed from: k */
    public static final V31 f57830k = new C38670be6('J');
    private static final long serialVersionUID = 7806787530512644696L;

    /* renamed from: b */
    public final InterfaceC35858Sd6<?> f57831b;

    public C38670be6(char c) {
        this.f57831b = new C30495yE("[" + c + ']', f57823d);
    }

    /* renamed from: b */
    public static <Q> V31 m64215b(Class<Q> cls) {
        InterfaceC35858Sd6<Q> m16670a = C42838ie6.m33626d().m16670a(cls);
        if (m16670a == null) {
            Logger logger = f57822c;
            Level level = Level.FINER;
            logger.log(level, "Quantity type: " + cls + " unknown");
        }
        if (m16670a != null) {
            return m16670a.mo3806F();
        }
        return null;
    }

    /* renamed from: a */
    public final C38670be6 m64216a(C38670be6 c38670be6) {
        return new C38670be6(this.f57831b.mo11077j(c38670be6.f57831b));
    }

    @Override // p000.V31
    /* renamed from: e */
    public Map<? extends V31, Integer> mo64212e() {
        Map<? extends InterfaceC35858Sd6<?>, Integer> mo3803l = this.f57831b.mo3803l();
        if (mo3803l == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<? extends InterfaceC35858Sd6<?>, Integer> entry : mo3803l.entrySet()) {
            hashMap.put(new C38670be6(entry.getKey()), entry.getValue());
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38670be6) {
            return Objects.equals(this.f57831b, ((C38670be6) obj).f57831b);
        }
        return false;
    }

    @Override // p000.V31
    /* renamed from: f */
    public V31 mo64211f(V31 v31) {
        return v31 instanceof C38670be6 ? m64216a((C38670be6) v31) : mo64211f(v31);
    }

    @Override // p000.V31
    /* renamed from: g */
    public C38670be6 mo64213d(int i) {
        return new C38670be6(this.f57831b.mo11083d(i));
    }

    @Override // p000.V31
    /* renamed from: h */
    public C38670be6 mo64214c(int i) {
        return new C38670be6(this.f57831b.mo11084c(i));
    }

    public int hashCode() {
        return Objects.hashCode(this.f57831b);
    }

    public String toString() {
        return this.f57831b.toString();
    }

    public C38670be6(InterfaceC35858Sd6<?> interfaceC35858Sd6) {
        this.f57831b = interfaceC35858Sd6;
    }

    public C38670be6() {
        this(AbstractC28986u1.f111479d);
    }
}
