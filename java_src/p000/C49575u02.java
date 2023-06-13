package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\n0\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lu02;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "v", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "acceptRelay", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: u02  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49575u02 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<Unit> f111463c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lu02$a;", "Lw1;", "", "position", "", "bind", "Ltc2;", "b", "Ltc2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lu02;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/inbound/adapters/InboundScanAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,79:1\n18#2:80\n9#3,4:81\n*S KotlinDebug\n*F\n+ 1 InboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/inbound/adapters/InboundScanAdapter$HeaderViewHolder\n*L\n58#1:80\n58#1:81,4\n*E\n"})
    /* renamed from: u02$a */
    /* loaded from: classes3.dex */
    public final class C28983a extends C29735w1 {

        /* renamed from: b */
        public final C49336tc2 f111464b;

        /* renamed from: c */
        public final /* synthetic */ C49575u02 f111465c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: u02$a$a */
        /* loaded from: classes3.dex */
        public static final class C28984a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C49575u02 f111466g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28984a(C49575u02 c49575u02) {
                super(1);
                this.f111466g = c49575u02;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f111466g.f111463c.accept(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28983a(C49575u02 c49575u02, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f111465c = c49575u02;
            C49336tc2 m12012a = C49336tc2.m12012a(view);
            Intrinsics.checkNotNullExpressionValue(m12012a, "bind(view)");
            this.f111464b = m12012a;
            Button button = m12012a.f110789b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.acceptDelivery");
            C34585Ms2.m94661j(button, new C28984a(c49575u02));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f111465c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C51353x02)) {
                m105816c = null;
            }
            C51353x02 c51353x02 = (C51353x02) m105816c;
            if (c51353x02 != null) {
                Button button = this.f111464b.f110789b;
                Intrinsics.checkNotNullExpressionValue(button, "binding.acceptDelivery");
                C49520tu6.show$default(button, c51353x02.m5998d(), 0, 2, null);
                this.f111464b.f110789b.setEnabled(c51353x02.m5999c());
                this.f111464b.f110790c.setText(c51353x02.m6000b());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lu02$b;", "Lw1;", "", "position", "", "bind", "Luf2;", "b", "Luf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lu02;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/inbound/adapters/InboundScanAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,79:1\n18#2:80\n9#3,4:81\n*S KotlinDebug\n*F\n+ 1 InboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/inbound/adapters/InboundScanAdapter$VehicleViewHolder\n*L\n70#1:80\n70#1:81,4\n*E\n"})
    /* renamed from: u02$b */
    /* loaded from: classes3.dex */
    public final class C28985b extends C29735w1 {

        /* renamed from: b */
        public final C49959uf2 f111467b;

        /* renamed from: c */
        public final /* synthetic */ C49575u02 f111468c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28985b(C49575u02 c49575u02, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f111468c = c49575u02;
            C49959uf2 m9897a = C49959uf2.m9897a(view);
            Intrinsics.checkNotNullExpressionValue(m9897a, "bind(view)");
            this.f111467b = m9897a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Object m105816c = this.f111468c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof PC5)) {
                m105816c = null;
            }
            PC5 pc5 = (PC5) m105816c;
            if (pc5 != null) {
                this.f111467b.f112736g.setText(pc5.m90586d());
                this.f111467b.f112737h.setText(pc5.m90587c());
                ImageView imageView = this.f111467b.f112738i;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.scan");
                boolean z2 = true;
                if (pc5.m90583g() != EnumC43500jl5.AWAITING_SCAN) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(imageView, z, 0, 2, null);
                ImageView imageView2 = this.f111467b.f112735f;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.check");
                if (pc5.m90583g() != EnumC43500jl5.RECEIVED) {
                    z2 = false;
                }
                C49520tu6.m11232s(imageView2, z2, 4);
            }
        }
    }

    public C49575u02() {
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f111463c = m25409g;
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
        return new C50168v02();
    }

    /* renamed from: v */
    public final Observable<Unit> m11107v() {
        Observable<Unit> hide = this.f111463c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "acceptRelay.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_inbound_scan_header ? new C28983a(this, m41761u) : i == C45268mk4.item_scan_vehicle ? new C28985b(this, m41761u) : new C29735w1(m41761u);
    }
}
