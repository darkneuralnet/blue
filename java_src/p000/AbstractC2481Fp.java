package p000;

import android.util.Range;
import p000.C20616ft;
/* renamed from: Fp */
/* loaded from: classes.dex */
public abstract class AbstractC2481Fp {

    /* renamed from: a */
    public static final Range<Integer> f10267a = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: b */
    public static final Range<Integer> f10268b = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: c */
    public static final AbstractC2481Fp f10269c = m106439a().mo40595c(0).mo40597a();

    /* renamed from: Fp$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2482a {
        /* renamed from: a */
        public abstract AbstractC2481Fp mo40597a();

        /* renamed from: b */
        public abstract AbstractC2482a mo40596b(Range<Integer> range);

        /* renamed from: c */
        public abstract AbstractC2482a mo40595c(int i);

        /* renamed from: d */
        public abstract AbstractC2482a mo40594d(Range<Integer> range);

        /* renamed from: e */
        public abstract AbstractC2482a mo40593e(int i);
    }

    /* renamed from: a */
    public static AbstractC2482a m106439a() {
        return new C20616ft.C20618b().m40592f(-1).mo40593e(-1).mo40595c(-1).mo40596b(f10267a).mo40594d(f10268b);
    }

    /* renamed from: b */
    public abstract Range<Integer> mo40602b();

    /* renamed from: c */
    public abstract int mo40601c();

    /* renamed from: d */
    public abstract Range<Integer> mo40600d();

    /* renamed from: e */
    public abstract int mo40599e();

    /* renamed from: f */
    public abstract int mo40598f();
}
