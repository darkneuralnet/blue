package p000;

import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Folder;
import co.bird.android.model.Reservation;
import co.bird.android.model.analytics.RiderReserveCancelFeedbackSubmitted;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.C24576w;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.S74;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0001\u0010#\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001e\u0010\f\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, m28432d2 = {"LGK4;", "LzK4;", "Landroid/content/Intent;", "intent", "", "b", "", "url", "j", "", "selectedOptions", "value", "o", "LMK4;", C17296a.f69688o, "LMK4;", "reservationManager", "LEa;", "LEa;", "analyticsManager", "Lco/bird/android/core/mvp/BaseActivity;", "c", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LKK4;", "e", "LKK4;", "ui", "Le13;", "f", "Le13;", "navigator", "g", "Ljava/util/Set;", "<init>", "(LMK4;LEa;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LKK4;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReservationFeedbackPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReservationFeedbackPresenter.kt\nco/bird/android/app/feature/reservation/presenter/ReservationFeedbackPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n180#2:110\n180#2:112\n180#2:114\n1855#3:111\n1856#3:113\n*S KotlinDebug\n*F\n+ 1 ReservationFeedbackPresenter.kt\nco/bird/android/app/feature/reservation/presenter/ReservationFeedbackPresenterImpl\n*L\n51#1:110\n62#1:112\n84#1:114\n60#1:111\n60#1:113\n*E\n"})
/* renamed from: GK4 */
/* loaded from: classes2.dex */
public final class GK4 implements InterfaceC52731zK4 {

    /* renamed from: a */
    public final MK4 f11623a;

    /* renamed from: b */
    public final InterfaceC1880Ea f11624b;

    /* renamed from: c */
    public final BaseActivity f11625c;

    /* renamed from: d */
    public final ScopeProvider f11626d;

    /* renamed from: e */
    public final KK4 f11627e;

    /* renamed from: f */
    public final InterfaceC40099e13 f11628f;

    /* renamed from: g */
    public final Set<String> f11629g;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GK4$a */
    /* loaded from: classes2.dex */
    public static final class C2755a extends Lambda implements Function1<Unit, Unit> {
        public C2755a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToRetakeablePhoto$default(GK4.this.f11628f, null, null, Folder.COMPLAINT_PHOTOS, null, null, false, 59, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GK4$b */
    /* loaded from: classes2.dex */
    public static final class C2756b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f11632h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2756b(String str) {
            super(1);
            this.f11632h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            GK4 gk4 = GK4.this;
            gk4.m105389o(gk4.f11629g, this.f11632h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GK4$c */
    /* loaded from: classes2.dex */
    public static final class C2757c extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends Uri>>, Unit> {
        public C2757c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends List<? extends Uri>> pair) {
            invoke2((Pair<Unit, ? extends List<? extends Uri>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, ? extends List<? extends Uri>> pair) {
            S74.C7343a.showProgress$default(GK4.this.f11627e, true, 0, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0004*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0004*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "", "", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LHM4;", "Lco/bird/android/model/Reservation;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GK4$d */
    /* loaded from: classes2.dex */
    public static final class C2758d extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends Uri>>, InterfaceC23447K<? extends HM4<Reservation>>> {

        /* renamed from: g */
        public final /* synthetic */ String f11634g;

        /* renamed from: h */
        public final /* synthetic */ GK4 f11635h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2758d(String str, GK4 gk4) {
            super(1);
            this.f11634g = str;
            this.f11635h = gk4;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<Reservation>> invoke(Pair<Unit, ? extends List<? extends Uri>> pair) {
            List<String> list;
            List list2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<? extends Uri> images = pair.component2();
            Intrinsics.checkNotNullExpressionValue(images, "images");
            List<String> m101827a = C33536If6.m101827a(images);
            String str = this.f11634g;
            if (str != null) {
                GK4 gk4 = this.f11635h;
                InterfaceC1880Ea interfaceC1880Ea = gk4.f11624b;
                list2 = CollectionsKt___CollectionsKt.toList(gk4.f11629g);
                interfaceC1880Ea.mo55905y(new C50359vK4(null, null, null, str, list2, gk4.f11627e.mo97080U(), m101827a, 7, null));
            }
            MK4 mk4 = this.f11635h.f11623a;
            String str2 = this.f11634g;
            list = CollectionsKt___CollectionsKt.toList(this.f11635h.f11629g);
            return mk4.mo83800c(str2, list, this.f11635h.f11627e.mo97080U(), m101827a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052B\u0010\u0004\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0003*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lio/reactivex/w;", "LHM4;", "Lco/bird/android/model/Reservation;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/w;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GK4$e */
    /* loaded from: classes2.dex */
    public static final class C2759e extends Lambda implements Function1<C24576w<HM4<Reservation>>, Unit> {
        public C2759e() {
            super(1);
        }

        /* renamed from: a */
        public final void m105387a(C24576w<HM4<Reservation>> c24576w) {
            S74.C7343a.showProgress$default(GK4.this.f11627e, false, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<HM4<Reservation>> c24576w) {
            m105387a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/Reservation;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GK4$f */
    /* loaded from: classes2.dex */
    public static final class C2760f extends Lambda implements Function1<HM4<Reservation>, Unit> {
        public C2760f() {
            super(1);
        }

        /* renamed from: a */
        public final void m105386a(HM4<Reservation> hm4) {
            if (hm4.m103939f()) {
                GK4.this.f11624b.mo55956N(new RiderReserveCancelFeedbackSubmitted(GK4.this.f11629g, GK4.this.f11627e.mo97080U()));
                GK4.this.f11625c.setResult(-1);
                GK4.this.f11628f.close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Reservation> hm4) {
            m105386a(hm4);
            return Unit.INSTANCE;
        }
    }

    public GK4(MK4 reservationManager, InterfaceC1880Ea analyticsManager, BaseActivity activity, ScopeProvider scopeProvider, KK4 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(reservationManager, "reservationManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f11623a = reservationManager;
        this.f11624b = analyticsManager;
        this.f11625c = activity;
        this.f11626d = scopeProvider;
        this.f11627e = ui;
        this.f11628f = navigator;
        this.f11629g = new LinkedHashSet();
        Object m33094as = ui.mo97078g().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2755a c2755a = new C2755a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: AK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GK4.m105395h(Function1.this, obj);
            }
        });
    }

    /* renamed from: h */
    public static final void m105395h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m105394i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m105393k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final InterfaceC23447K m105392l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m105391m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m105390n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC52731zK4
    /* renamed from: b */
    public void mo1536b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("reservation_feedback_issues");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        String stringExtra = intent.getStringExtra("reservation_id");
        Intrinsics.checkNotNull(stringExtra);
        this.f11627e.mo97081S0(parcelableArrayListExtra);
        Iterator<T> it = this.f11627e.mo97074x1().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object m33094as = ((Observable) pair.component2()).m33094as(AutoDispose.m45239a(this.f11626d));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C2756b c2756b = new C2756b((String) pair.component1());
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: BK4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    GK4.m105394i(Function1.this, obj);
                }
            });
        }
        Observable m31950a = C24527f.m31950a(this.f11627e.mo97079e(), this.f11627e.mo97075v());
        final C2757c c2757c = new C2757c();
        Observable doOnNext = m31950a.doOnNext(new InterfaceC23484g() { // from class: CK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GK4.m105393k(Function1.this, obj);
            }
        });
        final C2758d c2758d = new C2758d(stringExtra, this);
        Observable flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: DK4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m105392l;
                m105392l = GK4.m105392l(Function1.this, obj);
                return m105392l;
            }
        });
        final C2759e c2759e = new C2759e();
        Observable doOnEach = flatMapSingle.doOnEach(new InterfaceC23484g() { // from class: EK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GK4.m105391m(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnEach, "override fun onCreate(in…e()\n        }\n      }\n  }");
        Object m33094as2 = doOnEach.m33094as(AutoDispose.m45239a(this.f11626d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2760f c2760f = new C2760f();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: FK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GK4.m105390n(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC52731zK4
    /* renamed from: j */
    public void mo1535j(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f11627e.mo97077j(url);
    }

    /* renamed from: o */
    public final void m105389o(Set<String> set, String str) {
        if (!(!set.contains(str))) {
            set.remove(str);
        } else {
            String lowerCase = str.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            set.add(lowerCase);
        }
        this.f11627e.mo97082F0(str);
        this.f11627e.mo97076p(!set.isEmpty());
    }
}
