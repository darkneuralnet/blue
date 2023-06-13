package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBatch;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25663lF;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003 !\u0015B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eR\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u000f0\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00040\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"LlF;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBatch;", "v", "w", "x", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "batchClicksSubject", DateTokenConverter.CONVERTER_KEY, "loadMoreClicksSubject", "Lio/reactivex/subjects/a;", "e", "Lio/reactivex/subjects/a;", "loadMoreLimitSubject", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lF */
/* loaded from: classes3.dex */
public final class C25663lF extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<WireBatch> f95759c;

    /* renamed from: d */
    public final C24558d<Unit> f95760d;

    /* renamed from: e */
    public final C24552a<Integer> f95761e;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LlF$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LlF;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBatchSearchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchSearchAdapter.kt\nco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchAdapter$BatchViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n18#2:93\n18#2:98\n9#3,4:94\n9#3,4:99\n1#4:103\n*S KotlinDebug\n*F\n+ 1 BatchSearchAdapter.kt\nco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchAdapter$BatchViewHolder\n*L\n78#1:93\n72#1:98\n78#1:94,4\n72#1:99,4\n*E\n"})
    /* renamed from: lF$a */
    /* loaded from: classes3.dex */
    public final class C25664a extends C29735w1 {

        /* renamed from: b */
        public final Button f95762b;

        /* renamed from: c */
        public final /* synthetic */ C25663lF f95763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25664a(final C25663lF c25663lF, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f95763c = c25663lF;
            Button button = (Button) view;
            this.f95762b = button;
            button.setOnClickListener(new View.OnClickListener() { // from class: kF
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C25663lF.C25664a.m27631b(C25663lF.this, this, view2);
                }
            });
        }

        /* renamed from: b */
        public static final void m27631b(C25663lF this$0, C25664a this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Object m105816c = this$0.m94545o().m109394h().get(this$1.getAdapterPosition()).m105816c();
            if (!(m105816c instanceof WireBatch)) {
                m105816c = null;
            }
            WireBatch wireBatch = (WireBatch) m105816c;
            if (wireBatch != null) {
                this$0.f95759c.onNext(wireBatch);
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f95763c.m94545o().m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof WireBatch)) {
                m105816c = null;
            }
            WireBatch wireBatch = (WireBatch) m105816c;
            Button button = this.f95762b;
            if (wireBatch != null) {
                str = wireBatch.getDescription();
            }
            button.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LlF$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LlF;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBatchSearchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchSearchAdapter.kt\nco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchAdapter$ButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,92:1\n18#2:93\n9#3,4:94\n*S KotlinDebug\n*F\n+ 1 BatchSearchAdapter.kt\nco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchAdapter$ButtonViewHolder\n*L\n63#1:93\n63#1:94,4\n*E\n"})
    /* renamed from: lF$b */
    /* loaded from: classes3.dex */
    public final class C25665b extends C29735w1 {

        /* renamed from: b */
        public final Button f95764b;

        /* renamed from: c */
        public final /* synthetic */ C25663lF f95765c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25665b(final C25663lF c25663lF, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f95765c = c25663lF;
            Button button = (Button) view;
            this.f95764b = button;
            button.setOnClickListener(new View.OnClickListener() { // from class: mF
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C25663lF.C25665b.m27629b(C25663lF.this, view2);
                }
            });
        }

        /* renamed from: b */
        public static final void m27629b(C25663lF this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f95760d.onNext(Unit.INSTANCE);
            C24552a c24552a = this$0.f95761e;
            Object value = this$0.f95761e.getValue();
            Intrinsics.checkNotNull(value);
            c24552a.onNext(Integer.valueOf(((Number) value).intValue() + 20));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Button button = this.f95764b;
            Object m105816c = this.f95765c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            button.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LlF$c;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LlF;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: lF$c */
    /* loaded from: classes3.dex */
    public final class C25666c extends C29735w1 {

        /* renamed from: b */
        public final Button f95766b;

        /* renamed from: c */
        public final /* synthetic */ C25663lF f95767c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25666c(C25663lF c25663lF, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f95767c = c25663lF;
            this.f95766b = (Button) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Button button = this.f95766b;
            button.setText(button.getResources().getString(C45871nl4.batches_search_no_results_found));
            this.f95766b.setClickable(false);
        }
    }

    public C25663lF() {
        C24558d<WireBatch> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireBatch>()");
        this.f95759c = m31902e;
        C24558d<Unit> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Unit>()");
        this.f95760d = m31902e2;
        C24552a<Integer> m31921g = C24552a.m31921g(40);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(BatchSearc…THOUT_PAGINATION_LIMIT*2)");
        this.f95761e = m31921g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C28248sF());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C26449nF();
    }

    /* renamed from: v */
    public final Observable<WireBatch> m27635v() {
        Observable<WireBatch> hide = this.f95759c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "batchClicksSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Unit> m27634w() {
        Observable<Unit> hide = this.f95760d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "loadMoreClicksSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<Integer> m27633x() {
        Observable<Integer> hide = this.f95761e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "loadMoreLimitSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C45268mk4.item_button_secondary ? new C25664a(this, m41761u) : i == C45268mk4.item_button ? new C25665b(this, m41761u) : i == C45268mk4.view_button_red ? new C25666c(this, m41761u) : new C29735w1(m41761u);
    }
}
