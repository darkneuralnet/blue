package p000;

import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AlarmType;
import co.bird.android.model.BirdActionsAndSettings;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.PrivateBirdSetting;
import co.bird.android.model.Vehicle;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.BrainState;
import co.bird.android.model.constant.OwnershipKind;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.VehicleVersion;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WireLifecycle;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.navigator.MyBirdsResult;
import co.bird.api.response.WireBirdActionPairResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.C41318g46;
import p000.C49101tC3;
import p000.H31;
import p000.InterfaceC27246pJ;
import p000.InterfaceC40099e13;
import p000.InterfaceC41921h56;
import p000.InterfaceC47256q54;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 ¢\u00012\u00020\u0001:\u0002\u0016&B\u008b\u0001\b\u0007\u0012\u0006\u0010$\u001a\u00020 \u0012\u0006\u0010*\u001a\u00020%\u0012\u0006\u00100\u001a\u00020+\u0012\u0006\u00106\u001a\u000201\u0012\u0006\u0010<\u001a\u000207\u0012\u0006\u0010B\u001a\u00020=\u0012\u0006\u0010H\u001a\u00020C\u0012\u0006\u0010N\u001a\u00020I\u0012\u0006\u0010T\u001a\u00020O\u0012\u0006\u0010Z\u001a\u00020U\u0012\u0006\u0010`\u001a\u00020[\u0012\u0006\u0010f\u001a\u00020a\u0012\u0006\u0010l\u001a\u00020g\u0012\u0006\u0010r\u001a\u00020m\u0012\u0006\u0010w\u001a\u00020\b\u0012\u0006\u0010}\u001a\u00020x¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\b\u0012\u0004\u0012\u00020\u00020\rH\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\rH\u0002J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\f\u0010\u001b\u001a\u00020\u001a*\u00020\u0002H\u0004J\u0014\u0010\u001d\u001a\u00020\b*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0004J\u0014\u0010\u001f\u001a\u00020\b*\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0004R\u001a\u0010$\u001a\u00020 8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010*\u001a\u00020%8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u00100\u001a\u00020+8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00106\u001a\u0002018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010<\u001a\u0002078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010B\u001a\u00020=8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010H\u001a\u00020C8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010N\u001a\u00020I8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010T\u001a\u00020O8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010Z\u001a\u00020U8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010`\u001a\u00020[8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010f\u001a\u00020a8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010l\u001a\u00020g8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010r\u001a\u00020m8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010w\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001a\u0010}\u001a\u00020x8\u0004X\u0084\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R,\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\u00020\u00020~8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R%\u0010\u0085\u0001\u001a\u0010\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\b0\b0~8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0081\u0001R.\u0010\u008b\u0001\u001a\u0011\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\u00040\u00040\u0086\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R-\u0010\u008e\u0001\u001a\u0010\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\u00130\u00130~8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u0081\u0001\u001a\u0006\b\u008d\u0001\u0010\u0083\u0001R%\u0010\u0090\u0001\u001a\u0010\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\u00040\u00040~8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0081\u0001R%\u0010\u0095\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0092\u0001\u0012\u0004\u0012\u00020m0\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001RÈ\u0001\u0010\u0099\u0001\u001a²\u0001\u0012R\u0012P\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\u00130\u0013\u0012\u0004\u0012\u00020m \u007f*'\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\u00130\u0013\u0012\u0004\u0012\u00020m\u0018\u00010\u0096\u00010\u0096\u0001 \u007f*X\u0012R\u0012P\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\u00130\u0013\u0012\u0004\u0012\u00020m \u007f*'\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\u00130\u0013\u0012\u0004\u0012\u00020m\u0018\u00010\u0096\u00010\u0096\u0001\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R;\u0010\u009b\u0001\u001a&\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\b0\b \u007f*\u0012\u0012\f\u0012\n \u007f*\u0004\u0018\u00010\b0\b\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0098\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001¨\u0006£\u0001"}, m28432d2 = {"LtC3;", "LRA3;", "Lco/bird/android/model/persistence/Bird;", "bird", "", "C2", "", "throwable", "", "lock", "z2", "e1", "d1", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "Y0", "a1", "T", "E0", "Lco/bird/android/model/persistence/VehicleVersion;", "vehicleVersion", "c1", C17296a.f69688o, "onResume", "onBackPressed", "F2", "Lco/bird/android/model/VehicleDescriptor;", "G2", "updatedBird", "D2", "updatedVehicleVersion", "E2", "LEa;", "LEa;", "G0", "()LEa;", "analyticsManager", "LpJ;", "b", "LpJ;", "L0", "()LpJ;", "bluetoothManager", "Lq54;", "c", "Lq54;", "Q0", "()Lq54;", "privateBirdsManager", "LWX2;", DateTokenConverter.CONVERTER_KEY, "LWX2;", "getMyBirdsManager", "()LWX2;", "myBirdsManager", "LgH;", "e", "LgH;", "I0", "()LgH;", "birdActionsManager", "LkI;", "f", "LkI;", "J0", "()LkI;", "birdAirManager", "Lrd5;", "g", "Lrd5;", "T0", "()Lrd5;", "rxBleBirdBluetoothManager", "Ldr4;", "h", "Ldr4;", "S0", "()Ldr4;", "reactiveLocationManager", "LTq4;", "i", "LTq4;", "R0", "()LTq4;", "reactiveConfig", "Le13;", "j", "Le13;", "O0", "()Le13;", "navigator", "LOA3;", "k", "LOA3;", "M0", "()LOA3;", "converter", "Lcom/uber/autodispose/ScopeProvider;", "l", "Lcom/uber/autodispose/ScopeProvider;", "U0", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LUC3;", "m", "LUC3;", "W0", "()LUC3;", "ui", "", "n", "Ljava/lang/String;", "K0", "()Ljava/lang/String;", "birdId", "o", "Z", "getJustPaired", "()Z", "justPaired", "Ldd3;", "p", "Ldd3;", "P0", "()Ldd3;", "notificationSender", "LAG;", "kotlin.jvm.PlatformType", "q", "LAG;", "H0", "()LAG;", "r", "birdUnpaired", "Lio/reactivex/subjects/d;", "s", "Lio/reactivex/subjects/d;", "V0", "()Lio/reactivex/subjects/d;", "subscribeBleNotify", "t", "X0", "vehicleVersionRelay", "u", "updatedExplicitParts", "", "Lco/bird/android/model/constant/PartKind;", "v", "Ljava/util/Map;", "explicitParts", "Lkotlin/Triple;", "w", "Lio/reactivex/Observable;", "birdVersionLocation", "x", "birdLockChanges", "Lg46$b;", "N0", "()Lg46$b;", "logger", "<init>", "(LEa;LpJ;Lq54;LWX2;LgH;LkI;Lrd5;Ldr4;LTq4;Le13;LOA3;Lcom/uber/autodispose/ScopeProvider;LUC3;Ljava/lang/String;ZLdd3;)V", "y", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOwnedBirdDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/OwnedBirdDetailsPresenterImpl\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,697:1\n52#2,2:698\n52#2,2:707\n180#3:700\n180#3:701\n180#3:702\n237#3:703\n237#3:704\n237#3:705\n180#3:706\n180#3:709\n237#3:710\n180#3:711\n180#3:712\n180#3:713\n237#3:714\n237#3:715\n161#3:716\n180#3:717\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/OwnedBirdDetailsPresenterImpl\n*L\n117#1:698,2\n323#1:707,2\n177#1:700\n184#1:701\n188#1:702\n216#1:703\n245#1:704\n282#1:705\n319#1:706\n414#1:709\n460#1:710\n510#1:711\n538#1:712\n551#1:713\n565#1:714\n587#1:715\n598#1:716\n604#1:717\n*E\n"})
/* renamed from: tC3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C49101tC3 implements RA3 {

    /* renamed from: y */
    public static final C28587a f110012y = new C28587a(null);

    /* renamed from: a */
    public final InterfaceC1880Ea f110013a;

    /* renamed from: b */
    public final InterfaceC27246pJ f110014b;

    /* renamed from: c */
    public final InterfaceC47256q54 f110015c;

    /* renamed from: d */
    public final WX2 f110016d;

    /* renamed from: e */
    public final InterfaceC20792gH f110017e;

    /* renamed from: f */
    public final InterfaceC25134kI f110018f;

    /* renamed from: g */
    public final InterfaceC48164rd5 f110019g;

    /* renamed from: h */
    public final InterfaceC40001dr4 f110020h;

    /* renamed from: i */
    public final C36207Tq4 f110021i;

    /* renamed from: j */
    public final InterfaceC40099e13 f110022j;

    /* renamed from: k */
    public final OA3 f110023k;

    /* renamed from: l */
    public final ScopeProvider f110024l;

    /* renamed from: m */
    public final UC3 f110025m;

    /* renamed from: n */
    public final String f110026n;

    /* renamed from: o */
    public final boolean f110027o;

    /* renamed from: p */
    public final InterfaceC39861dd3 f110028p;

    /* renamed from: q */
    public final C0058AG<Bird> f110029q;

    /* renamed from: r */
    public final C0058AG<Boolean> f110030r;

    /* renamed from: s */
    public final C24558d<Unit> f110031s;

    /* renamed from: t */
    public final C0058AG<VehicleVersion> f110032t;

    /* renamed from: u */
    public final C0058AG<Unit> f110033u;

    /* renamed from: v */
    public final Map<PartKind, String> f110034v;

    /* renamed from: w */
    public final Observable<Triple<Bird, VehicleVersion, String>> f110035w;

    /* renamed from: x */
    public final Observable<Boolean> f110036x;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$A */
    /* loaded from: classes3.dex */
    public static final class C28553A extends Lambda implements Function1<Unit, Boolean> {

        /* renamed from: g */
        public static final C28553A f110037g = new C28553A();

        public C28553A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: tC3$A0 */
    /* loaded from: classes3.dex */
    public static final class C28554A0<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C28554A0<T1, T2, R> f110038a = new C28554A0<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "lock", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$B */
    /* loaded from: classes3.dex */
    public static final class C28555B extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends Pair<? extends Bird, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$B$a */
        /* loaded from: classes3.dex */
        public static final class C28556a extends Lambda implements Function1<Bird, Pair<? extends Bird, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ Boolean f110040g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28556a(Boolean bool) {
                super(1);
                this.f110040g = bool;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Bird, Boolean> invoke(Bird bird) {
                Intrinsics.checkNotNullParameter(bird, "bird");
                return TuplesKt.m28425to(bird, this.f110040g);
            }
        }

        public C28555B() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<Bird, Boolean>> invoke(Boolean lock) {
            Intrinsics.checkNotNullParameter(lock, "lock");
            AbstractC23442F<Bird> firstOrError = C49101tC3.this.m12872H0().firstOrError();
            final C28556a c28556a = new C28556a(lock);
            return firstOrError.m33157I(new InterfaceC23492o() { // from class: BC3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C49101tC3.C28555B.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$C */
    /* loaded from: classes3.dex */
    public static final class C28557C extends Lambda implements Function1<Pair<? extends Bird, ? extends Boolean>, Unit> {
        public C28557C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends Boolean> pair) {
            invoke2((Pair<Bird, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, Boolean> pair) {
            Bird bird = pair.component1();
            Boolean lock = pair.component2();
            InterfaceC1880Ea m12876G0 = C49101tC3.this.m12876G0();
            Intrinsics.checkNotNullExpressionValue(lock, "lock");
            EnumC39894dg6 enumC39894dg6 = lock.booleanValue() ? EnumC39894dg6.LOCK : EnumC39894dg6.UNLOCK;
            EnumC40486eg6 enumC40486eg6 = EnumC40486eg6.MY_BIRD;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            m12876G0.mo55905y(C41079fg6.m41039a(enumC39894dg6, enumC40486eg6, bird));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$D */
    /* loaded from: classes3.dex */
    public static final class C28558D extends Lambda implements Function1<Pair<? extends Bird, ? extends Boolean>, InterfaceC23447K<? extends Bird>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: tC3$D$a */
        /* loaded from: classes3.dex */
        public static final class C28559a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C49101tC3 f110043g;

            /* renamed from: h */
            public final /* synthetic */ Boolean f110044h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28559a(C49101tC3 c49101tC3, Boolean bool) {
                super(1);
                this.f110043g = c49101tC3;
                this.f110044h = bool;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable throwable) {
                C49101tC3 c49101tC3 = this.f110043g;
                Intrinsics.checkNotNullExpressionValue(throwable, "throwable");
                Boolean lock = this.f110044h;
                Intrinsics.checkNotNullExpressionValue(lock, "lock");
                c49101tC3.m12713z2(throwable, lock.booleanValue());
            }
        }

        public C28558D() {
            super(1);
        }

        /* renamed from: d */
        public static final Bird m12704d(Bird bird, Boolean lock) {
            Bird copy;
            Intrinsics.checkNotNullParameter(bird, "$bird");
            Intrinsics.checkNotNullParameter(lock, "$lock");
            copy = bird.copy((r88 & 1) != 0 ? bird.f66670id : null, (r88 & 2) != 0 ? bird.model : null, (r88 & 4) != 0 ? bird.taskId : null, (r88 & 8) != 0 ? bird.batteryLevel : 0, (r88 & 16) != 0 ? bird.estimatedRange : null, (r88 & 32) != 0 ? bird.distance : 0, (r88 & 64) != 0 ? bird.location : null, (r88 & 128) != 0 ? bird.code : null, (r88 & 256) != 0 ? bird.stickerId : null, (r88 & 512) != 0 ? bird.serialNumber : null, (r88 & 1024) != 0 ? bird.disconnected : false, (r88 & 2048) != 0 ? bird.collect : false, (r88 & 4096) != 0 ? bird.submerged : false, (r88 & 8192) != 0 ? bird.lost : false, (r88 & 16384) != 0 ? bird.locked : lock.booleanValue(), (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r88 & 65536) != 0 ? bird.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r88 & 524288) != 0 ? bird.label : null, (r88 & 1048576) != 0 ? bird.actions : null, (r88 & 2097152) != 0 ? bird.bountyId : null, (r88 & 4194304) != 0 ? bird.bountyPrice : null, (r88 & 8388608) != 0 ? bird.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r88 & 33554432) != 0 ? bird.bountyOverdue : false, (r88 & 67108864) != 0 ? bird.bountyKind : null, (r88 & 134217728) != 0 ? bird.brandName : null, (r88 & 268435456) != 0 ? bird.taskKind : null, (r88 & 536870912) != 0 ? bird.gpsAt : null, (r88 & 1073741824) != 0 ? bird.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r89 & 1) != 0 ? bird.bluetooth : false, (r89 & 2) != 0 ? bird.cellular : false, (r89 & 4) != 0 ? bird.startedAt : null, (r89 & 8) != 0 ? bird.dueAt : null, (r89 & 16) != 0 ? bird.asleep : false, (r89 & 32) != 0 ? bird.imei : null, (r89 & 64) != 0 ? bird.boardProtocol : null, (r89 & 128) != 0 ? bird.physicalLock : null, (r89 & 256) != 0 ? bird.physicalLocks : null, (r89 & 512) != 0 ? bird.priorityCollect : false, (r89 & 1024) != 0 ? bird.down : false, (r89 & 2048) != 0 ? bird.needsInspection : false, (r89 & 4096) != 0 ? bird.partnerId : null, (r89 & 8192) != 0 ? bird.nestId : null, (r89 & 16384) != 0 ? bird.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.partnerBirdState : null, (r89 & 65536) != 0 ? bird.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.lifecycle : null, (r89 & 524288) != 0 ? bird.offline : false, (r89 & 1048576) != 0 ? bird.license : null, (r89 & 2097152) != 0 ? bird.areaKey : null, (r89 & 4194304) != 0 ? bird.nestPurpose : null, (r89 & 8388608) != 0 ? bird.privateBird : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r89 & 33554432) != 0 ? bird.badgeType : null, (r89 & 67108864) != 0 ? bird.bountyReasons : null, (r89 & 134217728) != 0 ? bird.ephemeralId : null, (r89 & 268435456) != 0 ? bird.bleMacAddress : null, (r89 & 536870912) != 0 ? bird.hasHelmet : null, (r89 & 1073741824) != 0 ? bird.locationUpdatedAt : null);
            return copy;
        }

        /* renamed from: e */
        public static final void m12703e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Bird> invoke(Pair<Bird, Boolean> pair) {
            AbstractC23461c mo15669q;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            final Bird bird = pair.component1();
            final Boolean lock = pair.component2();
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            if (!Bird_Kt.isES500(bird) && !Bird_Kt.isBirdBikePairable(bird)) {
                InterfaceC20792gH m12869I0 = C49101tC3.this.m12869I0();
                String id = bird.getId();
                Intrinsics.checkNotNullExpressionValue(lock, "lock");
                mo15669q = m12869I0.mo39767e(id, lock.booleanValue());
            } else if (lock.booleanValue()) {
                mo15669q = C49101tC3.this.m12836T0().mo15660z(C49101tC3.this.m12874G2(bird));
            } else {
                mo15669q = C49101tC3.this.m12836T0().mo15669q(C49101tC3.this.m12874G2(bird));
            }
            AbstractC23442F m33048i0 = mo15669q.m33063X(C24542a.m31932c()).m33048i0(new Callable() { // from class: CC3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bird m12704d;
                    m12704d = C49101tC3.C28558D.m12704d(Bird.this, lock);
                    return m12704d;
                }
            });
            final C28559a c28559a = new C28559a(C49101tC3.this, lock);
            return m33048i0.m33106t(new InterfaceC23484g() { // from class: DC3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49101tC3.C28558D.m12703e(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$E */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28560E extends FunctionReferenceImpl implements Function1<Bird, Unit> {
        public C28560E(Object obj) {
            super(1, obj, C49101tC3.class, "onToggleLockSuccess", "onToggleLockSuccess(Lco/bird/android/model/persistence/Bird;)V", 0);
        }

        /* renamed from: a */
        public final void m12702a(Bird p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C49101tC3) this.receiver).m12890C2(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m12702a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$F */
    /* loaded from: classes3.dex */
    public static final class C28561F extends Lambda implements Function1<Bird, Unit> {

        /* renamed from: g */
        public static final C28561F f110045g = new C28561F();

        public C28561F() {
            super(1);
        }

        /* renamed from: a */
        public final void m12701a(Bird bird) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m12701a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$G */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28562G extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C28562G(Object obj) {
            super(1, obj, C41318g46.AbstractC20723b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ((C41318g46.AbstractC20723b) this.receiver).mo7224f(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$H */
    /* loaded from: classes3.dex */
    public static final class C28563H extends Lambda implements Function1<Pair<? extends Unit, ? extends Unit>, Unit> {
        public C28563H() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Unit> pair) {
            invoke2((Pair<Unit, Unit>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Unit> pair) {
            C49101tC3.this.m12827W0().m81863Ul(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/Bird;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$I */
    /* loaded from: classes3.dex */
    public static final class C28564I extends Lambda implements Function1<Pair<? extends Unit, ? extends Unit>, InterfaceC23447K<? extends Bird>> {
        public C28564I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Bird> invoke(Pair<Unit, Unit> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C49101tC3.this.m12872H0().firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$J */
    /* loaded from: classes3.dex */
    public static final class C28565J extends Lambda implements Function1<Bird, Unit> {
        public C28565J() {
            super(1);
        }

        /* renamed from: a */
        public final void m12699a(Bird bird) {
            InterfaceC1880Ea m12876G0 = C49101tC3.this.m12876G0();
            EnumC39894dg6 enumC39894dg6 = EnumC39894dg6.PAIR;
            EnumC40486eg6 enumC40486eg6 = EnumC40486eg6.MY_BIRD;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            m12876G0.mo55905y(C41079fg6.m41039a(enumC39894dg6, enumC40486eg6, bird));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m12699a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/api/response/WireBirdActionPairResponse;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$K */
    /* loaded from: classes3.dex */
    public static final class C28566K extends Lambda implements Function1<Bird, InterfaceC23447K<? extends Pair<? extends Bird, ? extends WireBirdActionPairResponse>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/WireBirdActionPairResponse;", "it", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireBirdActionPairResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$K$a */
        /* loaded from: classes3.dex */
        public static final class C28567a extends Lambda implements Function1<WireBirdActionPairResponse, Pair<? extends Bird, ? extends WireBirdActionPairResponse>> {

            /* renamed from: g */
            public final /* synthetic */ Bird f110050g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28567a(Bird bird) {
                super(1);
                this.f110050g = bird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Bird, WireBirdActionPairResponse> invoke(WireBirdActionPairResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f110050g, it);
            }
        }

        public C28566K() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<Bird, WireBirdActionPairResponse>> invoke(Bird bird) {
            Map plus;
            Intrinsics.checkNotNullParameter(bird, "bird");
            plus = MapsKt__MapsKt.plus(C0613BT.m114032a(bird), C49101tC3.this.f110034v);
            C49101tC3.this.f110034v.clear();
            AbstractC23442F m33142Y = InterfaceC47256q54.C27488a.pair$default(C49101tC3.this.m12845Q0(), null, plus, 1, null).m33142Y(C24542a.m31932c());
            Intrinsics.checkNotNullExpressionValue(m33142Y, "privateBirdsManager.pair…scribeOn(Schedulers.io())");
            AbstractC23442F progress$default = C28237sD.progress$default(m33142Y, C49101tC3.this.m12827W0(), 0, 2, (Object) null);
            final C28567a c28567a = new C28567a(bird);
            return progress$default.m33157I(new InterfaceC23492o() { // from class: EC3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C49101tC3.C28566K.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a>\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b \u0002*\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00070\u00072.\u0010\u0006\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lwb4;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/BirdActionsAndSettings;", "Lco/bird/android/model/persistence/VehicleVersion;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "LH6;", C17296a.f69688o, "(Lwb4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$L */
    /* loaded from: classes3.dex */
    public static final class C28568L extends Lambda implements Function1<C51106wb4<? extends Bird, ? extends String, ? extends BirdActionsAndSettings, ? extends VehicleVersion>, Pair<? extends Bird, ? extends List<? extends C3023H6>>> {
        public C28568L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<Bird, List<C3023H6>> invoke(C51106wb4<Bird, String, BirdActionsAndSettings, VehicleVersion> c51106wb4) {
            String str;
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            Bird bird = c51106wb4.m6614a();
            String m6613b = c51106wb4.m6613b();
            BirdActionsAndSettings actionSettings = c51106wb4.m6612c();
            VehicleVersion vehicleVersion = c51106wb4.m6611d();
            boolean mo18202l = C49101tC3.this.m12845Q0().mo18202l(bird.getId());
            C41318g46.AbstractC20723b m12854N0 = C49101tC3.this.m12854N0();
            if (mo18202l) {
                str = "Showing";
            } else {
                str = "Hiding";
            }
            m12854N0.mo7221o(str + " the unpair button.", new Object[0]);
            C49101tC3 c49101tC3 = C49101tC3.this;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            Intrinsics.checkNotNullExpressionValue(vehicleVersion, "vehicleVersion");
            c49101tC3.m12806c1(bird, vehicleVersion);
            OA3 m12857M0 = C49101tC3.this.m12857M0();
            Intrinsics.checkNotNullExpressionValue(actionSettings, "actionSettings");
            return TuplesKt.m28425to(bird, m12857M0.m92686a(bird, vehicleVersion, actionSettings, m6613b));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$M */
    /* loaded from: classes3.dex */
    public static final class C28569M extends Lambda implements Function1<Throwable, Unit> {
        public C28569M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C49101tC3.this.m12827W0().error(C45871nl4.error_generic_body);
            C49101tC3.this.m12827W0().m81863Ul(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/api/response/WireBirdActionPairResponse;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "e", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$N */
    /* loaded from: classes3.dex */
    public static final class C28570N extends Lambda implements Function1<Pair<? extends Bird, ? extends WireBirdActionPairResponse>, InterfaceC23447K<? extends WireBirdActionPairResponse>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lco/bird/api/response/WireBirdActionPairResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lco/bird/api/response/WireBirdActionPairResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$N$a */
        /* loaded from: classes3.dex */
        public static final class C28571a extends Lambda implements Function1<DialogResponse, WireBirdActionPairResponse> {

            /* renamed from: g */
            public final /* synthetic */ WireBirdActionPairResponse f110054g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28571a(WireBirdActionPairResponse wireBirdActionPairResponse) {
                super(1);
                this.f110054g = wireBirdActionPairResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WireBirdActionPairResponse invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f110054g;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireBirdActionPairResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/WireBirdActionPairResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$N$b */
        /* loaded from: classes3.dex */
        public static final class C28572b extends Lambda implements Function1<WireBirdActionPairResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C49101tC3 f110055g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28572b(C49101tC3 c49101tC3) {
                super(1);
                this.f110055g = c49101tC3;
            }

            /* renamed from: a */
            public final void m12684a(WireBirdActionPairResponse wireBirdActionPairResponse) {
                this.f110055g.m12827W0().m81850gm();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireBirdActionPairResponse wireBirdActionPairResponse) {
                m12684a(wireBirdActionPairResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lco/bird/api/response/WireBirdActionPairResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lco/bird/api/response/WireBirdActionPairResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$N$c */
        /* loaded from: classes3.dex */
        public static final class C28573c extends Lambda implements Function1<DialogResponse, WireBirdActionPairResponse> {

            /* renamed from: g */
            public final /* synthetic */ WireBirdActionPairResponse f110056g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28573c(WireBirdActionPairResponse wireBirdActionPairResponse) {
                super(1);
                this.f110056g = wireBirdActionPairResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WireBirdActionPairResponse invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f110056g;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LH31$b;", "dialogResponse", "Lio/reactivex/K;", "Lco/bird/api/response/WireBirdActionPairResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LH31$b;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$N$d */
        /* loaded from: classes3.dex */
        public static final class C28574d extends Lambda implements Function1<H31.AbstractC3016b, InterfaceC23447K<? extends WireBirdActionPairResponse>> {

            /* renamed from: g */
            public final /* synthetic */ C49101tC3 f110057g;

            /* renamed from: h */
            public final /* synthetic */ WireBirdActionPairResponse f110058h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28574d(C49101tC3 c49101tC3, WireBirdActionPairResponse wireBirdActionPairResponse) {
                super(1);
                this.f110057g = c49101tC3;
                this.f110058h = wireBirdActionPairResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends WireBirdActionPairResponse> invoke(H31.AbstractC3016b dialogResponse) {
                Intrinsics.checkNotNullParameter(dialogResponse, "dialogResponse");
                if (dialogResponse instanceof H31.AbstractC3016b.C3019c) {
                    this.f110057g.f110034v.put(PartKind.CHASSIS, ((H31.AbstractC3016b.C3019c) dialogResponse).m104470b());
                    this.f110057g.f110033u.accept(Unit.INSTANCE);
                    return AbstractC23442F.m33158H(this.f110058h);
                }
                return AbstractC23442F.m33158H(this.f110058h);
            }
        }

        public C28570N() {
            super(1);
        }

        /* renamed from: f */
        public static final WireBirdActionPairResponse m12689f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WireBirdActionPairResponse) tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final void m12688g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static final WireBirdActionPairResponse m12687h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WireBirdActionPairResponse) tmp0.invoke(obj);
        }

        /* renamed from: i */
        public static final InterfaceC23447K m12686i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final InterfaceC23447K<? extends WireBirdActionPairResponse> invoke(Pair<Bird, WireBirdActionPairResponse> pair) {
            Map mutableMap;
            Set set;
            Set minus;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Bird initialBird = pair.component1();
            WireBirdActionPairResponse component2 = pair.component2();
            WireBird bird = component2.getBird();
            Integer timeRemainingSeconds = component2.getTimeRemainingSeconds();
            List<PartKind> requiredPartKinds = component2.getRequiredPartKinds();
            if (bird != null) {
                AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(C49101tC3.this.m12827W0(), C49712uE3.f112000d, false, false, 6, null);
                final C28571a c28571a = new C28571a(component2);
                AbstractC23442F m33157I = birdDialog$default.m33157I(new InterfaceC23492o() { // from class: FC3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        WireBirdActionPairResponse m12689f;
                        m12689f = C49101tC3.C28570N.m12689f(Function1.this, obj);
                        return m12689f;
                    }
                });
                final C28572b c28572b = new C28572b(C49101tC3.this);
                return m33157I.m33101w(new InterfaceC23484g() { // from class: GC3
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C49101tC3.C28570N.m12688g(Function1.this, obj);
                    }
                });
            } else if (timeRemainingSeconds != null) {
                C49101tC3.this.m12848P0().mo42695f(C49101tC3.this.m12827W0().getString(C45871nl4.app_name, new Object[0]), C49101tC3.this.m12827W0().getString(C45871nl4.pairing_completed_push_content, new Object[0]), 123483, timeRemainingSeconds.intValue() * 1000);
                AbstractC23442F birdDialog$default2 = H31.C3014a.birdDialog$default(C49101tC3.this.m12827W0(), C50304vE3.f113723d, false, false, 6, null);
                final C28573c c28573c = new C28573c(component2);
                return birdDialog$default2.m33157I(new InterfaceC23492o() { // from class: HC3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        WireBirdActionPairResponse m12687h;
                        m12687h = C49101tC3.C28570N.m12687h(Function1.this, obj);
                        return m12687h;
                    }
                });
            } else if (requiredPartKinds != null) {
                Intrinsics.checkNotNullExpressionValue(initialBird, "initialBird");
                mutableMap = MapsKt__MapsKt.toMutableMap(C0613BT.m114032a(initialBird));
                set = CollectionsKt___CollectionsKt.toSet(requiredPartKinds);
                minus = SetsKt___SetsKt.minus(set, (Iterable) mutableMap.keySet());
                if (Intrinsics.areEqual(initialBird.getModel(), Bird_Kt.MODEL_BIRD_BIKE_UNPAIRED) && minus.contains(PartKind.CHASSIS)) {
                    AbstractC23442F dialogWithInput$default = H31.C3014a.dialogWithInput$default(C49101tC3.this.m12827W0(), C49101tC3.this.m12827W0().getString(C45871nl4.pairing_in_progress_title, new Object[0]), C49101tC3.this.m12827W0().getString(C45871nl4.pairing_hje_chassis_instruction, new Object[0]), "", "", null, C49101tC3.this.m12827W0().getString(C45871nl4.general_done, new Object[0]), C49101tC3.this.m12827W0().getString(C45871nl4.dialog_id_tools_confirm_cancel, new Object[0]), false, false, true, 16, null);
                    final C28574d c28574d = new C28574d(C49101tC3.this, component2);
                    return dialogWithInput$default.m33165A(new InterfaceC23492o() { // from class: IC3
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23447K m12686i;
                            m12686i = C49101tC3.C28570N.m12686i(Function1.this, obj);
                            return m12686i;
                        }
                    });
                }
                return AbstractC23442F.m33158H(component2);
            } else {
                return AbstractC23442F.m33158H(component2);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireBirdActionPairResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/WireBirdActionPairResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$O */
    /* loaded from: classes3.dex */
    public static final class C28575O extends Lambda implements Function1<WireBirdActionPairResponse, Unit> {
        public C28575O() {
            super(1);
        }

        /* renamed from: a */
        public final void m12681a(WireBirdActionPairResponse wireBirdActionPairResponse) {
            C49101tC3.this.m12827W0().m81863Ul(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBirdActionPairResponse wireBirdActionPairResponse) {
            m12681a(wireBirdActionPairResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$P */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28576P extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C28576P(Object obj) {
            super(1, obj, C41318g46.AbstractC20723b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ((C41318g46.AbstractC20723b) this.receiver).mo7224f(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$Q */
    /* loaded from: classes3.dex */
    public static final class C28577Q extends Lambda implements Function1<Unit, Unit> {
        public C28577Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C49101tC3.this.m12827W0().m81863Ul(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$R */
    /* loaded from: classes3.dex */
    public static final class C28578R extends Lambda implements Function1<Unit, InterfaceC23447K<? extends DialogResponse>> {
        public C28578R() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DialogResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C49101tC3.this.m12827W0().m81870Im();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$S */
    /* loaded from: classes3.dex */
    public static final class C28579S extends Lambda implements Function1<DialogResponse, Unit> {
        public C28579S() {
            super(1);
        }

        /* renamed from: a */
        public final void m12680a(DialogResponse dialogResponse) {
            if (dialogResponse != DialogResponse.OK) {
                C49101tC3.this.m12827W0().m81863Ul(true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m12680a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$T */
    /* loaded from: classes3.dex */
    public static final class C28580T extends Lambda implements Function1<DialogResponse, Boolean> {

        /* renamed from: g */
        public static final C28580T f110063g = new C28580T();

        public C28580T() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(DialogResponse it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == DialogResponse.OK) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$U */
    /* loaded from: classes3.dex */
    public static final class C28581U extends Lambda implements Function1<DialogResponse, InterfaceC23447K<? extends Bird>> {
        public C28581U() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Bird> invoke(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C49101tC3.this.m12872H0().firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$V */
    /* loaded from: classes3.dex */
    public static final class C28582V extends Lambda implements Function1<Bird, Unit> {
        public C28582V() {
            super(1);
        }

        /* renamed from: a */
        public final void m12677a(Bird bird) {
            InterfaceC1880Ea m12876G0 = C49101tC3.this.m12876G0();
            EnumC39894dg6 enumC39894dg6 = EnumC39894dg6.UNPAIR;
            EnumC40486eg6 enumC40486eg6 = EnumC40486eg6.MY_BIRD;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            m12876G0.mo55905y(C41079fg6.m41039a(enumC39894dg6, enumC40486eg6, bird));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m12677a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062B\u0010\u0005\u001a>\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0002*\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "", "LH6;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$W */
    /* loaded from: classes3.dex */
    public static final class C28583W extends Lambda implements Function1<Pair<? extends Bird, ? extends List<? extends C3023H6>>, Unit> {
        public C28583W() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends List<? extends C3023H6>> pair) {
            invoke2((Pair<Bird, ? extends List<C3023H6>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, ? extends List<C3023H6>> pair) {
            OwnershipKind ownershipKind;
            Bird component1 = pair.component1();
            boolean m81854cm = C49101tC3.this.m12827W0().m81854cm();
            InterfaceC1880Ea m12876G0 = C49101tC3.this.m12876G0();
            String id = component1.getId();
            PrivateBird privateBird = component1.getPrivateBird();
            m12876G0.mo55905y(new C44884m54(null, null, null, id, (privateBird == null || (ownershipKind = privateBird.getOwnershipKind()) == null || (r1 = ownershipKind.toString()) == null) ? "" : "", component1.getDistance(), C49101tC3.this.m12857M0().m92685b(Integer.valueOf(component1.getDistance())), m81854cm, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$X */
    /* loaded from: classes3.dex */
    public static final class C28584X extends Lambda implements Function1<Bird, InterfaceC23496h> {
        public C28584X() {
            super(1);
        }

        /* renamed from: c */
        public static final void m12674c(C49101tC3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f110030r.accept(Boolean.TRUE);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            AbstractC23461c m33063X = C49101tC3.this.m12845Q0().mo18210d(bird.getId()).m33063X(C24542a.m31932c());
            Intrinsics.checkNotNullExpressionValue(m33063X, "privateBirdsManager.unpa…scribeOn(Schedulers.io())");
            AbstractC23461c progress$default = C28237sD.progress$default(m33063X, C49101tC3.this.m12827W0(), 0, 2, (Object) null);
            final C49101tC3 c49101tC3 = C49101tC3.this;
            return progress$default.m33029z(new InterfaceC23478a() { // from class: JC3
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C49101tC3.C28584X.m12674c(C49101tC3.this);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$Y */
    /* loaded from: classes3.dex */
    public static final class C28585Y extends Lambda implements Function1<Throwable, Unit> {
        public C28585Y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C49101tC3.this.m12827W0().error(C45871nl4.error_generic_body);
            C49101tC3.this.m12827W0().m81863Ul(true);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$Z */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28586Z extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C28586Z(Object obj) {
            super(1, obj, C41318g46.AbstractC20723b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ((C41318g46.AbstractC20723b) this.receiver).mo7224f(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LtC3$a;", "", "", "PAIR_TIME_REMAINING_NOTIFICATION_ID", "I", "<init>", "()V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: tC3$a */
    /* loaded from: classes3.dex */
    public static final class C28587a {
        public /* synthetic */ C28587a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28587a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$a0 */
    /* loaded from: classes3.dex */
    public static final class C28588a0 extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Bird>> {
        public C28588a0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Bird> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C49101tC3.this.m12872H0().firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"LtC3$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: tC3$b */
    /* loaded from: classes3.dex */
    public enum EnumC28589b {
        TRIP_ODOMETER,
        TOTAL_ODOMETER,
        SERVICE_INDICATOR
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$b0 */
    /* loaded from: classes3.dex */
    public static final class C28590b0 extends Lambda implements Function1<WireBird, Unit> {
        public C28590b0() {
            super(1);
        }

        /* renamed from: a */
        public final void m12672a(WireBird wireBird) {
            C49101tC3.this.m12827W0().m81863Ul(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m12672a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$c */
    /* loaded from: classes3.dex */
    public static final class C28591c extends Lambda implements Function1<Bird, Boolean> {

        /* renamed from: g */
        public static final C28591c f110075g = new C28591c();

        public C28591c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            return Boolean.valueOf(bird.getLocked());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "wireBird", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$c0 */
    /* loaded from: classes3.dex */
    public static final class C28592c0 extends Lambda implements Function1<WireBird, InterfaceC24574u<? extends WireBird>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$c0$a */
        /* loaded from: classes3.dex */
        public static final class C28593a extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C49101tC3 f110077g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28593a(C49101tC3 c49101tC3) {
                super(1);
                this.f110077g = c49101tC3;
            }

            /* renamed from: a */
            public final void m12664a(DialogResponse dialogResponse) {
                if (dialogResponse != DialogResponse.OK) {
                    this.f110077g.m12827W0().m81863Ul(true);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m12664a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$c0$b */
        /* loaded from: classes3.dex */
        public static final class C28594b extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C28594b f110078g = new C28594b();

            public C28594b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(DialogResponse response) {
                boolean z;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$c0$c */
        /* loaded from: classes3.dex */
        public static final class C28595c extends Lambda implements Function1<DialogResponse, WireBird> {

            /* renamed from: g */
            public final /* synthetic */ WireBird f110079g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28595c(WireBird wireBird) {
                super(1);
                this.f110079g = wireBird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WireBird invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f110079g;
            }
        }

        public C28592c0() {
            super(1);
        }

        /* renamed from: e */
        public static final boolean m12666e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* renamed from: f */
        public static final WireBird m12665f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WireBird) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC24574u<? extends WireBird> invoke(WireBird wireBird) {
            Intrinsics.checkNotNullParameter(wireBird, "wireBird");
            if (WireBirdKt.isAsleep(wireBird)) {
                return AbstractC24507p.m32068G(wireBird);
            }
            AbstractC23442F<DialogResponse> m81831zm = C49101tC3.this.m12827W0().m81831zm();
            final C28593a c28593a = new C28593a(C49101tC3.this);
            AbstractC23442F<DialogResponse> m33101w = m81831zm.m33101w(new InterfaceC23484g() { // from class: KC3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49101tC3.C28592c0.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C28594b c28594b = C28594b.f110078g;
            AbstractC24507p<DialogResponse> m33098z = m33101w.m33098z(new InterfaceC23494q() { // from class: LC3
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m12666e;
                    m12666e = C49101tC3.C28592c0.m12666e(Function1.this, obj);
                    return m12666e;
                }
            });
            final C28595c c28595c = new C28595c(wireBird);
            return m33098z.m32067H(new InterfaceC23492o() { // from class: MC3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WireBird m12665f;
                    m12665f = C49101tC3.C28592c0.m12665f(Function1.this, obj);
                    return m12665f;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "wireBird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$d0 */
    /* loaded from: classes3.dex */
    public static final class C28598d0 extends Lambda implements Function1<WireBird, Unit> {
        public C28598d0() {
            super(1);
        }

        /* renamed from: a */
        public final void m12658a(WireBird wireBird) {
            EnumC39894dg6 enumC39894dg6;
            InterfaceC1880Ea m12876G0 = C49101tC3.this.m12876G0();
            Intrinsics.checkNotNullExpressionValue(wireBird, "wireBird");
            if (WireBirdKt.isAsleep(wireBird)) {
                enumC39894dg6 = EnumC39894dg6.WAKE;
            } else {
                enumC39894dg6 = EnumC39894dg6.SLEEP;
            }
            m12876G0.mo55905y(C41079fg6.m41038b(enumC39894dg6, EnumC40486eg6.MY_BIRD, wireBird));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m12658a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/B;", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$e */
    /* loaded from: classes3.dex */
    public static final class C28599e extends Lambda implements Function1<Observable<T>, InterfaceC23434B<T>> {

        /* renamed from: g */
        public final /* synthetic */ Observable<T> f110084g;

        /* renamed from: h */
        public final /* synthetic */ C49101tC3 f110085h;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "item", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Object;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$e$a */
        /* loaded from: classes3.dex */
        public static final class C28600a extends Lambda implements Function1<T, InterfaceC24574u<? extends T>> {

            /* renamed from: g */
            public final /* synthetic */ C49101tC3 f110086g;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: tC3$e$a$a */
            /* loaded from: classes3.dex */
            public static final class C28601a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends T>> {

                /* renamed from: g */
                public final /* synthetic */ T f110087g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C28601a(T t) {
                    super(1);
                    this.f110087g = t;
                }

                /* renamed from: a */
                public final InterfaceC24574u<? extends T> m12652a(DialogResponse it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (it == DialogResponse.OK) {
                        return AbstractC24507p.m32068G(this.f110087g);
                    }
                    return AbstractC24507p.m32024u();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(DialogResponse dialogResponse) {
                    return m12652a(dialogResponse);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28600a(C49101tC3 c49101tC3) {
                super(1);
                this.f110086g = c49101tC3;
            }

            /* renamed from: c */
            public static final InterfaceC24574u m12653c(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC24574u) tmp0.invoke(obj);
            }

            /* renamed from: b */
            public final InterfaceC24574u<? extends T> m12654b(T t) {
                AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(this.f110086g.m12827W0(), C46126oB1.f101577d, true, false, 4, null);
                final C28601a c28601a = new C28601a(t);
                return birdDialog$default.m33163C(new InterfaceC23492o() { // from class: wC3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m12653c;
                        m12653c = C49101tC3.C28599e.C28600a.m12653c(Function1.this, obj);
                        return m12653c;
                    }
                });
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m12654b(obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28599e(Observable<T> observable, C49101tC3 c49101tC3) {
            super(1);
            this.f110084g = observable;
            this.f110085h = c49101tC3;
        }

        /* renamed from: b */
        public static final InterfaceC24574u m12656b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Observable) obj);
        }

        public final InterfaceC23434B<T> invoke(Observable<T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Observable<T> observable = this.f110084g;
            final C28600a c28600a = new C28600a(this.f110085h);
            return observable.flatMapMaybe(new InterfaceC23492o() { // from class: vC3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m12656b;
                    m12656b = C49101tC3.C28599e.m12656b(Function1.this, obj);
                    return m12656b;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "wireBird", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$e0 */
    /* loaded from: classes3.dex */
    public static final class C28602e0 extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110088g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28602e0(C49101tC3 c49101tC3) {
            super(1);
            this.f110088g = c49101tC3;
        }

        /* renamed from: a */
        public final InterfaceC23447K<? extends WireBird> m12651a(WireBird wireBird) {
            BrainState brainState;
            WireBird copy;
            Intrinsics.checkNotNullParameter(wireBird, "wireBird");
            AbstractC23461c m33063X = this.f110088g.m12869I0().mo39769c(wireBird.getId(), wireBird.getModel(), !WireBirdKt.isAsleep(wireBird)).m33063X(C24542a.m31932c());
            WireLifecycle lifecycle = wireBird.getLifecycle();
            if (WireBirdKt.isAsleep(wireBird)) {
                brainState = BrainState.AVAILABLE;
            } else {
                brainState = BrainState.ASLEEP;
            }
            copy = wireBird.copy((r91 & 1) != 0 ? wireBird.f66717id : null, (r91 & 2) != 0 ? wireBird.model : null, (r91 & 4) != 0 ? wireBird.taskId : null, (r91 & 8) != 0 ? wireBird.batteryLevel : 0, (r91 & 16) != 0 ? wireBird.estimatedRange : null, (r91 & 32) != 0 ? wireBird.distance : 0, (r91 & 64) != 0 ? wireBird.location : null, (r91 & 128) != 0 ? wireBird.code : null, (r91 & 256) != 0 ? wireBird.stickerId : null, (r91 & 512) != 0 ? wireBird.serialNumber : null, (r91 & 1024) != 0 ? wireBird.disconnected : false, (r91 & 2048) != 0 ? wireBird.collect : false, (r91 & 4096) != 0 ? wireBird.submerged : false, (r91 & 8192) != 0 ? wireBird.lost : false, (r91 & 16384) != 0 ? wireBird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird.ackLocked : false, (r91 & 65536) != 0 ? wireBird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird.broken : false, (r91 & 524288) != 0 ? wireBird.label : null, (r91 & 1048576) != 0 ? wireBird.actions : null, (r91 & 2097152) != 0 ? wireBird.bountyId : null, (r91 & 4194304) != 0 ? wireBird.bountyPrice : null, (r91 & 8388608) != 0 ? wireBird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird.bountyLost : false, (r91 & 33554432) != 0 ? wireBird.bountyOverdue : false, (r91 & 67108864) != 0 ? wireBird.bountyKind : null, (r91 & 134217728) != 0 ? wireBird.brandName : null, (r91 & 268435456) != 0 ? wireBird.taskKind : null, (r91 & 536870912) != 0 ? wireBird.gpsAt : null, (r91 & 1073741824) != 0 ? wireBird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? wireBird.token : null, (r92 & 1) != 0 ? wireBird.bluetooth : false, (r92 & 2) != 0 ? wireBird.cellular : false, (r92 & 4) != 0 ? wireBird.startedAt : null, (r92 & 8) != 0 ? wireBird.dueAt : null, (r92 & 16) != 0 ? wireBird.asleep : !WireBirdKt.isAsleep(wireBird), (r92 & 32) != 0 ? wireBird.imei : null, (r92 & 64) != 0 ? wireBird.boardProtocol : null, (r92 & 128) != 0 ? wireBird.physicalLock : null, (r92 & 256) != 0 ? wireBird.priorityCollect : false, (r92 & 512) != 0 ? wireBird.down : false, (r92 & 1024) != 0 ? wireBird.needsInspection : false, (r92 & 2048) != 0 ? wireBird.partnerId : null, (r92 & 4096) != 0 ? wireBird.nestId : null, (r92 & 8192) != 0 ? wireBird.lastRideEndedAt : null, (r92 & 16384) != 0 ? wireBird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird.peril : false, (r92 & 65536) != 0 ? wireBird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird.lifecycle : WireLifecycle.copy$default(lifecycle, null, null, brainState, null, 11, null), (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird.offline : false, (r92 & 524288) != 0 ? wireBird.license : null, (r92 & 1048576) != 0 ? wireBird.areaKey : null, (r92 & 2097152) != 0 ? wireBird.fleetId : null, (r92 & 4194304) != 0 ? wireBird.nestPurpose : null, (r92 & 8388608) != 0 ? wireBird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird.scannedAt : null, (r92 & 33554432) != 0 ? wireBird.badgeType : null, (r92 & 67108864) != 0 ? wireBird.bountyReasons : null, (r92 & 134217728) != 0 ? wireBird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? wireBird.ephemeralId : null, (r92 & 536870912) != 0 ? wireBird.hasHelmet : false, (r92 & 1073741824) != 0 ? wireBird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? wireBird.bleMacAddress : null, (r93 & 1) != 0 ? wireBird.cellId : null, (r93 & 2) != 0 ? wireBird.externalFeedType : null);
            return m33063X.m33042m(AbstractC23442F.m33158H(copy)).m33146T(3L);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23447K<? extends WireBird> invoke(WireBird wireBird) {
            return m12651a(wireBird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "wireBird", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/persistence/Bird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$f */
    /* loaded from: classes3.dex */
    public static final class C28603f extends Lambda implements Function1<WireBird, Bird> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110089g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28603f(C49101tC3 c49101tC3) {
            super(1);
            this.f110089g = c49101tC3;
        }

        /* renamed from: a */
        public final Bird m12650a(WireBird wireBird) {
            Intrinsics.checkNotNullParameter(wireBird, "wireBird");
            return this.f110089g.m12845Q0().mo18204j(wireBird);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Bird invoke(WireBird wireBird) {
            return m12650a(wireBird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$f0 */
    /* loaded from: classes3.dex */
    public static final class C28604f0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110090g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28604f0(C49101tC3 c49101tC3) {
            super(1);
            this.f110090g = c49101tC3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f110090g.m12827W0().m81863Ul(true);
            this.f110090g.m12827W0().error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$g */
    /* loaded from: classes3.dex */
    public static final class C28605g extends Lambda implements Function1<Bird, WireBird> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110091g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28605g(C49101tC3 c49101tC3) {
            super(1);
            this.f110091g = c49101tC3;
        }

        /* renamed from: a */
        public final WireBird m12649a(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            return this.f110091g.m12845Q0().mo18207g(bird);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ WireBird invoke(Bird bird) {
            return m12649a(bird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062B\u0010\u0005\u001a>\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0002*\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "", "LH6;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$g0 */
    /* loaded from: classes3.dex */
    public static final class C28606g0 extends Lambda implements Function1<Pair<? extends Bird, ? extends List<? extends C3023H6>>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110092g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28606g0(C49101tC3 c49101tC3) {
            super(1);
            this.f110092g = c49101tC3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends List<? extends C3023H6>> pair) {
            invoke2((Pair<Bird, ? extends List<C3023H6>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, ? extends List<C3023H6>> pair) {
            Bird bird = pair.component1();
            this.f110092g.m12827W0().m81856b(pair.component2());
            C49101tC3 c49101tC3 = this.f110092g;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            c49101tC3.mo12878F2(bird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: tC3$h */
    /* loaded from: classes3.dex */
    public static final class C28607h<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C28607h<T1, T2, R> f110093a = new C28607h<>();

        static {
        }

        public C28607h() {
        }

        /* renamed from: a */
        public final Pair<T1, T2> m12648a(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.InterfaceC23480c
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            return m12648a(obj, obj2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "updatedBird", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$h0 */
    /* loaded from: classes3.dex */
    public static final class C28608h0 extends Lambda implements Function1<Bird, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110094g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28608h0(C49101tC3 c49101tC3) {
            super(1);
            this.f110094g = c49101tC3;
        }

        /* renamed from: a */
        public final void m12647a(Bird updatedBird) {
            this.f110094g.m12827W0().m81863Ul(true);
            this.f110094g.m12872H0().accept(updatedBird);
            Intrinsics.checkNotNullExpressionValue(updatedBird, "updatedBird");
            if (!Bird_Kt.isAsleep(updatedBird)) {
                this.f110094g.m12827W0().m81841pm(30);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m12647a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "LtC3$b;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)LtC3$b;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$i */
    /* loaded from: classes3.dex */
    public static final class C28609i extends Lambda implements Function1<Unit, EnumC28589b> {

        /* renamed from: g */
        public static final C28609i f110095g = new C28609i();

        static {
        }

        public C28609i() {
            super(1);
        }

        /* renamed from: a */
        public final EnumC28589b m12646a(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return EnumC28589b.TOTAL_ODOMETER;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ EnumC28589b invoke(Unit unit) {
            return m12646a(unit);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$i0 */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28610i0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C28610i0(Object obj) {
            super(1, obj, C41318g46.AbstractC20723b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ((C41318g46.AbstractC20723b) this.receiver).mo7224f(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "LtC3$b;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)LtC3$b;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$j */
    /* loaded from: classes3.dex */
    public static final class C28611j extends Lambda implements Function1<Unit, EnumC28589b> {

        /* renamed from: g */
        public static final C28611j f110096g = new C28611j();

        static {
        }

        public C28611j() {
            super(1);
        }

        /* renamed from: a */
        public final EnumC28589b m12645a(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return EnumC28589b.SERVICE_INDICATOR;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ EnumC28589b invoke(Unit unit) {
            return m12645a(unit);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "enabled", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$j0 */
    /* loaded from: classes3.dex */
    public static final class C28612j0 extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends Pair<? extends Bird, ? extends Boolean>>> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110097g;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$j0$a */
        /* loaded from: classes3.dex */
        public static final class C28613a extends Lambda implements Function1<Bird, Pair<? extends Bird, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ Boolean f110098g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28613a(Boolean bool) {
                super(1);
                this.f110098g = bool;
            }

            /* renamed from: a */
            public final Pair<Bird, Boolean> m12642a(Bird bird) {
                Intrinsics.checkNotNullParameter(bird, "bird");
                return TuplesKt.m28425to(bird, this.f110098g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Pair<? extends Bird, ? extends Boolean> invoke(Bird bird) {
                return m12642a(bird);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28612j0(C49101tC3 c49101tC3) {
            super(1);
            this.f110097g = c49101tC3;
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<Bird, Boolean>> m12643b(Boolean enabled) {
            Intrinsics.checkNotNullParameter(enabled, "enabled");
            AbstractC23442F<Bird> firstOrError = this.f110097g.m12872H0().firstOrError();
            final C28613a c28613a = new C28613a(enabled);
            return firstOrError.m33157I(new InterfaceC23492o() { // from class: NC3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C49101tC3.C28612j0.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23447K<? extends Pair<? extends Bird, ? extends Boolean>> invoke(Boolean bool) {
            return m12643b(bool);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LtC3$b;", "command", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "b", "(LtC3$b;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$k */
    /* loaded from: classes3.dex */
    public static final class C28614k extends Lambda implements Function1<EnumC28589b, InterfaceC23447K<? extends Pair<? extends EnumC28589b, ? extends Bird>>> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110099g;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "it", "Lkotlin/Pair;", "LtC3$b;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$k$a */
        /* loaded from: classes3.dex */
        public static final class C28615a extends Lambda implements Function1<Bird, Pair<? extends EnumC28589b, ? extends Bird>> {

            /* renamed from: g */
            public final /* synthetic */ EnumC28589b f110100g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28615a(EnumC28589b enumC28589b) {
                super(1);
                this.f110100g = enumC28589b;
            }

            /* renamed from: a */
            public final Pair<EnumC28589b, Bird> m12639a(Bird it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f110100g, it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Pair<? extends EnumC28589b, ? extends Bird> invoke(Bird bird) {
                return m12639a(bird);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28614k(C49101tC3 c49101tC3) {
            super(1);
            this.f110099g = c49101tC3;
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<EnumC28589b, Bird>> m12640b(EnumC28589b command) {
            Intrinsics.checkNotNullParameter(command, "command");
            AbstractC23442F<Bird> firstOrError = this.f110099g.m12872H0().firstOrError();
            final C28615a c28615a = new C28615a(command);
            return firstOrError.m33157I(new InterfaceC23492o() { // from class: xC3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C49101tC3.C28614k.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23447K<? extends Pair<? extends EnumC28589b, ? extends Bird>> invoke(EnumC28589b enumC28589b) {
            return m12640b(enumC28589b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$k0 */
    /* loaded from: classes3.dex */
    public static final class C28616k0 extends Lambda implements Function1<Pair<? extends Bird, ? extends Boolean>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110101g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28616k0(C49101tC3 c49101tC3) {
            super(1);
            this.f110101g = c49101tC3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends Boolean> pair) {
            invoke2((Pair<Bird, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, Boolean> pair) {
            Bird bird = pair.component1();
            Boolean enabled = pair.component2();
            InterfaceC1880Ea m12876G0 = this.f110101g.m12876G0();
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            EnumC39894dg6 enumC39894dg6 = enabled.booleanValue() ? EnumC39894dg6.TAMPER_ON : EnumC39894dg6.TAMPER_OFF;
            EnumC40486eg6 enumC40486eg6 = EnumC40486eg6.MY_BIRD;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            m12876G0.mo55905y(C41079fg6.m41039a(enumC39894dg6, enumC40486eg6, bird));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$l0 */
    /* loaded from: classes3.dex */
    public static final class C28619l0 extends Lambda implements Function1<Pair<? extends Bird, ? extends Boolean>, InterfaceC23447K<? extends Bird>> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110103g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28619l0(C49101tC3 c49101tC3) {
            super(1);
            this.f110103g = c49101tC3;
        }

        /* renamed from: a */
        public final InterfaceC23447K<? extends Bird> m12638a(Pair<Bird, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Bird component1 = pair.component1();
            Boolean enabled = pair.component2();
            InterfaceC20792gH m12869I0 = this.f110103g.m12869I0();
            String id = component1.getId();
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            return m12869I0.mo39768d(id, new PrivateBirdSetting(enabled.booleanValue())).m33042m(AbstractC23442F.m33158H(component1));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23447K<? extends Bird> invoke(Pair<? extends Bird, ? extends Boolean> pair) {
            return m12638a(pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$m */
    /* loaded from: classes3.dex */
    public static final class C28620m extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110104g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28620m(C49101tC3 c49101tC3) {
            super(1);
            this.f110104g = c49101tC3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while clearing odometer or maintenance indicator", new Object[0]);
            this.f110104g.m12827W0().errorGeneric();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$m0 */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28621m0 extends FunctionReferenceImpl implements Function1<Bird, Unit> {
        public C28621m0(Object obj) {
            super(1, obj, C0058AG.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m12637a(Bird p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C0058AG) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m12637a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$n */
    /* loaded from: classes3.dex */
    public static final class C28622n extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Bird>> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110105g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28622n(C49101tC3 c49101tC3) {
            super(1);
            this.f110105g = c49101tC3;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23447K<? extends Bird> invoke2(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f110105g.m12872H0().firstOrError();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23447K<? extends Bird> invoke(Unit unit) {
            return invoke2(unit);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$n0 */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28623n0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C28623n0(Object obj) {
            super(1, obj, C41318g46.AbstractC20723b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ((C41318g46.AbstractC20723b) this.receiver).mo7224f(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "wireBird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$o */
    /* loaded from: classes3.dex */
    public static final class C28624o extends Lambda implements Function1<WireBird, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110106g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28624o(C49101tC3 c49101tC3) {
            super(1);
            this.f110106g = c49101tC3;
        }

        /* renamed from: a */
        public final void m12636a(WireBird wireBird) {
            InterfaceC1880Ea m12876G0 = this.f110106g.m12876G0();
            EnumC39894dg6 enumC39894dg6 = EnumC39894dg6.CHIRP;
            EnumC40486eg6 enumC40486eg6 = EnumC40486eg6.MY_BIRD;
            Intrinsics.checkNotNullExpressionValue(wireBird, "wireBird");
            m12876G0.mo55905y(C41079fg6.m41038b(enumC39894dg6, enumC40486eg6, wireBird));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m12636a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$o0 */
    /* loaded from: classes3.dex */
    public static final class C28625o0 extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Bird>> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110107g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28625o0(C49101tC3 c49101tC3) {
            super(1);
            this.f110107g = c49101tC3;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23447K<? extends Bird> invoke2(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f110107g.m12872H0().firstOrError();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23447K<? extends Bird> invoke(Unit unit) {
            return invoke2(unit);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "wireBird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$p */
    /* loaded from: classes3.dex */
    public static final class C28626p extends Lambda implements Function1<WireBird, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110108g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28626p(C49101tC3 c49101tC3) {
            super(1);
            this.f110108g = c49101tC3;
        }

        /* renamed from: a */
        public final InterfaceC23496h m12635a(WireBird wireBird) {
            WireBird copy;
            Intrinsics.checkNotNullParameter(wireBird, "wireBird");
            C41318g46.AbstractC20723b m12854N0 = this.f110108g.m12854N0();
            String id = wireBird.getId();
            m12854N0.mo7221o("Chirping bird: " + id, new Object[0]);
            if (WireBirdKt.birdModel(wireBird) == BirdModel.ES500) {
                return this.f110108g.m12836T0().mo15675k(C49697uC6.m10640b(wireBird));
            }
            InterfaceC27246pJ m12860L0 = this.f110108g.m12860L0();
            copy = wireBird.copy((r91 & 1) != 0 ? wireBird.f66717id : null, (r91 & 2) != 0 ? wireBird.model : null, (r91 & 4) != 0 ? wireBird.taskId : null, (r91 & 8) != 0 ? wireBird.batteryLevel : 0, (r91 & 16) != 0 ? wireBird.estimatedRange : null, (r91 & 32) != 0 ? wireBird.distance : 0, (r91 & 64) != 0 ? wireBird.location : null, (r91 & 128) != 0 ? wireBird.code : null, (r91 & 256) != 0 ? wireBird.stickerId : null, (r91 & 512) != 0 ? wireBird.serialNumber : null, (r91 & 1024) != 0 ? wireBird.disconnected : false, (r91 & 2048) != 0 ? wireBird.collect : false, (r91 & 4096) != 0 ? wireBird.submerged : false, (r91 & 8192) != 0 ? wireBird.lost : false, (r91 & 16384) != 0 ? wireBird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird.ackLocked : false, (r91 & 65536) != 0 ? wireBird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird.broken : false, (r91 & 524288) != 0 ? wireBird.label : null, (r91 & 1048576) != 0 ? wireBird.actions : null, (r91 & 2097152) != 0 ? wireBird.bountyId : null, (r91 & 4194304) != 0 ? wireBird.bountyPrice : null, (r91 & 8388608) != 0 ? wireBird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird.bountyLost : false, (r91 & 33554432) != 0 ? wireBird.bountyOverdue : false, (r91 & 67108864) != 0 ? wireBird.bountyKind : null, (r91 & 134217728) != 0 ? wireBird.brandName : null, (r91 & 268435456) != 0 ? wireBird.taskKind : null, (r91 & 536870912) != 0 ? wireBird.gpsAt : null, (r91 & 1073741824) != 0 ? wireBird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? wireBird.token : null, (r92 & 1) != 0 ? wireBird.bluetooth : true, (r92 & 2) != 0 ? wireBird.cellular : false, (r92 & 4) != 0 ? wireBird.startedAt : null, (r92 & 8) != 0 ? wireBird.dueAt : null, (r92 & 16) != 0 ? wireBird.asleep : false, (r92 & 32) != 0 ? wireBird.imei : null, (r92 & 64) != 0 ? wireBird.boardProtocol : null, (r92 & 128) != 0 ? wireBird.physicalLock : null, (r92 & 256) != 0 ? wireBird.priorityCollect : false, (r92 & 512) != 0 ? wireBird.down : false, (r92 & 1024) != 0 ? wireBird.needsInspection : false, (r92 & 2048) != 0 ? wireBird.partnerId : null, (r92 & 4096) != 0 ? wireBird.nestId : null, (r92 & 8192) != 0 ? wireBird.lastRideEndedAt : null, (r92 & 16384) != 0 ? wireBird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird.peril : false, (r92 & 65536) != 0 ? wireBird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird.offline : false, (r92 & 524288) != 0 ? wireBird.license : null, (r92 & 1048576) != 0 ? wireBird.areaKey : null, (r92 & 2097152) != 0 ? wireBird.fleetId : null, (r92 & 4194304) != 0 ? wireBird.nestPurpose : null, (r92 & 8388608) != 0 ? wireBird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird.scannedAt : null, (r92 & 33554432) != 0 ? wireBird.badgeType : null, (r92 & 67108864) != 0 ? wireBird.bountyReasons : null, (r92 & 134217728) != 0 ? wireBird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? wireBird.ephemeralId : null, (r92 & 536870912) != 0 ? wireBird.hasHelmet : false, (r92 & 1073741824) != 0 ? wireBird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? wireBird.bleMacAddress : null, (r93 & 1) != 0 ? wireBird.cellId : null, (r93 & 2) != 0 ? wireBird.externalFeedType : null);
            return InterfaceC27246pJ.C27247a.alarm$default(m12860L0, copy, AlarmType.CHIRP, true, false, 8, null).subscribeOn(C24542a.m31932c()).firstOrError().m33159G();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(WireBird wireBird) {
            return m12635a(wireBird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$p0 */
    /* loaded from: classes3.dex */
    public static final class C28627p0 extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110109g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28627p0(C49101tC3 c49101tC3) {
            super(1);
            this.f110109g = c49101tC3;
        }

        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> m12634a(WireBird bird) {
            WireBird copy;
            Intrinsics.checkNotNullParameter(bird, "bird");
            InterfaceC27246pJ m12860L0 = this.f110109g.m12860L0();
            copy = bird.copy((r91 & 1) != 0 ? bird.f66717id : null, (r91 & 2) != 0 ? bird.model : null, (r91 & 4) != 0 ? bird.taskId : null, (r91 & 8) != 0 ? bird.batteryLevel : 0, (r91 & 16) != 0 ? bird.estimatedRange : null, (r91 & 32) != 0 ? bird.distance : 0, (r91 & 64) != 0 ? bird.location : null, (r91 & 128) != 0 ? bird.code : null, (r91 & 256) != 0 ? bird.stickerId : null, (r91 & 512) != 0 ? bird.serialNumber : null, (r91 & 1024) != 0 ? bird.disconnected : false, (r91 & 2048) != 0 ? bird.collect : false, (r91 & 4096) != 0 ? bird.submerged : false, (r91 & 8192) != 0 ? bird.lost : false, (r91 & 16384) != 0 ? bird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r91 & 65536) != 0 ? bird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r91 & 524288) != 0 ? bird.label : null, (r91 & 1048576) != 0 ? bird.actions : null, (r91 & 2097152) != 0 ? bird.bountyId : null, (r91 & 4194304) != 0 ? bird.bountyPrice : null, (r91 & 8388608) != 0 ? bird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r91 & 33554432) != 0 ? bird.bountyOverdue : false, (r91 & 67108864) != 0 ? bird.bountyKind : null, (r91 & 134217728) != 0 ? bird.brandName : null, (r91 & 268435456) != 0 ? bird.taskKind : null, (r91 & 536870912) != 0 ? bird.gpsAt : null, (r91 & 1073741824) != 0 ? bird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r92 & 1) != 0 ? bird.bluetooth : true, (r92 & 2) != 0 ? bird.cellular : false, (r92 & 4) != 0 ? bird.startedAt : null, (r92 & 8) != 0 ? bird.dueAt : null, (r92 & 16) != 0 ? bird.asleep : false, (r92 & 32) != 0 ? bird.imei : null, (r92 & 64) != 0 ? bird.boardProtocol : null, (r92 & 128) != 0 ? bird.physicalLock : null, (r92 & 256) != 0 ? bird.priorityCollect : false, (r92 & 512) != 0 ? bird.down : false, (r92 & 1024) != 0 ? bird.needsInspection : false, (r92 & 2048) != 0 ? bird.partnerId : null, (r92 & 4096) != 0 ? bird.nestId : null, (r92 & 8192) != 0 ? bird.lastRideEndedAt : null, (r92 & 16384) != 0 ? bird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.peril : false, (r92 & 65536) != 0 ? bird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.offline : false, (r92 & 524288) != 0 ? bird.license : null, (r92 & 1048576) != 0 ? bird.areaKey : null, (r92 & 2097152) != 0 ? bird.fleetId : null, (r92 & 4194304) != 0 ? bird.nestPurpose : null, (r92 & 8388608) != 0 ? bird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r92 & 33554432) != 0 ? bird.badgeType : null, (r92 & 67108864) != 0 ? bird.bountyReasons : null, (r92 & 134217728) != 0 ? bird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? bird.ephemeralId : null, (r92 & 536870912) != 0 ? bird.hasHelmet : false, (r92 & 1073741824) != 0 ? bird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? bird.bleMacAddress : null, (r93 & 1) != 0 ? bird.cellId : null, (r93 & 2) != 0 ? bird.externalFeedType : null);
            return m12860L0.mo19545m(copy).subscribeOn(C24542a.m31932c()).firstOrError();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23447K<? extends Vehicle> invoke(WireBird wireBird) {
            return m12634a(wireBird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062R\u0010\u0005\u001aN\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0004 \u0002*&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/VehicleVersion;", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOwnedBirdDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/OwnedBirdDetailsPresenterImpl$onCreate$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,697:1\n1#2:698\n*E\n"})
    /* renamed from: tC3$q */
    /* loaded from: classes3.dex */
    public static final class C28628q extends Lambda implements Function1<Triple<? extends Bird, ? extends VehicleVersion, ? extends String>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110110g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28628q(C49101tC3 c49101tC3) {
            super(1);
            this.f110110g = c49101tC3;
        }

        /* renamed from: a */
        public final void m12633a(Triple<Bird, VehicleVersion, String> triple) {
            boolean z;
            Bird bird = triple.component1();
            Config m80770b = C36441Uq4.m80770b(this.f110110g.m12842R0(), bird);
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            if (!Bird_Kt.isRetailBird(bird) && !m80770b.getPrivateBirdConfig().getUseBirdUserActions()) {
                z = false;
            } else {
                z = true;
            }
            this.f110110g.m12827W0().m81843nm(z);
            Boolean lightOn = bird.getLightOn();
            if (lightOn != null) {
                this.f110110g.m12827W0().m81846km(lightOn.booleanValue());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Bird, ? extends VehicleVersion, ? extends String> triple) {
            m12633a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$q0 */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28629q0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C28629q0 f110111b = new C28629q0();

        static {
        }

        public C28629q0() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
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

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aÊ\u0001\u0012^\b\u0001\u0012Z\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002*,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u0007 \u0002*d\u0012^\b\u0001\u0012Z\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002*,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062(\u0010\u0005\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/VehicleVersion;", "", "birdVersionAddress", "Lio/reactivex/K;", "Lwb4;", "Lco/bird/android/model/BirdActionsAndSettings;", "c", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$r */
    /* loaded from: classes3.dex */
    public static final class C28630r extends Lambda implements Function1<Triple<? extends Bird, ? extends VehicleVersion, ? extends String>, InterfaceC23447K<? extends C51106wb4<? extends Bird, ? extends String, ? extends BirdActionsAndSettings, ? extends VehicleVersion>>> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110112g;

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001aZ\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00060\u0006 \u0004*,\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/BirdActionsAndSettings;", "actionSettings", "Lwb4;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/persistence/VehicleVersion;", C17296a.f69688o, "(Lco/bird/android/model/BirdActionsAndSettings;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$r$a */
        /* loaded from: classes3.dex */
        public static final class C28631a extends Lambda implements Function1<BirdActionsAndSettings, C51106wb4<? extends Bird, ? extends String, ? extends BirdActionsAndSettings, ? extends VehicleVersion>> {

            /* renamed from: g */
            public final /* synthetic */ Bird f110113g;

            /* renamed from: h */
            public final /* synthetic */ String f110114h;

            /* renamed from: i */
            public final /* synthetic */ VehicleVersion f110115i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28631a(Bird bird, String str, VehicleVersion vehicleVersion) {
                super(1);
                this.f110113g = bird;
                this.f110114h = str;
                this.f110115i = vehicleVersion;
            }

            /* renamed from: a */
            public final C51106wb4<Bird, String, BirdActionsAndSettings, VehicleVersion> m12627a(BirdActionsAndSettings actionSettings) {
                Intrinsics.checkNotNullParameter(actionSettings, "actionSettings");
                return new C51106wb4<>(this.f110113g, this.f110114h, actionSettings, this.f110115i);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C51106wb4<? extends Bird, ? extends String, ? extends BirdActionsAndSettings, ? extends VehicleVersion> invoke(BirdActionsAndSettings birdActionsAndSettings) {
                return m12627a(birdActionsAndSettings);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28630r(C49101tC3 c49101tC3) {
            super(1);
            this.f110112g = c49101tC3;
        }

        /* renamed from: d */
        public static final BirdActionsAndSettings m12629d(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new BirdActionsAndSettings(null, null, 3, null);
        }

        /* renamed from: e */
        public static final C51106wb4 m12628e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C51106wb4) tmp0.invoke(obj);
        }

        /* renamed from: c */
        public final InterfaceC23447K<? extends C51106wb4<Bird, String, BirdActionsAndSettings, VehicleVersion>> m12630c(Triple<Bird, VehicleVersion, String> birdVersionAddress) {
            Intrinsics.checkNotNullParameter(birdVersionAddress, "birdVersionAddress");
            Bird component1 = birdVersionAddress.component1();
            String component3 = birdVersionAddress.component3();
            AbstractC23442F<BirdActionsAndSettings> m33149Q = this.f110112g.m12869I0().mo39771a(component1.getId()).m33142Y(C24542a.m31932c()).m33146T(3L).m33149Q(new InterfaceC23492o() { // from class: yC3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    BirdActionsAndSettings m12629d;
                    m12629d = C49101tC3.C28630r.m12629d((Throwable) obj);
                    return m12629d;
                }
            });
            final C28631a c28631a = new C28631a(component1, component3, birdVersionAddress.component2());
            return m33149Q.m33157I(new InterfaceC23492o() { // from class: zC3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    C51106wb4 m12628e;
                    m12628e = C49101tC3.C28630r.m12628e(Function1.this, obj);
                    return m12628e;
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23447K<? extends C51106wb4<? extends Bird, ? extends String, ? extends BirdActionsAndSettings, ? extends VehicleVersion>> invoke(Triple<? extends Bird, ? extends VehicleVersion, ? extends String> triple) {
            return m12630c(triple);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$r0 */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28632r0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C28632r0(Object obj) {
            super(1, obj, C41318g46.AbstractC20723b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ((C41318g46.AbstractC20723b) this.receiver).mo7224f(th);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$s */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28633s extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C28633s(Object obj) {
            super(1, obj, C49101tC3.class, "onChirpError", "onChirpError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C49101tC3) this.receiver).m12802d1(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$s0 */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28634s0 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C28634s0(Object obj) {
            super(1, obj, UC3.class, "setLocked", "setLocked(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((UC3) this.receiver).m81844mm(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$t */
    /* loaded from: classes3.dex */
    public static final class C28635t extends Lambda implements Function1<Unit, Boolean> {

        /* renamed from: g */
        public static final C28635t f110116g = new C28635t();

        static {
        }

        public C28635t() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean m12626a(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Unit unit) {
            return m12626a(unit);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$t0 */
    /* loaded from: classes3.dex */
    public static final class C28636t0 extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110117g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28636t0(C49101tC3 c49101tC3) {
            super(1);
            this.f110117g = c49101tC3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToContactSupport$default(this.f110117g.m12851O0(), null, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$u */
    /* loaded from: classes3.dex */
    public static final class C28637u extends Lambda implements Function1<Unit, Boolean> {

        /* renamed from: g */
        public static final C28637u f110118g = new C28637u();

        static {
        }

        public C28637u() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean m12625a(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Unit unit) {
            return m12625a(unit);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "LtC3$b;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)LtC3$b;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$u0 */
    /* loaded from: classes3.dex */
    public static final class C28638u0 extends Lambda implements Function1<Unit, EnumC28589b> {

        /* renamed from: g */
        public static final C28638u0 f110119g = new C28638u0();

        static {
        }

        public C28638u0() {
            super(1);
        }

        /* renamed from: a */
        public final EnumC28589b m12624a(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return EnumC28589b.TRIP_ODOMETER;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ EnumC28589b invoke(Unit unit) {
            return m12624a(unit);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0000 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0006*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0000 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "lightsOn", "Lio/reactivex/K;", "Lkotlin/Triple;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$v */
    /* loaded from: classes3.dex */
    public static final class C28639v extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends Triple<? extends Bird, ? extends WireBird, ? extends Boolean>>> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110120g;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lkotlin/Triple;", "Lco/bird/android/model/wire/WireBird;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$v$a */
        /* loaded from: classes3.dex */
        public static final class C28640a extends Lambda implements Function1<Bird, Triple<? extends Bird, ? extends WireBird, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ C49101tC3 f110121g;

            /* renamed from: h */
            public final /* synthetic */ Boolean f110122h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28640a(C49101tC3 c49101tC3, Boolean bool) {
                super(1);
                this.f110121g = c49101tC3;
                this.f110122h = bool;
            }

            /* renamed from: a */
            public final Triple<Bird, WireBird, Boolean> m12620a(Bird bird) {
                Intrinsics.checkNotNullParameter(bird, "bird");
                return new Triple<>(bird, this.f110121g.m12845Q0().mo18207g(bird), this.f110122h);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Triple<? extends Bird, ? extends WireBird, ? extends Boolean> invoke(Bird bird) {
                return m12620a(bird);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28639v(C49101tC3 c49101tC3) {
            super(1);
            this.f110120g = c49101tC3;
        }

        /* renamed from: c */
        public static final Triple m12621c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        /* renamed from: b */
        public final InterfaceC23447K<? extends Triple<Bird, WireBird, Boolean>> m12622b(Boolean lightsOn) {
            Intrinsics.checkNotNullParameter(lightsOn, "lightsOn");
            AbstractC23442F<Bird> firstOrError = this.f110120g.m12872H0().firstOrError();
            final C28640a c28640a = new C28640a(this.f110120g, lightsOn);
            return firstOrError.m33157I(new InterfaceC23492o() { // from class: AC3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m12621c;
                    m12621c = C49101tC3.C28639v.m12621c(Function1.this, obj);
                    return m12621c;
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23447K<? extends Triple<? extends Bird, ? extends WireBird, ? extends Boolean>> invoke(Boolean bool) {
            return m12622b(bool);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "privateBirds", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/persistence/Bird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOwnedBirdDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/OwnedBirdDetailsPresenterImpl$onResume$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,697:1\n288#2,2:698\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/OwnedBirdDetailsPresenterImpl$onResume$1\n*L\n593#1:698,2\n*E\n"})
    /* renamed from: tC3$v0 */
    /* loaded from: classes3.dex */
    public static final class C28641v0 extends Lambda implements Function1<List<? extends Bird>, Bird> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110123g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28641v0(C49101tC3 c49101tC3) {
            super(1);
            this.f110123g = c49101tC3;
        }

        /* renamed from: a */
        public final Bird m12619a(List<Bird> privateBirds) {
            Object obj;
            boolean z;
            Intrinsics.checkNotNullExpressionValue(privateBirds, "privateBirds");
            C49101tC3 c49101tC3 = this.f110123g;
            Iterator<T> it = privateBirds.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((Bird) obj).getId(), c49101tC3.m12863K0())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Bird bird = (Bird) obj;
            C41318g46.AbstractC20723b m12854N0 = this.f110123g.m12854N0();
            String m12863K0 = this.f110123g.m12863K0();
            if (bird != null) {
                z = true;
            } else {
                z = false;
            }
            m12854N0.mo7228a("onResume in owned birds called, checking to see if private bird with id: " + m12863K0 + " is present: " + z, new Object[0]);
            return bird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Bird invoke(List<? extends Bird> list) {
            return m12619a(list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/wire/WireBird;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$w */
    /* loaded from: classes3.dex */
    public static final class C28642w extends Lambda implements Function1<Triple<? extends Bird, ? extends WireBird, ? extends Boolean>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110124g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28642w(C49101tC3 c49101tC3) {
            super(1);
            this.f110124g = c49101tC3;
        }

        /* renamed from: a */
        public final void m12618a(Triple<Bird, WireBird, Boolean> triple) {
            EnumC39894dg6 enumC39894dg6;
            WireBird component2 = triple.component2();
            Boolean lightsOn = triple.component3();
            InterfaceC1880Ea m12876G0 = this.f110124g.m12876G0();
            Intrinsics.checkNotNullExpressionValue(lightsOn, "lightsOn");
            if (lightsOn.booleanValue()) {
                enumC39894dg6 = EnumC39894dg6.LIGHTS_ON;
            } else {
                enumC39894dg6 = EnumC39894dg6.LIGHTS_OFF;
            }
            m12876G0.mo55905y(C41079fg6.m41038b(enumC39894dg6, EnumC40486eg6.MY_BIRD, component2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Bird, ? extends WireBird, ? extends Boolean> triple) {
            m12618a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$w0 */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28643w0 extends FunctionReferenceImpl implements Function1<Bird, Unit> {
        public C28643w0(Object obj) {
            super(1, obj, C0058AG.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m12617a(Bird p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C0058AG) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m12617a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$x0 */
    /* loaded from: classes3.dex */
    public static final class C28645x0 extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C28645x0 f110126g = new C28645x0();

        static {
        }

        public C28645x0() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return invoke2(bool);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$y */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28646y extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C28646y(Object obj) {
            super(1, obj, C41318g46.AbstractC20723b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ((C41318g46.AbstractC20723b) this.receiver).mo7224f(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$y0 */
    /* loaded from: classes3.dex */
    public static final class C28647y0 extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110127g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28647y0(C49101tC3 c49101tC3) {
            super(1);
            this.f110127g = c49101tC3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            this.f110127g.m12851O0().mo37029e4(-1, X52.m77424a(new MyBirdsResult(MyBirdsResult.EnumC16265a.UNPAIRED)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$z */
    /* loaded from: classes3.dex */
    public static final class C28648z extends Lambda implements Function1<Unit, Boolean> {

        /* renamed from: g */
        public static final C28648z f110128g = new C28648z();

        static {
        }

        public C28648z() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean m12616a(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Unit unit) {
            return m12616a(unit);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tC3$z0 */
    /* loaded from: classes3.dex */
    public static final class C28649z0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110129g;

        /* renamed from: h */
        public final /* synthetic */ boolean f110130h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28649z0(C49101tC3 c49101tC3, boolean z) {
            super(1);
            this.f110129g = c49101tC3;
            this.f110130h = z;
        }

        /* renamed from: b */
        public static final void m12614b(C49101tC3 this$0, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m12827W0().m81844mm(!z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f110129g.m12854N0().mo7221o("Unable to retreive current bird state. Reverting back to known lock state.", new Object[0]);
            Handler handler = new Handler(Looper.getMainLooper());
            final C49101tC3 c49101tC3 = this.f110129g;
            final boolean z = this.f110130h;
            handler.post(new Runnable() { // from class: OC3
                @Override // java.lang.Runnable
                public final void run() {
                    C49101tC3.C28649z0.m12614b(C49101tC3.this, z);
                }
            });
        }
    }

    static {
    }

    public C49101tC3(InterfaceC1880Ea analyticsManager, InterfaceC27246pJ bluetoothManager, InterfaceC47256q54 privateBirdsManager, WX2 myBirdsManager, InterfaceC20792gH birdActionsManager, InterfaceC25134kI birdAirManager, InterfaceC48164rd5 rxBleBirdBluetoothManager, InterfaceC40001dr4 reactiveLocationManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, OA3 converter, ScopeProvider scopeProvider, UC3 ui, String birdId, boolean z, InterfaceC39861dd3 notificationSender) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(privateBirdsManager, "privateBirdsManager");
        Intrinsics.checkNotNullParameter(myBirdsManager, "myBirdsManager");
        Intrinsics.checkNotNullParameter(birdActionsManager, "birdActionsManager");
        Intrinsics.checkNotNullParameter(birdAirManager, "birdAirManager");
        Intrinsics.checkNotNullParameter(rxBleBirdBluetoothManager, "rxBleBirdBluetoothManager");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(notificationSender, "notificationSender");
        this.f110013a = analyticsManager;
        this.f110014b = bluetoothManager;
        this.f110015c = privateBirdsManager;
        this.f110016d = myBirdsManager;
        this.f110017e = birdActionsManager;
        this.f110018f = birdAirManager;
        this.f110019g = rxBleBirdBluetoothManager;
        this.f110020h = reactiveLocationManager;
        this.f110021i = reactiveConfig;
        this.f110022j = navigator;
        this.f110023k = converter;
        this.f110024l = scopeProvider;
        this.f110025m = ui;
        this.f110026n = birdId;
        this.f110027o = z;
        this.f110028p = notificationSender;
        C0058AG<Bird> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Bird>()");
        this.f110029q = m115951g;
        C0058AG<Boolean> m115950h = C0058AG.m115950h(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(false)");
        this.f110030r = m115950h;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f110031s = m31902e;
        C0058AG<VehicleVersion> m115950h2 = C0058AG.m115950h(new VehicleVersion(birdId, null, null, 0, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(m115950h2, "createDefault(VehicleVersion(id = birdId))");
        this.f110032t = m115950h2;
        C0058AG<Unit> m115950h3 = C0058AG.m115950h(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(m115950h3, "createDefault(Unit)");
        this.f110033u = m115950h3;
        this.f110034v = new LinkedHashMap();
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(m115951g, m115950h2, C28554A0.f110038a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C28596d c28596d = new C28596d();
        this.f110035w = combineLatest.flatMap(new InterfaceC23492o() { // from class: SA3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m12888D0;
                m12888D0 = C49101tC3.m12888D0(Function1.this, obj);
                return m12888D0;
            }
        }).observeOn(C23454a.m33087a());
        Observable<Bird> observeOn = m115951g.observeOn(C23454a.m33087a());
        final C28591c c28591c = C28591c.f110075g;
        this.f110036x = observeOn.map(new InterfaceC23492o() { // from class: dB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m12892C0;
                m12892C0 = C49101tC3.m12892C0(Function1.this, obj);
                return m12892C0;
            }
        }).distinctUntilChanged();
    }

    /* renamed from: A1 */
    public static final InterfaceC23447K m12899A1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: A2 */
    public static final void m12898A2(C49101tC3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m12854N0().mo7221o("Successfully retreived latest bird state", new Object[0]);
    }

    /* renamed from: B1 */
    public static final Boolean m12895B1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: B2 */
    public static final void m12894B2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final Boolean m12892C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: C1 */
    public static final InterfaceC23447K m12891C1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final InterfaceC23434B m12888D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: D1 */
    public static final void m12887D1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E1 */
    public static final InterfaceC23447K m12883E1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final InterfaceC23434B m12880F0(Function1 tmp0, Observable p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (InterfaceC23434B) tmp0.invoke(p0);
    }

    /* renamed from: F1 */
    public static final void m12879F1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G1 */
    public static final void m12875G1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H1 */
    public static final void m12871H1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I1 */
    public static final void m12868I1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J1 */
    public static final InterfaceC23447K m12865J1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K1 */
    public static final void m12862K1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L1 */
    public static final Pair m12859L1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: M1 */
    public static final InterfaceC23447K m12856M1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: N1 */
    public static final void m12853N1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O1 */
    public static final InterfaceC23447K m12850O1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: P1 */
    public static final void m12847P1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q1 */
    public static final void m12844Q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R1 */
    public static final void m12841R1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S1 */
    public static final InterfaceC23447K m12838S1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: T1 */
    public static final void m12835T1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U1 */
    public static final boolean m12832U1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: V1 */
    public static final InterfaceC23447K m12829V1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: W1 */
    public static final void m12826W1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X1 */
    public static final void m12823X1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y1 */
    public static final InterfaceC23496h m12820Y1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: Z0 */
    public static final Bird m12818Z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Bird) tmp0.invoke(obj);
    }

    /* renamed from: Z1 */
    public static final void m12817Z1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a2 */
    public static final void m12813a2() {
    }

    /* renamed from: b1 */
    public static final WireBird m12810b1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireBird) tmp0.invoke(obj);
    }

    /* renamed from: b2 */
    public static final void m12809b2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c2 */
    public static final InterfaceC23447K m12805c2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: d2 */
    public static final void m12801d2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e2 */
    public static final InterfaceC24574u m12797e2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: f1 */
    public static final EnumC28589b m12794f1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (EnumC28589b) tmp0.invoke(obj);
    }

    /* renamed from: f2 */
    public static final void m12793f2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g1 */
    public static final EnumC28589b m12790g1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (EnumC28589b) tmp0.invoke(obj);
    }

    /* renamed from: g2 */
    public static final InterfaceC23447K m12789g2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: h1 */
    public static final EnumC28589b m12786h1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (EnumC28589b) tmp0.invoke(obj);
    }

    /* renamed from: h2 */
    public static final void m12785h2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i1 */
    public static final InterfaceC23447K m12782i1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i2 */
    public static final void m12781i2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j1 */
    public static final InterfaceC23496h m12778j1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: j2 */
    public static final void m12777j2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k1 */
    public static final void m12774k1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k2 */
    public static final void m12773k2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l1 */
    public static final void m12770l1(C49101tC3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC41921h56.C22549a.topToast$default(this$0.f110025m, C45871nl4.odometer_reset_message, (EnumC40735f56) null, 2, (Object) null);
    }

    /* renamed from: l2 */
    public static final InterfaceC23447K m12769l2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: m1 */
    public static final InterfaceC23447K m12766m1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: m2 */
    public static final void m12765m2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n1 */
    public static final void m12762n1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n2 */
    public static final InterfaceC23447K m12761n2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o1 */
    public static final InterfaceC23496h m12758o1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: o2 */
    public static final void m12757o2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p1 */
    public static final void m12754p1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p2 */
    public static final void m12753p2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q1 */
    public static final void m12750q1(C49101tC3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m12798e1();
    }

    /* renamed from: q2 */
    public static final InterfaceC23447K m12749q2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r1 */
    public static final void m12746r1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r2 */
    public static final InterfaceC23447K m12745r2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s1 */
    public static final Boolean m12742s1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: s2 */
    public static final void m12741s2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t1 */
    public static final Boolean m12738t1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: t2 */
    public static final void m12737t2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u1 */
    public static final InterfaceC23447K m12734u1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u2 */
    public static final void m12733u2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v1 */
    public static final void m12730v1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v2 */
    public static final void m12729v2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w1 */
    public static final InterfaceC23496h m12726w1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: w2 */
    public static final void m12725w2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x1 */
    public static final void m12722x1() {
    }

    /* renamed from: x2 */
    public static final boolean m12721x2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: y1 */
    public static final void m12718y1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y2 */
    public static final void m12717y2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z1 */
    public static final Boolean m12714z1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: C2 */
    public final void m12890C2(Bird bird) {
        String str;
        C41318g46.AbstractC20723b m12854N0 = m12854N0();
        if (bird.getLocked()) {
            str = "locked";
        } else {
            str = "unlocked";
        }
        String id = bird.getId();
        m12854N0.mo7221o("Successfully " + str + " bird: " + id, new Object[0]);
        this.f110029q.accept(bird);
    }

    /* renamed from: D2 */
    public final boolean m12886D2(Bird bird, Bird updatedBird) {
        String str;
        String str2;
        OwnershipKind ownershipKind;
        Intrinsics.checkNotNullParameter(bird, "<this>");
        Intrinsics.checkNotNullParameter(updatedBird, "updatedBird");
        if (Intrinsics.areEqual(bird.getId(), updatedBird.getId())) {
            PrivateBird privateBird = bird.getPrivateBird();
            OwnershipKind ownershipKind2 = null;
            if (privateBird != null) {
                str = privateBird.getId();
            } else {
                str = null;
            }
            PrivateBird privateBird2 = updatedBird.getPrivateBird();
            if (privateBird2 != null) {
                str2 = privateBird2.getId();
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str, str2)) {
                PrivateBird privateBird3 = bird.getPrivateBird();
                if (privateBird3 != null) {
                    ownershipKind = privateBird3.getOwnershipKind();
                } else {
                    ownershipKind = null;
                }
                PrivateBird privateBird4 = updatedBird.getPrivateBird();
                if (privateBird4 != null) {
                    ownershipKind2 = privateBird4.getOwnershipKind();
                }
                if (ownershipKind == ownershipKind2 && bird.getBatteryLevel() == updatedBird.getBatteryLevel() && bird.getDistance() == updatedBird.getDistance() && Intrinsics.areEqual(bird.getEstimatedRange(), updatedBird.getEstimatedRange()) && Intrinsics.areEqual(bird.getLightOn(), updatedBird.getLightOn())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E0 */
    public final <T> Observable<T> m12884E0(Observable<T> observable) {
        final C28599e c28599e = new C28599e(observable, this);
        Observable<T> observable2 = (Observable<T>) observable.compose(new InterfaceC23435C() { // from class: oC3
            @Override // io.reactivex.InterfaceC23435C
            public final InterfaceC23434B apply(Observable observable3) {
                InterfaceC23434B m12880F0;
                m12880F0 = C49101tC3.m12880F0(Function1.this, observable3);
                return m12880F0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "private fun <T> Observab…      }\n      }\n    }\n  }");
        return observable2;
    }

    /* renamed from: E2 */
    public final boolean m12882E2(VehicleVersion vehicleVersion, VehicleVersion updatedVehicleVersion) {
        boolean equals$default;
        boolean equals$default2;
        boolean equals$default3;
        Intrinsics.checkNotNullParameter(vehicleVersion, "<this>");
        Intrinsics.checkNotNullParameter(updatedVehicleVersion, "updatedVehicleVersion");
        equals$default = StringsKt__StringsJVMKt.equals$default(vehicleVersion.getDashVersion(), updatedVehicleVersion.getDashVersion(), false, 2, null);
        if (!equals$default) {
            return false;
        }
        equals$default2 = StringsKt__StringsJVMKt.equals$default(vehicleVersion.getBmsVersion(), updatedVehicleVersion.getBmsVersion(), false, 2, null);
        if (!equals$default2) {
            return false;
        }
        equals$default3 = StringsKt__StringsJVMKt.equals$default(vehicleVersion.getPcmVersion(), updatedVehicleVersion.getPcmVersion(), false, 2, null);
        if (!equals$default3) {
            return false;
        }
        return true;
    }

    /* renamed from: F2 */
    public void mo12878F2(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        boolean isAsleep = Bird_Kt.isAsleep(bird);
        this.f110025m.m81842om(!isAsleep);
        this.f110025m.m81844mm(bird.getLocked());
        this.f110025m.m81834wm(!isAsleep);
        this.f110025m.m81832ym(false);
        this.f110025m.m81845lm(isAsleep);
    }

    /* renamed from: G0 */
    public final InterfaceC1880Ea m12876G0() {
        return this.f110013a;
    }

    /* renamed from: G2 */
    public final VehicleDescriptor m12874G2(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "<this>");
        return new VehicleDescriptor(bird.getId(), bird.getImei(), bird.getSerialNumber(), bird.getBleMacAddress(), bird.getModel(), null, 32, null);
    }

    /* renamed from: H0 */
    public final C0058AG<Bird> m12872H0() {
        return this.f110029q;
    }

    /* renamed from: I0 */
    public final InterfaceC20792gH m12869I0() {
        return this.f110017e;
    }

    /* renamed from: J0 */
    public final InterfaceC25134kI m12866J0() {
        return this.f110018f;
    }

    /* renamed from: K0 */
    public final String m12863K0() {
        return this.f110026n;
    }

    /* renamed from: L0 */
    public final InterfaceC27246pJ m12860L0() {
        return this.f110014b;
    }

    /* renamed from: M0 */
    public final OA3 m12857M0() {
        return this.f110023k;
    }

    /* renamed from: N0 */
    public final C41318g46.AbstractC20723b m12854N0() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("bird-details-presenter");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"bird-details-presenter\")");
        return m40153k;
    }

    /* renamed from: O0 */
    public final InterfaceC40099e13 m12851O0() {
        return this.f110022j;
    }

    /* renamed from: P0 */
    public final InterfaceC39861dd3 m12848P0() {
        return this.f110028p;
    }

    /* renamed from: Q0 */
    public final InterfaceC47256q54 m12845Q0() {
        return this.f110015c;
    }

    /* renamed from: R0 */
    public final C36207Tq4 m12842R0() {
        return this.f110021i;
    }

    /* renamed from: S0 */
    public final InterfaceC40001dr4 m12839S0() {
        return this.f110020h;
    }

    /* renamed from: T0 */
    public final InterfaceC48164rd5 m12836T0() {
        return this.f110019g;
    }

    /* renamed from: U0 */
    public final ScopeProvider m12833U0() {
        return this.f110024l;
    }

    /* renamed from: V0 */
    public final C24558d<Unit> m12830V0() {
        return this.f110031s;
    }

    /* renamed from: W0 */
    public final UC3 m12827W0() {
        return this.f110025m;
    }

    /* renamed from: X0 */
    public final C0058AG<VehicleVersion> m12824X0() {
        return this.f110032t;
    }

    /* renamed from: Y0 */
    public final Observable<Bird> m12821Y0(Observable<WireBird> observable) {
        final C28603f c28603f = new C28603f(this);
        Observable map = observable.map(new InterfaceC23492o() { // from class: pC3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Bird m12818Z0;
                m12818Z0 = C49101tC3.m12818Z0(Function1.this, obj);
                return m12818Z0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "private fun Observable<W…irdToBird(wireBird) }\n  }");
        return map;
    }

    @Override // p000.RA3
    /* renamed from: a */
    public void mo12816a() {
        if (this.f110027o) {
            this.f110025m.m81841pm(30);
        }
        Observable<Triple<Bird, VehicleVersion, String>> observable = this.f110035w;
        final C28628q c28628q = new C28628q(this);
        Observable<Triple<Bird, VehicleVersion, String>> doOnNext = observable.doOnNext(new InterfaceC23484g() { // from class: KB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12754p1(Function1.this, obj);
            }
        });
        final C28630r c28630r = new C28630r(this);
        Observable observeOn = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: YA3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12899A1;
                m12899A1 = C49101tC3.m12899A1(Function1.this, obj);
                return m12899A1;
            }
        }).observeOn(C24542a.m31934a());
        final C28568L c28568l = new C28568L();
        Observable map = observeOn.map(new InterfaceC23492o() { // from class: kB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m12859L1;
                m12859L1 = C49101tC3.m12859L1(Function1.this, obj);
                return m12859L1;
            }
        });
        final C28583W c28583w = new C28583W();
        Observable observeOn2 = map.doOnNext(new InterfaceC23484g() { // from class: wB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12826W1(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28606g0 c28606g0 = new C28606g0(this);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: IB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12785h2(Function1.this, obj);
            }
        };
        final C28632r0 c28632r0 = new C28632r0(m12854N0());
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: UB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12741s2(Function1.this, obj);
            }
        });
        Observable<Boolean> birdLockChanges = this.f110036x;
        Intrinsics.checkNotNullExpressionValue(birdLockChanges, "birdLockChanges");
        Object m33094as2 = birdLockChanges.m33094as(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28634s0 c28634s0 = new C28634s0(this.f110025m);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: fC3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12733u2(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f110025m.m81875Dm().m33094as(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28636t0 c28636t0 = new C28636t0(this);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: hC3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12729v2(Function1.this, obj);
            }
        });
        Observable<Unit> m81847jm = this.f110025m.m81847jm();
        final C28638u0 c28638u0 = C28638u0.f110119g;
        InterfaceC23434B map2 = m81847jm.map(new InterfaceC23492o() { // from class: iC3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C49101tC3.EnumC28589b m12794f1;
                m12794f1 = C49101tC3.m12794f1(Function1.this, obj);
                return m12794f1;
            }
        });
        Observable<Unit> m81848im = this.f110025m.m81848im();
        final C28609i c28609i = C28609i.f110095g;
        InterfaceC23434B map3 = m81848im.map(new InterfaceC23492o() { // from class: jC3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C49101tC3.EnumC28589b m12790g1;
                m12790g1 = C49101tC3.m12790g1(Function1.this, obj);
                return m12790g1;
            }
        });
        Observable<Unit> m81849hm = this.f110025m.m81849hm();
        final C28611j c28611j = C28611j.f110096g;
        Observable merge = Observable.merge(map2, map3, m81849hm.map(new InterfaceC23492o() { // from class: VB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C49101tC3.EnumC28589b m12786h1;
                m12786h1 = C49101tC3.m12786h1(Function1.this, obj);
                return m12786h1;
            }
        }));
        final C28614k c28614k = new C28614k(this);
        Observable flatMapSingle = merge.flatMapSingle(new InterfaceC23492o() { // from class: gC3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12782i1;
                m12782i1 = C49101tC3.m12782i1(Function1.this, obj);
                return m12782i1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Observable observeOn3 = m12884E0(flatMapSingle).observeOn(C24542a.m31932c());
        final C28617l c28617l = new C28617l(this);
        AbstractC23461c m33070P = observeOn3.switchMapCompletable(new InterfaceC23492o() { // from class: qC3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m12778j1;
                m12778j1 = C49101tC3.m12778j1(Function1.this, obj);
                return m12778j1;
            }
        }).m33070P(C23454a.m33087a());
        final C28620m c28620m = new C28620m(this);
        AbstractC23461c m33069Q = m33070P.m33084B(new InterfaceC23484g() { // from class: rC3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12774k1(Function1.this, obj);
            }
        }).m33029z(new InterfaceC23478a() { // from class: sC3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C49101tC3.m12770l1(C49101tC3.this);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<Unit> m81860Xl = this.f110025m.m81860Xl();
        final C28622n c28622n = new C28622n(this);
        Observable<Bird> flatMapSingle2 = m81860Xl.flatMapSingle(new InterfaceC23492o() { // from class: TA3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12766m1;
                m12766m1 = C49101tC3.m12766m1(Function1.this, obj);
                return m12766m1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Observable<WireBird> m12814a1 = m12814a1(flatMapSingle2);
        final C28624o c28624o = new C28624o(this);
        Observable<WireBird> doOnNext2 = m12814a1.doOnNext(new InterfaceC23484g() { // from class: UA3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12762n1(Function1.this, obj);
            }
        });
        final C28626p c28626p = new C28626p(this);
        AbstractC23461c flatMapCompletable = doOnNext2.flatMapCompletable(new InterfaceC23492o() { // from class: VA3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m12758o1;
                m12758o1 = C49101tC3.m12758o1(Function1.this, obj);
                return m12758o1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33041n2 = flatMapCompletable.m33041n(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: WA3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C49101tC3.m12750q1(C49101tC3.this);
            }
        };
        final C28633s c28633s = new C28633s(this);
        ((CompletableSubscribeProxy) m33041n2).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: XA3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12746r1(Function1.this, obj);
            }
        });
        Observable<Unit> m81858Zl = this.f110025m.m81858Zl();
        final C28635t c28635t = C28635t.f110116g;
        InterfaceC23434B map4 = m81858Zl.map(new InterfaceC23492o() { // from class: ZA3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m12742s1;
                m12742s1 = C49101tC3.m12742s1(Function1.this, obj);
                return m12742s1;
            }
        });
        Observable<Unit> m81859Yl = this.f110025m.m81859Yl();
        final C28637u c28637u = C28637u.f110118g;
        Observable merge2 = Observable.merge(map4, m81859Yl.map(new InterfaceC23492o() { // from class: aB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m12738t1;
                m12738t1 = C49101tC3.m12738t1(Function1.this, obj);
                return m12738t1;
            }
        }));
        final C28639v c28639v = new C28639v(this);
        Observable flatMapSingle3 = merge2.flatMapSingle(new InterfaceC23492o() { // from class: bB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12734u1;
                m12734u1 = C49101tC3.m12734u1(Function1.this, obj);
                return m12734u1;
            }
        });
        final C28642w c28642w = new C28642w(this);
        Observable doOnNext3 = flatMapSingle3.doOnNext(new InterfaceC23484g() { // from class: cB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12730v1(Function1.this, obj);
            }
        });
        final C28644x c28644x = new C28644x(this);
        AbstractC23461c flatMapCompletable2 = doOnNext3.flatMapCompletable(new InterfaceC23492o() { // from class: eB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m12726w1;
                m12726w1 = C49101tC3.m12726w1(Function1.this, obj);
                return m12726w1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable2, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33041n3 = flatMapCompletable2.m33041n(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a2 = new InterfaceC23478a() { // from class: fB3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C49101tC3.m12722x1();
            }
        };
        final C28646y c28646y = new C28646y(m12854N0());
        ((CompletableSubscribeProxy) m33041n3).mo45217e(interfaceC23478a2, new InterfaceC23484g() { // from class: gB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12718y1(Function1.this, obj);
            }
        });
        Observable<Unit> m81857am = this.f110025m.m81857am();
        final C28648z c28648z = C28648z.f110128g;
        InterfaceC23434B map5 = m81857am.map(new InterfaceC23492o() { // from class: hB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m12714z1;
                m12714z1 = C49101tC3.m12714z1(Function1.this, obj);
                return m12714z1;
            }
        });
        Observable<Unit> m81855bm = this.f110025m.m81855bm();
        final C28553A c28553a = C28553A.f110037g;
        Observable merge3 = Observable.merge(map5, m81855bm.map(new InterfaceC23492o() { // from class: iB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m12895B1;
                m12895B1 = C49101tC3.m12895B1(Function1.this, obj);
                return m12895B1;
            }
        }));
        final C28555B c28555b = new C28555B();
        Observable flatMapSingle4 = merge3.flatMapSingle(new InterfaceC23492o() { // from class: jB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12891C1;
                m12891C1 = C49101tC3.m12891C1(Function1.this, obj);
                return m12891C1;
            }
        });
        final C28557C c28557c = new C28557C();
        Observable doOnNext4 = flatMapSingle4.doOnNext(new InterfaceC23484g() { // from class: lB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12887D1(Function1.this, obj);
            }
        });
        final C28558D c28558d = new C28558D();
        Observable observeOn4 = doOnNext4.flatMapSingle(new InterfaceC23492o() { // from class: mB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12883E1;
                m12883E1 = C49101tC3.m12883E1(Function1.this, obj);
                return m12883E1;
            }
        }).delay(500L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        final C28560E c28560e = new C28560E(this);
        Observable retry = observeOn4.doOnNext(new InterfaceC23484g() { // from class: nB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12879F1(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33094as4 = retry.m33094as(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28561F c28561f = C28561F.f110045g;
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: pB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12875G1(Function1.this, obj);
            }
        };
        final C28562G c28562g = new C28562G(m12854N0());
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: qB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12871H1(Function1.this, obj);
            }
        });
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f110025m.m81851fm(), this.f110033u, C28607h.f110093a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C28563H c28563h = new C28563H();
        Observable doOnNext5 = combineLatest.doOnNext(new InterfaceC23484g() { // from class: rB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12868I1(Function1.this, obj);
            }
        });
        final C28564I c28564i = new C28564I();
        Observable flatMapSingle5 = doOnNext5.flatMapSingle(new InterfaceC23492o() { // from class: sB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12865J1;
                m12865J1 = C49101tC3.m12865J1(Function1.this, obj);
                return m12865J1;
            }
        });
        final C28565J c28565j = new C28565J();
        Observable doOnNext6 = flatMapSingle5.doOnNext(new InterfaceC23484g() { // from class: tB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12862K1(Function1.this, obj);
            }
        });
        final C28566K c28566k = new C28566K();
        Observable observeOn5 = doOnNext6.flatMapSingle(new InterfaceC23492o() { // from class: uB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12856M1;
                m12856M1 = C49101tC3.m12856M1(Function1.this, obj);
                return m12856M1;
            }
        }).observeOn(C23454a.m33087a());
        final C28569M c28569m = new C28569M();
        Observable doOnError = observeOn5.doOnError(new InterfaceC23484g() { // from class: vB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12853N1(Function1.this, obj);
            }
        });
        final C28570N c28570n = new C28570N();
        Observable retry2 = doOnError.flatMapSingle(new InterfaceC23492o() { // from class: xB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12850O1;
                m12850O1 = C49101tC3.m12850O1(Function1.this, obj);
                return m12850O1;
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry2, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33094as5 = retry2.m33094as(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28575O c28575o = new C28575O();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: yB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12847P1(Function1.this, obj);
            }
        };
        final C28576P c28576p = new C28576P(m12854N0());
        ((ObservableSubscribeProxy) m33094as5).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: AB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12844Q1(Function1.this, obj);
            }
        });
        Observable<Unit> m81871Hm = this.f110025m.m81871Hm();
        final C28577Q c28577q = new C28577Q();
        Observable<Unit> doOnNext7 = m81871Hm.doOnNext(new InterfaceC23484g() { // from class: BB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12841R1(Function1.this, obj);
            }
        });
        final C28578R c28578r = new C28578R();
        Observable<R> flatMapSingle6 = doOnNext7.flatMapSingle(new InterfaceC23492o() { // from class: CB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12838S1;
                m12838S1 = C49101tC3.m12838S1(Function1.this, obj);
                return m12838S1;
            }
        });
        final C28579S c28579s = new C28579S();
        Observable doOnNext8 = flatMapSingle6.doOnNext(new InterfaceC23484g() { // from class: DB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12835T1(Function1.this, obj);
            }
        });
        final C28580T c28580t = C28580T.f110063g;
        Observable filter = doOnNext8.filter(new InterfaceC23494q() { // from class: EB3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m12832U1;
                m12832U1 = C49101tC3.m12832U1(Function1.this, obj);
                return m12832U1;
            }
        });
        final C28581U c28581u = new C28581U();
        Observable flatMapSingle7 = filter.flatMapSingle(new InterfaceC23492o() { // from class: FB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12829V1;
                m12829V1 = C49101tC3.m12829V1(Function1.this, obj);
                return m12829V1;
            }
        });
        final C28582V c28582v = new C28582V();
        Observable doOnNext9 = flatMapSingle7.doOnNext(new InterfaceC23484g() { // from class: GB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12823X1(Function1.this, obj);
            }
        });
        final C28584X c28584x = new C28584X();
        AbstractC23461c m33070P2 = doOnNext9.flatMapCompletable(new InterfaceC23492o() { // from class: HB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m12820Y1;
                m12820Y1 = C49101tC3.m12820Y1(Function1.this, obj);
                return m12820Y1;
            }
        }).m33070P(C23454a.m33087a());
        final C28585Y c28585y = new C28585Y();
        AbstractC23461c m33066T = m33070P2.m33084B(new InterfaceC23484g() { // from class: JB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12817Z1(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33041n4 = m33066T.m33041n(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33041n4, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a3 = new InterfaceC23478a() { // from class: LB3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C49101tC3.m12813a2();
            }
        };
        final C28586Z c28586z = new C28586Z(m12854N0());
        ((CompletableSubscribeProxy) m33041n4).mo45217e(interfaceC23478a3, new InterfaceC23484g() { // from class: MB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12809b2(Function1.this, obj);
            }
        });
        Observable<Unit> m81878Am = this.f110025m.m81878Am();
        final C28588a0 c28588a0 = new C28588a0();
        Observable<Bird> flatMapSingle8 = m81878Am.flatMapSingle(new InterfaceC23492o() { // from class: NB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12805c2;
                m12805c2 = C49101tC3.m12805c2(Function1.this, obj);
                return m12805c2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle8, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Observable<WireBird> m12814a12 = m12814a1(flatMapSingle8);
        final C28590b0 c28590b0 = new C28590b0();
        Observable<WireBird> doOnNext10 = m12814a12.doOnNext(new InterfaceC23484g() { // from class: OB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12801d2(Function1.this, obj);
            }
        });
        final C28592c0 c28592c0 = new C28592c0();
        Observable<R> flatMapMaybe = doOnNext10.flatMapMaybe(new InterfaceC23492o() { // from class: PB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m12797e2;
                m12797e2 = C49101tC3.m12797e2(Function1.this, obj);
                return m12797e2;
            }
        });
        final C28598d0 c28598d0 = new C28598d0();
        Observable doOnNext11 = flatMapMaybe.doOnNext(new InterfaceC23484g() { // from class: QB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12793f2(Function1.this, obj);
            }
        });
        final C28602e0 c28602e0 = new C28602e0(this);
        Observable<WireBird> flatMapSingle9 = doOnNext11.flatMapSingle(new InterfaceC23492o() { // from class: RB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12789g2;
                m12789g2 = C49101tC3.m12789g2(Function1.this, obj);
                return m12789g2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle9, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Observable<Bird> observeOn6 = m12821Y0(flatMapSingle9).observeOn(C23454a.m33087a());
        final C28604f0 c28604f0 = new C28604f0(this);
        Observable<Bird> retry3 = observeOn6.doOnError(new InterfaceC23484g() { // from class: SB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12781i2(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry3, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33094as6 = retry3.m33094as(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28608h0 c28608h0 = new C28608h0(this);
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: TB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12777j2(Function1.this, obj);
            }
        };
        final C28610i0 c28610i0 = new C28610i0(m12854N0());
        ((ObservableSubscribeProxy) m33094as6).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: WB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12773k2(Function1.this, obj);
            }
        });
        Observable<Boolean> m81874Em = this.f110025m.m81874Em();
        final C28612j0 c28612j0 = new C28612j0(this);
        Observable<R> flatMapSingle10 = m81874Em.flatMapSingle(new InterfaceC23492o() { // from class: XB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12769l2;
                m12769l2 = C49101tC3.m12769l2(Function1.this, obj);
                return m12769l2;
            }
        });
        final C28616k0 c28616k0 = new C28616k0(this);
        Observable doOnNext12 = flatMapSingle10.doOnNext(new InterfaceC23484g() { // from class: YB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12765m2(Function1.this, obj);
            }
        });
        final C28619l0 c28619l0 = new C28619l0(this);
        Observable flatMapSingle11 = doOnNext12.flatMapSingle(new InterfaceC23492o() { // from class: ZB3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12761n2;
                m12761n2 = C49101tC3.m12761n2(Function1.this, obj);
                return m12761n2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle11, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33094as7 = flatMapSingle11.m33094as(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28621m0 c28621m0 = new C28621m0(this.f110029q);
        InterfaceC23484g interfaceC23484g5 = new InterfaceC23484g() { // from class: aC3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12757o2(Function1.this, obj);
            }
        };
        final C28623n0 c28623n0 = new C28623n0(m12854N0());
        ((ObservableSubscribeProxy) m33094as7).subscribe(interfaceC23484g5, new InterfaceC23484g() { // from class: bC3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12753p2(Function1.this, obj);
            }
        });
        Observable<Unit> m81877Bm = this.f110025m.m81877Bm();
        final C28625o0 c28625o0 = new C28625o0(this);
        Observable<Bird> flatMapSingle12 = m81877Bm.flatMapSingle(new InterfaceC23492o() { // from class: cC3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12749q2;
                m12749q2 = C49101tC3.m12749q2(Function1.this, obj);
                return m12749q2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle12, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Observable<WireBird> m12814a13 = m12814a1(flatMapSingle12);
        final C28627p0 c28627p0 = new C28627p0(this);
        Observable<R> flatMapSingle13 = m12814a13.flatMapSingle(new InterfaceC23492o() { // from class: dC3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12745r2;
                m12745r2 = C49101tC3.m12745r2(Function1.this, obj);
                return m12745r2;
            }
        });
        final C28629q0 c28629q0 = C28629q0.f110111b;
        Observable retry4 = flatMapSingle13.doOnError(new InterfaceC23484g() { // from class: eC3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12737t2(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry4, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33094as8 = retry4.m33094as(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as8).subscribe();
    }

    /* renamed from: a1 */
    public final Observable<WireBird> m12814a1(Observable<Bird> observable) {
        final C28605g c28605g = new C28605g(this);
        Observable map = observable.map(new InterfaceC23492o() { // from class: nC3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireBird m12810b1;
                m12810b1 = C49101tC3.m12810b1(Function1.this, obj);
                return m12810b1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "private fun Observable<B…irdToWireBird(bird) }\n  }");
        return map;
    }

    /* renamed from: c1 */
    public final void m12806c1(Bird bird, VehicleVersion vehicleVersion) {
        C36879Wn1 mo29097g = this.f110018f.mo29097g(bird, vehicleVersion);
        if (mo29097g != null) {
            this.f110013a.mo55905y(new C46653p44(null, null, null, mo29097g.m77834b(), mo29097g.m77833c(), mo29097g.m77830f(), Float.valueOf(mo29097g.m77832d()), Float.valueOf(mo29097g.m77831e()), 7, null));
        }
    }

    /* renamed from: d1 */
    public final void m12802d1(Throwable th) {
        m12854N0().mo7220p(th, "Failed to chirp bird.", new Object[0]);
    }

    /* renamed from: e1 */
    public final void m12798e1() {
        m12854N0().mo7221o("Successfully chirped bird", new Object[0]);
    }

    @Override // p000.RA3
    public boolean onBackPressed() {
        return false;
    }

    @Override // p000.RA3
    public void onResume() {
        Object m33041n = this.f110015c.mo18206h().m33041n(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        AbstractC24490k<List<Bird>> m32163Y0 = this.f110015c.mo18195r0().m32163Y0(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m32163Y0, "privateBirdsManager.stre…scribeOn(Schedulers.io())");
        AbstractC24490k m32111s0 = C37279Yf5.m74578Q(m32163Y0, new C28641v0(this)).m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "override fun onResume() …D))\n        )\n      }\n  }");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28643w0 c28643w0 = new C28643w0(this.f110029q);
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: kC3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12725w2(Function1.this, obj);
            }
        });
        C0058AG<Boolean> c0058ag = this.f110030r;
        final C28645x0 c28645x0 = C28645x0.f110126g;
        Observable<Boolean> observeOn = c0058ag.filter(new InterfaceC23494q() { // from class: lC3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m12721x2;
                m12721x2 = C49101tC3.m12721x2(Function1.this, obj);
                return m12721x2;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "birdUnpaired\n      .filt…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28647y0 c28647y0 = new C28647y0(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: mC3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12717y2(Function1.this, obj);
            }
        });
    }

    /* renamed from: z2 */
    public final void m12713z2(Throwable th, boolean z) {
        String str;
        C41318g46.AbstractC20723b m12854N0 = m12854N0();
        if (z) {
            str = "lock";
        } else {
            str = "unlock";
        }
        m12854N0.mo7212z(th, "Failed to " + str + " bird", new Object[0]);
        AbstractC23461c m33070P = this.f110016d.refresh().m33063X(C24542a.m31932c()).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "myBirdsManager.refresh()…dSchedulers.mainThread())");
        Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f110024l));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: oB3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C49101tC3.m12898A2(C49101tC3.this);
            }
        };
        final C28649z0 c28649z0 = new C28649z0(this, z);
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: zB3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49101tC3.m12894B2(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LtC3$b;", "Lco/bird/android/model/persistence/Bird;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$l */
    /* loaded from: classes3.dex */
    public static final class C28617l extends Lambda implements Function1<Pair<? extends EnumC28589b, ? extends Bird>, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110102g;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: tC3$l$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C28618a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC28589b.values().length];
                try {
                    iArr[EnumC28589b.TRIP_ODOMETER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC28589b.TOTAL_ODOMETER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC28589b.SERVICE_INDICATOR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28617l(C49101tC3 c49101tC3) {
            super(1);
            this.f110102g = c49101tC3;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<? extends EnumC28589b, Bird> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Bird bird = pair.component2();
            C49101tC3 c49101tC3 = this.f110102g;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            VehicleDescriptor m12874G2 = c49101tC3.m12874G2(bird);
            int i = C28618a.$EnumSwitchMapping$0[pair.component1().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return this.f110102g.m12836T0().mo15679g(m12874G2);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return this.f110102g.m12836T0().mo15671o(m12874G2);
            }
            return this.f110102g.m12836T0().mo15665u(m12874G2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends EnumC28589b, ? extends Bird> pair) {
            return invoke2((Pair<? extends EnumC28589b, Bird>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\n\u001a²\u0001\u0012R\b\u0001\u0012N\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0007 \u0002*&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0002*X\u0012R\b\u0001\u0012N\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0007 \u0002*&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/VehicleVersion;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "Lkotlin/Triple;", "", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$d */
    /* loaded from: classes3.dex */
    public static final class C28596d extends Lambda implements Function1<Pair<? extends Bird, ? extends VehicleVersion>, InterfaceC23434B<? extends Triple<? extends Bird, ? extends VehicleVersion, ? extends String>>> {

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001aN\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\u0004\u0012\u00020\u0000 \u0004*&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lkotlin/Triple;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/VehicleVersion;", "b", "(Ljava/lang/String;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tC3$d$a */
        /* loaded from: classes3.dex */
        public static final class C28597a extends Lambda implements Function1<String, Triple<? extends Bird, ? extends VehicleVersion, ? extends String>> {

            /* renamed from: g */
            public final /* synthetic */ Bird f110081g;

            /* renamed from: h */
            public final /* synthetic */ VehicleVersion f110082h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28597a(Bird bird, VehicleVersion vehicleVersion) {
                super(1);
                this.f110081g = bird;
                this.f110082h = vehicleVersion;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final Triple<Bird, VehicleVersion, String> invoke(String address) {
                Intrinsics.checkNotNullParameter(address, "address");
                return new Triple<>(this.f110081g, this.f110082h, address);
            }
        }

        public C28596d() {
            super(1);
        }

        /* renamed from: b */
        public static final Triple m12660b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends Triple<Bird, VehicleVersion, String>> invoke2(Pair<Bird, VehicleVersion> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Bird component1 = pair.component1();
            Observable<String> subscribeOn = C49101tC3.this.m12839S0().mo43614r(component1.getLocation().getLatitude(), component1.getLocation().getLongitude()).subscribeOn(C24542a.m31932c());
            final C28597a c28597a = new C28597a(component1, pair.component2());
            return subscribeOn.map(new InterfaceC23492o() { // from class: uC3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m12660b;
                    m12660b = C49101tC3.C28596d.m12660b(Function1.this, obj);
                    return m12660b;
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Triple<? extends Bird, ? extends VehicleVersion, ? extends String>> invoke(Pair<? extends Bird, ? extends VehicleVersion> pair) {
            return invoke2((Pair<Bird, VehicleVersion>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/wire/WireBird;", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Triple;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tC3$x */
    /* loaded from: classes3.dex */
    public static final class C28644x extends Lambda implements Function1<Triple<? extends Bird, ? extends WireBird, ? extends Boolean>, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ C49101tC3 f110125g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28644x(C49101tC3 c49101tC3) {
            super(1);
            this.f110125g = c49101tC3;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Triple<Bird, WireBird, Boolean> triple) {
            WireBird copy;
            AbstractC23461c ignoreElements;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Bird bird = triple.component1();
            WireBird component2 = triple.component2();
            Boolean lightsOn = triple.component3();
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            if (Bird_Kt.isRetailBird(bird)) {
                InterfaceC48164rd5 m12836T0 = this.f110125g.m12836T0();
                VehicleDescriptor m12874G2 = this.f110125g.m12874G2(bird);
                Intrinsics.checkNotNullExpressionValue(lightsOn, "lightsOn");
                ignoreElements = m12836T0.mo15668r(m12874G2, lightsOn.booleanValue());
            } else {
                InterfaceC27246pJ m12860L0 = this.f110125g.m12860L0();
                copy = component2.copy((r91 & 1) != 0 ? component2.f66717id : null, (r91 & 2) != 0 ? component2.model : null, (r91 & 4) != 0 ? component2.taskId : null, (r91 & 8) != 0 ? component2.batteryLevel : 0, (r91 & 16) != 0 ? component2.estimatedRange : null, (r91 & 32) != 0 ? component2.distance : 0, (r91 & 64) != 0 ? component2.location : null, (r91 & 128) != 0 ? component2.code : null, (r91 & 256) != 0 ? component2.stickerId : null, (r91 & 512) != 0 ? component2.serialNumber : null, (r91 & 1024) != 0 ? component2.disconnected : false, (r91 & 2048) != 0 ? component2.collect : false, (r91 & 4096) != 0 ? component2.submerged : false, (r91 & 8192) != 0 ? component2.lost : false, (r91 & 16384) != 0 ? component2.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? component2.ackLocked : false, (r91 & 65536) != 0 ? component2.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? component2.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? component2.broken : false, (r91 & 524288) != 0 ? component2.label : null, (r91 & 1048576) != 0 ? component2.actions : null, (r91 & 2097152) != 0 ? component2.bountyId : null, (r91 & 4194304) != 0 ? component2.bountyPrice : null, (r91 & 8388608) != 0 ? component2.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? component2.bountyLost : false, (r91 & 33554432) != 0 ? component2.bountyOverdue : false, (r91 & 67108864) != 0 ? component2.bountyKind : null, (r91 & 134217728) != 0 ? component2.brandName : null, (r91 & 268435456) != 0 ? component2.taskKind : null, (r91 & 536870912) != 0 ? component2.gpsAt : null, (r91 & 1073741824) != 0 ? component2.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? component2.token : null, (r92 & 1) != 0 ? component2.bluetooth : true, (r92 & 2) != 0 ? component2.cellular : false, (r92 & 4) != 0 ? component2.startedAt : null, (r92 & 8) != 0 ? component2.dueAt : null, (r92 & 16) != 0 ? component2.asleep : false, (r92 & 32) != 0 ? component2.imei : null, (r92 & 64) != 0 ? component2.boardProtocol : null, (r92 & 128) != 0 ? component2.physicalLock : null, (r92 & 256) != 0 ? component2.priorityCollect : false, (r92 & 512) != 0 ? component2.down : false, (r92 & 1024) != 0 ? component2.needsInspection : false, (r92 & 2048) != 0 ? component2.partnerId : null, (r92 & 4096) != 0 ? component2.nestId : null, (r92 & 8192) != 0 ? component2.lastRideEndedAt : null, (r92 & 16384) != 0 ? component2.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? component2.peril : false, (r92 & 65536) != 0 ? component2.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? component2.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? component2.offline : false, (r92 & 524288) != 0 ? component2.license : null, (r92 & 1048576) != 0 ? component2.areaKey : null, (r92 & 2097152) != 0 ? component2.fleetId : null, (r92 & 4194304) != 0 ? component2.nestPurpose : null, (r92 & 8388608) != 0 ? component2.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? component2.scannedAt : null, (r92 & 33554432) != 0 ? component2.badgeType : null, (r92 & 67108864) != 0 ? component2.bountyReasons : null, (r92 & 134217728) != 0 ? component2.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? component2.ephemeralId : null, (r92 & 536870912) != 0 ? component2.hasHelmet : false, (r92 & 1073741824) != 0 ? component2.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? component2.bleMacAddress : null, (r93 & 1) != 0 ? component2.cellId : null, (r93 & 2) != 0 ? component2.externalFeedType : null);
                Intrinsics.checkNotNullExpressionValue(lightsOn, "lightsOn");
                ignoreElements = m12860L0.mo19555c(copy, lightsOn.booleanValue(), true).ignoreElements();
            }
            return ignoreElements.m33063X(C24542a.m31932c()).m33069Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Triple<? extends Bird, ? extends WireBird, ? extends Boolean> triple) {
            return invoke2((Triple<Bird, WireBird, Boolean>) triple);
        }
    }
}
