package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import com.google.android.material.card.MaterialCardView;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\r0\r0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m28432d2 = {"LAW4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/RidePassView;", "z8", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "ridePassClicksRelay", "<init>", "()V", C17296a.f69688o, "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AW4 */
/* loaded from: classes3.dex */
public final class AW4 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<RidePassView> f669c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LAW4$a;", "Lw1;", "", "position", "", "bind", "Lmf2;", "b", "Lmf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LAW4;Landroid/view/View;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePassV4Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4Adapter.kt\nco/bird/android/feature/ridepass/v4/list/adapter/RidePassV4Adapter$RidePassViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,77:1\n18#2:78\n9#3,4:79\n*S KotlinDebug\n*F\n+ 1 RidePassV4Adapter.kt\nco/bird/android/feature/ridepass/v4/list/adapter/RidePassV4Adapter$RidePassViewHolder\n*L\n52#1:78\n52#1:79,4\n*E\n"})
    /* renamed from: AW4$a */
    /* loaded from: classes3.dex */
    public final class C0117a extends C29735w1 {

        /* renamed from: b */
        public final C45216mf2 f670b;

        /* renamed from: c */
        public final /* synthetic */ AW4 f671c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRidePassV4Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4Adapter.kt\nco/bird/android/feature/ridepass/v4/list/adapter/RidePassV4Adapter$RidePassViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n18#2:78\n9#3,4:79\n1#4:83\n*S KotlinDebug\n*F\n+ 1 RidePassV4Adapter.kt\nco/bird/android/feature/ridepass/v4/list/adapter/RidePassV4Adapter$RidePassViewHolder$1\n*L\n45#1:78\n45#1:79,4\n*E\n"})
        /* renamed from: AW4$a$a */
        /* loaded from: classes3.dex */
        public static final class C0118a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AW4 f672g;

            /* renamed from: h */
            public final /* synthetic */ C0117a f673h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0118a(AW4 aw4, C0117a c0117a) {
                super(1);
                this.f672g = aw4;
                this.f673h = c0117a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                RidePassView m107024d;
                C1737E6 m94545o = this.f672g.m94545o();
                Integer safePosition = this.f673h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof FX4)) {
                        m105816c = null;
                    }
                    FX4 fx4 = (FX4) m105816c;
                    if (fx4 == null || (m107024d = fx4.m107024d()) == null) {
                        return;
                    }
                    this.f672g.f669c.accept(m107024d);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0117a(AW4 aw4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f671c = aw4;
            C45216mf2 m25217a = C45216mf2.m25217a(view);
            Intrinsics.checkNotNullExpressionValue(m25217a, "bind(view)");
            this.f670b = m25217a;
            MaterialCardView root = m25217a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C0118a(aw4, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            boolean z2;
            boolean z3;
            Object m105816c = this.f671c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FX4)) {
                m105816c = null;
            }
            FX4 fx4 = (FX4) m105816c;
            if (fx4 != null) {
                TextView textView = this.f670b.f98529i;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.tag");
                C49520tu6.show$default(textView, fx4.m107020h(), 0, 2, null);
                this.f670b.f98530j.setText(fx4.m107021g());
                this.f670b.f98523c.setText(fx4.m107026b());
                this.f670b.f98527g.setText(fx4.m107023e());
                TextView textView2 = this.f670b.f98527g;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.subscription");
                boolean z4 = true;
                if (fx4.m107023e() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(textView2, z, 0, 2, null);
                this.f670b.f98526f.setText(fx4.m107025c());
                TextView textView3 = this.f670b.f98526f;
                Intrinsics.checkNotNullExpressionValue(textView3, "binding.promoTag");
                if (fx4.m107025c() != null && fx4.m107023e() == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C49520tu6.show$default(textView3, z2, 0, 2, null);
                this.f670b.f98528h.setText(fx4.m107022f());
                TextView textView4 = this.f670b.f98528h;
                Intrinsics.checkNotNullExpressionValue(textView4, "binding.subscriptionInfo");
                if (fx4.m107022f() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C49520tu6.show$default(textView4, z3, 0, 2, null);
                View view = this.f670b.f98525e;
                Intrinsics.checkNotNullExpressionValue(view, "binding.divider");
                if (fx4.m107022f() == null) {
                    z4 = false;
                }
                C49520tu6.show$default(view, z4, 0, 2, null);
            }
        }
    }

    public AW4() {
        C45168ma4<RidePassView> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<RidePassView>()");
        this.f669c = m25409g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C49291tX4());
        }
    }

    /* renamed from: z8 */
    public final Observable<RidePassView> m115687z8() {
        Observable<RidePassView> hide = this.f669c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "ridePassClicksRelay.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C33102Gj4.item_ride_pass_v4_card ? new C0117a(this, m41761u) : new C29735w1(m41761u);
    }
}
