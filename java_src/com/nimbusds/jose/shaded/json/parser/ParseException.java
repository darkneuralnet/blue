package com.nimbusds.jose.shaded.json.parser;

import com.amazonaws.services.p026s3.model.InstructionFileId;
/* loaded from: classes6.dex */
public class ParseException extends Exception {
    private static final long serialVersionUID = 8879024178584091857L;

    /* renamed from: b */
    public int f74970b;

    /* renamed from: c */
    public Object f74971c;

    /* renamed from: d */
    public int f74972d;

    public ParseException(int i, int i2, Object obj) {
        super(m45908a(i, i2, obj));
        this.f74972d = i;
        this.f74970b = i2;
        this.f74971c = obj;
    }

    /* renamed from: a */
    public static String m45908a(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            sb.append("Unexpected character (");
            sb.append(obj);
            sb.append(") at position ");
            sb.append(i);
            sb.append(InstructionFileId.DOT);
        } else if (i2 == 1) {
            sb.append("Unexpected token ");
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i);
            sb.append(InstructionFileId.DOT);
        } else if (i2 == 2) {
            sb.append("Unexpected exception ");
            sb.append(obj);
            sb.append(" occur at position ");
            sb.append(i);
            sb.append(InstructionFileId.DOT);
        } else if (i2 == 3) {
            sb.append("Unexpected End Of File position ");
            sb.append(i);
            sb.append(": ");
            sb.append(obj);
        } else if (i2 == 4) {
            sb.append("Unexpected unicode escape sequence ");
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i);
            sb.append(InstructionFileId.DOT);
        } else if (i2 == 5) {
            sb.append("Unexpected duplicate key:");
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i);
            sb.append(InstructionFileId.DOT);
        } else if (i2 == 6) {
            sb.append("Unexpected leading 0 in digit for token:");
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i);
            sb.append(InstructionFileId.DOT);
        } else {
            sb.append("Unkown error at position ");
            sb.append(i);
            sb.append(InstructionFileId.DOT);
        }
        return sb.toString();
    }

    public ParseException(int i, Throwable th) {
        super(m45908a(i, 2, th), th);
        this.f74972d = i;
        this.f74970b = 2;
        this.f74971c = th;
    }
}
