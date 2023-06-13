package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.crypto.tink.shaded.protobuf.w */
/* loaded from: classes6.dex */
public class C18248w extends C18252x {

    /* renamed from: f */
    public final InterfaceC18149F f74223f;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.w$b */
    /* loaded from: classes6.dex */
    public static class C18250b<K> implements Map.Entry<K, Object> {

        /* renamed from: b */
        public Map.Entry<K, C18248w> f74224b;

        /* renamed from: a */
        public C18248w m47410a() {
            return this.f74224b.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f74224b.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C18248w value = this.f74224b.getValue();
            if (value == null) {
                return null;
            }
            return value.m47411f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC18149F) {
                return this.f74224b.getValue().m47405d((InterfaceC18149F) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public C18250b(Map.Entry<K, C18248w> entry) {
            this.f74224b = entry;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.w$c */
    /* loaded from: classes6.dex */
    public static class C18251c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b */
        public Iterator<Map.Entry<K, Object>> f74225b;

        public C18251c(Iterator<Map.Entry<K, Object>> it) {
            this.f74225b = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f74225b.next();
            if (next.getValue() instanceof C18248w) {
                return new C18250b(next);
            }
            return next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f74225b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f74225b.remove();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C18252x
    public boolean equals(Object obj) {
        return m47411f().equals(obj);
    }

    /* renamed from: f */
    public InterfaceC18149F m47411f() {
        return m47406c(this.f74223f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C18252x
    public int hashCode() {
        return m47411f().hashCode();
    }

    public String toString() {
        return m47411f().toString();
    }
}
