package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.bird.android.model.wire.WireOrderItemViewDetail;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, m28432d2 = {"Lxy3;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xy3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51928xy3 extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lxy3$a;", "Lw1;", "", "position", "", "bind", "Lje2;", "b", "Lje2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lxy3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOrderItemViewDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderItemViewDetailsAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/OrderItemViewDetailsAdapter$DetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,50:1\n18#2:51\n9#3,4:52\n*S KotlinDebug\n*F\n+ 1 OrderItemViewDetailsAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/OrderItemViewDetailsAdapter$DetailViewHolder\n*L\n41#1:51\n41#1:52,4\n*E\n"})
    /* renamed from: xy3$a */
    /* loaded from: classes3.dex */
    public final class C30356a extends C29735w1 {

        /* renamed from: b */
        public final C43427je2 f118423b;

        /* renamed from: c */
        public final /* synthetic */ C51928xy3 f118424c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30356a(C51928xy3 c51928xy3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f118424c = c51928xy3;
            C43427je2 m30155a = C43427je2.m30155a(view);
            Intrinsics.checkNotNullExpressionValue(m30155a, "bind(view)");
            this.f118423b = m30155a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            int m94301c;
            Object m105816c = this.f118424c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof WireOrderItemViewDetail)) {
                m105816c = null;
            }
            WireOrderItemViewDetail wireOrderItemViewDetail = (WireOrderItemViewDetail) m105816c;
            if (wireOrderItemViewDetail != null) {
                this.f118423b.f93074b.setText(wireOrderItemViewDetail.getDetail());
                TextView textView = this.f118423b.f93074b;
                Integer color = wireOrderItemViewDetail.getColor();
                if (color != null) {
                    m94301c = color.intValue();
                } else {
                    m94301c = NA0.m94301c(this.f118423b.getRoot().getContext(), C32364Df4.passiveText);
                }
                textView.setTextColor(m94301c);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lxy3$b;", "Lw1;", "", "position", "", "bind", "Lme2;", "b", "Lme2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lxy3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOrderItemViewDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderItemViewDetailsAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/OrderItemViewDetailsAdapter$TitleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,50:1\n18#2:51\n9#3,4:52\n*S KotlinDebug\n*F\n+ 1 OrderItemViewDetailsAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/OrderItemViewDetailsAdapter$TitleViewHolder\n*L\n33#1:51\n33#1:52,4\n*E\n"})
    /* renamed from: xy3$b */
    /* loaded from: classes3.dex */
    public final class C30357b extends C29735w1 {

        /* renamed from: b */
        public final C45206me2 f118425b;

        /* renamed from: c */
        public final /* synthetic */ C51928xy3 f118426c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30357b(C51928xy3 c51928xy3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f118426c = c51928xy3;
            C45206me2 m25242a = C45206me2.m25242a(view);
            Intrinsics.checkNotNullExpressionValue(m25242a, "bind(view)");
            this.f118425b = m25242a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = this.f118425b.f98494b;
            Object m105816c = this.f118426c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_order_item_title ? new C30357b(this, m41761u) : i == C35442Qj4.item_order_item_detail ? new C30356a(this, m41761u) : new C29735w1(m41761u);
    }
}
