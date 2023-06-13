package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.Bird;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0003 !\u0013B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00030\u00030\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00030\u00030\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00060\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00030\u00030\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\t0\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014¨\u0006\""}, m28432d2 = {"LK54;", "LyS0;", "Lio/reactivex/Observable;", "", "g0", "y", "LTk5;", "v", "w", "Lco/bird/android/model/persistence/Bird;", "x", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "infoClicksSubject", DateTokenConverter.CONVERTER_KEY, "promotionClicksSubject", "e", "nearbyBirdVehicleClicksSubject", "f", "nearbyBirdVehicleScanClicksSubject", "g", "privateBirdClicksSubject", "<init>", "()V", C17296a.f69688o, "b", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: K54 */
/* loaded from: classes3.dex */
public final class K54 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Unit> f19043c;

    /* renamed from: d */
    public final C24558d<Unit> f19044d;

    /* renamed from: e */
    public final C24558d<C36154Tk5> f19045e;

    /* renamed from: f */
    public final C24558d<Unit> f19046f;

    /* renamed from: g */
    public final C24558d<Bird> f19047g;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LK54$a;", "Lw1;", "", "position", "", "bind", "Lrd2;", "b", "Lrd2;", "binding", "Lu13;", "c", "Lu13;", "birdVehicleAdapter", "Landroid/view/View;", "view", "<init>", "(LK54;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPrivateBirdsOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsOverviewAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewAdapter$NearbyBirdVehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n18#2:124\n9#3,4:125\n1#4:129\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsOverviewAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewAdapter$NearbyBirdVehicleViewHolder\n*L\n116#1:124\n116#1:125,4\n*E\n"})
    /* renamed from: K54$a */
    /* loaded from: classes3.dex */
    public final class C4331a extends C29735w1 {

        /* renamed from: b */
        public final C48161rd2 f19048b;

        /* renamed from: c */
        public final C49586u13 f19049c;

        /* renamed from: d */
        public final /* synthetic */ K54 f19050d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: K54$a$a */
        /* loaded from: classes3.dex */
        public static final class C4332a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ K54 f19051g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4332a(K54 k54) {
                super(1);
                this.f19051g = k54;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f19051g.f19046f.onNext(Unit.INSTANCE);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: K54$a$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C4333b extends FunctionReferenceImpl implements Function1<C36154Tk5, Unit> {
            public C4333b(Object obj) {
                super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: a */
            public final void m99241a(C36154Tk5 p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C24558d) this.receiver).onNext(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36154Tk5 c36154Tk5) {
                m99241a(c36154Tk5);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4331a(K54 k54, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f19050d = k54;
            C48161rd2 m15692a = C48161rd2.m15692a(view);
            Intrinsics.checkNotNullExpressionValue(m15692a, "bind(view)");
            this.f19048b = m15692a;
            C49586u13 c49586u13 = new C49586u13();
            this.f19049c = c49586u13;
            RecyclerView recyclerView = m15692a.f107337e;
            recyclerView.addItemDecoration(new J44());
            recyclerView.setItemAnimator(new C11894g());
            recyclerView.setAdapter(c49586u13);
            ImageView imageView = m15692a.f107338f;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.rescanIcon");
            C34585Ms2.m94661j(imageView, new C4332a(k54));
            c49586u13.m11057v(new C4333b(k54.f19045e));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Unit unit;
            List listOf;
            Object m105816c = this.f19050d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C3023H6)) {
                m105816c = null;
            }
            C3023H6 c3023h6 = (C3023H6) m105816c;
            if (c3023h6 != null) {
                TextView textView = this.f19048b.f107335c;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.nearbyBirdVehicleEmptyState");
                C49520tu6.show$default(textView, c3023h6.m104410c().isEmpty(), 0, 2, null);
                C49586u13 c49586u13 = this.f19049c;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(c3023h6);
                c49586u13.mo24871u(listOf);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                TextView textView2 = this.f19048b.f107335c;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.nearbyBirdVehicleEmptyState");
                C49520tu6.show$default(textView2, true, 0, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LK54$b;", "Lw1;", "", "position", "", "bind", "LJe2;", "b", "LJe2;", "binding", "LU24;", "c", "LU24;", "privateBirdsAdapter", "Landroid/view/View;", "view", "<init>", "(LK54;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPrivateBirdsOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsOverviewAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewAdapter$PrivateBirdsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,123:1\n18#2:124\n9#3,4:125\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsOverviewAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewAdapter$PrivateBirdsViewHolder\n*L\n91#1:124\n91#1:125,4\n*E\n"})
    /* renamed from: K54$b */
    /* loaded from: classes3.dex */
    public final class C4334b extends C29735w1 {

        /* renamed from: b */
        public final C33757Je2 f19052b;

        /* renamed from: c */
        public final U24 f19053c;

        /* renamed from: d */
        public final /* synthetic */ K54 f19054d;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: K54$b$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C4335a extends FunctionReferenceImpl implements Function1<Unit, Unit> {
            public C4335a(Object obj) {
                super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: a */
            public final void m99240a(Unit p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C24558d) this.receiver).onNext(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                m99240a(unit);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: K54$b$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C4336b extends FunctionReferenceImpl implements Function1<Bird, Unit> {
            public C4336b(Object obj) {
                super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: a */
            public final void m99239a(Bird p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C24558d) this.receiver).onNext(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
                m99239a(bird);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4334b(K54 k54, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f19054d = k54;
            C33757Je2 m100059a = C33757Je2.m100059a(view);
            Intrinsics.checkNotNullExpressionValue(m100059a, "bind(view)");
            this.f19052b = m100059a;
            U24 u24 = new U24();
            this.f19053c = u24;
            RecyclerView recyclerView = m100059a.f17957b;
            recyclerView.addItemDecoration(new J44());
            recyclerView.setItemAnimator(new C11894g());
            recyclerView.setAdapter(u24);
            u24.m82043v(new C4335a(k54.f19043c));
            u24.m82042w(new C4336b(k54.f19047g));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            List listOf;
            Object m105816c = this.f19054d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C3023H6)) {
                m105816c = null;
            }
            C3023H6 c3023h6 = (C3023H6) m105816c;
            if (c3023h6 != null) {
                U24 u24 = this.f19053c;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(c3023h6);
                u24.mo24871u(listOf);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LK54$c;", "Lw1;", "", "position", "", "bind", "LOe2;", "b", "LOe2;", "binding", "Landroid/view/View;", "view", "<init>", "(LK54;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPrivateBirdsOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsOverviewAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewAdapter$PromotionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,123:1\n18#2:124\n9#3,4:125\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsOverviewAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewAdapter$PromotionViewHolder\n*L\n62#1:124\n62#1:125,4\n*E\n"})
    /* renamed from: K54$c */
    /* loaded from: classes3.dex */
    public final class C4337c extends C29735w1 {

        /* renamed from: b */
        public final C34927Oe2 f19055b;

        /* renamed from: c */
        public final /* synthetic */ K54 f19056c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: K54$c$a */
        /* loaded from: classes3.dex */
        public static final class C4338a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ K54 f19057g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4338a(K54 k54) {
                super(1);
                this.f19057g = k54;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f19057g.f19044d.onNext(Unit.INSTANCE);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: K54$c$b */
        /* loaded from: classes3.dex */
        public static final class C4339b extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ K54 f19058g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4339b(K54 k54) {
                super(1);
                this.f19058g = k54;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f19058g.f19044d.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4337c(K54 k54, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f19056c = k54;
            C34927Oe2 m91764a = C34927Oe2.m91764a(view);
            Intrinsics.checkNotNullExpressionValue(m91764a, "bind(view)");
            this.f19055b = m91764a;
            ConstraintLayout root = m91764a.f26976b.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.viewPromotionCollapse.root");
            C34585Ms2.m94661j(root, new C4338a(k54));
            Button button = m91764a.f26977c.f22176b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.viewPromotionExpanded.buyButton");
            C34585Ms2.m94661j(button, new C4339b(k54));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f19056c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            String str = (String) m105816c;
            if (str == null) {
                str = this.f19055b.getRoot().getResources().getString(C45871nl4.retail_promotion_cta);
                Intrinsics.checkNotNullExpressionValue(str, "binding.root.resources.g…ing.retail_promotion_cta)");
            }
            if (this.f19056c.getItemCount() == 1) {
                ConstraintLayout root = this.f19055b.f26977c.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "binding.viewPromotionExpanded.root");
                C49520tu6.show$default(root, true, 0, 2, null);
                this.f19055b.f26977c.f22176b.setText(str);
                ConstraintLayout root2 = this.f19055b.f26976b.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "binding.viewPromotionCollapse.root");
                C49520tu6.show$default(root2, false, 0, 2, null);
                return;
            }
            ConstraintLayout root3 = this.f19055b.f26977c.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "binding.viewPromotionExpanded.root");
            C49520tu6.show$default(root3, false, 0, 2, null);
            ConstraintLayout root4 = this.f19055b.f26976b.getRoot();
            Intrinsics.checkNotNullExpressionValue(root4, "binding.viewPromotionCollapse.root");
            C49520tu6.show$default(root4, true, 0, 2, null);
            this.f19055b.f26976b.f20312d.setText(str);
        }
    }

    public K54() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f19043c = m31902e;
        C24558d<Unit> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Unit>()");
        this.f19044d = m31902e2;
        C24558d<C36154Tk5> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<ScanResult>()");
        this.f19045e = m31902e3;
        C24558d<Unit> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<Unit>()");
        this.f19046f = m31902e4;
        C24558d<Bird> m31902e5 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e5, "create<Bird>()");
        this.f19047g = m31902e5;
    }

    /* renamed from: g0 */
    public final Observable<Unit> m99246g0() {
        Observable<Unit> hide = this.f19043c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "infoClicksSubject.hide()");
        return hide;
    }

    /* renamed from: v */
    public final Observable<C36154Tk5> m99245v() {
        Observable<C36154Tk5> hide = this.f19045e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "nearbyBirdVehicleClicksSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Unit> m99244w() {
        Observable<Unit> hide = this.f19046f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "nearbyBirdVehicleScanClicksSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<Bird> m99243x() {
        Observable<Bird> hide = this.f19047g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "privateBirdClicksSubject.hide()");
        return hide;
    }

    /* renamed from: y */
    public final Observable<Unit> m99242y() {
        Observable<Unit> hide = this.f19044d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "promotionClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C31698Aj4.item_promotion ? new C4337c(this, m41761u) : i == C31698Aj4.item_private_birds_section ? new C4334b(this, m41761u) : i == C31698Aj4.item_nearby_bird_vehicles_section ? new C4331a(this, m41761u) : new C29735w1(m41761u);
    }
}
