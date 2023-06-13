package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%B\u001b\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b$\u0010(B#\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b$\u0010*J\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005R\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015¨\u0006+"}, m28432d2 = {"Lco/bird/android/widget/SelectableButtonV2;", "Landroidx/appcompat/widget/AppCompatButton;", "", "background", "color", "", "setSelectedBackgroundAndTextColor", "setDeselectedBackgroundAndTextColor", DateTokenConverter.CONVERTER_KEY, "b", "", "Z", "c", "()Z", "setOptionSelected", "(Z)V", "isOptionSelected", "I", "getSelectedBackgroundResource", "()I", "setSelectedBackgroundResource", "(I)V", "selectedBackgroundResource", "getDeselectedBackgroundResource", "setDeselectedBackgroundResource", "deselectedBackgroundResource", "e", "getSelectedTextColor", "setSelectedTextColor", "selectedTextColor", "f", "getDeselectedTextColor", "setDeselectedTextColor", "deselectedTextColor", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SelectableButtonV2 extends AppCompatButton {

    /* renamed from: b */
    public boolean f67651b;

    /* renamed from: c */
    public int f67652c;

    /* renamed from: d */
    public int f67653d;

    /* renamed from: e */
    public int f67654e;

    /* renamed from: f */
    public int f67655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableButtonV2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67652c = C33309Hg4.button_pill_selector_enabled_black_no_ripple;
        int i = C33309Hg4.button_pill_selector_no_color;
        this.f67653d = i;
        this.f67654e = C32364Df4.white;
        int i2 = C32364Df4.black;
        this.f67655f = i2;
        setBackgroundResource(i);
        setTextColor(NA0.m94301c(getContext(), i2));
        this.f67651b = false;
    }

    /* renamed from: b */
    public final void m54391b() {
        setBackgroundResource(this.f67653d);
        setTextColor(NA0.m94301c(getContext(), this.f67655f));
        this.f67651b = false;
    }

    /* renamed from: c */
    public final boolean m54390c() {
        return this.f67651b;
    }

    /* renamed from: d */
    public final void m54389d() {
        setBackgroundResource(this.f67652c);
        setTextColor(NA0.m94301c(getContext(), this.f67654e));
        this.f67651b = true;
    }

    public final void setDeselectedBackgroundAndTextColor(int i, int i2) {
        this.f67653d = i;
        this.f67655f = i2;
    }

    public final void setDeselectedBackgroundResource(int i) {
        this.f67653d = i;
    }

    public final void setDeselectedTextColor(int i) {
        this.f67655f = i;
    }

    public final void setOptionSelected(boolean z) {
        this.f67651b = z;
    }

    public final void setSelectedBackgroundAndTextColor(int i, int i2) {
        this.f67652c = i;
        this.f67654e = i2;
    }

    public final void setSelectedBackgroundResource(int i) {
        this.f67652c = i;
    }

    public final void setSelectedTextColor(int i) {
        this.f67654e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableButtonV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67652c = C33309Hg4.button_pill_selector_enabled_black_no_ripple;
        int i = C33309Hg4.button_pill_selector_no_color;
        this.f67653d = i;
        this.f67654e = C32364Df4.white;
        int i2 = C32364Df4.black;
        this.f67655f = i2;
        setBackgroundResource(i);
        setTextColor(NA0.m94301c(getContext(), i2));
        this.f67651b = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableButtonV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67652c = C33309Hg4.button_pill_selector_enabled_black_no_ripple;
        int i2 = C33309Hg4.button_pill_selector_no_color;
        this.f67653d = i2;
        this.f67654e = C32364Df4.white;
        int i3 = C32364Df4.black;
        this.f67655f = i3;
        setBackgroundResource(i2);
        setTextColor(NA0.m94301c(getContext(), i3));
        this.f67651b = false;
    }
}
