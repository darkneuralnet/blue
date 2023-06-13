package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC36392Ul0;
import p000.AbstractC40765f86;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bJ\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\t0\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000b0\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u001a"}, m28432d2 = {"LiC5;", "Lf86;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/Observable;", "", "y", "", "A", "LF6;", "r", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "skuOrderClicksSubject", "e", "vehiclesInOrderClickSubject", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iC5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42581iC5 extends AbstractC40765f86 {

    /* renamed from: d */
    public final C24558d<Unit> f86936d;

    /* renamed from: e */
    public final C24558d<String> f86937e;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"LiC5$a;", "Lf86$b;", "Lf86;", "Landroid/view/View;", "view", "<init>", "(LiC5;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: iC5$a */
    /* loaded from: classes3.dex */
    public final class C23156a extends AbstractC40765f86.C20236b {

        /* renamed from: d */
        public final /* synthetic */ C42581iC5 f86938d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: iC5$a$a */
        /* loaded from: classes3.dex */
        public static final class C23157a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42581iC5 f86939g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23157a(C42581iC5 c42581iC5) {
                super(1);
                this.f86939g = c42581iC5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f86939g.f86936d.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23156a(C42581iC5 c42581iC5, View view) {
            super(c42581iC5, view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f86938d = c42581iC5;
            TextView textView = m41957a().f96425b;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.ctaButton");
            C34585Ms2.m94661j(textView, new C23157a(c42581iC5));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"LiC5$b;", "Lw1;", "Lgg2;", "b", "Lgg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LiC5;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: iC5$b */
    /* loaded from: classes3.dex */
    public final class C23158b extends C29735w1 {

        /* renamed from: b */
        public final C41668gg2 f86940b;

        /* renamed from: c */
        public final /* synthetic */ C42581iC5 f86941c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nSkuOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/sku/adapters/SkuOrderDetailsAdapter$VehiclesInOrderViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n18#2:64\n9#3,4:65\n1#4:69\n*S KotlinDebug\n*F\n+ 1 SkuOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/sku/adapters/SkuOrderDetailsAdapter$VehiclesInOrderViewHolder$1\n*L\n53#1:64\n53#1:65,4\n*E\n"})
        /* renamed from: iC5$b$a */
        /* loaded from: classes3.dex */
        public static final class C23159a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42581iC5 f86942g;

            /* renamed from: h */
            public final /* synthetic */ C23158b f86943h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23159a(C42581iC5 c42581iC5, C23158b c23158b) {
                super(1);
                this.f86942g = c42581iC5;
                this.f86943h = c23158b;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C1737E6 m94545o = this.f86942g.m94545o();
                Integer safePosition = this.f86943h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof String)) {
                        m105816c = null;
                    }
                    String str = (String) m105816c;
                    if (str != null) {
                        this.f86942g.f86937e.onNext(str);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23158b(C42581iC5 c42581iC5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f86941c = c42581iC5;
            C41668gg2 m37913a = C41668gg2.m37913a(view);
            Intrinsics.checkNotNullExpressionValue(m37913a, "bind(view)");
            this.f86940b = m37913a;
            TextView textView = m37913a.f84010c;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.view");
            C34585Ms2.m94661j(textView, new C23159a(c42581iC5, this));
        }
    }

    public C42581iC5() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f86936d = m31902e;
        C24558d<String> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<String>()");
        this.f86937e = m31902e2;
    }

    /* renamed from: A */
    public final Observable<String> m34345A() {
        Observable<String> hide = this.f86937e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "vehiclesInOrderClickSubject.hide()");
        return hide;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C43174jC5();
    }

    /* renamed from: y */
    public final Observable<Unit> m34344y() {
        Observable<Unit> hide = this.f86936d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "skuOrderClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        if (i == C35442Qj4.item_container_order_details_header) {
            return new AbstractC36392Ul0.View$OnClickListenerC8438a(this, m41761u);
        }
        return i == C35442Qj4.item_container_order_status || i == C35442Qj4.item_sku_order_status ? new AbstractC40765f86.C20239e(this, m41761u) : i == C35442Qj4.item_container_order_sku_order ? new AbstractC40765f86.C20241g(this, m41761u) : i == C35442Qj4.item_header_spannable_status_cta ? new C23156a(this, m41761u) : i == C35442Qj4.item_header_value ? new AbstractC40765f86.C20238d(this, m41761u) : i == C35442Qj4.item_transfer_order ? new AbstractC40765f86.C20243h(this, m41761u) : i == C35442Qj4.item_vehicles_in_order ? new C23158b(this, m41761u) : new C29735w1(m41761u);
    }
}
