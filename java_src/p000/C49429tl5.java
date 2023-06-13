package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"Ltl5;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tl5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49429tl5 extends AbstractC5751Ny {

    /* renamed from: d */
    public static final C49429tl5 f110985d = new C49429tl5();

    private C49429tl5() {
        super(null);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.scan_bird_unavailable_to_guest_content);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ailable_to_guest_content)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.scan_bird_unavailable_to_guest_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…available_to_guest_title)");
        return string;
    }
}