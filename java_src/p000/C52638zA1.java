package p000;

import java.io.Serializable;
/* renamed from: zA1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52638zA1 {

    /* renamed from: zA1$a */
    /* loaded from: classes6.dex */
    public static class C30924a<E> implements InterfaceC50859wA1<Object, E>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final E f120893b;

        public C30924a(E e) {
            this.f120893b = e;
        }

        @Override // p000.InterfaceC50859wA1
        public E apply(Object obj) {
            return this.f120893b;
        }

        @Override // p000.InterfaceC50859wA1
        public boolean equals(Object obj) {
            if (obj instanceof C30924a) {
                return C37025Xd3.m76748a(this.f120893b, ((C30924a) obj).f120893b);
            }
            return false;
        }

        public int hashCode() {
            E e = this.f120893b;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f120893b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Functions.constant(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    private C52638zA1() {
    }

    /* renamed from: a */
    public static <E> InterfaceC50859wA1<Object, E> m1726a(E e) {
        return new C30924a(e);
    }
}
