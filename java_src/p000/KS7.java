package p000;
/* renamed from: KS7 */
/* loaded from: classes6.dex */
public enum KS7 {
    OK("ok"),
    CANCELLED("canceled"),
    UNKNOWN("unknown"),
    INVALID_ARGUMENT("invalid argument"),
    DEADLINE_EXCEEDED("deadline exceeded"),
    NOT_FOUND("not found"),
    ALREADY_EXISTS("already exists"),
    PERMISSION_DENIED("permission denied"),
    RESOURCE_EXHAUSTED("resource exhausted"),
    FAILED_PRECONDITION("failed precondition"),
    ABORTED("aborted"),
    OUT_OF_RANGE("out of range"),
    UNIMPLEMENTED("unimplemented"),
    INTERNAL("internal"),
    UNAVAILABLE("unavailable"),
    DATA_LOSS("data loss"),
    UNAUTHENTICATED("unauthenticated");
    

    /* renamed from: b */
    public final String f19661b;

    KS7(String str) {
        this.f19661b = str;
    }

    /* renamed from: a */
    public final String m98857a() {
        return this.f19661b;
    }
}
