package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18238v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.crypto.tink.shaded.protobuf.z */
/* loaded from: classes6.dex */
public abstract class AbstractC18254z {

    /* renamed from: a */
    public static final AbstractC18254z f74234a = new C18256b();

    /* renamed from: b */
    public static final AbstractC18254z f74235b = new C18257c();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$b */
    /* loaded from: classes6.dex */
    public static final class C18256b extends AbstractC18254z {

        /* renamed from: c */
        public static final Class<?> f74236c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private C18256b() {
            super();
        }

        /* renamed from: f */
        public static <E> List<E> m47393f(Object obj, long j) {
            return (List) C52917ze6.m932C(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public static <L> List<L> m47392g(Object obj, long j, int i) {
            C18253y c18253y;
            List<L> arrayList;
            List<L> m47393f = m47393f(obj, j);
            if (m47393f.isEmpty()) {
                if (m47393f instanceof InterfaceC35251Po2) {
                    arrayList = new C18253y(i);
                } else if ((m47393f instanceof G24) && (m47393f instanceof C18238v.InterfaceC18247i)) {
                    arrayList = ((C18238v.InterfaceC18247i) m47393f).mo47397k(i);
                } else {
                    arrayList = new ArrayList<>(i);
                }
                C52917ze6.m917R(obj, j, arrayList);
                return arrayList;
            }
            if (f74236c.isAssignableFrom(m47393f.getClass())) {
                ArrayList arrayList2 = new ArrayList(m47393f.size() + i);
                arrayList2.addAll(m47393f);
                C52917ze6.m917R(obj, j, arrayList2);
                c18253y = arrayList2;
            } else if (m47393f instanceof C49360te6) {
                C18253y c18253y2 = new C18253y(m47393f.size() + i);
                c18253y2.addAll((C49360te6) m47393f);
                C52917ze6.m917R(obj, j, c18253y2);
                c18253y = c18253y2;
            } else if ((m47393f instanceof G24) && (m47393f instanceof C18238v.InterfaceC18247i)) {
                C18238v.InterfaceC18247i interfaceC18247i = (C18238v.InterfaceC18247i) m47393f;
                if (!interfaceC18247i.mo47396t()) {
                    C18238v.InterfaceC18247i mo47397k = interfaceC18247i.mo47397k(m47393f.size() + i);
                    C52917ze6.m917R(obj, j, mo47397k);
                    return mo47397k;
                }
                return m47393f;
            } else {
                return m47393f;
            }
            return c18253y;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18254z
        /* renamed from: c */
        public void mo47391c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) C52917ze6.m932C(obj, j);
            if (list instanceof InterfaceC35251Po2) {
                unmodifiableList = ((InterfaceC35251Po2) list).getUnmodifiableView();
            } else if (f74236c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof G24) && (list instanceof C18238v.InterfaceC18247i)) {
                    C18238v.InterfaceC18247i interfaceC18247i = (C18238v.InterfaceC18247i) list;
                    if (interfaceC18247i.mo47396t()) {
                        interfaceC18247i.mo47412r();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            C52917ze6.m917R(obj, j, unmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18254z
        /* renamed from: d */
        public <E> void mo47390d(Object obj, Object obj2, long j) {
            List m47393f = m47393f(obj2, j);
            List m47392g = m47392g(obj, j, m47393f.size());
            int size = m47392g.size();
            int size2 = m47393f.size();
            if (size > 0 && size2 > 0) {
                m47392g.addAll(m47393f);
            }
            if (size > 0) {
                m47393f = m47392g;
            }
            C52917ze6.m917R(obj, j, m47393f);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18254z
        /* renamed from: e */
        public <L> List<L> mo47389e(Object obj, long j) {
            return m47392g(obj, j, 10);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$c */
    /* loaded from: classes6.dex */
    public static final class C18257c extends AbstractC18254z {
        private C18257c() {
            super();
        }

        /* renamed from: f */
        public static <E> C18238v.InterfaceC18247i<E> m47388f(Object obj, long j) {
            return (C18238v.InterfaceC18247i) C52917ze6.m932C(obj, j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18254z
        /* renamed from: c */
        public void mo47391c(Object obj, long j) {
            m47388f(obj, j).mo47412r();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18254z
        /* renamed from: d */
        public <E> void mo47390d(Object obj, Object obj2, long j) {
            C18238v.InterfaceC18247i<E> m47388f = m47388f(obj, j);
            C18238v.InterfaceC18247i<E> m47388f2 = m47388f(obj2, j);
            int size = m47388f.size();
            int size2 = m47388f2.size();
            C18238v.InterfaceC18247i<E> interfaceC18247i = m47388f;
            interfaceC18247i = m47388f;
            if (size > 0 && size2 > 0) {
                boolean mo47396t = m47388f.mo47396t();
                C18238v.InterfaceC18247i<E> interfaceC18247i2 = m47388f;
                if (!mo47396t) {
                    interfaceC18247i2 = m47388f.mo47397k(size2 + size);
                }
                interfaceC18247i2.addAll(m47388f2);
                interfaceC18247i = interfaceC18247i2;
            }
            if (size > 0) {
                m47388f2 = interfaceC18247i;
            }
            C52917ze6.m917R(obj, j, m47388f2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18254z
        /* renamed from: e */
        public <L> List<L> mo47389e(Object obj, long j) {
            int i;
            C18238v.InterfaceC18247i m47388f = m47388f(obj, j);
            if (!m47388f.mo47396t()) {
                int size = m47388f.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                C18238v.InterfaceC18247i mo47397k = m47388f.mo47397k(i);
                C52917ze6.m917R(obj, j, mo47397k);
                return mo47397k;
            }
            return m47388f;
        }
    }

    /* renamed from: a */
    public static AbstractC18254z m47395a() {
        return f74234a;
    }

    /* renamed from: b */
    public static AbstractC18254z m47394b() {
        return f74235b;
    }

    /* renamed from: c */
    public abstract void mo47391c(Object obj, long j);

    /* renamed from: d */
    public abstract <L> void mo47390d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract <L> List<L> mo47389e(Object obj, long j);

    private AbstractC18254z() {
    }
}
