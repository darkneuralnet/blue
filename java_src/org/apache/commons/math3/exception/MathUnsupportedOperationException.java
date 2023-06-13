package org.apache.commons.math3.exception;
/* loaded from: classes8.dex */
public class MathUnsupportedOperationException extends UnsupportedOperationException {
    private static final long serialVersionUID = -6024911025449780478L;

    /* renamed from: b */
    public final C37284Yg1 f102609b;

    public MathUnsupportedOperationException() {
        this(EnumC33910Jv2.UNSUPPORTED_OPERATION, new Object[0]);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f102609b.m74477e();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f102609b.m74476f();
    }

    public MathUnsupportedOperationException(InterfaceC33442Hv2 interfaceC33442Hv2, Object... objArr) {
        C37284Yg1 c37284Yg1 = new C37284Yg1(this);
        this.f102609b = c37284Yg1;
        c37284Yg1.m74481a(interfaceC33442Hv2, objArr);
    }
}
