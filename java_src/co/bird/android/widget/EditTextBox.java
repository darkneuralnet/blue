package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015B!\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/widget/EditTextBox;", "Landroidx/appcompat/widget/AppCompatEditText;", "", "extraSpace", "", "onCreateDrawableState", "", "value", "b", "Z", "getError", "()Z", "setError", "(Z)V", "error", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "c", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class EditTextBox extends AppCompatEditText {

    /* renamed from: c */
    public static final C16505a f67332c = new C16505a(null);

    /* renamed from: d */
    public static final int[] f67333d = {C48183rf4.state_error};

    /* renamed from: b */
    public boolean f67334b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/EditTextBox$a;", "", "", "ERROR_STATE_LIST", "[I", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.EditTextBox$a */
    /* loaded from: classes4.dex */
    public static final class C16505a {
        public /* synthetic */ C16505a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16505a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextBox(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_horizontal_margin);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setBackground(NA0.m94299e(getContext(), C33309Hg4.service_center_edit_text_background));
        setInputType(getInputType() | DateUtils.FORMAT_NUMERIC_DATE | DateUtils.FORMAT_ABBREV_WEEKDAY | 16384);
        setGravity(8388659);
        setTextAppearance(C32184Cl4.TextAppearance_Caption);
        setHintTextColor(NA0.m94300d(getContext(), C32364Df4.service_center_edit_text_hint_state_list));
        setTextColor(NA0.m94300d(getContext(), C32364Df4.primary_text_state_list));
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] drawableState = super.onCreateDrawableState(i + 1);
        if (this.f67334b) {
            View.mergeDrawableStates(drawableState, f67333d);
        }
        Intrinsics.checkNotNullExpressionValue(drawableState, "drawableState");
        return drawableState;
    }

    public final void setError(boolean z) {
        this.f67334b = z;
        refreshDrawableState();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_horizontal_margin);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setBackground(NA0.m94299e(getContext(), C33309Hg4.service_center_edit_text_background));
        setInputType(getInputType() | DateUtils.FORMAT_NUMERIC_DATE | DateUtils.FORMAT_ABBREV_WEEKDAY | 16384);
        setGravity(8388659);
        setTextAppearance(C32184Cl4.TextAppearance_Caption);
        setHintTextColor(NA0.m94300d(getContext(), C32364Df4.service_center_edit_text_hint_state_list));
        setTextColor(NA0.m94300d(getContext(), C32364Df4.primary_text_state_list));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextBox(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_horizontal_margin);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setBackground(NA0.m94299e(getContext(), C33309Hg4.service_center_edit_text_background));
        setInputType(getInputType() | DateUtils.FORMAT_NUMERIC_DATE | DateUtils.FORMAT_ABBREV_WEEKDAY | 16384);
        setGravity(8388659);
        setTextAppearance(C32184Cl4.TextAppearance_Caption);
        setHintTextColor(NA0.m94300d(getContext(), C32364Df4.service_center_edit_text_hint_state_list));
        setTextColor(NA0.m94300d(getContext(), C32364Df4.primary_text_state_list));
    }
}
