package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.OperatorNotification;
import co.bird.android.model.persistence.OperatorNotificationCategory;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C38044ab3;
import p000.InterfaceC32318Da3;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016JD\u0010\u000f\u001a,\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n0\t*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, m28432d2 = {"Lab3;", "Lf1;", "Ldb3;", "Lob3;", "renderer", "", "G", "Lio/reactivex/p;", "", "Lio/reactivex/Observable;", "Lkotlin/Triple;", "", "Lco/bird/android/model/OperatorNotification;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "Z", "Lio/reactivex/c;", "W", "", "e", "V", "LDa3;", "LDa3;", "notificationCenterManager", "LEa;", "f", "LEa;", "analyticsManager", "LTq4;", "g", "LTq4;", "reactiveConfig", "Le13;", "h", "Le13;", "navigator", "LAa3;", "i", "LAa3;", "fragmentNavigator", "<init>", "(LDa3;LEa;LTq4;Le13;LAa3;)V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationCenterPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterPresenter.kt\nco/bird/android/feature/notificationcenter/fragment/NotificationCenterPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,171:1\n180#2:172\n237#2:173\n180#2:174\n237#2:175\n180#2:176\n180#2:177\n*S KotlinDebug\n*F\n+ 1 NotificationCenterPresenter.kt\nco/bird/android/feature/notificationcenter/fragment/NotificationCenterPresenter\n*L\n42#1:172\n61#1:173\n67#1:174\n91#1:175\n95#1:176\n99#1:177\n*E\n"})
/* renamed from: ab3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38044ab3 extends AbstractC20169f1<InterfaceC39841db3, C46363ob3> {

    /* renamed from: e */
    public final InterfaceC32318Da3 f50669e;

    /* renamed from: f */
    public final InterfaceC1880Ea f50670f;

    /* renamed from: g */
    public final C36207Tq4 f50671g;

    /* renamed from: h */
    public final InterfaceC40099e13 f50672h;

    /* renamed from: i */
    public final C31616Aa3 f50673i;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "<anonymous parameter 0>", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "filter", C17296a.f69688o, "(Lkotlin/Unit;Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ab3$a */
    /* loaded from: classes3.dex */
    public static final class C10737a extends Lambda implements Function2<Unit, Optional<OperatorNotificationCategory>, Optional<OperatorNotificationCategory>> {

        /* renamed from: g */
        public static final C10737a f50674g = new C10737a();

        public C10737a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Optional<OperatorNotificationCategory> invoke(Unit unit, Optional<OperatorNotificationCategory> filter) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(filter, "filter");
            return filter;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "filter", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNotificationCenterPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterPresenter.kt\nco/bird/android/feature/notificationcenter/fragment/NotificationCenterPresenter$consume$11\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
    /* renamed from: ab3$b */
    /* loaded from: classes3.dex */
    public static final class C10738b extends Lambda implements Function1<Optional<OperatorNotificationCategory>, InterfaceC23496h> {
        public C10738b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Optional<OperatorNotificationCategory> filter) {
            List<String> list;
            String category;
            Intrinsics.checkNotNullParameter(filter, "filter");
            C38044ab3 c38044ab3 = C38044ab3.this;
            InterfaceC32318Da3 interfaceC32318Da3 = c38044ab3.f50669e;
            OperatorNotificationCategory m59035e = filter.m59035e();
            if (m59035e != null && (category = m59035e.getCategory()) != null) {
                list = CollectionsKt__CollectionsJVMKt.listOf(category);
            } else {
                list = null;
            }
            return c38044ab3.m71150W(interfaceC32318Da3.mo108781P(false, list));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ab3$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10739c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10739c(Object obj) {
            super(1, obj, C38044ab3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C38044ab3) this.receiver).m71151V(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ab3$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10740d extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C10740d(Object obj) {
            super(1, obj, C31616Aa3.class, "goToGroup", "goToGroup(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C31616Aa3) this.receiver).m115500d(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ab3$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10741e extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C10741e(Object obj) {
            super(1, obj, InterfaceC40099e13.class, "goToNotification", "goToNotification(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC40099e13) this.receiver).mo37202A1(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ab3$f */
    /* loaded from: classes3.dex */
    public static final class C10742f extends Lambda implements Function1<String, Boolean> {

        /* renamed from: g */
        public static final C10742f f50676g = new C10742f();

        public C10742f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "isNotificationCenter", "filtersEnabled", C17296a.f69688o, "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ab3$g */
    /* loaded from: classes3.dex */
    public static final class C10743g extends Lambda implements Function2<Boolean, Boolean, Boolean> {

        /* renamed from: g */
        public static final C10743g f50677g = new C10743g();

        public C10743g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Boolean isNotificationCenter, Boolean filtersEnabled) {
            boolean z;
            Intrinsics.checkNotNullParameter(isNotificationCenter, "isNotificationCenter");
            Intrinsics.checkNotNullParameter(filtersEnabled, "filtersEnabled");
            if (isNotificationCenter.booleanValue() && filtersEnabled.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enableFilters", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ab3$h */
    /* loaded from: classes3.dex */
    public static final class C10744h extends Lambda implements Function1<Boolean, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lob3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lob3;)Lob3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ab3$h$a */
        /* loaded from: classes3.dex */
        public static final class C10745a extends Lambda implements Function1<C46363ob3, C46363ob3> {

            /* renamed from: g */
            public final /* synthetic */ Boolean f50679g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10745a(Boolean bool) {
                super(1);
                this.f50679g = bool;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C46363ob3 invoke(C46363ob3 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                Boolean enableFilters = this.f50679g;
                Intrinsics.checkNotNullExpressionValue(enableFilters, "enableFilters");
                return C46363ob3.copy$default(state, enableFilters.booleanValue(), null, null, null, 0, 30, null);
            }
        }

        public C10744h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C38044ab3.this.m42279i(new C10745a(bool));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ab3$i */
    /* loaded from: classes3.dex */
    public static final class C10746i extends Lambda implements Function1<String, Boolean> {

        /* renamed from: g */
        public static final C10746i f50680g = new C10746i();

        public C10746i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "shouldFetch", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ab3$j */
    /* loaded from: classes3.dex */
    public static final class C10747j extends Lambda implements Function1<Boolean, InterfaceC24574u<? extends Unit>> {

        /* renamed from: g */
        public static final C10747j f50681g = new C10747j();

        public C10747j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Unit> invoke(Boolean shouldFetch) {
            Intrinsics.checkNotNullParameter(shouldFetch, "shouldFetch");
            if (shouldFetch.booleanValue()) {
                return AbstractC24507p.m32068G(Unit.INSTANCE);
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ab3$k */
    /* loaded from: classes3.dex */
    public static final class C10748k extends Lambda implements Function1<Unit, InterfaceC23496h> {
        public C10748k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Unit it) {
            List listOf;
            Intrinsics.checkNotNullParameter(it, "it");
            C38044ab3 c38044ab3 = C38044ab3.this;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{c38044ab3.f50669e.mo108780b(), InterfaceC32318Da3.C1553a.fetchOperatorNotifications$default(C38044ab3.this.f50669e, false, null, 3, null)});
            AbstractC23461c m33074L = AbstractC23461c.m33074L(listOf);
            Intrinsics.checkNotNullExpressionValue(m33074L, "merge(listOf(\n          …tifications(),\n        ))");
            return c38044ab3.m71150W(m33074L).m33065U(3L);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ab3$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10749l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10749l(Object obj) {
            super(1, obj, C38044ab3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C38044ab3) this.receiver).m71151V(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072V\u0010\u0006\u001aR\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0001 \u0005*(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/OperatorNotification;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ab3$m */
    /* loaded from: classes3.dex */
    public static final class C10750m extends Lambda implements Function1<Triple<? extends List<? extends OperatorNotification>, ? extends Optional<OperatorNotificationCategory>, ? extends List<? extends OperatorNotificationCategory>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lob3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lob3;)Lob3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ab3$m$a */
        /* loaded from: classes3.dex */
        public static final class C10751a extends Lambda implements Function1<C46363ob3, C46363ob3> {

            /* renamed from: g */
            public final /* synthetic */ List<OperatorNotification> f50684g;

            /* renamed from: h */
            public final /* synthetic */ Optional<OperatorNotificationCategory> f50685h;

            /* renamed from: i */
            public final /* synthetic */ List<OperatorNotificationCategory> f50686i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C10751a(List<? extends OperatorNotification> list, Optional<OperatorNotificationCategory> optional, List<OperatorNotificationCategory> list2) {
                super(1);
                this.f50684g = list;
                this.f50685h = optional;
                this.f50686i = list2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C46363ob3 invoke(C46363ob3 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return C46363ob3.copy$default(state, false, this.f50684g, this.f50685h.m59035e(), this.f50686i, 0, 17, null);
            }
        }

        public C10750m() {
            super(1);
        }

        /* renamed from: a */
        public final void m71122a(Triple<? extends List<? extends OperatorNotification>, Optional<OperatorNotificationCategory>, ? extends List<OperatorNotificationCategory>> triple) {
            C38044ab3.this.m42279i(new C10751a(triple.component1(), triple.component2(), triple.component3()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends List<? extends OperatorNotification>, ? extends Optional<OperatorNotificationCategory>, ? extends List<? extends OperatorNotificationCategory>> triple) {
            m71122a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lob3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lob3;)Lob3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNotificationCenterPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterPresenter.kt\nco/bird/android/feature/notificationcenter/fragment/NotificationCenterPresenter$onError$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
    /* renamed from: ab3$n */
    /* loaded from: classes3.dex */
    public static final class C10752n extends Lambda implements Function1<C46363ob3, C46363ob3> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f50687g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10752n(Throwable th) {
            super(1);
            this.f50687g = th;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C46363ob3 invoke(C46363ob3 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            C46363ob3 copy$default = C46363ob3.copy$default(state, false, null, null, null, state.m20808e() - 1, 15, null);
            copy$default.m20805h(this.f50687g);
            return copy$default;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ab3$o */
    /* loaded from: classes3.dex */
    public static final class C10753o extends Lambda implements Function1<InterfaceC23465c, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lob3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lob3;)Lob3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ab3$o$a */
        /* loaded from: classes3.dex */
        public static final class C10754a extends Lambda implements Function1<C46363ob3, C46363ob3> {

            /* renamed from: g */
            public static final C10754a f50689g = new C10754a();

            public C10754a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C46363ob3 invoke(C46363ob3 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return C46363ob3.copy$default(state, false, null, null, null, state.m20808e() + 1, 15, null);
            }
        }

        public C10753o() {
            super(1);
        }

        /* renamed from: a */
        public final void m71119a(InterfaceC23465c interfaceC23465c) {
            C38044ab3.this.m42279i(C10754a.f50689g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m71119a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lob3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lob3;)Lob3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ab3$p */
    /* loaded from: classes3.dex */
    public static final class C10755p extends Lambda implements Function1<C46363ob3, C46363ob3> {

        /* renamed from: g */
        public static final C10755p f50690g = new C10755p();

        public C10755p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C46363ob3 invoke(C46363ob3 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return C46363ob3.copy$default(state, false, null, null, null, state.m20808e() - 1, 15, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001aº\u0001\u0012V\b\u0001\u0012R\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004 \b*(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004\u0018\u00010\u00030\u0003 \b*\\\u0012V\b\u0001\u0012R\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004 \b*(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"", "groupId", "Lio/reactivex/B;", "Lkotlin/Triple;", "", "Lco/bird/android/model/OperatorNotification;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ab3$q */
    /* loaded from: classes3.dex */
    public static final class C10756q extends Lambda implements Function1<String, InterfaceC23434B<? extends Triple<? extends List<? extends OperatorNotification>, ? extends Optional<OperatorNotificationCategory>, ? extends List<? extends OperatorNotificationCategory>>>> {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "notifications", "", "Lco/bird/android/model/OperatorNotification$Notification;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ab3$q$a */
        /* loaded from: classes3.dex */
        public static final class C10757a extends Lambda implements Function1<List<? extends OperatorNotification.Notification>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AtomicBoolean f50692g;

            /* renamed from: h */
            public final /* synthetic */ C38044ab3 f50693h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10757a(AtomicBoolean atomicBoolean, C38044ab3 c38044ab3) {
                super(1);
                this.f50692g = atomicBoolean;
                this.f50693h = c38044ab3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends OperatorNotification.Notification> list) {
                invoke2((List<OperatorNotification.Notification>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<OperatorNotification.Notification> notifications) {
                Object first;
                Object first2;
                if (this.f50692g.getAndSet(true)) {
                    return;
                }
                InterfaceC1880Ea interfaceC1880Ea = this.f50693h.f50670f;
                Intrinsics.checkNotNullExpressionValue(notifications, "notifications");
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) notifications);
                String category = ((OperatorNotification.Notification) first).getCategory();
                first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) notifications);
                interfaceC1880Ea.mo55905y(new C50050uo3(null, null, null, category, ((OperatorNotification.Notification) first2).getKind(), 7, null));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001aR\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0000 \u0007*(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "Lco/bird/android/model/OperatorNotification$Notification;", "notifications", "Lkotlin/Triple;", "Lco/bird/android/model/OperatorNotification;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ab3$q$b */
        /* loaded from: classes3.dex */
        public static final class C10758b extends Lambda implements Function1<List<? extends OperatorNotification.Notification>, Triple<? extends List<? extends OperatorNotification>, ? extends Optional<OperatorNotificationCategory>, ? extends List<? extends OperatorNotificationCategory>>> {

            /* renamed from: g */
            public static final C10758b f50694g = new C10758b();

            public C10758b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<List<OperatorNotification>, Optional<OperatorNotificationCategory>, List<OperatorNotificationCategory>> invoke(List<OperatorNotification.Notification> notifications) {
                List emptyList;
                Intrinsics.checkNotNullParameter(notifications, "notifications");
                Optional m59034a = Optional.f63040c.m59034a();
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return new Triple<>(notifications, m59034a, emptyList);
            }
        }

        public C10756q() {
            super(1);
        }

        /* renamed from: d */
        public static final Triple m71113d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23434B<? extends Triple<List<OperatorNotification>, Optional<OperatorNotificationCategory>, List<OperatorNotificationCategory>>> invoke(String groupId) {
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Observable<List<OperatorNotification.Notification>> mo108778j0 = C38044ab3.this.f50669e.mo108778j0(groupId);
            final C10757a c10757a = new C10757a(atomicBoolean, C38044ab3.this);
            Observable<List<OperatorNotification.Notification>> doOnNext = mo108778j0.doOnNext(new InterfaceC23484g() { // from class: bb3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C38044ab3.C10756q.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C10758b c10758b = C10758b.f50694g;
            return doOnNext.map(new InterfaceC23492o() { // from class: cb3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m71113d;
                    m71113d = C38044ab3.C10756q.m71113d(Function1.this, obj);
                    return m71113d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "categories", "Lco/bird/android/model/OperatorNotification;", "notifications", "Lco/bird/android/buava/Optional;", "filter", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/util/List;Ljava/util/List;Lco/bird/android/buava/Optional;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNotificationCenterPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterPresenter.kt\nco/bird/android/feature/notificationcenter/fragment/NotificationCenterPresenter$streamNotifications$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n766#2:172\n857#2,2:173\n*S KotlinDebug\n*F\n+ 1 NotificationCenterPresenter.kt\nco/bird/android/feature/notificationcenter/fragment/NotificationCenterPresenter$streamNotifications$2$1\n*L\n144#1:172\n144#1:173,2\n*E\n"})
    /* renamed from: ab3$r */
    /* loaded from: classes3.dex */
    public static final class C10759r extends Lambda implements Function3<List<? extends OperatorNotificationCategory>, List<? extends OperatorNotification>, Optional<OperatorNotificationCategory>, Triple<? extends List<? extends OperatorNotification>, ? extends Optional<OperatorNotificationCategory>, ? extends List<? extends OperatorNotificationCategory>>> {

        /* renamed from: g */
        public static final C10759r f50695g = new C10759r();

        public C10759r() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final Triple<List<OperatorNotification>, Optional<OperatorNotificationCategory>, List<OperatorNotificationCategory>> invoke(List<OperatorNotificationCategory> categories, List<? extends OperatorNotification> notifications, Optional<OperatorNotificationCategory> filter) {
            Intrinsics.checkNotNullParameter(categories, "categories");
            Intrinsics.checkNotNullParameter(notifications, "notifications");
            Intrinsics.checkNotNullParameter(filter, "filter");
            if (!filter.m59037c()) {
                return new Triple<>(notifications, filter, categories);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : notifications) {
                if (Intrinsics.areEqual(((OperatorNotification) obj).getCategory(), filter.m59038b().getCategory())) {
                    arrayList.add(obj);
                }
            }
            return new Triple<>(arrayList, filter, categories);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ab3$s */
    /* loaded from: classes3.dex */
    public static final class C10760s extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C10760s() {
            super(1);
        }

        /* renamed from: a */
        public final void m71110a(InterfaceC23465c interfaceC23465c) {
            C38044ab3.this.f50670f.mo55905y(new C49457to3(null, null, null, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m71110a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38044ab3(InterfaceC32318Da3 notificationCenterManager, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, C31616Aa3 fragmentNavigator) {
        super(new C46363ob3(false, null, null, null, 0, 31, null));
        Intrinsics.checkNotNullParameter(notificationCenterManager, "notificationCenterManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(fragmentNavigator, "fragmentNavigator");
        this.f50669e = notificationCenterManager;
        this.f50670f = analyticsManager;
        this.f50671g = reactiveConfig;
        this.f50672h = navigator;
        this.f50673i = fragmentNavigator;
    }

    /* renamed from: H */
    public static final Boolean m71165H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final Boolean m71164I(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj, obj2);
    }

    /* renamed from: J */
    public static final InterfaceC23496h m71163J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m71162K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m71161L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m71160M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m71159N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final Boolean m71158O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC24574u m71157P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23496h m71156Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m71155R() {
    }

    /* renamed from: S */
    public static final void m71154S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m71153T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final Optional m71152U(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj, obj2);
    }

    /* renamed from: X */
    public static final void m71149X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m71148Y(C38044ab3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m42279i(C10755p.f50690g);
    }

    /* renamed from: a0 */
    public static final InterfaceC23434B m71146a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final InterfaceC23434B m71145b0(C38044ab3 this$0, InterfaceC39841db3 renderer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(renderer, "$renderer");
        Observable<List<OperatorNotificationCategory>> mo108779g0 = this$0.f50669e.mo108779g0();
        Observable<List<OperatorNotification>> mo108776w = this$0.f50669e.mo108776w();
        Observable<Optional<OperatorNotificationCategory>> startWith = renderer.mo3225e1().startWith((Observable<Optional<OperatorNotificationCategory>>) Optional.f63040c.m59034a());
        final C10759r c10759r = C10759r.f50695g;
        return Observable.combineLatest(mo108779g0, mo108776w, startWith, new InterfaceC23485h() { // from class: Qa3
            @Override // io.reactivex.functions.InterfaceC23485h
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Triple m71144c0;
                m71144c0 = C38044ab3.m71144c0(Function3.this, obj, obj2, obj3);
                return m71144c0;
            }
        });
    }

    /* renamed from: c0 */
    public static final Triple m71144c0(Function3 tmp0, Object obj, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj, obj2, obj3);
    }

    /* renamed from: d0 */
    public static final void m71143d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: G */
    public void consume(InterfaceC39841db3 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        AbstractC24507p<String> mo3223y4 = renderer.mo3223y4();
        final C10742f c10742f = C10742f.f50676g;
        AbstractC24507p<R> m32067H = mo3223y4.m32067H(new InterfaceC23492o() { // from class: Sa3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m71165H;
                m71165H = C38044ab3.m71165H(Function1.this, obj);
                return m71165H;
            }
        });
        Boolean bool = Boolean.TRUE;
        Observable m32045d0 = m32067H.m32054V(AbstractC24507p.m32068G(bool)).m32045d0();
        Observable<Boolean> m82858I8 = this.f50671g.m82858I8();
        final C10743g c10743g = C10743g.f50677g;
        Observable combineLatest = Observable.combineLatest(m32045d0, m82858I8, new InterfaceC23480c() { // from class: Xa3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Boolean m71164I;
                m71164I = C38044ab3.m71164I(Function2.this, obj, obj2);
                return m71164I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(\n      // …enter && filtersEnabled }");
        Object m33094as = combineLatest.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10744h c10744h = new C10744h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ya3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38044ab3.m71159N(Function1.this, obj);
            }
        });
        AbstractC24507p<String> mo3223y42 = renderer.mo3223y4();
        final C10746i c10746i = C10746i.f50680g;
        AbstractC24507p m32054V = mo3223y42.m32067H(new InterfaceC23492o() { // from class: Za3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m71158O;
                m71158O = C38044ab3.m71158O(Function1.this, obj);
                return m71158O;
            }
        }).m32054V(AbstractC24507p.m32068G(bool));
        final C10747j c10747j = C10747j.f50681g;
        AbstractC24507p m32021x = m32054V.m32021x(new InterfaceC23492o() { // from class: Ha3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m71157P;
                m71157P = C38044ab3.m71157P(Function1.this, obj);
                return m71157P;
            }
        });
        final C10748k c10748k = new C10748k();
        AbstractC23461c m32074A = m32021x.m32074A(new InterfaceC23492o() { // from class: Ia3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m71156Q;
                m71156Q = C38044ab3.m71156Q(Function1.this, obj);
                return m71156Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32074A, "override fun consume(ren…or::goToNotification)\n  }");
        Object m33041n = m32074A.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Ja3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C38044ab3.m71155R();
            }
        };
        final C10749l c10749l = new C10749l(this);
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Ka3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38044ab3.m71154S(Function1.this, obj);
            }
        });
        Object m33094as2 = m71147Z(renderer.mo3223y4(), renderer).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10750m c10750m = new C10750m();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: La3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38044ab3.m71153T(Function1.this, obj);
            }
        });
        Observable<Unit> throttleFirst = renderer.mo3241A8().throttleFirst(500L, TimeUnit.MILLISECONDS);
        Observable<Optional<OperatorNotificationCategory>> startWith = renderer.mo3225e1().startWith((Observable<Optional<OperatorNotificationCategory>>) Optional.f63040c.m59034a());
        final C10737a c10737a = C10737a.f50674g;
        Observable<R> withLatestFrom = throttleFirst.withLatestFrom(startWith, new InterfaceC23480c() { // from class: Ma3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Optional m71152U;
                m71152U = C38044ab3.m71152U(Function2.this, obj, obj2);
                return m71152U;
            }
        });
        final C10738b c10738b = new C10738b();
        AbstractC23461c flatMapCompletable = withLatestFrom.flatMapCompletable(new InterfaceC23492o() { // from class: Ta3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m71163J;
                m71163J = C38044ab3.m71163J(Function1.this, obj);
                return m71163J;
            }
        });
        final C10739c c10739c = new C10739c(this);
        AbstractC23461c m33066T = flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: Ua3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38044ab3.m71162K(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun consume(ren…or::goToNotification)\n  }");
        Object m33041n2 = m33066T.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        Object m33094as3 = renderer.mo3231N8().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10740d c10740d = new C10740d(this.f50673i);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Va3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38044ab3.m71161L(Function1.this, obj);
            }
        });
        Object m33094as4 = renderer.mo3237E5().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10741e c10741e = new C10741e(this.f50672h);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Wa3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38044ab3.m71160M(Function1.this, obj);
            }
        });
    }

    /* renamed from: V */
    public final void m71151V(Throwable th) {
        m42279i(new C10752n(th));
    }

    /* renamed from: W */
    public final AbstractC23461c m71150W(AbstractC23461c abstractC23461c) {
        final C10753o c10753o = new C10753o();
        AbstractC23461c m33030y = abstractC23461c.m33081E(new InterfaceC23484g() { // from class: Ga3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38044ab3.m71149X(Function1.this, obj);
            }
        }).m33030y(new InterfaceC23478a() { // from class: Ra3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C38044ab3.m71148Y(C38044ab3.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33030y, "private fun Completable.…oading - 1) }\n      }\n  }");
        return m33030y;
    }

    /* renamed from: Z */
    public final Observable<Triple<List<OperatorNotification>, Optional<OperatorNotificationCategory>, List<OperatorNotificationCategory>>> m71147Z(AbstractC24507p<String> abstractC24507p, final InterfaceC39841db3 interfaceC39841db3) {
        final C10756q c10756q = new C10756q();
        Observable<R> m32073B = abstractC24507p.m32073B(new InterfaceC23492o() { // from class: Na3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m71146a0;
                m71146a0 = C38044ab3.m71146a0(Function1.this, obj);
                return m71146a0;
            }
        });
        Observable defer = Observable.defer(new Callable() { // from class: Oa3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23434B m71145b0;
                m71145b0 = C38044ab3.m71145b0(C38044ab3.this, interfaceC39841db3);
                return m71145b0;
            }
        });
        final C10760s c10760s = new C10760s();
        Observable<Triple<List<OperatorNotification>, Optional<OperatorNotificationCategory>, List<OperatorNotificationCategory>>> switchIfEmpty = m32073B.switchIfEmpty(defer.doOnSubscribe(new InterfaceC23484g() { // from class: Pa3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38044ab3.m71143d0(Function1.this, obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(switchIfEmpty, "private fun Maybe<String…ed())\n        }\n    )\n  }");
        return switchIfEmpty;
    }
}
