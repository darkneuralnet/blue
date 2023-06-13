package com.google.protobuf;

import com.google.protobuf.C18544t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.protobuf.x */
/* loaded from: classes6.dex */
public abstract class AbstractC18560x {

    /* renamed from: a */
    public static final AbstractC18560x f74889a = new C18562b();

    /* renamed from: b */
    public static final AbstractC18560x f74890b = new C18563c();

    /* renamed from: com.google.protobuf.x$b */
    /* loaded from: classes6.dex */
    public static final class C18562b extends AbstractC18560x {

        /* renamed from: c */
        public static final Class<?> f74891c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private C18562b() {
            super();
        }

        /* renamed from: f */
        public static <E> List<E> m45971f(Object obj, long j) {
            return (List) C52324ye6.m3105C(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public static <L> List<L> m45970g(Object obj, long j, int i) {
            C18559w c18559w;
            List<L> arrayList;
            List<L> m45971f = m45971f(obj, j);
            if (m45971f.isEmpty()) {
                if (m45971f instanceof InterfaceC35017Oo2) {
                    arrayList = new C18559w(i);
                } else if ((m45971f instanceof F24) && (m45971f instanceof C18544t.InterfaceC18553i)) {
                    arrayList = ((C18544t.InterfaceC18553i) m45971f).mo45959k(i);
                } else {
                    arrayList = new ArrayList<>(i);
                }
                C52324ye6.m3090R(obj, j, arrayList);
                return arrayList;
            }
            if (f74891c.isAssignableFrom(m45971f.getClass())) {
                ArrayList arrayList2 = new ArrayList(m45971f.size() + i);
                arrayList2.addAll(m45971f);
                C52324ye6.m3090R(obj, j, arrayList2);
                c18559w = arrayList2;
            } else if (m45971f instanceof C48767se6) {
                C18559w c18559w2 = new C18559w(m45971f.size() + i);
                c18559w2.addAll((C48767se6) m45971f);
                C52324ye6.m3090R(obj, j, c18559w2);
                c18559w = c18559w2;
            } else if ((m45971f instanceof F24) && (m45971f instanceof C18544t.InterfaceC18553i)) {
                C18544t.InterfaceC18553i interfaceC18553i = (C18544t.InterfaceC18553i) m45971f;
                if (!interfaceC18553i.mo45974t()) {
                    C18544t.InterfaceC18553i mo45959k = interfaceC18553i.mo45959k(m45971f.size() + i);
                    C52324ye6.m3090R(obj, j, mo45959k);
                    return mo45959k;
                }
                return m45971f;
            } else {
                return m45971f;
            }
            return c18559w;
        }

        @Override // com.google.protobuf.AbstractC18560x
        /* renamed from: c */
        public void mo45969c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) C52324ye6.m3105C(obj, j);
            if (list instanceof InterfaceC35017Oo2) {
                unmodifiableList = ((InterfaceC35017Oo2) list).getUnmodifiableView();
            } else if (f74891c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof F24) && (list instanceof C18544t.InterfaceC18553i)) {
                    C18544t.InterfaceC18553i interfaceC18553i = (C18544t.InterfaceC18553i) list;
                    if (interfaceC18553i.mo45974t()) {
                        interfaceC18553i.mo45989r();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            C52324ye6.m3090R(obj, j, unmodifiableList);
        }

        @Override // com.google.protobuf.AbstractC18560x
        /* renamed from: d */
        public <E> void mo45968d(Object obj, Object obj2, long j) {
            List m45971f = m45971f(obj2, j);
            List m45970g = m45970g(obj, j, m45971f.size());
            int size = m45970g.size();
            int size2 = m45971f.size();
            if (size > 0 && size2 > 0) {
                m45970g.addAll(m45971f);
            }
            if (size > 0) {
                m45971f = m45970g;
            }
            C52324ye6.m3090R(obj, j, m45971f);
        }

        @Override // com.google.protobuf.AbstractC18560x
        /* renamed from: e */
        public <L> List<L> mo45967e(Object obj, long j) {
            return m45970g(obj, j, 10);
        }
    }

    /* renamed from: com.google.protobuf.x$c */
    /* loaded from: classes6.dex */
    public static final class C18563c extends AbstractC18560x {
        private C18563c() {
            super();
        }

        /* renamed from: f */
        public static <E> C18544t.InterfaceC18553i<E> m45966f(Object obj, long j) {
            return (C18544t.InterfaceC18553i) C52324ye6.m3105C(obj, j);
        }

        @Override // com.google.protobuf.AbstractC18560x
        /* renamed from: c */
        public void mo45969c(Object obj, long j) {
            m45966f(obj, j).mo45989r();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.protobuf.AbstractC18560x
        /* renamed from: d */
        public <E> void mo45968d(Object obj, Object obj2, long j) {
            C18544t.InterfaceC18553i<E> m45966f = m45966f(obj, j);
            C18544t.InterfaceC18553i<E> m45966f2 = m45966f(obj2, j);
            int size = m45966f.size();
            int size2 = m45966f2.size();
            C18544t.InterfaceC18553i<E> interfaceC18553i = m45966f;
            interfaceC18553i = m45966f;
            if (size > 0 && size2 > 0) {
                boolean mo45974t = m45966f.mo45974t();
                C18544t.InterfaceC18553i<E> interfaceC18553i2 = m45966f;
                if (!mo45974t) {
                    interfaceC18553i2 = m45966f.mo45959k(size2 + size);
                }
                interfaceC18553i2.addAll(m45966f2);
                interfaceC18553i = interfaceC18553i2;
            }
            if (size > 0) {
                m45966f2 = interfaceC18553i;
            }
            C52324ye6.m3090R(obj, j, m45966f2);
        }

        @Override // com.google.protobuf.AbstractC18560x
        /* renamed from: e */
        public <L> List<L> mo45967e(Object obj, long j) {
            int i;
            C18544t.InterfaceC18553i m45966f = m45966f(obj, j);
            if (!m45966f.mo45974t()) {
                int size = m45966f.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                C18544t.InterfaceC18553i mo45959k = m45966f.mo45959k(i);
                C52324ye6.m3090R(obj, j, mo45959k);
                return mo45959k;
            }
            return m45966f;
        }
    }

    /* renamed from: a */
    public static AbstractC18560x m45973a() {
        return f74889a;
    }

    /* renamed from: b */
    public static AbstractC18560x m45972b() {
        return f74890b;
    }

    /* renamed from: c */
    public abstract void mo45969c(Object obj, long j);

    /* renamed from: d */
    public abstract <L> void mo45968d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract <L> List<L> mo45967e(Object obj, long j);

    private AbstractC18560x() {
    }
}
