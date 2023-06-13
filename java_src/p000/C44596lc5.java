package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.bird.android.buava.Optional;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.widget.standardcomponents.CheckableItemView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R.\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000f*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m28432d2 = {"Llc5;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/ServiceCenterRoute;", "v", "LF6;", "r", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "routeSubject", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lc5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44596lc5 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Optional<ServiceCenterRoute>> f96429c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Llc5$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "headerView", "Landroid/view/View;", "view", "<init>", "(Llc5;Landroid/view/View;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRoutingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingAdapter.kt\nco/bird/android/feature/commandcenter/routing/adapters/RoutingAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,70:1\n18#2:71\n9#3,4:72\n*S KotlinDebug\n*F\n+ 1 RoutingAdapter.kt\nco/bird/android/feature/commandcenter/routing/adapters/RoutingAdapter$HeaderViewHolder\n*L\n41#1:71\n41#1:72,4\n*E\n"})
    /* renamed from: lc5$a */
    /* loaded from: classes3.dex */
    public final class C25740a extends C29735w1 {

        /* renamed from: b */
        public final TextView f96430b;

        /* renamed from: c */
        public final /* synthetic */ C44596lc5 f96431c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25740a(C44596lc5 c44596lc5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f96431c = c44596lc5;
            this.f96430b = (TextView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f96430b;
            Object m105816c = this.f96431c.m94545o().m109394h().get(i).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof CharSequence;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Llc5$b;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "b", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "checkableItemView", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(Llc5;Landroid/view/View;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRoutingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingAdapter.kt\nco/bird/android/feature/commandcenter/routing/adapters/RoutingAdapter$RouteViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n18#2:71\n9#3,4:72\n1#4:76\n*S KotlinDebug\n*F\n+ 1 RoutingAdapter.kt\nco/bird/android/feature/commandcenter/routing/adapters/RoutingAdapter$RouteViewHolder\n*L\n65#1:71\n65#1:72,4\n*E\n"})
    /* renamed from: lc5$b */
    /* loaded from: classes3.dex */
    public final class C25741b extends C29735w1 {

        /* renamed from: b */
        public final CheckableItemView f96432b;

        /* renamed from: c */
        public boolean f96433c;

        /* renamed from: d */
        public final /* synthetic */ C44596lc5 f96434d;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"lc5$b$a", "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "view", "", "isChecked", "", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRoutingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingAdapter.kt\nco/bird/android/feature/commandcenter/routing/adapters/RoutingAdapter$RouteViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n18#2:71\n9#3,4:72\n1#4:76\n*S KotlinDebug\n*F\n+ 1 RoutingAdapter.kt\nco/bird/android/feature/commandcenter/routing/adapters/RoutingAdapter$RouteViewHolder$1\n*L\n54#1:71\n54#1:72,4\n*E\n"})
        /* renamed from: lc5$b$a */
        /* loaded from: classes3.dex */
        public static final class C25742a implements CheckableItemView.InterfaceC16699b {

            /* renamed from: b */
            public final /* synthetic */ C44596lc5 f96436b;

            public C25742a(C44596lc5 c44596lc5) {
                this.f96436b = c44596lc5;
            }

            @Override // co.bird.android.widget.standardcomponents.CheckableItemView.InterfaceC16699b
            /* renamed from: a */
            public void mo3842a(CheckableItemView view, boolean z) {
                ServiceCenterRoute route;
                Intrinsics.checkNotNullParameter(view, "view");
                int adapterPosition = C25741b.this.getAdapterPosition();
                if (!C25741b.this.f96433c && adapterPosition != -1) {
                    Object m105816c = this.f96436b.m94545o().m109397e(adapterPosition).m105816c();
                    if (!(m105816c instanceof C43410jc5)) {
                        m105816c = null;
                    }
                    C43410jc5 c43410jc5 = (C43410jc5) m105816c;
                    if (c43410jc5 != null) {
                        C44596lc5 c44596lc5 = this.f96436b;
                        if (z && (route = c43410jc5.m30200f().getRoute()) != null) {
                            c44596lc5.f96429c.onNext(Optional.f63040c.m59033b(route));
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25741b(C44596lc5 c44596lc5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f96434d = c44596lc5;
            CheckableItemView checkableItemView = (CheckableItemView) view;
            this.f96432b = checkableItemView;
            checkableItemView.setOnCheckChangedListener(new C25742a(c44596lc5));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f96433c = true;
            Object m105816c = this.f96434d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C43410jc5)) {
                m105816c = null;
            }
            C43410jc5 c43410jc5 = (C43410jc5) m105816c;
            if (c43410jc5 != null) {
                this.f96432b.m53967e(c43410jc5);
            }
            this.f96433c = false;
        }
    }

    public C44596lc5() {
        C24558d<Optional<ServiceCenterRoute>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Optional<ServiceCenterRoute>>()");
        this.f96429c = m31902e;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C45189mc5();
    }

    /* renamed from: v */
    public final Observable<Optional<ServiceCenterRoute>> m27089v() {
        Observable<Optional<ServiceCenterRoute>> hide = this.f96429c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "routeSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C36369Ui4.item_routing_header ? new C25740a(this, m41761u) : i == C36369Ui4.item_routing_route ? new C25741b(this, m41761u) : new C29735w1(m41761u);
    }
}
