package p000;
/* renamed from: jc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC43405jc0 {

    /* renamed from: jc0$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC24956a {
        /* renamed from: a */
        public static AbstractC24956a m30208a(int i) {
            return m30207b(i, null);
        }

        /* renamed from: b */
        public static AbstractC24956a m30207b(int i, Throwable th) {
            return new C27087ot(i, th);
        }

        /* renamed from: c */
        public abstract Throwable mo20372c();

        /* renamed from: d */
        public abstract int mo20371d();
    }

    /* renamed from: jc0$b */
    /* loaded from: classes.dex */
    public enum EnumC24957b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    /* renamed from: a */
    public static AbstractC43405jc0 m30210a(EnumC24957b enumC24957b) {
        return m30209b(enumC24957b, null);
    }

    /* renamed from: b */
    public static AbstractC43405jc0 m30209b(EnumC24957b enumC24957b, AbstractC24956a abstractC24956a) {
        return new C26735nt(enumC24957b, abstractC24956a);
    }

    /* renamed from: c */
    public abstract AbstractC24956a mo22251c();

    /* renamed from: d */
    public abstract EnumC24957b mo22250d();
}
