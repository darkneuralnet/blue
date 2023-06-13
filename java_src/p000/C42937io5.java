package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.persistence.ScrapOrderView;
import co.bird.android.model.persistence.nestedstructures.OrderItemViewDetail;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\r0\r0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"Lio5;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "", "q6", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "scrapOrderClicksRelay", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: io5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42937io5 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<String> f91293c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lio5$a;", "Lw1;", "", "position", "", "bind", "Lzf2;", "b", "Lzf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lio5;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapOrderOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewAdapter.kt\nco/bird/android/feature/transferorder/scrap/overview/adapters/ScrapOrderOverviewAdapter$DetailsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n18#2:84\n9#3,4:85\n1864#4,3:89\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewAdapter.kt\nco/bird/android/feature/transferorder/scrap/overview/adapters/ScrapOrderOverviewAdapter$DetailsViewHolder\n*L\n60#1:84\n60#1:85,4\n62#1:89,3\n*E\n"})
    /* renamed from: io5$a */
    /* loaded from: classes3.dex */
    public final class C24580a extends C29735w1 {

        /* renamed from: b */
        public final C52923zf2 f91294b;

        /* renamed from: c */
        public final /* synthetic */ C42937io5 f91295c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: io5$a$a */
        /* loaded from: classes3.dex */
        public static final class C24581a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42937io5 f91296g;

            /* renamed from: h */
            public final /* synthetic */ ScrapOrderView f91297h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24581a(C42937io5 c42937io5, ScrapOrderView scrapOrderView) {
                super(1);
                this.f91296g = c42937io5;
                this.f91297h = scrapOrderView;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f91296g.f91293c.accept(this.f91297h.getOrderId());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24580a(C42937io5 c42937io5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f91295c = c42937io5;
            C52923zf2 m611a = C52923zf2.m611a(view);
            Intrinsics.checkNotNullExpressionValue(m611a, "bind(view)");
            this.f91294b = m611a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            int m94301c;
            boolean z;
            Object m105816c = this.f91295c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof ScrapOrderView)) {
                m105816c = null;
            }
            ScrapOrderView scrapOrderView = (ScrapOrderView) m105816c;
            if (scrapOrderView != null) {
                C42937io5 c42937io5 = this.f91295c;
                this.f91294b.getRoot().removeAllViews();
                int i2 = 0;
                for (Object obj : scrapOrderView.getDetails()) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    OrderItemViewDetail orderItemViewDetail = (OrderItemViewDetail) obj;
                    C52330yf2 m3010c = C52330yf2.m3010c(LayoutInflater.from(this.f91294b.getRoot().getContext()));
                    m3010c.f119944b.setText(orderItemViewDetail.getDetail());
                    TextView textView = m3010c.f119944b;
                    Integer color = orderItemViewDetail.getColor();
                    if (color != null) {
                        m94301c = color.intValue();
                    } else {
                        m94301c = NA0.m94301c(this.f91294b.getRoot().getContext(), C32364Df4.primaryText);
                    }
                    textView.setTextColor(m94301c);
                    TextView textView2 = m3010c.f119945c;
                    Intrinsics.checkNotNullExpressionValue(textView2, "this.view");
                    if (i3 == ((int) Math.ceil(scrapOrderView.getDetails().size() / 2.0d))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C49520tu6.show$default(textView2, z, 0, 2, null);
                    TextView textView3 = m3010c.f119945c;
                    Intrinsics.checkNotNullExpressionValue(textView3, "this.view");
                    C34585Ms2.m94661j(textView3, new C24581a(c42937io5, scrapOrderView));
                    Intrinsics.checkNotNullExpressionValue(m3010c, "inflate(LayoutInflater.f…          }\n            }");
                    this.f91294b.getRoot().addView(m3010c.getRoot());
                    i2 = i3;
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lio5$b;", "Lw1;", "", "position", "", "bind", "LAf2;", "b", "LAf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lio5;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapOrderOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewAdapter.kt\nco/bird/android/feature/transferorder/scrap/overview/adapters/ScrapOrderOverviewAdapter$VehicleCountViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,83:1\n18#2:84\n9#3,4:85\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewAdapter.kt\nco/bird/android/feature/transferorder/scrap/overview/adapters/ScrapOrderOverviewAdapter$VehicleCountViewHolder\n*L\n50#1:84\n50#1:85,4\n*E\n"})
    /* renamed from: io5$b */
    /* loaded from: classes3.dex */
    public final class C24582b extends C29735w1 {

        /* renamed from: b */
        public final C31660Af2 f91298b;

        /* renamed from: c */
        public final /* synthetic */ C42937io5 f91299c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24582b(C42937io5 c42937io5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f91299c = c42937io5;
            C31660Af2 m115410a = C31660Af2.m115410a(view);
            Intrinsics.checkNotNullExpressionValue(m115410a, "bind(view)");
            this.f91298b = m115410a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f91299c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Integer)) {
                m105816c = null;
            }
            Integer num = (Integer) m105816c;
            if (num != null) {
                this.f91298b.f909b.setText(String.valueOf(num.intValue()));
            }
        }
    }

    public C42937io5() {
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f91293c = m25409g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C44123ko5());
        }
    }

    /* renamed from: q6 */
    public final Observable<String> m31853q6() {
        Observable<String> hide = this.f91293c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scrapOrderClicksRelay.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_scrap_order_overview_vehicle_count ? new C24582b(this, m41761u) : i == C35442Qj4.item_scrap_order_details ? new C24580a(this, m41761u) : new C29735w1(m41761u);
    }
}
