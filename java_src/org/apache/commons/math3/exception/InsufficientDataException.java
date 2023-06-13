package org.apache.commons.math3.exception;
/* loaded from: classes8.dex */
public class InsufficientDataException extends MathIllegalArgumentException {
    private static final long serialVersionUID = -2629324471511903359L;

    public InsufficientDataException() {
        this(EnumC33910Jv2.INSUFFICIENT_DATA, new Object[0]);
    }

    public InsufficientDataException(InterfaceC33442Hv2 interfaceC33442Hv2, Object... objArr) {
        super(interfaceC33442Hv2, objArr);
    }
}
