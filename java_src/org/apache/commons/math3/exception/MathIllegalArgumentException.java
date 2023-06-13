package org.apache.commons.math3.exception;
/* loaded from: classes8.dex */
public class MathIllegalArgumentException extends IllegalArgumentException {
    private static final long serialVersionUID = -6024911025449780478L;

    /* renamed from: b */
    public final C37284Yg1 f102604b;

    public MathIllegalArgumentException(InterfaceC33442Hv2 interfaceC33442Hv2, Object... objArr) {
        C37284Yg1 c37284Yg1 = new C37284Yg1(this);
        this.f102604b = c37284Yg1;
        c37284Yg1.m74481a(interfaceC33442Hv2, objArr);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f102604b.m74477e();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f102604b.m74476f();
    }
}
