package p000;

import android.annotation.SuppressLint;
/* renamed from: Xh3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC37061Xh3 {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final AbstractC9449b.C9452c f43681a = new AbstractC9449b.C9452c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final AbstractC9449b.C9451b f43682b = new AbstractC9449b.C9451b();

    /* renamed from: Xh3$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC9449b {

        /* renamed from: Xh3$b$a */
        /* loaded from: classes.dex */
        public static final class C9450a extends AbstractC9449b {

            /* renamed from: a */
            public final Throwable f43683a;

            public C9450a(Throwable th) {
                this.f43683a = th;
            }

            /* renamed from: a */
            public Throwable m76585a() {
                return this.f43683a;
            }

            public String toString() {
                return "FAILURE (" + this.f43683a.getMessage() + ")";
            }
        }

        /* renamed from: Xh3$b$b */
        /* loaded from: classes.dex */
        public static final class C9451b extends AbstractC9449b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C9451b() {
            }
        }

        /* renamed from: Xh3$b$c */
        /* loaded from: classes.dex */
        public static final class C9452c extends AbstractC9449b {
            public String toString() {
                return "SUCCESS";
            }

            private C9452c() {
            }
        }
    }
}
