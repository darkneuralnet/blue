package p000;

import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.itemlease.ItemLease;
import co.bird.android.model.itemlease.LeaseReturnResponse;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WirePhysicalLockTutorialStep;
import co.bird.android.model.wire.WireSmartlock;
import co.bird.android.model.wire.configs.LeaseTypeConfig;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.C37791a94;
import p000.C43242jK1;
import p000.InterfaceC40099e13;
import p000.InterfaceC5225MD;
@Metadata(m28433d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00072\u00020\u0001:\u0001 Bi\b\u0007\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K¢\u0006\u0004\be\u0010fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J*\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\u0012\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\u0018\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u001d\u001a\u00020\u0002J\u0006\u0010\u001e\u001a\u00020\u0002R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010XR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010YR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010QR\u0014\u0010b\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010aR\u0014\u0010d\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010a¨\u0006g"}, m28432d2 = {"LiK1;", "", "", "A", "LsE5;", "smartLock", "K", "s", "", "throwable", "O", "", "resolution", "", "autoScanned", "", "autoScannedCodes", "Q", "Lco/bird/android/model/wire/WireBird;", "bird", "P", "B", "Le13$b;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "p", "o", "Lco/bird/android/model/itemlease/ItemLease;", "itemLease", "w", "y", "x", "LMc2;", C17296a.f69688o, "LMc2;", "itemLeaseManager", "LjK1;", "b", "LjK1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "Lgl;", "e", "Lgl;", "appPreference", "LRh6;", "f", "LRh6;", "userStream", "LOh;", "g", "LOh;", "appBuildConfig", "LTq4;", "h", "LTq4;", "reactiveConfig", "LEa;", "i", "LEa;", "analyticsManager", "LhF5;", "j", "LhF5;", "smartLockManager", "LXc1;", "k", "LXc1;", "endRideManager", "LMD;", "l", "LMD;", "rxBluetoothManager", "Ljava/util/concurrent/atomic/AtomicBoolean;", "m", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isAutoDetecting", "La94;", "Lco/bird/android/buava/Optional;", "n", "La94;", "capturedFileRelay", "Lco/bird/android/model/itemlease/ItemLease;", "Lco/bird/android/model/wire/WireBird;", "Lorg/joda/time/DateTime;", "q", "Lorg/joda/time/DateTime;", "initialTime", "r", "hasSubmitted", "v", "()Z", "isMandatory", "returningLease", "startingLease", "<init>", "(LMc2;LjK1;Lcom/uber/autodispose/ScopeProvider;Le13;Lgl;LRh6;LOh;LTq4;LEa;LhF5;LXc1;LMD;)V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHelmetLeaseSolebeScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseSolebeScannerPresenter.kt\nco/bird/android/feature/itemlease/solebe/HelmetLeaseSolebeScannerPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,467:1\n161#2:468\n199#2:469\n180#2:472\n180#2:475\n180#2:476\n180#2:477\n180#2:478\n288#3,2:470\n288#3,2:473\n*S KotlinDebug\n*F\n+ 1 HelmetLeaseSolebeScannerPresenter.kt\nco/bird/android/feature/itemlease/solebe/HelmetLeaseSolebeScannerPresenter\n*L\n184#1:468\n268#1:469\n285#1:472\n399#1:475\n417#1:476\n431#1:477\n439#1:478\n274#1:470,2\n383#1:473,2\n*E\n"})
/* renamed from: iK1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42649iK1 {

    /* renamed from: s */
    public static final C23193a f87119s = new C23193a(null);

    /* renamed from: a */
    public final InterfaceC34441Mc2 f87120a;

    /* renamed from: b */
    public final C43242jK1 f87121b;

    /* renamed from: c */
    public final ScopeProvider f87122c;

    /* renamed from: d */
    public final InterfaceC40099e13 f87123d;

    /* renamed from: e */
    public final C22454gl f87124e;

    /* renamed from: f */
    public final InterfaceC35660Rh6 f87125f;

    /* renamed from: g */
    public final InterfaceC6097Oh f87126g;

    /* renamed from: h */
    public final C36207Tq4 f87127h;

    /* renamed from: i */
    public final InterfaceC1880Ea f87128i;

    /* renamed from: j */
    public final InterfaceC42015hF5 f87129j;

    /* renamed from: k */
    public final InterfaceC37014Xc1 f87130k;

    /* renamed from: l */
    public final InterfaceC5225MD f87131l;

    /* renamed from: m */
    public final AtomicBoolean f87132m;

    /* renamed from: n */
    public final C37791a94<Optional<Object>> f87133n;

    /* renamed from: o */
    public ItemLease f87134o;

    /* renamed from: p */
    public WireBird f87135p;

    /* renamed from: q */
    public DateTime f87136q;

    /* renamed from: r */
    public AtomicBoolean f87137r;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, m28432d2 = {"LiK1$a;", "", "", "RESOLUTION_ABORTED", "Ljava/lang/String;", "RESOLUTION_DECLINED", "RESOLUTION_RETURNED", "RESOLUTION_STARTED", "SOLEBE_SCANLESS_CONTEXT", "<init>", "()V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: iK1$a */
    /* loaded from: classes3.dex */
    public static final class C23193a {
        public /* synthetic */ C23193a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C23193a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LMD$b;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LMD$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iK1$b */
    /* loaded from: classes3.dex */
    public static final class C23194b extends Lambda implements Function1<InterfaceC5225MD.EnumC5227b, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: iK1$b$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C23195a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InterfaceC5225MD.EnumC5227b.values().length];
                try {
                    iArr[InterfaceC5225MD.EnumC5227b.BLUETOOTH_NOT_AVAILABLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InterfaceC5225MD.EnumC5227b.LOCATION_PERMISSION_NOT_GRANTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InterfaceC5225MD.EnumC5227b.LOCATION_SERVICES_NOT_ENABLED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InterfaceC5225MD.EnumC5227b.BLUETOOTH_NOT_ENABLED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[InterfaceC5225MD.EnumC5227b.READY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[InterfaceC5225MD.EnumC5227b.UNKNOWN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C23194b() {
            super(1);
        }

        /* renamed from: a */
        public final void m34180a(InterfaceC5225MD.EnumC5227b enumC5227b) {
            int i;
            Integer valueOf;
            int i2;
            if (enumC5227b == null) {
                i = -1;
            } else {
                i = C23195a.$EnumSwitchMapping$0[enumC5227b.ordinal()];
            }
            switch (i) {
                case -1:
                case 6:
                    valueOf = Integer.valueOf(C45871nl4.an_unknown_bluetooth_error_occurred);
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    valueOf = Integer.valueOf(C45871nl4.your_device_does_not_support_bluetooth);
                    break;
                case 2:
                    if (Build.VERSION.SDK_INT < 31) {
                        i2 = C45871nl4.auth_bluetooth;
                    } else {
                        i2 = C45871nl4.auth_bluetooth_android_12_plus;
                    }
                    valueOf = Integer.valueOf(i2);
                    break;
                case 3:
                    valueOf = Integer.valueOf(C45871nl4.bluetooth_requires_location);
                    break;
                case 4:
                    valueOf = Integer.valueOf(C45871nl4.turn_on_bluetooth_to_continue);
                    break;
                case 5:
                    valueOf = null;
                    break;
            }
            C42649iK1.this.f87121b.m30779Xl(valueOf);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5225MD.EnumC5227b enumC5227b) {
            m34180a(enumC5227b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iK1$c */
    /* loaded from: classes3.dex */
    public static final class C23196c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C23196c f87139g = new C23196c();

        public C23196c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LvE5;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LvE5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iK1$d */
    /* loaded from: classes3.dex */
    public static final class C23197d extends Lambda implements Function1<C50306vE5, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: iK1$d$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C23198a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC50899wE5.values().length];
                try {
                    iArr[EnumC50899wE5.SCANNED_HELMET_PRESENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC50899wE5.SCANNED_HELMET_NOT_PRESENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC50899wE5.CONNECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC50899wE5.STARTING_LEASE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC50899wE5.LEASE_STARTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC50899wE5.LEASE_EXCEPTION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC50899wE5.EXCEPTION.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC50899wE5.ENDING_LEASE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC50899wE5.LEASE_ENDED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumC50899wE5.UNLOCKED.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[EnumC50899wE5.SCANNED.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[EnumC50899wE5.LOCKED.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[EnumC50899wE5.DISCONNECTED.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C23197d() {
            super(1);
        }

        /* renamed from: a */
        public final void m34179a(C50306vE5 c50306vE5) {
            EnumC50899wE5 m8985b = c50306vE5.m8985b();
            C41318g46.m40163a("received smart lock event: " + m8985b, new Object[0]);
            switch (C23198a.$EnumSwitchMapping$0[c50306vE5.m8985b().ordinal()]) {
                case 1:
                    C42649iK1.this.f87121b.m30774cm(C43242jK1.EnumC24808a.LEASE_ACTION, C42649iK1.this.m34189r());
                    C42649iK1.this.f87121b.m30776am(false);
                    if (!C42649iK1.this.m34189r()) {
                        C42649iK1 c42649iK1 = C42649iK1.this;
                        C48528sE5 m8983d = c50306vE5.m8983d();
                        Intrinsics.checkNotNull(m8983d);
                        c42649iK1.m34214K(m8983d);
                        return;
                    }
                    return;
                case 2:
                    C42649iK1.this.f87121b.m30774cm(C43242jK1.EnumC24808a.HELMET_STATE_INCORRECT, C42649iK1.this.m34189r());
                    return;
                case 3:
                    if (C42649iK1.this.m34189r()) {
                        C42649iK1.this.f87121b.m30774cm(C43242jK1.EnumC24808a.OPENING_LOCK, C42649iK1.this.m34189r());
                        return;
                    }
                    return;
                case 4:
                    if (C42649iK1.this.m34189r()) {
                        C42649iK1.this.f87121b.m30774cm(C43242jK1.EnumC24808a.LEASE_ACTION, C42649iK1.this.m34189r());
                        return;
                    }
                    return;
                case 5:
                    if (C42649iK1.this.m34189r()) {
                        C42649iK1.this.f87121b.m30774cm(C43242jK1.EnumC24808a.OPENING_LOCK, C42649iK1.this.m34189r());
                        return;
                    }
                    return;
                case 6:
                    C42649iK1 c42649iK12 = C42649iK1.this;
                    Throwable m8984c = c50306vE5.m8984c();
                    if (m8984c == null) {
                        m8984c = new Exception("Lease Exception encountered for " + c50306vE5);
                    }
                    c42649iK12.m34210O(m8984c);
                    C42649iK1.this.f87121b.m30774cm(C43242jK1.EnumC24808a.LEASE_ACTION_ERROR, C42649iK1.this.m34189r());
                    C42649iK1.this.m34192o();
                    C43242jK1.showTryAgainButton$default(C42649iK1.this.f87121b, false, 1, null);
                    return;
                case 7:
                    C42649iK1 c42649iK13 = C42649iK1.this;
                    Throwable m8984c2 = c50306vE5.m8984c();
                    if (m8984c2 == null) {
                        m8984c2 = new Exception("Generic Exception encountered for " + c50306vE5);
                    }
                    c42649iK13.m34210O(m8984c2);
                    C42649iK1.this.f87121b.m30774cm(C43242jK1.EnumC24808a.UNKNOWN_ERROR, C42649iK1.this.m34189r());
                    C42649iK1.this.m34192o();
                    C43242jK1.showTryAgainButton$default(C42649iK1.this.f87121b, false, 1, null);
                    return;
                case 8:
                    if (!C42649iK1.this.m34189r()) {
                        C42649iK1.this.f87121b.m30774cm(C43242jK1.EnumC24808a.LEASE_ACTION, C42649iK1.this.m34189r());
                        return;
                    }
                    return;
                case 9:
                    if (!C42649iK1.this.m34189r()) {
                        C42649iK1.this.f87121b.m30774cm(C43242jK1.EnumC24808a.LEASE_ENDED, C42649iK1.this.m34189r());
                        C43242jK1.showContinueButton$default(C42649iK1.this.f87121b, false, 1, null);
                        C42649iK1.this.m34192o();
                        return;
                    }
                    return;
                case 10:
                    C42649iK1.this.f87121b.m30774cm(C43242jK1.EnumC24808a.LOCK_OPENED, C42649iK1.this.m34189r());
                    C43242jK1.showContinueButton$default(C42649iK1.this.f87121b, false, 1, null);
                    C42649iK1.this.m34192o();
                    return;
                default:
                    return;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50306vE5 c50306vE5) {
            m34179a(c50306vE5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iK1$e */
    /* loaded from: classes3.dex */
    public static final class C23199e extends Lambda implements Function1<Unit, Unit> {
        public C23199e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC1880Ea interfaceC1880Ea = C42649iK1.this.f87128i;
            String name = C42649iK1.this.f87124e.m37575s0().getUserRole().name();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = name.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            interfaceC1880Ea.mo55905y(new GL1(null, null, null, "helmet_lease", lowerCase, "zendesk", false, false, "360030668292", false, 7, null));
            C42649iK1.this.f87123d.mo36922w3(360030668292L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iK1$f */
    /* loaded from: classes3.dex */
    public static final class C23200f extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C23200f f87142g = new C23200f();

        public C23200f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while handling help button click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iK1$g */
    /* loaded from: classes3.dex */
    public static final class C23201g extends Lambda implements Function1<Unit, Unit> {
        public C23201g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            WireBird wireBird = null;
            if (C42649iK1.this.m34189r()) {
                InterfaceC34441Mc2 interfaceC34441Mc2 = C42649iK1.this.f87120a;
                WireBird wireBird2 = C42649iK1.this.f87135p;
                if (wireBird2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                    wireBird2 = null;
                }
                interfaceC34441Mc2.mo55657q(wireBird2, ItemLeaseType.HELMET);
            } else {
                InterfaceC34441Mc2 interfaceC34441Mc22 = C42649iK1.this.f87120a;
                WireBird wireBird3 = C42649iK1.this.f87135p;
                if (wireBird3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                    wireBird3 = null;
                }
                interfaceC34441Mc22.mo55670j(wireBird3, ItemLeaseType.HELMET);
            }
            C42649iK1 c42649iK1 = C42649iK1.this;
            WireBird wireBird4 = c42649iK1.f87135p;
            if (wireBird4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird4;
            }
            c42649iK1.m34209P(wireBird, C42649iK1.this.m34189r() ? "started" : "returned");
            C41318g46.m40163a("Active lease for bird detected, closing app", new Object[0]);
            C42649iK1.this.f87123d.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iK1$h */
    /* loaded from: classes3.dex */
    public static final class C23202h extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C23202h f87144g = new C23202h();

        public C23202h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while handling continue button click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iK1$i */
    /* loaded from: classes3.dex */
    public static final class C23203i extends Lambda implements Function1<Unit, Unit> {
        public C23203i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C42649iK1.this.m34191p(InterfaceC40099e13.EnumC19925b.RESULT_OK);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iK1$j */
    /* loaded from: classes3.dex */
    public static final class C23204j extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C23204j f87146g = new C23204j();

        public C23204j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while handling continue without helmet button click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iK1$k */
    /* loaded from: classes3.dex */
    public static final class C23205k extends Lambda implements Function1<Unit, Unit> {
        public C23205k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            WireBird wireBird = null;
            if (C42649iK1.this.m34189r()) {
                InterfaceC34441Mc2 interfaceC34441Mc2 = C42649iK1.this.f87120a;
                WireBird wireBird2 = C42649iK1.this.f87135p;
                if (wireBird2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                } else {
                    wireBird = wireBird2;
                }
                interfaceC34441Mc2.mo55675f(wireBird, ItemLeaseType.HELMET);
            } else {
                InterfaceC34441Mc2 interfaceC34441Mc22 = C42649iK1.this.f87120a;
                WireBird wireBird3 = C42649iK1.this.f87135p;
                if (wireBird3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                } else {
                    wireBird = wireBird3;
                }
                interfaceC34441Mc22.mo55650y(wireBird, ItemLeaseType.HELMET);
            }
            C42649iK1.this.m34224A();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iK1$l */
    /* loaded from: classes3.dex */
    public static final class C23206l extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C23206l f87148g = new C23206l();

        public C23206l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error in try again button click: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iK1$m */
    /* loaded from: classes3.dex */
    public static final class C23207m extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C48528sE5 f87150h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23207m(C48528sE5 c48528sE5) {
            super(1);
            this.f87150h = c48528sE5;
        }

        /* renamed from: a */
        public final void m34178a(InterfaceC23465c interfaceC23465c) {
            C42649iK1.this.f87129j.mo19731a(this.f87150h, EnumC50899wE5.ENDING_LEASE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m34178a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseReturnResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/itemlease/LeaseReturnResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iK1$n */
    /* loaded from: classes3.dex */
    public static final class C23208n extends Lambda implements Function1<LeaseReturnResponse, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C48528sE5 f87152h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23208n(C48528sE5 c48528sE5) {
            super(1);
            this.f87152h = c48528sE5;
        }

        /* renamed from: a */
        public final void m34177a(LeaseReturnResponse leaseReturnResponse) {
            C42649iK1.this.f87129j.mo19731a(this.f87152h, EnumC50899wE5.LEASE_ENDED);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LeaseReturnResponse leaseReturnResponse) {
            m34177a(leaseReturnResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iK1$o */
    /* loaded from: classes3.dex */
    public static final class C23209o extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C48528sE5 f87154h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23209o(C48528sE5 c48528sE5) {
            super(1);
            this.f87154h = c48528sE5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            InterfaceC42015hF5 interfaceC42015hF5 = C42649iK1.this.f87129j;
            C48528sE5 c48528sE5 = this.f87154h;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC42015hF5.mo19730b(c48528sE5, it);
        }
    }

    public C42649iK1(InterfaceC34441Mc2 itemLeaseManager, C43242jK1 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C22454gl appPreference, InterfaceC35660Rh6 userStream, InterfaceC6097Oh appBuildConfig, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC42015hF5 smartLockManager, InterfaceC37014Xc1 endRideManager, InterfaceC5225MD rxBluetoothManager) {
        Intrinsics.checkNotNullParameter(itemLeaseManager, "itemLeaseManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(smartLockManager, "smartLockManager");
        Intrinsics.checkNotNullParameter(endRideManager, "endRideManager");
        Intrinsics.checkNotNullParameter(rxBluetoothManager, "rxBluetoothManager");
        this.f87120a = itemLeaseManager;
        this.f87121b = ui;
        this.f87122c = scopeProvider;
        this.f87123d = navigator;
        this.f87124e = appPreference;
        this.f87125f = userStream;
        this.f87126g = appBuildConfig;
        this.f87127h = reactiveConfig;
        this.f87128i = analyticsManager;
        this.f87129j = smartLockManager;
        this.f87130k = endRideManager;
        this.f87131l = rxBluetoothManager;
        this.f87132m = new AtomicBoolean(false);
        this.f87133n = C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        this.f87136q = now;
        this.f87137r = new AtomicBoolean(false);
    }

    /* renamed from: C */
    public static final void m34222C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m34221D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m34220E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m34219F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m34218G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m34217H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m34216I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m34215J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m34213L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m34212M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m34211N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: R */
    public static /* synthetic */ void m34207R(C42649iK1 c42649iK1, String str, boolean z, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        c42649iK1.m34208Q(str, z, list);
    }

    /* renamed from: t */
    public static final void m34187t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m34186u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m34181z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final void m34224A() {
        this.f87121b.m30774cm(C43242jK1.EnumC24808a.VERIFYING_CONNECTION, true);
        this.f87121b.m30778Yl(false);
        this.f87121b.m30777Zl(false);
    }

    /* renamed from: B */
    public final void m34223B() {
        Object m33094as = this.f87121b.m30773r0().m33094as(AutoDispose.m45239a(this.f87122c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23199e c23199e = new C23199e();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: cK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42649iK1.m34222C(Function1.this, obj);
            }
        };
        final C23200f c23200f = C23200f.f87142g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: dK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42649iK1.m34221D(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f87121b.m30772z5().m33094as(AutoDispose.m45239a(this.f87122c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23201g c23201g = new C23201g();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: eK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42649iK1.m34220E(Function1.this, obj);
            }
        };
        final C23202h c23202h = C23202h.f87144g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: fK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42649iK1.m34219F(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f87121b.m30786Ql().m33094as(AutoDispose.m45239a(this.f87122c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23203i c23203i = new C23203i();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: gK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42649iK1.m34218G(Function1.this, obj);
            }
        };
        final C23204j c23204j = C23204j.f87146g;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: hK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42649iK1.m34217H(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn = this.f87121b.m30775bm().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.tryAgainButtonClicks(…dSchedulers.mainThread())");
        Object m33094as4 = observeOn.m33094as(AutoDispose.m45239a(this.f87122c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23205k c23205k = new C23205k();
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: VJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42649iK1.m34216I(Function1.this, obj);
            }
        };
        final C23206l c23206l = C23206l.f87148g;
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: WJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42649iK1.m34215J(Function1.this, obj);
            }
        });
    }

    /* renamed from: K */
    public final void m34214K(C48528sE5 c48528sE5) {
        String str;
        InterfaceC34441Mc2 interfaceC34441Mc2 = this.f87120a;
        ItemLease itemLease = this.f87134o;
        if (itemLease != null) {
            str = itemLease.getId();
        } else {
            str = null;
        }
        Intrinsics.checkNotNull(str);
        AbstractC23442F<LeaseReturnResponse> mo55654u = interfaceC34441Mc2.mo55654u(str);
        final C23207m c23207m = new C23207m(c48528sE5);
        AbstractC23442F<LeaseReturnResponse> m33102v = mo55654u.m33102v(new InterfaceC23484g() { // from class: ZJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42649iK1.m34213L(Function1.this, obj);
            }
        });
        final C23208n c23208n = new C23208n(c48528sE5);
        AbstractC23442F<LeaseReturnResponse> m33101w = m33102v.m33101w(new InterfaceC23484g() { // from class: aK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42649iK1.m34212M(Function1.this, obj);
            }
        });
        final C23209o c23209o = new C23209o(c48528sE5);
        AbstractC23442F<LeaseReturnResponse> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: bK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42649iK1.m34211N(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "private fun startEndingL…r)\n      .subscribe()\n  }");
        Object m33135e = m33106t.m33135e(AutoDispose.m45239a(this.f87122c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((SingleSubscribeProxy) m33135e).subscribe();
    }

    /* renamed from: O */
    public final void m34210O(Throwable th) {
        C36207Tq4 c36207Tq4 = this.f87127h;
        WireBird wireBird = this.f87135p;
        String str = null;
        WireBird wireBird2 = null;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        LeaseTypeConfig helmet = C36441Uq4.m80769c(c36207Tq4, wireBird).getLeaseConfig().getLeaseTypes().getHelmet();
        if (m34189r()) {
            InterfaceC1880Ea interfaceC1880Ea = this.f87128i;
            WireBird wireBird3 = this.f87135p;
            if (wireBird3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird3 = null;
            }
            String id = wireBird3.getId();
            boolean m34185v = m34185v();
            C36207Tq4 c36207Tq42 = this.f87127h;
            WireBird wireBird4 = this.f87135p;
            if (wireBird4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird2 = wireBird4;
            }
            String currency = C36441Uq4.m80769c(c36207Tq42, wireBird2).getRideConfig().getCurrency();
            String simpleName = th.getClass().getSimpleName();
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            Intrinsics.checkNotNullExpressionValue(simpleName, "simpleName");
            interfaceC1880Ea.mo55905y(new FI1(null, null, null, simpleName, message, id, m34185v, currency, (int) helmet.getInitialChargeAmount(), (int) helmet.getReturnRefundAmount(), (int) helmet.getDelinquentFeeAmount(), 7, null));
            return;
        }
        InterfaceC1880Ea interfaceC1880Ea2 = this.f87128i;
        ItemLease itemLease = this.f87134o;
        if (itemLease != null) {
            str = itemLease.getId();
        }
        String str2 = str;
        boolean m34185v2 = m34185v();
        String currency2 = this.f87127h.m82623f8().m73665a().getRideConfig().getCurrency();
        String simpleName2 = th.getClass().getSimpleName();
        String message2 = th.getMessage();
        if (message2 == null) {
            message2 = th.toString();
        }
        int returnRefundAmount = (int) helmet.getReturnRefundAmount();
        int delinquentFeeAmount = (int) helmet.getDelinquentFeeAmount();
        String mo55540n = this.f87130k.mo55540n();
        Intrinsics.checkNotNullExpressionValue(simpleName2, "simpleName");
        interfaceC1880Ea2.mo55905y(new C41454gJ1(null, null, null, simpleName2, message2, str2, "solebe_no_scan_required", m34185v2, currency2, (int) helmet.getInitialChargeAmount(), returnRefundAmount, delinquentFeeAmount, mo55540n, 7, null));
    }

    /* renamed from: P */
    public final void m34209P(WireBird wireBird, String str) {
        String str2;
        Object obj;
        LeaseTypeConfig helmet = C36441Uq4.m80769c(this.f87127h, wireBird).getLeaseConfig().getLeaseTypes().getHelmet();
        InterfaceC1880Ea interfaceC1880Ea = this.f87128i;
        Iterator<T> it = this.f87120a.mo55656s().m73665a().iterator();
        while (true) {
            str2 = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((ItemLease) obj).isLeaseForBird(wireBird, ItemLeaseType.HELMET)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ItemLease itemLease = (ItemLease) obj;
        if (itemLease != null) {
            str2 = itemLease.getId();
        }
        interfaceC1880Ea.mo55905y(new GI1(null, null, null, str, wireBird.getId(), str2, m34185v(), C36441Uq4.m80769c(this.f87127h, wireBird).getRideConfig().getCurrency(), (int) helmet.getInitialChargeAmount(), (int) helmet.getReturnRefundAmount(), (int) helmet.getDelinquentFeeAmount(), 7, null));
    }

    /* renamed from: Q */
    public final void m34208Q(String str, boolean z, List<String> list) {
        String str2;
        LeaseTypeConfig helmet = this.f87127h.m82623f8().m73665a().getLeaseConfig().getLeaseTypes().getHelmet();
        InterfaceC1880Ea interfaceC1880Ea = this.f87128i;
        ItemLease itemLease = this.f87134o;
        if (itemLease != null) {
            str2 = itemLease.getId();
        } else {
            str2 = null;
        }
        String mo55540n = this.f87130k.mo55540n();
        interfaceC1880Ea.mo55905y(new C42047hJ1(null, null, null, str, str2, Boolean.valueOf(z), list, "solebe_no_scan_required", m34185v(), this.f87127h.m82623f8().m73665a().getRideConfig().getCurrency(), (int) helmet.getInitialChargeAmount(), (int) helmet.getReturnRefundAmount(), (int) helmet.getDelinquentFeeAmount(), mo55540n, 7, null));
    }

    /* renamed from: o */
    public final void m34192o() {
        boolean m34189r = m34189r();
        C41318g46.m40163a("clearReadyState called with startingLease=" + m34189r, new Object[0]);
        WireBird wireBird = null;
        if (m34189r()) {
            InterfaceC34441Mc2 interfaceC34441Mc2 = this.f87120a;
            WireBird wireBird2 = this.f87135p;
            if (wireBird2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird2;
            }
            interfaceC34441Mc2.mo55657q(wireBird, ItemLeaseType.HELMET);
            return;
        }
        InterfaceC34441Mc2 interfaceC34441Mc22 = this.f87120a;
        WireBird wireBird3 = this.f87135p;
        if (wireBird3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
        } else {
            wireBird = wireBird3;
        }
        interfaceC34441Mc22.mo55670j(wireBird, ItemLeaseType.HELMET);
    }

    /* renamed from: p */
    public final void m34191p(InterfaceC40099e13.EnumC19925b enumC19925b) {
        WireBird wireBird = this.f87135p;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        m34209P(wireBird, "declined");
        m34192o();
        this.f87123d.mo37077W0(enumC19925b, new Pair[0]);
    }

    /* renamed from: q */
    public final boolean m34190q() {
        return this.f87134o != null;
    }

    /* renamed from: r */
    public final boolean m34189r() {
        return !m34190q();
    }

    /* renamed from: s */
    public final void m34188s() {
        WirePhysicalLock wirePhysicalLock;
        List<WirePhysicalLockTutorialStep> tutorialSteps;
        Object firstOrNull;
        Object obj;
        boolean z;
        WireBird wireBird = this.f87135p;
        String str = null;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        List<WirePhysicalLock> physicalLocks = wireBird.getPhysicalLocks();
        boolean z2 = true;
        if (physicalLocks != null) {
            Iterator<T> it = physicalLocks.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((WirePhysicalLock) obj).getPurpose() == PhysicalLockPurpose.HELMET) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            wirePhysicalLock = (WirePhysicalLock) obj;
        } else {
            wirePhysicalLock = null;
        }
        if (wirePhysicalLock != null && (tutorialSteps = wirePhysicalLock.getTutorialSteps()) != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) tutorialSteps);
            WirePhysicalLockTutorialStep wirePhysicalLockTutorialStep = (WirePhysicalLockTutorialStep) firstOrNull;
            if (wirePhysicalLockTutorialStep != null) {
                str = wirePhysicalLockTutorialStep.getImageUrl();
            }
        }
        if (str != null) {
            this.f87121b.m30781Vl(str);
        } else {
            if (wirePhysicalLock == null || !wirePhysicalLock.isBrainLock()) {
                z2 = false;
            }
            if (z2) {
                this.f87121b.m30780Wl(C48193rg4.ic_hero_helmet_in_basket2);
            }
        }
        Observable<InterfaceC5225MD.EnumC5227b> observeOn = this.f87131l.mo73604c().startWith((Observable<InterfaceC5225MD.EnumC5227b>) this.f87131l.mo73605b()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "rxBluetoothManager.bluet…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f87122c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23194b c23194b = new C23194b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: XJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                C42649iK1.m34187t(Function1.this, obj2);
            }
        };
        final C23196c c23196c = C23196c.f87139g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: YJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                C42649iK1.m34186u(Function1.this, obj2);
            }
        });
    }

    /* renamed from: v */
    public final boolean m34185v() {
        return this.f87127h.m82623f8().m73665a().getComplianceConfig().getHelmetRequiredForRide();
    }

    /* renamed from: w */
    public final void m34184w(ItemLease itemLease, WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f87134o = itemLease;
        this.f87135p = bird;
    }

    /* renamed from: x */
    public final void m34183x() {
        WireBird wireBird = null;
        if (m34190q()) {
            InterfaceC34441Mc2 interfaceC34441Mc2 = this.f87120a;
            WireBird wireBird2 = this.f87135p;
            if (wireBird2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird2;
            }
            interfaceC34441Mc2.mo55670j(wireBird, ItemLeaseType.HELMET);
        } else {
            InterfaceC34441Mc2 interfaceC34441Mc22 = this.f87120a;
            WireBird wireBird3 = this.f87135p;
            if (wireBird3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird3;
            }
            interfaceC34441Mc22.mo55657q(wireBird, ItemLeaseType.HELMET);
        }
        if (!this.f87137r.get()) {
            m34207R(this, "aborted", false, null, 6, null);
        }
    }

    /* renamed from: y */
    public final void m34182y() {
        String str;
        WirePhysicalLock wirePhysicalLock;
        String str2;
        Object firstOrNull;
        String str3;
        C36207Tq4 c36207Tq4 = this.f87127h;
        WireBird wireBird = this.f87135p;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        LeaseTypeConfig helmet = C36441Uq4.m80769c(c36207Tq4, wireBird).getLeaseConfig().getLeaseTypes().getHelmet();
        if (m34190q()) {
            InterfaceC1880Ea interfaceC1880Ea = this.f87128i;
            ItemLease itemLease = this.f87134o;
            if (itemLease != null) {
                str3 = itemLease.getId();
            } else {
                str3 = null;
            }
            interfaceC1880Ea.mo55905y(new C42640iJ1(null, null, null, str3, "solebe_no_scan_required", m34185v(), this.f87127h.m82623f8().m73665a().getRideConfig().getCurrency(), (int) helmet.getInitialChargeAmount(), (int) helmet.getReturnRefundAmount(), (int) helmet.getDelinquentFeeAmount(), this.f87130k.mo55540n(), 7, null));
            str = "bird";
        } else {
            InterfaceC1880Ea interfaceC1880Ea2 = this.f87128i;
            WireBird wireBird2 = this.f87135p;
            if (wireBird2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird2 = null;
            }
            String id = wireBird2.getId();
            boolean m34185v = m34185v();
            C36207Tq4 c36207Tq42 = this.f87127h;
            WireBird wireBird3 = this.f87135p;
            if (wireBird3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird3 = null;
            }
            str = "bird";
            interfaceC1880Ea2.mo55905y(new HI1(null, null, null, id, m34185v, C36441Uq4.m80769c(c36207Tq42, wireBird3).getRideConfig().getCurrency(), (int) helmet.getInitialChargeAmount(), (int) helmet.getReturnRefundAmount(), (int) helmet.getDelinquentFeeAmount(), 7, null));
        }
        if (m34190q()) {
            InterfaceC34441Mc2 interfaceC34441Mc2 = this.f87120a;
            WireBird wireBird4 = this.f87135p;
            if (wireBird4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                wireBird4 = null;
            }
            interfaceC34441Mc2.mo55650y(wireBird4, ItemLeaseType.HELMET);
        }
        WireBird wireBird5 = this.f87135p;
        if (wireBird5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            wireBird5 = null;
        }
        List<WirePhysicalLock> physicalLocks = wireBird5.getPhysicalLocks();
        if (physicalLocks != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
            wirePhysicalLock = (WirePhysicalLock) firstOrNull;
        } else {
            wirePhysicalLock = null;
        }
        C36207Tq4 c36207Tq43 = this.f87127h;
        WireBird wireBird6 = this.f87135p;
        if (wireBird6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            wireBird6 = null;
        }
        Boolean enableSolebeLocks = C36441Uq4.m80769c(c36207Tq43, wireBird6).getRideConfig().getSmartlockConfig().getEnableSolebeLocks();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(enableSolebeLocks, bool)) {
            C36207Tq4 c36207Tq44 = this.f87127h;
            WireBird wireBird7 = this.f87135p;
            if (wireBird7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                wireBird7 = null;
            }
            if (Intrinsics.areEqual(C36441Uq4.m80769c(c36207Tq44, wireBird7).getRideConfig().getSmartlockConfig().getEnableV2(), bool) && wirePhysicalLock != null) {
                if (m34189r()) {
                    InterfaceC34441Mc2 interfaceC34441Mc22 = this.f87120a;
                    WireBird wireBird8 = this.f87135p;
                    if (wireBird8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                        wireBird8 = null;
                    }
                    interfaceC34441Mc22.mo55675f(wireBird8, ItemLeaseType.HELMET);
                } else {
                    InterfaceC34441Mc2 interfaceC34441Mc23 = this.f87120a;
                    WireBird wireBird9 = this.f87135p;
                    if (wireBird9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                        wireBird9 = null;
                    }
                    interfaceC34441Mc23.mo55650y(wireBird9, ItemLeaseType.HELMET);
                }
                m34224A();
                InterfaceC42015hF5 interfaceC42015hF5 = this.f87129j;
                WireSmartlock smartlock = wirePhysicalLock.getSmartlock();
                if (smartlock != null) {
                    str2 = smartlock.getMacAddress();
                } else {
                    str2 = null;
                }
                Intrinsics.checkNotNull(str2);
                AbstractC24490k<C50306vE5> m32111s0 = interfaceC42015hF5.mo19728d(str2).m32111s0(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(m32111s0, "smartLockManager.observe…dSchedulers.mainThread())");
                Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(this.f87122c));
                Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C23197d c23197d = new C23197d();
                ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: UJ1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C42649iK1.m34181z(Function1.this, obj);
                    }
                });
                m34188s();
                m34223B();
            }
        }
        if (m34189r()) {
            C43242jK1.showContinueWithoutHelmetButton$default(this.f87121b, false, 1, null);
        } else {
            C43242jK1.showContinueButton$default(this.f87121b, false, 1, null);
        }
        m34188s();
        m34223B();
    }
}
