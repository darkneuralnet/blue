package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Address;
import android.location.Location;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.C31770Ar4;
import p000.C37791a94;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 !2\u00020\u0001:\u0001%B)\b\u0007\u0012\u0006\u0010E\u001a\u00020C\u0012\u0006\u0010H\u001a\u00020F\u0012\u0006\u0010K\u001a\u00020I\u0012\u0006\u0010N\u001a\u00020L¢\u0006\u0004\b{\u0010|J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0016\u0010\u0012\u001a\u00020\n*\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0013\u001a\u00020\nH\u0002J$\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J$\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\"2\u0006\u0010$\u001a\u00020\nH\u0017J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010)\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010,\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0006H\u0016J\b\u00103\u001a\u00020\nH\u0016J\b\u00105\u001a\u000204H\u0016J\u0010\u00107\u001a\u0002012\u0006\u00100\u001a\u000206H\u0016J\b\u00108\u001a\u000201H\u0016J\u0010\u00109\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0006H\u0016J\u0010\u0010;\u001a\u0002012\u0006\u00100\u001a\u00020:H\u0016J\b\u0010<\u001a\u000201H\u0016J\b\u0010>\u001a\u00020=H\u0016J\u0012\u0010@\u001a\u0004\u0018\u00010\u00062\u0006\u0010?\u001a\u000204H\u0016J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0\"2\u0006\u0010A\u001a\u00020\nH\u0016R\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010DR\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010MR!\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060O8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00060T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010UR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00060T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010UR'\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0X0O8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010P\u001a\u0004\bZ\u0010RR \u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0X0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010UR\u0016\u0010`\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010_R\"\u0010d\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010\u00020\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010cR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010eR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010eR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010eR\"\u0010h\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010\u00060\u00060a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010cR\"\u0010i\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010\n0\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010eR\"\u0010j\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010\n0\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010eR\"\u0010m\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010(0(0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010lR \u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0X0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010UR1\u0010q\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020: b*\n\u0012\u0004\u0012\u00020:\u0018\u00010X0X0O8\u0006¢\u0006\f\n\u0004\bZ\u0010o\u001a\u0004\bp\u0010RR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\n0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010UR(\u0010s\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010\n0\n0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010o\u001a\u0004\b\\\u0010RR\u0014\u0010v\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010uR\u0014\u0010z\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010u¨\u0006~²\u0006\u000e\u0010}\u001a\u0004\u0018\u00010:8\nX\u008a\u0084\u0002"}, m28432d2 = {"LAr4;", "Ldr4;", "Law2;", "Lcom/google/android/gms/location/LocationRequest;", "locationRequest", "Lio/reactivex/Observable;", "Landroid/location/Location;", "h0", "t0", "locationStream", "", "includeLastKnownLocation", "v0", "B0", "q0", "E0", "Lco/bird/android/model/User;", "user", "p0", "D0", "", "name", "", "maxResult", "", "Landroid/location/Address;", "u", "", "latitude", "longitude", "z", "r", "j", "w", "Lio/reactivex/F;", "h", "checkLastLocationFirst", "e", "m", "f", "", "interval", "c", "", "smallestDisplacement", "g", "v", "s", "location", "", "b", "k", "LUw2;", "x", "Lco/bird/android/model/wire/WireLocation;", "o", "y", "n", "Lr36;", "l", C17296a.f69688o, "LVw2;", DateTokenConverter.CONVERTER_KEY, Stripe3ds2AuthParams.FIELD_SOURCE, "A", "emitError", "q", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTq4;", "LTq4;", "reactiveConfig", "Lgl;", "Lgl;", "preference", "LOh;", "LOh;", "appBuildConfig", "LZ84;", "Lkotlin/Lazy;", "p", "()LZ84;", "locationChanges", "La94;", "La94;", "mutableLocationChanges", "mutableGpsLocationChanges", "Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "t", "lastLocationUpdateTime", "i", "mutableLastLocationUpdateTime", "LEr4;", "LEr4;", "reactiveProvider", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/a;", "provider", "Lio/reactivex/Observable;", "frequentLocation", "configLocation", "scannedLocationSubject", "isLocationServicesOff", "isLocationPermissionOff", "LAG;", "LAG;", "thirdPartyLocationTimeoutMillisRelay", "mutableThirdPartyLocationWithExpiration", "LZ84;", "k0", "thirdPartyLocationWithExpiration", "mutableAllowCdnLocation", "allowCdnLocationPropertyObservable", "g0", "()Lcom/google/android/gms/location/LocationRequest;", "baseRequest", "j0", "request", "i0", "frequentRequest", "<init>", "(Landroid/content/Context;LTq4;Lgl;LOh;)V", "thirdPartyLoc", "location_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReactiveLocationManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveLocationManagerImpl.kt\nco/bird/android/manager/location/ReactiveLocationManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,453:1\n180#2:454\n180#2:455\n237#2:456\n237#2:457\n9#3,4:458\n1#4:462\n*S KotlinDebug\n*F\n+ 1 ReactiveLocationManagerImpl.kt\nco/bird/android/manager/location/ReactiveLocationManagerImpl\n*L\n127#1:454\n144#1:455\n171#1:456\n283#1:457\n304#1:458,4\n*E\n"})
/* renamed from: Ar4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C31770Ar4 implements InterfaceC40001dr4 {

    /* renamed from: w */
    public static final C0266e f1207w = new C0266e(null);

    /* renamed from: a */
    public final Context f1208a;

    /* renamed from: b */
    public final C36207Tq4 f1209b;

    /* renamed from: c */
    public final C22454gl f1210c;

    /* renamed from: d */
    public final InterfaceC6097Oh f1211d;

    /* renamed from: e */
    public final Lazy f1212e;

    /* renamed from: f */
    public final C37791a94<Location> f1213f;

    /* renamed from: g */
    public final C37791a94<Location> f1214g;

    /* renamed from: h */
    public final Lazy f1215h;

    /* renamed from: i */
    public final C37791a94<Optional<DateTime>> f1216i;

    /* renamed from: j */
    public C32706Er4 f1217j;

    /* renamed from: k */
    public final C24552a<InterfaceC38253aw2> f1218k;
    @SuppressLint({"MissingPermission"})

    /* renamed from: l */
    public final Observable<Location> f1219l;

    /* renamed from: m */
    public final Observable<Location> f1220m;

    /* renamed from: n */
    public final Observable<Location> f1221n;

    /* renamed from: o */
    public final C24552a<Location> f1222o;

    /* renamed from: p */
    public final Observable<Boolean> f1223p;

    /* renamed from: q */
    public final Observable<Boolean> f1224q;

    /* renamed from: r */
    public final C0058AG<Long> f1225r;

    /* renamed from: s */
    public final C37791a94<Optional<C47831r36>> f1226s;

    /* renamed from: t */
    public final Z84<Optional<C47831r36>> f1227t;

    /* renamed from: u */
    public final C37791a94<Boolean> f1228u;

    /* renamed from: v */
    public final Z84<Boolean> f1229v;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "locationDisabled", "Landroid/location/Location;", C17296a.f69688o, "(Z)Landroid/location/Location;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReactiveLocationManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveLocationManagerImpl.kt\nco/bird/android/manager/location/ReactiveLocationManagerImpl$setScannedBirdLocation$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,453:1\n1#2:454\n*E\n"})
    /* renamed from: Ar4$A */
    /* loaded from: classes4.dex */
    public static final class C0259A extends Lambda implements Function1<Boolean, Location> {

        /* renamed from: g */
        public final /* synthetic */ Location f1230g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0259A(Location location) {
            super(1);
            this.f1230g = location;
        }

        /* renamed from: a */
        public final Location m115051a(boolean z) {
            Location location = this.f1230g;
            if (z) {
                return location;
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Location invoke(Boolean bool) {
            return m115051a(bool.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ar4$B */
    /* loaded from: classes4.dex */
    public static final class C0260B extends Lambda implements Function1<Location, Unit> {
        public C0260B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location it) {
            DateTime m16554b;
            C22454gl c22454gl = C31770Ar4.this.f1210c;
            C37429Yw2 c37429Yw2 = C37429Yw2.f47648a;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c22454gl.m37638c2(c37429Yw2.m73961j(it));
            C31770Ar4.this.f1214g.accept(it);
            C37791a94 c37791a94 = C31770Ar4.this.f1216i;
            Optional.C14443a c14443a = Optional.f63040c;
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            c37791a94.accept(c14443a.m59032c(now));
            C47831r36 c47831r36 = (C47831r36) ((Optional) C31770Ar4.this.f1226s.getValue()).m59035e();
            boolean z = false;
            if (c47831r36 != null && (m16554b = c47831r36.m16554b()) != null && m16554b.isAfterNow()) {
                z = true;
            }
            if (z) {
                return;
            }
            C31770Ar4.this.f1213f.accept(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "off", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ar4$a */
    /* loaded from: classes4.dex */
    public static final class C0261a extends Lambda implements Function1<Boolean, Unit> {
        public C0261a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean off) {
            Intrinsics.checkNotNullExpressionValue(off, "off");
            if (off.booleanValue()) {
                C31770Ar4.this.f1210c.m37616i();
            }
            C31770Ar4 c31770Ar4 = C31770Ar4.this;
            c31770Ar4.f1217j = new C32706Er4(c31770Ar4.f1208a);
            C31770Ar4.this.f1218k.onNext(C31770Ar4.this.f1217j);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ar4$b */
    /* loaded from: classes4.dex */
    public static final class C0262b extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C0262b f1233g = new C0262b();

        public C0262b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getAllowCdnLocation());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012 \u0010\u0004\u001a\u001c\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "Landroid/location/Location;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$c */
    /* loaded from: classes4.dex */
    public static final class C0263c extends Lambda implements Function1<Triple<? extends Boolean, ? extends Boolean, ? extends Location>, Boolean> {

        /* renamed from: g */
        public static final C0263c f1234g = new C0263c();

        public C0263c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Triple<Boolean, Boolean, ? extends Location> triple) {
            boolean z;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Boolean allowed = triple.component1();
            boolean booleanValue = triple.component2().booleanValue();
            Location component3 = triple.component3();
            Intrinsics.checkNotNullExpressionValue(allowed, "allowed");
            if (allowed.booleanValue() && (booleanValue || !C39339cm2.m60886c(C39339cm2.m60885d(component3)))) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "millisToExpire", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$d */
    /* loaded from: classes4.dex */
    public static final class C0264d extends Lambda implements Function1<Long, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ar4$d$a */
        /* loaded from: classes4.dex */
        public static final class C0265a extends Lambda implements Function1<Long, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C31770Ar4 f1236g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0265a(C31770Ar4 c31770Ar4) {
                super(1);
                this.f1236g = c31770Ar4;
            }

            /* renamed from: a */
            public final void m115048a(Long l) {
                DateTime m16554b;
                C47831r36 c47831r36 = (C47831r36) ((Optional) this.f1236g.f1226s.getValue()).m59035e();
                boolean z = false;
                if (c47831r36 != null && (m16554b = c47831r36.m16554b()) != null && m16554b.isAfterNow()) {
                    z = true;
                }
                if (!z) {
                    this.f1236g.f1213f.accept(this.f1236g.f1214g.getValue());
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                m115048a(l);
                return Unit.INSTANCE;
            }
        }

        public C0264d() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Long millisToExpire) {
            Intrinsics.checkNotNullParameter(millisToExpire, "millisToExpire");
            Observable<Long> timer = Observable.timer(millisToExpire.longValue() + 100, TimeUnit.MILLISECONDS);
            final C0265a c0265a = new C0265a(C31770Ar4.this);
            return timer.doOnNext(new InterfaceC23484g() { // from class: Br4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C31770Ar4.C0264d.invoke$lambda$0(Function1.this, obj);
                }
            }).ignoreElements().m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LAr4$e;", "", "", "CHECK_LOCATION_SERVICE_INTERVAL", "J", "THIRD_PARTY_EXPIRATION_TIMER_PADDING_MILLIS", "<init>", "()V", "location_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$e */
    /* loaded from: classes4.dex */
    public static final class C0266e {
        public /* synthetic */ C0266e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0266e() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ar4$f */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0267f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC36493Uw2.values().length];
            try {
                iArr[EnumC36493Uw2.VPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36493Uw2.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC36493Uw2.GPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Law2;", "it", "Lio/reactivex/K;", "", "Landroid/location/Address;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Law2;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$g */
    /* loaded from: classes4.dex */
    public static final class C0268g extends Lambda implements Function1<InterfaceC38253aw2, InterfaceC23447K<? extends List<? extends Address>>> {

        /* renamed from: g */
        public final /* synthetic */ double f1237g;

        /* renamed from: h */
        public final /* synthetic */ double f1238h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0268g(double d, double d2) {
            super(1);
            this.f1237g = d;
            this.f1238h = d2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<Address>> invoke(InterfaceC38253aw2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.mo65221a(this.f1237g, this.f1238h, 1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Landroid/location/Address;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ar4$h */
    /* loaded from: classes4.dex */
    public static final class C0269h extends Lambda implements Function1<List<? extends Address>, String> {

        /* renamed from: g */
        public static final C0269h f1239g = new C0269h();

        public C0269h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(List<? extends Address> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C32472Dr4.m109850a(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Law2;", "it", "Lio/reactivex/K;", "", "Landroid/location/Address;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Law2;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$i */
    /* loaded from: classes4.dex */
    public static final class C0270i extends Lambda implements Function1<InterfaceC38253aw2, InterfaceC23447K<? extends List<? extends Address>>> {

        /* renamed from: g */
        public final /* synthetic */ String f1240g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0270i(String str) {
            super(1);
            this.f1240g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<Address>> invoke(InterfaceC38253aw2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.mo65219c(this.f1240g, 1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Law2;", "it", "Lio/reactivex/K;", "", "Landroid/location/Address;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Law2;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$j */
    /* loaded from: classes4.dex */
    public static final class C0271j extends Lambda implements Function1<InterfaceC38253aw2, InterfaceC23447K<? extends List<? extends Address>>> {

        /* renamed from: g */
        public final /* synthetic */ double f1241g;

        /* renamed from: h */
        public final /* synthetic */ double f1242h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0271j(double d, double d2) {
            super(1);
            this.f1241g = d;
            this.f1242h = d2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<Address>> invoke(InterfaceC38253aw2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.mo65221a(this.f1241g, this.f1242h, 1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$k */
    /* loaded from: classes4.dex */
    public static final class C0272k extends Lambda implements Function1<Long, InterfaceC23434B<? extends Location>> {
        public C0272k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Location> invoke(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C31770Ar4 c31770Ar4 = C31770Ar4.this;
            LocationRequest interval = c31770Ar4.m115068j0().setInterval(TimeUnit.SECONDS.toMillis(it.longValue()));
            Intrinsics.checkNotNullExpressionValue(interval, "request.setInterval(TimeUnit.SECONDS.toMillis(it))");
            return c31770Ar4.m115058t0(interval);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lkotlin/Pair;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ar4$l */
    /* loaded from: classes4.dex */
    public static final class C0273l extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C0273l f1244g = new C0273l();

        public C0273l() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Boolean, Boolean> it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            Boolean first = it.getFirst();
            Intrinsics.checkNotNullExpressionValue(first, "it.first");
            if (!first.booleanValue()) {
                Boolean second = it.getSecond();
                Intrinsics.checkNotNullExpressionValue(second, "it.second");
                if (!second.booleanValue()) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            return invoke2((Pair<Boolean, Boolean>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$m */
    /* loaded from: classes4.dex */
    public static final class C0274m extends Lambda implements Function1<Location, Boolean> {

        /* renamed from: g */
        public static final C0274m f1245g = new C0274m();

        public C0274m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Location it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.isFromMockProvider());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Long;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ar4$n */
    /* loaded from: classes4.dex */
    public static final class C0275n extends Lambda implements Function1<Long, Boolean> {
        public C0275n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C31770Ar4.this.m115102D0());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Long;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ar4$o */
    /* loaded from: classes4.dex */
    public static final class C0276o extends Lambda implements Function1<Long, Boolean> {
        public C0276o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!C40788fB0.m41760v(C31770Ar4.this.f1208a));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$p */
    /* loaded from: classes4.dex */
    public static final class C0277p extends Lambda implements Function1<InterfaceC23444H<Boolean>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f1249h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0277p(boolean z) {
            super(1);
            this.f1249h = z;
        }

        /* renamed from: b */
        public static final void m115042b(InterfaceC23444H emitter, boolean z, Task task) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(task, "task");
            try {
                task.getResult(ApiException.class);
                emitter.onSuccess(Boolean.TRUE);
            } catch (ApiException e) {
                if (z) {
                    emitter.onError(e);
                } else {
                    emitter.onSuccess(Boolean.FALSE);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<Boolean> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC23444H<Boolean> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            LocationSettingsRequest.Builder addLocationRequest = new LocationSettingsRequest.Builder().addLocationRequest(LocationRequest.create().setPriority(100));
            Intrinsics.checkNotNullExpressionValue(addLocationRequest, "Builder()\n        .addLo….PRIORITY_HIGH_ACCURACY))");
            Task<LocationSettingsResponse> checkLocationSettings = LocationServices.getSettingsClient(C31770Ar4.this.f1208a).checkLocationSettings(addLocationRequest.build());
            final boolean z = this.f1249h;
            checkLocationSettings.addOnCompleteListener(new OnCompleteListener() { // from class: Cr4
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C31770Ar4.C0277p.m115042b(InterfaceC23444H.this, z, task);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Law2;", "it", "Lio/reactivex/u;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Law2;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$q */
    /* loaded from: classes4.dex */
    public static final class C0278q extends Lambda implements Function1<InterfaceC38253aw2, InterfaceC24574u<? extends Location>> {

        /* renamed from: g */
        public static final C0278q f1250g = new C0278q();

        public C0278q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Location> invoke(InterfaceC38253aw2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.mo65218d();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$r */
    /* loaded from: classes4.dex */
    public static final class C0279r extends Lambda implements Function0<Z84<Optional<DateTime>>> {
        public C0279r() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<DateTime>> invoke() {
            return Z84.f47888d.m73663b(C31770Ar4.this.f1216i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$s */
    /* loaded from: classes4.dex */
    public static final class C0280s extends Lambda implements Function0<Z84<Location>> {
        public C0280s() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Location> invoke() {
            return Z84.f47888d.m73663b(C31770Ar4.this.f1213f);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lr36;", "b", "()Lr36;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$t */
    /* loaded from: classes4.dex */
    public static final class C0281t extends Lambda implements Function0<C47831r36> {
        public C0281t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C47831r36 invoke() {
            return C31770Ar4.this.m115067k0().m73665a().m59035e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Law2;", "it", "Lio/reactivex/B;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Law2;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$u */
    /* loaded from: classes4.dex */
    public static final class C0282u extends Lambda implements Function1<InterfaceC38253aw2, InterfaceC23434B<? extends Location>> {

        /* renamed from: h */
        public final /* synthetic */ LocationRequest f1255h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0282u(LocationRequest locationRequest) {
            super(1);
            this.f1255h = locationRequest;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Location> invoke(InterfaceC38253aw2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C31770Ar4.this.m115070h0(it, this.f1255h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/location/Location;", "location", "", C17296a.f69688o, "(Landroid/location/Location;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$v */
    /* loaded from: classes4.dex */
    public static final class C0283v extends Lambda implements Function1<Location, Boolean> {

        /* renamed from: g */
        public static final C0283v f1256g = new C0283v();

        public C0283v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Location location) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(location, "location");
            boolean z3 = true;
            if (location.getLatitude() == 0.0d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (location.getLongitude() == 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = false;
                }
            }
            return Boolean.valueOf(z3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "prevLocation", "newLocation", "", C17296a.f69688o, "(Landroid/location/Location;Landroid/location/Location;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$w */
    /* loaded from: classes4.dex */
    public static final class C0284w extends Lambda implements Function2<Location, Location, Boolean> {

        /* renamed from: g */
        public static final C0284w f1257g = new C0284w();

        public C0284w() {
            super(2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
            if (r6 != false) goto L9;
         */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(Location prevLocation, Location newLocation) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(prevLocation, "prevLocation");
            Intrinsics.checkNotNullParameter(newLocation, "newLocation");
            boolean z3 = true;
            if (prevLocation.getLatitude() == newLocation.getLatitude()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (prevLocation.getLongitude() == newLocation.getLongitude()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            z3 = false;
            return Boolean.valueOf(z3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/location/Location;", "it", "", C17296a.f69688o, "(Landroid/location/Location;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$x */
    /* loaded from: classes4.dex */
    public static final class C0285x extends Lambda implements Function1<Location, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ boolean f1258g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0285x(boolean z) {
            super(1);
            this.f1258g = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Location it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!this.f1258g && !it.isFromMockProvider()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "first", "second", "", C17296a.f69688o, "(Landroid/location/Location;Landroid/location/Location;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$y */
    /* loaded from: classes4.dex */
    public static final class C0286y extends Lambda implements Function2<Location, Location, Boolean> {

        /* renamed from: g */
        public static final C0286y f1259g = new C0286y();

        public C0286y() {
            super(2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
            if (r6 != false) goto L9;
         */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(Location first, Location second) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            boolean z3 = true;
            if (first.getLatitude() == second.getLatitude()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (first.getLongitude() == second.getLongitude()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            z3 = false;
            return Boolean.valueOf(z3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/location/Location;", "location", "", C17296a.f69688o, "(Landroid/location/Location;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar4$z */
    /* loaded from: classes4.dex */
    public static final class C0287z extends Lambda implements Function1<Location, Boolean> {
        public C0287z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Location location) {
            boolean z;
            Intrinsics.checkNotNullParameter(location, "location");
            C31770Ar4 c31770Ar4 = C31770Ar4.this;
            if (!c31770Ar4.m115062p0(location, c31770Ar4.f1210c.m37750B0()) && C31770Ar4.this.f1209b.m82623f8().m73665a().getBlockMockLocationProviders()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public C31770Ar4(Context context, C36207Tq4 reactiveConfig, C22454gl preference, InterfaceC6097Oh appBuildConfig) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        this.f1208a = context;
        this.f1209b = reactiveConfig;
        this.f1210c = preference;
        this.f1211d = appBuildConfig;
        lazy = LazyKt__LazyJVMKt.lazy(new C0280s());
        this.f1212e = lazy;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        C37791a94<Location> create$default = C37791a94.C10586a.create$default(c10586a, preference.m37667W().fromLocation(), null, 2, null);
        this.f1213f = create$default;
        this.f1214g = C37791a94.C10586a.create$default(c10586a, create$default.getValue(), null, 2, null);
        lazy2 = LazyKt__LazyJVMKt.lazy(new C0279r());
        this.f1215h = lazy2;
        Optional.C14443a c14443a = Optional.f63040c;
        this.f1216i = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f1217j = new C32706Er4(context);
        C24552a<InterfaceC38253aw2> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<LocationProvider>()");
        this.f1218k = m31922e;
        this.f1219l = m115058t0(m115069i0());
        this.f1220m = m115058t0(m115068j0());
        Observable<Long> m82414z2 = reactiveConfig.m82414z2();
        final C0272k c0272k = new C0272k();
        Observable<Location> m32084i = m82414z2.switchMap(new InterfaceC23492o() { // from class: pr4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m115072f0;
                m115072f0 = C31770Ar4.m115072f0(Function1.this, obj);
                return m115072f0;
            }
        }).replay(1).m32084i();
        Intrinsics.checkNotNullExpressionValue(m32084i, "reactiveConfig.androidLo…replay(1)\n    .refCount()");
        this.f1221n = m32084i;
        C24552a<Location> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<Location>()");
        this.f1222o = m31922e2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable<Long> interval = Observable.interval(0L, 3000L, timeUnit);
        final C0276o c0276o = new C0276o();
        Observable<Boolean> m32084i2 = interval.map(new InterfaceC23492o() { // from class: sr4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m115063o0;
                m115063o0 = C31770Ar4.m115063o0(Function1.this, obj);
                return m115063o0;
            }
        }).distinctUntilChanged().subscribeOn(C24542a.m31932c()).replay(1).m32084i();
        Intrinsics.checkNotNullExpressionValue(m32084i2, "interval(0 /* initialDel…replay(1)\n    .refCount()");
        this.f1223p = m32084i2;
        Observable<Long> interval2 = Observable.interval(0L, 3000L, timeUnit);
        final C0275n c0275n = new C0275n();
        Observable<Boolean> m32084i3 = interval2.map(new InterfaceC23492o() { // from class: tr4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m115064n0;
                m115064n0 = C31770Ar4.m115064n0(Function1.this, obj);
                return m115064n0;
            }
        }).distinctUntilChanged().subscribeOn(C24542a.m31932c()).replay(1).m32084i();
        Intrinsics.checkNotNullExpressionValue(m32084i3, "interval(0 /* initialDel…replay(1)\n    .refCount()");
        this.f1224q = m32084i3;
        C0058AG<Long> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Long>()");
        this.f1225r = m115951g;
        C37791a94<Optional<C47831r36>> create$default2 = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f1226s = create$default2;
        Z84.C10119a c10119a = Z84.f47888d;
        this.f1227t = c10119a.m73663b(create$default2);
        C37791a94<Boolean> create$default3 = C37791a94.C10586a.create$default(c10586a, Boolean.FALSE, null, 2, null);
        this.f1228u = create$default3;
        this.f1229v = c10119a.m73663b(create$default3);
        Observable<Boolean> distinctUntilChanged = mo43609w().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "isLocationDisabled()\n      .distinctUntilChanged()");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = distinctUntilChanged.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0261a c0261a = new C0261a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ur4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31770Ar4.m115080X(Function1.this, obj);
            }
        });
        C24523e c24523e = C24523e.f91168a;
        Z84<Config> m82623f8 = reactiveConfig.m82623f8();
        final C0262b c0262b = C0262b.f1233g;
        Object map = m82623f8.map(new InterfaceC23492o() { // from class: vr4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m115079Y;
                m115079Y = C31770Ar4.m115079Y(Function1.this, obj);
                return m115079Y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "reactiveConfig.config.map { it.allowCdnLocation }");
        Observable m31955b = c24523e.m31955b(map, mo43609w(), mo43616p());
        final C0263c c0263c = C0263c.f1234g;
        Observable map2 = m31955b.map(new InterfaceC23492o() { // from class: wr4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m115078Z;
                m115078Z = C31770Ar4.m115078Z(Function1.this, obj);
                return m115078Z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "Observables.combineLates…tLng().isValid())\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = map2.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe(create$default3);
        Config m73665a = reactiveConfig.m82623f8().m73665a();
        if (m73665a.getEnableLocationFaking() && m73665a.getPersistFakeLocationIfEnabled()) {
            mo43617o(preference.m37683S());
        }
        final C0264d c0264d = new C0264d();
        AbstractC23461c switchMapCompletable = m115951g.switchMapCompletable(new InterfaceC23492o() { // from class: xr4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m115077a0;
                m115077a0 = C31770Ar4.m115077a0(Function1.this, obj);
                return m115077a0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "thirdPartyLocationTimeou…onErrorComplete()\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: A0 */
    public static final boolean m115108A0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: C0 */
    public static final boolean m115104C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: F0 */
    public static final void m115098F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m115080X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final Boolean m115079Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final Boolean m115078Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC23496h m115077a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final String m115076b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23447K m115075c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23447K m115074d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC23447K m115073e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC23434B m115072f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final Boolean m115066l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final Boolean m115065m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final Boolean m115064n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final Boolean m115063o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final InterfaceC24574u m115060r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final C47831r36 m115059s0(Lazy<C47831r36> lazy) {
        return lazy.getValue();
    }

    /* renamed from: u0 */
    public static final InterfaceC23434B m115057u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final boolean m115055w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: x0 */
    public static final Location m115054x0(float f, Location prevLocation, Location newLocation) {
        Intrinsics.checkNotNullParameter(prevLocation, "prevLocation");
        Intrinsics.checkNotNullParameter(newLocation, "newLocation");
        float[] fArr = new float[1];
        Location.distanceBetween(newLocation.getLatitude(), newLocation.getLongitude(), prevLocation.getLatitude(), prevLocation.getLongitude(), fArr);
        if (fArr[0] > f) {
            return newLocation;
        }
        return prevLocation;
    }

    /* renamed from: y0 */
    public static final boolean m115053y0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: z0 */
    public static final boolean m115052z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: A */
    public Location mo43632A(EnumC36493Uw2 source) {
        C36727Vw2 m16553c;
        Intrinsics.checkNotNullParameter(source, "source");
        int i = C0267f.$EnumSwitchMapping$0[source.ordinal()];
        boolean z = true;
        Location location = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Location value = this.f1214g.getValue();
                    if (C39339cm2.m60888a(value)) {
                        location = value;
                    }
                    return location;
                }
                throw new NoWhenBranchMatchedException();
            }
            Location fromLocation = this.f1210c.m37683S().fromLocation();
            if (!C39339cm2.m60888a(fromLocation)) {
                return null;
            }
            return fromLocation;
        }
        C47831r36 m59035e = this.f1227t.m73665a().m59035e();
        if (m59035e == null) {
            return null;
        }
        if (!((m59035e.m16554b().isAfterNow() && m59035e.m16553c().m79220c() == source && C39339cm2.m60888a(m59035e.m16553c().m79221b())) ? false : false)) {
            m59035e = null;
        }
        if (m59035e == null || (m16553c = m59035e.m16553c()) == null) {
            return null;
        }
        return m16553c.m79221b();
    }

    /* renamed from: B0 */
    public final Observable<Location> m115106B0(Observable<Location> observable) {
        final C0287z c0287z = new C0287z();
        Observable<Location> filter = observable.filter(new InterfaceC23494q() { // from class: qr4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m115104C0;
                m115104C0 = C31770Ar4.m115104C0(Function1.this, obj);
                return m115104C0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "private fun Observable<L…cationProviders\n    }\n  }");
        return filter;
    }

    /* renamed from: D0 */
    public final boolean m115102D0() {
        return !C40788fB0.m41759w(this.f1208a);
    }

    /* renamed from: E0 */
    public final Observable<Location> m115100E0(Observable<Location> observable) {
        final C0260B c0260b = new C0260B();
        Observable<Location> doOnNext = observable.doOnNext(new InterfaceC23484g() { // from class: kr4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31770Ar4.m115098F0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "private fun Observable<L…ept(it)\n      }\n    }\n  }");
        return doOnNext;
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: a */
    public void mo43631a() {
        this.f1226s.m71836j();
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: b */
    public void mo43630b(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f1222o.onNext(location);
        AbstractC23461c m33069Q = m115100E0(C37279Yf5.m74575T(mo43609w(), new C0259A(location))).firstOrError().m33159G().m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "location: Location) {\n  …ement().onErrorComplete()");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: c */
    public Observable<Location> mo43629c(long j, boolean z) {
        LocationRequest interval = m115068j0().setInterval(j);
        Intrinsics.checkNotNullExpressionValue(interval, "request.setInterval(interval)");
        return mo43610v(interval, z);
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: d */
    public C36727Vw2 mo43628d() {
        C36727Vw2 m16553c;
        C47831r36 m59035e = this.f1227t.m73665a().m59035e();
        if (m59035e != null) {
            if (!m59035e.m16554b().isAfterNow()) {
                m59035e = null;
            }
            if (m59035e != null && (m16553c = m59035e.m16553c()) != null) {
                return m16553c;
            }
        }
        return new C36727Vw2(mo43616p().m73665a(), mo43608x());
    }

    @Override // p000.InterfaceC40001dr4
    @SuppressLint({"MissingPermission"})
    /* renamed from: e */
    public AbstractC23442F<Location> mo43627e(boolean z) {
        AbstractC23442F<Location> firstOrError = mo43626f(z).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "locationUpdates(checkLas…tionFirst).firstOrError()");
        return firstOrError;
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: f */
    public Observable<Location> mo43626f(boolean z) {
        return m115056v0(this.f1220m, z);
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: g */
    public Observable<Location> mo43625g(final float f, boolean z) {
        Observable<Location> m115056v0 = m115056v0(m115058t0(m115068j0()), z);
        final C0283v c0283v = C0283v.f1256g;
        Observable<Location> scan = m115056v0.filter(new InterfaceC23494q() { // from class: mr4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m115055w0;
                m115055w0 = C31770Ar4.m115055w0(Function1.this, obj);
                return m115055w0;
            }
        }).scan(new InterfaceC23480c() { // from class: nr4
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Location m115054x0;
                m115054x0 = C31770Ar4.m115054x0(f, (Location) obj, (Location) obj2);
                return m115054x0;
            }
        });
        final C0284w c0284w = C0284w.f1257g;
        Observable<Location> distinctUntilChanged = scan.distinctUntilChanged(new InterfaceC23481d() { // from class: or4
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m115053y0;
                m115053y0 = C31770Ar4.m115053y0(Function2.this, obj, obj2);
                return m115053y0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "locationUpdates(\n      l…ocation.longitude\n      }");
        return distinctUntilChanged;
    }

    /* renamed from: g0 */
    public final LocationRequest m115071g0() {
        LocationRequest numUpdates = LocationRequest.create().setPriority(100).setNumUpdates(Integer.MAX_VALUE);
        Intrinsics.checkNotNullExpressionValue(numUpdates, "create()\n    .setPriorit…pdates(Integer.MAX_VALUE)");
        return numUpdates;
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: h */
    public AbstractC23442F<Boolean> mo43624h() {
        Observable<Location> mo43626f = mo43626f(true);
        final C0274m c0274m = C0274m.f1245g;
        AbstractC23442F<Boolean> firstOrError = mo43626f.map(new InterfaceC23492o() { // from class: rr4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m115065m0;
                m115065m0 = C31770Ar4.m115065m0(Function1.this, obj);
                return m115065m0;
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "locationUpdates(includeL…Provider }.firstOrError()");
        return firstOrError;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: h0 */
    public final Observable<Location> m115070h0(InterfaceC38253aw2 interfaceC38253aw2, LocationRequest locationRequest) {
        if (m115102D0()) {
            Observable<Location> just = Observable.just(C37068Xi1.f43709a.m76547a());
            Intrinsics.checkNotNullExpressionValue(just, "{\n      Observable.just(….defaultLocation())\n    }");
            return just;
        }
        return interfaceC38253aw2.mo65220b(locationRequest);
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: i */
    public Z84<Boolean> mo43623i() {
        return this.f1229v;
    }

    /* renamed from: i0 */
    public final LocationRequest m115069i0() {
        LocationRequest interval = m115071g0().setInterval(5000L);
        Intrinsics.checkNotNullExpressionValue(interval, "baseRequest\n    .setInte…EHICLE_LOCATION_DURATION)");
        return interval;
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: j */
    public Observable<Boolean> mo43622j() {
        return this.f1223p;
    }

    /* renamed from: j0 */
    public final LocationRequest m115068j0() {
        LocationRequest smallestDisplacement = m115071g0().setInterval(30000L).setFastestInterval(0L).setSmallestDisplacement(2.0f);
        Intrinsics.checkNotNullExpressionValue(smallestDisplacement, "baseRequest\n    .setInte…E_LOCATION_RADIUS_METERS)");
        return smallestDisplacement;
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: k */
    public boolean mo43621k() {
        return !m115102D0();
    }

    /* renamed from: k0 */
    public final Z84<Optional<C47831r36>> m115067k0() {
        return this.f1227t;
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: l */
    public void mo43620l(C47831r36 location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f1226s.accept(Optional.f63040c.m59032c(location));
        long abs = Math.abs(DateTime.now().getMillis() - location.m16554b().getMillis());
        this.f1225r.accept(Long.valueOf(abs));
        if (abs > 0) {
            this.f1213f.accept(location.m16553c().m79221b());
        }
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: m */
    public Observable<Location> mo43619m(boolean z) {
        return m115056v0(this.f1219l, z);
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: n */
    public double mo43618n(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return mo43616p().getValue().distanceTo(location);
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: o */
    public void mo43617o(WireLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f1210c.m37657Y1(location);
        if (!(this.f1218k.getValue() instanceof C33333Hj1)) {
            this.f1218k.onNext(new C33333Hj1(this.f1217j));
        }
        InterfaceC38253aw2 value = this.f1218k.getValue();
        if (!(value instanceof C33333Hj1)) {
            value = null;
        }
        C33333Hj1 c33333Hj1 = (C33333Hj1) value;
        if (c33333Hj1 != null) {
            c33333Hj1.m103494f(location.getLatitude(), location.getLongitude(), this.f1209b.m82623f8().m73665a().getLocationFakingHorizontalAccuracy());
        }
        C37791a94<Optional<DateTime>> c37791a94 = this.f1216i;
        Optional.C14443a c14443a = Optional.f63040c;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        c37791a94.accept(c14443a.m59032c(now));
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: p */
    public Z84<Location> mo43616p() {
        return (Z84) this.f1212e.getValue();
    }

    /* renamed from: p0 */
    public final boolean m115062p0(Location location, User user) {
        if (location.isFromMockProvider()) {
            return !(user != null && !C42878ii6.m33536a(user, this.f1211d.mo89921k()));
        }
        return true;
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: q */
    public AbstractC23442F<Boolean> mo43615q(boolean z) {
        return C45832nh5.m23305k(new C0277p(z));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: q0 */
    public final Observable<Location> m115061q0() {
        Observable<Location> m115106B0;
        if (m115102D0()) {
            m115106B0 = Observable.just(C37068Xi1.f43709a.m76547a());
            Intrinsics.checkNotNullExpressionValue(m115106B0, "{\n      Observable.just(….defaultLocation())\n    }");
        } else {
            C24552a<InterfaceC38253aw2> c24552a = this.f1218k;
            final C0278q c0278q = C0278q.f1250g;
            Observable<Location> switchMapMaybe = c24552a.switchMapMaybe(new InterfaceC23492o() { // from class: lr4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m115060r0;
                    m115060r0 = C31770Ar4.m115060r0(Function1.this, obj);
                    return m115060r0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(switchMapMaybe, "provider\n        .switch… it.lastKnownLocation() }");
            m115106B0 = m115106B0(switchMapMaybe);
        }
        return m115100E0(m115106B0);
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: r */
    public Observable<String> mo43614r(double d, double d2) {
        C24552a<InterfaceC38253aw2> c24552a = this.f1218k;
        final C0268g c0268g = new C0268g(d, d2);
        Observable<R> switchMapSingle = c24552a.switchMapSingle(new InterfaceC23492o() { // from class: yr4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m115075c0;
                m115075c0 = C31770Ar4.m115075c0(Function1.this, obj);
                return m115075c0;
            }
        });
        final C0269h c0269h = C0269h.f1239g;
        Observable<String> map = switchMapSingle.map(new InterfaceC23492o() { // from class: zr4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m115076b0;
                m115076b0 = C31770Ar4.m115076b0(Function1.this, obj);
                return m115076b0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "latitude: Double, longit…) }.map { normalize(it) }");
        return map;
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: s */
    public Observable<Location> mo43613s(boolean z) {
        return m115056v0(this.f1221n, z);
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: t */
    public Z84<Optional<DateTime>> mo43612t() {
        return (Z84) this.f1215h.getValue();
    }

    /* renamed from: t0 */
    public final Observable<Location> m115058t0(LocationRequest locationRequest) {
        C24552a<InterfaceC38253aw2> c24552a = this.f1218k;
        final C0282u c0282u = new C0282u(locationRequest);
        Observable<Location> switchMap = c24552a.switchMap(new InterfaceC23492o() { // from class: er4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m115057u0;
                m115057u0 = C31770Ar4.m115057u0(Function1.this, obj);
                return m115057u0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "private fun locationStre…(1)\n      .refCount()\n  }");
        Observable<Location> m32084i = m115100E0(m115106B0(switchMap)).replay(1).m32084i();
        Intrinsics.checkNotNullExpressionValue(m32084i, "private fun locationStre…(1)\n      .refCount()\n  }");
        return m32084i;
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: u */
    public Observable<List<Address>> mo43611u(String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        C24552a<InterfaceC38253aw2> c24552a = this.f1218k;
        final C0270i c0270i = new C0270i(name);
        Observable switchMapSingle = c24552a.switchMapSingle(new InterfaceC23492o() { // from class: ir4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m115074d0;
                m115074d0 = C31770Ar4.m115074d0(Function1.this, obj);
                return m115074d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapSingle, "name: String, maxResult:…e { it.geocode(name, 1) }");
        return switchMapSingle;
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: v */
    public Observable<Location> mo43610v(LocationRequest locationRequest, boolean z) {
        Intrinsics.checkNotNullParameter(locationRequest, "locationRequest");
        return m115056v0(m115058t0(locationRequest), z);
    }

    /* renamed from: v0 */
    public final Observable<Location> m115056v0(Observable<Location> observable, boolean z) {
        Observable<Location> m115061q0 = m115061q0();
        final C0285x c0285x = new C0285x(z);
        Observable merge = Observable.merge(observable, m115061q0.filter(new InterfaceC23494q() { // from class: gr4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m115052z0;
                m115052z0 = C31770Ar4.m115052z0(Function1.this, obj);
                return m115052z0;
            }
        }));
        final C0286y c0286y = C0286y.f1259g;
        Observable<Location> subscribeOn = merge.distinctUntilChanged(new InterfaceC23481d() { // from class: hr4
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m115108A0;
                m115108A0 = C31770Ar4.m115108A0(Function2.this, obj, obj2);
                return m115108A0;
            }
        }).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "includeLastKnownLocation…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: w */
    public Observable<Boolean> mo43609w() {
        Observable m31956a = C24523e.f91168a.m31956a(this.f1223p, this.f1224q);
        final C0273l c0273l = C0273l.f1244g;
        Observable<Boolean> map = m31956a.map(new InterfaceC23492o() { // from class: jr4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m115066l0;
                m115066l0 = C31770Ar4.m115066l0(Function1.this, obj);
                return m115066l0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "Observables.combineLates…{ it.first || it.second }");
        return map;
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: x */
    public EnumC36493Uw2 mo43608x() {
        Lazy lazy;
        DateTime m16554b;
        lazy = LazyKt__LazyJVMKt.lazy(new C0281t());
        if (this.f1218k.getValue() instanceof C33333Hj1) {
            return EnumC36493Uw2.MANUAL;
        }
        C47831r36 m115059s0 = m115059s0(lazy);
        boolean z = false;
        if (m115059s0 != null && (m16554b = m115059s0.m16554b()) != null && m16554b.isAfterNow()) {
            z = true;
        }
        if (z) {
            C47831r36 m115059s02 = m115059s0(lazy);
            Intrinsics.checkNotNull(m115059s02);
            return m115059s02.m16553c().m79220c();
        }
        return EnumC36493Uw2.GPS;
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: y */
    public void mo43607y() {
        C32706Er4 c32706Er4 = new C32706Er4(this.f1208a);
        this.f1217j = c32706Er4;
        this.f1218k.onNext(c32706Er4);
    }

    @Override // p000.InterfaceC40001dr4
    /* renamed from: z */
    public Observable<List<Address>> mo43606z(double d, double d2) {
        C24552a<InterfaceC38253aw2> c24552a = this.f1218k;
        final C0271j c0271j = new C0271j(d, d2);
        Observable switchMapSingle = c24552a.switchMapSingle(new InterfaceC23492o() { // from class: fr4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m115073e0;
                m115073e0 = C31770Ar4.m115073e0(Function1.this, obj);
                return m115073e0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapSingle, "latitude: Double, longit…latitude, longitude, 1) }");
        return switchMapSingle;
    }
}
