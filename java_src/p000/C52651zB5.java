package p000;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* renamed from: zB5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C52651zB5 implements InterfaceC51489xE2 {

    /* renamed from: d */
    public static final Bitmap.Config[] f120908d;

    /* renamed from: e */
    public static final Bitmap.Config[] f120909e;

    /* renamed from: f */
    public static final Bitmap.Config[] f120910f;

    /* renamed from: g */
    public static final Bitmap.Config[] f120911g;

    /* renamed from: h */
    public static final Bitmap.Config[] f120912h;

    /* renamed from: a */
    public final C30929c f120913a = new C30929c();

    /* renamed from: b */
    public final C44374lE1<C30928b, Bitmap> f120914b = new C44374lE1<>();

    /* renamed from: c */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f120915c = new HashMap();

    /* renamed from: zB5$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C30927a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f120916a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f120916a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f120916a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f120916a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f120916a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: zB5$b */
    /* loaded from: classes5.dex */
    public static final class C30928b implements InterfaceC38016aY3 {

        /* renamed from: a */
        public final C30929c f120917a;

        /* renamed from: b */
        public int f120918b;

        /* renamed from: c */
        public Bitmap.Config f120919c;

        public C30928b(C30929c c30929c) {
            this.f120917a = c30929c;
        }

        @Override // p000.InterfaceC38016aY3
        /* renamed from: a */
        public void mo1681a() {
            this.f120917a.m24226c(this);
        }

        /* renamed from: b */
        public void m1680b(int i, Bitmap.Config config) {
            this.f120918b = i;
            this.f120919c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C30928b)) {
                return false;
            }
            C30928b c30928b = (C30928b) obj;
            if (this.f120918b != c30928b.f120918b || !C47029pi6.m18922d(this.f120919c, c30928b.f120919c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = this.f120918b * 31;
            Bitmap.Config config = this.f120919c;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return C52651zB5.m1684h(this.f120918b, this.f120919c);
        }
    }

    /* renamed from: zB5$c */
    /* loaded from: classes5.dex */
    public static class C30929c extends AbstractC26421nB<C30928b> {
        @Override // p000.AbstractC26421nB
        /* renamed from: d */
        public C30928b mo1679a() {
            return new C30928b(this);
        }

        /* renamed from: e */
        public C30928b m1677e(int i, Bitmap.Config config) {
            C30928b m24227b = m24227b();
            m24227b.m1680b(i, config);
            return m24227b;
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            config = Bitmap.Config.RGBA_F16;
            configArr[configArr.length - 1] = config;
        }
        f120908d = configArr;
        f120909e = configArr;
        f120910f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f120911g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f120912h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: h */
    public static String m1684h(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: i */
    public static Bitmap.Config[] m1683i(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                return f120909e;
            }
        }
        int i = C30927a.f120916a[config.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? new Bitmap.Config[]{config} : f120912h;
                }
                return f120911g;
            }
            return f120910f;
        }
        return f120908d;
    }

    @Override // p000.InterfaceC51489xE2
    /* renamed from: a */
    public String mo1691a(int i, int i2, Bitmap.Config config) {
        return m1684h(C47029pi6.m18919g(i, i2, config), config);
    }

    @Override // p000.InterfaceC51489xE2
    /* renamed from: b */
    public int mo1690b(Bitmap bitmap) {
        return C47029pi6.m18918h(bitmap);
    }

    @Override // p000.InterfaceC51489xE2
    /* renamed from: c */
    public void mo1689c(Bitmap bitmap) {
        C30928b m1677e = this.f120913a.m1677e(C47029pi6.m18918h(bitmap), bitmap.getConfig());
        this.f120914b.m27652d(m1677e, bitmap);
        NavigableMap<Integer, Integer> m1682j = m1682j(bitmap.getConfig());
        Integer num = m1682j.get(Integer.valueOf(m1677e.f120918b));
        Integer valueOf = Integer.valueOf(m1677e.f120918b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        m1682j.put(valueOf, Integer.valueOf(i));
    }

    @Override // p000.InterfaceC51489xE2
    /* renamed from: d */
    public Bitmap mo1688d(int i, int i2, Bitmap.Config config) {
        C30928b m1685g = m1685g(C47029pi6.m18919g(i, i2, config), config);
        Bitmap m27655a = this.f120914b.m27655a(m1685g);
        if (m27655a != null) {
            m1686f(Integer.valueOf(m1685g.f120918b), m27655a);
            m27655a.reconfigure(i, i2, config);
        }
        return m27655a;
    }

    @Override // p000.InterfaceC51489xE2
    /* renamed from: e */
    public String mo1687e(Bitmap bitmap) {
        return m1684h(C47029pi6.m18918h(bitmap), bitmap.getConfig());
    }

    /* renamed from: f */
    public final void m1686f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> m1682j = m1682j(bitmap.getConfig());
        Integer num2 = m1682j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                m1682j.remove(num);
                return;
            } else {
                m1682j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo1687e(bitmap) + ", this: " + this);
    }

    /* renamed from: g */
    public final C30928b m1685g(int i, Bitmap.Config config) {
        Bitmap.Config[] m1683i;
        C30928b m1677e = this.f120913a.m1677e(i, config);
        for (Bitmap.Config config2 : m1683i(config)) {
            Integer ceilingKey = m1682j(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return m1677e;
                        }
                    } else if (config2.equals(config)) {
                        return m1677e;
                    }
                }
                this.f120913a.m24226c(m1677e);
                return this.f120913a.m1677e(ceilingKey.intValue(), config2);
            }
        }
        return m1677e;
    }

    /* renamed from: j */
    public final NavigableMap<Integer, Integer> m1682j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f120915c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f120915c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // p000.InterfaceC51489xE2
    public Bitmap removeLast() {
        Bitmap m27650f = this.f120914b.m27650f();
        if (m27650f != null) {
            m1686f(Integer.valueOf(C47029pi6.m18918h(m27650f)), m27650f);
        }
        return m27650f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f120914b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f120915c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f120915c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
