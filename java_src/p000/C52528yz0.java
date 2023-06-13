package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC36392Ul0;
import p000.AbstractC40765f86;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\f"}, m28432d2 = {"Lyz0;", "Lf86;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yz0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52528yz0 extends AbstractC40765f86 {
    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C53121zz0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_container_order_details_header ? new AbstractC36392Ul0.View$OnClickListenerC8438a(this, m41761u) : i == C35442Qj4.item_container_order_status ? new AbstractC40765f86.C20239e(this, m41761u) : i == C35442Qj4.item_container_order_sku_order ? new AbstractC40765f86.C20241g(this, m41761u) : i == C35442Qj4.item_header_spannable_status_cta ? new AbstractC40765f86.C20236b(this, m41761u) : i == C35442Qj4.item_header_value ? new AbstractC40765f86.C20238d(this, m41761u) : i == C35442Qj4.item_line_item_status ? new AbstractC40765f86.C20237c(this, m41761u) : i == C35442Qj4.item_transfer_order ? new AbstractC40765f86.C20243h(this, m41761u) : new C29735w1(m41761u);
    }
}
