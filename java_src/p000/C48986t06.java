package p000;

import android.text.Layout;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\r"}, m28432d2 = {"Lt06;", "", "", "value", "Landroid/text/Layout$Alignment;", C17296a.f69688o, "b", "Landroid/text/Layout$Alignment;", "ALIGN_LEFT_FRAMEWORK", "c", "ALIGN_RIGHT_FRAMEWORK", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: t06  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48986t06 {

    /* renamed from: a */
    public static final C48986t06 f109682a = new C48986t06();

    /* renamed from: b */
    public static final Layout.Alignment f109683b;

    /* renamed from: c */
    public static final Layout.Alignment f109684c;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (Intrinsics.areEqual(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.areEqual(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f109683b = alignment;
        f109684c = alignment2;
    }

    private C48986t06() {
    }

    /* renamed from: a */
    public final Layout.Alignment m13253a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return Layout.Alignment.ALIGN_NORMAL;
                        }
                        return f109684c;
                    }
                    return f109683b;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }
}
