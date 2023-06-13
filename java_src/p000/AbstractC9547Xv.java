package p000;
/* renamed from: Xv */
/* loaded from: classes5.dex */
public abstract class AbstractC9547Xv {

    /* renamed from: Xv$a */
    /* loaded from: classes5.dex */
    public enum EnumC9548a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC9547Xv m76112a() {
        return new C25036jt(EnumC9548a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC9547Xv m76111d() {
        return new C25036jt(EnumC9548a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC9547Xv m76110e(long j) {
        return new C25036jt(EnumC9548a.OK, j);
    }

    /* renamed from: f */
    public static AbstractC9547Xv m76109f() {
        return new C25036jt(EnumC9548a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo29794b();

    /* renamed from: c */
    public abstract EnumC9548a mo29793c();
}
