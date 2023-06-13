package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"", "", "beginIndex", "endIndex", "", C17296a.f69688o, "(Ljava/lang/String;II)J", "okio"}, m28431k = 2, m28430mv = {1, 6, 0})
@JvmName(name = "Utf8")
/* renamed from: ki6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44064ki6 {
    @JvmOverloads
    @JvmName(name = "size")
    /* renamed from: a */
    public static final long m28580a(String str, int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        char c;
        Intrinsics.checkNotNullParameter(str, "<this>");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > str.length()) {
                    z3 = false;
                }
                if (z3) {
                    long j = 0;
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            j++;
                        } else {
                            if (charAt < 2048) {
                                i3 = 2;
                            } else if (charAt >= 55296 && charAt <= 57343) {
                                int i4 = i + 1;
                                if (i4 < i2) {
                                    c = str.charAt(i4);
                                } else {
                                    c = 0;
                                }
                                if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                    j += 4;
                                    i += 2;
                                } else {
                                    j++;
                                    i = i4;
                                }
                            } else {
                                i3 = 3;
                            }
                            j += i3;
                        }
                        i++;
                    }
                    return j;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ long m28579b(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m28580a(str, i, i2);
    }
}
