package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.FleetStatusActionKind;
import co.bird.android.model.persistence.nestedstructures.FleetRating;
import co.bird.android.model.persistence.nestedstructures.FleetRatingGroup;
import co.bird.android.model.persistence.nestedstructures.FleetState;
import co.bird.android.model.persistence.nestedstructures.FleetStatusAction;
import co.bird.android.model.persistence.nestedstructures.FleetStatusKind;
import co.bird.android.model.persistence.nestedstructures.FleetSubstate;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C45325mq1;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0005*+\u001c!$B\u0007¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0012R$\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u001aj\b\u0012\u0004\u0012\u00020\u0013`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010#\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00130\u00130\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010%\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00150\u00150\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R.\u0010'\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0018  *\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00170\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"¨\u0006,"}, m28432d2 = {"Lmq1;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "", "LH6;", "sections", "u", "LF6;", "r", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusKind;", "x", "Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;", "w", "", "", "v", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "c", "Ljava/util/HashSet;", "expandedStates", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "fleetStatusKindExpandsSubject", "e", "substateSubject", "f", "ratingBirdsSubject", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetStateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1549#2:231\n1620#2,2:232\n1549#2:234\n1620#2,3:235\n1622#2:238\n1#3:239\n*S KotlinDebug\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter\n*L\n59#1:231\n59#1:232,2\n64#1:234\n64#1:235,3\n59#1:238\n*E\n"})
/* renamed from: mq1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45325mq1 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final HashSet<FleetStatusKind> f98865c = new HashSet<>();

    /* renamed from: d */
    public final C24558d<FleetStatusKind> f98866d;

    /* renamed from: e */
    public final C24558d<FleetSubstate> f98867e;

    /* renamed from: f */
    public final C24558d<List<String>> f98868f;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lmq1$a;", "Lw1;", "", "position", "", "bind", "LPb2;", "b", "LPb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lmq1;Landroid/view/View;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetStateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetRatingGroupViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,230:1\n18#2:231\n9#3,4:232\n*S KotlinDebug\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetRatingGroupViewHolder\n*L\n174#1:231\n174#1:232,4\n*E\n"})
    /* renamed from: mq1$a */
    /* loaded from: classes3.dex */
    public final class C26264a extends C29735w1 {

        /* renamed from: b */
        public final C35134Pb2 f98869b;

        /* renamed from: c */
        public final /* synthetic */ C45325mq1 f98870c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFleetStateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetRatingGroupViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,230:1\n18#2:231\n9#3,4:232\n*S KotlinDebug\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetRatingGroupViewHolder$1\n*L\n167#1:231\n167#1:232,4\n*E\n"})
        /* renamed from: mq1$a$a */
        /* loaded from: classes3.dex */
        public static final class C26265a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C45325mq1 f98872h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26265a(C45325mq1 c45325mq1) {
                super(1);
                this.f98872h = c45325mq1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                int adapterPosition = C26264a.this.getAdapterPosition();
                if (C26264a.this.getAdapterPosition() == -1) {
                    return;
                }
                Object m105816c = this.f98872h.m94545o().m109397e(adapterPosition).m105816c();
                if (!(m105816c instanceof FleetRatingGroup)) {
                    m105816c = null;
                }
                FleetRatingGroup fleetRatingGroup = (FleetRatingGroup) m105816c;
                if (fleetRatingGroup != null) {
                    this.f98872h.f98868f.onNext(fleetRatingGroup.getBirdIds());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26264a(C45325mq1 c45325mq1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f98870c = c45325mq1;
            C35134Pb2 m90079a = C35134Pb2.m90079a(view);
            Intrinsics.checkNotNullExpressionValue(m90079a, "bind(view)");
            this.f98869b = m90079a;
            ConstraintLayout root = m90079a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C26265a(c45325mq1));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f98870c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FleetRatingGroup)) {
                m105816c = null;
            }
            FleetRatingGroup fleetRatingGroup = (FleetRatingGroup) m105816c;
            if (fleetRatingGroup != null) {
                this.f98869b.f28720d.setText(fleetRatingGroup.getTitle());
                this.f98869b.f28719c.setText(String.valueOf(fleetRatingGroup.getCount()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b¢\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u0004*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m28432d2 = {"Lmq1$d;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusKind;", "Landroid/widget/ImageView;", "chevron", "e", "LKp6;", "b", "LKp6;", "getBinding", "()LKp6;", "binding", "Landroid/animation/ValueAnimator;", "c", "Landroid/animation/ValueAnimator;", "animator", "j", "()Landroid/widget/ImageView;", "Landroid/view/View;", "view", "<init>", "(Lmq1;Landroid/view/View;LKp6;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: mq1$d */
    /* loaded from: classes3.dex */
    public abstract class AbstractC26268d extends C29735w1 {

        /* renamed from: b */
        public final InterfaceC34094Kp6 f98877b;

        /* renamed from: c */
        public ValueAnimator f98878c;

        /* renamed from: d */
        public final /* synthetic */ C45325mq1 f98879d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFleetStateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetStatusKindViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n18#2:231\n18#2:236\n9#3,4:232\n9#3,4:237\n1#4:241\n*S KotlinDebug\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetStatusKindViewHolder$1\n*L\n91#1:231\n105#1:236\n91#1:232,4\n105#1:237,4\n*E\n"})
        /* renamed from: mq1$d$a */
        /* loaded from: classes3.dex */
        public static final class C26269a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C45325mq1 f98881h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26269a(C45325mq1 c45325mq1) {
                super(1);
                this.f98881h = c45325mq1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                int adapterPosition = AbstractC26268d.this.getAdapterPosition();
                if (adapterPosition == -1) {
                    return;
                }
                Object m105816c = this.f98881h.m94545o().m109397e(adapterPosition).m105816c();
                if (!(m105816c instanceof FleetStatusKind)) {
                    m105816c = null;
                }
                FleetStatusKind fleetStatusKind = (FleetStatusKind) m105816c;
                if (fleetStatusKind == null) {
                    return;
                }
                if (this.f98881h.f98865c.contains(fleetStatusKind)) {
                    this.f98881h.f98865c.remove(fleetStatusKind);
                } else {
                    this.f98881h.f98865c.add(fleetStatusKind);
                }
                C45325mq1 c45325mq1 = this.f98881h;
                c45325mq1.mo24871u(c45325mq1.m94545o().m109392j());
                AbstractC26268d abstractC26268d = AbstractC26268d.this;
                abstractC26268d.m24865e(fleetStatusKind, abstractC26268d.mo24863j());
                if (this.f98881h.f98865c.contains(fleetStatusKind)) {
                    Object m105816c2 = this.f98881h.m94545o().m109397e(adapterPosition).m105816c();
                    FleetStatusKind fleetStatusKind2 = m105816c2 instanceof FleetStatusKind ? m105816c2 : null;
                    if (fleetStatusKind2 != null) {
                        this.f98881h.f98866d.onNext(fleetStatusKind2);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC26268d(C45325mq1 c45325mq1, View view, InterfaceC34094Kp6 binding) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f98879d = c45325mq1;
            this.f98877b = binding;
            View root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C26269a(c45325mq1));
        }

        /* renamed from: i */
        public static final void m24864i(ImageView imageView, ValueAnimator anim) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            Object animatedValue = anim.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            imageView.setScaleX(((Float) animatedValue).floatValue());
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object firstOrNull;
            float f;
            List<C2637G6> m104410c = this.f98879d.m94545o().m109393i(this.f98879d.m94545o().m109397e(i)).m104410c();
            ImageView mo24863j = mo24863j();
            boolean z = false;
            if (mo24863j != null) {
                C49520tu6.show$default(mo24863j, !m104410c.isEmpty(), 0, 2, null);
            }
            this.f98877b.getRoot().setClickable(!m104410c.isEmpty());
            ImageView mo24863j2 = mo24863j();
            if (mo24863j2 != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m104410c);
                C2637G6 c2637g6 = (C2637G6) firstOrNull;
                if (c2637g6 != null && c2637g6.m105815d()) {
                    z = true;
                }
                if (z) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                mo24863j2.setScaleY(f);
            }
        }

        /* renamed from: e */
        public final void m24865e(FleetStatusKind fleetStatusKind, final ImageView imageView) {
            float f;
            if (imageView != null) {
                if (this.f98879d.f98865c.contains(fleetStatusKind)) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                ValueAnimator valueAnimator = this.f98878c;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(imageView.getScaleX(), f);
                ofFloat.setDuration(150L);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nq1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        C45325mq1.AbstractC26268d.m24864i(imageView, valueAnimator2);
                    }
                });
                ofFloat.start();
                this.f98878c = ofFloat;
            }
        }

        /* renamed from: j */
        public abstract ImageView mo24863j();
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lmq1$e;", "Lw1;", "", "position", "", "bind", "LTb2;", "b", "LTb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lmq1;Landroid/view/View;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetStateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetSubstateViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n18#2:231\n9#3,4:232\n1747#4,3:236\n*S KotlinDebug\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetSubstateViewHolder\n*L\n214#1:231\n214#1:232,4\n223#1:236,3\n*E\n"})
    /* renamed from: mq1$e */
    /* loaded from: classes3.dex */
    public final class C26270e extends C29735w1 {

        /* renamed from: b */
        public final C36070Tb2 f98882b;

        /* renamed from: c */
        public final /* synthetic */ C45325mq1 f98883c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFleetStateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetSubstateViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n18#2:231\n9#3,4:232\n1#4:236\n*S KotlinDebug\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetSubstateViewHolder$1\n*L\n209#1:231\n209#1:232,4\n*E\n"})
        /* renamed from: mq1$e$a */
        /* loaded from: classes3.dex */
        public static final class C26271a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C45325mq1 f98885h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26271a(C45325mq1 c45325mq1) {
                super(1);
                this.f98885h = c45325mq1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                int adapterPosition = C26270e.this.getAdapterPosition();
                if (C26270e.this.getAdapterPosition() == -1) {
                    return;
                }
                Object m105816c = this.f98885h.m94545o().m109397e(adapterPosition).m105816c();
                if (!(m105816c instanceof FleetSubstate)) {
                    m105816c = null;
                }
                FleetSubstate fleetSubstate = (FleetSubstate) m105816c;
                if (fleetSubstate != null) {
                    this.f98885h.f98867e.onNext(fleetSubstate);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26270e(C45325mq1 c45325mq1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f98883c = c45325mq1;
            C36070Tb2 m83361a = C36070Tb2.m83361a(view);
            Intrinsics.checkNotNullExpressionValue(m83361a, "bind(view)");
            this.f98882b = m83361a;
            LinearLayout root = m83361a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C26271a(c45325mq1));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            boolean z2;
            Object m105816c = this.f98883c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FleetSubstate)) {
                m105816c = null;
            }
            FleetSubstate fleetSubstate = (FleetSubstate) m105816c;
            if (fleetSubstate != null) {
                this.f98882b.getRoot().setBackgroundTintList(ColorStateList.valueOf(fleetSubstate.getBackgroundColor().getLightMode()));
                this.f98882b.f35718d.setText(fleetSubstate.getTitle());
                this.f98882b.f35718d.setTextColor(fleetSubstate.getTitleColor().getLightMode());
                ImageView imageView = this.f98882b.f35717c;
                ClientIcon icon = fleetSubstate.getIcon();
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                imageView.setImageDrawable(C33341Hk0.m103484a(icon, context));
                this.f98882b.f35717c.setImageTintList(ColorStateList.valueOf(fleetSubstate.getIconColor().getLightMode()));
                List<FleetStatusAction> actions = fleetSubstate.getActions();
                if (!(actions instanceof Collection) || !actions.isEmpty()) {
                    for (FleetStatusAction fleetStatusAction : actions) {
                        z = true;
                        if (fleetStatusAction.getKind() != FleetStatusActionKind.UNKNOWN) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            break;
                        }
                    }
                }
                z = false;
                ImageView imageView2 = this.f98882b.f35716b;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.chevron");
                C49520tu6.show$default(imageView2, z, 0, 2, null);
                this.f98882b.getRoot().setClickable(z);
            }
        }
    }

    public C45325mq1() {
        C24558d<FleetStatusKind> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<FleetStatusKind>()");
        this.f98866d = m31902e;
        C24558d<FleetSubstate> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<FleetSubstate>()");
        this.f98867e = m31902e2;
        C24558d<List<String>> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<List<String>>()");
        this.f98868f = m31902e3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C47697qq1());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C46511oq1();
    }

    @Override // p000.AbstractC5440My
    /* renamed from: u */
    public void mo24871u(Collection<C3023H6> sections) {
        int collectionSizeOrDefault;
        Object obj;
        boolean contains;
        int collectionSizeOrDefault2;
        List mutableList;
        Intrinsics.checkNotNullParameter(sections, "sections");
        Collection<C3023H6> collection = sections;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (C3023H6 c3023h6 : collection) {
            C2637G6 m104409d = c3023h6.m104409d();
            Object obj2 = null;
            if (m104409d != null) {
                obj = m104409d.m105816c();
            } else {
                obj = null;
            }
            if (obj instanceof FleetStatusKind) {
                HashSet<FleetStatusKind> hashSet = this.f98865c;
                C2637G6 m104409d2 = c3023h6.m104409d();
                if (m104409d2 != null) {
                    obj2 = m104409d2.m105816c();
                }
                contains = CollectionsKt___CollectionsKt.contains(hashSet, obj2);
                List<C2637G6> m104410c = c3023h6.m104410c();
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(m104410c, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                for (C2637G6 c2637g6 : m104410c) {
                    arrayList2.add(C2637G6.copy$default(c2637g6, null, 0, contains, 3, null));
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                c3023h6 = C3023H6.copy$default(c3023h6, mutableList, null, null, 6, null);
            }
            arrayList.add(c3023h6);
        }
        super.mo24871u(arrayList);
    }

    /* renamed from: v */
    public final Observable<List<String>> m24870v() {
        Observable<List<String>> hide = this.f98868f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "ratingBirdsSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<FleetSubstate> m24869w() {
        Observable<FleetSubstate> hide = this.f98867e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "substateSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<FleetStatusKind> m24868x() {
        Observable<FleetStatusKind> hide = this.f98866d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "fleetStatusKindExpandsSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        m41761u.setTag(Integer.valueOf(i));
        return i == C38125aj4.item_fleet_state ? new C26267c(this, m41761u, null, 2, null) : i == C38125aj4.item_fleet_substate ? new C26270e(this, m41761u) : i == C38125aj4.item_fleet_rating_average ? new C26266b(this, m41761u, null, 2, null) : i == C38125aj4.item_fleet_rating_group ? new C26264a(this, m41761u) : new C29735w1(m41761u);
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lmq1$b;", "Lmq1$d;", "Lmq1;", "", "position", "", "bind", "LOb2;", "e", "LOb2;", "fleetRatingBinding", "Landroid/widget/ImageView;", "j", "()Landroid/widget/ImageView;", "chevron", "Landroid/view/View;", "view", "<init>", "(Lmq1;Landroid/view/View;LOb2;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetStateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetRatingViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,230:1\n18#2:231\n9#3,4:232\n*S KotlinDebug\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetRatingViewHolder\n*L\n152#1:231\n152#1:232,4\n*E\n"})
    /* renamed from: mq1$b */
    /* loaded from: classes3.dex */
    public final class C26266b extends AbstractC26268d {

        /* renamed from: e */
        public final C34900Ob2 f98873e;

        /* renamed from: f */
        public final /* synthetic */ C45325mq1 f98874f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26266b(C45325mq1 c45325mq1, View view, C34900Ob2 fleetRatingBinding) {
            super(c45325mq1, view, fleetRatingBinding);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(fleetRatingBinding, "fleetRatingBinding");
            this.f98874f = c45325mq1;
            this.f98873e = fleetRatingBinding;
        }

        @Override // p000.C45325mq1.AbstractC26268d, p000.C29735w1
        public void bind(int i) {
            super.bind(i);
            Object m105816c = this.f98874f.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FleetRating)) {
                m105816c = null;
            }
            FleetRating fleetRating = (FleetRating) m105816c;
            if (fleetRating != null) {
                this.f98873e.f26871e.setRating((float) fleetRating.getRating());
                this.f98873e.f26869c.setText(fleetRating.getDescription());
            }
        }

        @Override // p000.C45325mq1.AbstractC26268d
        /* renamed from: j */
        public ImageView mo24863j() {
            ImageView imageView = this.f98873e.f26868b;
            Intrinsics.checkNotNullExpressionValue(imageView, "fleetRatingBinding.chevron");
            return imageView;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ C26266b(C45325mq1 c45325mq1, View view, C34900Ob2 c34900Ob2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c45325mq1, view, c34900Ob2);
            if ((i & 2) != 0) {
                c34900Ob2 = C34900Ob2.m91890a(view);
                Intrinsics.checkNotNullExpressionValue(c34900Ob2, "bind(view)");
            }
        }
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lmq1$c;", "Lmq1$d;", "Lmq1;", "", "position", "", "bind", "LQb2;", "e", "LQb2;", "fleetStateBinding", "Landroid/widget/ImageView;", "j", "()Landroid/widget/ImageView;", "chevron", "Landroid/view/View;", "view", "<init>", "(Lmq1;Landroid/view/View;LQb2;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetStateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetStateViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,230:1\n18#2:231\n9#3,4:232\n*S KotlinDebug\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetStateViewHolder\n*L\n191#1:231\n191#1:232,4\n*E\n"})
    /* renamed from: mq1$c */
    /* loaded from: classes3.dex */
    public final class C26267c extends AbstractC26268d {

        /* renamed from: e */
        public final C35368Qb2 f98875e;

        /* renamed from: f */
        public final /* synthetic */ C45325mq1 f98876f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26267c(C45325mq1 c45325mq1, View view, C35368Qb2 fleetStateBinding) {
            super(c45325mq1, view, fleetStateBinding);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(fleetStateBinding, "fleetStateBinding");
            this.f98876f = c45325mq1;
            this.f98875e = fleetStateBinding;
        }

        @Override // p000.C45325mq1.AbstractC26268d, p000.C29735w1
        public void bind(int i) {
            super.bind(i);
            Object m105816c = this.f98876f.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FleetState)) {
                m105816c = null;
            }
            FleetState fleetState = (FleetState) m105816c;
            if (fleetState != null) {
                this.f98875e.f30564e.setText(fleetState.getTitle());
                this.f98875e.f30562c.setText(fleetState.getDescription());
                ImageView imageView = this.f98875e.f30563d;
                ClientIcon icon = fleetState.getIcon();
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                imageView.setImageDrawable(C33341Hk0.m103484a(icon, context));
                this.f98875e.f30563d.setImageTintList(ColorStateList.valueOf(fleetState.getIconColor().getLightMode()));
                this.f98875e.f30563d.setBackgroundTintList(ColorStateList.valueOf(fleetState.getIconBackgroundColor().getLightMode()));
            }
        }

        @Override // p000.C45325mq1.AbstractC26268d
        /* renamed from: j */
        public ImageView mo24863j() {
            ImageView imageView = this.f98875e.f30561b;
            Intrinsics.checkNotNullExpressionValue(imageView, "fleetStateBinding.chevron");
            return imageView;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ C26267c(C45325mq1 c45325mq1, View view, C35368Qb2 c35368Qb2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c45325mq1, view, c35368Qb2);
            if ((i & 2) != 0) {
                c35368Qb2 = C35368Qb2.m88381a(view);
                Intrinsics.checkNotNullExpressionValue(c35368Qb2, "bind(view)");
            }
        }
    }
}
