package co.bird.android.feature.filters.operator.p012v2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.FilterLogicToggleOption;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001d\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\f\u0010\u0010B'\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/filters/operator/v2/view/LogicOperatorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lco/bird/android/model/constant/FilterLogicToggleOption;", TransferTable.COLUMN_STATE, "", "e", "LMr6;", "b", "LMr6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.filters.operator.v2.view.LogicOperatorView */
/* loaded from: classes3.dex */
public final class LogicOperatorView extends ConstraintLayout {

    /* renamed from: b */
    public final C34580Mr6 f63922b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.filters.operator.v2.view.LogicOperatorView$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C14792a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilterLogicToggleOption.values().length];
            try {
                iArr[FilterLogicToggleOption.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterLogicToggleOption.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogicOperatorView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C37539Zi4.view_logic_operator, this);
        C34580Mr6 m94674a = C34580Mr6.m94674a(this);
        Intrinsics.checkNotNullExpressionValue(m94674a, "bind(this)");
        this.f63922b = m94674a;
    }

    /* renamed from: e */
    public final void m58226e(FilterLogicToggleOption state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = C14792a.$EnumSwitchMapping$0[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.f63922b.f23686d.setText(getContext().getString(C45871nl4.or_capitalized));
                this.f63922b.f23685c.setImageDrawable(NA0.m94299e(getContext(), C48193rg4.ic_filter_or_white));
                return;
            }
            return;
        }
        this.f63922b.f23686d.setText(getContext().getString(C45871nl4.and_capitalized));
        this.f63922b.f23685c.setImageDrawable(NA0.m94299e(getContext(), C48193rg4.ic_filter_and_white));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogicOperatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C37539Zi4.view_logic_operator, this);
        C34580Mr6 m94674a = C34580Mr6.m94674a(this);
        Intrinsics.checkNotNullExpressionValue(m94674a, "bind(this)");
        this.f63922b = m94674a;
    }

    public /* synthetic */ LogicOperatorView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogicOperatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C37539Zi4.view_logic_operator, this);
        C34580Mr6 m94674a = C34580Mr6.m94674a(this);
        Intrinsics.checkNotNullExpressionValue(m94674a, "bind(this)");
        this.f63922b = m94674a;
    }

    public /* synthetic */ LogicOperatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
