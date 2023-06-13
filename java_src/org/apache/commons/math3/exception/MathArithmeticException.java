package org.apache.commons.math3.exception;
/* loaded from: classes8.dex */
public class MathArithmeticException extends ArithmeticException {
    private static final long serialVersionUID = -6024911025449780478L;

    /* renamed from: b */
    public final C37284Yg1 f102603b;

    public MathArithmeticException() {
        C37284Yg1 c37284Yg1 = new C37284Yg1(this);
        this.f102603b = c37284Yg1;
        c37284Yg1.m74481a(EnumC33910Jv2.ARITHMETIC_EXCEPTION, new Object[0]);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f102603b.m74477e();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f102603b.m74476f();
    }
}
