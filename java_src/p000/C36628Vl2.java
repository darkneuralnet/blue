package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.OrderItemType;
import co.bird.android.model.wire.WireOrderItemView;
import co.bird.android.widget.standardcomponents.CollapsableHeaderView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC36392Ul0;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0005./\"%)B\u0007¢\u0006\u0004\b,\u0010-J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019J\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b0\u0019J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\"\u0010$\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u000b0\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R:\u0010&\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d !*\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b0\u001b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001e\u0010+\u001a\f\u0012\b\u0012\u00060(R\u00020\u00000'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u00060"}, m28432d2 = {"LVl2;", "LUl0;", "LQQ5;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "position", "n", "(I)Ljava/lang/Integer;", "j", "Landroid/view/View;", "view", "headerPosition", "i", "", "k", "Lio/reactivex/Observable;", "w", "Lkotlin/Pair;", "", "Lco/bird/android/model/constant/OrderItemType;", "x", "y", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "calendarRangeSubject", DateTokenConverter.CONVERTER_KEY, "orderItemIdSubject", "", "LVl2$d;", "e", "Ljava/util/Set;", "clickableHeaders", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapter\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n*S KotlinDebug\n*F\n+ 1 LandingAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapter\n*L\n71#1:168\n71#1:169,4\n*E\n"})
/* renamed from: Vl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36628Vl2 extends AbstractC36392Ul0 implements QQ5 {

    /* renamed from: c */
    public final C24558d<Unit> f39704c;

    /* renamed from: d */
    public final C24558d<Pair<String, OrderItemType>> f39705d;

    /* renamed from: e */
    public final Set<C8789d> f39706e;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LVl2$a;", "Lw1;", "", "position", "", "bind", "Lhe2;", "b", "Lhe2;", "binding", "Landroid/view/View;", "view", "<init>", "(LVl2;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapter$CalendarRangeViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n*S KotlinDebug\n*F\n+ 1 LandingAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapter$CalendarRangeViewHolder\n*L\n118#1:168\n118#1:169,4\n*E\n"})
    /* renamed from: Vl2$a */
    /* loaded from: classes3.dex */
    public final class C8784a extends C29735w1 {

        /* renamed from: b */
        public final C42241he2 f39707b;

        /* renamed from: c */
        public final /* synthetic */ C36628Vl2 f39708c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Vl2$a$a */
        /* loaded from: classes3.dex */
        public static final class C8785a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36628Vl2 f39709g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8785a(C36628Vl2 c36628Vl2) {
                super(1);
                this.f39709g = c36628Vl2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f39709g.f39704c.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8784a(C36628Vl2 c36628Vl2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39708c = c36628Vl2;
            C42241he2 m36120a = C42241he2.m36120a(view);
            Intrinsics.checkNotNullExpressionValue(m36120a, "bind(view)");
            this.f39707b = m36120a;
            ConstraintLayout root = m36120a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C8785a(c36628Vl2));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = this.f39707b.f85626d;
            Object m105816c = this.f39708c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LVl2$b;", "Lw1;", "", "position", "", "bind", "Lge2;", "b", "Lge2;", "binding", "Lxy3;", "c", "Lxy3;", "adapter", "Landroid/view/View;", "view", "<init>", "(LVl2;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapter$ContainerOrderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n1#4:173\n*S KotlinDebug\n*F\n+ 1 LandingAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapter$ContainerOrderViewHolder\n*L\n161#1:168\n161#1:169,4\n*E\n"})
    /* renamed from: Vl2$b */
    /* loaded from: classes3.dex */
    public final class C8786b extends C29735w1 {

        /* renamed from: b */
        public final C41648ge2 f39710b;

        /* renamed from: c */
        public final C51928xy3 f39711c;

        /* renamed from: d */
        public final /* synthetic */ C36628Vl2 f39712d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapter$ContainerOrderViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n1#4:173\n*S KotlinDebug\n*F\n+ 1 LandingAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapter$ContainerOrderViewHolder$1\n*L\n152#1:168\n152#1:169,4\n*E\n"})
        /* renamed from: Vl2$b$a */
        /* loaded from: classes3.dex */
        public static final class C8787a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36628Vl2 f39713g;

            /* renamed from: h */
            public final /* synthetic */ C8786b f39714h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8787a(C36628Vl2 c36628Vl2, C8786b c8786b) {
                super(1);
                this.f39713g = c36628Vl2;
                this.f39714h = c8786b;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                WireOrderItemView wireOrderItemView;
                C1737E6 m94545o = this.f39713g.m94545o();
                Integer safePosition = this.f39714h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof Pair)) {
                        m105816c = null;
                    }
                    Pair pair = (Pair) m105816c;
                    if (pair == null || (wireOrderItemView = (WireOrderItemView) pair.getFirst()) == null) {
                        return;
                    }
                    this.f39713g.f39705d.onNext(TuplesKt.m28425to(wireOrderItemView.getItemId(), wireOrderItemView.getType()));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8786b(C36628Vl2 c36628Vl2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39712d = c36628Vl2;
            C41648ge2 m37942a = C41648ge2.m37942a(view);
            Intrinsics.checkNotNullExpressionValue(m37942a, "bind(view)");
            this.f39710b = m37942a;
            C51928xy3 c51928xy3 = new C51928xy3();
            this.f39711c = c51928xy3;
            TextView textView = m37942a.f83972c;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.view");
            C34585Ms2.m94661j(textView, new C8787a(c36628Vl2, this));
            m37942a.f83971b.setAdapter(c51928xy3);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            List listOf;
            Object m105816c = this.f39712d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                C51928xy3 c51928xy3 = this.f39711c;
                listOf = CollectionsKt__CollectionsJVMKt.listOf((C3023H6) pair.component2());
                c51928xy3.mo24871u(listOf);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LVl2$c;", "Lw1;", "", "position", "", "bind", "Lke2;", "b", "Lke2;", "binding", "Landroid/view/View;", "view", "<init>", "(LVl2;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapter$EmptyStateViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n*S KotlinDebug\n*F\n+ 1 LandingAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapter$EmptyStateViewHolder\n*L\n140#1:168\n140#1:169,4\n*E\n"})
    /* renamed from: Vl2$c */
    /* loaded from: classes3.dex */
    public final class C8788c extends C29735w1 {

        /* renamed from: b */
        public final C44020ke2 f39715b;

        /* renamed from: c */
        public final /* synthetic */ C36628Vl2 f39716c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8788c(C36628Vl2 c36628Vl2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39716c = c36628Vl2;
            C44020ke2 m28708a = C44020ke2.m28708a(view);
            Intrinsics.checkNotNullExpressionValue(m28708a, "bind(view)");
            this.f39715b = m28708a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f39716c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            String str = (String) m105816c;
            if (str != null) {
                this.f39715b.f94699b.setText(str);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"LVl2$d;", "LUl0$a;", "LUl0;", "Landroid/view/View;", "view", "<init>", "(LVl2;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Vl2$d */
    /* loaded from: classes3.dex */
    public final class C8789d extends AbstractC36392Ul0.View$OnClickListenerC8438a {

        /* renamed from: d */
        public final /* synthetic */ C36628Vl2 f39717d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8789d(C36628Vl2 c36628Vl2, View view) {
            super(c36628Vl2, view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39717d = c36628Vl2;
            c36628Vl2.f39706e.add(this);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LVl2$e;", "Lw1;", "", "position", "", "bind", "Lie2;", "b", "Lie2;", "binding", "Landroid/view/View;", "view", "<init>", "(LVl2;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapter$SubheaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n*S KotlinDebug\n*F\n+ 1 LandingAdapter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapter$SubheaderViewHolder\n*L\n132#1:168\n132#1:169,4\n*E\n"})
    /* renamed from: Vl2$e */
    /* loaded from: classes3.dex */
    public final class C8790e extends C29735w1 {

        /* renamed from: b */
        public final C42834ie2 f39718b;

        /* renamed from: c */
        public final /* synthetic */ C36628Vl2 f39719c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8790e(C36628Vl2 c36628Vl2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39719c = c36628Vl2;
            C42834ie2 m33647a = C42834ie2.m33647a(view);
            Intrinsics.checkNotNullExpressionValue(m33647a, "bind(view)");
            this.f39718b = m33647a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = this.f39718b.f87625b;
            Object m105816c = this.f39719c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vl2$f */
    /* loaded from: classes3.dex */
    public static final class C8791f extends Lambda implements Function1<View, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f39721h;

        /* renamed from: i */
        public final /* synthetic */ View f39722i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8791f(int i, View view) {
            super(1);
            this.f39721h = i;
            this.f39722i = view;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            C36628Vl2.this.m79451y(this.f39721h);
            C36628Vl2.this.mo79457i(this.f39722i, this.f39721h);
        }
    }

    public C36628Vl2() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f39704c = m31902e;
        C24558d<Pair<String, OrderItemType>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Pair<String, OrderItemType>>()");
        this.f39705d = m31902e2;
        this.f39706e = new LinkedHashSet();
    }

    @Override // p000.QQ5
    /* renamed from: i */
    public void mo79457i(View view, int i) {
        boolean z;
        CollapsableHeaderView collapsableHeaderView;
        Object firstOrNull;
        CollapsableHeaderView.EnumC16700a enumC16700a;
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z2 = true;
        if (i >= 0 && i < getItemCount()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        C36626Vl0 c36626Vl0 = null;
        if (view instanceof CollapsableHeaderView) {
            collapsableHeaderView = (CollapsableHeaderView) view;
        } else {
            collapsableHeaderView = null;
        }
        if (collapsableHeaderView == null) {
            return;
        }
        Object m105816c = m94545o().m109397e(i).m105816c();
        if (m105816c instanceof C36626Vl0) {
            c36626Vl0 = m105816c;
        }
        C36626Vl0 c36626Vl02 = c36626Vl0;
        if (c36626Vl02 != null) {
            collapsableHeaderView.setText(c36626Vl02.m79460d());
            collapsableHeaderView.setCollapsable(c36626Vl02.m79462b());
            boolean m79461c = c36626Vl02.m79461c();
            c36626Vl02.m79459e(false);
            if (collapsableHeaderView.m53965f()) {
                if (!m79461c) {
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m94543q(i).m104410c());
                    C2637G6 c2637g6 = (C2637G6) firstOrNull;
                    if (c2637g6 == null || !c2637g6.m105815d()) {
                        z2 = false;
                    }
                    if (z2) {
                        enumC16700a = CollapsableHeaderView.EnumC16700a.UP;
                    } else {
                        enumC16700a = CollapsableHeaderView.EnumC16700a.DOWN;
                    }
                } else {
                    enumC16700a = CollapsableHeaderView.EnumC16700a.DOWN;
                }
                collapsableHeaderView.setArrowDirection(enumC16700a);
            }
        }
        C34585Ms2.m94661j(view, new C8791f(i, view));
    }

    @Override // p000.QQ5
    /* renamed from: j */
    public int mo79456j(int i) {
        return getItemViewType(i);
    }

    @Override // p000.QQ5
    /* renamed from: k */
    public boolean mo79455k(int i) {
        return m94545o().m109397e(i).m105816c() instanceof C36626Vl0;
    }

    @Override // p000.QQ5
    /* renamed from: n */
    public Integer mo79454n(int i) {
        C2637G6 m104409d = m94545o().m109393i(m94545o().m109397e(i)).m104409d();
        if (m104409d != null) {
            if (!(m104409d.m105816c() instanceof C36626Vl0)) {
                m104409d = null;
            }
            if (m104409d != null) {
                return Integer.valueOf(m94545o().m109394h().indexOf(m104409d));
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C38153am2(this));
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C36862Wl2();
    }

    /* renamed from: w */
    public final Observable<Unit> m79453w() {
        Observable<Unit> hide = this.f39704c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "calendarRangeSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<Pair<String, OrderItemType>> m79452x() {
        Observable<Pair<String, OrderItemType>> hide = this.f39705d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "orderItemIdSubject.hide()");
        return hide;
    }

    /* renamed from: y */
    public final void m79451y(int i) {
        AbstractC36392Ul0.toggleItemVisibilityForHeaderPosition$default(this, i, null, 2, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_order_item_date_range ? new C8784a(this, m41761u) : i == C35442Qj4.item_order_item_header ? new C8789d(this, m41761u) : i == C35442Qj4.item_order_item_date_subheader ? new C8790e(this, m41761u) : i == C35442Qj4.item_order_item_empty ? new C8788c(this, m41761u) : i == C35442Qj4.item_order_item ? new C8786b(this, m41761u) : new C29735w1(m41761u);
    }
}
