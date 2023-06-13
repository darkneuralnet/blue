package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.RentalPlan;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C36738Vx4;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0016¨\u0006\u0015"}, m28432d2 = {"LVx4;", "LOr5;", "Lco/bird/android/model/RentalPlan;", "item", "", "K", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$D;", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vx4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36738Vx4 extends AbstractC35047Or5<RentalPlan> {

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"LVx4$a;", "Lw1;", "", "position", "", "bind", "LVx4;", "b", "LVx4;", "getAdapter", "()LVx4;", "adapter", "LWx4;", "c", "LWx4;", "binding", "Landroid/view/View;", "view", "<init>", "(LVx4;Landroid/view/View;LVx4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Vx4$a */
    /* loaded from: classes2.dex */
    public final class C8877a extends C29735w1 {

        /* renamed from: b */
        public final C36738Vx4 f40107b;

        /* renamed from: c */
        public final C36972Wx4 f40108c;

        /* renamed from: d */
        public final /* synthetic */ C36738Vx4 f40109d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8877a(C36738Vx4 c36738Vx4, View view, C36738Vx4 adapter) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f40109d = c36738Vx4;
            this.f40107b = adapter;
            C36972Wx4 m77604a = C36972Wx4.m77604a(view);
            Intrinsics.checkNotNullExpressionValue(m77604a, "bind(view)");
            this.f40108c = m77604a;
        }

        /* renamed from: b */
        public static final void m79085b(C8877a this$0, RentalPlan item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.f40107b.m91276H(item);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            if (i == this.f40109d.m91277F()) {
                this.itemView.setBackground(NA0.m94299e(getContext(), C33309Hg4.frame_rectangle_border_rounded_large_radius_purple));
            } else {
                this.itemView.setBackground(NA0.m94299e(getContext(), C33309Hg4.frame_rectangle_border_rounded_large_radius));
            }
            final RentalPlan m44895q = this.f40107b.m44895q(i);
            this.f40108c.f42410c.setText(m44895q.getDescriptionLabel());
            this.f40108c.f42411d.setText(C51916xx1.f118396a.m4408d(m44895q.getBaseCost(), C45097mS5.m25591o(m44895q.getCurrency()), EnumC36501Ux1.SHOW_ALWAYS));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: Ux4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C36738Vx4.C8877a.m79085b(C36738Vx4.C8877a.this, m44895q, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36738Vx4(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p000.AbstractC35047Or5
    /* renamed from: K */
    public String getId(RentalPlan item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((C29735w1) holder).bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new C8877a(this, C40788fB0.m41761u(m44892u(), C39311cj4.rental_period_item, parent, false), this);
    }
}
