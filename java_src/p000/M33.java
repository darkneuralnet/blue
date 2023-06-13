package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LM33;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lw1;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "", "imageUrls", "o", "", "b", "Ljava/util/List;", "<init>", "()V", C17296a.f69688o, "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: M33 */
/* loaded from: classes3.dex */
public final class M33 extends RecyclerView.AbstractC11843h<C29735w1> {

    /* renamed from: b */
    public final List<String> f22536b = new ArrayList();

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LM33$a;", "Lw1;", "", "position", "", "bind", "LBd2;", "b", "LBd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LM33;Landroid/view/View;)V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: M33$a */
    /* loaded from: classes3.dex */
    public final class C5174a extends C29735w1 {

        /* renamed from: b */
        public final C31876Bd2 f22537b;

        /* renamed from: c */
        public final /* synthetic */ M33 f22538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5174a(M33 m33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f22538c = m33;
            C31876Bd2 m113748a = C31876Bd2.m113748a(view);
            Intrinsics.checkNotNullExpressionValue(m113748a, "bind(view)");
            this.f22537b = m113748a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            ComponentCallbacks2C17096a.m53137u(this.f22537b.f2602b).m81653k((String) this.f22538c.f22536b.get(i)).mo16086d(new YI4().m97545p()).m16096R0(this.f22537b.f2602b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, m28432d2 = {"M33$b", "Landroidx/recyclerview/widget/h$b;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: M33$b */
    /* loaded from: classes3.dex */
    public static final class C5175b extends C11905h.AbstractC11907b {

        /* renamed from: b */
        public final /* synthetic */ List<String> f22540b;

        public C5175b(List<String> list) {
            this.f22540b = list;
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public boolean areContentsTheSame(int i, int i2) {
            return true;
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public boolean areItemsTheSame(int i, int i2) {
            return Intrinsics.areEqual((String) M33.this.f22536b.get(i), this.f22540b.get(i2));
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public int getNewListSize() {
            return this.f22540b.size();
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public int getOldListSize() {
            return M33.this.f22536b.size();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f22536b.size();
    }

    /* renamed from: o */
    public final void m95893o(List<String> imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        C11905h.C11910e m66274b = C11905h.m66274b(new C5175b(imageUrls));
        Intrinsics.checkNotNullExpressionValue(m66274b, "fun populateAdapter(imag…spatchUpdatesTo(this)\n  }");
        this.f22536b.clear();
        this.f22536b.addAll(imageUrls);
        m66274b.m66261d(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(C29735w1 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new C5174a(this, C40788fB0.m41761u(context, C48223rj4.item_nest_flight_sheet_image, parent, false));
    }
}
