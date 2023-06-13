package p000;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* renamed from: zV2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52828zV2 {

    /* renamed from: a */
    public final C51642xV2 f121421a;

    /* renamed from: b */
    public final List<C31019c> f121422b;

    /* renamed from: c */
    public final Integer f121423c;

    /* renamed from: zV2$b */
    /* loaded from: classes6.dex */
    public static final class C31018b {

        /* renamed from: a */
        public ArrayList<C31019c> f121424a = new ArrayList<>();

        /* renamed from: b */
        public C51642xV2 f121425b = C51642xV2.f117716b;

        /* renamed from: c */
        public Integer f121426c = null;

        /* renamed from: a */
        public C31018b m1303a(C33343Hk2 c33343Hk2, int i, JE3 je3) {
            ArrayList<C31019c> arrayList = this.f121424a;
            if (arrayList != null) {
                arrayList.add(new C31019c(c33343Hk2, i, je3));
                return this;
            }
            throw new IllegalStateException("addEntry cannot be called after build()");
        }

        /* renamed from: b */
        public C52828zV2 m1302b() throws GeneralSecurityException {
            if (this.f121424a != null) {
                Integer num = this.f121426c;
                if (num != null && !m1301c(num.intValue())) {
                    throw new GeneralSecurityException("primary key ID is not present in entries");
                }
                C52828zV2 c52828zV2 = new C52828zV2(this.f121425b, Collections.unmodifiableList(this.f121424a), this.f121426c);
                this.f121424a = null;
                return c52828zV2;
            }
            throw new IllegalStateException("cannot call build() twice");
        }

        /* renamed from: c */
        public final boolean m1301c(int i) {
            Iterator<C31019c> it = this.f121424a.iterator();
            while (it.hasNext()) {
                if (it.next().m1298a() == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public C31018b m1300d(C51642xV2 c51642xV2) {
            if (this.f121424a != null) {
                this.f121425b = c51642xV2;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }

        /* renamed from: e */
        public C31018b m1299e(int i) {
            if (this.f121424a != null) {
                this.f121426c = Integer.valueOf(i);
                return this;
            }
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
    }

    /* renamed from: zV2$c */
    /* loaded from: classes6.dex */
    public static final class C31019c {

        /* renamed from: a */
        public final C33343Hk2 f121427a;

        /* renamed from: b */
        public final int f121428b;

        /* renamed from: c */
        public final JE3 f121429c;

        /* renamed from: a */
        public int m1298a() {
            return this.f121428b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C31019c)) {
                return false;
            }
            C31019c c31019c = (C31019c) obj;
            if (this.f121427a != c31019c.f121427a || this.f121428b != c31019c.f121428b || !this.f121429c.equals(c31019c.f121429c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(this.f121427a, Integer.valueOf(this.f121428b), Integer.valueOf(this.f121429c.hashCode()));
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, parameters='%s')", this.f121427a, Integer.valueOf(this.f121428b), this.f121429c);
        }

        public C31019c(C33343Hk2 c33343Hk2, int i, JE3 je3) {
            this.f121427a = c33343Hk2;
            this.f121428b = i;
            this.f121429c = je3;
        }
    }

    /* renamed from: a */
    public static C31018b m1304a() {
        return new C31018b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C52828zV2)) {
            return false;
        }
        C52828zV2 c52828zV2 = (C52828zV2) obj;
        if (!this.f121421a.equals(c52828zV2.f121421a) || !this.f121422b.equals(c52828zV2.f121422b) || !Objects.equals(this.f121423c, c52828zV2.f121423c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.f121421a, this.f121422b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f121421a, this.f121422b, this.f121423c);
    }

    public C52828zV2(C51642xV2 c51642xV2, List<C31019c> list, Integer num) {
        this.f121421a = c51642xV2;
        this.f121422b = list;
        this.f121423c = num;
    }
}
