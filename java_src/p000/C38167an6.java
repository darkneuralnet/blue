package p000;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RentalPlan;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bh\u0012\u0006\u0010%\u001a\u00020$\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR/\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006("}, m28432d2 = {"Lan6;", "Lw1;", "", "position", "", "bind", "", "isSelected", "j", "", "baseCost", "Ljava/util/Currency;", "currency", "e", "", "helpArticle", "i", "Lkotlin/Function1;", "Lco/bird/android/model/RentalPlan;", "b", "Lkotlin/jvm/functions/Function1;", "onSelected", "c", "itemAt", "Lkotlin/Function0;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function0;", "selectedIndex", "Lkotlin/ParameterName;", "name", "specsLink", "onSpecsClicked", "LZe2;", "f", "LZe2;", "binding", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRentalPlanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RentalPlanAdapter.kt\nco/bird/android/app/feature/longterm/VehiclePlanHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n+ 4 Spans+.kt\nco/bird/android/widget/span/Spans_Kt\n*L\n1#1,115:1\n262#2,2:116\n41#3,2:118\n43#3:123\n6#4,3:120\n*S KotlinDebug\n*F\n+ 1 RentalPlanAdapter.kt\nco/bird/android/app/feature/longterm/VehiclePlanHolder\n*L\n68#1:116,2\n73#1:118,2\n73#1:123\n78#1:120,3\n*E\n"})
/* renamed from: an6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38167an6 extends C29735w1 {

    /* renamed from: b */
    public final Function1<RentalPlan, Unit> f51274b;

    /* renamed from: c */
    public final Function1<Integer, RentalPlan> f51275c;

    /* renamed from: d */
    public final Function0<Integer> f51276d;

    /* renamed from: e */
    public final Function1<String, Unit> f51277e;

    /* renamed from: f */
    public final C37501Ze2 f51278f;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"an6$a", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSpans+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spans+.kt\nco/bird/android/widget/span/Spans_Kt$clickableSpan$1\n+ 2 RentalPlanAdapter.kt\nco/bird/android/app/feature/longterm/VehiclePlanHolder\n*L\n1#1,9:1\n78#2:10\n*E\n"})
    /* renamed from: an6$a */
    /* loaded from: classes2.dex */
    public static final class C10872a extends ClickableSpan {

        /* renamed from: c */
        public final /* synthetic */ String f51280c;

        public C10872a(String str) {
            this.f51280c = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            C38167an6.this.f51277e.invoke(this.f51280c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C38167an6(View view, Function1<? super RentalPlan, Unit> onSelected, Function1<? super Integer, RentalPlan> itemAt, Function0<Integer> selectedIndex, Function1<? super String, Unit> onSpecsClicked) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        Intrinsics.checkNotNullParameter(itemAt, "itemAt");
        Intrinsics.checkNotNullParameter(selectedIndex, "selectedIndex");
        Intrinsics.checkNotNullParameter(onSpecsClicked, "onSpecsClicked");
        this.f51274b = onSelected;
        this.f51275c = itemAt;
        this.f51276d = selectedIndex;
        this.f51277e = onSpecsClicked;
        C37501Ze2 m72829a = C37501Ze2.m72829a(view);
        Intrinsics.checkNotNullExpressionValue(m72829a, "bind(view)");
        this.f51278f = m72829a;
        view.setOnClickListener(new View.OnClickListener() { // from class: Zm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C38167an6.m70724b(C38167an6.this, view2);
            }
        });
    }

    /* renamed from: b */
    public static final void m70724b(C38167an6 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int adapterPosition = this$0.getAdapterPosition();
        if (adapterPosition != -1) {
            this$0.f51274b.invoke(this$0.f51275c.invoke(Integer.valueOf(adapterPosition)));
        }
    }

    @Override // p000.C29735w1
    public void bind(int i) {
        boolean z;
        RentalPlan invoke = this.f51275c.invoke(Integer.valueOf(i));
        if (this.f51276d.invoke().intValue() == i) {
            z = true;
        } else {
            z = false;
        }
        m70721j(z);
        this.f51278f.f48867d.setText(invoke.getBirdModelDisplayName());
        this.f51278f.f48866c.setText(invoke.getDescriptionLabel());
        m70723e(invoke.getBaseCost(), C45097mS5.m25591o(invoke.getCurrency()));
        m70722i(invoke.getSpecsLink());
    }

    /* renamed from: e */
    public final void m70723e(long j, Currency currency) {
        this.f51278f.f48868e.setText(C51916xx1.f118396a.m4408d(j, currency, EnumC36501Ux1.SHOW_ALWAYS));
    }

    /* renamed from: i */
    public final void m70722i(String str) {
        boolean z;
        int i;
        TextView textView = this.f51278f.f48869f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.vehicleSpecs");
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        if (str != null) {
            this.f51278f.f48869f.setMovementMethod(LinkMovementMethod.getInstance());
            TextView textView2 = this.f51278f.f48869f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String m16902c = C47712qr6.m16902c(this, C45871nl4.rental_vehicle_item_specs);
            spannableStringBuilder.append((CharSequence) m16902c);
            spannableStringBuilder.setSpan(new C10872a(str), 0, m16902c.length(), 17);
            textView2.setText(new SpannedString(spannableStringBuilder));
        }
    }

    /* renamed from: j */
    public final void m70721j(boolean z) {
        int i;
        View view = this.itemView;
        if (z) {
            i = C33309Hg4.frame_rectangle_border_rounded_large_radius_purple;
        } else {
            i = C33309Hg4.frame_rectangle_border_rounded_large_radius;
        }
        view.setBackground(C47712qr6.m16903b(this, i));
    }
}
