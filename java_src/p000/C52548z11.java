package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.buava.Optional;
import co.bird.android.model.RideMapState;
import co.bird.android.model.analytics.AnalyticsEvent;
import co.bird.android.model.destination.Destination;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.DestinationConfig;
import co.bird.android.model.wire.configs.DestinationTooltipConfig;
import co.bird.android.model.wire.configs.RiderDestinationConfig;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41318g46;
import p000.C52548z11;
import p000.Q11;
@Metadata(m28433d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B]\u0012\u0006\u00103\u001a\u000201\u0012\u0006\u00107\u001a\u000204\u0012\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0016\u0010\u001b\u001a\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0016\u0010\u001d\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0002J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0016\u0010#\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000bH\u0002J\b\u0010$\u001a\u00020\u0016H\u0002J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020\u0016H\u0002J\b\u0010)\u001a\u00020\u0016H\u0002J\b\u0010*\u001a\u00020\u0016H\u0016J\u0018\u0010.\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016J\u0010\u0010/\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\fH\u0016J\b\u00100\u001a\u00020\u0002H\u0016R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\"\u0010\\\u001a\u0010\u0012\f\u0012\n Y*\u0004\u0018\u00010\u00020\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R8\u0010`\u001a&\u0012\f\u0012\n Y*\u0004\u0018\u00010\u00050\u0005 Y*\u0012\u0012\f\u0012\n Y*\u0004\u0018\u00010\u00050\u0005\u0018\u00010]0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR8\u0010e\u001a&\u0012\f\u0012\n Y*\u0004\u0018\u00010\f0\f Y*\u0012\u0012\f\u0012\n Y*\u0004\u0018\u00010\f0\f\u0018\u00010a0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010cR8\u0010g\u001a&\u0012\f\u0012\n Y*\u0004\u0018\u00010\f0\f Y*\u0012\u0012\f\u0012\n Y*\u0004\u0018\u00010\f0\f\u0018\u00010]0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010_R\"\u0010l\u001a\u0010\u0012\f\u0012\n Y*\u0004\u0018\u00010i0i0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kRJ\u0010o\u001a8\u00124\u00122\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n Y*\u0004\u0018\u00010\f0\f Y*\u0018\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n Y*\u0004\u0018\u00010\f0\f\u0018\u00010m0m0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010cRJ\u0010q\u001a8\u00124\u00122\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n Y*\u0004\u0018\u00010\f0\f Y*\u0018\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n Y*\u0004\u0018\u00010\f0\f\u0018\u00010m0m0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010kR\"\u0010s\u001a\u0010\u0012\f\u0012\n Y*\u0004\u0018\u00010\b0\b0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010kR\"\u0010t\u001a\u0010\u0012\f\u0012\n Y*\u0004\u0018\u00010\b0\b0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010kR\"\u0010v\u001a\u0010\u0012\f\u0012\n Y*\u0004\u0018\u00010\u00050\u00050h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010kR\"\u0010x\u001a\u0010\u0012\f\u0012\n Y*\u0004\u0018\u00010\u00160\u00160h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010kRP\u0010z\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f Y*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b Y*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f Y*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b\u0018\u00010a0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010cR.\u0010|\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f Y*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b0\u000b0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010kR\"\u0010~\u001a\u0010\u0012\f\u0012\n Y*\u0004\u0018\u00010\u00020\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010kR9\u0010\u0080\u0001\u001a&\u0012\f\u0012\n Y*\u0004\u0018\u00010\u00020\u0002 Y*\u0012\u0012\f\u0012\n Y*\u0004\u0018\u00010\u00020\u0002\u0018\u00010a0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010cR#\u0010\u0081\u0001\u001a\u0010\u0012\f\u0012\n Y*\u0004\u0018\u00010\u00020\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010kR0\u0010\u0083\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020! Y*\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000b0\u000b0h8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010kR\u0017\u0010\u0086\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0085\u0001R\u0017\u0010\u0089\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0088\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008a\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u008b\u0001¨\u0006\u0093\u0001"}, m28432d2 = {"Lz11;", "Lh11;", "", "editMode", "hasDestination", "Lz11$B;", "u", TransferTable.COLUMN_STATE, "", "E", "D", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/destination/Destination;", "destinationOption", "", "Lco/bird/android/model/persistence/Area;", "areas", "B", "Lco/bird/android/model/RideMapState;", "mapState", "d0", "destination", "", "Q", "O", "U", "b0", "P", "areaOption", "V", "area", "a0", "N", "Lco/bird/android/model/wire/configs/DestinationTooltipConfig;", "config", "W", "L", "S", "R", "T", "M", "G", "onResume", "", "latitude", "longitude", "F", C17296a.f69688o, "onBackPressed", "LQ11;", "LQ11;", "ui", "LO01;", "b", "LO01;", "manager", "LEa;", "c", "LEa;", "analyticsManager", "Lbn;", DateTokenConverter.CONVERTER_KEY, "Lbn;", "areaManager", "LpU4;", "e", "LpU4;", "mapStateManager", "Ldr4;", "f", "Ldr4;", "locationManager", "Le13;", "g", "Le13;", "navigator", "Lgl;", "h", "Lgl;", "appPreference", "i", "Z", "showOnResume", "j", "I", "selectionPinDragCount", "k", "searchDestinationClickCount", "LAG;", "kotlin.jvm.PlatformType", "l", "LAG;", "isEditingSubject", "Lio/reactivex/subjects/a;", "m", "Lio/reactivex/subjects/a;", "_state", "Lio/reactivex/Observable;", "n", "Lio/reactivex/Observable;", "o", "destinationStream", "p", "mapCenterDestinationSubject", "Lcom/uber/autodispose/ObservableSubscribeProxy;", "", "q", "Lcom/uber/autodispose/ObservableSubscribeProxy;", "displayAddress", "Lkotlin/Pair;", "r", "stateAndDestination", "s", "positiveButtonClicks", "t", "positiveButtonText", "negativeButtonText", "v", "negativeButtonClicks", "w", "destinationPinClicks", "x", "drawnDestination", "y", "drawnDestinationArea", "z", "selectionPinVisibility", "A", "destinationEnabled", "showDestinationSelectionButton", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "tooltipConfigChanges", "LlA5;", "LlA5;", "parkingNearDestinationFilter", "LYz5;", "LYz5;", "birdsNearbyUserFilter", "Lg46$b;", "()Lg46$b;", "logger", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTq4;", "reactiveConfig", "<init>", "(LQ11;LO01;Lcom/uber/autodispose/ScopeProvider;LEa;Lbn;LpU4;Ldr4;Le13;Lgl;LTq4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDestinationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DestinationPresenter.kt\nco/bird/android/app/feature/destination/DestinationPresenterImpl\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,564:1\n52#2,2:565\n52#2,2:570\n52#2,2:574\n52#2,2:579\n52#2,2:581\n52#2,2:584\n52#2,2:587\n180#3:567\n180#3:568\n180#3:569\n180#3:572\n180#3:573\n180#3:576\n180#3:577\n180#3:578\n180#3:583\n180#3:586\n180#3:589\n180#3:590\n180#3:591\n180#3:592\n180#3:593\n180#3:594\n766#4:595\n857#4,2:596\n2333#4,14:598\n1789#4,3:612\n*S KotlinDebug\n*F\n+ 1 DestinationPresenter.kt\nco/bird/android/app/feature/destination/DestinationPresenterImpl\n*L\n90#1:565,2\n125#1:570,2\n146#1:574,2\n168#1:579,2\n176#1:581,2\n200#1:584,2\n213#1:587,2\n93#1:567\n118#1:568\n123#1:569\n129#1:572\n136#1:573\n149#1:576\n162#1:577\n166#1:578\n181#1:583\n202#1:586\n218#1:589\n224#1:590\n283#1:591\n292#1:592\n300#1:593\n339#1:594\n190#1:595\n190#1:596,2\n192#1:598,14\n448#1:612,3\n*E\n"})
/* renamed from: z11  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52548z11 implements InterfaceC41876h11 {

    /* renamed from: A */
    public final Observable<Boolean> f120535A;

    /* renamed from: B */
    public final ObservableSubscribeProxy<Boolean> f120536B;

    /* renamed from: C */
    public final ObservableSubscribeProxy<Optional<DestinationTooltipConfig>> f120537C;

    /* renamed from: D */
    public final C44342lA5 f120538D;

    /* renamed from: E */
    public final C37459Yz5 f120539E;

    /* renamed from: a */
    public final Q11 f120540a;

    /* renamed from: b */
    public final O01 f120541b;

    /* renamed from: c */
    public final InterfaceC1880Ea f120542c;

    /* renamed from: d */
    public final InterfaceC12495bn f120543d;

    /* renamed from: e */
    public final InterfaceC46893pU4 f120544e;

    /* renamed from: f */
    public final InterfaceC40001dr4 f120545f;

    /* renamed from: g */
    public final InterfaceC40099e13 f120546g;

    /* renamed from: h */
    public final C22454gl f120547h;

    /* renamed from: i */
    public boolean f120548i;

    /* renamed from: j */
    public int f120549j;

    /* renamed from: k */
    public int f120550k;

    /* renamed from: l */
    public final C0058AG<Boolean> f120551l;

    /* renamed from: m */
    public final C24552a<EnumC30815B> f120552m;

    /* renamed from: n */
    public final Observable<EnumC30815B> f120553n;

    /* renamed from: o */
    public final Observable<Destination> f120554o;

    /* renamed from: p */
    public final C24552a<Destination> f120555p;

    /* renamed from: q */
    public final ObservableSubscribeProxy<String> f120556q;

    /* renamed from: r */
    public final Observable<Pair<EnumC30815B, Destination>> f120557r;

    /* renamed from: s */
    public final ObservableSubscribeProxy<Pair<EnumC30815B, Destination>> f120558s;

    /* renamed from: t */
    public final ObservableSubscribeProxy<Integer> f120559t;

    /* renamed from: u */
    public final ObservableSubscribeProxy<Integer> f120560u;

    /* renamed from: v */
    public final ObservableSubscribeProxy<EnumC30815B> f120561v;

    /* renamed from: w */
    public final ObservableSubscribeProxy<Unit> f120562w;

    /* renamed from: x */
    public final Observable<Optional<Destination>> f120563x;

    /* renamed from: y */
    public final ObservableSubscribeProxy<Optional<Area>> f120564y;

    /* renamed from: z */
    public final ObservableSubscribeProxy<Boolean> f120565z;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$A */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C30814A extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C30814A(Object obj) {
            super(1, obj, Q11.class, "setDisplayedAddress", "setDisplayedAddress(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Q11) this.receiver).mo86114H1(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lz11$B;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: z11$B */
    /* loaded from: classes2.dex */
    public enum EnumC30815B {
        EDIT,
        INFO
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$C */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C30816C {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC30815B.values().length];
            try {
                iArr[EnumC30815B.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC30815B.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\u001a\u0010\u0003\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lz11$B;", C17296a.f69688o, "(Lkotlin/Pair;)Lz11$B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$D */
    /* loaded from: classes2.dex */
    public static final class C30817D extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, EnumC30815B> {
        public C30817D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final EnumC30815B invoke(Pair<Boolean, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean editMode = pair.component1();
            boolean booleanValue = pair.component2().booleanValue();
            C52548z11 c52548z11 = C52548z11.this;
            Intrinsics.checkNotNullExpressionValue(editMode, "editMode");
            return c52548z11.m2046u(editMode.booleanValue(), booleanValue);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "config", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$E */
    /* loaded from: classes2.dex */
    public static final class C30818E extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C30818E f120570g = new C30818E();

        public C30818E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config config) {
            RiderDestinationConfig rider;
            Intrinsics.checkNotNullParameter(config, "config");
            DestinationConfig destination = config.getDestination();
            return Boolean.valueOf((destination == null || (rider = destination.getRider()) == null) ? false : Intrinsics.areEqual(rider.getEnabled(), Boolean.TRUE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$F */
    /* loaded from: classes2.dex */
    public static final class C30819F extends Lambda implements Function1<Unit, Boolean> {
        public C30819F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Unit it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C52548z11.this.f120544e.mo15897l().m73665a() == RideMapState.NONE) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lz11$B;", TransferTable.COLUMN_STATE, "Lio/reactivex/B;", "Lco/bird/android/model/destination/Destination;", "kotlin.jvm.PlatformType", "b", "(Lz11$B;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$G */
    /* loaded from: classes2.dex */
    public static final class C30820G extends Lambda implements Function1<EnumC30815B, InterfaceC23434B<? extends Destination>> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/destination/Destination;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/destination/Destination;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: z11$G$a */
        /* loaded from: classes2.dex */
        public static final class C30821a extends Lambda implements Function1<Optional<Destination>, Destination> {

            /* renamed from: g */
            public static final C30821a f120573g = new C30821a();

            public C30821a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Destination invoke(Optional<Destination> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.m59038b();
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: z11$G$b */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C30822b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC30815B.values().length];
                try {
                    iArr[EnumC30815B.INFO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C30820G() {
            super(1);
        }

        /* renamed from: c */
        public static final Destination m2035c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Destination) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Destination> invoke(EnumC30815B state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (C30822b.$EnumSwitchMapping$0[state.ordinal()] == 1) {
                Observable<Optional<Destination>> destination = C52548z11.this.f120541b.getDestination();
                final C30821a c30821a = C30821a.f120573g;
                return destination.map(new InterfaceC23492o() { // from class: A11
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Destination m2035c;
                        m2035c = C52548z11.C30820G.m2035c(Function1.this, obj);
                        return m2035c;
                    }
                });
            }
            return C52548z11.this.f120555p;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/destination/Destination;", "destination", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/destination/Destination;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$H */
    /* loaded from: classes2.dex */
    public static final class C30823H extends Lambda implements Function1<Destination, String> {

        /* renamed from: g */
        public static final C30823H f120574g = new C30823H();

        public C30823H() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Destination destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return destination.getAddress();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0005*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lz11$B;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/destination/Destination;", "<name for destructuring parameter 0>", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$I */
    /* loaded from: classes2.dex */
    public static final class C30824I extends Lambda implements Function1<Pair<? extends EnumC30815B, ? extends Optional<Destination>>, Optional<Destination>> {

        /* renamed from: g */
        public static final C30824I f120575g = new C30824I();

        public C30824I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Destination> invoke(Pair<? extends EnumC30815B, Optional<Destination>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            EnumC30815B component1 = pair.component1();
            Optional<Destination> component2 = pair.component2();
            if (component1 != EnumC30815B.INFO) {
                return Optional.f63040c.m59034a();
            }
            return component2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u00012,\u0010\u0006\u001a(\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/destination/Destination;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/persistence/Area;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$J */
    /* loaded from: classes2.dex */
    public static final class C30825J extends Lambda implements Function1<Pair<? extends Optional<Destination>, ? extends List<? extends Area>>, Optional<Area>> {
        public C30825J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Area> invoke(Pair<Optional<Destination>, ? extends List<Area>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Optional<Destination> destination = pair.component1();
            C52548z11 c52548z11 = C52548z11.this;
            Intrinsics.checkNotNullExpressionValue(destination, "destination");
            return c52548z11.m2096B(destination, pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$K */
    /* loaded from: classes2.dex */
    public static final class C30826K extends Lambda implements Function1<WireLocation, Unit> {
        public C30826K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireLocation wireLocation) {
            invoke2(wireLocation);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(WireLocation wireLocation) {
            if (C52548z11.this.f120540a.mo86108N1()) {
                C52548z11.this.f120549j++;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireLocation;", "location", "Lio/reactivex/B;", "Lco/bird/android/model/destination/Destination;", "kotlin.jvm.PlatformType", "invoke", "(Lco/bird/android/model/wire/WireLocation;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$L */
    /* loaded from: classes2.dex */
    public static final class C30827L extends Lambda implements Function1<WireLocation, InterfaceC23434B<? extends Destination>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lco/bird/android/model/destination/Destination;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lco/bird/android/model/destination/Destination;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: z11$L$a */
        /* loaded from: classes2.dex */
        public static final class C30828a extends Lambda implements Function1<String, Destination> {

            /* renamed from: g */
            public final /* synthetic */ WireLocation f120579g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30828a(WireLocation wireLocation) {
                super(1);
                this.f120579g = wireLocation;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final Destination invoke(String address) {
                Intrinsics.checkNotNullParameter(address, "address");
                return new Destination(this.f120579g.getLatitude(), this.f120579g.getLongitude(), address);
            }
        }

        public C30827L() {
            super(1);
        }

        /* renamed from: b */
        public static final Destination m2029b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Destination) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Destination> invoke(WireLocation location) {
            Intrinsics.checkNotNullParameter(location, "location");
            Observable<String> mo43614r = C52548z11.this.f120545f.mo43614r(location.getLatitude(), location.getLongitude());
            final C30828a c30828a = new C30828a(location);
            return mo43614r.map(new InterfaceC23492o() { // from class: B11
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Destination m2029b;
                    m2029b = C52548z11.C30827L.m2029b(Function1.this, obj);
                    return m2029b;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lz11$B;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$M */
    /* loaded from: classes2.dex */
    public static final class C30829M extends Lambda implements Function1<Unit, InterfaceC23447K<? extends EnumC30815B>> {
        public C30829M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends EnumC30815B> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C52548z11.this.f120553n.firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lz11$B;", "", "<name for destructuring parameter 0>", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$N */
    /* loaded from: classes2.dex */
    public static final class C30830N extends Lambda implements Function1<Pair<? extends EnumC30815B, ? extends Boolean>, Integer> {
        public C30830N() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(Pair<? extends EnumC30815B, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            boolean booleanValue = pair.component2().booleanValue();
            return Integer.valueOf(C52548z11.this.m2094D(pair.component1(), booleanValue));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001az\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003 \u0006*<\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lz11$B;", "Lco/bird/android/model/destination/Destination;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$O */
    /* loaded from: classes2.dex */
    public static final class C30831O extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Pair<? extends EnumC30815B, ? extends Destination>>> {
        public C30831O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Pair<EnumC30815B, Destination>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C52548z11.this.f120557r.firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lz11$B;", TransferTable.COLUMN_STATE, "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lz11$B;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$P */
    /* loaded from: classes2.dex */
    public static final class C30832P extends Lambda implements Function1<EnumC30815B, Integer> {
        public C30832P() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(EnumC30815B state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return Integer.valueOf(C52548z11.this.m2093E(state));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lz11$B;", "Lco/bird/android/model/RideMapState;", "<name for destructuring parameter 0>", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$Q */
    /* loaded from: classes2.dex */
    public static final class C30833Q extends Lambda implements Function1<Pair<? extends EnumC30815B, ? extends RideMapState>, Boolean> {
        public C30833Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Pair<? extends EnumC30815B, ? extends RideMapState> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(C52548z11.this.m2064d0(pair.component1(), pair.component2()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: z11$S */
    /* loaded from: classes2.dex */
    public static final class C30835S<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C30835S<T1, T2, R> f120586a = new C30835S<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: z11$T */
    /* loaded from: classes2.dex */
    public static final class C30836T<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C30836T<T1, T2, R> f120587a = new C30836T<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: z11$U */
    /* loaded from: classes2.dex */
    public static final class C30837U<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C30837U<T1, T2, R> f120588a = new C30837U<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: z11$V */
    /* loaded from: classes2.dex */
    public static final class C30838V<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C30838V<T1, T2, R> f120589a = new C30838V<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: z11$W */
    /* loaded from: classes2.dex */
    public static final class C30839W<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C30839W<T1, T2, R> f120590a = new C30839W<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: z11$X */
    /* loaded from: classes2.dex */
    public static final class C30840X<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C30840X<T1, T2, R> f120591a = new C30840X<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: z11$Y */
    /* loaded from: classes2.dex */
    public static final class C30841Y<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C30841Y<T1, T2, R> f120592a = new C30841Y<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/configs/DestinationTooltipConfig;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$Z */
    /* loaded from: classes2.dex */
    public static final class C30842Z extends Lambda implements Function1<Config, Optional<DestinationTooltipConfig>> {

        /* renamed from: g */
        public static final C30842Z f120593g = new C30842Z();

        public C30842Z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<DestinationTooltipConfig> invoke(Config config) {
            DestinationTooltipConfig destinationTooltipConfig;
            RiderDestinationConfig rider;
            Intrinsics.checkNotNullParameter(config, "config");
            Optional.C14443a c14443a = Optional.f63040c;
            DestinationConfig destination = config.getDestination();
            if (destination != null && (rider = destination.getRider()) != null) {
                destinationTooltipConfig = rider.getTooltip();
            } else {
                destinationTooltipConfig = null;
            }
            return c14443a.m59033b(destinationTooltipConfig);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$a */
    /* loaded from: classes2.dex */
    public static final class C30843a extends Lambda implements Function1<Throwable, Unit> {
        public C30843a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C52548z11.this.m2095C().mo7223j(throwable, "An unknown error occurred when observing display-address changes.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$b */
    /* loaded from: classes2.dex */
    public static final class C30844b extends Lambda implements Function1<Throwable, Unit> {
        public C30844b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C52548z11.this.m2095C().mo7223j(throwable, "An error occurred while observing destination pin clicks", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$c */
    /* loaded from: classes2.dex */
    public static final class C30845c extends Lambda implements Function1<Unit, Unit> {
        public C30845c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C52548z11.this.m2083O();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$d */
    /* loaded from: classes2.dex */
    public static final class C30846d extends Lambda implements Function1<Throwable, Unit> {
        public C30846d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C52548z11.this.m2095C().mo7223j(throwable, "An error occurred while observing select destination clicks", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$e */
    /* loaded from: classes2.dex */
    public static final class C30847e extends Lambda implements Function1<Unit, Unit> {
        public C30847e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C52548z11.this.m2077U();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$f */
    /* loaded from: classes2.dex */
    public static final class C30848f extends Lambda implements Function1<Throwable, Unit> {
        public C30848f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C52548z11.this.m2095C().mo7223j(throwable, "An unknown error occurred when observing address input clicks", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$g */
    /* loaded from: classes2.dex */
    public static final class C30849g extends Lambda implements Function1<Unit, Unit> {
        public C30849g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C52548z11.this.m2086L();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$h */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C30850h extends FunctionReferenceImpl implements Function1<Optional<Destination>, Unit> {
        public C30850h(Object obj) {
            super(1, obj, C52548z11.class, "onDrawDestinationPin", "onDrawDestinationPin(Lco/bird/android/buava/Optional;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<Destination> optional) {
            invoke2(optional);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Optional<Destination> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C52548z11) this.receiver).m2082P(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$i */
    /* loaded from: classes2.dex */
    public static final class C30851i extends Lambda implements Function1<Throwable, Unit> {
        public C30851i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C52548z11.this.m2095C().mo7223j(throwable, "An unknown error occurred when observing draw destination pin changes", new Object[0]);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$j */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C30852j extends FunctionReferenceImpl implements Function1<Optional<Area>, Unit> {
        public C30852j(Object obj) {
            super(1, obj, C52548z11.class, "onSelectedDestinationAreaChanged", "onSelectedDestinationAreaChanged(Lco/bird/android/buava/Optional;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<Area> optional) {
            invoke2(optional);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Optional<Area> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C52548z11) this.receiver).m2076V(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$k */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C30853k extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public C30853k(Object obj) {
            super(1, obj, Q11.class, "setPositiveButtonText", "setPositiveButtonText(I)V", 0);
        }

        /* renamed from: a */
        public final void m2017a(int i) {
            ((Q11) this.receiver).mo86106P1(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            m2017a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$l */
    /* loaded from: classes2.dex */
    public static final class C30854l extends Lambda implements Function1<Throwable, Unit> {
        public C30854l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C52548z11.this.m2095C().mo7223j(throwable, "An unknown error occurred when observing selected area changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$m */
    /* loaded from: classes2.dex */
    public static final class C30855m extends Lambda implements Function1<Throwable, Unit> {
        public C30855m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C52548z11.this.m2095C().mo7223j(throwable, "An unknown error occurred when observing selection pin visibility changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "visible", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$n */
    /* loaded from: classes2.dex */
    public static final class C30856n extends Lambda implements Function1<Boolean, Unit> {
        public C30856n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean visible) {
            Q11 q11 = C52548z11.this.f120540a;
            Intrinsics.checkNotNullExpressionValue(visible, "visible");
            q11.mo86098y1(visible.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$o */
    /* loaded from: classes2.dex */
    public static final class C30857o extends Lambda implements Function1<Throwable, Unit> {
        public C30857o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C52548z11.this.m2095C().mo7223j(throwable, "An unknown error occurred when observing show destination selection", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "show", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$p */
    /* loaded from: classes2.dex */
    public static final class C30858p extends Lambda implements Function1<Boolean, Unit> {
        public C30858p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean show) {
            Q11 q11 = C52548z11.this.f120540a;
            Intrinsics.checkNotNullExpressionValue(show, "show");
            q11.mo86121A1(show.booleanValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$q */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C30859q extends FunctionReferenceImpl implements Function1<Optional<DestinationTooltipConfig>, Unit> {
        public C30859q(Object obj) {
            super(1, obj, C52548z11.class, "onTooltipConfigChanged", "onTooltipConfigChanged(Lco/bird/android/buava/Optional;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<DestinationTooltipConfig> optional) {
            invoke2(optional);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Optional<DestinationTooltipConfig> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C52548z11) this.receiver).m2075W(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$r */
    /* loaded from: classes2.dex */
    public static final class C30860r extends Lambda implements Function1<Throwable, Unit> {
        public C30860r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C52548z11.this.m2095C().mo7223j(throwable, "An unknown error occurred when observing destination config changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "message", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$s */
    /* loaded from: classes2.dex */
    public static final class C30861s extends Lambda implements Function1<String, Unit> {
        public C30861s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String message) {
            C22454gl c22454gl = C52548z11.this.f120547h;
            Intrinsics.checkNotNullExpressionValue(message, "message");
            c22454gl.m37610j1(message);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$t */
    /* loaded from: classes2.dex */
    public static final class C30862t extends Lambda implements Function1<Throwable, Unit> {
        public C30862t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C52548z11.this.m2095C().mo7223j(throwable, "An error occurred while observing positive button text changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$u */
    /* loaded from: classes2.dex */
    public static final class C30863u extends Lambda implements Function1<Throwable, Unit> {
        public C30863u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C52548z11.this.m2095C().mo7223j(throwable, "An error occurred while observing positive button clicks", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u000526\u0010\u0004\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lz11$B;", "Lco/bird/android/model/destination/Destination;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z11$v */
    /* loaded from: classes2.dex */
    public static final class C30864v extends Lambda implements Function1<Pair<? extends EnumC30815B, ? extends Destination>, Unit> {
        public C30864v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends EnumC30815B, ? extends Destination> pair) {
            invoke2((Pair<? extends EnumC30815B, Destination>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends EnumC30815B, Destination> pair) {
            Destination destination = pair.component2();
            C52548z11 c52548z11 = C52548z11.this;
            Intrinsics.checkNotNullExpressionValue(destination, "destination");
            c52548z11.m2079S(pair.component1(), destination);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$w */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C30865w extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public C30865w(Object obj) {
            super(1, obj, Q11.class, "setNegativeButtonText", "setNegativeButtonText(I)V", 0);
        }

        /* renamed from: a */
        public final void m2016a(int i) {
            ((Q11) this.receiver).mo86111K1(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            m2016a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$x */
    /* loaded from: classes2.dex */
    public static final class C30866x extends Lambda implements Function1<Throwable, Unit> {
        public C30866x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C52548z11.this.m2095C().mo7223j(throwable, "An error occurred while observing negative button text changes", new Object[0]);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$y */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C30867y extends FunctionReferenceImpl implements Function1<EnumC30815B, Unit> {
        public C30867y(Object obj) {
            super(1, obj, C52548z11.class, "onNegativeButtonClicks", "onNegativeButtonClicks(Lco/bird/android/app/feature/destination/DestinationPresenterImpl$State;)V", 0);
        }

        /* renamed from: a */
        public final void m2015a(EnumC30815B p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C52548z11) this.receiver).m2080R(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnumC30815B enumC30815B) {
            m2015a(enumC30815B);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$z */
    /* loaded from: classes2.dex */
    public static final class C30868z extends Lambda implements Function1<Throwable, Unit> {
        public C30868z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C52548z11.this.m2095C().mo7223j(throwable, "An error occurred while observing cancel destination clicks", new Object[0]);
        }
    }

    public C52548z11(Q11 ui, O01 manager, ScopeProvider scopeProvider, InterfaceC1880Ea analyticsManager, InterfaceC12495bn areaManager, InterfaceC46893pU4 mapStateManager, InterfaceC40001dr4 locationManager, InterfaceC40099e13 navigator, C22454gl appPreference, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(mapStateManager, "mapStateManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f120540a = ui;
        this.f120541b = manager;
        this.f120542c = analyticsManager;
        this.f120543d = areaManager;
        this.f120544e = mapStateManager;
        this.f120545f = locationManager;
        this.f120546g = navigator;
        this.f120547h = appPreference;
        C0058AG<Boolean> m115950h = C0058AG.m115950h(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(true)");
        this.f120551l = m115950h;
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(m115950h, manager.mo73911f(), C30835S.f120586a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C30817D c30817d = new C30817D();
        Observable distinctUntilChanged = combineLatest.map(new InterfaceC23492o() { // from class: i11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C52548z11.EnumC30815B m2047t;
                m2047t = C52548z11.m2047t(Function1.this, obj);
                return m2047t;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "Observables.combineLates…  .distinctUntilChanged()");
        Object m33094as = distinctUntilChanged.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        C24552a<EnumC30815B> _state = (C24552a) ((ObservableSubscribeProxy) m33094as).subscribeWith(C24552a.m31922e());
        this.f120552m = _state;
        Intrinsics.checkNotNullExpressionValue(_state, "_state");
        this.f120553n = _state;
        final C30820G c30820g = new C30820G();
        Observable<Destination> destinationStream = _state.switchMapDelayError(new InterfaceC23492o() { // from class: x11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m2043x;
                m2043x = C52548z11.m2043x(Function1.this, obj);
                return m2043x;
            }
        }).distinctUntilChanged();
        this.f120554o = destinationStream;
        Observable<WireLocation> mo86116F1 = ui.mo86116F1();
        final C30826K c30826k = new C30826K();
        Observable<WireLocation> observeOn = mo86116F1.doOnNext(new InterfaceC23484g() { // from class: y11
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52548z11.m2090H(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c());
        final C30827L c30827l = new C30827L();
        Observable<R> switchMap = observeOn.switchMap(new InterfaceC23492o() { // from class: j11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m2089I;
                m2089I = C52548z11.m2089I(Function1.this, obj);
                return m2089I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "ui.destinationPinDragged…e, address)\n      }\n    }");
        Object m33094as2 = switchMap.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        this.f120555p = (C24552a) ((ObservableSubscribeProxy) m33094as2).subscribeWith(C24552a.m31922e());
        final C30823H c30823h = C30823H.f120574g;
        Observable observeOn2 = destinationStream.map(new InterfaceC23492o() { // from class: k11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m2042y;
                m2042y = C52548z11.m2042y(Function1.this, obj);
                return m2042y;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "destinationStream.map { …dSchedulers.mainThread())");
        Object m33094as3 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ObservableSubscribeProxy<String> observableSubscribeProxy = (ObservableSubscribeProxy) m33094as3;
        this.f120556q = observableSubscribeProxy;
        Intrinsics.checkNotNullExpressionValue(destinationStream, "destinationStream");
        Observable<Pair<EnumC30815B, Destination>> combineLatest2 = Observable.combineLatest(_state, destinationStream, C30836T.f120587a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        this.f120557r = combineLatest2;
        Observable<Unit> mo86107O1 = ui.mo86107O1();
        final C30831O c30831o = new C30831O();
        Observable<R> flatMapSingle = mo86107O1.flatMapSingle(new InterfaceC23492o() { // from class: l11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m2074X;
                m2074X = C52548z11.m2074X(Function1.this, obj);
                return m2074X;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "ui.positiveButtonClicks\n…tination.firstOrError() }");
        Object m33094as4 = flatMapSingle.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        ObservableSubscribeProxy<Pair<EnumC30815B, Destination>> observableSubscribeProxy2 = (ObservableSubscribeProxy) m33094as4;
        this.f120558s = observableSubscribeProxy2;
        final C30832P c30832p = new C30832P();
        Observable observeOn3 = _state.map(new InterfaceC23492o() { // from class: m11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Integer m2073Y;
                m2073Y = C52548z11.m2073Y(Function1.this, obj);
                return m2073Y;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "state.map { state -> get…dSchedulers.mainThread())");
        Object m33094as5 = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        ObservableSubscribeProxy<Integer> observableSubscribeProxy3 = (ObservableSubscribeProxy) m33094as5;
        this.f120559t = observableSubscribeProxy3;
        Observable combineLatest3 = Observable.combineLatest(_state, manager.mo73911f(), C30837U.f120588a);
        Intrinsics.checkNotNullExpressionValue(combineLatest3, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C30830N c30830n = new C30830N();
        Observable observeOn4 = combineLatest3.map(new InterfaceC23492o() { // from class: n11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Integer m2087K;
                m2087K = C52548z11.m2087K(Function1.this, obj);
                return m2087K;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as6 = observeOn4.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        ObservableSubscribeProxy<Integer> observableSubscribeProxy4 = (ObservableSubscribeProxy) m33094as6;
        this.f120560u = observableSubscribeProxy4;
        Observable<Unit> mo86105Q1 = ui.mo86105Q1();
        final C30829M c30829m = new C30829M();
        Observable observeOn5 = mo86105Q1.flatMapSingle(new InterfaceC23492o() { // from class: o11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m2088J;
                m2088J = C52548z11.m2088J(Function1.this, obj);
                return m2088J;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "ui.negativeButtonClicks\n…dSchedulers.mainThread())");
        Object m33094as7 = observeOn5.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        ObservableSubscribeProxy<EnumC30815B> observableSubscribeProxy5 = (ObservableSubscribeProxy) m33094as7;
        this.f120561v = observableSubscribeProxy5;
        Observable<Unit> mo86118D1 = ui.mo86118D1();
        final C30819F c30819f = new C30819F();
        Observable<Unit> filter = mo86118D1.filter(new InterfaceC23494q() { // from class: p11
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m2044w;
                m2044w = C52548z11.m2044w(Function1.this, obj);
                return m2044w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "ui.destinationPinClicks\n….rideMapState() == NONE }");
        Object m33094as8 = filter.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        ObservableSubscribeProxy<Unit> observableSubscribeProxy6 = (ObservableSubscribeProxy) m33094as8;
        this.f120562w = observableSubscribeProxy6;
        Observable combineLatest4 = Observable.combineLatest(_state, manager.getDestination(), C30838V.f120589a);
        Intrinsics.checkNotNullExpressionValue(combineLatest4, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C30824I c30824i = C30824I.f120575g;
        Observable<Optional<Destination>> drawnDestination = combineLatest4.map(new InterfaceC23492o() { // from class: q11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m2041z;
                m2041z = C52548z11.m2041z(Function1.this, obj);
                return m2041z;
            }
        });
        this.f120563x = drawnDestination;
        Intrinsics.checkNotNullExpressionValue(drawnDestination, "drawnDestination");
        Observable combineLatest5 = Observable.combineLatest(drawnDestination, areaManager.mo63995r(), C30839W.f120590a);
        Intrinsics.checkNotNullExpressionValue(combineLatest5, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C30825J c30825j = new C30825J();
        Observable map = combineLatest5.map(new InterfaceC23492o() { // from class: r11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m2097A;
                m2097A = C52548z11.m2097A(Function1.this, obj);
                return m2097A;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "Observables.combineLates…r(destination, areas)\n  }");
        Object m33094as9 = map.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        ObservableSubscribeProxy<Optional<Area>> observableSubscribeProxy7 = (ObservableSubscribeProxy) m33094as9;
        this.f120564y = observableSubscribeProxy7;
        Observable combineLatest6 = Observable.combineLatest(_state, mapStateManager.mo15897l(), C30840X.f120591a);
        Intrinsics.checkNotNullExpressionValue(combineLatest6, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C30833Q c30833q = new C30833Q();
        Observable map2 = combineLatest6.map(new InterfaceC23492o() { // from class: s11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m2072Z;
                m2072Z = C52548z11.m2072Z(Function1.this, obj);
                return m2072Z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "Observables.combineLates…ionPin(state, mapState) }");
        Object m33094as10 = map2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as10, "this.`as`(AutoDispose.autoDisposable(provider))");
        ObservableSubscribeProxy<Boolean> observableSubscribeProxy8 = (ObservableSubscribeProxy) m33094as10;
        this.f120565z = observableSubscribeProxy8;
        Z84<Config> m82623f8 = reactiveConfig.m82623f8();
        final C30818E c30818e = C30818E.f120570g;
        Observable<Boolean> destinationEnabled = m82623f8.map(new InterfaceC23492o() { // from class: t11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m2045v;
                m2045v = C52548z11.m2045v(Function1.this, obj);
                return m2045v;
            }
        }).distinctUntilChanged();
        this.f120535A = destinationEnabled;
        Z84<RideMapState> mo15897l = mapStateManager.mo15897l();
        Intrinsics.checkNotNullExpressionValue(destinationEnabled, "destinationEnabled");
        Observable combineLatest7 = Observable.combineLatest(mo15897l, destinationEnabled, C30841Y.f120592a);
        Intrinsics.checkNotNullExpressionValue(combineLatest7, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C30834R c30834r = C30834R.f120585g;
        Observable map3 = combineLatest7.map(new InterfaceC23492o() { // from class: u11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m2066c0;
                m2066c0 = C52548z11.m2066c0(Function1.this, obj);
                return m2066c0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "Observables.combineLates…te == NONE && enabled\n  }");
        Object m33094as11 = map3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as11, "this.`as`(AutoDispose.autoDisposable(provider))");
        ObservableSubscribeProxy<Boolean> observableSubscribeProxy9 = (ObservableSubscribeProxy) m33094as11;
        this.f120536B = observableSubscribeProxy9;
        Z84<Config> m82623f82 = reactiveConfig.m82623f8();
        final C30842Z c30842z = C30842Z.f120593g;
        Observable observeOn6 = m82623f82.map(new InterfaceC23492o() { // from class: v11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m2062e0;
                m2062e0 = C52548z11.m2062e0(Function1.this, obj);
                return m2062e0;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "reactiveConfig.config\n  …dSchedulers.mainThread())");
        Object m33094as12 = observeOn6.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as12, "this.`as`(AutoDispose.autoDisposable(provider))");
        ObservableSubscribeProxy<Optional<DestinationTooltipConfig>> observableSubscribeProxy10 = (ObservableSubscribeProxy) m33094as12;
        this.f120537C = observableSubscribeProxy10;
        Intrinsics.checkNotNullExpressionValue(destinationStream, "destinationStream");
        this.f120538D = new C44342lA5(destinationStream, scopeProvider, reactiveConfig);
        this.f120539E = new C37459Yz5(locationManager, reactiveConfig);
        m2095C().mo7221o("recordFirstIntentUntilNavigation", new Object[0]);
        C44606ld5.subscribeBy$default(observableSubscribeProxy3, new C30862t(), null, new C30853k(ui), 2, null);
        C44606ld5.subscribeBy$default(observableSubscribeProxy2, new C30863u(), null, new C30864v(), 2, null);
        C44606ld5.subscribeBy$default(observableSubscribeProxy4, new C30866x(), null, new C30865w(ui), 2, null);
        C44606ld5.subscribeBy$default(observableSubscribeProxy5, new C30868z(), null, new C30867y(this), 2, null);
        C44606ld5.subscribeBy$default(observableSubscribeProxy, new C30843a(), null, new C30814A(ui), 2, null);
        C44606ld5.subscribeBy$default(observableSubscribeProxy6, new C30844b(), null, new C30845c(), 2, null);
        Object m33094as13 = ui.mo86115G1().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as13, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as13, new C30846d(), null, new C30847e(), 2, null);
        Object m33094as14 = ui.mo86117E1().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as14, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as14, new C30848f(), null, new C30849g(), 2, null);
        Intrinsics.checkNotNullExpressionValue(drawnDestination, "drawnDestination");
        Object m33094as15 = drawnDestination.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as15, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as15, new C30851i(), null, new C30850h(this), 2, null);
        C44606ld5.subscribeBy$default(observableSubscribeProxy7, new C30854l(), null, new C30852j(this), 2, null);
        C44606ld5.subscribeBy$default(observableSubscribeProxy8, new C30855m(), null, new C30856n(), 2, null);
        C44606ld5.subscribeBy$default(observableSubscribeProxy9, new C30857o(), null, new C30858p(), 2, null);
        C44606ld5.subscribeBy$default(observableSubscribeProxy10, new C30860r(), null, new C30859q(this), 2, null);
        Object m33094as16 = ui.mo86120B1().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as16, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30861s c30861s = new C30861s();
        ((ObservableSubscribeProxy) m33094as16).subscribe(new InterfaceC23484g() { // from class: w11
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52548z11.m2048s(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final Optional m2097A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m2090H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC23434B m2089I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23447K m2088J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final Integer m2087K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final InterfaceC23447K m2074X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final Integer m2073Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final Boolean m2072Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final Boolean m2066c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final Optional m2062e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m2048s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final EnumC30815B m2047t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (EnumC30815B) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final Boolean m2045v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final boolean m2044w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: x */
    public static final InterfaceC23434B m2043x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final String m2042y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final Optional m2041z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public final Optional<Area> m2096B(Optional<Destination> optional, List<Area> list) {
        Object obj;
        if (!optional.m59037c()) {
            return Optional.f63040c.m59034a();
        }
        Destination m59038b = optional.m59038b();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (GoogleMap_Kt.contains((Area) obj2, m59038b.getLatitude(), m59038b.getLongitude())) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                double m86796b = RN5.m86796b(GoogleMap_Kt.toPoints(((Area) next).getRegion()));
                do {
                    Object next2 = it.next();
                    double m86796b2 = RN5.m86796b(GoogleMap_Kt.toPoints(((Area) next2).getRegion()));
                    if (Double.compare(m86796b, m86796b2) > 0) {
                        next = next2;
                        m86796b = m86796b2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return Optional.f63040c.m59033b((Area) obj);
    }

    /* renamed from: C */
    public final C41318g46.AbstractC20723b m2095C() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("destination-presenter");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"destination-presenter\")");
        return m40153k;
    }

    /* renamed from: D */
    public final int m2094D(EnumC30815B enumC30815B, boolean z) {
        int i = C30816C.$EnumSwitchMapping$0[enumC30815B.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 17039360;
            }
            throw new NoWhenBranchMatchedException();
        } else if (!z) {
            return 17039360;
        } else {
            return C45871nl4.remove;
        }
    }

    /* renamed from: E */
    public final int m2093E(EnumC30815B enumC30815B) {
        int i = C30816C.$EnumSwitchMapping$0[enumC30815B.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C45871nl4.edit;
            }
            throw new NoWhenBranchMatchedException();
        }
        return C45871nl4.destination_selection_set_button;
    }

    /* renamed from: F */
    public void m2092F(double d, double d2) {
        this.f120541b.mo73912e(d, d2);
        this.f120548i = true;
    }

    /* renamed from: G */
    public final void m2091G() {
        m2095C().mo7221o("Closing destination selection & setting map state to NONE", new Object[0]);
        this.f120549j = 0;
        this.f120550k = 0;
        if (!this.f120541b.mo73915b()) {
            this.f120540a.mo86097z0(K01.f18899a);
            this.f120540a.mo86097z0(this.f120539E);
            this.f120540a.removeParkingFilter(this.f120538D);
        }
        this.f120540a.setVisible(false);
        this.f120544e.mo15906c(RideMapState.NONE);
    }

    /* renamed from: L */
    public final void m2086L() {
        m2095C().mo7221o("Navigating to destination search activity.", new Object[0]);
        this.f120550k++;
        this.f120546g.mo37084U3(I35.DESTINATION_SEARCH.ordinal());
    }

    /* renamed from: M */
    public final void m2085M() {
        m2095C().mo7221o("onCancelButtonClicked()", new Object[0]);
        this.f120542c.mo55905y(new L01(null, null, null, this.f120549j, null, null, null, null, 247, null));
        m2091G();
    }

    /* renamed from: N */
    public final void m2084N(Destination destination) {
        boolean z;
        m2095C().mo7221o("onSetDestinationClicked(" + destination + ")", new Object[0]);
        this.f120542c.mo55905y(new I01(null, null, null, this.f120549j, this.f120550k, null, null, null, null, null, false, 999, null));
        this.f120541b.mo73914c(destination);
        loop0: while (true) {
            z = true;
            for (Area area : this.f120543d.mo63995r().m73665a()) {
                if (!z || GoogleMap_Kt.contains(area, destination.getLatitude(), destination.getLongitude())) {
                    z = false;
                }
            }
        }
        if (z) {
            this.f120540a.mo86109M1(destination.getLatitude(), destination.getLongitude());
        }
        this.f120540a.mo86097z0(K01.f18899a);
        this.f120540a.mo86100w1(this.f120539E);
        this.f120551l.accept(Boolean.FALSE);
        m2091G();
    }

    /* renamed from: O */
    public final void m2083O() {
        m2095C().mo7221o("Destination pin clicked. Setting map state: DESTINATION_SELECTION", new Object[0]);
        this.f120542c.mo55905y(new C39505d11(null, null, null, 7, null));
        m2068b0();
    }

    /* renamed from: P */
    public final void m2082P(Optional<Destination> optional) {
        C41318g46.AbstractC20723b m2095C = m2095C();
        m2095C.mo7221o("onDrawDestinationPin(" + optional + ")", new Object[0]);
        this.f120540a.mo86112J1();
        Destination m59035e = optional.m59035e();
        if (m59035e != null) {
            this.f120540a.mo86119C1(m59035e.getLatitude(), m59035e.getLongitude());
        }
    }

    /* renamed from: Q */
    public final void m2081Q(Destination destination) {
        C41318g46.AbstractC20723b m2095C = m2095C();
        m2095C.mo7221o("onEditDestinationClicked(" + destination + ")", new Object[0]);
        this.f120542c.mo55905y(new M01(null, null, null, this.f120549j, null, null, null, null, 247, null));
        Q11.C6644a.setDestination$default(this.f120540a, destination, false, 2, null);
        this.f120551l.accept(Boolean.TRUE);
    }

    /* renamed from: R */
    public final void m2080R(EnumC30815B enumC30815B) {
        if (C30816C.$EnumSwitchMapping$0[enumC30815B.ordinal()] == 1) {
            m2078T();
        } else {
            m2085M();
        }
    }

    /* renamed from: S */
    public final void m2079S(EnumC30815B enumC30815B, Destination destination) {
        if (C30816C.$EnumSwitchMapping$0[enumC30815B.ordinal()] == 1) {
            m2084N(destination);
        } else {
            m2081Q(destination);
        }
    }

    /* renamed from: T */
    public final void m2078T() {
        m2095C().mo7221o("onRemoveButtonClicked()", new Object[0]);
        this.f120542c.mo55905y(new H01(null, null, null, this.f120549j, this.f120550k, null, null, null, null, null, 999, null));
        this.f120540a.mo86100w1(K01.f18899a);
        this.f120540a.mo86097z0(this.f120539E);
        this.f120541b.mo73914c(null);
        m2091G();
    }

    /* renamed from: U */
    public final void m2077U() {
        m2095C().mo7221o("Select destination clicked. Setting map state: DESTINATION_SELECTION", new Object[0]);
        this.f120542c.mo55905y(new C38894c11(null, null, null, true, 7, null));
        m2068b0();
    }

    /* renamed from: V */
    public final void m2076V(Optional<Area> optional) {
        C41318g46.AbstractC20723b m2095C = m2095C();
        m2095C.mo7221o("onSelectedDestinationAreaChanged(" + optional + ")", new Object[0]);
        Area m59035e = optional.m59035e();
        if (m59035e != null) {
            if (!m2070a0(m59035e)) {
                m2095C().mo7221o("The selected area does not require the info window to be displayed", new Object[0]);
                return;
            }
            m2095C().mo7221o("displaying area info window.", new Object[0]);
            this.f120540a.mo86113I1(m59035e);
        }
    }

    /* renamed from: W */
    public final void m2075W(Optional<DestinationTooltipConfig> optional) {
        C41318g46.AbstractC20723b m2095C = m2095C();
        DestinationTooltipConfig m59035e = optional.m59035e();
        m2095C.mo7221o("onTooltipConfigChanged(" + m59035e + ")", new Object[0]);
        DestinationTooltipConfig m59035e2 = optional.m59035e();
        if (m59035e2 != null) {
            String message = m59035e2.getMessage();
            if (message == null) {
                message = this.f120540a.mo86104R1();
            }
            if (this.f120547h.m37726H0(message)) {
                return;
            }
            this.f120540a.mo86099x1(message, Intrinsics.areEqual(m59035e2.getDisplayUntilClicked(), Boolean.TRUE));
        }
    }

    @Override // p000.InterfaceC41876h11
    /* renamed from: a */
    public void mo2071a(Destination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        C41318g46.AbstractC20723b m2095C = m2095C();
        m2095C.mo7221o("Destination was manually entered. Setting destination: " + destination, new Object[0]);
        this.f120541b.mo73914c(destination);
        this.f120551l.accept(Boolean.TRUE);
        this.f120540a.mo86110L1(destination, true);
    }

    /* renamed from: a0 */
    public final boolean m2070a0(Area area) {
        return area.getNoParking() || area.getNoRides() || !area.getOperational() || area.getMaxSpeed() != null;
    }

    /* renamed from: b0 */
    public final void m2068b0() {
        int i;
        AnalyticsEvent n01;
        this.f120544e.mo15906c(RideMapState.DESTINATION_SELECTION);
        this.f120540a.mo86096z1();
        this.f120540a.setVisible(true);
        if (this.f120552m.getValue() == EnumC30815B.EDIT) {
            this.f120540a.mo86100w1(K01.f18899a);
            this.f120540a.addParkingFilter(this.f120538D);
        }
        InterfaceC1880Ea interfaceC1880Ea = this.f120542c;
        EnumC30815B value = this.f120552m.getValue();
        if (value == null) {
            i = -1;
        } else {
            i = C30816C.$EnumSwitchMapping$0[value.ordinal()];
        }
        if (i == 1) {
            n01 = new J01(null, null, null, true, 7, null);
        } else {
            n01 = new N01(null, null, null, 7, null);
        }
        interfaceC1880Ea.mo55905y(n01);
        Optional<Destination> blockingFirst = this.f120541b.getDestination().blockingFirst();
        if (!blockingFirst.m59037c()) {
            return;
        }
        this.f120540a.mo86110L1(blockingFirst.m59038b(), true);
    }

    /* renamed from: d0 */
    public final boolean m2064d0(EnumC30815B enumC30815B, RideMapState rideMapState) {
        return enumC30815B == EnumC30815B.EDIT && rideMapState == RideMapState.DESTINATION_SELECTION;
    }

    @Override // p000.InterfaceC41876h11
    public boolean onBackPressed() {
        if (this.f120544e.mo15897l().m73665a() != RideMapState.DESTINATION_SELECTION) {
            return false;
        }
        m2095C().mo7221o("handling back press", new Object[0]);
        m2091G();
        return true;
    }

    @Override // p000.InterfaceC41876h11
    public void onResume() {
        if (this.f120548i) {
            m2068b0();
        }
        this.f120548i = false;
    }

    /* renamed from: u */
    public final EnumC30815B m2046u(boolean z, boolean z2) {
        if (!z && z2) {
            return EnumC30815B.INFO;
        }
        return EnumC30815B.EDIT;
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/RideMapState;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z11$R */
    /* loaded from: classes2.dex */
    public static final class C30834R extends Lambda implements Function1<Pair<? extends RideMapState, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C30834R f120585g = new C30834R();

        public C30834R() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends RideMapState, Boolean> pair) {
            boolean z;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            RideMapState component1 = pair.component1();
            Boolean enabled = pair.component2();
            if (component1 == RideMapState.NONE) {
                Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
                if (enabled.booleanValue()) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends RideMapState, ? extends Boolean> pair) {
            return invoke2((Pair<? extends RideMapState, Boolean>) pair);
        }
    }
}
