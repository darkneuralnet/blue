package com.google.protobuf;

import com.google.protobuf.C18565z;
import java.util.Map;
/* renamed from: com.google.protobuf.C */
/* loaded from: classes6.dex */
public class C18459C implements InterfaceC18458B {
    /* renamed from: i */
    public static <K, V> int m46732i(int i, Object obj, Object obj2) {
        C18457A c18457a = (C18457A) obj;
        C18565z c18565z = (C18565z) obj2;
        int i2 = 0;
        if (c18457a.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : c18457a.entrySet()) {
            i2 += c18565z.m45952a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    public static <K, V> C18457A<K, V> m46731j(Object obj, Object obj2) {
        C18457A<K, V> c18457a = (C18457A) obj;
        C18457A<K, V> c18457a2 = (C18457A) obj2;
        if (!c18457a2.isEmpty()) {
            if (!c18457a.m46744l()) {
                c18457a = c18457a.m46741o();
            }
            c18457a.m46742n(c18457a2);
        }
        return c18457a;
    }

    @Override // com.google.protobuf.InterfaceC18458B
    /* renamed from: a */
    public C18565z.C18566a<?, ?> mo46740a(Object obj) {
        return ((C18565z) obj).m45950c();
    }

    @Override // com.google.protobuf.InterfaceC18458B
    /* renamed from: b */
    public Object mo46739b(Object obj) {
        ((C18457A) obj).m46743m();
        return obj;
    }

    @Override // com.google.protobuf.InterfaceC18458B
    /* renamed from: c */
    public Object mo46738c(Object obj, Object obj2) {
        return m46731j(obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC18458B
    /* renamed from: d */
    public int mo46737d(int i, Object obj, Object obj2) {
        return m46732i(i, obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC18458B
    /* renamed from: e */
    public Map<?, ?> mo46736e(Object obj) {
        return (C18457A) obj;
    }

    @Override // com.google.protobuf.InterfaceC18458B
    /* renamed from: f */
    public Object mo46735f(Object obj) {
        return C18457A.m46748g().m46741o();
    }

    @Override // com.google.protobuf.InterfaceC18458B
    /* renamed from: g */
    public Map<?, ?> mo46734g(Object obj) {
        return (C18457A) obj;
    }

    @Override // com.google.protobuf.InterfaceC18458B
    /* renamed from: h */
    public boolean mo46733h(Object obj) {
        return !((C18457A) obj).m46744l();
    }
}
