package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import com.google.zxing.FormatException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: bi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC38704bi0 {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, Constants.DEFAULT_ENCODING),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");
    

    /* renamed from: E */
    public static final Map<Integer, EnumC38704bi0> f57934E = new HashMap();

    /* renamed from: F */
    public static final Map<String, EnumC38704bi0> f57935F = new HashMap();

    /* renamed from: b */
    public final int[] f57960b;

    /* renamed from: c */
    public final String[] f57961c;

    static {
        EnumC38704bi0[] values;
        for (EnumC38704bi0 enumC38704bi0 : values()) {
            for (int i : enumC38704bi0.f57960b) {
                f57934E.put(Integer.valueOf(i), enumC38704bi0);
            }
            f57935F.put(enumC38704bi0.name(), enumC38704bi0);
            for (String str : enumC38704bi0.f57961c) {
                f57935F.put(str, enumC38704bi0);
            }
        }
    }

    EnumC38704bi0(int i) {
        this(new int[]{i}, new String[0]);
    }

    /* renamed from: a */
    public static EnumC38704bi0 m64112a(String str) {
        return f57935F.get(str);
    }

    /* renamed from: b */
    public static EnumC38704bi0 m64111b(int i) throws FormatException {
        if (i >= 0 && i < 900) {
            return f57934E.get(Integer.valueOf(i));
        }
        throw FormatException.m45945a();
    }

    /* renamed from: c */
    public int m64110c() {
        return this.f57960b[0];
    }

    EnumC38704bi0(int i, String... strArr) {
        this.f57960b = new int[]{i};
        this.f57961c = strArr;
    }

    EnumC38704bi0(int[] iArr, String... strArr) {
        this.f57960b = iArr;
        this.f57961c = strArr;
    }
}
