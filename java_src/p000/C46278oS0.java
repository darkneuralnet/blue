package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Folder;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C46278oS0;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 52\u00020\u0001:\u0001\u001dBE\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u000e\b\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0001\u0010#\u001a\u00020 ¢\u0006\u0004\b3\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/¨\u00066"}, m28432d2 = {"LoS0;", "LhS0;", "Landroid/content/Intent;", "intent", "", "b", "", "url", C17296a.f69688o, "feedback", "", "photoUrls", "m", "LFk1;", "LFk1;", "feedbackManager", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "LTq4;", "c", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LtS0;", "e", "LtS0;", "ui", "Le13;", "f", "Le13;", "navigator", "g", "Ljava/lang/String;", "birdId", "h", "taskId", "Lco/bird/android/model/constant/MapMode;", "i", "Lco/bird/android/model/constant/MapMode;", "mapMode", "", "j", "Z", "unlocking", "k", "reportingDamagedPhysicalLock", "<init>", "(LFk1;Landroid/os/Handler;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LtS0;Le13;)V", "l", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDamageFeedbackPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DamageFeedbackPresenter.kt\nco/bird/android/feature/rideendsummary/DamageFeedbackPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n180#2:131\n180#2:132\n199#2:141\n199#2:142\n6#3:133\n1#4:134\n13#5,2:135\n15#5,2:139\n1109#6,2:137\n1855#7,2:143\n*S KotlinDebug\n*F\n+ 1 DamageFeedbackPresenter.kt\nco/bird/android/feature/rideendsummary/DamageFeedbackPresenterImpl\n*L\n69#1:131\n82#1:132\n97#1:141\n105#1:142\n89#1:133\n89#1:134\n89#1:135,2\n89#1:139,2\n89#1:137,2\n122#1:143,2\n*E\n"})
/* renamed from: oS0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46278oS0 implements InterfaceC42127hS0 {

    /* renamed from: l */
    public static final C26988e f102007l = new C26988e(null);

    /* renamed from: a */
    public final InterfaceC32874Fk1 f102008a;

    /* renamed from: b */
    public final Handler f102009b;

    /* renamed from: c */
    public final C36207Tq4 f102010c;

    /* renamed from: d */
    public final LifecycleScopeProvider<EnumC7097RE> f102011d;

    /* renamed from: e */
    public final InterfaceC49242tS0 f102012e;

    /* renamed from: f */
    public final InterfaceC40099e13 f102013f;

    /* renamed from: g */
    public String f102014g;

    /* renamed from: h */
    public String f102015h;

    /* renamed from: i */
    public MapMode f102016i;

    /* renamed from: j */
    public boolean f102017j;

    /* renamed from: k */
    public boolean f102018k;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oS0$b */
    /* loaded from: classes3.dex */
    public static final class C26985b extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends Boolean>> {
        public C26985b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Boolean> invoke(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C46278oS0.this.f102010c.m82524o8();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oS0$c */
    /* loaded from: classes3.dex */
    public static final class C26986c extends Lambda implements Function1<Boolean, Unit> {
        public C26986c() {
            super(1);
        }

        /* renamed from: b */
        public static final void m21047b(C46278oS0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f102013f.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            InterfaceC49242tS0 interfaceC49242tS0 = C46278oS0.this.f102012e;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC49242tS0.success(it.booleanValue() ? C45871nl4.damage_feedback_feedback_thank_you : C45871nl4.feedback_thank_you);
            Handler handler = C46278oS0.this.f102009b;
            final C46278oS0 c46278oS0 = C46278oS0.this;
            handler.postDelayed(new Runnable() { // from class: pS0
                @Override // java.lang.Runnable
                public final void run() {
                    C46278oS0.C26986c.m21047b(C46278oS0.this);
                }
            }, 2000L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oS0$d */
    /* loaded from: classes3.dex */
    public static final class C26987d extends Lambda implements Function1<Unit, Unit> {
        public C26987d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToRetakeablePhoto$default(C46278oS0.this.f102013f, null, null, Folder.LOCK_ISSUE_PHOTOS, null, null, false, 59, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LoS0$e;", "", "", "UPLOADED_PHOTO_URLS_SECTION", "Ljava/lang/String;", "<init>", "()V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: oS0$e */
    /* loaded from: classes3.dex */
    public static final class C26988e {
        public /* synthetic */ C26988e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C26988e() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "", "issues", "", C17296a.f69688o, "(Ljava/util/Map;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oS0$f */
    /* loaded from: classes3.dex */
    public static final class C26989f extends Lambda implements Function1<Map<String, ? extends String>, Unit> {
        public C26989f() {
            super(1);
        }

        /* renamed from: a */
        public final void m21046a(Map<String, String> issues) {
            Intrinsics.checkNotNullParameter(issues, "issues");
            C46278oS0.this.f102012e.mo8632k0(issues);
            C46278oS0.this.f102012e.mo8631r1(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
            m21046a(map);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "", "issues", "", C17296a.f69688o, "(Ljava/util/Map;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oS0$g */
    /* loaded from: classes3.dex */
    public static final class C26990g extends Lambda implements Function1<Map<String, ? extends String>, Unit> {
        public C26990g() {
            super(1);
        }

        /* renamed from: a */
        public final void m21045a(Map<String, String> issues) {
            Intrinsics.checkNotNullParameter(issues, "issues");
            C46278oS0.this.f102012e.mo8632k0(issues);
            C46278oS0.this.f102012e.mo8631r1(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
            m21045a(map);
            return Unit.INSTANCE;
        }
    }

    public C46278oS0(InterfaceC32874Fk1 feedbackManager, Handler handler, C36207Tq4 reactiveConfig, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC49242tS0 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(feedbackManager, "feedbackManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f102008a = feedbackManager;
        this.f102009b = handler;
        this.f102010c = reactiveConfig;
        this.f102011d = scopeProvider;
        this.f102012e = ui;
        this.f102013f = navigator;
        Observable m31950a = C24527f.m31950a(ui.mo8635c(), ui.mo8630v());
        final C26984a c26984a = new C26984a();
        Observable flatMap = m31950a.flatMap(new InterfaceC23492o() { // from class: kS0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m21056i;
                m21056i = C46278oS0.m21056i(Function1.this, obj);
                return m21056i;
            }
        });
        final C26985b c26985b = new C26985b();
        Observable flatMap2 = flatMap.flatMap(new InterfaceC23492o() { // from class: lS0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m21055j;
                m21055j = C46278oS0.m21055j(Function1.this, obj);
                return m21055j;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap2, "ui.submitClicks()\n      …arkDamagedCopyUpdates() }");
        Object m33094as = flatMap2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26986c c26986c = new C26986c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: mS0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46278oS0.m21054k(Function1.this, obj);
            }
        });
        Object m33094as2 = ui.mo8634g().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26987d c26987d = new C26987d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: nS0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46278oS0.m21053l(Function1.this, obj);
            }
        });
    }

    /* renamed from: i */
    public static final InterfaceC23434B m21056i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final InterfaceC23434B m21055j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m21054k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m21053l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m21051n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m21050o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC42127hS0
    /* renamed from: a */
    public void mo21064a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f102012e.mo8633j(url);
    }

    @Override // p000.InterfaceC42127hS0
    /* renamed from: b */
    public void mo21063b(Intent intent) {
        Enum r9;
        boolean equals;
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("bird_id");
        Intrinsics.checkNotNull(stringExtra);
        this.f102014g = stringExtra;
        String stringExtra2 = intent.getStringExtra("task_id");
        Intrinsics.checkNotNull(stringExtra2);
        this.f102015h = stringExtra2;
        String stringExtra3 = intent.getStringExtra("map_mode");
        MapMode mapMode = null;
        if (stringExtra3 != null) {
            try {
                Object[] enumConstants = MapMode.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra3, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r9 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Object[] enumConstants2 = MapMode.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    r9 = (Enum) obj2;
                    if (Intrinsics.areEqual(r9.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        r9 = null;
        MapMode mapMode2 = (MapMode) r9;
        if (mapMode2 == null) {
            return;
        }
        this.f102016i = mapMode2;
        if (intent.hasExtra("physical_lock_unlocking")) {
            this.f102018k = true;
            this.f102017j = intent.getBooleanExtra("physical_lock_unlocking", false);
            InterfaceC32874Fk1 interfaceC32874Fk1 = this.f102008a;
            String str = this.f102014g;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("birdId");
                str = null;
            }
            boolean z = !this.f102017j;
            MapMode mapMode3 = this.f102016i;
            if (mapMode3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapMode");
            } else {
                mapMode = mapMode3;
            }
            AbstractC23442F<Map<String, String>> m33152N = interfaceC32874Fk1.mo99882h(str, z, mapMode).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "feedbackManager\n        …dSchedulers.mainThread())");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f102011d));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C26989f c26989f = new C26989f();
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: iS0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C46278oS0.m21051n(Function1.this, obj3);
                }
            });
            return;
        }
        InterfaceC32874Fk1 interfaceC32874Fk12 = this.f102008a;
        String str2 = this.f102014g;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("birdId");
            str2 = null;
        }
        MapMode mapMode4 = this.f102016i;
        if (mapMode4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapMode");
        } else {
            mapMode = mapMode4;
        }
        Object m33135e2 = interfaceC32874Fk12.mo99884f(str2, mapMode).m33135e(AutoDispose.m45239a(this.f102011d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26990g c26990g = new C26990g();
        ((SingleSubscribeProxy) m33135e2).subscribe(new InterfaceC23484g() { // from class: jS0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C46278oS0.m21050o(Function1.this, obj3);
            }
        });
    }

    /* renamed from: m */
    public final String m21052m(String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n---\n## UPLOADED PHOTOS ##");
        for (String str2 : list) {
            sb.append("\n");
            sb.append(str2);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "feedbackDescriptionStringBuilder.toString()");
        return sb2;
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oS0$a */
    /* loaded from: classes3.dex */
    public static final class C26984a extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends Uri>>, InterfaceC23434B<? extends WireBird>> {
        public C26984a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends WireBird> invoke2(Pair<Unit, ? extends List<? extends Uri>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<? extends Uri> photos = pair.component2();
            Intrinsics.checkNotNullExpressionValue(photos, "photos");
            List<String> m101827a = C33536If6.m101827a(photos);
            InterfaceC32874Fk1 interfaceC32874Fk1 = C46278oS0.this.f102008a;
            String str = C46278oS0.this.f102015h;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("taskId");
                str = null;
            }
            List<String> mo8639Cb = C46278oS0.this.f102012e.mo8639Cb();
            C46278oS0 c46278oS0 = C46278oS0.this;
            return C28237sD.progress$default(interfaceC32874Fk1.mo99885e(str, mo8639Cb, c46278oS0.m21052m(c46278oS0.f102012e.mo8638Jg(), m101827a)), C46278oS0.this.f102012e, 0, 2, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends WireBird> invoke(Pair<? extends Unit, ? extends List<? extends Uri>> pair) {
            return invoke2((Pair<Unit, ? extends List<? extends Uri>>) pair);
        }
    }
}
