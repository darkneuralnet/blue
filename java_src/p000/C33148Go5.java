package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.bird.android.model.wire.WireItemScrapReason;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.subjects.C24567g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\t0\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m28432d2 = {"LGo5;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireItemScrapReason;", "v", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/g;", "scrapOrderReasonSingle", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Go5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33148Go5 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24567g<WireItemScrapReason> f12489c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LGo5$a;", "Lw1;", "", "position", "", "bind", "LBf2;", "b", "LBf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LGo5;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapOrderReasonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderReasonAdapter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/dialogs/adapter/ScrapOrderReasonAdapter$ScrapReasonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,47:1\n18#2:48\n9#3,4:49\n*S KotlinDebug\n*F\n+ 1 ScrapOrderReasonAdapter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/dialogs/adapter/ScrapOrderReasonAdapter$ScrapReasonViewHolder\n*L\n41#1:48\n41#1:49,4\n*E\n"})
    /* renamed from: Go5$a */
    /* loaded from: classes3.dex */
    public final class C2952a extends C29735w1 {

        /* renamed from: b */
        public final C31894Bf2 f12490b;

        /* renamed from: c */
        public final /* synthetic */ C33148Go5 f12491c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nScrapOrderReasonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderReasonAdapter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/dialogs/adapter/ScrapOrderReasonAdapter$ScrapReasonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n18#2:48\n9#3,4:49\n1#4:53\n*S KotlinDebug\n*F\n+ 1 ScrapOrderReasonAdapter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/dialogs/adapter/ScrapOrderReasonAdapter$ScrapReasonViewHolder$1\n*L\n35#1:48\n35#1:49,4\n*E\n"})
        /* renamed from: Go5$a$a */
        /* loaded from: classes3.dex */
        public static final class C2953a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C33148Go5 f12492g;

            /* renamed from: h */
            public final /* synthetic */ C2952a f12493h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2953a(C33148Go5 c33148Go5, C2952a c2952a) {
                super(1);
                this.f12492g = c33148Go5;
                this.f12493h = c2952a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C1737E6 m94545o = this.f12492g.m94545o();
                Integer safePosition = this.f12493h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof WireItemScrapReason)) {
                        m105816c = null;
                    }
                    WireItemScrapReason wireItemScrapReason = (WireItemScrapReason) m105816c;
                    if (wireItemScrapReason != null) {
                        this.f12492g.f12489c.onSuccess(wireItemScrapReason);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2952a(C33148Go5 c33148Go5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f12491c = c33148Go5;
            C31894Bf2 m113732a = C31894Bf2.m113732a(view);
            Intrinsics.checkNotNullExpressionValue(m113732a, "bind(view)");
            this.f12490b = m113732a;
            TextView root = m113732a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C2953a(c33148Go5, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f12491c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof WireItemScrapReason)) {
                m105816c = null;
            }
            WireItemScrapReason wireItemScrapReason = (WireItemScrapReason) m105816c;
            if (wireItemScrapReason != null) {
                this.f12490b.f2638b.setText(wireItemScrapReason.getTitle());
            }
        }
    }

    public C33148Go5() {
        C24567g<WireItemScrapReason> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<WireItemScrapReason>()");
        this.f12489c = m31882w0;
    }

    /* renamed from: v */
    public final AbstractC23442F<WireItemScrapReason> m104701v() {
        AbstractC23442F<WireItemScrapReason> m33160F = this.f12489c.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "scrapOrderReasonSingle.hide()");
        return m33160F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_scrap_reason ? new C2952a(this, m41761u) : new C29735w1(m41761u);
    }
}
