package p000;

import androidx.camera.core.AbstractC11253p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* renamed from: Yf6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37280Yf6 {

    /* renamed from: a */
    public final C32717Es6 f46263a;

    /* renamed from: b */
    public final List<AbstractC11253p> f46264b;

    /* renamed from: c */
    public final List<AbstractC52288yb0> f46265c;

    /* renamed from: Yf6$a */
    /* loaded from: classes.dex */
    public static final class C9913a {

        /* renamed from: d */
        public static final List<Integer> f46266d = Arrays.asList(1, 2, 4, 3);

        /* renamed from: a */
        public C32717Es6 f46267a;

        /* renamed from: b */
        public final List<AbstractC11253p> f46268b = new ArrayList();

        /* renamed from: c */
        public final List<AbstractC52288yb0> f46269c = new ArrayList();

        /* renamed from: a */
        public C9913a m74487a(AbstractC52288yb0 abstractC52288yb0) {
            this.f46269c.add(abstractC52288yb0);
            return this;
        }

        /* renamed from: b */
        public C9913a m74486b(AbstractC11253p abstractC11253p) {
            this.f46268b.add(abstractC11253p);
            return this;
        }

        /* renamed from: c */
        public C37280Yf6 m74485c() {
            HZ3.m103736b(!this.f46268b.isEmpty(), "UseCase must not be empty.");
            m74484d();
            return new C37280Yf6(this.f46267a, this.f46268b, this.f46269c);
        }

        /* renamed from: d */
        public final void m74484d() {
            int i = 0;
            for (AbstractC52288yb0 abstractC52288yb0 : this.f46269c) {
                int m3208e = abstractC52288yb0.m3208e();
                VY5.m79751a(f46266d, m3208e);
                int i2 = i & m3208e;
                if (i2 <= 0) {
                    i |= m3208e;
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "More than one effects has targets %s.", VY5.m79750b(i2)));
                }
            }
        }

        /* renamed from: e */
        public C9913a m74483e(C32717Es6 c32717Es6) {
            this.f46267a = c32717Es6;
            return this;
        }
    }

    public C37280Yf6(C32717Es6 c32717Es6, List<AbstractC11253p> list, List<AbstractC52288yb0> list2) {
        this.f46263a = c32717Es6;
        this.f46264b = list;
        this.f46265c = list2;
    }

    /* renamed from: a */
    public List<AbstractC52288yb0> m74490a() {
        return this.f46265c;
    }

    /* renamed from: b */
    public List<AbstractC11253p> m74489b() {
        return this.f46264b;
    }

    /* renamed from: c */
    public C32717Es6 m74488c() {
        return this.f46263a;
    }
}
