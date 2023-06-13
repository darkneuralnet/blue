package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.VehiclePricing;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C45893nn6;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0014"}, m28432d2 = {"Lpn6;", "Lct4;", "Lnn6$a;", "", "position", "getItemViewType", "Landroid/view/ViewGroup;", "parent", "viewType", "Landroidx/recyclerview/widget/RecyclerView$D;", "onCreateViewHolder", "holder", "", "onBindViewHolder", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "b", "vehicle-pricing_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pn6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47079pn6 extends AbstractC39429ct4<C45893nn6.C26595a> {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"Lpn6$a;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "vehicle-pricing_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pn6$a */
    /* loaded from: classes3.dex */
    public static final class C27392a extends RecyclerView.AbstractC11834D {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27392a(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lpn6$b;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Lco/bird/android/model/VehiclePricing;", "vehiclePricing", "", C17296a.f69688o, "Lmu6;", "b", "Lmu6;", "binding", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "vehicle-pricing_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pn6$b */
    /* loaded from: classes3.dex */
    public static final class C27393b extends RecyclerView.AbstractC11834D {

        /* renamed from: b */
        public final C45370mu6 f104097b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27393b(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            C45370mu6 m24720a = C45370mu6.m24720a(view);
            Intrinsics.checkNotNullExpressionValue(m24720a, "bind(view)");
            this.f104097b = m24720a;
        }

        /* renamed from: a */
        public final void m18687a(VehiclePricing vehiclePricing) {
            Intrinsics.checkNotNullParameter(vehiclePricing, "vehiclePricing");
            ComponentCallbacks2C17096a.m53137u(this.f104097b.f99018d).m81653k(vehiclePricing.getImageUrl()).m16096R0(this.f104097b.f99018d);
            this.f104097b.f99016b.setText(vehiclePricing.getName());
            this.f104097b.f99017c.setText(vehiclePricing.getDetails());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47079pn6(Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        return !getItem(i).m23139b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D holder, int i) {
        VehiclePricing m23138c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if ((holder instanceof C27393b) && (m23138c = getItem(i).m23138c()) != null) {
            ((C27393b) holder).m18687a(m23138c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i == 0) {
            return new C27392a(C40788fB0.m41761u(m44892u(), C35910Sj4.view_by_vehicle_header, parent, false));
        }
        return new C27393b(C40788fB0.m41761u(m44892u(), C35910Sj4.view_vehicle_pricing, parent, false));
    }
}
