package co.bird.android.widget.standardcomponents;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.widget.standardcomponents.InspectionV3CardView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 02\u00020\u0001:\u00011B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,B\u0019\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b+\u0010-B!\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010.\u001a\u00020 ¢\u0006\u0004\b+\u0010/J\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R(\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010%\u001a\u0004\u0018\u00010 2\b\u0010\u000f\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015¨\u00062"}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/InspectionV3CardView;", "Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;", "Lkotlin/Function1;", "Landroid/view/View;", "", "l", "E", "Landroid/util/AttributeSet;", "attrs", "H", "Lwr6;", "y", "Lwr6;", "binding", "", "value", "z", "Z", "G", "()Z", "setExpanded", "(Z)V", "expanded", "getCampaignVisible", "setCampaignVisible", "campaignVisible", "", "getCampaignTitle", "()Ljava/lang/CharSequence;", "setCampaignTitle", "(Ljava/lang/CharSequence;)V", "campaignTitle", "", "getCampaignColor", "()Ljava/lang/Integer;", "setCampaignColor", "(Ljava/lang/Integer;)V", "campaignColor", "getMutable", "setMutable", "mutable", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "A", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class InspectionV3CardView extends BaseInspectionCardView {

    /* renamed from: A */
    public static final C16705a f68140A = new C16705a(null);

    /* renamed from: B */
    public static final int f68141B = Color.parseColor("#FA5050");

    /* renamed from: y */
    public final C51268wr6 f68142y;

    /* renamed from: z */
    public boolean f68143z;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/InspectionV3CardView$a;", "", "", "CAMPAIGN_STROKE_WIDTH_DP", "I", "DEFAULT_CAMPAIGN_COLOR", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.standardcomponents.InspectionV3CardView$a */
    /* loaded from: classes4.dex */
    public static final class C16705a {
        public /* synthetic */ C16705a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16705a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectionV3CardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_inspection_card_v3, this, true);
        setCardElevation(0.0f);
        C51268wr6 m6216a = C51268wr6.m6216a(this);
        Intrinsics.checkNotNullExpressionValue(m6216a, "bind(this)");
        this.f68142y = m6216a;
    }

    /* renamed from: F */
    public static final void m53954F(Function1 tmp0, View view) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(view);
    }

    /* renamed from: E */
    public final void m53955E(final Function1<? super View, Unit> l) {
        Intrinsics.checkNotNullParameter(l, "l");
        this.f68142y.f116650f.setOnClickListener(new View.OnClickListener() { // from class: Y32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InspectionV3CardView.m53954F(Function1.this, view);
            }
        });
    }

    /* renamed from: G */
    public final boolean m53953G() {
        return this.f68143z;
    }

    /* renamed from: H */
    public final void m53952H(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.InspectionV3CardView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.InspectionV3CardView)");
        try {
            setCampaignVisible(obtainStyledAttributes.getBoolean(C34290Ll4.InspectionV3CardView_campaignVisible, false));
            setCampaignTitle(obtainStyledAttributes.getString(C34290Ll4.InspectionV3CardView_campaignTitle));
            setCampaignColor(Integer.valueOf(obtainStyledAttributes.getColor(C34290Ll4.InspectionV3CardView_campaignColor, f68141B)));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void setCampaignColor(Integer num) {
        if (num != null) {
            num.intValue();
            ColorStateList valueOf = ColorStateList.valueOf(num.intValue());
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(value)");
            this.f68142y.f116647c.setBackgroundTintList(valueOf);
            Drawable mutate = this.f68142y.f116648d.getBackground().mutate();
            Intrinsics.checkNotNull(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            ((GradientDrawable) mutate).setStroke((int) C49347td3.m12002a(1, context), valueOf);
            this.f68142y.f116648d.setBackground(mutate);
        }
    }

    public final void setCampaignTitle(CharSequence charSequence) {
        this.f68142y.f116647c.setText(charSequence);
    }

    public final void setCampaignVisible(boolean z) {
        TextView textView = this.f68142y.f116647c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.campaignBanner");
        C49520tu6.show$default(textView, z, 0, 2, null);
        View view = this.f68142y.f116648d;
        Intrinsics.checkNotNullExpressionValue(view, "binding.campaignBorder");
        C49520tu6.show$default(view, z, 0, 2, null);
    }

    public final void setExpanded(boolean z) {
        float f;
        this.f68143z = z;
        ImageView imageView = this.f68142y.f116650f;
        if (z) {
            f = 270.0f;
        } else {
            f = 90.0f;
        }
        imageView.setRotation(f);
    }

    public final void setMutable(boolean z) {
        this.f68142y.f116653i.setEnabled(z);
        this.f68142y.f116651g.setEnabled(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectionV3CardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_inspection_card_v3, this, true);
        setCardElevation(0.0f);
        C51268wr6 m6216a = C51268wr6.m6216a(this);
        Intrinsics.checkNotNullExpressionValue(m6216a, "bind(this)");
        this.f68142y = m6216a;
        m53952H(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectionV3CardView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_inspection_card_v3, this, true);
        setCardElevation(0.0f);
        C51268wr6 m6216a = C51268wr6.m6216a(this);
        Intrinsics.checkNotNullExpressionValue(m6216a, "bind(this)");
        this.f68142y = m6216a;
        m53952H(attrs);
    }
}
