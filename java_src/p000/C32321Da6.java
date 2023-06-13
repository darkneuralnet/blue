package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0016\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0005R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, m28432d2 = {"LDa6;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lw1;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "LJa6;", "items", "o", "idx", "", "p", "", "b", "Ljava/util/List;", "tutorialItems", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.tutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Da6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32321Da6 extends RecyclerView.AbstractC11843h<C29735w1> {

    /* renamed from: b */
    public final List<C33725Ja6> f5997b = new ArrayList();

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LDa6$a;", "Lw1;", "", "position", "", "bind", "LYf2;", "b", "LYf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LDa6;Landroid/view/View;)V", "co.bird.android.feature.tutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Da6$a */
    /* loaded from: classes3.dex */
    public final class C1554a extends C29735w1 {

        /* renamed from: b */
        public final C37276Yf2 f5998b;

        /* renamed from: c */
        public final /* synthetic */ C32321Da6 f5999c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1554a(C32321Da6 c32321Da6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5999c = c32321Da6;
            C37276Yf2 m74598a = C37276Yf2.m74598a(view);
            Intrinsics.checkNotNullExpressionValue(m74598a, "bind(view)");
            this.f5998b = m74598a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            C33725Ja6 c33725Ja6 = (C33725Ja6) this.f5999c.f5997b.get(i);
            this.f5998b.f46224d.setText(c33725Ja6.m100172f());
            this.f5998b.f46222b.setText(c33725Ja6.m100176b());
            if (c33725Ja6.m100173e() != null) {
                Intrinsics.checkNotNullExpressionValue(ComponentCallbacks2C17096a.m53137u(this.f5998b.f46223c).m81653k(c33725Ja6.m100173e()).m16096R0(this.f5998b.f46223c), "{\n          Glide.with(b…(binding.image)\n        }");
                return;
            }
            this.f5998b.f46223c.setImageDrawable(c33725Ja6.m100174d());
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f5997b.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* renamed from: o */
    public final void m110147o(List<C33725Ja6> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f5997b.addAll(items);
        notifyDataSetChanged();
    }

    /* renamed from: p */
    public final String m110146p(int i) {
        return this.f5997b.get(i).m100175c();
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
        return new C1554a(this, C40788fB0.m41761u(context, C35676Rj4.item_tutorial_page, parent, false));
    }
}
