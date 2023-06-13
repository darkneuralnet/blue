package org.apache.commons.math3.exception;
/* loaded from: classes8.dex */
public class ConvergenceException extends MathIllegalStateException {
    private static final long serialVersionUID = 4330003017885151975L;

    public ConvergenceException() {
        this(EnumC33910Jv2.CONVERGENCE_FAILED, new Object[0]);
    }

    public ConvergenceException(InterfaceC33442Hv2 interfaceC33442Hv2, Object... objArr) {
        m20425a().m74481a(interfaceC33442Hv2, objArr);
    }
}
