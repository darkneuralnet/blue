package p000;

import co.bird.android.model.User;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.AutocompleteSupportFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41318g46;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, m28432d2 = {"LRv2;", "Lf1;", "LSv2;", "LTv2;", "renderer", "", "r", "LEa;", "e", "LEa;", "analyticsManager", "Le13;", "f", "Le13;", "navigator", "Lgl;", "g", "Lgl;", "preference", "Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;", "h", "Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;", "autocompleteSupportFragment", "", "i", "Lkotlin/Lazy;", "w", "()Ljava/lang/String;", "sessionId", "", "j", "Z", "attemptedPlaceSearch", "Lg46$b;", "v", "()Lg46$b;", "logger", "<init>", "(LEa;Le13;Lgl;Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;)V", "locals-survey_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalsSurveyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalsSurveyPresenter.kt\nco/bird/android/feature/localssurvey/LocalsSurveyPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,121:1\n180#2:122\n180#2:123\n180#2:124\n*S KotlinDebug\n*F\n+ 1 LocalsSurveyPresenter.kt\nco/bird/android/feature/localssurvey/LocalsSurveyPresenter\n*L\n36#1:122\n104#1:123\n113#1:124\n*E\n"})
/* renamed from: Rv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35782Rv2 extends AbstractC20169f1<InterfaceC36016Sv2, AbstractC36250Tv2> {

    /* renamed from: e */
    public final InterfaceC1880Ea f32886e;

    /* renamed from: f */
    public final InterfaceC40099e13 f32887f;

    /* renamed from: g */
    public final C22454gl f32888g;

    /* renamed from: h */
    public final AutocompleteSupportFragment f32889h;

    /* renamed from: i */
    public final Lazy f32890i;

    /* renamed from: j */
    public boolean f32891j;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTv2;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LTv2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Rv2$a */
    /* loaded from: classes3.dex */
    public static final class C7292a extends Lambda implements Function1<AbstractC36250Tv2, Unit> {

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, m28432d2 = {"Rv2$a$a", "Lcom/google/android/libraries/places/widget/listener/PlaceSelectionListener;", "Lcom/google/android/gms/common/api/Status;", "status", "", "onError", "Lcom/google/android/libraries/places/api/model/Place;", "place", "onPlaceSelected", "locals-survey_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Rv2$a$a */
        /* loaded from: classes3.dex */
        public static final class C7293a implements PlaceSelectionListener {

            /* renamed from: b */
            public final /* synthetic */ C35782Rv2 f32893b;

            public C7293a(C35782Rv2 c35782Rv2) {
                this.f32893b = c35782Rv2;
            }

            @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
            public void onError(Status status) {
                Intrinsics.checkNotNullParameter(status, "status");
                this.f32893b.f32891j = true;
                C41318g46.AbstractC20723b m86201v = this.f32893b.m86201v();
                m86201v.mo7228a("Error on autocomplete places widget: " + status, new Object[0]);
                this.f32893b.m42280h(new WT3(status));
            }

            @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
            public void onPlaceSelected(Place place) {
                String str;
                Intrinsics.checkNotNullParameter(place, "place");
                this.f32893b.f32891j = true;
                C41318g46.AbstractC20723b m86201v = this.f32893b.m86201v();
                m86201v.mo7228a("Autocomplete place selected: " + place, new Object[0]);
                AddressComponent m96427b = C34260Li1.m96427b(place);
                if (m96427b != null) {
                    str = m96427b.getName();
                } else {
                    str = null;
                }
                this.f32893b.f32889h.setText(str);
                if (str != null) {
                    this.f32893b.m42280h(new NU3(place));
                } else {
                    this.f32893b.m42280h(new MU3(place));
                }
            }
        }

        public C7292a() {
            super(1);
        }

        /* renamed from: a */
        public final void m86199a(AbstractC36250Tv2 abstractC36250Tv2) {
            String str;
            String str2;
            String str3;
            AddressComponent m96428a;
            AddressComponent m96427b;
            List<Place.Field> listOf;
            String str4 = null;
            Integer num = null;
            str4 = null;
            if (abstractC36250Tv2 instanceof C52175yO5) {
                InterfaceC1880Ea interfaceC1880Ea = C35782Rv2.this.f32886e;
                String sessionId = C35782Rv2.this.m86200w();
                Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
                User m37750B0 = C35782Rv2.this.f32888g.m37750B0();
                if (m37750B0 != null) {
                    num = Integer.valueOf(m37750B0.getRideCount());
                }
                interfaceC1880Ea.mo55905y(new C45376mv2(null, null, null, sessionId, num, 7, null));
                C35782Rv2.this.f32889h.setHint(((C52175yO5) abstractC36250Tv2).m3525b());
                C35782Rv2.this.f32889h.setActivityMode(AutocompleteActivityMode.OVERLAY);
                AutocompleteSupportFragment autocompleteSupportFragment = C35782Rv2.this.f32889h;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Place.Field.ADDRESS_COMPONENTS);
                autocompleteSupportFragment.setPlaceFields(listOf);
                C35782Rv2.this.f32889h.setTypeFilter(TypeFilter.REGIONS);
                C35782Rv2.this.f32889h.setOnPlaceSelectedListener(new C7293a(C35782Rv2.this));
            } else if (abstractC36250Tv2 instanceof NB5) {
                InterfaceC1880Ea interfaceC1880Ea2 = C35782Rv2.this.f32886e;
                String sessionId2 = C35782Rv2.this.m86200w();
                boolean z = C35782Rv2.this.f32891j;
                Intrinsics.checkNotNullExpressionValue(sessionId2, "sessionId");
                interfaceC1880Ea2.mo55905y(new C44783lv2(null, null, null, sessionId2, z, true, 7, null));
                C35782Rv2.this.f32887f.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
            } else if (abstractC36250Tv2 instanceof C13361c0) {
                InterfaceC1880Ea interfaceC1880Ea3 = C35782Rv2.this.f32886e;
                String sessionId3 = C35782Rv2.this.m86200w();
                boolean z2 = C35782Rv2.this.f32891j;
                Intrinsics.checkNotNullExpressionValue(sessionId3, "sessionId");
                interfaceC1880Ea3.mo55905y(new C44783lv2(null, null, null, sessionId3, z2, false, 7, null));
                C35782Rv2.this.f32887f.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_CANCELED, new Pair[0]);
            } else if (!(abstractC36250Tv2 instanceof NU3)) {
                if (abstractC36250Tv2 instanceof VT3) {
                    InterfaceC1880Ea interfaceC1880Ea4 = C35782Rv2.this.f32886e;
                    String m86200w = C35782Rv2.this.m86200w();
                    VT3 vt3 = (VT3) abstractC36250Tv2;
                    Place m79858b = vt3.m79858b();
                    if (m79858b != null && (m96427b = C34260Li1.m96427b(m79858b)) != null) {
                        str = m96427b.getName();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    Place m79858b2 = vt3.m79858b();
                    if (m79858b2 != null && (m96428a = C34260Li1.m96428a(m79858b2)) != null) {
                        str4 = m96428a.getShortName();
                    }
                    if (str4 == null) {
                        str3 = "";
                    } else {
                        str3 = str4;
                    }
                    interfaceC1880Ea4.mo55905y(new C31618Aa5(null, null, null, m86200w, str3, str2, 7, null));
                    C35782Rv2.this.m86201v().mo7221o("Match found!", new Object[0]);
                    C35782Rv2.this.f32887f.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
                } else if (!(abstractC36250Tv2 instanceof C36573Vf1) && !Intrinsics.areEqual(abstractC36250Tv2, C42480i22.f86311a)) {
                    boolean z3 = abstractC36250Tv2 instanceof WT3;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC36250Tv2 abstractC36250Tv2) {
            m86199a(abstractC36250Tv2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Rv2$b */
    /* loaded from: classes3.dex */
    public static final class C7294b extends Lambda implements Function1<Unit, Unit> {
        public C7294b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C35782Rv2 c35782Rv2 = C35782Rv2.this;
            AbstractC36250Tv2 m42277k = c35782Rv2.m42277k();
            NU3 nu3 = m42277k instanceof NU3 ? (NU3) m42277k : null;
            c35782Rv2.m42280h(new VT3(nu3 != null ? nu3.m93856b() : null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Rv2$c */
    /* loaded from: classes3.dex */
    public static final class C7295c extends Lambda implements Function1<Throwable, Unit> {
        public C7295c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C35782Rv2.this.m86201v().mo7226d(th, "Error while handling next clicks", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Rv2$d */
    /* loaded from: classes3.dex */
    public static final class C7296d extends Lambda implements Function1<Unit, Unit> {
        public C7296d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C35782Rv2.this.m42280h(NB5.f24244a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Rv2$e */
    /* loaded from: classes3.dex */
    public static final class C7297e extends Lambda implements Function1<Throwable, Unit> {
        public C7297e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C35782Rv2.this.m86201v().mo7226d(th, "Error while handling skip clicks", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Rv2$f */
    /* loaded from: classes3.dex */
    public static final class C7298f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C7298f f32898g = new C7298f();

        public C7298f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35782Rv2(InterfaceC1880Ea analyticsManager, InterfaceC40099e13 navigator, C22454gl preference, AutocompleteSupportFragment autocompleteSupportFragment) {
        super(C42480i22.f86311a);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(autocompleteSupportFragment, "autocompleteSupportFragment");
        this.f32886e = analyticsManager;
        this.f32887f = navigator;
        this.f32888g = preference;
        this.f32889h = autocompleteSupportFragment;
        lazy = LazyKt__LazyJVMKt.lazy(C7298f.f32898g);
        this.f32890i = lazy;
    }

    /* renamed from: f */
    public static final void m86212f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m86211g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m86204s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m86203t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m86202u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: r */
    public void consume(InterfaceC36016Sv2 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Object m33094as = m42276l().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7292a c7292a = new C7292a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Mv2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35782Rv2.m86212f(Function1.this, obj);
            }
        });
        Object m33094as2 = renderer.mo58001w8().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7294b c7294b = new C7294b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Nv2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35782Rv2.m86211g(Function1.this, obj);
            }
        };
        final C7295c c7295c = new C7295c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Ov2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35782Rv2.m86204s(Function1.this, obj);
            }
        });
        Object m33094as3 = renderer.mo58004L().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7296d c7296d = new C7296d();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: Pv2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35782Rv2.m86203t(Function1.this, obj);
            }
        };
        final C7297e c7297e = new C7297e();
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: Qv2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35782Rv2.m86202u(Function1.this, obj);
            }
        });
    }

    /* renamed from: v */
    public final C41318g46.AbstractC20723b m86201v() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("LocalsSurvey");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"LocalsSurvey\")");
        return m40153k;
    }

    /* renamed from: w */
    public final String m86200w() {
        return (String) this.f32890i.getValue();
    }
}
