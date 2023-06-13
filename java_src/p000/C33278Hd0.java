package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u000eB\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"LHd0;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lkotlin/Function1;", "", "c", "Lkotlin/jvm/functions/Function1;", "v", "()Lkotlin/jvm/functions/Function1;", "w", "(Lkotlin/jvm/functions/Function1;)V", "onImageClick", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Hd0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33278Hd0 extends AbstractC52206yS0 {

    /* renamed from: c */
    public Function1<? super String, Unit> f13647c = C3183d.f13656g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LHd0$a;", "Lw1;", "", "position", "", "bind", "Lib2;", "b", "Lib2;", "binding", "Landroid/view/View;", "view", "<init>", "(LHd0;Landroid/view/View;)V", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCannotAccessReportsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CannotAccessReportsAdapter.kt\nco/bird/android/feature/cannotaccess/reports/adapters/CannotAccessReportsAdapter$DateViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,70:1\n18#2:71\n9#3,4:72\n*S KotlinDebug\n*F\n+ 1 CannotAccessReportsAdapter.kt\nco/bird/android/feature/cannotaccess/reports/adapters/CannotAccessReportsAdapter$DateViewHolder\n*L\n41#1:71\n41#1:72,4\n*E\n"})
    /* renamed from: Hd0$a */
    /* loaded from: classes3.dex */
    public final class C3178a extends C29735w1 {

        /* renamed from: b */
        public final C42804ib2 f13648b;

        /* renamed from: c */
        public final /* synthetic */ C33278Hd0 f13649c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3178a(C33278Hd0 c33278Hd0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f13649c = c33278Hd0;
            C42804ib2 m33770a = C42804ib2.m33770a(view);
            Intrinsics.checkNotNullExpressionValue(m33770a, "bind(view)");
            this.f13648b = m33770a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView root = this.f13648b.getRoot();
            Object m105816c = this.f13649c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            root.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LHd0$b;", "Lw1;", "", "position", "", "bind", "Ljb2;", "b", "Ljb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LHd0;Landroid/view/View;)V", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCannotAccessReportsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CannotAccessReportsAdapter.kt\nco/bird/android/feature/cannotaccess/reports/adapters/CannotAccessReportsAdapter$DetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,70:1\n18#2:71\n9#3,4:72\n*S KotlinDebug\n*F\n+ 1 CannotAccessReportsAdapter.kt\nco/bird/android/feature/cannotaccess/reports/adapters/CannotAccessReportsAdapter$DetailViewHolder\n*L\n49#1:71\n49#1:72,4\n*E\n"})
    /* renamed from: Hd0$b */
    /* loaded from: classes3.dex */
    public final class C3179b extends C29735w1 {

        /* renamed from: b */
        public final C43397jb2 f13650b;

        /* renamed from: c */
        public final /* synthetic */ C33278Hd0 f13651c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3179b(C33278Hd0 c33278Hd0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f13651c = c33278Hd0;
            C43397jb2 m30219a = C43397jb2.m30219a(view);
            Intrinsics.checkNotNullExpressionValue(m30219a, "bind(view)");
            this.f13650b = m30219a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView root = this.f13650b.getRoot();
            Object m105816c = this.f13651c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            root.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LHd0$c;", "Lw1;", "", "position", "", "bind", "Llb2;", "b", "Llb2;", "binding", "LMd0;", "c", "LMd0;", "adapter", "Landroid/view/View;", "view", "<init>", "(LHd0;Landroid/view/View;)V", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCannotAccessReportsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CannotAccessReportsAdapter.kt\nco/bird/android/feature/cannotaccess/reports/adapters/CannotAccessReportsAdapter$ImageCarouselViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n18#2:71\n9#3,4:72\n1#4:76\n*S KotlinDebug\n*F\n+ 1 CannotAccessReportsAdapter.kt\nco/bird/android/feature/cannotaccess/reports/adapters/CannotAccessReportsAdapter$ImageCarouselViewHolder\n*L\n66#1:71\n66#1:72,4\n*E\n"})
    /* renamed from: Hd0$c */
    /* loaded from: classes3.dex */
    public final class C3180c extends C29735w1 {

        /* renamed from: b */
        public final C44583lb2 f13652b;

        /* renamed from: c */
        public final C34448Md0 f13653c;

        /* renamed from: d */
        public final /* synthetic */ C33278Hd0 f13654d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "imageUrl", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Hd0$c$a */
        /* loaded from: classes3.dex */
        public static final class C3181a extends Lambda implements Function1<String, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C33278Hd0 f13655g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3181a(C33278Hd0 c33278Hd0) {
                super(1);
                this.f13655g = c33278Hd0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(String imageUrl) {
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                this.f13655g.m103645v().invoke(imageUrl);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3180c(C33278Hd0 c33278Hd0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f13654d = c33278Hd0;
            C44583lb2 m27102a = C44583lb2.m27102a(view);
            Intrinsics.checkNotNullExpressionValue(m27102a, "bind(view)");
            this.f13652b = m27102a;
            C34448Md0 c34448Md0 = new C34448Md0();
            this.f13653c = c34448Md0;
            m27102a.getRoot().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            m27102a.getRoot().setItemAnimator(new C11894g());
            m27102a.getRoot().setAdapter(c34448Md0);
            c34448Md0.m95106r(new C3181a(c33278Hd0));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f13654d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof List)) {
                m105816c = null;
            }
            List list = (List) m105816c;
            if (list != null) {
                new MutablePropertyReference0Impl(this.f13653c) { // from class: Hd0.c.b
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                    public Object get() {
                        return ((C34448Md0) this.receiver).m95109o();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                    public void set(Object obj) {
                        ((C34448Md0) this.receiver).m95107q((List) obj);
                    }
                }.set(list);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Hd0$d */
    /* loaded from: classes3.dex */
    public static final class C3183d extends Lambda implements Function1<String, Unit> {

        /* renamed from: g */
        public static final C3183d f13656g = new C3183d();

        public C3183d() {
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C34916Od0());
        }
    }

    /* renamed from: v */
    public final Function1<String, Unit> m103645v() {
        return this.f13647c;
    }

    /* renamed from: w */
    public final void m103644w(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f13647c = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C36135Ti4.item_cannot_access_report_date ? new C3178a(this, m41761u) : i == C36135Ti4.item_cannot_access_report_detail ? new C3179b(this, m41761u) : i == C36135Ti4.item_cannot_access_report_image_carousel ? new C3180c(this, m41761u) : new C29735w1(m41761u);
    }
}
