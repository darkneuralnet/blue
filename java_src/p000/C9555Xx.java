package p000;

import com.google.android.gms.common.internal.Objects;
import java.util.concurrent.Executor;
/* renamed from: Xx */
/* loaded from: classes6.dex */
public class C9555Xx {

    /* renamed from: a */
    public final int f44272a;

    /* renamed from: b */
    public final boolean f44273b;

    /* renamed from: c */
    public final Executor f44274c;

    /* renamed from: Xx$a */
    /* loaded from: classes6.dex */
    public static class C9556a {

        /* renamed from: a */
        public int f44275a = 0;

        /* renamed from: b */
        public boolean f44276b;

        /* renamed from: c */
        public Executor f44277c;

        /* renamed from: a */
        public C9555Xx m76027a() {
            return new C9555Xx(this.f44275a, this.f44276b, this.f44277c, null);
        }

        /* renamed from: b */
        public C9556a m76026b(int i, int... iArr) {
            this.f44275a = i;
            if (iArr != null) {
                for (int i2 : iArr) {
                    this.f44275a = i2 | this.f44275a;
                }
            }
            return this;
        }
    }

    public /* synthetic */ C9555Xx(int i, boolean z, Executor executor, C39885df7 c39885df7) {
        this.f44272a = i;
        this.f44273b = z;
        this.f44274c = executor;
    }

    /* renamed from: a */
    public final int m76030a() {
        return this.f44272a;
    }

    /* renamed from: b */
    public final Executor m76029b() {
        return this.f44274c;
    }

    /* renamed from: c */
    public final boolean m76028c() {
        return this.f44273b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9555Xx)) {
            return false;
        }
        C9555Xx c9555Xx = (C9555Xx) obj;
        if (this.f44272a == c9555Xx.f44272a && this.f44273b == c9555Xx.f44273b && Objects.equal(this.f44274c, c9555Xx.f44274c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f44272a), Boolean.valueOf(this.f44273b), this.f44274c);
    }
}
