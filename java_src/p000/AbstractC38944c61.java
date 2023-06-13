package p000;
/* renamed from: c61  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC38944c61 {

    /* renamed from: a */
    public static final AbstractC38944c61 f60113a = new C13393a();

    /* renamed from: b */
    public static final AbstractC38944c61 f60114b = new C13394b();

    /* renamed from: c */
    public static final AbstractC38944c61 f60115c = new C13397e();

    /* renamed from: d */
    public static final AbstractC38944c61 f60116d = new C13395c();

    /* renamed from: e */
    public static final AbstractC38944c61 f60117e;

    /* renamed from: f */
    public static final AbstractC38944c61 f60118f;

    /* renamed from: g */
    public static final AbstractC38944c61 f60119g;

    /* renamed from: h */
    public static final C43035iy3<AbstractC38944c61> f60120h;

    /* renamed from: i */
    public static final boolean f60121i;

    /* renamed from: c61$a */
    /* loaded from: classes5.dex */
    public static class C13393a extends AbstractC38944c61 {
        @Override // p000.AbstractC38944c61
        /* renamed from: a */
        public EnumC13399g mo61935a(int i, int i2, int i3, int i4) {
            return EnumC13399g.QUALITY;
        }

        @Override // p000.AbstractC38944c61
        /* renamed from: b */
        public float mo61934b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }
    }

    /* renamed from: c61$b */
    /* loaded from: classes5.dex */
    public static class C13394b extends AbstractC38944c61 {
        @Override // p000.AbstractC38944c61
        /* renamed from: a */
        public EnumC13399g mo61935a(int i, int i2, int i3, int i4) {
            return EnumC13399g.MEMORY;
        }

        @Override // p000.AbstractC38944c61
        /* renamed from: b */
        public float mo61934b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / (max << i5);
        }
    }

    /* renamed from: c61$c */
    /* loaded from: classes5.dex */
    public static class C13395c extends AbstractC38944c61 {
        @Override // p000.AbstractC38944c61
        /* renamed from: a */
        public EnumC13399g mo61935a(int i, int i2, int i3, int i4) {
            if (mo61934b(i, i2, i3, i4) == 1.0f) {
                return EnumC13399g.QUALITY;
            }
            return AbstractC38944c61.f60115c.mo61935a(i, i2, i3, i4);
        }

        @Override // p000.AbstractC38944c61
        /* renamed from: b */
        public float mo61934b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, AbstractC38944c61.f60115c.mo61934b(i, i2, i3, i4));
        }
    }

    /* renamed from: c61$d */
    /* loaded from: classes5.dex */
    public static class C13396d extends AbstractC38944c61 {
        @Override // p000.AbstractC38944c61
        /* renamed from: a */
        public EnumC13399g mo61935a(int i, int i2, int i3, int i4) {
            return EnumC13399g.QUALITY;
        }

        @Override // p000.AbstractC38944c61
        /* renamed from: b */
        public float mo61934b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* renamed from: c61$e */
    /* loaded from: classes5.dex */
    public static class C13397e extends AbstractC38944c61 {
        @Override // p000.AbstractC38944c61
        /* renamed from: a */
        public EnumC13399g mo61935a(int i, int i2, int i3, int i4) {
            if (AbstractC38944c61.f60121i) {
                return EnumC13399g.QUALITY;
            }
            return EnumC13399g.MEMORY;
        }

        @Override // p000.AbstractC38944c61
        /* renamed from: b */
        public float mo61934b(int i, int i2, int i3, int i4) {
            if (AbstractC38944c61.f60121i) {
                return Math.min(i3 / i, i4 / i2);
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* renamed from: c61$f */
    /* loaded from: classes5.dex */
    public static class C13398f extends AbstractC38944c61 {
        @Override // p000.AbstractC38944c61
        /* renamed from: a */
        public EnumC13399g mo61935a(int i, int i2, int i3, int i4) {
            return EnumC13399g.QUALITY;
        }

        @Override // p000.AbstractC38944c61
        /* renamed from: b */
        public float mo61934b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: c61$g */
    /* loaded from: classes5.dex */
    public enum EnumC13399g {
        MEMORY,
        QUALITY
    }

    static {
        C13396d c13396d = new C13396d();
        f60117e = c13396d;
        f60118f = new C13398f();
        f60119g = c13396d;
        f60120h = C43035iy3.m31548f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c13396d);
        f60121i = true;
    }

    /* renamed from: a */
    public abstract EnumC13399g mo61935a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo61934b(int i, int i2, int i3, int i4);
}
