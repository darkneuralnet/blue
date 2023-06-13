package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, m28432d2 = {"LUx0;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "e", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "f", "getNegativeText", "negativeText", "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ux0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36500Ux0 extends AbstractC5751Ny {

    /* renamed from: d */
    public static final C36500Ux0 f38309d = new C36500Ux0();

    /* renamed from: e */
    public static final Integer f38310e = Integer.valueOf(C45871nl4.smartlock_dialog_confirm_rekey_positive_text);

    /* renamed from: f */
    public static final Integer f38311f = Integer.valueOf(C45871nl4.smartlock_dialog_confirm_rekey_negative_text);

    private C36500Ux0() {
        super(null);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return f38310e;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return f38311f;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.smartlock_dialog_confirm_rekey_message);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…og_confirm_rekey_message)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.smartlock_dialog_confirm_rekey_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…alog_confirm_rekey_title)");
        return string;
    }
}
