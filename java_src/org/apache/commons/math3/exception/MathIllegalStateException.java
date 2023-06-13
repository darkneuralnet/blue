package org.apache.commons.math3.exception;
/* loaded from: classes8.dex */
public class MathIllegalStateException extends IllegalStateException {
    private static final long serialVersionUID = -6024911025449780478L;

    /* renamed from: b */
    public final C37284Yg1 f102607b;

    public MathIllegalStateException(InterfaceC33442Hv2 interfaceC33442Hv2, Object... objArr) {
        C37284Yg1 c37284Yg1 = new C37284Yg1(this);
        this.f102607b = c37284Yg1;
        c37284Yg1.m74481a(interfaceC33442Hv2, objArr);
    }

    /* renamed from: a */
    public C37284Yg1 m20425a() {
        return this.f102607b;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f102607b.m74477e();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f102607b.m74476f();
    }

    public MathIllegalStateException() {
        this(EnumC33910Jv2.ILLEGAL_STATE, new Object[0]);
    }
}
