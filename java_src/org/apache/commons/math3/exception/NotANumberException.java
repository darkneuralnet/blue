package org.apache.commons.math3.exception;
/* loaded from: classes8.dex */
public class NotANumberException extends MathIllegalNumberException {
    private static final long serialVersionUID = 20120906;

    public NotANumberException() {
        super(EnumC33910Jv2.NAN_NOT_ALLOWED, Double.valueOf(Double.NaN), new Object[0]);
    }
}
