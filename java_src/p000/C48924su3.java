package p000;

import android.content.Intent;
import android.location.Location;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.AlarmType;
import co.bird.android.model.BirdLocation;
import co.bird.android.model.BirdLocations;
import co.bird.android.model.NearbyBirdViewModel;
import co.bird.android.model.OperatorSupplementMapPurpose;
import co.bird.android.model.Point;
import co.bird.android.model.Route;
import co.bird.android.model.Vehicle;
import co.bird.android.model.constant.AlarmCommand;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BirdLocationSource;
import co.bird.android.model.exception.BluetoothException;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WirePart;
import co.bird.api.request.BLEScanTrigger;
import co.bird.api.response.BirdCodeWithStatus;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.flowables.AbstractC23477a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC39873de5;
import p000.C37791a94;
import p000.C48924su3;
import p000.H31;
import p000.InterfaceC10636aM;
import p000.InterfaceC27246pJ;
import p000.InterfaceC51888xu3;
@Metadata(m28433d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u008e\u00012\u00020\u0001:\u0001*Bs\b\u0007\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020-\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010[\u001a\u00020X¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0017\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016J\"\u0010'\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R \u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0\u00140b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020g0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010eR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR8\u0010r\u001a&\u0012\f\u0012\n o*\u0004\u0018\u00010\u001b0\u001b o*\u0012\u0012\f\u0012\n o*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010n0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uRX\u0010}\u001aF\u0012\u0004\u0012\u00020\u0011\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020y\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000b0x0wj\"\u0012\u0004\u0012\u00020\u0011\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020y\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000b0x`z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R'\u0010\u0082\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00110~j\b\u0012\u0004\u0012\u00020\u0011`\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R4\u0010\u0085\u0001\u001a \u0012\u0004\u0012\u00020\u0011\u0012\u0005\u0012\u00030\u0083\u00010wj\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0005\u0012\u00030\u0083\u0001`z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010|R\u001a\u0010\u0087\u0001\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010lR0\u0010\u008b\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u0089\u00010\u0088\u00010b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010e¨\u0006\u008f\u0001"}, m28432d2 = {"Lsu3;", "LGt3;", "", "n0", "m0", "j0", "W", "a0", "k0", "LfM2;", "marker", "", "originalLocation", "l0", "show", "I0", "J0", "", "tool", "K0", "", "Lco/bird/android/model/wire/WireLocation;", "locations", "S", "Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/Observable;", "Lco/bird/android/model/Vehicle;", "T", "", "updateFrequencyMillis", "M", "Landroid/content/Intent;", "intent", "b", "", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "e0", "Llp2;", C17296a.f69688o, "Llp2;", "bluetoothManagerV2", "LpJ;", "LpJ;", "bluetoothManager", "LaM;", "c", "LaM;", "birdManager", "Lom3;", DateTokenConverter.CONVERTER_KEY, "Lom3;", "operatorManager", "Ldr4;", "e", "Ldr4;", "locationManager", "LDQ3;", "f", "LDQ3;", "permissionManager", "LEa;", "g", "LEa;", "analyticsManager", "Lgl;", "h", "Lgl;", "preference", "Lde5;", "i", "Lde5;", "rxBleClient", "Lxk6;", "j", "Lxk6;", "vehicleBirdHydrationManager", "Le13;", "k", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "l", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lxu3;", "m", "Lxu3;", "ui", "n", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/OperatorSupplementMapPurpose;", "o", "Lco/bird/android/model/OperatorSupplementMapPurpose;", "purpose", "La94;", "Lco/bird/android/model/BirdLocation;", "p", "La94;", "possibleLocations", "Landroid/location/Location;", "q", "userLocation", "Lio/reactivex/disposables/c;", "r", "Lio/reactivex/disposables/c;", "sweepDisposable", "Lio/reactivex/flowables/a;", "kotlin.jvm.PlatformType", "s", "Lio/reactivex/flowables/a;", "hotSweepFlowable", "Lio/reactivex/E;", "t", "Lio/reactivex/E;", "bufferScheduler", "Ljava/util/HashMap;", "Lkotlin/Triple;", "Lco/bird/api/response/BirdCodeWithStatus;", "Lkotlin/collections/HashMap;", "u", "Ljava/util/HashMap;", "serialNumberScanResultMap", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "v", "Ljava/util/HashSet;", "serialNumberBlacklist", "Lco/bird/android/model/wire/WirePart;", "w", "birdSerialPartMap", "x", "disposable", "Lco/bird/android/buava/Optional;", "Lkotlin/Pair;", "y", "latestSelectedMarker", "<init>", "(Llp2;LpJ;LaM;Lom3;Ldr4;LDQ3;LEa;Lgl;Lde5;Lxk6;Le13;Lcom/uber/autodispose/ScopeProvider;Lxu3;)V", "z", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorSupplementMapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSupplementMapPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorSupplementMapPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,421:1\n199#2:422\n180#2:423\n180#2:424\n180#2:425\n180#2:426\n180#2:427\n180#2:428\n237#2:429\n180#2:431\n218#2:432\n218#2:433\n161#2:438\n1#3:430\n1549#4:434\n1620#4,3:435\n*S KotlinDebug\n*F\n+ 1 OperatorSupplementMapPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorSupplementMapPresenterImpl\n*L\n124#1:422\n152#1:423\n166#1:424\n182#1:425\n193#1:426\n214#1:427\n235#1:428\n243#1:429\n286#1:431\n312#1:432\n334#1:433\n407#1:438\n376#1:434\n376#1:435,3\n*E\n"})
/* renamed from: su3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48924su3 implements InterfaceC33191Gt3 {

    /* renamed from: a */
    public final InterfaceC44723lp2 f109474a;

    /* renamed from: b */
    public final InterfaceC27246pJ f109475b;

    /* renamed from: c */
    public final InterfaceC10636aM f109476c;

    /* renamed from: d */
    public final InterfaceC46473om3 f109477d;

    /* renamed from: e */
    public final InterfaceC40001dr4 f109478e;

    /* renamed from: f */
    public final DQ3 f109479f;

    /* renamed from: g */
    public final InterfaceC1880Ea f109480g;

    /* renamed from: h */
    public final C22454gl f109481h;

    /* renamed from: i */
    public final AbstractC39873de5 f109482i;

    /* renamed from: j */
    public final InterfaceC51791xk6 f109483j;

    /* renamed from: k */
    public final InterfaceC40099e13 f109484k;

    /* renamed from: l */
    public final ScopeProvider f109485l;

    /* renamed from: m */
    public final InterfaceC51888xu3 f109486m;

    /* renamed from: n */
    public WireBird f109487n;

    /* renamed from: o */
    public OperatorSupplementMapPurpose f109488o;

    /* renamed from: p */
    public final C37791a94<List<BirdLocation>> f109489p;

    /* renamed from: q */
    public final C37791a94<Location> f109490q;

    /* renamed from: r */
    public InterfaceC23465c f109491r;

    /* renamed from: s */
    public final AbstractC23477a<Vehicle> f109492s;

    /* renamed from: t */
    public final AbstractC23437E f109493t;

    /* renamed from: u */
    public final HashMap<String, Triple<BirdCodeWithStatus, String, Boolean>> f109494u;

    /* renamed from: v */
    public final HashSet<String> f109495v;

    /* renamed from: w */
    public final HashMap<String, WirePart> f109496w;

    /* renamed from: x */
    public InterfaceC23465c f109497x;

    /* renamed from: y */
    public final C37791a94<Optional<Pair<C40889fM2, Boolean>>> f109498y;

    /* renamed from: z */
    public static final C28444a f109473z = new C28444a(null);

    /* renamed from: A */
    public static final int f109472A = 8;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$A */
    /* loaded from: classes2.dex */
    public static final class C28430A extends Lambda implements Function1<Location, Unit> {
        public C28430A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location it) {
            InterfaceC51888xu3 interfaceC51888xu3 = C48924su3.this.f109486m;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC51888xu3.mo4482q3(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$B */
    /* loaded from: classes2.dex */
    public static final class C28431B extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C28431B f109500g = new C28431B();

        public C28431B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$C */
    /* loaded from: classes2.dex */
    public static final class C28432C extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: su3$C$a */
        /* loaded from: classes2.dex */
        public static final class C28433a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C48924su3 f109502g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28433a(C48924su3 c48924su3) {
                super(1);
                this.f109502g = c48924su3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40159e(th);
                if (th instanceof BluetoothException) {
                    H31.C3014a.showDialog$default(this.f109502g.f109486m, C24920jX.alertDialog$default((BluetoothException) th, null, 1, null), false, false, null, null, null, null, 126, null);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: su3$C$b */
        /* loaded from: classes2.dex */
        public static final class C28434b extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ C48924su3 f109503g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28434b(C48924su3 c48924su3) {
                super(1);
                this.f109503g = c48924su3;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23434B<? extends Boolean> invoke(Vehicle it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f109503g.f109474a.mo11727a(it);
            }
        }

        public C28432C() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23434B m13434c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Boolean> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C48924su3 c48924su3 = C48924su3.this;
            WireBird wireBird = c48924su3.f109487n;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            Observable observeOn = c48924su3.m13495T(wireBird).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn, "chirpAlarm(bird)\n       …dSchedulers.mainThread())");
            Observable progress$default = C28237sD.progress$default(observeOn, C48924su3.this.f109486m, 0, 2, (Object) null);
            final C28433a c28433a = new C28433a(C48924su3.this);
            Observable onErrorResumeNext = progress$default.doOnError(new InterfaceC23484g() { // from class: uu3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48924su3.C28432C.invoke$lambda$0(Function1.this, obj);
                }
            }).onErrorResumeNext(Observable.empty());
            final C28434b c28434b = new C28434b(C48924su3.this);
            return onErrorResumeNext.flatMap(new InterfaceC23492o() { // from class: vu3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m13434c;
                    m13434c = C48924su3.C28432C.m13434c(Function1.this, obj);
                    return m13434c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$D */
    /* loaded from: classes2.dex */
    public static final class C28435D extends Lambda implements Function1<Unit, Unit> {
        public C28435D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C48924su3.this.m13469j0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/location/Location;", "it", "", C17296a.f69688o, "(Landroid/location/Location;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$E */
    /* loaded from: classes2.dex */
    public static final class C28436E extends Lambda implements Function1<Location, Boolean> {

        /* renamed from: g */
        public static final C28436E f109505g = new C28436E();

        public C28436E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Location it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getLatitude() == 0.0d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007 \u0006*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/BirdLocation;", "kotlin.jvm.PlatformType", "Landroid/location/Location;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorSupplementMapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSupplementMapPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorSupplementMapPresenterImpl$setupOtherPossibleLocation$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,421:1\n1549#2:422\n1620#2,3:423\n*S KotlinDebug\n*F\n+ 1 OperatorSupplementMapPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorSupplementMapPresenterImpl$setupOtherPossibleLocation$3\n*L\n168#1:422\n168#1:423,3\n*E\n"})
    /* renamed from: su3$F */
    /* loaded from: classes2.dex */
    public static final class C28437F extends Lambda implements Function1<Pair<? extends List<? extends BirdLocation>, ? extends Location>, Unit> {
        public C28437F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends BirdLocation>, ? extends Location> pair) {
            invoke2((Pair<? extends List<BirdLocation>, ? extends Location>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<BirdLocation>, ? extends Location> pair) {
            int collectionSizeOrDefault;
            List plus;
            List<BirdLocation> locations = pair.component1();
            Intrinsics.checkNotNullExpressionValue(locations, "locations");
            List<BirdLocation> list = locations;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (BirdLocation birdLocation : list) {
                arrayList.add(birdLocation.getLocation());
            }
            C48924su3.this.f109486m.mo4492Sk(locations);
            C48924su3 c48924su3 = C48924su3.this;
            WireBird wireBird = c48924su3.f109487n;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends WireLocation>) ((Collection<? extends Object>) arrayList), wireBird.getLocation());
            c48924su3.m13496S(plus);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LfM2;", "clickedMarker", "", "invoke", "(LfM2;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$G */
    /* loaded from: classes2.dex */
    public static final class C28438G extends Lambda implements Function1<C40889fM2, Boolean> {

        /* renamed from: g */
        public static final C28438G f109507g = new C28438G();

        public C28438G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C40889fM2 clickedMarker) {
            Intrinsics.checkNotNullParameter(clickedMarker, "clickedMarker");
            return Boolean.valueOf(clickedMarker.m41531c() instanceof BirdLocation);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LfM2;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LfM2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$H */
    /* loaded from: classes2.dex */
    public static final class C28439H extends Lambda implements Function1<C40889fM2, Unit> {
        public C28439H() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C40889fM2 c40889fM2) {
            invoke2(c40889fM2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C40889fM2 it) {
            C48924su3 c48924su3 = C48924su3.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c48924su3.m13465l0(it, false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LfM2;", "kotlin.jvm.PlatformType", "clickedMarker", "", "invoke", "(LfM2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$I */
    /* loaded from: classes2.dex */
    public static final class C28440I extends Lambda implements Function1<C40889fM2, Unit> {
        public C28440I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C40889fM2 c40889fM2) {
            invoke2(c40889fM2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C40889fM2 c40889fM2) {
            InterfaceC51888xu3 interfaceC51888xu3 = C48924su3.this.f109486m;
            Object m41531c = c40889fM2.m41531c();
            Intrinsics.checkNotNull(m41531c, "null cannot be cast to non-null type co.bird.android.model.BirdLocation");
            interfaceC51888xu3.mo4494Jf((BirdLocation) m41531c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LfM2;", "clickedMarker", "Lco/bird/android/model/BirdLocation;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LfM2;)Lco/bird/android/model/BirdLocation;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$J */
    /* loaded from: classes2.dex */
    public static final class C28441J extends Lambda implements Function1<C40889fM2, BirdLocation> {

        /* renamed from: g */
        public static final C28441J f109510g = new C28441J();

        public C28441J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BirdLocation invoke(C40889fM2 clickedMarker) {
            Intrinsics.checkNotNullParameter(clickedMarker, "clickedMarker");
            Object m41531c = clickedMarker.m41531c();
            Intrinsics.checkNotNull(m41531c, "null cannot be cast to non-null type co.bird.android.model.BirdLocation");
            return (BirdLocation) m41531c;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdLocation;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BirdLocation;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$K */
    /* loaded from: classes2.dex */
    public static final class C28442K extends Lambda implements Function1<BirdLocation, Unit> {
        public C28442K() {
            super(1);
        }

        /* renamed from: a */
        public final void m13430a(BirdLocation birdLocation) {
            InterfaceC1880Ea interfaceC1880Ea = C48924su3.this.f109480g;
            WireBird wireBird = C48924su3.this.f109487n;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            interfaceC1880Ea.mo55905y(new C33200Gu3(null, null, null, wireBird.getId(), birdLocation.getSource().toString(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdLocation birdLocation) {
            m13430a(birdLocation);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BirdLocation;", "locationMarker", "Lio/reactivex/B;", "Lco/bird/android/model/Route;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/BirdLocation;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$L */
    /* loaded from: classes2.dex */
    public static final class C28443L extends Lambda implements Function1<BirdLocation, InterfaceC23434B<? extends Route>> {
        public C28443L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Route> invoke(BirdLocation locationMarker) {
            Intrinsics.checkNotNullParameter(locationMarker, "locationMarker");
            return C48924su3.this.f109476c.mo71600I0((Location) C48924su3.this.f109490q.getValue(), locationMarker.getLocation().fromLocation());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lsu3$a;", "", "", "SHOW_ORIGINAL_LOCATION_INFO_WINDOW_DURATION_IN_MILLISECOND", "J", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: su3$a */
    /* loaded from: classes2.dex */
    public static final class C28444a {
        public /* synthetic */ C28444a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28444a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28445b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OperatorSupplementMapPurpose.values().length];
            try {
                iArr[OperatorSupplementMapPurpose.OTHER_POSSIBLE_LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OperatorSupplementMapPurpose.LOCATE_BIRD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00052(\u0010\u0004\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "", "it", "Lna4;", "invoke", "(Ljava/util/List;)Lna4;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$c */
    /* loaded from: classes2.dex */
    public static final class C28446c extends Lambda implements Function1<List<Vehicle>, InterfaceC45761na4<? extends Vehicle>> {

        /* renamed from: g */
        public static final C28446c f109513g = new C28446c();

        public C28446c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC45761na4<? extends Vehicle> invoke(List<Vehicle> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC24490k.m32141i0(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/u;", "Lco/bird/android/model/NearbyBirdViewModel;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$d */
    /* loaded from: classes2.dex */
    public static final class C28447d extends Lambda implements Function1<Vehicle, InterfaceC24574u<? extends NearbyBirdViewModel>> {
        public C28447d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends NearbyBirdViewModel> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C48924su3.this.f109483j.mo4752a(it, C48924su3.this.f109494u, C48924su3.this.f109495v, C48924su3.this.f109496w);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/NearbyBirdViewModel;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/NearbyBirdViewModel;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$e */
    /* loaded from: classes2.dex */
    public static final class C28448e extends Lambda implements Function1<NearbyBirdViewModel, Boolean> {
        public C28448e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(NearbyBirdViewModel it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            WireBird wireBird = C48924su3.this.f109487n;
            WireBird wireBird2 = null;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            if (!Intrinsics.areEqual(wireBird.getId(), it.getVehicle().getBird().getId())) {
                WireBird wireBird3 = C48924su3.this.f109487n;
                if (wireBird3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                } else {
                    wireBird2 = wireBird3;
                }
                if (!WireBirdKt.isProbablySameBird(wireBird2, it.getVehicle().getBird())) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/NearbyBirdViewModel;", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(Lco/bird/android/model/NearbyBirdViewModel;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$f */
    /* loaded from: classes2.dex */
    public static final class C28449f extends Lambda implements Function1<NearbyBirdViewModel, Unit> {
        public C28449f() {
            super(1);
        }

        /* renamed from: a */
        public final void m13426a(NearbyBirdViewModel nearbyBirdViewModel) {
            C48924su3.this.f109486m.mo4496He(true);
            InterfaceC51888xu3 interfaceC51888xu3 = C48924su3.this.f109486m;
            WireBird wireBird = C48924su3.this.f109487n;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            interfaceC51888xu3.mo4493Jh(wireBird.getCode());
            C48924su3.this.f109486m.mo4497F7(nearbyBirdViewModel.getVehicle().getBird().getBatteryLevel());
            C48924su3.this.f109486m.mo4490ca(nearbyBirdViewModel.getVehicle());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NearbyBirdViewModel nearbyBirdViewModel) {
            m13426a(nearbyBirdViewModel);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$g */
    /* loaded from: classes2.dex */
    public static final class C28450g extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C28450g f109517g = new C28450g();

        public C28450g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$h */
    /* loaded from: classes2.dex */
    public static final class C28451h extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: g */
        public static final C28451h f109518g = new C28451h();

        public C28451h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lde5$a;", TransferTable.COLUMN_STATE, "Lna4;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lde5$a;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$i */
    /* loaded from: classes2.dex */
    public static final class C28452i extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, InterfaceC45761na4<? extends Vehicle>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: su3$i$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C28453a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AbstractC39873de5.EnumC19828a.values().length];
                try {
                    iArr[AbstractC39873de5.EnumC19828a.READY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C28452i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC45761na4<? extends Vehicle> invoke(AbstractC39873de5.EnumC19828a state) {
            int i;
            Intrinsics.checkNotNullParameter(state, "state");
            AbstractC39873de5.EnumC19828a mo33641c = C48924su3.this.f109482i.mo33641c();
            if (mo33641c == null) {
                i = -1;
            } else {
                i = C28453a.$EnumSwitchMapping$0[mo33641c.ordinal()];
            }
            if (i == 1) {
                return C48924su3.this.f109474a.mo11726b(BLEScanTrigger.BIRD_FINDER).m32093z0(AbstractC24490k.m32181P());
            }
            return AbstractC24490k.m32181P();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$j */
    /* loaded from: classes2.dex */
    public static final class C28454j extends Lambda implements Function1<Throwable, Unit> {
        public C28454j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            InterfaceC51888xu3 interfaceC51888xu3 = C48924su3.this.f109486m;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC51888xu3.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdLocations;", "kotlin.jvm.PlatformType", "locations", "", C17296a.f69688o, "(Lco/bird/android/model/BirdLocations;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorSupplementMapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSupplementMapPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorSupplementMapPresenterImpl$loadOtherPossibleLocations$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"})
    /* renamed from: su3$k */
    /* loaded from: classes2.dex */
    public static final class C28455k extends Lambda implements Function1<BirdLocations, Unit> {
        public C28455k() {
            super(1);
        }

        /* renamed from: a */
        public final void m13423a(BirdLocations birdLocations) {
            Unit unit = null;
            if (birdLocations != null) {
                if (!(!birdLocations.getLocations().isEmpty())) {
                    birdLocations = null;
                }
                if (birdLocations != null) {
                    C48924su3 c48924su3 = C48924su3.this;
                    c48924su3.m13508I0(false);
                    c48924su3.f109489p.accept(birdLocations.getLocations());
                    c48924su3.m13506J0();
                    unit = Unit.INSTANCE;
                }
            }
            if (unit == null) {
                C48924su3.this.m13508I0(true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdLocations birdLocations) {
            m13423a(birdLocations);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$l */
    /* loaded from: classes2.dex */
    public static final class C28456l extends Lambda implements Function1<Throwable, Unit> {
        public C28456l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C48924su3.this.m13508I0(true);
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$m */
    /* loaded from: classes2.dex */
    public static final class C28457m extends Lambda implements Function1<Throwable, Unit> {
        public C28457m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            InterfaceC51888xu3 interfaceC51888xu3 = C48924su3.this.f109486m;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC51888xu3.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdLocations;", "kotlin.jvm.PlatformType", "locations", "", C17296a.f69688o, "(Lco/bird/android/model/BirdLocations;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorSupplementMapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSupplementMapPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorSupplementMapPresenterImpl$loadRadarLocation$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,421:1\n288#2,2:422\n*S KotlinDebug\n*F\n+ 1 OperatorSupplementMapPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorSupplementMapPresenterImpl$loadRadarLocation$2\n*L\n336#1:422,2\n*E\n"})
    /* renamed from: su3$n */
    /* loaded from: classes2.dex */
    public static final class C28458n extends Lambda implements Function1<BirdLocations, Unit> {
        public C28458n() {
            super(1);
        }

        /* renamed from: a */
        public final void m13422a(BirdLocations birdLocations) {
            Object obj;
            boolean z;
            Iterator<T> it = birdLocations.getLocations().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((BirdLocation) obj).getSource() == BirdLocationSource.EU_TAG) {
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
            if (((BirdLocation) obj) != null) {
                C48924su3.this.m13504K0("039");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdLocations birdLocations) {
            m13422a(birdLocations);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$o */
    /* loaded from: classes2.dex */
    public static final class C28459o extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C28459o f109525g = new C28459o();

        public C28459o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$p */
    /* loaded from: classes2.dex */
    public static final class C28460p extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends List<WireBird>>> {
        public C28460p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<WireBird>> invoke(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C48924su3.this.f109477d.mo8147I0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$q */
    /* loaded from: classes2.dex */
    public static final class C28461q extends Lambda implements Function1<List<WireBird>, Unit> {
        public C28461q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<WireBird> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> list) {
            Intent intent = new Intent();
            WireBird wireBird = C48924su3.this.f109487n;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            intent.putExtra("bird", wireBird);
            C48924su3.this.f109484k.mo37190C1(-1, intent);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$r */
    /* loaded from: classes2.dex */
    public static final class C28462r extends Lambda implements Function1<Throwable, Unit> {
        public C28462r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C48924su3.this.f109486m.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "location", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$s */
    /* loaded from: classes2.dex */
    public static final class C28463s extends Lambda implements Function1<Location, Unit> {
        public C28463s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location location) {
            InterfaceC51888xu3 interfaceC51888xu3 = C48924su3.this.f109486m;
            Intrinsics.checkNotNullExpressionValue(location, "location");
            interfaceC51888xu3.moveTo(location);
            C48924su3.this.f109486m.updateMyLocation(location);
            C48924su3.this.f109490q.accept(location);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Route;", "kotlin.jvm.PlatformType", "route", "", C17296a.f69688o, "(Lco/bird/android/model/Route;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$t */
    /* loaded from: classes2.dex */
    public static final class C28464t extends Lambda implements Function1<Route, Unit> {
        public C28464t() {
            super(1);
        }

        /* renamed from: a */
        public final void m13420a(Route route) {
            InterfaceC51888xu3 interfaceC51888xu3 = C48924su3.this.f109486m;
            Intrinsics.checkNotNullExpressionValue(route, "route");
            interfaceC51888xu3.mo4479uj(route);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Route route) {
            m13420a(route);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$u */
    /* loaded from: classes2.dex */
    public static final class C28465u extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C28465u f109531g = new C28465u();

        public C28465u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LfM2;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LfM2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$v */
    /* loaded from: classes2.dex */
    public static final class C28466v extends Lambda implements Function1<C40889fM2, Unit> {
        public C28466v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C40889fM2 c40889fM2) {
            invoke2(c40889fM2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C40889fM2 it) {
            C48924su3 c48924su3 = C48924su3.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c48924su3.m13465l0(it, true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LfM2;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/Route;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LfM2;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$w */
    /* loaded from: classes2.dex */
    public static final class C28467w extends Lambda implements Function1<C40889fM2, InterfaceC23434B<? extends Route>> {
        public C28467w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Route> invoke(C40889fM2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC10636aM interfaceC10636aM = C48924su3.this.f109476c;
            Location location = (Location) C48924su3.this.f109490q.getValue();
            WireBird wireBird = C48924su3.this.f109487n;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            return interfaceC10636aM.mo71600I0(location, wireBird.getLocation().fromLocation());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Route;", "kotlin.jvm.PlatformType", "route", "", C17296a.f69688o, "(Lco/bird/android/model/Route;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$x */
    /* loaded from: classes2.dex */
    public static final class C28468x extends Lambda implements Function1<Route, Unit> {
        public C28468x() {
            super(1);
        }

        /* renamed from: a */
        public final void m13418a(Route route) {
            InterfaceC51888xu3 interfaceC51888xu3 = C48924su3.this.f109486m;
            Intrinsics.checkNotNullExpressionValue(route, "route");
            interfaceC51888xu3.mo4479uj(route);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Route route) {
            m13418a(route);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su3$y */
    /* loaded from: classes2.dex */
    public static final class C28469y extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C28469y f109535g = new C28469y();

        public C28469y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su3$z */
    /* loaded from: classes2.dex */
    public static final class C28470z extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Location>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lio/reactivex/K;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: su3$z$a */
        /* loaded from: classes2.dex */
        public static final class C28471a extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends Location>> {

            /* renamed from: g */
            public final /* synthetic */ C48924su3 f109537g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28471a(C48924su3 c48924su3) {
                super(1);
                this.f109537g = c48924su3;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends Location> invoke(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (throwable instanceof TimeoutException) {
                    return AbstractC23442F.m33158H(this.f109537g.f109478e.mo43616p().getValue());
                }
                return AbstractC23442F.m33100x(throwable);
            }
        }

        public C28470z() {
            super(1);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Location> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<Location> m33140a0 = C48924su3.this.f109478e.mo43627e(false).m33140a0(1L, TimeUnit.SECONDS);
            final C28471a c28471a = new C28471a(C48924su3.this);
            return m33140a0.m33150P(new InterfaceC23492o() { // from class: tu3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = C48924su3.C28470z.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    public C48924su3(InterfaceC44723lp2 bluetoothManagerV2, InterfaceC27246pJ bluetoothManager, InterfaceC10636aM birdManager, InterfaceC46473om3 operatorManager, InterfaceC40001dr4 locationManager, DQ3 permissionManager, InterfaceC1880Ea analyticsManager, C22454gl preference, AbstractC39873de5 rxBleClient, InterfaceC51791xk6 vehicleBirdHydrationManager, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, InterfaceC51888xu3 ui) {
        List emptyList;
        Intrinsics.checkNotNullParameter(bluetoothManagerV2, "bluetoothManagerV2");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(vehicleBirdHydrationManager, "vehicleBirdHydrationManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f109474a = bluetoothManagerV2;
        this.f109475b = bluetoothManager;
        this.f109476c = birdManager;
        this.f109477d = operatorManager;
        this.f109478e = locationManager;
        this.f109479f = permissionManager;
        this.f109480g = analyticsManager;
        this.f109481h = preference;
        this.f109482i = rxBleClient;
        this.f109483j = vehicleBirdHydrationManager;
        this.f109484k = navigator;
        this.f109485l = scopeProvider;
        this.f109486m = ui;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f109489p = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        this.f109490q = C37791a94.C10586a.create$default(c10586a, C37429Yw2.f47648a.m73963h(0.0d, 0.0d), null, 2, null);
        AbstractC24490k<AbstractC39873de5.EnumC19828a> flowable = rxBleClient.mo33640d().startWith((Observable<AbstractC39873de5.EnumC19828a>) rxBleClient.mo33641c()).distinctUntilChanged().toFlowable(EnumC23460b.BUFFER);
        final C28452i c28452i = new C28452i();
        this.f109492s = flowable.m32167W(new InterfaceC23492o() { // from class: mu3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m13493V;
                m13493V = C48924su3.m13493V(Function1.this, obj);
                return m13493V;
            }
        }).m32204D0();
        AbstractC23437E m31934a = C24542a.m31934a();
        Intrinsics.checkNotNullExpressionValue(m31934a, "computation()");
        this.f109493t = m31934a;
        this.f109494u = new HashMap<>();
        this.f109495v = new HashSet<>();
        this.f109496w = new HashMap<>();
        this.f109498y = C37791a94.C10586a.create$default(c10586a, Optional.f63040c.m59034a(), null, 2, null);
    }

    /* renamed from: A0 */
    public static final void m13524A0(C48924su3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f109486m.mo4498D4();
    }

    /* renamed from: B0 */
    public static final boolean m13522B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: C0 */
    public static final void m13520C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final boolean m13518D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: E0 */
    public static final void m13516E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final void m13514F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G0 */
    public static final BirdLocation m13512G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BirdLocation) tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final void m13510H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final InterfaceC45761na4 m13501N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final InterfaceC24574u m13500O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final boolean m13499P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: Q */
    public static final void m13498Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m13497R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23434B m13494U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final InterfaceC45761na4 m13493V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m13491X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m13490Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m13489Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m13485b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m13483c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m13481d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC23447K m13477f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m13475g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m13473h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m13471i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final InterfaceC23434B m13459o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m13457p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m13455q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m13453r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final InterfaceC23434B m13451s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final void m13449t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final void m13447u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final InterfaceC23447K m13445v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m13443w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final void m13441x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y0 */
    public static final void m13439y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final InterfaceC23434B m13437z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public final void m13508I0(boolean z) {
        this.f109486m.mo4478yc(z);
        InterfaceC51888xu3.C30338a.showInfoBanner$default(this.f109486m, !z, false, 2, null);
    }

    /* renamed from: J0 */
    public final void m13506J0() {
        WireBird wireBird = null;
        InterfaceC51888xu3.C30338a.showInfoBanner$default(this.f109486m, true, false, 2, null);
        InterfaceC51888xu3 interfaceC51888xu3 = this.f109486m;
        WireBird wireBird2 = this.f109487n;
        if (wireBird2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
        } else {
            wireBird = wireBird2;
        }
        interfaceC51888xu3.mo4495Ie(wireBird.getCode());
    }

    /* renamed from: K0 */
    public final void m13504K0(String str) {
        this.f109486m.mo4487f8(true, true);
        this.f109486m.mo4489ci(str);
    }

    /* renamed from: M */
    public final void m13502M(long j) {
        InterfaceC23465c interfaceC23465c;
        InterfaceC23465c interfaceC23465c2 = this.f109491r;
        boolean z = false;
        if (interfaceC23465c2 != null && !interfaceC23465c2.mo1769e()) {
            z = true;
        }
        if (z && (interfaceC23465c = this.f109491r) != null) {
            interfaceC23465c.dispose();
        }
        AbstractC24490k<List<Vehicle>> m32147g = this.f109492s.m32147g(j, TimeUnit.MILLISECONDS, this.f109493t, Integer.MAX_VALUE);
        final C28446c c28446c = C28446c.f109513g;
        AbstractC24490k<R> m32167W = m32147g.m32167W(new InterfaceC23492o() { // from class: cu3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m13501N;
                m13501N = C48924su3.m13501N(Function1.this, obj);
                return m13501N;
            }
        });
        final C28447d c28447d = new C28447d();
        AbstractC24490k m32154d0 = m32167W.m32154d0(new InterfaceC23492o() { // from class: eu3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m13500O;
                m13500O = C48924su3.m13500O(Function1.this, obj);
                return m13500O;
            }
        });
        final C28448e c28448e = new C28448e();
        AbstractC24490k m32111s0 = m32154d0.m32175S(new InterfaceC23494q() { // from class: fu3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m13499P;
                m13499P = C48924su3.m13499P(Function1.this, obj);
                return m13499P;
            }
        }).m32192J0().m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "private fun bluetoothSca…Timber.e(it)\n      })\n  }");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(this.f109485l));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28449f c28449f = new C28449f();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: gu3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13498Q(Function1.this, obj);
            }
        };
        final C28450g c28450g = C28450g.f109517g;
        this.f109491r = ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: hu3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13497R(Function1.this, obj);
            }
        });
    }

    /* renamed from: S */
    public final void m13496S(List<WireLocation> list) {
        List<? extends Point> mutableListOf;
        int collectionSizeOrDefault;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new Point(this.f109490q.getValue().getLongitude(), this.f109490q.getValue().getLatitude()));
        List<WireLocation> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireLocation wireLocation : list2) {
            arrayList.add(new Point(wireLocation.getLongitude(), wireLocation.getLatitude()));
        }
        mutableListOf.addAll(arrayList);
        this.f109486m.zoomTo(mutableListOf);
    }

    /* renamed from: T */
    public final Observable<Vehicle> m13495T(WireBird wireBird) {
        Observable alarm$default = InterfaceC10636aM.C10637a.alarm$default(this.f109476c, wireBird, AlarmCommand.CHIRP, null, 4, null);
        final C28451h c28451h = C28451h.f109518g;
        Observable<Vehicle> flatMap = alarm$default.flatMap(new InterfaceC23492o() { // from class: nu3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m13494U;
                m13494U = C48924su3.m13494U(Function1.this, obj);
                return m13494U;
            }
        });
        if (wireBird.getBluetooth()) {
            Observable<Vehicle> onErrorResumeNext = InterfaceC27246pJ.C27247a.alarm$default(this.f109475b, wireBird, AlarmType.SHORT, true, false, 8, null).onErrorResumeNext(flatMap);
            Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "{\n      // todo - replac…eNext(networkChirp)\n    }");
            return onErrorResumeNext;
        }
        Intrinsics.checkNotNullExpressionValue(flatMap, "{\n      networkChirp\n    }");
        return flatMap;
    }

    /* renamed from: W */
    public final void m13492W() {
        InterfaceC10636aM interfaceC10636aM = this.f109476c;
        WireBird wireBird = this.f109487n;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        AbstractC23442F m33146T = C38096ag5.m70883l(C28237sD.progress$default(interfaceC10636aM.mo71579c1(wireBird.getId()), this.f109486m, 0, 2, (Object) null)).m33146T(1L);
        final C28454j c28454j = new C28454j();
        AbstractC24507p m32065J = m33146T.m33106t(new InterfaceC23484g() { // from class: iu3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13491X(Function1.this, obj);
            }
        }).m33125j0().m32065J();
        Intrinsics.checkNotNullExpressionValue(m32065J, "private fun loadOtherPos…Timber.e(it)\n      })\n  }");
        Object m32048b = m32065J.m32048b(AutoDispose.m45239a(this.f109485l));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28455k c28455k = new C28455k();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ju3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13490Y(Function1.this, obj);
            }
        };
        final C28456l c28456l = new C28456l();
        ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: ku3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13489Z(Function1.this, obj);
            }
        });
    }

    /* renamed from: a0 */
    public final void m13487a0() {
        InterfaceC10636aM interfaceC10636aM = this.f109476c;
        WireBird wireBird = this.f109487n;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        AbstractC23442F m33146T = C38096ag5.m70883l(C28237sD.progress$default(interfaceC10636aM.mo71579c1(wireBird.getId()), this.f109486m, 0, 2, (Object) null)).m33146T(1L);
        final C28457m c28457m = new C28457m();
        AbstractC24507p m32065J = m33146T.m33106t(new InterfaceC23484g() { // from class: ou3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13485b0(Function1.this, obj);
            }
        }).m33125j0().m32065J();
        Intrinsics.checkNotNullExpressionValue(m32065J, "private fun loadRadarLoc…Timber.e(it)\n      })\n  }");
        Object m32048b = m32065J.m32048b(AutoDispose.m45239a(this.f109485l));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28458n c28458n = new C28458n();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: pu3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13483c0(Function1.this, obj);
            }
        };
        final C28459o c28459o = C28459o.f109525g;
        ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: qu3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13481d0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC33191Gt3
    /* renamed from: b */
    public void mo13486b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f109487n = (WireBird) parcelableExtra;
        String stringExtra = intent.getStringExtra("operator_supplement_map_purpose");
        Intrinsics.checkNotNull(stringExtra);
        this.f109488o = OperatorSupplementMapPurpose.valueOf(stringExtra);
        this.f109497x = this.f109492s.m33007x1();
        AbstractC23442F<Location> m33152N = this.f109478e.mo43627e(true).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "locationManager.requestL…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f109485l));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28463s c28463s = new C28463s();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Ht3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13471i0(Function1.this, obj);
            }
        });
        OperatorSupplementMapPurpose operatorSupplementMapPurpose = this.f109488o;
        if (operatorSupplementMapPurpose == null) {
            Intrinsics.throwUninitializedPropertyAccessException("purpose");
            operatorSupplementMapPurpose = null;
        }
        int i = C28445b.$EnumSwitchMapping$0[operatorSupplementMapPurpose.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m13463m0();
                return;
            }
            return;
        }
        m13461n0();
    }

    /* renamed from: e0 */
    public void m13479e0(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Observable progress$default = C28237sD.progress$default(this.f109477d.mo8125W0(new C9750YG(bird, BirdAction.START_CHARGE, null, 4, null)), this.f109486m, 0, 2, (Object) null);
        final C28460p c28460p = new C28460p();
        Observable observeOn = progress$default.flatMapSingle(new InterfaceC23492o() { // from class: St3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m13477f0;
                m13477f0 = C48924su3.m13477f0(Function1.this, obj);
                return m13477f0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onBirdScann…eneric_body)\n      })\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f109485l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28461q c28461q = new C28461q();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: du3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13475g0(Function1.this, obj);
            }
        };
        final C28462r c28462r = new C28462r();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: lu3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13473h0(Function1.this, obj);
            }
        });
    }

    /* renamed from: j0 */
    public final void m13469j0() {
        this.f109486m.removeRoute();
        m13467k0();
    }

    /* renamed from: k0 */
    public final void m13467k0() {
        if (this.f109498y.getValue().m59037c()) {
            Pair<C40889fM2, Boolean> m59038b = this.f109498y.getValue().m59038b();
            this.f109486m.mo4491ba(m59038b.getFirst(), m59038b.getSecond().booleanValue());
        }
    }

    /* renamed from: l0 */
    public final void m13465l0(C40889fM2 c40889fM2, boolean z) {
        m13467k0();
        this.f109498y.accept(new Optional<>(TuplesKt.m28425to(c40889fM2, Boolean.valueOf(z))));
        this.f109486m.mo4481qa(c40889fM2, z);
    }

    /* renamed from: m0 */
    public final void m13463m0() {
        this.f109486m.setTitle(C45871nl4.locate_bird_activity_title);
        this.f109486m.mo4486hl(C45871nl4.locate_bird_info_banner_title);
        this.f109486m.mo4480te(false, false, true, true);
        InterfaceC51888xu3 interfaceC51888xu3 = this.f109486m;
        WireBird wireBird = this.f109487n;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        interfaceC51888xu3.mo4499A2(wireBird.getLocation(), false);
        m13487a0();
    }

    /* renamed from: n0 */
    public final void m13461n0() {
        this.f109486m.setTitle(C45871nl4.other_possible_location_activity_title);
        InterfaceC51888xu3 interfaceC51888xu3 = this.f109486m;
        WireBird wireBird = this.f109487n;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        interfaceC51888xu3.mo4499A2(wireBird.getLocation(), true);
        this.f109486m.mo4480te(true, true, false, false);
        m13502M(this.f109481h.m37615i0());
        this.f109486m.mo4484lb();
        Observable<Unit> observeOn = this.f109486m.mapClicks().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.mapClicks()\n      .ob…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f109485l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28435D c28435d = new C28435D();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ru3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13439y0(Function1.this, obj);
            }
        });
        m13492W();
        C24523e c24523e = C24523e.f91168a;
        C37791a94<List<BirdLocation>> c37791a94 = this.f109489p;
        C37791a94<Location> c37791a942 = this.f109490q;
        final C28436E c28436e = C28436E.f109505g;
        Observable<Location> skipWhile = c37791a942.skipWhile(new InterfaceC23494q() { // from class: Tt3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m13522B0;
                m13522B0 = C48924su3.m13522B0(Function1.this, obj);
                return m13522B0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(skipWhile, "userLocation.skipWhile { it.latitude == 0.0 }");
        Observable observeOn2 = c24523e.m31956a(c37791a94, skipWhile).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f109485l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28437F c28437f = new C28437F();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Ut3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13520C0(Function1.this, obj);
            }
        });
        Observable<C40889fM2> mo4483og = this.f109486m.mo4483og();
        final C28438G c28438g = C28438G.f109507g;
        Observable<C40889fM2> filter = mo4483og.filter(new InterfaceC23494q() { // from class: Vt3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m13518D0;
                m13518D0 = C48924su3.m13518D0(Function1.this, obj);
                return m13518D0;
            }
        });
        final C28439H c28439h = new C28439H();
        Observable<C40889fM2> doOnNext = filter.doOnNext(new InterfaceC23484g() { // from class: Wt3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13516E0(Function1.this, obj);
            }
        });
        final C28440I c28440i = new C28440I();
        Observable<C40889fM2> doOnNext2 = doOnNext.doOnNext(new InterfaceC23484g() { // from class: Xt3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13514F0(Function1.this, obj);
            }
        });
        final C28441J c28441j = C28441J.f109510g;
        Observable<R> map = doOnNext2.map(new InterfaceC23492o() { // from class: Yt3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                BirdLocation m13512G0;
                m13512G0 = C48924su3.m13512G0(Function1.this, obj);
                return m13512G0;
            }
        });
        final C28442K c28442k = new C28442K();
        Observable doOnNext3 = map.doOnNext(new InterfaceC23484g() { // from class: Zt3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13510H0(Function1.this, obj);
            }
        });
        final C28443L c28443l = new C28443L();
        Observable observeOn3 = doOnNext3.flatMap(new InterfaceC23492o() { // from class: au3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m13459o0;
                m13459o0 = C48924su3.m13459o0(Function1.this, obj);
                return m13459o0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "private fun setupOtherPo…r)\n      .subscribe()\n  }");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f109485l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28464t c28464t = new C28464t();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: bu3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13457p0(Function1.this, obj);
            }
        };
        final C28465u c28465u = C28465u.f109531g;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: It3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13455q0(Function1.this, obj);
            }
        });
        Observable<C40889fM2> mo4488dl = this.f109486m.mo4488dl();
        final C28466v c28466v = new C28466v();
        Observable<C40889fM2> doOnNext4 = mo4488dl.doOnNext(new InterfaceC23484g() { // from class: Jt3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13453r0(Function1.this, obj);
            }
        });
        final C28467w c28467w = new C28467w();
        Observable observeOn4 = doOnNext4.flatMap(new InterfaceC23492o() { // from class: Kt3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m13451s0;
                m13451s0 = C48924su3.m13451s0(Function1.this, obj);
                return m13451s0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "private fun setupOtherPo…r)\n      .subscribe()\n  }");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f109485l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28468x c28468x = new C28468x();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: Lt3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13449t0(Function1.this, obj);
            }
        };
        final C28469y c28469y = C28469y.f109535g;
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: Mt3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13447u0(Function1.this, obj);
            }
        });
        Observable<Unit> myLocationClicks = this.f109486m.myLocationClicks();
        final C28470z c28470z = new C28470z();
        Observable observeOn5 = myLocationClicks.switchMapSingle(new InterfaceC23492o() { // from class: Nt3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m13445v0;
                m13445v0 = C48924su3.m13445v0(Function1.this, obj);
                return m13445v0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "private fun setupOtherPo…r)\n      .subscribe()\n  }");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f109485l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28430A c28430a = new C28430A();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: Ot3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13443w0(Function1.this, obj);
            }
        };
        final C28431B c28431b = C28431B.f109500g;
        ((ObservableSubscribeProxy) m33094as5).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: Pt3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48924su3.m13441x0(Function1.this, obj);
            }
        });
        Observable<Unit> mo4485kb = this.f109486m.mo4485kb();
        final C28432C c28432c = new C28432C();
        Observable<R> flatMap = mo4485kb.flatMap(new InterfaceC23492o() { // from class: Qt3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m13437z0;
                m13437z0 = C48924su3.m13437z0(Function1.this, obj);
                return m13437z0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "private fun setupOtherPo…r)\n      .subscribe()\n  }");
        Object m33094as6 = flatMap.m33094as(AutoDispose.m45239a(this.f109485l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as6).subscribe();
        AbstractC23461c m33029z = AbstractC23461c.m33057c0(5000L, TimeUnit.MILLISECONDS).m33070P(C23454a.m33087a()).m33029z(new InterfaceC23478a() { // from class: Rt3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C48924su3.m13524A0(C48924su3.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "timer(SHOW_ORIGINAL_LOCA…ationInfoWindow()\n      }");
        Object m33041n = m33029z.m33041n(AutoDispose.m45239a(this.f109485l));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    @Override // p000.InterfaceC33191Gt3
    public void onActivityResult(int i, int i2, Intent intent) {
        WireBird wireBird;
        if (i == 10006 && i2 == -1 && intent != null && (wireBird = (WireBird) intent.getParcelableExtra("bird")) != null) {
            m13479e0(wireBird);
        }
    }
}
