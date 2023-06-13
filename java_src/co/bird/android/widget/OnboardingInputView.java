package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.OnboardingInput;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006$"}, m28432d2 = {"Lco/bird/android/widget/OnboardingInputView;", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title", "Lcom/google/android/material/textfield/TextInputEditText;", "c", "Lcom/google/android/material/textfield/TextInputEditText;", "getEditor", "()Lcom/google/android/material/textfield/TextInputEditText;", "editor", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "getEnterButton", "()Landroid/widget/Button;", "enterButton", "Lco/bird/android/model/OnboardingInput;", "e", "Lco/bird/android/model/OnboardingInput;", "getInput", "()Lco/bird/android/model/OnboardingInput;", "setInput", "(Lco/bird/android/model/OnboardingInput;)V", "input", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class OnboardingInputView extends LinearLayout {

    /* renamed from: b */
    public final TextView f67425b;

    /* renamed from: c */
    public final TextInputEditText f67426c;

    /* renamed from: d */
    public final Button f67427d;

    /* renamed from: e */
    public OnboardingInput f67428e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OnboardingInputView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setInput(OnboardingInput onboardingInput) {
        Intrinsics.checkNotNullParameter(onboardingInput, "<set-?>");
        this.f67428e = onboardingInput;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OnboardingInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OnboardingInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67428e = OnboardingInput.EMAIL;
        LayoutInflater.from(context).inflate(C45268mk4.view_onboarding_input, this);
        this.f67425b = (TextView) C49520tu6.m11243h(this, C52955zi4.inputTitle);
        this.f67426c = (TextInputEditText) C49520tu6.m11243h(this, C52955zi4.inputEditor);
        this.f67427d = (Button) C49520tu6.m11243h(this, C52955zi4.inputButton);
    }

    public /* synthetic */ OnboardingInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
