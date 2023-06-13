package p000;

import android.animation.TimeInterpolator;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: T81 */
/* loaded from: classes4.dex */
public abstract class T81 {

    /* renamed from: b */
    public static final T81 f34829b = new C7664a("LINEAR", 0);

    /* renamed from: c */
    public static final T81 f34830c = new C7665b("CUBIC", 1);

    /* renamed from: d */
    public static final T81 f34831d = new C7666c("QUART", 2);

    /* renamed from: e */
    public static final T81 f34832e = new C7667d("QUAD", 3);

    /* renamed from: f */
    public static final T81 f34833f = new C7668e("QUINT", 4);

    /* renamed from: g */
    public static final T81 f34834g = new C7669f("SINE", 5);

    /* renamed from: h */
    public static final /* synthetic */ T81[] f34835h = m84277a();

    /* renamed from: T81$a */
    /* loaded from: classes4.dex */
    public enum C7664a extends T81 {
        @Override // p000.T81
        /* renamed from: b */
        public TimeInterpolator mo84276b() {
            return C38381b91.f56983a;
        }

        public C7664a(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: T81$b */
    /* loaded from: classes4.dex */
    public enum C7665b extends T81 {
        @Override // p000.T81
        /* renamed from: b */
        public TimeInterpolator mo84276b() {
            return C37788a91.f49903c;
        }

        public C7665b(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: T81$c */
    /* loaded from: classes4.dex */
    public enum C7666c extends T81 {
        @Override // p000.T81
        /* renamed from: b */
        public TimeInterpolator mo84276b() {
            return C39585d91.f76177c;
        }

        public C7666c(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: T81$d */
    /* loaded from: classes4.dex */
    public enum C7667d extends T81 {
        @Override // p000.T81
        /* renamed from: b */
        public TimeInterpolator mo84276b() {
            return C38974c91.f60197c;
        }

        public C7667d(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: T81$e */
    /* loaded from: classes4.dex */
    public enum C7668e extends T81 {
        @Override // p000.T81
        /* renamed from: b */
        public TimeInterpolator mo84276b() {
            return C40177e91.f78023c;
        }

        public C7668e(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: T81$f */
    /* loaded from: classes4.dex */
    public enum C7669f extends T81 {
        @Override // p000.T81
        /* renamed from: b */
        public TimeInterpolator mo84276b() {
            return C40770f91.f79541c;
        }

        public C7669f(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ T81[] m84277a() {
        return new T81[]{f34829b, f34830c, f34831d, f34832e, f34833f, f34834g};
    }

    public static T81 valueOf(String str) {
        return (T81) Enum.valueOf(T81.class, str);
    }

    public static T81[] values() {
        return (T81[]) f34835h.clone();
    }

    /* renamed from: b */
    public abstract TimeInterpolator mo84276b();

    public T81(String str, int i) {
    }
}
