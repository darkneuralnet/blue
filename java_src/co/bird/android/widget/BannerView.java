package co.bird.android.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.Banner;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/widget/BannerView;", "Landroid/widget/LinearLayout;", "Lco/bird/android/model/Banner;", "banner", "", "setBannerStep", "b", "Lco/bird/android/model/Banner;", C17296a.f69688o, "()Lco/bird/android/model/Banner;", "setBanner", "(Lco/bird/android/model/Banner;)V", "LGp6;", "c", "LGp6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BannerView extends LinearLayout {

    /* renamed from: b */
    public Banner f67133b;

    /* renamed from: c */
    public final C33158Gp6 f67134c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BannerView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final Banner m54774a() {
        return this.f67133b;
    }

    public final void setBanner(Banner banner) {
        Intrinsics.checkNotNullParameter(banner, "<set-?>");
        this.f67133b = banner;
    }

    public final void setBannerStep(Banner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.f67133b = banner;
        Integer icon = banner.icon();
        if (icon != null) {
            this.f67134c.f12513b.setCompoundDrawablesWithIntrinsicBounds(NA0.m94299e(getContext(), icon.intValue()), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            this.f67134c.f12513b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        TextView textView = this.f67134c.f12513b;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        textView.setTextColor(C40788fB0.m41776f(context, banner.textColor()));
        Integer text = banner.getText();
        if (text != null) {
            this.f67134c.f12513b.setText(text.intValue());
        }
        if (banner == Banner.HOW_TO_RIDE) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setBackground(C40788fB0.m41773i(context2, C47600qg4.background_landing));
            return;
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        setBackgroundColor(C40788fB0.m41776f(context3, banner.backgroundColor()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67133b = Banner.NONE;
        C33158Gp6 m104690b = C33158Gp6.m104690b(C40788fB0.m41772j(context), this);
        Intrinsics.checkNotNullExpressionValue(m104690b, "inflate(context.layoutInflater, this)");
        this.f67134c = m104690b;
        setOrientation(1);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843534, typedValue, true);
        setForeground(NA0.m94299e(context, typedValue.resourceId));
    }
}
