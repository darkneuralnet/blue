package p000;

import java.io.IOException;
/* renamed from: In7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33609In7 extends IOException {

    /* renamed from: b */
    public final bz9 f16206b;

    public C33609In7(bz9 bz9Var, String str) {
        super(str);
        this.f16206b = bz9Var;
    }

    /* renamed from: b */
    public static C33609In7 m101709b(String str, Exception exc) {
        return new C33609In7(bz9.RPC_CLIENT_ERROR, str, exc);
    }

    /* renamed from: a */
    public final bz9 m101710a() {
        return this.f16206b;
    }

    public C33609In7(bz9 bz9Var, String str, Throwable th) {
        super(str, th);
        this.f16206b = bz9Var;
    }
}
