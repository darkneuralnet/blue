package p000;
/* renamed from: NU2 */
/* loaded from: classes6.dex */
public enum NU2 {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: b */
    public final int[] f24648b;

    /* renamed from: c */
    public final int f24649c;

    NU2(int[] iArr, int i) {
        this.f24648b = iArr;
        this.f24649c = i;
    }

    /* renamed from: a */
    public static NU2 m93860a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 7) {
                                    if (i != 8) {
                                        if (i != 9) {
                                            if (i == 13) {
                                                return HANZI;
                                            }
                                            throw new IllegalArgumentException();
                                        }
                                        return FNC1_SECOND_POSITION;
                                    }
                                    return KANJI;
                                }
                                return ECI;
                            }
                            return FNC1_FIRST_POSITION;
                        }
                        return BYTE;
                    }
                    return STRUCTURED_APPEND;
                }
                return ALPHANUMERIC;
            }
            return NUMERIC;
        }
        return TERMINATOR;
    }

    /* renamed from: b */
    public int m93859b() {
        return this.f24649c;
    }

    /* renamed from: c */
    public int m93858c(C32447Do6 c32447Do6) {
        char c;
        int m109906j = c32447Do6.m109906j();
        if (m109906j <= 9) {
            c = 0;
        } else if (m109906j <= 26) {
            c = 1;
        } else {
            c = 2;
        }
        return this.f24648b[c];
    }
}
