package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\"(\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\" \u0010\u0019\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"", "i", "", "e", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "value", "", "c", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/Boolean;", "", C17296a.f69688o, "[Ljava/lang/String;", "b", "()[Ljava/lang/String;", "getESCAPE_STRINGS$annotations", "()V", "ESCAPE_STRINGS", "", "[B", "()[B", "getESCAPE_MARKERS$annotations", "ESCAPE_MARKERS", "kotlinx-serialization-json"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: aS5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C37964aS5 {

    /* renamed from: a */
    public static final String[] f50496a;

    /* renamed from: b */
    public static final byte[] f50497b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + m71348e(i >> 12) + m71348e(i >> 8) + m71348e(i >> 4) + m71348e(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f50496a = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f50497b = bArr;
    }

    /* renamed from: a */
    public static final byte[] m71352a() {
        return f50497b;
    }

    /* renamed from: b */
    public static final String[] m71351b() {
        return f50496a;
    }

    /* renamed from: c */
    public static final void m71350c(StringBuilder sb, String value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb.append('\"');
        int length = value.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = value.charAt(i2);
            String[] strArr = f50496a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) value, i, i2);
                sb.append(strArr[charAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) value, i, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    /* renamed from: d */
    public static final Boolean m71349d(String str) {
        boolean equals;
        boolean equals2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        equals = StringsKt__StringsJVMKt.equals(str, "true", true);
        if (equals) {
            return Boolean.TRUE;
        }
        equals2 = StringsKt__StringsJVMKt.equals(str, "false", true);
        if (equals2) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: e */
    public static final char m71348e(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : (i2 - 10) + 97);
    }
}
