package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.wire.WireSkuVehicle;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, m28432d2 = {"LFC5;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FC5 */
/* loaded from: classes3.dex */
public final class FC5 extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LFC5$a;", "Lw1;", "", "position", "", "bind", "LDf2;", "b", "LDf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LFC5;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSkuOrderVehiclesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderVehiclesAdapter.kt\nco/bird/android/feature/transferorder/sku/vehicles/adapters/SkuOrderVehiclesAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,56:1\n18#2:57\n9#3,4:58\n*S KotlinDebug\n*F\n+ 1 SkuOrderVehiclesAdapter.kt\nco/bird/android/feature/transferorder/sku/vehicles/adapters/SkuOrderVehiclesAdapter$HeaderViewHolder\n*L\n37#1:57\n37#1:58,4\n*E\n"})
    /* renamed from: FC5$a */
    /* loaded from: classes3.dex */
    public final class C2204a extends C29735w1 {

        /* renamed from: b */
        public final C32362Df2 f9009b;

        /* renamed from: c */
        public final /* synthetic */ FC5 f9010c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2204a(FC5 fc5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f9010c = fc5;
            C32362Df2 m110023a = C32362Df2.m110023a(view);
            Intrinsics.checkNotNullExpressionValue(m110023a, "bind(view)");
            this.f9009b = m110023a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f9010c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C40575ep5)) {
                m105816c = null;
            }
            C40575ep5 c40575ep5 = (C40575ep5) m105816c;
            if (c40575ep5 != null) {
                this.f9009b.f6164c.setText(c40575ep5.m42508c());
                this.f9009b.f6163b.setText(c40575ep5.m42509b());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LFC5$b;", "Lw1;", "", "position", "", "bind", "LCf2;", "b", "LCf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LFC5;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSkuOrderVehiclesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderVehiclesAdapter.kt\nco/bird/android/feature/transferorder/sku/vehicles/adapters/SkuOrderVehiclesAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,56:1\n18#2:57\n9#3,4:58\n*S KotlinDebug\n*F\n+ 1 SkuOrderVehiclesAdapter.kt\nco/bird/android/feature/transferorder/sku/vehicles/adapters/SkuOrderVehiclesAdapter$VehicleViewHolder\n*L\n48#1:57\n48#1:58,4\n*E\n"})
    /* renamed from: FC5$b */
    /* loaded from: classes3.dex */
    public final class C2205b extends C29735w1 {

        /* renamed from: b */
        public final C32128Cf2 f9011b;

        /* renamed from: c */
        public final /* synthetic */ FC5 f9012c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2205b(FC5 fc5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f9012c = fc5;
            C32128Cf2 m111924a = C32128Cf2.m111924a(view);
            Intrinsics.checkNotNullExpressionValue(m111924a, "bind(view)");
            this.f9011b = m111924a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f9012c.m94545o().m109397e(i).m105816c();
            String str = null;
            if (!(m105816c instanceof WireSuccessfulScannedItem)) {
                m105816c = null;
            }
            WireSuccessfulScannedItem wireSuccessfulScannedItem = (WireSuccessfulScannedItem) m105816c;
            if (wireSuccessfulScannedItem != null) {
                this.f9011b.f4444b.setText(wireSuccessfulScannedItem.getItemDisplayName());
                TextView textView = this.f9011b.f4445c;
                WireSkuVehicle bird = wireSuccessfulScannedItem.getBird();
                if (bird != null) {
                    str = bird.getModelVersionTitle();
                }
                textView.setText(str);
                this.f9011b.f4446d.setText(wireSuccessfulScannedItem.getScrapReason());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new HC5());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_scrap_vehicles_header ? new C2204a(this, m41761u) : i == C35442Qj4.item_scrap_vehicle ? new C2205b(this, m41761u) : new C29735w1(m41761u);
    }
}
