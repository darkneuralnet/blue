package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRating;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRatingTag;
import com.facebook.share.internal.C17296a;
import com.google.android.material.chip.Chip;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\t\b\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\r"}, m28432d2 = {"LxR;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "<init>", "()V", C17296a.f69688o, "b", "c", "co.bird.android.feature.bird-rating-history"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xR */
/* loaded from: classes3.dex */
public final class C30169xR extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LxR$a;", "Lw1;", "", "position", "", "bind", "LYs6;", "b", "LYs6;", "binding", "Landroid/view/View;", "view", "<init>", "(LxR;Landroid/view/View;)V", "co.bird.android.feature.bird-rating-history"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdRatingHistoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRatingHistoryAdapter.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryAdapter$RatingSummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,101:1\n18#2:102\n9#3,4:103\n*S KotlinDebug\n*F\n+ 1 BirdRatingHistoryAdapter.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryAdapter$RatingSummaryViewHolder\n*L\n44#1:102\n44#1:103,4\n*E\n"})
    /* renamed from: xR$a */
    /* loaded from: classes3.dex */
    public final class C30170a extends C29735w1 {

        /* renamed from: b */
        public final C37397Ys6 f117599b;

        /* renamed from: c */
        public final /* synthetic */ C30169xR f117600c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30170a(C30169xR c30169xR, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f117600c = c30169xR;
            C37397Ys6 m74044a = C37397Ys6.m74044a(view);
            Intrinsics.checkNotNullExpressionValue(m74044a, "bind(view)");
            this.f117599b = m74044a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f117600c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C45891nn4)) {
                m105816c = null;
            }
            C45891nn4 c45891nn4 = (C45891nn4) m105816c;
            if (c45891nn4 != null) {
                TextView textView = this.f117599b.f47587c;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("# %s", Arrays.copyOf(new Object[]{c45891nn4.m23145c()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                textView.setText(format);
                TextView textView2 = this.f117599b.f47586b;
                String format2 = String.format("%1.1f avg.", Arrays.copyOf(new Object[]{Double.valueOf(c45891nn4.m23146b())}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
                textView2.setText(format2);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LxR$b;", "Lw1;", "", "position", "", "bind", "Landroid/view/View;", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "LHc2;", "c", "LHc2;", "binding", "<init>", "(LxR;Landroid/view/View;)V", "co.bird.android.feature.bird-rating-history"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdRatingHistoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRatingHistoryAdapter.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryAdapter$RideRatingTagsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n18#2:102\n9#3,4:103\n1855#4,2:107\n*S KotlinDebug\n*F\n+ 1 BirdRatingHistoryAdapter.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryAdapter$RideRatingTagsViewHolder\n*L\n72#1:102\n72#1:103,4\n73#1:107,2\n*E\n"})
    /* renamed from: xR$b */
    /* loaded from: classes3.dex */
    public final class C30171b extends C29735w1 {

        /* renamed from: b */
        public final View f117601b;

        /* renamed from: c */
        public final C33271Hc2 f117602c;

        /* renamed from: d */
        public final /* synthetic */ C30169xR f117603d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30171b(C30169xR c30169xR, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f117603d = c30169xR;
            this.f117601b = view;
            C33271Hc2 m103656a = C33271Hc2.m103656a(view);
            Intrinsics.checkNotNullExpressionValue(m103656a, "bind(view)");
            this.f117602c = m103656a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            this.f117602c.f13638c.removeAllViews();
            Object m105816c = this.f117603d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof List)) {
                m105816c = null;
            }
            List<FlightSheetRideRatingTag> list = (List) m105816c;
            if (list != null) {
                for (FlightSheetRideRatingTag flightSheetRideRatingTag : list) {
                    Context context = this.f117601b.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "view.context");
                    C35195Pi0 m89909c = C35195Pi0.m89909c(C40788fB0.m41772j(context));
                    Intrinsics.checkNotNullExpressionValue(m89909c, "inflate(view.context.layoutInflater)");
                    Chip root = m89909c.getRoot();
                    if (flightSheetRideRatingTag.getCount() > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    root.setChipIconVisible(z);
                    m89909c.getRoot().setText(flightSheetRideRatingTag.getLabel());
                    if (flightSheetRideRatingTag.getCount() > 1) {
                        Context context2 = this.f117601b.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "view.context");
                        C37631Zs6 m72354c = C37631Zs6.m72354c(C40788fB0.m41772j(context2));
                        m72354c.getRoot().setLayoutParams(new ViewGroup.LayoutParams((int) C49347td3.m12001b(20), (int) C49347td3.m12001b(20)));
                        Intrinsics.checkNotNullExpressionValue(m72354c, "inflate(view.context.lay…Px.toInt())\n            }");
                        m72354c.getRoot().setText(String.valueOf(flightSheetRideRatingTag.getCount()));
                        TextView root2 = m72354c.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root2, "countBinding.root");
                        C36209Tq6 c36209Tq6 = new C36209Tq6(root2);
                        c36209Tq6.setBounds(0, 0, (int) C49347td3.m12001b(20), (int) C49347td3.m12001b(20));
                        m89909c.getRoot().setChipIcon(c36209Tq6);
                    }
                    this.f117602c.f13638c.addView(m89909c.getRoot());
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LxR$c;", "Lw1;", "", "position", "", "bind", "LDr6;", "b", "LDr6;", "binding", "Landroid/view/View;", "view", "<init>", "(LxR;Landroid/view/View;)V", "co.bird.android.feature.bird-rating-history"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdRatingHistoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRatingHistoryAdapter.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryAdapter$RideRatingsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,101:1\n18#2:102\n9#3,4:103\n*S KotlinDebug\n*F\n+ 1 BirdRatingHistoryAdapter.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryAdapter$RideRatingsViewHolder\n*L\n55#1:102\n55#1:103,4\n*E\n"})
    /* renamed from: xR$c */
    /* loaded from: classes3.dex */
    public final class C30172c extends C29735w1 {

        /* renamed from: b */
        public final C32474Dr6 f117604b;

        /* renamed from: c */
        public final /* synthetic */ C30169xR f117605c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30172c(C30169xR c30169xR, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f117605c = c30169xR;
            C32474Dr6 m109847a = C32474Dr6.m109847a(view);
            Intrinsics.checkNotNullExpressionValue(m109847a, "bind(view)");
            this.f117604b = m109847a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f117605c.m94545o().m109397e(i).m105816c();
            Unit unit = null;
            if (!(m105816c instanceof FlightSheetRideRating)) {
                m105816c = null;
            }
            FlightSheetRideRating flightSheetRideRating = (FlightSheetRideRating) m105816c;
            if (flightSheetRideRating != null) {
                this.f117604b.f6436b.setLabel(flightSheetRideRating.getLabel());
                this.f117604b.f6436b.setRating((float) flightSheetRideRating.getRating());
                String feedback = flightSheetRideRating.getFeedback();
                if (feedback != null) {
                    this.f117604b.f6437c.setText(feedback);
                    TextView textView = this.f117604b.f6437c;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.reviewBox");
                    C49520tu6.m11233r(textView);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    TextView textView2 = this.f117604b.f6437c;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.reviewBox");
                    C49520tu6.m11239l(textView2);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C31941Bk4.view_rating_summary ? new C30170a(this, m41761u) : i == C45268mk4.view_labeled_ride_rating_with_review ? new C30172c(this, m41761u) : i == C45268mk4.item_labeled_tags ? new C30171b(this, m41761u) : new C29735w1(m41761u);
    }
}
