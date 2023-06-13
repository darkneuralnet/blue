package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.constant.TransferOrderDemandSource;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u000f0\u000f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"LZy3;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "v", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "onCompleteClickRelay", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Zy3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37682Zy3 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<TransferOrderDemandSource> f49601c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LZy3$a;", "Lw1;", "", "position", "", "bind", "Lne2;", "b", "Lne2;", "binding", "Landroid/view/View;", "view", "<init>", "(LZy3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOutboundScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/outbound/adapters/OutboundScanAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,82:1\n18#2:83\n9#3,4:84\n*S KotlinDebug\n*F\n+ 1 OutboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/outbound/adapters/OutboundScanAdapter$HeaderViewHolder\n*L\n62#1:83\n62#1:84,4\n*E\n"})
    /* renamed from: Zy3$a */
    /* loaded from: classes3.dex */
    public final class C10479a extends C29735w1 {

        /* renamed from: b */
        public final C45799ne2 f49602b;

        /* renamed from: c */
        public final /* synthetic */ C37682Zy3 f49603c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nOutboundScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/outbound/adapters/OutboundScanAdapter$HeaderViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n18#2:83\n9#3,4:84\n1#4:88\n*S KotlinDebug\n*F\n+ 1 OutboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/outbound/adapters/OutboundScanAdapter$HeaderViewHolder$1\n*L\n55#1:83\n55#1:84,4\n*E\n"})
        /* renamed from: Zy3$a$a */
        /* loaded from: classes3.dex */
        public static final class C10480a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37682Zy3 f49604g;

            /* renamed from: h */
            public final /* synthetic */ C10479a f49605h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10480a(C37682Zy3 c37682Zy3, C10479a c10479a) {
                super(1);
                this.f49604g = c37682Zy3;
                this.f49605h = c10479a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                TransferOrderDemandSource m44772c;
                C1737E6 m94545o = this.f49604g.m94545o();
                Integer safePosition = this.f49605h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof C39488cz3)) {
                        m105816c = null;
                    }
                    C39488cz3 c39488cz3 = (C39488cz3) m105816c;
                    if (c39488cz3 == null || (m44772c = c39488cz3.m44772c()) == null) {
                        return;
                    }
                    this.f49604g.f49601c.accept(m44772c);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10479a(C37682Zy3 c37682Zy3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f49603c = c37682Zy3;
            C45799ne2 m23373a = C45799ne2.m23373a(view);
            Intrinsics.checkNotNullExpressionValue(m23373a, "bind(view)");
            this.f49602b = m23373a;
            Button button = m23373a.f100265c;
            Intrinsics.checkNotNullExpressionValue(button, "binding.complete");
            C34585Ms2.m94661j(button, new C10480a(c37682Zy3, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f49603c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C39488cz3)) {
                m105816c = null;
            }
            C39488cz3 c39488cz3 = (C39488cz3) m105816c;
            if (c39488cz3 != null) {
                this.f49602b.f100266d.setText(c39488cz3.m44770e());
                this.f49602b.f100265c.setText(c39488cz3.m44773b());
                this.f49602b.f100265c.setEnabled(c39488cz3.m44771d());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LZy3$b;", "Lw1;", "", "position", "", "bind", "Luf2;", "b", "Luf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LZy3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOutboundScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/outbound/adapters/OutboundScanAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n18#2:83\n9#3,4:84\n1#4:88\n*S KotlinDebug\n*F\n+ 1 OutboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/outbound/adapters/OutboundScanAdapter$VehicleViewHolder\n*L\n74#1:83\n74#1:84,4\n*E\n"})
    /* renamed from: Zy3$b */
    /* loaded from: classes3.dex */
    public final class C10481b extends C29735w1 {

        /* renamed from: b */
        public final C49959uf2 f49606b;

        /* renamed from: c */
        public final /* synthetic */ C37682Zy3 f49607c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10481b(C37682Zy3 c37682Zy3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f49607c = c37682Zy3;
            C49959uf2 m9897a = C49959uf2.m9897a(view);
            Intrinsics.checkNotNullExpressionValue(m9897a, "bind(view)");
            this.f49606b = m9897a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f49607c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                PC5 pc5 = (PC5) pair.component1();
                boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
                this.f49606b.f112736g.setText(pc5.m90586d());
                this.f49606b.f112737h.setText(pc5.m90587c());
                ImageView imageView = this.f49606b.f112735f;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.check");
                C49520tu6.show$default(imageView, booleanValue, 0, 2, null);
            }
        }
    }

    public C37682Zy3() {
        C45168ma4<TransferOrderDemandSource> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<TransferOrderDemandSource>()");
        this.f49601c = m25409g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C44083kk5());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C38284az3();
    }

    /* renamed from: v */
    public final Observable<TransferOrderDemandSource> m72166v() {
        Observable<TransferOrderDemandSource> hide = this.f49601c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "onCompleteClickRelay.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_outbound_scan_header ? new C10479a(this, m41761u) : i == C45268mk4.item_scan_vehicle ? new C10481b(this, m41761u) : new C29735w1(m41761u);
    }
}
