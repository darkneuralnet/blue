package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.protobuf.u */
/* loaded from: classes6.dex */
public class C18554u extends C18558v {

    /* renamed from: f */
    public final InterfaceC18462D f74878f;

    /* renamed from: com.google.protobuf.u$b */
    /* loaded from: classes6.dex */
    public static class C18556b<K> implements Map.Entry<K, Object> {

        /* renamed from: b */
        public Map.Entry<K, C18554u> f74879b;

        /* renamed from: a */
        public C18554u m45987a() {
            return this.f74879b.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f74879b.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C18554u value = this.f74879b.getValue();
            if (value == null) {
                return null;
            }
            return value.m45988f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC18462D) {
                return this.f74879b.getValue().m45982d((InterfaceC18462D) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public C18556b(Map.Entry<K, C18554u> entry) {
            this.f74879b = entry;
        }
    }

    /* renamed from: com.google.protobuf.u$c */
    /* loaded from: classes6.dex */
    public static class C18557c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b */
        public Iterator<Map.Entry<K, Object>> f74880b;

        public C18557c(Iterator<Map.Entry<K, Object>> it) {
            this.f74880b = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f74880b.next();
            if (next.getValue() instanceof C18554u) {
                return new C18556b(next);
            }
            return next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f74880b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f74880b.remove();
        }
    }

    @Override // com.google.protobuf.C18558v
    public boolean equals(Object obj) {
        return m45988f().equals(obj);
    }

    /* renamed from: f */
    public InterfaceC18462D m45988f() {
        return m45983c(this.f74878f);
    }

    @Override // com.google.protobuf.C18558v
    public int hashCode() {
        return m45988f().hashCode();
    }

    public String toString() {
        return m45988f().toString();
    }
}
