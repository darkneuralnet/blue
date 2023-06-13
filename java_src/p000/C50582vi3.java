package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC36392Ul0;
import p000.AbstractC40765f86;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m28432d2 = {"Lvi3;", "Lf86;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Lma4;", "", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lma4;", "mutableScheduleUpdateClicks", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vi3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50582vi3 extends AbstractC40765f86 {

    /* renamed from: d */
    public final C45168ma4<Unit> f114531d;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lvi3$a;", "Lf86$b;", "Lf86;", "Landroid/view/View;", "view", "<init>", "(Lvi3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: vi3$a */
    /* loaded from: classes3.dex */
    public final class C29612a extends AbstractC40765f86.C20236b {

        /* renamed from: d */
        public final /* synthetic */ C50582vi3 f114532d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: vi3$a$a */
        /* loaded from: classes3.dex */
        public static final class C29613a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C50582vi3 f114533g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29613a(C50582vi3 c50582vi3) {
                super(1);
                this.f114533g = c50582vi3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f114533g.f114531d.accept(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29612a(C50582vi3 c50582vi3, View view) {
            super(c50582vi3, view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f114532d = c50582vi3;
            TextView textView = m41957a().f96425b;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.ctaButton");
            C34585Ms2.m94661j(textView, new C29613a(c50582vi3));
        }
    }

    public C50582vi3() {
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f114531d = m25409g;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C43174jC5();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_container_order_details_header ? new AbstractC36392Ul0.View$OnClickListenerC8438a(this, m41761u) : i == C35442Qj4.item_operator_allocation_status ? new AbstractC40765f86.C20239e(this, m41761u) : i == C35442Qj4.item_header_spannable_status_cta ? new C29612a(this, m41761u) : i == C35442Qj4.item_header_value ? new AbstractC40765f86.C20238d(this, m41761u) : new C29735w1(m41761u);
    }
}
