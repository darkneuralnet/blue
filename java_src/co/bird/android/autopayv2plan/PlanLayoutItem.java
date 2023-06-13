package co.bird.android.autopayv2plan;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PlanItemDescription;
import co.bird.android.model.PlanItemModel;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0005B/\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/autopayv2plan/PlanLayoutItem;", "Landroid/widget/RelativeLayout;", "Lco/bird/android/model/PlanItemModel;", "b", "", C17296a.f69688o, "", "selected", "", "c", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", RequestHeadersFactory.MODEL, DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/PlanItemModel;", "LaV3;", "LaV3;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILco/bird/android/model/PlanItemModel;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlanLayoutItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanLayoutItem.kt\nco/bird/android/autopayv2plan/PlanLayoutItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
/* loaded from: classes2.dex */
public final class PlanLayoutItem extends RelativeLayout {

    /* renamed from: d */
    public static final C14425a f63004d = new C14425a(null);

    /* renamed from: b */
    public PlanItemModel f63005b;

    /* renamed from: c */
    public final C37989aV3 f63006c;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lco/bird/android/autopayv2plan/PlanLayoutItem$a;", "", "", "MAX_WIDTH_SP", "F", "", "PADDING_BOTTOM_DP", "I", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.autopayv2plan.PlanLayoutItem$a */
    /* loaded from: classes2.dex */
    public static final class C14425a {
        public /* synthetic */ C14425a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14425a() {
        }
    }

    public /* synthetic */ PlanLayoutItem(Context context, AttributeSet attributeSet, int i, PlanItemModel planItemModel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, planItemModel);
    }

    /* renamed from: a */
    public final String m59111a() {
        PlanItemModel planItemModel = this.f63005b;
        if (planItemModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RequestHeadersFactory.MODEL);
            planItemModel = null;
        }
        return planItemModel.getPlanId();
    }

    /* renamed from: b */
    public final PlanItemModel m59110b() {
        PlanItemModel planItemModel = this.f63005b;
        if (planItemModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RequestHeadersFactory.MODEL);
            return null;
        }
        return planItemModel;
    }

    /* renamed from: c */
    public final void m59109c(boolean z) {
        boolean z2;
        if (z) {
            CharSequence text = this.f63006c.f50574d.getText();
            if (text != null && text.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                this.f63006c.f50574d.setVisibility(0);
                return;
            }
        }
        this.f63006c.f50574d.setVisibility(4);
    }

    /* renamed from: d */
    public final void m59108d(PlanItemModel planItemModel) {
        String str;
        this.f63005b = planItemModel;
        Currency m25591o = C45097mS5.m25591o(planItemModel.getCurrency());
        TextView textView = this.f63006c.f50572b;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        EnumC36501Ux1 enumC36501Ux1 = EnumC36501Ux1.SHOW_IF_NON_ZERO;
        textView.setText(c51916xx1.m4408d(planItemModel.getRefillAmount(), m25591o, enumC36501Ux1));
        TextView textView2 = this.f63006c.f50574d;
        PlanItemDescription planItemDescription = planItemModel.getPlanItemDescription();
        if (planItemDescription != null) {
            str = getContext().getString(planItemDescription.getText());
        } else {
            str = null;
        }
        textView2.setText(str);
        Integer incentiveAmount = planItemModel.getIncentiveAmount();
        if (incentiveAmount != null && incentiveAmount.intValue() == 0) {
            this.f63006c.f50573c.setText(getContext().getString(C45871nl4.autopay_v2_plan_no_bonus_label));
        } else if (planItemModel.getIncentiveAmount() != null) {
            TextView textView3 = this.f63006c.f50573c;
            Context context = getContext();
            int i = C45871nl4.autopay_v2_plan_bonus_label;
            Integer incentiveAmount2 = planItemModel.getIncentiveAmount();
            Intrinsics.checkNotNull(incentiveAmount2);
            textView3.setText(context.getString(i, c51916xx1.m4408d(incentiveAmount2.intValue(), m25591o, enumC36501Ux1)));
        } else {
            TextView textView4 = this.f63006c.f50573c;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.planIncentiveAmount");
            C49520tu6.m11232s(textView4, false, 4);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        setMeasuredDimension(Math.min(getMeasuredWidth(), (int) C40788fB0.m41757y(context, 125.0f)), getMeasuredHeight());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PlanLayoutItem(Context context, AttributeSet attributeSet, int i, PlanItemModel model) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        C37989aV3 m71277b = C37989aV3.m71277b(C40788fB0.m41772j(context), this);
        Intrinsics.checkNotNullExpressionValue(m71277b, "inflate(context.layoutInflater, this)");
        this.f63006c = m71277b;
        setBackground(NA0.m94299e(context, C33309Hg4.plan_layout_tab_item_bg));
        setPaddingRelative(0, 0, 0, (int) C49347td3.m12001b(30));
        m59108d(model);
    }
}
