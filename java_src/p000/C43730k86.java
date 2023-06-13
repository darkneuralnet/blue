package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import co.bird.android.model.wire.WireTransferOrderFilter;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\t0\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m28432d2 = {"Lk86;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "S4", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "filterRelay", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: k86  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43730k86 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<WireTransferOrderFilter> f93994c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lk86$a;", "Lw1;", "", "position", "", "bind", "Lle2;", "b", "Lle2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lk86;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransferOrderLandingFiltersAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderLandingFiltersAdapter.kt\nco/bird/android/feature/transferorder/landing/filters/adapters/TransferOrderLandingFiltersAdapter$FilterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n18#2:52\n9#3,4:53\n1#4:57\n*S KotlinDebug\n*F\n+ 1 TransferOrderLandingFiltersAdapter.kt\nco/bird/android/feature/transferorder/landing/filters/adapters/TransferOrderLandingFiltersAdapter$FilterViewHolder\n*L\n44#1:52\n44#1:53,4\n*E\n"})
    /* renamed from: k86$a */
    /* loaded from: classes3.dex */
    public final class C25116a extends C29735w1 {

        /* renamed from: b */
        public final C44613le2 f93995b;

        /* renamed from: c */
        public final /* synthetic */ C43730k86 f93996c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nTransferOrderLandingFiltersAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderLandingFiltersAdapter.kt\nco/bird/android/feature/transferorder/landing/filters/adapters/TransferOrderLandingFiltersAdapter$FilterViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n18#2:52\n9#3,4:53\n1#4:57\n*S KotlinDebug\n*F\n+ 1 TransferOrderLandingFiltersAdapter.kt\nco/bird/android/feature/transferorder/landing/filters/adapters/TransferOrderLandingFiltersAdapter$FilterViewHolder$1\n*L\n37#1:52\n37#1:53,4\n*E\n"})
        /* renamed from: k86$a$a */
        /* loaded from: classes3.dex */
        public static final class C25117a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C43730k86 f93997g;

            /* renamed from: h */
            public final /* synthetic */ C25116a f93998h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25117a(C43730k86 c43730k86, C25116a c25116a) {
                super(1);
                this.f93997g = c43730k86;
                this.f93998h = c25116a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                WireTransferOrderFilter wireTransferOrderFilter;
                C1737E6 m94545o = this.f93997g.m94545o();
                Integer safePosition = this.f93998h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof Pair)) {
                        m105816c = null;
                    }
                    Pair pair = (Pair) m105816c;
                    if (pair == null || (wireTransferOrderFilter = (WireTransferOrderFilter) pair.getFirst()) == null) {
                        return;
                    }
                    this.f93997g.f93994c.accept(wireTransferOrderFilter);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25116a(C43730k86 c43730k86, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f93996c = c43730k86;
            C44613le2 m27061a = C44613le2.m27061a(view);
            Intrinsics.checkNotNullExpressionValue(m27061a, "bind(view)");
            this.f93995b = m27061a;
            CheckBox checkBox = m27061a.f96476b;
            Intrinsics.checkNotNullExpressionValue(checkBox, "binding.label");
            C34585Ms2.m94661j(checkBox, new C25117a(c43730k86, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f93996c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
                this.f93995b.f96476b.setText(((WireTransferOrderFilter) pair.component1()).getTitle());
                this.f93995b.f96476b.setChecked(booleanValue);
            }
        }
    }

    public C43730k86() {
        C45168ma4<WireTransferOrderFilter> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<WireTransferOrderFilter>()");
        this.f93994c = m25409g;
    }

    /* renamed from: S4 */
    public final Observable<WireTransferOrderFilter> m29243S4() {
        Observable<WireTransferOrderFilter> hide = this.f93994c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "filterRelay.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_order_item_filter ? new C25116a(this, m41761u) : new C29735w1(m41761u);
    }
}
