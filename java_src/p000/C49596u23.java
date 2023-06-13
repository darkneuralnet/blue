package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AlarmType;
import co.bird.android.model.NearbyBirdViewModel;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.Vehicle;
import co.bird.android.model.constant.AlarmCommand;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WirePart;
import co.bird.android.widget.C16634c;
import co.bird.api.request.BLEScanTrigger;
import co.bird.api.response.BirdCodeWithStatus;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23437E;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.AbstractC39873de5;
import p000.C49596u23;
import p000.InterfaceC10636aM;
import p000.InterfaceC27246pJ;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 t2\u00020\u0001:\u0001\u001eB\u0097\u0001\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A\u0012\u0006\u0010H\u001a\u00020E\u0012\u0006\u0010L\u001a\u00020I\u0012\u0006\u0010P\u001a\u00020M\u0012\u0006\u0010T\u001a\u00020Q\u0012\u0006\u0010X\u001a\u00020U\u0012\b\b\u0003\u0010\\\u001a\u00020Y\u0012\b\b\u0003\u0010^\u001a\u00020Y¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0013\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0002J\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010[RX\u0010f\u001aF\u0012\u0004\u0012\u00020`\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020b\u0012\u0006\u0012\u0004\u0018\u00010`\u0012\u0004\u0012\u00020\u000e0a0_j\"\u0012\u0004\u0012\u00020`\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020b\u0012\u0006\u0012\u0004\u0018\u00010`\u0012\u0004\u0012\u00020\u000e0a`c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR$\u0010k\u001a\u0012\u0012\u0004\u0012\u00020`0gj\b\u0012\u0004\u0012\u00020``h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR0\u0010n\u001a\u001e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020l0_j\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020l`c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010eR\u0016\u0010q\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010u\u001a\u00020r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010x\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010{\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010~\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u0080\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010pR\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010pR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010pR@\u0010\u008b\u0001\u001a+\u0012\r\u0012\u000b \u0088\u0001*\u0004\u0018\u00010\b0\b \u0088\u0001*\u0014\u0012\r\u0012\u000b \u0088\u0001*\u0004\u0018\u00010\b0\b\u0018\u00010\u0087\u00010\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0083\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0083\u0001R\u0018\u0010\u0091\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010pR\u0018\u0010\u0093\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010p¨\u0006\u0096\u0001"}, m28432d2 = {"Lu23;", "", "", "o0", "O", "Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/Observable;", "Lco/bird/android/model/Vehicle;", "K", "", "LH6;", "Lco/bird/android/model/NearbyBirdViewModel;", "N", "", "expectingResult", "Landroid/os/Bundle;", "extras", "U", "j0", "d0", "b0", "T", "Landroid/view/MenuItem;", "item", "e0", "", "updateFrequencyMillis", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Llp2;", C17296a.f69688o, "Llp2;", "legacyVehicleScanManager", "LpJ;", "b", "LpJ;", "bluetoothManager", "LyL;", "c", "LyL;", "birdFinderManager", "Lde5;", DateTokenConverter.CONVERTER_KEY, "Lde5;", "rxBleClient", "LaM;", "e", "LaM;", "birdManager", "Llh6;", "f", "Llh6;", "userManager", "LEa;", "g", "LEa;", "analyticsManager", "Lgl;", "h", "Lgl;", "preference", "LTq4;", "i", "LTq4;", "reactiveConfig", "Lxk6;", "j", "Lxk6;", "vehicleBirdHydrationManager", "Lcom/uber/autodispose/ScopeProvider;", "k", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "l", "Le13;", "navigator", "Ly23;", "m", "Ly23;", "ui", "Landroid/content/ClipboardManager;", "n", "Landroid/content/ClipboardManager;", "clipboardManager", "LA13;", "o", "LA13;", "converter", "Lio/reactivex/E;", "p", "Lio/reactivex/E;", "intervalScheduler", "q", "bufferScheduler", "Ljava/util/HashMap;", "", "Lkotlin/Triple;", "Lco/bird/api/response/BirdCodeWithStatus;", "Lkotlin/collections/HashMap;", "r", "Ljava/util/HashMap;", "serialNumberScanResultMap", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "s", "Ljava/util/HashSet;", "serialNumberBlacklist", "Lco/bird/android/model/wire/WirePart;", "t", "birdSerialPartMap", "u", "Z", "forceScanComplete", "", "v", "I", "forceScanSeconds", "w", "J", "scanSecondsRemaining", "x", "Lco/bird/android/model/wire/WireBird;", "filterBird", "y", "Ljava/lang/String;", "pendingActionTitle", "z", "shouldShowCaptureModalOnFound", "Lio/reactivex/disposables/c;", "A", "Lio/reactivex/disposables/c;", "sweepDisposable", "B", "filterBirdFound", "Lio/reactivex/flowables/a;", "kotlin.jvm.PlatformType", "D", "Lio/reactivex/flowables/a;", "hotSweepFlowable", "E", "disposable", "F", "captureModalDisposable", "G", "shouldShowAddButton", "H", "shouldShowOptionsButton", "<init>", "(Llp2;LpJ;LyL;Lde5;LaM;Llh6;LEa;Lgl;LTq4;Lxk6;Lcom/uber/autodispose/ScopeProvider;Le13;Ly23;Landroid/content/ClipboardManager;LA13;Lio/reactivex/E;Lio/reactivex/E;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNearbyBirdsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsPresenter.kt\nco/bird/android/app/feature/nearbybirds/NearbyBirdsPresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 6 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,433:1\n1#2:434\n1#2:466\n180#3:435\n180#3:436\n180#3:437\n180#3:438\n180#3:439\n180#3:440\n180#3:441\n180#3:442\n161#3:443\n218#3:444\n1360#4:445\n1446#4,5:446\n1603#4,9:451\n1855#4:460\n1856#4:467\n1612#4:468\n18#5:461\n9#6,4:462\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsPresenter.kt\nco/bird/android/app/feature/nearbybirds/NearbyBirdsPresenter\n*L\n430#1:466\n132#1:435\n142#1:436\n193#1:437\n197#1:438\n266#1:439\n283#1:440\n327#1:441\n335#1:442\n383#1:443\n409#1:444\n429#1:445\n429#1:446,5\n430#1:451,9\n430#1:460\n430#1:467\n430#1:468\n430#1:461\n430#1:462,4\n*E\n"})
/* renamed from: u23  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49596u23 {

    /* renamed from: I */
    public static final C29008a f111548I = new C29008a(null);

    /* renamed from: J */
    public static final int f111549J = 8;

    /* renamed from: A */
    public InterfaceC23465c f111550A;

    /* renamed from: B */
    public boolean f111551B;

    /* renamed from: C */
    public boolean f111552C;

    /* renamed from: D */
    public final AbstractC23477a<Vehicle> f111553D;

    /* renamed from: E */
    public InterfaceC23465c f111554E;

    /* renamed from: F */
    public InterfaceC23465c f111555F;

    /* renamed from: G */
    public boolean f111556G;

    /* renamed from: H */
    public boolean f111557H;

    /* renamed from: a */
    public final InterfaceC44723lp2 f111558a;

    /* renamed from: b */
    public final InterfaceC27246pJ f111559b;

    /* renamed from: c */
    public final InterfaceC30556yL f111560c;

    /* renamed from: d */
    public final AbstractC39873de5 f111561d;

    /* renamed from: e */
    public final InterfaceC10636aM f111562e;

    /* renamed from: f */
    public final InterfaceC44647lh6 f111563f;

    /* renamed from: g */
    public final InterfaceC1880Ea f111564g;

    /* renamed from: h */
    public final C22454gl f111565h;

    /* renamed from: i */
    public final C36207Tq4 f111566i;

    /* renamed from: j */
    public final InterfaceC51791xk6 f111567j;

    /* renamed from: k */
    public final ScopeProvider f111568k;

    /* renamed from: l */
    public final InterfaceC40099e13 f111569l;

    /* renamed from: m */
    public final InterfaceC51967y23 f111570m;

    /* renamed from: n */
    public final ClipboardManager f111571n;

    /* renamed from: o */
    public final A13 f111572o;

    /* renamed from: p */
    public final AbstractC23437E f111573p;

    /* renamed from: q */
    public final AbstractC23437E f111574q;

    /* renamed from: r */
    public final HashMap<String, Triple<BirdCodeWithStatus, String, Boolean>> f111575r;

    /* renamed from: s */
    public final HashSet<String> f111576s;

    /* renamed from: t */
    public final HashMap<String, WirePart> f111577t;

    /* renamed from: u */
    public boolean f111578u;

    /* renamed from: v */
    public int f111579v;

    /* renamed from: w */
    public long f111580w;

    /* renamed from: x */
    public WireBird f111581x;

    /* renamed from: y */
    public String f111582y;

    /* renamed from: z */
    public boolean f111583z;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u23$A */
    /* loaded from: classes2.dex */
    public static final class C29007A extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C29007A f111584g = new C29007A();

        public C29007A() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lu23$a;", "", "", "ZENDESK_ARTICLE", "J", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: u23$a */
    /* loaded from: classes2.dex */
    public static final class C29008a {
        public /* synthetic */ C29008a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29008a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00052(\u0010\u0004\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "", "it", "Lna4;", "invoke", "(Ljava/util/List;)Lna4;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u23$b */
    /* loaded from: classes2.dex */
    public static final class C29009b extends Lambda implements Function1<List<Vehicle>, InterfaceC45761na4<? extends Vehicle>> {

        /* renamed from: g */
        public static final C29009b f111585g = new C29009b();

        public C29009b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC45761na4<? extends Vehicle> invoke(List<Vehicle> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC24490k.m32141i0(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/u;", "Lco/bird/android/model/NearbyBirdViewModel;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u23$c */
    /* loaded from: classes2.dex */
    public static final class C29010c extends Lambda implements Function1<Vehicle, InterfaceC24574u<? extends NearbyBirdViewModel>> {
        public C29010c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends NearbyBirdViewModel> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C49596u23.this.f111567j.mo4752a(it, C49596u23.this.f111575r, C49596u23.this.f111576s, C49596u23.this.f111577t);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/NearbyBirdViewModel;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/NearbyBirdViewModel;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u23$d */
    /* loaded from: classes2.dex */
    public static final class C29011d extends Lambda implements Function1<NearbyBirdViewModel, Boolean> {
        public C29011d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(NearbyBirdViewModel it) {
            Intrinsics.checkNotNullParameter(it, "it");
            WireBird wireBird = C49596u23.this.f111581x;
            boolean z = true;
            if (wireBird != null && !Intrinsics.areEqual(wireBird.getId(), it.getVehicle().getBird().getId()) && !WireBirdKt.isProbablySameBird(wireBird, it.getVehicle().getBird())) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/NearbyBirdViewModel;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/NearbyBirdViewModel;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u23$e */
    /* loaded from: classes2.dex */
    public static final class C29012e extends Lambda implements Function1<NearbyBirdViewModel, Unit> {
        public C29012e() {
            super(1);
        }

        /* renamed from: a */
        public final void m10967a(NearbyBirdViewModel nearbyBirdViewModel) {
            if (C49596u23.this.f111581x != null) {
                if (!C49596u23.this.f111578u) {
                    C49596u23.this.f111570m.topToast(C45871nl4.nearby_birds_forced_scan_bird_found, EnumC40735f56.SHORT);
                }
                C49596u23.this.f111551B = true;
                C49596u23.this.f111578u = true;
                C49596u23.this.m11022O();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NearbyBirdViewModel nearbyBirdViewModel) {
            m10967a(nearbyBirdViewModel);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/NearbyBirdViewModel;", "viewModel", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/NearbyBirdViewModel;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u23$f */
    /* loaded from: classes2.dex */
    public static final class C29013f extends Lambda implements Function1<NearbyBirdViewModel, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C29013f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(NearbyBirdViewModel viewModel) {
            List<NearbyBirdViewModel> listOf;
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            C49596u23 c49596u23 = C49596u23.this;
            List<NearbyBirdViewModel> m11023N = c49596u23.m11023N(c49596u23.f111570m.mo1917q0());
            A13 a13 = C49596u23.this.f111572o;
            listOf = CollectionsKt__CollectionsJVMKt.listOf(viewModel);
            return a13.m116191c(listOf, m11023N, C49596u23.this.f111566i.m82623f8().getValue().getOperatorConfig().getFeatures().getSweepBirds().getEnableSignalBuckets());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "sections", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u23$g */
    /* loaded from: classes2.dex */
    public static final class C29014g extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C29014g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> sections) {
            C49596u23.this.f111570m.mo1928Qi(false);
            InterfaceC51967y23 interfaceC51967y23 = C49596u23.this.f111570m;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            interfaceC51967y23.mo1924b(sections);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u23$h */
    /* loaded from: classes2.dex */
    public static final class C29015h extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C29015h f111591g = new C29015h();

        public C29015h() {
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
    /* renamed from: u23$i */
    /* loaded from: classes2.dex */
    public static final class C29016i extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: g */
        public static final C29016i f111592g = new C29016i();

        public C29016i() {
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
    /* renamed from: u23$j */
    /* loaded from: classes2.dex */
    public static final class C29017j extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, InterfaceC45761na4<? extends Vehicle>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: u23$j$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C29018a {
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

        public C29017j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC45761na4<? extends Vehicle> invoke(AbstractC39873de5.EnumC19828a state) {
            int i;
            Intrinsics.checkNotNullParameter(state, "state");
            AbstractC39873de5.EnumC19828a mo33641c = C49596u23.this.f111561d.mo33641c();
            if (mo33641c == null) {
                i = -1;
            } else {
                i = C29018a.$EnumSwitchMapping$0[mo33641c.ordinal()];
            }
            if (i == 1) {
                return C49596u23.this.f111558a.mo11726b(BLEScanTrigger.BIRD_FINDER).m32172T0(C49596u23.this.f111560c.mo3649d().values()).m32093z0(AbstractC24490k.m32181P());
            }
            return AbstractC24490k.m32181P();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/widget/c$b;", "kotlin.jvm.PlatformType", "button", "", C17296a.f69688o, "(Lco/bird/android/widget/c$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u23$k */
    /* loaded from: classes2.dex */
    public static final class C29019k extends Lambda implements Function1<C16634c.EnumC16636b, Unit> {
        public C29019k() {
            super(1);
        }

        /* renamed from: a */
        public final void m10963a(C16634c.EnumC16636b enumC16636b) {
            boolean z;
            Intent intent = new Intent();
            intent.putExtra("co.bird.android.bird_finder_bird_found", C49596u23.this.f111551B);
            if (enumC16636b == C16634c.EnumC16636b.PRIMARY) {
                z = true;
            } else {
                z = false;
            }
            intent.putExtra("co.bird.android.bird_capture_action", z);
            C49596u23.this.f111569l.mo37029e4(-1, intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C16634c.EnumC16636b enumC16636b) {
            m10963a(enumC16636b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/widget/c$b;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/widget/c$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u23$l */
    /* loaded from: classes2.dex */
    public static final class C29020l extends Lambda implements Function1<C16634c.EnumC16636b, Unit> {

        /* renamed from: g */
        public static final C29020l f111595g = new C29020l();

        public C29020l() {
            super(1);
        }

        /* renamed from: a */
        public final void m10962a(C16634c.EnumC16636b enumC16636b) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C16634c.EnumC16636b enumC16636b) {
            m10962a(enumC16636b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u23$m */
    /* loaded from: classes2.dex */
    public static final class C29021m extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C29021m f111596g = new C29021m();

        public C29021m() {
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

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u23$n */
    /* loaded from: classes2.dex */
    public static final class C29022n extends Lambda implements Function1<Pair<? extends Boolean, ? extends User>, Unit> {
        public C29022n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends User> pair) {
            invoke2((Pair<Boolean, User>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, User> pair) {
            boolean booleanValue = pair.component1().booleanValue();
            User user = pair.component2();
            boolean z = false;
            C49596u23.this.f111570m.mo1916qh(booleanValue || user.getAdmin());
            InterfaceC51967y23 interfaceC51967y23 = C49596u23.this.f111570m;
            if ((user != null && UserKt.isOperator(user)) && booleanValue) {
                z = true;
            }
            interfaceC51967y23.mo1932D1(z);
            InterfaceC51967y23 interfaceC51967y232 = C49596u23.this.f111570m;
            Intrinsics.checkNotNullExpressionValue(user, "user");
            interfaceC51967y232.mo1915qj(UserKt.isOperator(user));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u23$o */
    /* loaded from: classes2.dex */
    public static final class C29023o extends Lambda implements Function1<Unit, Unit> {
        public C29023o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            Intent intent = new Intent();
            intent.putExtra("co.bird.android.bird_finder_bird_found", C49596u23.this.f111551B);
            C49596u23.this.f111569l.mo37029e4(-1, intent);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u23$p */
    /* loaded from: classes2.dex */
    public static final class C29024p extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C29024p f111599g = new C29024p();

        public C29024p() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u23$q */
    /* loaded from: classes2.dex */
    public static final class C29025q extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends Boolean>> {

        /* renamed from: h */
        public final /* synthetic */ boolean f111601h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lt13;", "option", "Lio/reactivex/B;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lt13;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: u23$q$a */
        /* loaded from: classes2.dex */
        public static final class C29026a extends Lambda implements Function1<EnumC48993t13, InterfaceC23434B<? extends Vehicle>> {

            /* renamed from: g */
            public final /* synthetic */ C49596u23 f111602g;

            /* renamed from: h */
            public final /* synthetic */ WireBird f111603h;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: u23$q$a$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C29027a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC48993t13.values().length];
                    try {
                        iArr[EnumC48993t13.f109699g.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC48993t13.f109700h.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC48993t13.f109701i.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC48993t13.f109702j.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[EnumC48993t13.f109703k.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[EnumC48993t13.f109704l.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29026a(C49596u23 c49596u23, WireBird wireBird) {
                super(1);
                this.f111602g = c49596u23;
                this.f111603h = wireBird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23434B<? extends Vehicle> invoke(EnumC48993t13 option) {
                List listOf;
                Intrinsics.checkNotNullParameter(option, "option");
                switch (C29027a.$EnumSwitchMapping$0[option.ordinal()]) {
                    case 1:
                        this.f111602g.f111571n.setPrimaryClip(ClipData.newPlainText("Bird Code", this.f111603h.getCode()));
                        return Observable.empty();
                    case 2:
                        this.f111602g.f111571n.setPrimaryClip(ClipData.newPlainText("Bird S/N", this.f111603h.getSerialNumber()));
                        return Observable.empty();
                    case 3:
                        C49596u23 c49596u23 = this.f111602g;
                        WireBird bird = this.f111603h;
                        Intrinsics.checkNotNullExpressionValue(bird, "bird");
                        return c49596u23.m11026K(bird);
                    case 4:
                        InterfaceC40099e13 interfaceC40099e13 = this.f111602g.f111569l;
                        listOf = CollectionsKt__CollectionsJVMKt.listOf(this.f111603h.getId());
                        InterfaceC40099e13.C19924a.goToReportFraudWriteDescription$default(interfaceC40099e13, listOf, null, 2, null);
                        return Observable.empty();
                    case 5:
                        Intent intent = new Intent();
                        C49596u23 c49596u232 = this.f111602g;
                        WireBird wireBird = this.f111603h;
                        intent.putExtra("bird", wireBird);
                        intent.putExtra("part", (WirePart) c49596u232.f111577t.get(wireBird.getSerialNumber()));
                        this.f111602g.f111569l.mo37029e4(-1, intent);
                        return Observable.empty();
                    case 6:
                        this.f111602g.f111570m.mo1927S4(this.f111603h.getId());
                        return Observable.empty();
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: u23$q$b */
        /* loaded from: classes2.dex */
        public static final class C29028b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C29028b f111604g = new C29028b();

            public C29028b() {
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

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: u23$q$c */
        /* loaded from: classes2.dex */
        public static final class C29029c extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ C49596u23 f111605g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29029c(C49596u23 c49596u23) {
                super(1);
                this.f111605g = c49596u23;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23434B<? extends Boolean> invoke(Vehicle it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f111605g.f111558a.mo11727a(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29025q(boolean z) {
            super(1);
            this.f111601h = z;
        }

        /* renamed from: e */
        public static final InterfaceC23434B m10957e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final void m10956f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final InterfaceC23434B m10955g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23434B<? extends Boolean> invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            Observable<EnumC48993t13> m32045d0 = C49596u23.this.f111570m.mo1931E9(C49596u23.this.f111565h.m37571t0(), this.f111601h).m32045d0();
            final C29026a c29026a = new C29026a(C49596u23.this, bird);
            Observable<R> flatMap = m32045d0.flatMap(new InterfaceC23492o() { // from class: v23
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m10957e;
                    m10957e = C49596u23.C29025q.m10957e(Function1.this, obj);
                    return m10957e;
                }
            });
            final C29028b c29028b = C29028b.f111604g;
            Observable onErrorResumeNext = flatMap.doOnError(new InterfaceC23484g() { // from class: w23
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49596u23.C29025q.m10956f(Function1.this, obj);
                }
            }).onErrorResumeNext(Observable.empty());
            final C29029c c29029c = new C29029c(C49596u23.this);
            return onErrorResumeNext.flatMap(new InterfaceC23492o() { // from class: x23
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m10955g;
                    m10955g = C49596u23.C29025q.m10955g(Function1.this, obj);
                    return m10955g;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u23$r */
    /* loaded from: classes2.dex */
    public static final class C29030r extends Lambda implements Function1<WireBird, Unit> {
        public C29030r() {
            super(1);
        }

        /* renamed from: a */
        public final void m10952a(WireBird wireBird) {
            Intent intent = new Intent();
            intent.putExtra("co.bird.android.bird_filter_added_bird", wireBird);
            C49596u23.this.f111569l.mo37029e4(-1, intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m10952a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u23$s */
    /* loaded from: classes2.dex */
    public static final class C29031s extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C29031s f111607g = new C29031s();

        public C29031s() {
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u23$t */
    /* loaded from: classes2.dex */
    public static final class C29032t extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {
        public C29032t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke2((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Boolean> pair) {
            C49596u23.this.f111570m.mo1914r9(pair.component1().booleanValue() || pair.component2().booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/NearbyBirdViewModel;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u23$u */
    /* loaded from: classes2.dex */
    public static final class C29033u extends Lambda implements Function1<Pair<? extends Integer, ? extends Integer>, List<? extends NearbyBirdViewModel>> {
        public C29033u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends NearbyBirdViewModel> invoke(Pair<? extends Integer, ? extends Integer> pair) {
            return invoke2((Pair<Integer, Integer>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<NearbyBirdViewModel> invoke2(Pair<Integer, Integer> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            int intValue = pair.component1().intValue();
            int intValue2 = pair.component2().intValue();
            C49596u23.this.f111572o.m116188f(intValue);
            C49596u23.this.f111572o.m116189e(intValue2);
            C49596u23.this.f111565h.m37581q2(intValue, intValue2);
            C49596u23 c49596u23 = C49596u23.this;
            return c49596u23.m11023N(c49596u23.f111570m.mo1917q0());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/NearbyBirdViewModel;", "previousBirds", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u23$v */
    /* loaded from: classes2.dex */
    public static final class C29034v extends Lambda implements Function1<List<? extends NearbyBirdViewModel>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C29034v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<NearbyBirdViewModel> previousBirds) {
            List<NearbyBirdViewModel> emptyList;
            Intrinsics.checkNotNullParameter(previousBirds, "previousBirds");
            A13 a13 = C49596u23.this.f111572o;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return a13.m116191c(emptyList, previousBirds, C49596u23.this.f111566i.m82623f8().getValue().getOperatorConfig().getFeatures().getSweepBirds().getEnableSignalBuckets());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u23$w */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C29035w extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C29035w(Object obj) {
            super(1, obj, InterfaceC51967y23.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC51967y23) this.receiver).mo1924b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "updateFrequencyInMillis", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u23$x */
    /* loaded from: classes2.dex */
    public static final class C29036x extends Lambda implements Function1<Integer, Unit> {
        public C29036x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer updateFrequencyInMillis) {
            C49596u23.this.m11034C(updateFrequencyInMillis.intValue());
            C22454gl c22454gl = C49596u23.this.f111565h;
            Intrinsics.checkNotNullExpressionValue(updateFrequencyInMillis, "updateFrequencyInMillis");
            c22454gl.m37577r2(updateFrequencyInMillis.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u23$y */
    /* loaded from: classes2.dex */
    public static final class C29037y extends Lambda implements Function1<Long, Unit> {
        public C29037y() {
            super(1);
        }

        /* renamed from: a */
        public final void m10950a(Long it) {
            C49596u23 c49596u23 = C49596u23.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c49596u23.f111580w = c49596u23.f111579v - it.longValue();
            if (C49596u23.this.f111580w <= 0) {
                C49596u23.this.f111578u = true;
            }
            C49596u23.this.m10981o0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m10950a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u23$z */
    /* loaded from: classes2.dex */
    public static final class C29038z extends Lambda implements Function1<Long, Unit> {

        /* renamed from: g */
        public static final C29038z f111613g = new C29038z();

        public C29038z() {
            super(1);
        }

        /* renamed from: a */
        public final void m10949a(Long l) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m10949a(l);
            return Unit.INSTANCE;
        }
    }

    public C49596u23(InterfaceC44723lp2 legacyVehicleScanManager, InterfaceC27246pJ bluetoothManager, InterfaceC30556yL birdFinderManager, AbstractC39873de5 rxBleClient, InterfaceC10636aM birdManager, InterfaceC44647lh6 userManager, InterfaceC1880Ea analyticsManager, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC51791xk6 vehicleBirdHydrationManager, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC51967y23 ui, ClipboardManager clipboardManager, A13 converter, AbstractC23437E intervalScheduler, AbstractC23437E bufferScheduler) {
        Intrinsics.checkNotNullParameter(legacyVehicleScanManager, "legacyVehicleScanManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(birdFinderManager, "birdFinderManager");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(vehicleBirdHydrationManager, "vehicleBirdHydrationManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(clipboardManager, "clipboardManager");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(intervalScheduler, "intervalScheduler");
        Intrinsics.checkNotNullParameter(bufferScheduler, "bufferScheduler");
        this.f111558a = legacyVehicleScanManager;
        this.f111559b = bluetoothManager;
        this.f111560c = birdFinderManager;
        this.f111561d = rxBleClient;
        this.f111562e = birdManager;
        this.f111563f = userManager;
        this.f111564g = analyticsManager;
        this.f111565h = preference;
        this.f111566i = reactiveConfig;
        this.f111567j = vehicleBirdHydrationManager;
        this.f111568k = scopeProvider;
        this.f111569l = navigator;
        this.f111570m = ui;
        this.f111571n = clipboardManager;
        this.f111572o = converter;
        this.f111573p = intervalScheduler;
        this.f111574q = bufferScheduler;
        this.f111575r = new HashMap<>();
        this.f111576s = new HashSet<>();
        this.f111577t = new HashMap<>();
        this.f111578u = true;
        AbstractC24490k<AbstractC39873de5.EnumC19828a> flowable = rxBleClient.mo33640d().startWith((Observable<AbstractC39873de5.EnumC19828a>) rxBleClient.mo33641c()).distinctUntilChanged().toFlowable(EnumC23460b.BUFFER);
        final C29017j c29017j = new C29017j();
        this.f111553D = flowable.m32167W(new InterfaceC23492o() { // from class: e23
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m11024M;
                m11024M = C49596u23.m11024M(Function1.this, obj);
                return m11024M;
            }
        }).m32204D0();
        this.f111557H = true;
    }

    /* renamed from: D */
    public static final InterfaceC45761na4 m11033D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final InterfaceC24574u m11032E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final boolean m11031F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: G */
    public static final void m11030G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC23447K m11029H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m11028I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m11027J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23434B m11025L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC45761na4 m11024M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m11021P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m11020Q(C49596u23 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f111555F = null;
    }

    /* renamed from: R */
    public static final void m11019R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m11018S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m11015V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m11014W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m11013X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC23434B m11012Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m11011Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m11009a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m11005c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final List m10999f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final InterfaceC23447K m10997g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m10995h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m10993i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m10989k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m10987l0(C49596u23 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f111580w <= 0) {
            this$0.f111578u = true;
        }
    }

    /* renamed from: m0 */
    public static final void m10985m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m10983n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public final void m11034C(long j) {
        InterfaceC23465c interfaceC23465c;
        InterfaceC23465c interfaceC23465c2 = this.f111550A;
        boolean z = false;
        if (interfaceC23465c2 != null && !interfaceC23465c2.mo1769e()) {
            z = true;
        }
        if (z && (interfaceC23465c = this.f111550A) != null) {
            interfaceC23465c.dispose();
        }
        AbstractC24490k<List<Vehicle>> m32147g = this.f111553D.m32147g(j, TimeUnit.MILLISECONDS, this.f111574q, Integer.MAX_VALUE);
        final C29009b c29009b = C29009b.f111585g;
        AbstractC24490k<R> m32167W = m32147g.m32167W(new InterfaceC23492o() { // from class: f23
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m11033D;
                m11033D = C49596u23.m11033D(Function1.this, obj);
                return m11033D;
            }
        });
        final C29010c c29010c = new C29010c();
        AbstractC24490k m32154d0 = m32167W.m32154d0(new InterfaceC23492o() { // from class: g23
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m11032E;
                m11032E = C49596u23.m11032E(Function1.this, obj);
                return m11032E;
            }
        });
        final C29011d c29011d = new C29011d();
        AbstractC24490k m32175S = m32154d0.m32175S(new InterfaceC23494q() { // from class: h23
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m11031F;
                m11031F = C49596u23.m11031F(Function1.this, obj);
                return m11031F;
            }
        });
        final C29012e c29012e = new C29012e();
        AbstractC24490k m32191K = m32175S.m32191K(new InterfaceC23484g() { // from class: i23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49596u23.m11030G(Function1.this, obj);
            }
        });
        final C29013f c29013f = new C29013f();
        AbstractC24490k m32111s0 = m32191K.m32149f0(new InterfaceC23492o() { // from class: j23
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m11029H;
                m11029H = C49596u23.m11029H(Function1.this, obj);
                return m11029H;
            }
        }).m32192J0().m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "fun bluetoothScanForBird…Timber.e(it)\n      })\n  }");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(this.f111568k));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29014g c29014g = new C29014g();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: k23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49596u23.m11028I(Function1.this, obj);
            }
        };
        final C29015h c29015h = C29015h.f111591g;
        this.f111550A = ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: l23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49596u23.m11027J(Function1.this, obj);
            }
        });
    }

    /* renamed from: K */
    public final Observable<Vehicle> m11026K(WireBird wireBird) {
        Observable alarm$default = InterfaceC10636aM.C10637a.alarm$default(this.f111562e, wireBird, AlarmCommand.AUTO, null, 4, null);
        final C29016i c29016i = C29016i.f111592g;
        Observable<Vehicle> flatMap = alarm$default.flatMap(new InterfaceC23492o() { // from class: T13
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m11025L;
                m11025L = C49596u23.m11025L(Function1.this, obj);
                return m11025L;
            }
        });
        if (wireBird.getBluetooth()) {
            Observable<Vehicle> onErrorResumeNext = InterfaceC27246pJ.C27247a.alarm$default(this.f111559b, wireBird, AlarmType.SHORT, true, false, 8, null).onErrorResumeNext(flatMap);
            Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "{\n      bluetoothManager…eNext(networkChirp)\n    }");
            return onErrorResumeNext;
        }
        Intrinsics.checkNotNullExpressionValue(flatMap, "{\n      networkChirp\n    }");
        return flatMap;
    }

    /* renamed from: N */
    public final List<NearbyBirdViewModel> m11023N(List<C3023H6> list) {
        ArrayList<C2637G6> arrayList = new ArrayList();
        for (C3023H6 c3023h6 : list) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, c3023h6.m104410c());
        }
        ArrayList arrayList2 = new ArrayList();
        for (C2637G6 c2637g6 : arrayList) {
            Object m105816c = c2637g6.m105816c();
            if (!(m105816c instanceof NearbyBirdViewModel)) {
                m105816c = null;
            }
            NearbyBirdViewModel nearbyBirdViewModel = (NearbyBirdViewModel) m105816c;
            if (nearbyBirdViewModel != null) {
                arrayList2.add(nearbyBirdViewModel);
            }
        }
        return arrayList2;
    }

    /* renamed from: O */
    public final void m11022O() {
        if (this.f111583z && this.f111555F == null) {
            AbstractC24507p<C16634c.EnumC16636b> mo1926Se = this.f111570m.mo1926Se(C45871nl4.nearby_birds_capture_modal_primary_button, C45871nl4.nearby_birds_capture_modal_subtitle);
            final C29019k c29019k = new C29019k();
            AbstractC24507p<C16634c.EnumC16636b> m32032m = mo1926Se.m32026s(new InterfaceC23484g() { // from class: Y13
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49596u23.m11021P(Function1.this, obj);
                }
            }).m32032m(new InterfaceC23478a() { // from class: Z13
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C49596u23.m11020Q(C49596u23.this);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32032m, "private fun maybeShowCap…(it)\n        })\n    }\n  }");
            Object m32048b = m32032m.m32048b(AutoDispose.m45239a(this.f111568k));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C29020l c29020l = C29020l.f111595g;
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: a23
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49596u23.m11019R(Function1.this, obj);
                }
            };
            final C29021m c29021m = C29021m.f111596g;
            this.f111555F = ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: b23
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49596u23.m11018S(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: T */
    public final boolean m11017T() {
        boolean z;
        long j = this.f111580w;
        if (j > 0 && !this.f111578u) {
            z = false;
        } else {
            z = true;
        }
        if (z && this.f111581x != null) {
            Intent intent = new Intent();
            intent.putExtra("co.bird.android.bird_finder_bird_found", this.f111551B);
            this.f111569l.mo37029e4(0, intent);
            return true;
        }
        if (!z) {
            InterfaceC51967y23 interfaceC51967y23 = this.f111570m;
            interfaceC51967y23.topToast(interfaceC51967y23.getString(C45871nl4.nearby_birds_forced_scan_back_prevented, String.valueOf(j)), EnumC40735f56.SHORT);
        }
        return z;
    }

    /* renamed from: U */
    public final void m11016U(boolean z, Bundle bundle) {
        int i;
        WireBird wireBird;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f111552C = z;
        boolean z5 = false;
        if (bundle != null) {
            i = bundle.getInt("co.bird.android.bird_finder_force_scan_duration_seconds");
        } else {
            i = 0;
        }
        this.f111579v = i;
        String str = null;
        if (bundle != null) {
            wireBird = (WireBird) bundle.getParcelable("co.bird.android.bird_finder_filter_bird");
        } else {
            wireBird = null;
        }
        this.f111581x = wireBird;
        if (bundle != null) {
            str = bundle.getString("co.bird.android.bird_pending_action_title");
        }
        this.f111582y = str;
        if (bundle != null) {
            z2 = bundle.getBoolean("co.bird.android.bird_show_capture_on_bird_found");
        } else {
            z2 = false;
        }
        this.f111583z = z2;
        if (bundle != null) {
            z3 = bundle.getBoolean("co.bird.android.bird_show_add_button");
        } else {
            z3 = false;
        }
        this.f111556G = z3;
        if (bundle != null) {
            z4 = bundle.getBoolean("co.bird.android.bird_show_options_button");
        } else {
            z4 = true;
        }
        this.f111557H = z4;
        int i2 = this.f111579v;
        this.f111580w = i2;
        if (i2 == 0) {
            z5 = true;
        }
        this.f111578u = z5;
        this.f111554E = this.f111553D.m33007x1();
        Pair<Integer, Integer> m37619h0 = this.f111565h.m37619h0();
        int intValue = m37619h0.component1().intValue();
        int intValue2 = m37619h0.component2().intValue();
        this.f111572o.m116188f(intValue);
        this.f111572o.m116189e(intValue2);
        C24523e c24523e = C24523e.f91168a;
        Observable<Boolean> m82471t6 = this.f111566i.m82471t6();
        Observable<User> m33123k0 = this.f111563f.getUser().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "userManager.getUser().toObservable()");
        Observable observeOn = c24523e.m31956a(m82471t6, m33123k0).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f111568k));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29022n c29022n = new C29022n();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: o23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49596u23.m11015V(Function1.this, obj);
            }
        });
        m11034C(this.f111565h.m37615i0());
        Object m33094as2 = this.f111570m.mo1920l0().m33094as(AutoDispose.m45239a(this.f111568k));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29023o c29023o = new C29023o();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: p23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49596u23.m11014W(Function1.this, obj);
            }
        };
        final C29024p c29024p = C29024p.f111599g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: q23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49596u23.m11013X(Function1.this, obj);
            }
        });
        Observable<WireBird> mo1918oe = this.f111570m.mo1918oe();
        final C29025q c29025q = new C29025q(z);
        Observable<R> flatMap = mo1918oe.flatMap(new InterfaceC23492o() { // from class: r23
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m11012Y;
                m11012Y = C49596u23.m11012Y(Function1.this, obj);
                return m11012Y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "fun onCreate(expectingRe…pdateEmptyStateView()\n  }");
        Object m33094as3 = flatMap.m33094as(AutoDispose.m45239a(this.f111568k));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe();
        Object m33094as4 = this.f111570m.mo1921l().m33094as(AutoDispose.m45239a(this.f111568k));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29030r c29030r = new C29030r();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: s23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49596u23.m11011Z(Function1.this, obj);
            }
        };
        final C29031s c29031s = C29031s.f111607g;
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: t23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49596u23.m11009a0(Function1.this, obj);
            }
        });
        this.f111570m.mo1913u7(this.f111556G);
        this.f111570m.mo1929Oc(this.f111557H);
        m10981o0();
    }

    /* renamed from: b0 */
    public final void m11007b0() {
        Observable observeOn = C24523e.f91168a.m31956a(this.f111566i.m82450v6(), this.f111566i.m82430x6()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f111568k));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29032t c29032t = new C29032t();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: c23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49596u23.m11005c0(Function1.this, obj);
            }
        });
    }

    /* renamed from: d0 */
    public final void m11003d0() {
        InterfaceC23465c interfaceC23465c = this.f111554E;
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
        }
    }

    /* renamed from: e0 */
    public final boolean m11001e0(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == C36585Vg4.infoButton) {
            this.f111569l.mo36922w3(360024869691L);
            return true;
        } else if (itemId == C36585Vg4.filter) {
            R13 mo1923d3 = this.f111570m.mo1923d3();
            Observable<Pair<Integer, Integer>> signalFilterChanges = mo1923d3.signalFilterChanges();
            final C29033u c29033u = new C29033u();
            Observable<R> map = signalFilterChanges.map(new InterfaceC23492o() { // from class: U13
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m10999f0;
                    m10999f0 = C49596u23.m10999f0(Function1.this, obj);
                    return m10999f0;
                }
            });
            final C29034v c29034v = new C29034v();
            Observable observeOn = map.flatMapSingle(new InterfaceC23492o() { // from class: V13
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m10997g0;
                    m10997g0 = C49596u23.m10997g0(Function1.this, obj);
                    return m10997g0;
                }
            }).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn, "fun onOptionsItemSelecte…-> return false\n    }\n  }");
            Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f111568k));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C29035w c29035w = new C29035w(this.f111570m);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: W13
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49596u23.m10995h0(Function1.this, obj);
                }
            });
            Observable<Integer> updateFrequencyChanges = mo1923d3.updateFrequencyChanges();
            final C29036x c29036x = new C29036x();
            Observable<Integer> doOnNext = updateFrequencyChanges.doOnNext(new InterfaceC23484g() { // from class: X13
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49596u23.m10993i0(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(doOnNext, "fun onOptionsItemSelecte…-> return false\n    }\n  }");
            Object m33094as2 = doOnNext.m33094as(AutoDispose.m45239a(this.f111568k));
            Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((ObservableSubscribeProxy) m33094as2).subscribe();
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: j0 */
    public final void m10991j0() {
        int i = this.f111579v;
        if (i > 0) {
            if (this.f111580w > 0) {
                this.f111580w = i;
            }
            Observable<Long> observeOn = Observable.intervalRange(0L, 1 + i, 0L, 1L, TimeUnit.SECONDS, this.f111573p).observeOn(C23454a.m33087a());
            final C29037y c29037y = new C29037y();
            Observable<Long> doFinally = observeOn.doOnNext(new InterfaceC23484g() { // from class: S13
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49596u23.m10989k0(Function1.this, obj);
                }
            }).doFinally(new InterfaceC23478a() { // from class: d23
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C49596u23.m10987l0(C49596u23.this);
                }
            });
            Intrinsics.checkNotNullExpressionValue(doFinally, "fun onResume() {\n    if …(it)\n        })\n    }\n  }");
            Object m33094as = doFinally.m33094as(AutoDispose.m45239a(this.f111568k));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C29038z c29038z = C29038z.f111613g;
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: m23
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49596u23.m10985m0(Function1.this, obj);
                }
            };
            final C29007A c29007a = C29007A.f111584g;
            ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: n23
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49596u23.m10983n0(Function1.this, obj);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r0 == null) goto L32;
     */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10981o0() {
        String string;
        String str;
        String str2;
        Unit unit;
        String code;
        String string2 = this.f111570m.getString(C45871nl4.vehicle, new Object[0]);
        WireBird wireBird = this.f111581x;
        if (wireBird != null && (code = wireBird.getCode()) != null) {
            if (this.f111579v > 0 && this.f111578u) {
                string = this.f111570m.getString(C45871nl4.nearby_vehicles_empty_state_filter_bird_scan_failed_title, string2, code);
            } else {
                string = this.f111570m.getString(C45871nl4.nearby_vehicles_empty_state_filter_bird_searching_title, code, string2);
            }
        }
        InterfaceC51967y23 interfaceC51967y23 = this.f111570m;
        string = interfaceC51967y23.getString(C45871nl4.nearby_vehicles_empty_state_title, interfaceC51967y23.getString(C45871nl4.vehicles, new Object[0]));
        if (this.f111579v > 0) {
            long j = this.f111580w;
            if (j > 0) {
                str = this.f111570m.getString(C45871nl4.nearby_vehicles_empty_state_scanning_subtitle_prefix, String.valueOf(j));
                InterfaceC51967y23 interfaceC51967y232 = this.f111570m;
                String string3 = interfaceC51967y232.getString(C45871nl4.nearby_vehicles_or_birds_empty_state_subtitle, interfaceC51967y232.getString(C45871nl4.vehicles, new Object[0]));
                InterfaceC51967y23 interfaceC51967y233 = this.f111570m;
                interfaceC51967y233.mo1919ll(string, str + " " + string3);
                str2 = this.f111582y;
                if (str2 == null && this.f111580w <= 0) {
                    if (str2 != null) {
                        this.f111570m.mo1930Hc(str2);
                        this.f111570m.mo1922gd(0);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        this.f111570m.mo1922gd(8);
                        return;
                    }
                    return;
                }
                this.f111570m.mo1922gd(8);
            }
        }
        str = "";
        InterfaceC51967y23 interfaceC51967y2322 = this.f111570m;
        String string32 = interfaceC51967y2322.getString(C45871nl4.nearby_vehicles_or_birds_empty_state_subtitle, interfaceC51967y2322.getString(C45871nl4.vehicles, new Object[0]));
        InterfaceC51967y23 interfaceC51967y2332 = this.f111570m;
        interfaceC51967y2332.mo1919ll(string, str + " " + string32);
        str2 = this.f111582y;
        if (str2 == null) {
        }
        this.f111570m.mo1922gd(8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C49596u23(InterfaceC44723lp2 interfaceC44723lp2, InterfaceC27246pJ interfaceC27246pJ, InterfaceC30556yL interfaceC30556yL, AbstractC39873de5 abstractC39873de5, InterfaceC10636aM interfaceC10636aM, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC1880Ea interfaceC1880Ea, C22454gl c22454gl, C36207Tq4 c36207Tq4, InterfaceC51791xk6 interfaceC51791xk6, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, InterfaceC51967y23 interfaceC51967y23, ClipboardManager clipboardManager, A13 a13, AbstractC23437E abstractC23437E, AbstractC23437E abstractC23437E2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC44723lp2, interfaceC27246pJ, interfaceC30556yL, abstractC39873de5, interfaceC10636aM, interfaceC44647lh6, interfaceC1880Ea, c22454gl, c36207Tq4, interfaceC51791xk6, scopeProvider, interfaceC40099e13, interfaceC51967y23, clipboardManager, a13, r18, r19);
        AbstractC23437E abstractC23437E3;
        AbstractC23437E abstractC23437E4;
        if ((i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0) {
            AbstractC23437E m31934a = C24542a.m31934a();
            Intrinsics.checkNotNullExpressionValue(m31934a, "computation()");
            abstractC23437E3 = m31934a;
        } else {
            abstractC23437E3 = abstractC23437E;
        }
        if ((i & 65536) != 0) {
            AbstractC23437E m31934a2 = C24542a.m31934a();
            Intrinsics.checkNotNullExpressionValue(m31934a2, "computation()");
            abstractC23437E4 = m31934a2;
        } else {
            abstractC23437E4 = abstractC23437E2;
        }
    }
}
