package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, m28432d2 = {"LMw2;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "e", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "f", "Ljava/lang/Integer;", "getNegativeText", "negativeText", "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mw2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34621Mw2 extends AbstractC5751Ny {

    /* renamed from: d */
    public static final C34621Mw2 f23858d = new C34621Mw2();

    /* renamed from: e */
    public static final int f23859e = C45871nl4.turn_on_action;

    /* renamed from: f */
    public static final Integer f23860f = Integer.valueOf(C45871nl4.location_dialog_close);

    private C34621Mw2() {
        super(null);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(f23859e);
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return f23860f;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.location_dialog_message);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri….location_dialog_message)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.location_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.location_dialog_title)");
        return string;
    }
}