package co.bird.android.app.feature.communitymode.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.ComplaintOption;
import co.bird.android.widget.SelectableButton;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+B\u001b\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b*\u0010,B#\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010-\u001a\u00020\u0004¢\u0006\u0004\b*\u0010.J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006J\u0010\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004J\u0014\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002R#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\"0\u001c8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b#\u0010 R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&¨\u0006/"}, m28432d2 = {"Lco/bird/android/app/feature/communitymode/widget/OptionsView;", "Landroid/widget/LinearLayout;", "Lco/bird/android/model/ComplaintOption;", "option", "", "widthDimen", "", C17296a.f69688o, "Landroid/widget/LinearLayout$LayoutParams;", "params", "b", "", "placeholder", "property", "c", "", "show", "i", DateTokenConverter.CONVERTER_KEY, "k", "j", "resId", "setTitle", "visibility", "setTitleVisibility", "Landroid/util/AttributeSet;", "attrs", "g", "", "Lco/bird/android/widget/SelectableButton;", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "buttons", "Landroid/widget/EditText;", "f", "textFields", "Lus6;", "Lus6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOptionsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionsView.kt\nco/bird/android/app/feature/communitymode/widget/OptionsView\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,124:1\n215#2,2:125\n215#2,2:127\n*S KotlinDebug\n*F\n+ 1 OptionsView.kt\nco/bird/android/app/feature/communitymode/widget/OptionsView\n*L\n95#1:125,2\n99#1:127,2\n*E\n"})
/* loaded from: classes2.dex */
public final class OptionsView extends LinearLayout {

    /* renamed from: b */
    public final Map<String, SelectableButton> f61387b;

    /* renamed from: c */
    public final Map<String, EditText> f61388c;

    /* renamed from: d */
    public final C50093us6 f61389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f61387b = new LinkedHashMap();
        this.f61388c = new LinkedHashMap();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C50093us6 m9620b = C50093us6.m9620b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m9620b, "inflate(context.layoutInflater, this)");
        this.f61389d = m9620b;
        setOrientation(1);
        m60712h(this, null, 1, null);
    }

    /* renamed from: h */
    public static /* synthetic */ void m60712h(OptionsView optionsView, AttributeSet attributeSet, int i, Object obj) {
        if ((i & 1) != 0) {
            attributeSet = null;
        }
        optionsView.m60713g(attributeSet);
    }

    /* renamed from: a */
    public final void m60719a(ComplaintOption option, int i) {
        Intrinsics.checkNotNullParameter(option, "option");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(i), -2);
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(C37044Xf4.complaint_button_top_margin);
        m60718b(option, layoutParams);
    }

    /* renamed from: b */
    public final void m60718b(ComplaintOption option, LinearLayout.LayoutParams params) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(params, "params");
        if (this.f61387b.containsKey(option.getValue())) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        SelectableButton selectableButton = new SelectableButton(context);
        selectableButton.setLayoutParams(params);
        selectableButton.setText(option.getLabel());
        selectableButton.setTextColor(NA0.m94301c(selectableButton.getContext(), C32364Df4.black));
        selectableButton.setBackgroundResource(C33309Hg4.button_pill_selector_disabled);
        this.f61389d.f113127e.addView(selectableButton);
        this.f61387b.put(option.getValue(), selectableButton);
    }

    /* renamed from: c */
    public final void m60717c(String placeholder, String property) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(property, "property");
        EditText editText = new EditText(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C37044Xf4.complaint_text_height));
        int dimensionPixelSize = getResources().getDimensionPixelSize(C37044Xf4.complaint_text_margin);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C37044Xf4.complaint_text_padding);
        layoutParams.topMargin = dimensionPixelSize;
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        editText.setLayoutParams(layoutParams);
        editText.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        editText.setHint(placeholder);
        editText.setTextSize(2, 14.0f);
        editText.setBackgroundResource(C52342yg4.edittext_border);
        editText.setGravity(48);
        C49520tu6.m11239l(editText);
        this.f61389d.f113127e.addView(editText);
        this.f61388c.put(property, editText);
    }

    /* renamed from: d */
    public final void m60716d() {
        for (Map.Entry<String, EditText> entry : this.f61388c.entrySet()) {
            entry.getValue().getText().clear();
        }
    }

    /* renamed from: e */
    public final Map<String, SelectableButton> m60715e() {
        return this.f61387b;
    }

    /* renamed from: f */
    public final Map<String, EditText> m60714f() {
        return this.f61388c;
    }

    /* renamed from: g */
    public final void m60713g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34056Kl4.OptionsView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…leable.OptionsView, 0, 0)");
            boolean z = obtainStyledAttributes.getBoolean(C34056Kl4.OptionsView_showCheckmarks, true);
            FrameLayout frameLayout = this.f61389d.f113124b;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.checkContainer");
            C49520tu6.show$default(frameLayout, z, 0, 2, null);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: i */
    public final void m60711i(boolean z) {
        for (Map.Entry<String, EditText> entry : this.f61388c.entrySet()) {
            C49520tu6.show$default(entry.getValue(), z, 0, 2, null);
        }
    }

    /* renamed from: j */
    public final void m60710j() {
        ImageView imageView = this.f61389d.f113126d;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.checkIconGreen");
        ImageView imageView2 = this.f61389d.f113125c;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.checkIconGray");
        C49520tu6.m11245f(imageView, imageView2, 1000L);
    }

    /* renamed from: k */
    public final void m60709k() {
        ImageView imageView = this.f61389d.f113125c;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.checkIconGray");
        ImageView imageView2 = this.f61389d.f113126d;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.checkIconGreen");
        C49520tu6.m11245f(imageView, imageView2, 1000L);
    }

    public final void setTitle(int i) {
        this.f61389d.f113128f.setText(i);
    }

    public final void setTitleVisibility(int i) {
        this.f61389d.f113128f.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f61387b = new LinkedHashMap();
        this.f61388c = new LinkedHashMap();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C50093us6 m9620b = C50093us6.m9620b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m9620b, "inflate(context.layoutInflater, this)");
        this.f61389d = m9620b;
        setOrientation(1);
        m60713g(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f61387b = new LinkedHashMap();
        this.f61388c = new LinkedHashMap();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C50093us6 m9620b = C50093us6.m9620b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m9620b, "inflate(context.layoutInflater, this)");
        this.f61389d = m9620b;
        setOrientation(1);
        m60713g(attributeSet);
    }
}
