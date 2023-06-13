package p000;

import android.view.KeyEvent;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m28432d2 = {"Lik2;", "", C17296a.f69688o, "(Landroid/view/KeyEvent;)Z", "isTypedEvent", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: p16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46625p16 {
    /* renamed from: a */
    public static final boolean m20142a(KeyEvent isTypedEvent) {
        Intrinsics.checkNotNullParameter(isTypedEvent, "$this$isTypedEvent");
        if (isTypedEvent.getAction() == 0 && isTypedEvent.getUnicodeChar() != 0) {
            return true;
        }
        return false;
    }
}
