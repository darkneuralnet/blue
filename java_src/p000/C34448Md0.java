package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016R6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006%"}, m28432d2 = {"LMd0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lw1;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "", "", "value", "b", "Ljava/util/List;", "o", "()Ljava/util/List;", "q", "(Ljava/util/List;)V", "imageUrls", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "p", "()Lkotlin/jvm/functions/Function1;", "r", "(Lkotlin/jvm/functions/Function1;)V", "onImageClick", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Md0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34448Md0 extends RecyclerView.AbstractC11843h<C29735w1> {

    /* renamed from: b */
    public List<String> f23296b;

    /* renamed from: c */
    public Function1<? super String, Unit> f23297c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LMd0$a;", "Lw1;", "", "position", "", "bind", "Lkb2;", "b", "Lkb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LMd0;Landroid/view/View;)V", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Md0$a */
    /* loaded from: classes3.dex */
    public final class C5322a extends C29735w1 {

        /* renamed from: b */
        public final C43990kb2 f23298b;

        /* renamed from: c */
        public final /* synthetic */ C34448Md0 f23299c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nCannotAccessReportsImageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CannotAccessReportsImageAdapter.kt\nco/bird/android/feature/cannotaccess/reports/adapters/CannotAccessReportsImageAdapter$ImageViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
        /* renamed from: Md0$a$a */
        /* loaded from: classes3.dex */
        public static final class C5323a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C34448Md0 f23301h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5323a(C34448Md0 c34448Md0) {
                super(1);
                this.f23301h = c34448Md0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                String str;
                Integer safePosition = C5322a.this.getSafePosition();
                if (safePosition == null || (str = this.f23301h.m95109o().get(safePosition.intValue())) == null) {
                    return;
                }
                this.f23301h.m95108p().invoke(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5322a(C34448Md0 c34448Md0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f23299c = c34448Md0;
            C43990kb2 m28809a = C43990kb2.m28809a(view);
            Intrinsics.checkNotNullExpressionValue(m28809a, "bind(view)");
            this.f23298b = m28809a;
            ImageView root = m28809a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C5323a(c34448Md0));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            ComponentCallbacks2C17096a.m53138t(getContext()).m81653k(this.f23299c.m95109o().get(i)).m16096R0(this.f23298b.getRoot());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Md0$b */
    /* loaded from: classes3.dex */
    public static final class C5324b extends Lambda implements Function1<String, Unit> {

        /* renamed from: g */
        public static final C5324b f23302g = new C5324b();

        public C5324b() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    public C34448Md0() {
        List<String> emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f23296b = emptyList;
        this.f23297c = C5324b.f23302g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f23296b.size();
    }

    /* renamed from: o */
    public final List<String> m95109o() {
        return this.f23296b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C34682Nd0());
        }
    }

    /* renamed from: p */
    public final Function1<String, Unit> m95108p() {
        return this.f23297c;
    }

    /* renamed from: q */
    public final void m95107q(List<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23296b = value;
        notifyDataSetChanged();
    }

    /* renamed from: r */
    public final void m95106r(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f23297c = function1;
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
        return new C5322a(this, C40788fB0.m41761u(context, C36135Ti4.item_cannot_access_report_image, parent, false));
    }
}
