package p000;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* renamed from: d39  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39533d39 {

    /* renamed from: c */
    public static final C39533d39 f76086c;

    /* renamed from: d */
    public static final C39533d39 f76087d;

    /* renamed from: a */
    public final boolean f76088a;
    @NullableDecl

    /* renamed from: b */
    public final Throwable f76089b;

    static {
        boolean z;
        z = AbstractC50204v39.f113454e;
        if (z) {
            f76087d = null;
            f76086c = null;
            return;
        }
        f76087d = new C39533d39(false, null);
        f76086c = new C39533d39(true, null);
    }

    public C39533d39(boolean z, @NullableDecl Throwable th) {
        this.f76088a = z;
        this.f76089b = th;
    }
}
