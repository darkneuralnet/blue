package p000;

import android.util.Range;
import java.util.Arrays;
import p000.C28424su;
/* renamed from: wp6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC51248wp6 {

    /* renamed from: a */
    public static final Range<Integer> f116608a = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: b */
    public static final Range<Integer> f116609b = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: c */
    public static final C35613Rc4 f116610c;

    /* renamed from: wp6$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC29965a {
        /* renamed from: a */
        public abstract AbstractC51248wp6 mo6281a();

        /* renamed from: b */
        public abstract AbstractC29965a mo6280b(int i);

        /* renamed from: c */
        public abstract AbstractC29965a mo6279c(Range<Integer> range);

        /* renamed from: d */
        public abstract AbstractC29965a mo6278d(Range<Integer> range);

        /* renamed from: e */
        public abstract AbstractC29965a mo6277e(C35613Rc4 c35613Rc4);
    }

    static {
        C52885zb4 c52885zb4 = C52885zb4.f121576c;
        f116610c = C35613Rc4.m86555e(Arrays.asList(c52885zb4, C52885zb4.f121575b, C52885zb4.f121574a), C33567Ij1.m101750a(c52885zb4));
    }

    /* renamed from: a */
    public static AbstractC29965a m6287a() {
        return new C28424su.C28426b().mo6277e(f116610c).mo6278d(f116608a).mo6279c(f116609b).mo6280b(-1);
    }

    /* renamed from: b */
    public abstract int mo6286b();

    /* renamed from: c */
    public abstract Range<Integer> mo6285c();

    /* renamed from: d */
    public abstract Range<Integer> mo6284d();

    /* renamed from: e */
    public abstract C35613Rc4 mo6283e();

    /* renamed from: f */
    public abstract AbstractC29965a mo6282f();
}
