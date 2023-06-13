package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u0012"}, m28432d2 = {"Lh40;", "Lct4;", "LDI3;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$D;", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: h40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41905h40 extends AbstractC39429ct4<DI3> {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lh40$a;", "Landroidx/recyclerview/widget/RecyclerView$D;", "LDI3;", "viewModel", "", C17296a.f69688o, "LQp6;", "b", "LQp6;", "binding", "Landroid/view/View;", "view", "<init>", "(Lh40;Landroid/view/View;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: h40$a */
    /* loaded from: classes3.dex */
    public final class C22547a extends RecyclerView.AbstractC11834D {

        /* renamed from: b */
        public final C35498Qp6 f84676b;

        /* renamed from: c */
        public final /* synthetic */ C41905h40 f84677c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22547a(C41905h40 c41905h40, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f84677c = c41905h40;
            C35498Qp6 m87895a = C35498Qp6.m87895a(view);
            Intrinsics.checkNotNullExpressionValue(m87895a, "bind(view)");
            this.f84676b = m87895a;
        }

        @SuppressLint({"SetTextI18n"})
        /* renamed from: a */
        public final void m36868a(DI3 viewModel) {
            AbstractC33662It6<ImageView, Bitmap> abstractC33662It6;
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            TextView textView = this.f84676b.f30998d;
            textView.setText(textView.getContext().getString(C45871nl4.operator_inventory_bulk_part_scan_sku_quantity, viewModel.m110601b().getSku(), Integer.valueOf(viewModel.m110600c())));
            this.f84676b.f30997c.setText(viewModel.m110601b().displayName());
            String defaultImageUrl = viewModel.m110601b().getDefaultImageUrl();
            if (defaultImageUrl != null) {
                abstractC33662It6 = ComponentCallbacks2C17096a.m53137u(this.f84676b.f30996b).m81662b().m16089a1(defaultImageUrl).m16082g1(C24847jU.m30574l()).m16096R0(this.f84676b.f30996b);
            } else {
                abstractC33662It6 = null;
            }
            if (abstractC33662It6 == null) {
                this.f84676b.f30996b.setImageDrawable(null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41905h40(Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((C22547a) holder).m36868a(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new C22547a(this, C40788fB0.m41761u(context, C35901Si4.view_bulk_part, parent, false));
    }
}
