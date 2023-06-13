package p000;
/* renamed from: e39  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40125e39 {

    /* renamed from: b */
    public static final C40125e39 f77657b = new C40125e39(new C19956a("Failure occurred while trying to finish a future."));

    /* renamed from: a */
    public final Throwable f77658a;

    /* renamed from: e39$a */
    /* loaded from: classes6.dex */
    public class C19956a extends Throwable {
        public C19956a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public C40125e39(Throwable th) {
        th.getClass();
        this.f77658a = th;
    }
}
