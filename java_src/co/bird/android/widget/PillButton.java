package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,B\u001b\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b+\u0010/B#\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b+\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\bR(\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001f\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR(\u0010\"\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR$\u0010(\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00063"}, m28432d2 = {"Lco/bird/android/widget/PillButton;", "Landroid/widget/RelativeLayout;", "", "elevation", "", "setElevation", "Landroid/view/View;", "b", "Landroid/view/View;", "pillMain", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "mainTitle", DateTokenConverter.CONVERTER_KEY, "secondaryTitle", "e", "secondarySubtitle", "f", "secondaryTextContainer", "g", "pillDivider", "", "value", "getMainTitleText", "()Ljava/lang/CharSequence;", "setMainTitleText", "(Ljava/lang/CharSequence;)V", "mainTitleText", "getSecondaryTitleText", "setSecondaryTitleText", "secondaryTitleText", "getSecondarySubtitleText", "setSecondarySubtitleText", "secondarySubtitleText", "", "getSecondaryTextVisible", "()Z", "setSecondaryTextVisible", "(Z)V", "secondaryTextVisible", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPillButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PillButton.kt\nco/bird/android/widget/PillButton\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,65:1\n260#2:66\n262#2,2:67\n262#2,2:69\n*S KotlinDebug\n*F\n+ 1 PillButton.kt\nco/bird/android/widget/PillButton\n*L\n55#1:66\n57#1:67,2\n58#1:69,2\n*E\n"})
/* loaded from: classes4.dex */
public final class PillButton extends RelativeLayout {

    /* renamed from: b */
    public final View f67504b;

    /* renamed from: c */
    public final TextView f67505c;

    /* renamed from: d */
    public final TextView f67506d;

    /* renamed from: e */
    public final TextView f67507e;

    /* renamed from: f */
    public final View f67508f;

    /* renamed from: g */
    public final View f67509g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PillButton(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C45268mk4.view_pill_button, this);
        this.f67504b = C49520tu6.m11243h(this, C52955zi4.pillMain);
        this.f67505c = (TextView) C49520tu6.m11243h(this, C52955zi4.mainTitleText);
        this.f67506d = (TextView) C49520tu6.m11243h(this, C52955zi4.secondaryTitle);
        this.f67507e = (TextView) C49520tu6.m11243h(this, C52955zi4.secondarySubtitle);
        this.f67508f = C49520tu6.m11243h(this, C52955zi4.secondaryTextContainer);
        this.f67509g = C49520tu6.m11243h(this, C52955zi4.pillDivider);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        View view = this.f67504b;
        if (view == null) {
            return;
        }
        view.setElevation(f);
    }

    public final void setMainTitleText(CharSequence charSequence) {
        this.f67505c.setText(charSequence);
    }

    public final void setSecondarySubtitleText(CharSequence charSequence) {
        this.f67507e.setText(charSequence);
    }

    public final void setSecondaryTextVisible(boolean z) {
        int i;
        View view = this.f67508f;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = this.f67509g;
        if (!z) {
            i2 = 8;
        }
        view2.setVisibility(i2);
    }

    public final void setSecondaryTitleText(CharSequence charSequence) {
        this.f67506d.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PillButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C45268mk4.view_pill_button, this);
        this.f67504b = C49520tu6.m11243h(this, C52955zi4.pillMain);
        this.f67505c = (TextView) C49520tu6.m11243h(this, C52955zi4.mainTitleText);
        this.f67506d = (TextView) C49520tu6.m11243h(this, C52955zi4.secondaryTitle);
        this.f67507e = (TextView) C49520tu6.m11243h(this, C52955zi4.secondarySubtitle);
        this.f67508f = C49520tu6.m11243h(this, C52955zi4.secondaryTextContainer);
        this.f67509g = C49520tu6.m11243h(this, C52955zi4.pillDivider);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PillButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C45268mk4.view_pill_button, this);
        this.f67504b = C49520tu6.m11243h(this, C52955zi4.pillMain);
        this.f67505c = (TextView) C49520tu6.m11243h(this, C52955zi4.mainTitleText);
        this.f67506d = (TextView) C49520tu6.m11243h(this, C52955zi4.secondaryTitle);
        this.f67507e = (TextView) C49520tu6.m11243h(this, C52955zi4.secondarySubtitle);
        this.f67508f = C49520tu6.m11243h(this, C52955zi4.secondaryTextContainer);
        this.f67509g = C49520tu6.m11243h(this, C52955zi4.pillDivider);
    }
}
