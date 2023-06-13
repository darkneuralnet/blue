package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBatch;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C0522B7;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0004\u001b\u001c\u0014\u0017B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00100\u00100\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\n0\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u001d"}, m28432d2 = {"LB7;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "w", "Lco/bird/android/model/wire/WireBatch;", "v", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "batchClicksSubject", DateTokenConverter.CONVERTER_KEY, "createBatchClickSubject", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: B7 */
/* loaded from: classes3.dex */
public final class C0522B7 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<WireBatch> f1838c;

    /* renamed from: d */
    public final C24558d<Unit> f1839d;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LB7$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LB7;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAddToBatchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddToBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchAdapter$BatchViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n18#2:99\n18#2:104\n9#3,4:100\n9#3,4:105\n1#4:109\n*S KotlinDebug\n*F\n+ 1 AddToBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchAdapter$BatchViewHolder\n*L\n76#1:99\n70#1:104\n76#1:100,4\n70#1:105,4\n*E\n"})
    /* renamed from: B7$a */
    /* loaded from: classes3.dex */
    public final class C0523a extends C29735w1 {

        /* renamed from: b */
        public final Button f1840b;

        /* renamed from: c */
        public final /* synthetic */ C0522B7 f1841c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0523a(final C0522B7 c0522b7, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f1841c = c0522b7;
            Button button = (Button) view;
            this.f1840b = button;
            button.setOnClickListener(new View.OnClickListener() { // from class: A7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C0522B7.C0523a.m114350b(C0522B7.this, this, view2);
                }
            });
        }

        /* renamed from: b */
        public static final void m114350b(C0522B7 this$0, C0523a this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Object m105816c = this$0.m94545o().m109394h().get(this$1.getAdapterPosition()).m105816c();
            if (!(m105816c instanceof WireBatch)) {
                m105816c = null;
            }
            WireBatch wireBatch = (WireBatch) m105816c;
            if (wireBatch != null) {
                this$0.f1838c.onNext(wireBatch);
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f1841c.m94545o().m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof WireBatch)) {
                m105816c = null;
            }
            WireBatch wireBatch = (WireBatch) m105816c;
            Button button = this.f1840b;
            if (wireBatch != null) {
                str = wireBatch.getDescription();
            }
            button.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LB7$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LB7;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAddToBatchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddToBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchAdapter$ButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,98:1\n18#2:99\n9#3,4:100\n*S KotlinDebug\n*F\n+ 1 AddToBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchAdapter$ButtonViewHolder\n*L\n60#1:99\n60#1:100,4\n*E\n"})
    /* renamed from: B7$b */
    /* loaded from: classes3.dex */
    public final class C0524b extends C29735w1 {

        /* renamed from: b */
        public final Button f1842b;

        /* renamed from: c */
        public final /* synthetic */ C0522B7 f1843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0524b(final C0522B7 c0522b7, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f1843c = c0522b7;
            Button button = (Button) view;
            this.f1842b = button;
            button.setOnClickListener(new View.OnClickListener() { // from class: C7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C0522B7.C0524b.m114348b(C0522B7.this, view2);
                }
            });
        }

        /* renamed from: b */
        public static final void m114348b(C0522B7 this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f1839d.onNext(Unit.INSTANCE);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f1843c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            this.f1842b.setText((String) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LB7$c;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "title", "Landroid/view/View;", "view", "<init>", "(LB7;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAddToBatchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddToBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,98:1\n18#2:99\n9#3,4:100\n*S KotlinDebug\n*F\n+ 1 AddToBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchAdapter$HeaderViewHolder\n*L\n85#1:99\n85#1:100,4\n*E\n"})
    /* renamed from: B7$c */
    /* loaded from: classes3.dex */
    public final class C0525c extends C29735w1 {

        /* renamed from: b */
        public final TextView f1844b;

        /* renamed from: c */
        public final /* synthetic */ C0522B7 f1845c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0525c(C0522B7 c0522b7, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f1845c = c0522b7;
            TextView textView = C44000kc2.m28795a(view).f94636b;
            Intrinsics.checkNotNullExpressionValue(textView, "bind(view).title");
            this.f1844b = textView;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = this.f1844b;
            Object m105816c = this.f1845c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LB7$d;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LB7;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B7$d */
    /* loaded from: classes3.dex */
    public final class C0526d extends C29735w1 {

        /* renamed from: b */
        public final Button f1846b;

        /* renamed from: c */
        public final /* synthetic */ C0522B7 f1847c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0526d(C0522B7 c0522b7, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f1847c = c0522b7;
            this.f1846b = (Button) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Button button = this.f1846b;
            button.setText(button.getResources().getString(C45871nl4.batches_search_no_results_found));
            this.f1846b.setClickable(false);
        }
    }

    public C0522B7() {
        C24558d<WireBatch> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireBatch>()");
        this.f1838c = m31902e;
        C24558d<Unit> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Unit>()");
        this.f1839d = m31902e2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C3327I7());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C1394D7();
    }

    /* renamed from: v */
    public final Observable<WireBatch> m114353v() {
        Observable<WireBatch> hide = this.f1838c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "batchClicksSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Unit> m114352w() {
        Observable<Unit> hide = this.f1839d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "createBatchClickSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C45268mk4.item_button ? new C0524b(this, m41761u) : i == C45268mk4.item_button_secondary ? new C0523a(this, m41761u) : i == C34740Nj4.item_header ? new C0525c(this, m41761u) : i == C45268mk4.view_button_red ? new C0526d(this, m41761u) : new C29735w1(m41761u);
    }
}
