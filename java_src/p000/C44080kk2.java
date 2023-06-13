package p000;

import android.view.KeyEvent;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\b\u0010\u0005\u001a\u00020\u0004H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, m28432d2 = {"Lik2;", "", C17296a.f69688o, "(Landroid/view/KeyEvent;)Z", "", "b", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: kk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44080kk2 {
    /* renamed from: a */
    public static final boolean m28555a(KeyEvent cancelsTextSelection) {
        Intrinsics.checkNotNullParameter(cancelsTextSelection, "$this$cancelsTextSelection");
        if (cancelsTextSelection.getKeyCode() == 4 && C44673lk2.m26890e(C45266mk2.m25124b(cancelsTextSelection), C44673lk2.f96650a.m26888b())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final void m28554b() {
    }
}
