package p000;

import java.util.concurrent.TimeUnit;
/* renamed from: wy0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51332wy0 {

    /* renamed from: a */
    public final boolean f116897a;

    /* renamed from: b */
    public final boolean f116898b;

    /* renamed from: c */
    public final K46 f116899c;

    /* renamed from: wy0$a */
    /* loaded from: classes6.dex */
    public static class C29999a {

        /* renamed from: a */
        public boolean f116900a = false;

        /* renamed from: b */
        public boolean f116901b = false;

        /* renamed from: c */
        public K46 f116902c = new K46(30, TimeUnit.SECONDS);

        /* renamed from: a */
        public C51332wy0 m6057a() {
            return new C51332wy0(this.f116900a, this.f116901b, this.f116902c);
        }

        /* renamed from: b */
        public C29999a m6056b(boolean z) {
            this.f116900a = z;
            return this;
        }

        /* renamed from: c */
        public C29999a m6055c(K46 k46) {
            this.f116902c = k46;
            return this;
        }

        /* renamed from: d */
        public C29999a m6054d(boolean z) {
            this.f116901b = z;
            return this;
        }
    }

    public C51332wy0(boolean z, boolean z2, K46 k46) {
        this.f116897a = z;
        this.f116898b = z2;
        this.f116899c = k46;
    }
}
