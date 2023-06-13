package co.bird.android.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000e\u0010\u0012B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u000e\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/widget/FrequentFlyerScannerView;", "Landroid/widget/LinearLayout;", "", "title", "Landroid/graphics/drawable/Drawable;", "progress", "", C17296a.f69688o, "Lyt6;", "b", "Lyt6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class FrequentFlyerScannerView extends LinearLayout {

    /* renamed from: b */
    public final C52474yt6 f67356b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequentFlyerScannerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C52474yt6 m2320b = C52474yt6.m2320b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m2320b, "inflate(context.layoutInflater, this)");
        this.f67356b = m2320b;
    }

    /* renamed from: a */
    public final void m54567a(String str, Drawable progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f67356b.f120372b.setText(str);
        this.f67356b.f120373c.setProgressDrawable(progress);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequentFlyerScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C52474yt6 m2320b = C52474yt6.m2320b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m2320b, "inflate(context.layoutInflater, this)");
        this.f67356b = m2320b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequentFlyerScannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C52474yt6 m2320b = C52474yt6.m2320b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m2320b, "inflate(context.layoutInflater, this)");
        this.f67356b = m2320b;
    }
}
