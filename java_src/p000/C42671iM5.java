package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013\u0088\u0001\u001c\u0092\u0001\u00020\u001bø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m28432d2 = {"LiM5;", "", "LI52;", "diagonals", "", C17296a.f69688o, "([ILI52;)V", "", "h", "([I)I", "startX", "i", "startY", DateTokenConverter.CONVERTER_KEY, "endX", "e", "endY", "", "g", "([I)Z", "reverse", "c", "diagonalSize", "f", "hasAdditionOrRemoval", "j", "isAddition", "", MessageExtension.FIELD_DATA, "b", "([I)[I", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: iM5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42671iM5 {
    /* renamed from: a */
    public static final void m34131a(int[] iArr, I52 diagonals) {
        Intrinsics.checkNotNullParameter(diagonals, "diagonals");
        if (m34126f(iArr)) {
            if (m34125g(iArr)) {
                diagonals.m102986e(m34124h(iArr), m34123i(iArr), m34129c(iArr));
                return;
            } else if (m34122j(iArr)) {
                diagonals.m102986e(m34124h(iArr), m34123i(iArr) + 1, m34129c(iArr));
                return;
            } else {
                diagonals.m102986e(m34124h(iArr) + 1, m34123i(iArr), m34129c(iArr));
                return;
            }
        }
        diagonals.m102986e(m34124h(iArr), m34123i(iArr), m34128d(iArr) - m34124h(iArr));
    }

    /* renamed from: b */
    public static int[] m34130b(int[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: c */
    public static final int m34129c(int[] iArr) {
        return Math.min(m34128d(iArr) - m34124h(iArr), m34127e(iArr) - m34123i(iArr));
    }

    /* renamed from: d */
    public static final int m34128d(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: e */
    public static final int m34127e(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: f */
    public static final boolean m34126f(int[] iArr) {
        return m34127e(iArr) - m34123i(iArr) != m34128d(iArr) - m34124h(iArr);
    }

    /* renamed from: g */
    public static final boolean m34125g(int[] iArr) {
        return iArr[4] != 0;
    }

    /* renamed from: h */
    public static final int m34124h(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: i */
    public static final int m34123i(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: j */
    public static final boolean m34122j(int[] iArr) {
        return m34127e(iArr) - m34123i(iArr) > m34128d(iArr) - m34124h(iArr);
    }
}
