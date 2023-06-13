package org.apache.commons.math3.exception;
/* loaded from: classes8.dex */
public class ZeroException extends MathIllegalNumberException {
    private static final long serialVersionUID = -1960874856936000015L;

    public ZeroException() {
        this(EnumC33910Jv2.ZERO_NOT_ALLOWED, new Object[0]);
    }

    public ZeroException(InterfaceC33442Hv2 interfaceC33442Hv2, Object... objArr) {
        super(interfaceC33442Hv2, MathIllegalNumberException.f102605d, objArr);
    }
}
