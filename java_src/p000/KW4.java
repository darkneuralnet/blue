package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.persistence.RidePassView;
import co.bird.android.model.persistence.nestedstructures.RidePassSubscriptionPlanView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, m28432d2 = {"LKW4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "<init>", "()V", C17296a.f69688o, "b", "c", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KW4 */
/* loaded from: classes3.dex */
public final class KW4 extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LKW4$a;", "Lw1;", "", "position", "", "bind", "Lnf2;", "b", "Lnf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LKW4;Landroid/view/View;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePassV4DetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4DetailsAdapter.kt\nco/bird/android/feature/ridepass/v4/details/adapter/RidePassV4DetailsAdapter$BenefitViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,78:1\n18#2:79\n9#3,4:80\n*S KotlinDebug\n*F\n+ 1 RidePassV4DetailsAdapter.kt\nco/bird/android/feature/ridepass/v4/details/adapter/RidePassV4DetailsAdapter$BenefitViewHolder\n*L\n66#1:79\n66#1:80,4\n*E\n"})
    /* renamed from: KW4$a */
    /* loaded from: classes3.dex */
    public final class C4458a extends C29735w1 {

        /* renamed from: b */
        public final C45809nf2 f19711b;

        /* renamed from: c */
        public final /* synthetic */ KW4 f19712c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4458a(KW4 kw4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f19712c = kw4;
            C45809nf2 m23345a = C45809nf2.m23345a(view);
            Intrinsics.checkNotNullExpressionValue(m23345a, "bind(view)");
            this.f19711b = m23345a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f19711b.f100285b;
            Object m105816c = this.f19712c.m94545o().m109397e(i).m105816c();
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

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LKW4$b;", "Lw1;", "", "position", "", "bind", "Lof2;", "b", "Lof2;", "binding", "Landroid/view/View;", "view", "<init>", "(LKW4;Landroid/view/View;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePassV4DetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4DetailsAdapter.kt\nco/bird/android/feature/ridepass/v4/details/adapter/RidePassV4DetailsAdapter$FooterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,78:1\n18#2:79\n9#3,4:80\n*S KotlinDebug\n*F\n+ 1 RidePassV4DetailsAdapter.kt\nco/bird/android/feature/ridepass/v4/details/adapter/RidePassV4DetailsAdapter$FooterViewHolder\n*L\n74#1:79\n74#1:80,4\n*E\n"})
    /* renamed from: KW4$b */
    /* loaded from: classes3.dex */
    public final class C4459b extends C29735w1 {

        /* renamed from: b */
        public final C46402of2 f19713b;

        /* renamed from: c */
        public final /* synthetic */ KW4 f19714c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4459b(KW4 kw4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f19714c = kw4;
            C46402of2 m20685a = C46402of2.m20685a(view);
            Intrinsics.checkNotNullExpressionValue(m20685a, "bind(view)");
            this.f19713b = m20685a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f19713b.f102282c;
            Object m105816c = this.f19714c.m94545o().m109397e(i).m105816c();
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

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LKW4$c;", "Lw1;", "", "position", "", "bind", "Lpf2;", "b", "Lpf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LKW4;Landroid/view/View;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePassV4DetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4DetailsAdapter.kt\nco/bird/android/feature/ridepass/v4/details/adapter/RidePassV4DetailsAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,78:1\n18#2:79\n9#3,4:80\n*S KotlinDebug\n*F\n+ 1 RidePassV4DetailsAdapter.kt\nco/bird/android/feature/ridepass/v4/details/adapter/RidePassV4DetailsAdapter$HeaderViewHolder\n*L\n41#1:79\n41#1:80,4\n*E\n"})
    /* renamed from: KW4$c */
    /* loaded from: classes3.dex */
    public final class C4460c extends C29735w1 {

        /* renamed from: b */
        public final C46995pf2 f19715b;

        /* renamed from: c */
        public final /* synthetic */ KW4 f19716c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4460c(KW4 kw4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f19716c = kw4;
            C46995pf2 m19010a = C46995pf2.m19010a(view);
            Intrinsics.checkNotNullExpressionValue(m19010a, "bind(view)");
            this.f19715b = m19010a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String str;
            String str2;
            Object m105816c = this.f19716c.m94545o().m109397e(i).m105816c();
            String str3 = null;
            if (!(m105816c instanceof TU4)) {
                m105816c = null;
            }
            TU4 tu4 = (TU4) m105816c;
            if (tu4 != null) {
                RidePassView m83573b = tu4.m83573b();
                this.f19715b.f103896f.setText(m83573b.getTitle());
                this.f19715b.f103895e.setText(m83573b.getDetailBody());
                String currency$default = C51916xx1.currency$default(C51916xx1.f118396a, m83573b.getPrice(), C45097mS5.m25591o(m83573b.getCurrency()), null, 4, null);
                if (tu4.m83572c()) {
                    str = " " + this.f19715b.f103896f.getContext().getString(C45871nl4.plus_tax);
                } else {
                    str = "";
                }
                RidePassSubscriptionPlanView subscriptionPlan = m83573b.getSubscriptionPlan();
                if (subscriptionPlan != null) {
                    str3 = subscriptionPlan.getBillingIntervalDescription();
                }
                TextView textView = this.f19715b.f103894d;
                if (str3 != null) {
                    str2 = currency$default + str + "/" + str3;
                } else {
                    str2 = currency$default + str;
                }
                textView.setText(str2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new MW4());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C33102Gj4.item_ride_pass_v4_details_header ? new C4460c(this, m41761u) : i == C33102Gj4.item_ride_pass_v4_details_benefit ? new C4458a(this, m41761u) : i == C33102Gj4.item_ride_pass_v4_details_footer ? new C4459b(this, m41761u) : new C29735w1(m41761u);
    }
}
