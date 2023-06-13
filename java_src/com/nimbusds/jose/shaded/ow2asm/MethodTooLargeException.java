package com.nimbusds.jose.shaded.ow2asm;

import com.amazonaws.services.p026s3.model.InstructionFileId;
/* loaded from: classes6.dex */
public final class MethodTooLargeException extends IndexOutOfBoundsException {
    private static final long serialVersionUID = 6807380416709738314L;

    /* renamed from: b */
    public final String f74975b;

    /* renamed from: c */
    public final String f74976c;

    /* renamed from: d */
    public final String f74977d;

    /* renamed from: e */
    public final int f74978e;

    public MethodTooLargeException(String str, String str2, String str3, int i) {
        super("Method too large: " + str + InstructionFileId.DOT + str2 + " " + str3);
        this.f74975b = str;
        this.f74976c = str2;
        this.f74977d = str3;
        this.f74978e = i;
    }
}
