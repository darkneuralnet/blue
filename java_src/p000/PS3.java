package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PhysicalLockEvent;
import co.bird.android.model.PhysicalLockEventKind;
import co.bird.android.model.RideState;
import co.bird.android.model.analytics.PhysicalLockSuccessfullyLocked;
import co.bird.android.model.analytics.PhysicalLockSuccessfullyUnlocked;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.persistence.Tutorial;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WireRide;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001-BG\b\u0007\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b*\u0010+J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010&¨\u0006."}, m28432d2 = {"LPS3;", "LxC;", "LHS3;", "LES3;", "lockMode", "Lco/bird/android/model/wire/WirePhysicalLock;", "lock", "", "requestCode", "", "i", "(LES3;Lco/bird/android/model/wire/WirePhysicalLock;Ljava/lang/Integer;)V", "p", "E", "Le13;", "c", "Le13;", "navigator", "LYR4;", DateTokenConverter.CONVERTER_KEY, "LYR4;", "rideManager", "Lgl;", "e", "Lgl;", "preference", "LEa;", "f", "LEa;", "analyticsManager", "Llw0;", "g", "Llw0;", "configurableTutorialManager", "LgT3;", "h", "LgT3;", "ui", "LES3;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LYR4;Lgl;LEa;Llw0;LgT3;)V", "j", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhysicalLockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,142:1\n180#2:143\n180#2:144\n180#2:145\n180#2:146\n180#2:147\n*S KotlinDebug\n*F\n+ 1 PhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockPresenterImpl\n*L\n86#1:143\n91#1:144\n101#1:145\n106#1:146\n113#1:147\n*E\n"})
/* renamed from: PS3 */
/* loaded from: classes2.dex */
public final class PS3 extends C30060xC implements HS3 {

    /* renamed from: j */
    public static final C6367a f28508j = new C6367a(null);

    /* renamed from: k */
    public static final int f28509k = 8;

    /* renamed from: c */
    public final InterfaceC40099e13 f28510c;

    /* renamed from: d */
    public final YR4 f28511d;

    /* renamed from: e */
    public final C22454gl f28512e;

    /* renamed from: f */
    public final InterfaceC1880Ea f28513f;

    /* renamed from: g */
    public final InterfaceC44791lw0 f28514g;

    /* renamed from: h */
    public final InterfaceC41546gT3 f28515h;

    /* renamed from: i */
    public ES3 f28516i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LPS3$a;", "", "", "LOCK_BIRD_ZENDESK_ARTICLE_ID", "J", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: PS3$a */
    /* loaded from: classes2.dex */
    public static final class C6367a {
        public /* synthetic */ C6367a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6367a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PS3$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C6368b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ES3.values().length];
            try {
                iArr[ES3.UNLOCKING_BLUR_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ES3.UNLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ES3.LOCKING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "tutorials", "", "Lco/bird/android/model/persistence/Tutorial;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPhysicalLockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockPresenterImpl$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n1549#2:143\n1620#2,3:144\n*S KotlinDebug\n*F\n+ 1 PhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockPresenterImpl$onCreate$1\n*L\n68#1:143\n68#1:144,3\n*E\n"})
    /* renamed from: PS3$c */
    /* loaded from: classes2.dex */
    public static final class C6369c extends Lambda implements Function1<List<? extends Tutorial>, Boolean> {
        public C6369c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends Tutorial> list) {
            return invoke2((List<Tutorial>) list);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<Tutorial> tutorials) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(tutorials, "tutorials");
            InterfaceC40099e13 interfaceC40099e13 = PS3.this.f28510c;
            List<Tutorial> list = tutorials;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Tutorial tutorial : list) {
                arrayList.add(tutorial.getId());
            }
            interfaceC40099e13.mo37168G(arrayList, null, false);
            return Boolean.TRUE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LHM4;", "Lco/bird/android/model/PhysicalLockEvent;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PS3$d */
    /* loaded from: classes2.dex */
    public static final class C6370d extends Lambda implements Function1<Unit, InterfaceC23447K<? extends HM4<PhysicalLockEvent>>> {

        /* renamed from: g */
        public final /* synthetic */ WirePhysicalLock f28518g;

        /* renamed from: h */
        public final /* synthetic */ PS3 f28519h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6370d(WirePhysicalLock wirePhysicalLock, PS3 ps3) {
            super(1);
            this.f28518g = wirePhysicalLock;
            this.f28519h = ps3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends HM4<PhysicalLockEvent>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String birdId = this.f28518g.getBirdId();
            if (birdId != null) {
                return this.f28519h.f28511d.mo75041h0(birdId, PhysicalLockEventKind.REVEAL_CODE);
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/PhysicalLockEvent;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PS3$e */
    /* loaded from: classes2.dex */
    public static final class C6371e extends Lambda implements Function1<HM4<PhysicalLockEvent>, Unit> {
        public C6371e() {
            super(1);
        }

        /* renamed from: a */
        public final void m90223a(HM4<PhysicalLockEvent> hm4) {
            PS3.this.f28515h.mo14179Y5();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<PhysicalLockEvent> hm4) {
            m90223a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PS3$f */
    /* loaded from: classes2.dex */
    public static final class C6372f extends Lambda implements Function1<Unit, Unit> {
        public C6372f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            PS3.this.f28510c.close();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LHM4;", "Lco/bird/android/model/PhysicalLockEvent;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PS3$g */
    /* loaded from: classes2.dex */
    public static final class C6373g extends Lambda implements Function1<Unit, InterfaceC23447K<? extends HM4<PhysicalLockEvent>>> {

        /* renamed from: g */
        public final /* synthetic */ WirePhysicalLock f28522g;

        /* renamed from: h */
        public final /* synthetic */ PS3 f28523h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6373g(WirePhysicalLock wirePhysicalLock, PS3 ps3) {
            super(1);
            this.f28522g = wirePhysicalLock;
            this.f28523h = ps3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends HM4<PhysicalLockEvent>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String birdId = this.f28522g.getBirdId();
            if (birdId != null) {
                return this.f28523h.f28511d.mo75041h0(birdId, PhysicalLockEventKind.SKIP_CODE);
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/PhysicalLockEvent;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PS3$h */
    /* loaded from: classes2.dex */
    public static final class C6374h extends Lambda implements Function1<HM4<PhysicalLockEvent>, Unit> {
        public C6374h() {
            super(1);
        }

        /* renamed from: a */
        public final void m90222a(HM4<PhysicalLockEvent> hm4) {
            PS3.this.f28510c.close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<PhysicalLockEvent> hm4) {
            m90222a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PS3$i */
    /* loaded from: classes2.dex */
    public static final class C6375i extends Lambda implements Function1<Unit, Unit> {
        public C6375i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            PS3.this.mo90227p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PS3$j */
    /* loaded from: classes2.dex */
    public static final class C6376j extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ ES3 f28526g;

        /* renamed from: h */
        public final /* synthetic */ PS3 f28527h;

        /* renamed from: i */
        public final /* synthetic */ Integer f28528i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6376j(ES3 es3, PS3 ps3, Integer num) {
            super(1);
            this.f28526g = es3;
            this.f28527h = ps3;
            this.f28528i = num;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            Unit unit2;
            if (this.f28526g == ES3.UNLOCKING) {
                this.f28527h.f28513f.mo55956N(new PhysicalLockSuccessfullyUnlocked());
            } else {
                this.f28527h.f28513f.mo55956N(new PhysicalLockSuccessfullyLocked());
            }
            Integer num = this.f28528i;
            if (num != null) {
                PS3 ps3 = this.f28527h;
                num.intValue();
                ps3.f28510c.mo37029e4(-1, new Intent());
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                this.f28527h.f28510c.close();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "b", "()Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPhysicalLockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockPresenterImpl$onCreate$riddenBird$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n288#2:143\n1747#2,3:144\n289#2:147\n*S KotlinDebug\n*F\n+ 1 PhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockPresenterImpl$onCreate$riddenBird$2\n*L\n57#1:143\n58#1:144,3\n57#1:147\n*E\n"})
    /* renamed from: PS3$k */
    /* loaded from: classes2.dex */
    public static final class C6377k extends Lambda implements Function0<WireBird> {

        /* renamed from: h */
        public final /* synthetic */ WirePhysicalLock f28530h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6377k(WirePhysicalLock wirePhysicalLock) {
            super(0);
            this.f28530h = wirePhysicalLock;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final WireBird invoke() {
            Object obj;
            WireRide ride;
            List<WirePhysicalLock> physicalLocks;
            boolean z;
            WirePhysicalLock wirePhysicalLock = this.f28530h;
            Iterator<T> it = PS3.this.f28511d.mo75032o0().m73665a().activeRides().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    WireBird bird = ((RideState) obj).getRide().getBird();
                    boolean z2 = false;
                    if (bird != null && (physicalLocks = bird.getPhysicalLocks()) != null) {
                        List<WirePhysicalLock> list = physicalLocks;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (WirePhysicalLock wirePhysicalLock2 : list) {
                                if (Intrinsics.areEqual(wirePhysicalLock2.getId(), wirePhysicalLock.getId())) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            z2 = true;
                            continue;
                        } else {
                            continue;
                        }
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            RideState rideState = (RideState) obj;
            if (rideState == null || (ride = rideState.getRide()) == null) {
                return null;
            }
            return ride.getBird();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PS3(LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC40099e13 navigator, YR4 rideManager, C22454gl preference, InterfaceC1880Ea analyticsManager, InterfaceC44791lw0 configurableTutorialManager, InterfaceC41546gT3 ui) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(configurableTutorialManager, "configurableTutorialManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f28510c = navigator;
        this.f28511d = rideManager;
        this.f28512e = preference;
        this.f28513f = analyticsManager;
        this.f28514g = configurableTutorialManager;
        this.f28515h = ui;
    }

    /* renamed from: F */
    public static final WireBird m90236F(Lazy<WireBird> lazy) {
        return lazy.getValue();
    }

    /* renamed from: G */
    public static final InterfaceC23447K m90235G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m90234H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m90233I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23447K m90232J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m90231K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m90230L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m90229M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public final int m90237E(ES3 es3) {
        int i = C6368b.$EnumSwitchMapping$0[es3.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C45871nl4.physical_lock_lock_title;
                }
                throw new NoWhenBranchMatchedException();
            }
            return C45871nl4.physical_lock_unlock_title;
        }
        return C45871nl4.physical_lock_unlock_blur_title;
    }

    @Override // p000.HS3
    /* renamed from: i */
    public void mo90228i(ES3 lockMode, WirePhysicalLock lock, Integer num) {
        Lazy lazy;
        String str;
        Intrinsics.checkNotNullParameter(lockMode, "lockMode");
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f28516i = lockMode;
        lazy = LazyKt__LazyJVMKt.lazy(new C6377k(lock));
        InterfaceC44791lw0 interfaceC44791lw0 = this.f28514g;
        ConfigurableTutorialContext tutorialContext = lock.toTutorialContext(true);
        WireBird m90236F = m90236F(lazy);
        if (m90236F != null) {
            str = m90236F.getModel();
        } else {
            str = null;
        }
        interfaceC44791lw0.mo20265j0(tutorialContext, str, true, new C6369c());
        this.f28515h.mo14178e9(lock);
        this.f28515h.mo14174sl(lock);
        this.f28515h.mo14181E(m90237E(lockMode));
        if (lockMode == ES3.UNLOCKING_BLUR_CODE) {
            Observable<Unit> mo14180K8 = this.f28515h.mo14180K8();
            final C6370d c6370d = new C6370d(lock, this);
            Observable<R> flatMapSingle = mo14180K8.flatMapSingle(new InterfaceC23492o() { // from class: IS3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m90235G;
                    m90235G = PS3.m90235G(Function1.this, obj);
                    return m90235G;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onCreate(lo…    }\n        }\n    }\n  }");
            Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C6371e c6371e = new C6371e();
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: JS3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    PS3.m90234H(Function1.this, obj);
                }
            });
            Object m33094as2 = this.f28515h.mo14177hg().m33094as(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C6372f c6372f = new C6372f();
            ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: KS3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    PS3.m90233I(Function1.this, obj);
                }
            });
            Observable<Unit> mo14175s3 = this.f28515h.mo14175s3();
            final C6373g c6373g = new C6373g(lock, this);
            Observable<R> flatMapSingle2 = mo14175s3.flatMapSingle(new InterfaceC23492o() { // from class: LS3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m90232J;
                    m90232J = PS3.m90232J(Function1.this, obj);
                    return m90232J;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "override fun onCreate(lo…    }\n        }\n    }\n  }");
            Object m33094as3 = flatMapSingle2.m33094as(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C6374h c6374h = new C6374h();
            ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: MS3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    PS3.m90231K(Function1.this, obj);
                }
            });
            Object m33094as4 = this.f28515h.mo14176r0().m33094as(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C6375i c6375i = new C6375i();
            ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: NS3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    PS3.m90230L(Function1.this, obj);
                }
            });
            return;
        }
        Observable observeOn = Observable.merge(this.f28515h.mo14177hg(), this.f28515h.mo14175s3()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "merge(ui.positiveButtonC…dSchedulers.mainThread())");
        Object m33094as5 = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6376j c6376j = new C6376j(lockMode, this, num);
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: OS3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PS3.m90229M(Function1.this, obj);
            }
        });
    }

    @Override // p000.HS3
    /* renamed from: p */
    public void mo90227p() {
        this.f28510c.mo36922w3(360020674991L);
    }
}
