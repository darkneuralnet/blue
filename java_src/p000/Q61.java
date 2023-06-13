package p000;

import android.graphics.drawable.Drawable;
/* renamed from: Q61 */
/* loaded from: classes5.dex */
public class Q61 implements I96<Drawable> {

    /* renamed from: a */
    public final int f29826a;

    /* renamed from: b */
    public final boolean f29827b;

    /* renamed from: c */
    public R61 f29828c;

    /* renamed from: Q61$a */
    /* loaded from: classes5.dex */
    public static class C6681a {

        /* renamed from: a */
        public final int f29829a;

        /* renamed from: b */
        public boolean f29830b;

        public C6681a() {
            this(300);
        }

        /* renamed from: a */
        public Q61 m88919a() {
            return new Q61(this.f29829a, this.f29830b);
        }

        public C6681a(int i) {
            this.f29829a = i;
        }
    }

    public Q61(int i, boolean z) {
        this.f29826a = i;
        this.f29827b = z;
    }

    @Override // p000.I96
    /* renamed from: a */
    public G96<Drawable> mo88921a(ZS0 zs0, boolean z) {
        if (zs0 == ZS0.MEMORY_CACHE) {
            return C83.m112745b();
        }
        return m88920b();
    }

    /* renamed from: b */
    public final G96<Drawable> m88920b() {
        if (this.f29828c == null) {
            this.f29828c = new R61(this.f29826a, this.f29827b);
        }
        return this.f29828c;
    }
}
