package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C33918Jw1;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000\"\u0018\u0010\u000e\u001a\u00020\u0000*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"LJw1;", "fontWeight", "LEw1;", "fontStyle", "", "c", "(LJw1;I)I", "", "isBold", "isItalic", "b", "LJw1$a;", C17296a.f69688o, "(LJw1$a;)LJw1;", "AndroidBold", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Mc */
/* loaded from: classes.dex */
public final class C5319Mc {
    /* renamed from: a */
    public static final C33918Jw1 m95137a(C33918Jw1.C4281a c4281a) {
        Intrinsics.checkNotNullParameter(c4281a, "<this>");
        return c4281a.m99536h();
    }

    /* renamed from: b */
    public static final int m95136b(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    /* renamed from: c */
    public static final int m95135c(C33918Jw1 fontWeight, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        if (fontWeight.compareTo(m95137a(C33918Jw1.f18784c)) >= 0) {
            z = true;
        } else {
            z = false;
        }
        return m95136b(z, C32748Ew1.m108206f(i, C32748Ew1.f8309b.m108202a()));
    }
}
