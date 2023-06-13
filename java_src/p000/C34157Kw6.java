package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.NearbyBirdViewModel;
import co.bird.android.model.Vehicle;
import co.bird.android.model.wire.WireBird;
import co.bird.api.response.BatchBird;
import co.bird.api.response.BirdCodeWithStatus;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.C34157Kw6;
import p000.InterfaceC27246pJ;
@Metadata(m28433d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u000e\b\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\b\b\u0001\u0010(\u001a\u00020%\u0012\b\b\u0001\u0010,\u001a\u00020)¢\u0006\u0004\bP\u0010QJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R.\u00106\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010.0.0-8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R.\u0010:\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010.0.0-8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b7\u00101\u0012\u0004\b9\u00105\u001a\u0004\b8\u00103R.\u0010>\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010.0.0-8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b;\u00101\u0012\u0004\b=\u00105\u001a\u0004\b<\u00103RX\u0010F\u001aF\u0012\u0004\u0012\u00020@\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020B\u0012\u0006\u0012\u0004\u0018\u00010@\u0012\u0004\u0012\u00020\t0A0?j\"\u0012\u0004\u0012\u00020@\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020B\u0012\u0006\u0012\u0004\u0018\u00010@\u0012\u0004\u0012\u00020\t0A`C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER$\u0010K\u001a\u0012\u0012\u0004\u0012\u00020@0Gj\b\u0012\u0004\u0012\u00020@`H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010M¨\u0006R"}, m28432d2 = {"LKw6;", "", "", "Lco/bird/android/model/wire/WireBird;", "bluetoothDiscoveredBirds", "Lco/bird/api/response/BatchBird;", "batchBirds", "", "p", "", "success", "", "F", "Landroid/content/Intent;", "intent", "r", "LfF;", C17296a.f69688o, "LfF;", "batchManager", "LpJ;", "b", "LpJ;", "bluetoothManager", "Lxk6;", "c", "Lxk6;", "vehicleBirdHydrationManager", "LEa;", DateTokenConverter.CONVERTER_KEY, "LEa;", "analyticsManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "e", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Le13;", "f", "Le13;", "navigator", "LSw6;", "g", "LSw6;", "ui", "Lio/reactivex/subjects/a;", "", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/a;", "q", "()Lio/reactivex/subjects/a;", "getTotalBirdsSubject$app_birdRelease$annotations", "()V", "totalBirdsSubject", "i", "n", "getBirdsAwokenSubject$app_birdRelease$annotations", "birdsAwokenSubject", "j", "o", "getBirdsFailedToWakeSubject$app_birdRelease$annotations", "birdsFailedToWakeSubject", "Ljava/util/HashMap;", "", "Lkotlin/Triple;", "Lco/bird/api/response/BirdCodeWithStatus;", "Lkotlin/collections/HashMap;", "k", "Ljava/util/HashMap;", "serialNumberScanResultMap", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "l", "Ljava/util/HashSet;", "serialNumberBlacklist", "m", "Ljava/lang/String;", "sessionId", "bulkAttemptId", "<init>", "(LfF;LpJ;Lxk6;LEa;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LSw6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWakeFlockProgressPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WakeFlockProgressPresenter.kt\nco/bird/android/app/feature/wakebirds/WakeFlockProgressPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n180#2:181\n199#2:182\n1549#3:183\n1620#3,3:184\n766#3:187\n857#3,2:188\n*S KotlinDebug\n*F\n+ 1 WakeFlockProgressPresenter.kt\nco/bird/android/app/feature/wakebirds/WakeFlockProgressPresenterImpl\n*L\n80#1:181\n157#1:182\n164#1:183\n164#1:184,3\n165#1:187\n165#1:188,2\n*E\n"})
/* renamed from: Kw6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34157Kw6 {

    /* renamed from: a */
    public final InterfaceC20340fF f20408a;

    /* renamed from: b */
    public final InterfaceC27246pJ f20409b;

    /* renamed from: c */
    public final InterfaceC51791xk6 f20410c;

    /* renamed from: d */
    public final InterfaceC1880Ea f20411d;

    /* renamed from: e */
    public final LifecycleScopeProvider<EnumC7097RE> f20412e;

    /* renamed from: f */
    public final InterfaceC40099e13 f20413f;

    /* renamed from: g */
    public final InterfaceC36029Sw6 f20414g;

    /* renamed from: h */
    public final C24552a<Integer> f20415h;

    /* renamed from: i */
    public final C24552a<Integer> f20416i;

    /* renamed from: j */
    public final C24552a<Integer> f20417j;

    /* renamed from: k */
    public final HashMap<String, Triple<BirdCodeWithStatus, String, Boolean>> f20418k;

    /* renamed from: l */
    public final HashSet<String> f20419l;

    /* renamed from: m */
    public final String f20420m;

    /* renamed from: n */
    public final String f20421n;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Kw6$a */
    /* loaded from: classes2.dex */
    public static final class C4632a extends Lambda implements Function1<Throwable, Unit> {
        public C4632a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C34157Kw6.this.m98114F(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u000420\u0010\u0003\u001a,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", C17296a.f69688o, "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kw6$b */
    /* loaded from: classes2.dex */
    public static final class C4633b extends Lambda implements Function1<Triple<? extends Integer, ? extends Integer, ? extends Integer>, InterfaceC23447K<? extends DialogResponse>> {
        public C4633b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends DialogResponse> invoke(Triple<Integer, Integer, Integer> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Integer birdsAwoken = triple.component1();
            Integer birdsFailedToWake = triple.component2();
            Integer totalBirds = triple.component3();
            InterfaceC36029Sw6 interfaceC36029Sw6 = C34157Kw6.this.f20414g;
            Intrinsics.checkNotNullExpressionValue(birdsAwoken, "birdsAwoken");
            int intValue = birdsAwoken.intValue();
            Intrinsics.checkNotNullExpressionValue(birdsFailedToWake, "birdsFailedToWake");
            int intValue2 = birdsFailedToWake.intValue();
            Intrinsics.checkNotNullExpressionValue(totalBirds, "totalBirds");
            return interfaceC36029Sw6.mo82227wa(intValue, intValue2, totalBirds.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kw6$c */
    /* loaded from: classes2.dex */
    public static final class C4634c extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends DialogResponse>> {
        public C4634c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DialogResponse> invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C34157Kw6.this.f20414g.mo82229ff();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kw6$d */
    /* loaded from: classes2.dex */
    public static final class C4635d extends Lambda implements Function1<DialogResponse, Unit> {
        public C4635d() {
            super(1);
        }

        /* renamed from: a */
        public final void m98086a(DialogResponse dialogResponse) {
            C34157Kw6.this.f20413f.close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m98086a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042b\u0010\u0003\u001a^\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*.\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kw6$e */
    /* loaded from: classes2.dex */
    public static final class C4636e extends Lambda implements Function1<Triple<? extends Integer, ? extends Integer, ? extends Integer>, Unit> {
        public C4636e() {
            super(1);
        }

        /* renamed from: a */
        public final void m98085a(Triple<Integer, Integer, Integer> triple) {
            Integer totalBirds = triple.component1();
            Integer birdsAwoken = triple.component2();
            Integer birdsFailedToAwake = triple.component3();
            InterfaceC36029Sw6 interfaceC36029Sw6 = C34157Kw6.this.f20414g;
            Intrinsics.checkNotNullExpressionValue(totalBirds, "totalBirds");
            interfaceC36029Sw6.mo82230cl(totalBirds.intValue());
            InterfaceC36029Sw6 interfaceC36029Sw62 = C34157Kw6.this.f20414g;
            Intrinsics.checkNotNullExpressionValue(birdsAwoken, "birdsAwoken");
            interfaceC36029Sw62.mo82231Ph(birdsAwoken.intValue());
            InterfaceC36029Sw6 interfaceC36029Sw63 = C34157Kw6.this.f20414g;
            Intrinsics.checkNotNullExpressionValue(birdsFailedToAwake, "birdsFailedToAwake");
            interfaceC36029Sw63.mo82228q5(birdsFailedToAwake.intValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Integer, ? extends Integer, ? extends Integer> triple) {
            m98085a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kw6$f */
    /* loaded from: classes2.dex */
    public static final class C4637f extends Lambda implements Function1<List<? extends Vehicle>, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: g */
        public static final C4637f f20427g = new C4637f();

        public C4637f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(List<Vehicle> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Observable.fromIterable(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/u;", "Lco/bird/android/model/NearbyBirdViewModel;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kw6$g */
    /* loaded from: classes2.dex */
    public static final class C4638g extends Lambda implements Function1<Vehicle, InterfaceC24574u<? extends NearbyBirdViewModel>> {
        public C4638g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends NearbyBirdViewModel> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C34157Kw6.this.f20410c.mo4752a(it, C34157Kw6.this.f20418k, C34157Kw6.this.f20419l, new HashMap<>());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/NearbyBirdViewModel;", "it", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/NearbyBirdViewModel;)Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kw6$h */
    /* loaded from: classes2.dex */
    public static final class C4639h extends Lambda implements Function1<NearbyBirdViewModel, WireBird> {

        /* renamed from: g */
        public static final C4639h f20429g = new C4639h();

        public C4639h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireBird invoke(NearbyBirdViewModel it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getVehicle().getBird();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Kw6$i */
    /* loaded from: classes2.dex */
    public static final class C4640i extends Lambda implements Function1<List<WireBird>, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ String f20430g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4640i(String str) {
            super(1);
            this.f20430g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<WireBird> list) {
            return Boolean.valueOf(this.f20430g != null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a,\u0012(\u0012&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00000\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "", "bluetoothBirdsNearby", "Lio/reactivex/K;", "c", "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kw6$j */
    /* loaded from: classes2.dex */
    public static final class C4641j extends Lambda implements Function1<List<WireBird>, InterfaceC23447K<List<WireBird>>> {

        /* renamed from: h */
        public final /* synthetic */ String f20432h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Kw6$j$a */
        /* loaded from: classes2.dex */
        public static final class C4642a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34157Kw6 f20433g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4642a(C34157Kw6 c34157Kw6) {
                super(1);
                this.f20433g = c34157Kw6;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f20433g.f20414g.error(th.getMessage());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/api/response/BatchBird;", "it", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kw6$j$b */
        /* loaded from: classes2.dex */
        public static final class C4643b extends Lambda implements Function1<List<? extends BatchBird>, List<WireBird>> {

            /* renamed from: g */
            public final /* synthetic */ C34157Kw6 f20434g;

            /* renamed from: h */
            public final /* synthetic */ List<WireBird> f20435h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4643b(C34157Kw6 c34157Kw6, List<WireBird> list) {
                super(1);
                this.f20434g = c34157Kw6;
                this.f20435h = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<WireBird> invoke(List<BatchBird> it) {
                Set set;
                Set set2;
                Intrinsics.checkNotNullParameter(it, "it");
                C34157Kw6 c34157Kw6 = this.f20434g;
                List<WireBird> bluetoothBirdsNearby = this.f20435h;
                Intrinsics.checkNotNullExpressionValue(bluetoothBirdsNearby, "bluetoothBirdsNearby");
                set = CollectionsKt___CollectionsKt.toSet(bluetoothBirdsNearby);
                set2 = CollectionsKt___CollectionsKt.toSet(it);
                return c34157Kw6.m98098p(set, set2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4641j(String str) {
            super(1);
            this.f20432h = str;
        }

        /* renamed from: d */
        public static final List m98078d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<List<WireBird>> invoke(List<WireBird> list) {
            InterfaceC20340fF interfaceC20340fF = C34157Kw6.this.f20408a;
            String str = this.f20432h;
            Intrinsics.checkNotNull(str);
            AbstractC23442F<List<BatchBird>> mo34296a = interfaceC20340fF.mo34296a(str);
            final C4642a c4642a = new C4642a(C34157Kw6.this);
            AbstractC23442F<List<BatchBird>> m33106t = mo34296a.m33106t(new InterfaceC23484g() { // from class: Lw6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34157Kw6.C4641j.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C4643b c4643b = new C4643b(C34157Kw6.this, list);
            InterfaceC23447K m33157I = m33106t.m33157I(new InterfaceC23492o() { // from class: Mw6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m98078d;
                    m98078d = C34157Kw6.C4641j.m98078d(Function1.this, obj);
                    return m98078d;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33157I, "override fun onCreate(in…gator.close()\n      }\n  }");
            return m33157I;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Kw6$k */
    /* loaded from: classes2.dex */
    public static final class C4644k extends Lambda implements Function1<List<WireBird>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ DateTime f20437h;

        /* renamed from: i */
        public final /* synthetic */ DateTime f20438i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4644k(DateTime dateTime, DateTime dateTime2) {
            super(1);
            this.f20437h = dateTime;
            this.f20438i = dateTime2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<WireBird> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> list) {
            C34157Kw6.this.m98097q().onNext(Integer.valueOf(list.size()));
            InterfaceC1880Ea interfaceC1880Ea = C34157Kw6.this.f20411d;
            String str = C34157Kw6.this.f20420m;
            String str2 = C34157Kw6.this.f20421n;
            String name = EnumC12346bH.BULK.name();
            int size = list.size();
            DateTime eventTime = this.f20437h;
            Intrinsics.checkNotNullExpressionValue(eventTime, "eventTime");
            DateTime clientTime = this.f20438i;
            Intrinsics.checkNotNullExpressionValue(clientTime, "clientTime");
            interfaceC1880Ea.mo55905y(new C4464KY(null, null, null, eventTime, clientTime, str, str2, name, Integer.valueOf(size), null, null, 1543, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001d\n\u0002\u0010\u001c\n\u0002\b\u0002\u0010\u0007\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00060\u00052(\u0010\u0004\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "", "it", "", "", C17296a.f69688o, "(Ljava/util/List;)Ljava/lang/Iterable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kw6$l */
    /* loaded from: classes2.dex */
    public static final class C4645l extends Lambda implements Function1<List<WireBird>, Iterable<? extends WireBird>> {

        /* renamed from: g */
        public static final C4645l f20439g = new C4645l();

        public C4645l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Iterable<WireBird> invoke(List<WireBird> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/u;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kw6$m */
    /* loaded from: classes2.dex */
    public static final class C4646m extends Lambda implements Function1<WireBird, InterfaceC24574u<? extends Vehicle>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kw6$m$a */
        /* loaded from: classes2.dex */
        public static final class C4647a extends Lambda implements Function1<Vehicle, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34157Kw6 f20441g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4647a(C34157Kw6 c34157Kw6) {
                super(1);
                this.f20441g = c34157Kw6;
            }

            /* renamed from: a */
            public final void m98071a(Vehicle vehicle) {
                C24552a<Integer> m98100n = this.f20441g.m98100n();
                Integer value = this.f20441g.m98100n().getValue();
                if (value == null) {
                    value = 0;
                }
                m98100n.onNext(Integer.valueOf(value.intValue() + 1));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
                m98071a(vehicle);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Kw6$m$b */
        /* loaded from: classes2.dex */
        public static final class C4648b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34157Kw6 f20442g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4648b(C34157Kw6 c34157Kw6) {
                super(1);
                this.f20442g = c34157Kw6;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C24552a<Integer> m98099o = this.f20442g.m98099o();
                Integer value = this.f20442g.m98099o().getValue();
                if (value == null) {
                    value = 0;
                }
                m98099o.onNext(Integer.valueOf(value.intValue() + 1));
            }
        }

        public C4646m() {
            super(1);
        }

        /* renamed from: d */
        public static final void m98072d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Vehicle> invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            AbstractC23442F firstOrError = InterfaceC27246pJ.C27247a.enableDeepSleep$default(C34157Kw6.this.f20409b, bird, false, new C4464KY(null, bird.getId(), null, null, null, C34157Kw6.this.f20420m, C34157Kw6.this.f20421n, EnumC12346bH.BULK.name(), C34157Kw6.this.m98097q().getValue(), null, null, 1565, null), null, false, false, 40, null).firstOrError();
            final C4647a c4647a = new C4647a(C34157Kw6.this);
            AbstractC23442F m33101w = firstOrError.m33101w(new InterfaceC23484g() { // from class: Nw6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34157Kw6.C4646m.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C4648b c4648b = new C4648b(C34157Kw6.this);
            return m33101w.m33106t(new InterfaceC23484g() { // from class: Ow6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34157Kw6.C4646m.m98072d(Function1.this, obj);
                }
            }).m33125j0().m32063L(AbstractC24507p.m32024u());
        }
    }

    public C34157Kw6(InterfaceC20340fF batchManager, InterfaceC27246pJ bluetoothManager, InterfaceC51791xk6 vehicleBirdHydrationManager, InterfaceC1880Ea analyticsManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC40099e13 navigator, InterfaceC36029Sw6 ui) {
        Intrinsics.checkNotNullParameter(batchManager, "batchManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(vehicleBirdHydrationManager, "vehicleBirdHydrationManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f20408a = batchManager;
        this.f20409b = bluetoothManager;
        this.f20410c = vehicleBirdHydrationManager;
        this.f20411d = analyticsManager;
        this.f20412e = scopeProvider;
        this.f20413f = navigator;
        this.f20414g = ui;
        C24552a<Integer> m31921g = C24552a.m31921g(0);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(0)");
        this.f20415h = m31921g;
        C24552a<Integer> m31921g2 = C24552a.m31921g(0);
        Intrinsics.checkNotNullExpressionValue(m31921g2, "createDefault(0)");
        this.f20416i = m31921g2;
        C24552a<Integer> m31921g3 = C24552a.m31921g(0);
        Intrinsics.checkNotNullExpressionValue(m31921g3, "createDefault(0)");
        this.f20417j = m31921g3;
        this.f20418k = new HashMap<>();
        this.f20419l = new HashSet<>();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f20420m = uuid;
        String uuid2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid2, "randomUUID().toString()");
        this.f20421n = uuid2;
    }

    /* renamed from: A */
    public static final Iterable m98119A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Iterable) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final InterfaceC24574u m98118B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m98117C(C34157Kw6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m98114F(true);
    }

    /* renamed from: D */
    public static final void m98116D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m98115E(C34157Kw6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f20409b.release();
    }

    public static /* synthetic */ void getBirdsAwokenSubject$app_birdRelease$annotations() {
    }

    public static /* synthetic */ void getBirdsFailedToWakeSubject$app_birdRelease$annotations() {
    }

    public static /* synthetic */ void getTotalBirdsSubject$app_birdRelease$annotations() {
    }

    /* renamed from: s */
    public static final void m98095s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23434B m98094t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC23447K m98093u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23447K m98092v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m98091w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC24574u m98090x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final WireBird m98089y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireBird) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m98088z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public final void m98114F(boolean z) {
        this.f20411d.mo55905y(new C4139JY(null, null, null, null, null, this.f20420m, this.f20421n, EnumC12346bH.BULK.name(), this.f20415h.getValue(), z, null, null, 3103, null));
    }

    /* renamed from: n */
    public final C24552a<Integer> m98100n() {
        return this.f20416i;
    }

    /* renamed from: o */
    public final C24552a<Integer> m98099o() {
        return this.f20417j;
    }

    /* renamed from: p */
    public final List<WireBird> m98098p(Set<WireBird> set, Set<BatchBird> set2) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Set intersect;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (BatchBird batchBird : set2) {
            arrayList.add(batchBird.getBirdId());
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (WireBird wireBird : set) {
            arrayList2.add(wireBird.getId());
        }
        intersect = CollectionsKt___CollectionsKt.intersect(arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : set) {
            if (intersect.contains(((WireBird) obj).getId())) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    /* renamed from: q */
    public final C24552a<Integer> m98097q() {
        return this.f20415h;
    }

    /* renamed from: r */
    public void m98096r(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("batch_id");
        Observable observeOn = C24523e.f91168a.m31955b(this.f20415h, this.f20416i, this.f20417j).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f20412e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4636e c4636e = new C4636e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: xw6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34157Kw6.m98095s(Function1.this, obj);
            }
        });
        DateTime now = DateTime.now();
        DateTime now2 = DateTime.now();
        Observable scanBatch$default = InterfaceC27246pJ.C27247a.scanBatch$default(this.f20409b, 0, 1, null);
        final C4637f c4637f = C4637f.f20427g;
        Observable flatMap = scanBatch$default.flatMap(new InterfaceC23492o() { // from class: Ew6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m98094t;
                m98094t = C34157Kw6.m98094t(Function1.this, obj);
                return m98094t;
            }
        });
        final C4638g c4638g = new C4638g();
        Observable flatMapMaybe = flatMap.flatMapMaybe(new InterfaceC23492o() { // from class: Fw6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m98090x;
                m98090x = C34157Kw6.m98090x(Function1.this, obj);
                return m98090x;
            }
        });
        final C4639h c4639h = C4639h.f20429g;
        AbstractC23442F list = flatMapMaybe.map(new InterfaceC23492o() { // from class: Gw6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireBird m98089y;
                m98089y = C34157Kw6.m98089y(Function1.this, obj);
                return m98089y;
            }
        }).toList();
        Intrinsics.checkNotNullExpressionValue(list, "override fun onCreate(in…gator.close()\n      }\n  }");
        AbstractC23442F m74588G = C37279Yf5.m74588G(list, new C4640i(stringExtra), new C4641j(stringExtra));
        final C4644k c4644k = new C4644k(now2, now);
        AbstractC24490k m33127i0 = m74588G.m33101w(new InterfaceC23484g() { // from class: Hw6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34157Kw6.m98088z(Function1.this, obj);
            }
        }).m33127i0();
        final C4645l c4645l = C4645l.f20439g;
        AbstractC24490k m32158b0 = m33127i0.m32158b0(new InterfaceC23492o() { // from class: Iw6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Iterable m98119A;
                m98119A = C34157Kw6.m98119A(Function1.this, obj);
                return m98119A;
            }
        });
        final C4646m c4646m = new C4646m();
        AbstractC24490k m32199G = m32158b0.m32118q(new InterfaceC23492o() { // from class: Jw6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m98118B;
                m98118B = C34157Kw6.m98118B(Function1.this, obj);
                return m98118B;
            }
        }).m32199G(new InterfaceC23478a() { // from class: yw6
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C34157Kw6.m98117C(C34157Kw6.this);
            }
        });
        final C4632a c4632a = new C4632a();
        AbstractC23461c m32135k0 = m32199G.m32195I(new InterfaceC23484g() { // from class: zw6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34157Kw6.m98116D(Function1.this, obj);
            }
        }).m32111s0(C23454a.m33087a()).m32163Y0(C24542a.m31932c()).m32203E(new InterfaceC23478a() { // from class: Aw6
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C34157Kw6.m98115E(C34157Kw6.this);
            }
        }).m32135k0();
        C24530g c24530g = C24530g.f91174a;
        AbstractC23442F<Integer> firstOrError = this.f20416i.firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "birdsAwokenSubject.firstOrError()");
        AbstractC23442F<Integer> firstOrError2 = this.f20417j.firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError2, "birdsFailedToWakeSubject.firstOrError()");
        AbstractC23442F<Integer> firstOrError3 = this.f20415h.firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError3, "totalBirdsSubject.firstOrError()");
        AbstractC23442F m33042m = m32135k0.m33042m(c24530g.m31945b(firstOrError, firstOrError2, firstOrError3));
        Intrinsics.checkNotNullExpressionValue(m33042m, "override fun onCreate(in…gator.close()\n      }\n  }");
        AbstractC23442F progress$default = C28237sD.progress$default(m33042m, this.f20414g, 0, 2, (Object) null);
        final C4633b c4633b = new C4633b();
        AbstractC23442F m33165A = progress$default.m33165A(new InterfaceC23492o() { // from class: Bw6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m98093u;
                m98093u = C34157Kw6.m98093u(Function1.this, obj);
                return m98093u;
            }
        });
        final C4634c c4634c = new C4634c();
        AbstractC23442F m33150P = m33165A.m33150P(new InterfaceC23492o() { // from class: Cw6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m98092v;
                m98092v = C34157Kw6.m98092v(Function1.this, obj);
                return m98092v;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33150P, "override fun onCreate(in…gator.close()\n      }\n  }");
        Object m33135e = m33150P.m33135e(AutoDispose.m45239a(this.f20412e));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4635d c4635d = new C4635d();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Dw6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34157Kw6.m98091w(Function1.this, obj);
            }
        });
    }
}
