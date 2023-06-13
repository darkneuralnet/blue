package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18142B;
import java.util.Map;
/* renamed from: com.google.crypto.tink.shaded.protobuf.E */
/* loaded from: classes6.dex */
public class C18148E implements InterfaceC18147D {
    /* renamed from: i */
    public static <K, V> int m48089i(int i, Object obj, Object obj2) {
        C18144C c18144c = (C18144C) obj;
        C18142B c18142b = (C18142B) obj2;
        int i2 = 0;
        if (c18144c.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : c18144c.entrySet()) {
            i2 += c18142b.m48212a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    public static <K, V> C18144C<K, V> m48088j(Object obj, Object obj2) {
        C18144C<K, V> c18144c = (C18144C) obj;
        C18144C<K, V> c18144c2 = (C18144C) obj2;
        if (!c18144c2.isEmpty()) {
            if (!c18144c.m48201l()) {
                c18144c = c18144c.m48198o();
            }
            c18144c.m48199n(c18144c2);
        }
        return c18144c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18147D
    /* renamed from: a */
    public C18142B.C18143a<?, ?> mo48097a(Object obj) {
        ((C18142B) obj).m48210c();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18147D
    /* renamed from: b */
    public Object mo48096b(Object obj) {
        ((C18144C) obj).m48200m();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18147D
    /* renamed from: c */
    public Object mo48095c(Object obj, Object obj2) {
        return m48088j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18147D
    /* renamed from: d */
    public int mo48094d(int i, Object obj, Object obj2) {
        return m48089i(i, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18147D
    /* renamed from: e */
    public Map<?, ?> mo48093e(Object obj) {
        return (C18144C) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18147D
    /* renamed from: f */
    public Object mo48092f(Object obj) {
        return C18144C.m48205g().m48198o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18147D
    /* renamed from: g */
    public Map<?, ?> mo48091g(Object obj) {
        return (C18144C) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18147D
    /* renamed from: h */
    public boolean mo48090h(Object obj) {
        return !((C18144C) obj).m48201l();
    }
}
