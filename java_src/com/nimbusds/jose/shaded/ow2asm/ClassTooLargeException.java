package com.nimbusds.jose.shaded.ow2asm;
/* loaded from: classes6.dex */
public final class ClassTooLargeException extends IndexOutOfBoundsException {
    private static final long serialVersionUID = 160715609518896765L;

    /* renamed from: b */
    public final String f74973b;

    /* renamed from: c */
    public final int f74974c;

    public ClassTooLargeException(String str, int i) {
        super("Class too large: " + str);
        this.f74973b = str;
        this.f74974c = i;
    }
}
