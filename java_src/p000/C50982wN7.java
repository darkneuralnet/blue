package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: wN7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50982wN7 {

    /* renamed from: b */
    public static final Class<?> f115876b = m6954a();

    /* renamed from: c */
    public static final C50982wN7 f115877c = new C50982wN7(true);

    /* renamed from: a */
    public final Map<Object, Object> f115878a;

    public C50982wN7() {
        this.f115878a = new HashMap();
    }

    /* renamed from: a */
    public static Class<?> m6954a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C50982wN7 m6953b() {
        return C41496gN7.m39544b();
    }

    public C50982wN7(boolean z) {
        this.f115878a = Collections.emptyMap();
    }
}
