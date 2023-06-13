package com.google.protobuf;

import com.google.protobuf.C18489P;
import java.io.IOException;
/* renamed from: com.google.protobuf.z */
/* loaded from: classes6.dex */
public class C18565z<K, V> {

    /* renamed from: a */
    public final C18566a<K, V> f74895a;

    /* renamed from: b */
    public final K f74896b;

    /* renamed from: c */
    public final V f74897c;

    /* renamed from: com.google.protobuf.z$a */
    /* loaded from: classes6.dex */
    public static class C18566a<K, V> {

        /* renamed from: a */
        public final C18489P.EnumC18491b f74898a;

        /* renamed from: b */
        public final K f74899b;

        /* renamed from: c */
        public final C18489P.EnumC18491b f74900c;

        /* renamed from: d */
        public final V f74901d;

        public C18566a(C18489P.EnumC18491b enumC18491b, K k, C18489P.EnumC18491b enumC18491b2, V v) {
            this.f74898a = enumC18491b;
            this.f74899b = k;
            this.f74900c = enumC18491b2;
            this.f74901d = v;
        }
    }

    public C18565z(C18489P.EnumC18491b enumC18491b, K k, C18489P.EnumC18491b enumC18491b2, V v) {
        this.f74895a = new C18566a<>(enumC18491b, k, enumC18491b2, v);
        this.f74896b = k;
        this.f74897c = v;
    }

    /* renamed from: b */
    public static <K, V> int m45951b(C18566a<K, V> c18566a, K k, V v) {
        return C18531o.m46105d(c18566a.f74898a, 1, k) + C18531o.m46105d(c18566a.f74900c, 2, v);
    }

    /* renamed from: d */
    public static <K, V> C18565z<K, V> m45949d(C18489P.EnumC18491b enumC18491b, K k, C18489P.EnumC18491b enumC18491b2, V v) {
        return new C18565z<>(enumC18491b, k, enumC18491b2, v);
    }

    /* renamed from: e */
    public static <K, V> void m45948e(CodedOutputStream codedOutputStream, C18566a<K, V> c18566a, K k, V v) throws IOException {
        C18531o.m46110A(codedOutputStream, c18566a.f74898a, 1, k);
        C18531o.m46110A(codedOutputStream, c18566a.f74900c, 2, v);
    }

    /* renamed from: a */
    public int m45952a(int i, K k, V v) {
        return CodedOutputStream.m46701T(i) + CodedOutputStream.m46728C(m45951b(this.f74895a, k, v));
    }

    /* renamed from: c */
    public C18566a<K, V> m45950c() {
        return this.f74895a;
    }
}
