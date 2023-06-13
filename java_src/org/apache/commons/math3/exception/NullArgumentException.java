package org.apache.commons.math3.exception;
/* loaded from: classes8.dex */
public class NullArgumentException extends MathIllegalArgumentException {
    private static final long serialVersionUID = -6024911025449780478L;

    public NullArgumentException() {
        this(EnumC33910Jv2.NULL_NOT_ALLOWED, new Object[0]);
    }

    public NullArgumentException(InterfaceC33442Hv2 interfaceC33442Hv2, Object... objArr) {
        super(interfaceC33442Hv2, objArr);
    }
}
