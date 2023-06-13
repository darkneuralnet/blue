package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bottomsheet.BaseBottomSheet;
import co.bird.android.model.AreaBottomSheetButton;
import co.bird.android.model.AreaDirectionsButton;
import co.bird.android.model.AreaRefreshButton;
import co.bird.android.model.BottomSheetButton;
import co.bird.android.model.LearnMoreButton;
import co.bird.android.model.RefreshInfoButton;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.widget.CountdownView;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0004\u001e\u001f\u0015\u0018B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000fR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, m28432d2 = {"LNm;", "LUl0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "onDetachedFromRecyclerView", "LF6;", "r", "Lkotlin/Function1;", "Lco/bird/android/model/AreaBottomSheetButton;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "w", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "Lco/bird/android/model/BottomSheetButton;", "c", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "areaBottomSheet", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "e", "Lkotlin/jvm/functions/Function1;", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAreaBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n9#2,4:206\n1855#3,2:210\n*S KotlinDebug\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter\n*L\n59#1:206,4\n71#1:210,2\n*E\n"})
/* renamed from: Nm */
/* loaded from: classes3.dex */
public final class C5679Nm extends AbstractC36392Ul0 {

    /* renamed from: c */
    public BaseBottomSheet<BottomSheetButton> f25126c;

    /* renamed from: d */
    public RecyclerView f25127d;

    /* renamed from: e */
    public Function1<? super AreaBottomSheetButton, Unit> f25128e = C5689e.f25145g;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"LNm$a;", "Lw1;", "", "position", "", "bind", "onAttachedToWindow", "onDetachedFromWindow", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "capRestrictionView", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "c", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "location", "Landroid/view/View;", "view", "<init>", "(LNm;Landroid/view/View;)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$CapRestrictionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n18#2:206\n18#2:212\n9#3,4:207\n9#3,4:213\n1#4:211\n*S KotlinDebug\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$CapRestrictionViewHolder\n*L\n122#1:206\n133#1:212\n122#1:207,4\n133#1:213,4\n*E\n"})
    /* renamed from: Nm$a */
    /* loaded from: classes3.dex */
    public final class C5680a extends C29735w1 {

        /* renamed from: b */
        public final ConstraintLayout f25129b;

        /* renamed from: c */
        public Geolocation f25130c;

        /* renamed from: d */
        public final /* synthetic */ C5679Nm f25131d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nAreaBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$CapRestrictionViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
        /* renamed from: Nm$a$a */
        /* loaded from: classes3.dex */
        public static final class C5681a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C5679Nm f25133h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5681a(C5679Nm c5679Nm) {
                super(1);
                this.f25133h = c5679Nm;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Geolocation geolocation = C5680a.this.f25130c;
                if (geolocation != null) {
                    this.f25133h.f25128e.invoke(new AreaDirectionsButton("", geolocation));
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Nm$a$b */
        /* loaded from: classes3.dex */
        public static final class C5682b extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C5679Nm f25134g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5682b(C5679Nm c5679Nm) {
                super(1);
                this.f25134g = c5679Nm;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f25134g.f25128e.invoke(new AreaRefreshButton(""));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5680a(C5679Nm c5679Nm, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f25131d = c5679Nm;
            this.f25129b = (ConstraintLayout) view;
            TextView textView = (TextView) C49520tu6.m11238m(view, C40494eh4.directionsButton);
            if (textView != null) {
                C34585Ms2.m94661j(textView, new C5681a(c5679Nm));
            }
            TextView textView2 = (TextView) C49520tu6.m11238m(view, C40494eh4.refreshButton);
            if (textView2 != null) {
                C34585Ms2.m94661j(textView2, new C5682b(c5679Nm));
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            BaseBottomSheet baseBottomSheet = this.f25131d.f25126c;
            if (baseBottomSheet == null) {
                return;
            }
            Object m105816c = this.f25131d.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C52911ze0)) {
                m105816c = null;
            }
            C52911ze0 c52911ze0 = (C52911ze0) m105816c;
            if (c52911ze0 != null) {
                this.f25130c = c52911ze0.m943f();
                c52911ze0.m948a(this.f25129b);
            }
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            baseBottomSheet.m59078X(itemView);
        }

        @Override // p000.C29735w1
        public void onAttachedToWindow() {
            boolean z;
            DateTime m944e;
            CountdownView countdownView;
            super.onAttachedToWindow();
            Integer valueOf = Integer.valueOf(getAdapterPosition());
            if (valueOf.intValue() != -1) {
                z = true;
            } else {
                z = false;
            }
            C52911ze0 c52911ze0 = null;
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object m105816c = this.f25131d.m94545o().m109394h().get(valueOf.intValue()).m105816c();
                if (m105816c instanceof C52911ze0) {
                    c52911ze0 = m105816c;
                }
                C52911ze0 c52911ze02 = c52911ze0;
                if (c52911ze02 == null || (m944e = c52911ze02.m944e()) == null || (countdownView = (CountdownView) C49520tu6.m11238m(this.f25129b, C40494eh4.lastUpdateTextView)) == null) {
                    return;
                }
                CountdownView.init$default(countdownView, C46880pT0.m19254h(m944e), null, null, null, null, null, null, null, 254, null);
            }
        }

        @Override // p000.C29735w1
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            CountdownView countdownView = (CountdownView) C49520tu6.m11238m(itemView, C40494eh4.lastUpdateTextView);
            if (countdownView != null) {
                countdownView.m54602x();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, m28432d2 = {"LNm$b;", "Lw1;", "", "position", "", "bind", "onAttachedToWindow", "onDetachedFromWindow", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "demandAreaView", "Landroid/view/View;", "view", "<init>", "(LNm;Landroid/view/View;)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$DemandAreaViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,205:1\n18#2:206\n18#2:211\n9#3,4:207\n9#3,4:212\n*S KotlinDebug\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$DemandAreaViewHolder\n*L\n185#1:206\n191#1:211\n185#1:207,4\n191#1:212,4\n*E\n"})
    /* renamed from: Nm$b */
    /* loaded from: classes3.dex */
    public final class C5683b extends C29735w1 {

        /* renamed from: b */
        public final ConstraintLayout f25135b;

        /* renamed from: c */
        public final /* synthetic */ C5679Nm f25136c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Nm$b$a */
        /* loaded from: classes3.dex */
        public static final class C5684a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C5679Nm f25137g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5684a(C5679Nm c5679Nm) {
                super(1);
                this.f25137g = c5679Nm;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f25137g.f25128e.invoke(new RefreshInfoButton(""));
                BaseBottomSheet baseBottomSheet = this.f25137g.f25126c;
                if (baseBottomSheet != null) {
                    baseBottomSheet.m59082T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5683b(C5679Nm c5679Nm, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f25136c = c5679Nm;
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            this.f25135b = constraintLayout;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C49520tu6.m11238m(constraintLayout, C40494eh4.info);
            if (appCompatImageView != null) {
                C34585Ms2.m94661j(appCompatImageView, new C5684a(c5679Nm));
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = (TextView) C49520tu6.m11238m(this.f25135b, C40494eh4.message);
            if (textView != null) {
                Object m105816c = this.f25136c.m94545o().m109394h().get(i).m105816c();
                String str = null;
                if (!(m105816c instanceof C40680f01)) {
                    m105816c = null;
                }
                C40680f01 c40680f01 = (C40680f01) m105816c;
                if (c40680f01 != null) {
                    str = c40680f01.m42287c();
                }
                textView.setText(str);
            }
            BaseBottomSheet baseBottomSheet = this.f25136c.f25126c;
            if (baseBottomSheet != null) {
                View itemView = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                baseBottomSheet.m59078X(itemView);
            }
        }

        @Override // p000.C29735w1
        public void onAttachedToWindow() {
            DateTime dateTime;
            CountdownView countdownView;
            CountdownView countdownView2;
            super.onAttachedToWindow();
            Object m105816c = this.f25136c.m94545o().m109394h().get(getLayoutPosition()).m105816c();
            Unit unit = null;
            if (!(m105816c instanceof C40680f01)) {
                m105816c = null;
            }
            C40680f01 c40680f01 = (C40680f01) m105816c;
            if (c40680f01 != null) {
                dateTime = c40680f01.m42288b();
            } else {
                dateTime = null;
            }
            if (dateTime != null && (countdownView2 = (CountdownView) C49520tu6.m11238m(this.f25135b, C40494eh4.lastUpdateTextView)) != null) {
                CountdownView.init$default(countdownView2, C46880pT0.m19255g(dateTime), TimeUnit.MINUTES, Boolean.TRUE, null, null, null, null, null, 248, null);
                unit = Unit.INSTANCE;
            }
            if (unit == null && (countdownView = (CountdownView) C49520tu6.m11238m(this.f25135b, C40494eh4.lastUpdateTextView)) != null) {
                countdownView.setText(getContext().getString(C45871nl4.update_in_progress));
            }
        }

        @Override // p000.C29735w1
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            CountdownView countdownView = (CountdownView) C49520tu6.m11238m(itemView, C40494eh4.lastUpdateTextView);
            if (countdownView != null) {
                countdownView.m54602x();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, m28432d2 = {"LNm$c;", "Lw1;", "", "position", "", "bind", "onAttachedToWindow", "onDetachedFromWindow", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "refreshView", "Landroid/view/View;", "view", "<init>", "(LNm;Landroid/view/View;)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$RefreshViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,205:1\n1#2:206\n18#3:207\n9#4,4:208\n*S KotlinDebug\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$RefreshViewHolder\n*L\n162#1:207\n162#1:208,4\n*E\n"})
    /* renamed from: Nm$c */
    /* loaded from: classes3.dex */
    public final class C5685c extends C29735w1 {

        /* renamed from: b */
        public final ConstraintLayout f25138b;

        /* renamed from: c */
        public final /* synthetic */ C5679Nm f25139c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Nm$c$a */
        /* loaded from: classes3.dex */
        public static final class C5686a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C5679Nm f25140g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5686a(C5679Nm c5679Nm) {
                super(1);
                this.f25140g = c5679Nm;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f25140g.f25128e.invoke(new AreaRefreshButton(""));
                BaseBottomSheet baseBottomSheet = this.f25140g.f25126c;
                if (baseBottomSheet != null) {
                    baseBottomSheet.m59082T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5685c(C5679Nm c5679Nm, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f25139c = c5679Nm;
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            this.f25138b = constraintLayout;
            TextView textView = (TextView) C49520tu6.m11238m(constraintLayout, C40494eh4.refreshButton);
            if (textView != null) {
                C34585Ms2.m94661j(textView, new C5686a(c5679Nm));
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            BaseBottomSheet baseBottomSheet = this.f25139c.f25126c;
            if (baseBottomSheet != null) {
                View itemView = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                baseBottomSheet.m59078X(itemView);
            }
        }

        @Override // p000.C29735w1
        public void onAttachedToWindow() {
            boolean z;
            CountdownView countdownView;
            super.onAttachedToWindow();
            Integer valueOf = Integer.valueOf(getAdapterPosition());
            if (valueOf.intValue() != -1) {
                z = true;
            } else {
                z = false;
            }
            DateTime dateTime = null;
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.intValue();
                Object m105816c = this.f25139c.m94545o().m109394h().get(getPosition()).m105816c();
                if (m105816c instanceof DateTime) {
                    dateTime = m105816c;
                }
                DateTime dateTime2 = dateTime;
                if (dateTime2 == null || (countdownView = (CountdownView) C49520tu6.m11238m(this.f25138b, C40494eh4.lastUpdateTextView)) == null) {
                    return;
                }
                CountdownView.init$default(countdownView, C46880pT0.m19254h(dateTime2), null, null, null, null, null, null, null, 254, null);
            }
        }

        @Override // p000.C29735w1
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            CountdownView countdownView = (CountdownView) C49520tu6.m11238m(itemView, C40494eh4.lastUpdateTextView);
            if (countdownView != null) {
                countdownView.m54602x();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LNm$d;", "Lw1;", "", "position", "", "bind", "LQf2;", "b", "LQf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LNm;Landroid/view/View;)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$TitleMessageViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,205:1\n18#2:206\n9#3,4:207\n*S KotlinDebug\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$TitleMessageViewHolder\n*L\n88#1:206\n88#1:207,4\n*E\n"})
    /* renamed from: Nm$d */
    /* loaded from: classes3.dex */
    public final class C5687d extends C29735w1 {

        /* renamed from: b */
        public final C35404Qf2 f25141b;

        /* renamed from: c */
        public final /* synthetic */ C5679Nm f25142c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Nm$d$a */
        /* loaded from: classes3.dex */
        public static final class C5688a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C5679Nm f25143g;

            /* renamed from: h */
            public final /* synthetic */ long f25144h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5688a(C5679Nm c5679Nm, long j) {
                super(1);
                this.f25143g = c5679Nm;
                this.f25144h = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f25143g.f25128e.invoke(new LearnMoreButton(null, this.f25144h, 1, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5687d(C5679Nm c5679Nm, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f25142c = c5679Nm;
            C35404Qf2 m88273a = C35404Qf2.m88273a(view);
            Intrinsics.checkNotNullExpressionValue(m88273a, "bind(view)");
            this.f25141b = m88273a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Unit unit;
            BaseBottomSheet baseBottomSheet = this.f25142c.f25126c;
            if (baseBottomSheet != null) {
                C5679Nm c5679Nm = this.f25142c;
                Object m105816c = c5679Nm.m94545o().m109394h().get(i).m105816c();
                if (!(m105816c instanceof C38346b56)) {
                    m105816c = null;
                }
                C38346b56 c38346b56 = (C38346b56) m105816c;
                if (c38346b56 != null) {
                    this.f25141b.f30706g.setText(c38346b56.m64982c());
                    Integer m64980e = c38346b56.m64980e();
                    if (m64980e != null) {
                        this.f25141b.f30702c.setImageResource(m64980e.intValue());
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        ImageView imageView = this.f25141b.f30702c;
                        Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
                        C49520tu6.show$default(imageView, false, 0, 2, null);
                    }
                    this.f25141b.f30701b.setText(c38346b56.m64983b());
                    Long m64979f = c38346b56.m64979f();
                    if (m64979f != null) {
                        long longValue = m64979f.longValue();
                        TextView textView = this.f25141b.f30703d;
                        Intrinsics.checkNotNullExpressionValue(textView, "binding.learnMore");
                        C49520tu6.m11233r(textView);
                        TextView textView2 = this.f25141b.f30703d;
                        Intrinsics.checkNotNullExpressionValue(textView2, "binding.learnMore");
                        C34585Ms2.m94661j(textView2, new C5688a(c5679Nm, longValue));
                    }
                    this.f25141b.f30707h.setBackgroundTintList(ColorStateList.valueOf(c38346b56.m64981d()));
                }
                View itemView = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                baseBottomSheet.m59078X(itemView);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/AreaBottomSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/AreaBottomSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Nm$e */
    /* loaded from: classes3.dex */
    public static final class C5689e extends Lambda implements Function1<AreaBottomSheetButton, Unit> {

        /* renamed from: g */
        public static final C5689e f25145g = new C5689e();

        public C5689e() {
            super(1);
        }

        /* renamed from: a */
        public final void m93470a(AreaBottomSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AreaBottomSheetButton areaBottomSheetButton) {
            m93470a(areaBottomSheetButton);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f25127d = recyclerView;
        ViewParent parent = recyclerView.getParent();
        if (parent != null) {
            z = parent instanceof BaseBottomSheet;
        } else {
            z = true;
        }
        if (!z) {
            parent = null;
        }
        this.f25126c = (BaseBottomSheet) parent;
        if (recyclerView.getItemDecorationCount() == 0) {
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "recyclerView.context");
            recyclerView.addItemDecoration(new C6890Qm(context));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IntRange until;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f25127d = null;
        this.f25126c = null;
        until = RangesKt___RangesKt.until(0, recyclerView.getItemDecorationCount());
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            recyclerView.removeItemDecorationAt(((IntIterator) it).nextInt());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C6108Om();
    }

    /* renamed from: w */
    public final void m93472w(Function1<? super AreaBottomSheetButton, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f25128e = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32409Dk4.item_cap_restriction ? new C5680a(this, m41761u) : i == C32409Dk4.item_refresh ? new C5685c(this, m41761u) : i == C32409Dk4.item_demand_area ? new C5683b(this, m41761u) : i == C32409Dk4.item_title_message ? new C5687d(this, m41761u) : new C29735w1(m41761u);
    }
}
