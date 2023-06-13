package p000;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m28432d2 = {"LiM4;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LgM4;", PaymentSheetEvent.FIELD_FONT, "Landroid/graphics/Typeface;", C17296a.f69688o, "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iM4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42670iM4 {

    /* renamed from: a */
    public static final C42670iM4 f87198a = new C42670iM4();

    private C42670iM4() {
    }

    /* renamed from: a */
    public final Typeface m34132a(Context context, C41484gM4 font) {
        Typeface font2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        font2 = context.getResources().getFont(font.m39572d());
        Intrinsics.checkNotNullExpressionValue(font2, "context.resources.getFont(font.resId)");
        return font2;
    }
}
