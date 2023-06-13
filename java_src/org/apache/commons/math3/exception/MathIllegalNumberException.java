package org.apache.commons.math3.exception;
/* loaded from: classes8.dex */
public class MathIllegalNumberException extends MathIllegalArgumentException {

    /* renamed from: d */
    public static final Integer f102605d = 0;
    private static final long serialVersionUID = -7447085893598031110L;

    /* renamed from: c */
    public final Number f102606c;

    public MathIllegalNumberException(InterfaceC33442Hv2 interfaceC33442Hv2, Number number, Object... objArr) {
        super(interfaceC33442Hv2, number, objArr);
        this.f102606c = number;
    }
}
