package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import co.bird.android.model.Command;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.VehicleVersion;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.wire.configs.PrivateBirdFirmwareConfig;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import p000.C37113Xn1;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001nB+\b\u0007\u0012\u0006\u0010p\u001a\u00020m\u0012\u0006\u0010s\u001a\u00020q\u0012\u0006\u0010v\u001a\u00020t\u0012\u0006\u0010y\u001a\u00020w¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010 \u001a\u00020\u0017H\u0002J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020!0#2\u0006\u0010\"\u001a\u00020!H\u0002J;\u0010*\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020\u0017H\u0002J\u0010\u0010.\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010/\u001a\u00020\u0017H\u0002J\b\u00100\u001a\u00020\u0017H\u0002J\b\u00101\u001a\u00020\u0017H\u0002J\b\u00102\u001a\u00020\u0017H\u0002J\u0010\u00104\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u0019H\u0002J\u0010\u00105\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u0019H\u0002J\b\u00106\u001a\u00020\u0017H\u0002J\b\u00107\u001a\u00020\u0017H\u0002J\b\u00108\u001a\u00020\u0017H\u0002J\u0010\u00109\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010:\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0002J\u0010\u0010;\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010<\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010=\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0002J\u0010\u0010>\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010?\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010@\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0002J(\u0010A\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002J(\u0010B\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002J(\u0010C\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002J\u0010\u0010D\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0002J\u0010\u0010E\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0002J-\u0010H\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00190FH\u0002¢\u0006\u0004\bH\u0010IJ&\u0010M\u001a\b\u0012\u0004\u0012\u00020\n0L2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010K\u001a\u00020JH\u0002J\u001a\u0010P\u001a\u00020(2\u0006\u0010N\u001a\u00020J2\b\b\u0002\u0010O\u001a\u00020\u000fH\u0002J\f\u0010Q\u001a\u00020J*\u00020\u0019H\u0002J$\u0010T\u001a\u00020\u00152\u0006\u0010R\u001a\u00020\u00152\u0006\u0010S\u001a\u00020J2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\u001c\u0010U\u001a\u00020\u00152\u0006\u0010R\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u0010W\u001a\u00020V2\u0006\u0010\u0016\u001a\u00020JH\u0002J\u0010\u0010X\u001a\u00020V2\u0006\u0010\u0016\u001a\u00020JH\u0002J\u0010\u0010Z\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u0015H\u0002J\u0010\u0010[\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u0015H\u0002J\u0010\u0010\\\u001a\u00020J2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010]\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010^\u001a\u0004\u0018\u00010\u00192\u0006\u0010%\u001a\u00020\u0004H\u0002J&\u0010b\u001a\u00020\u000f2\b\u0010_\u001a\u0004\u0018\u00010\u00192\b\u0010`\u001a\u0004\u0018\u00010\u00192\b\u0010a\u001a\u0004\u0018\u00010\u0019H\u0002J.\u0010h\u001a\u00020\n*\u00020\n2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020\u00192\u0010\b\u0002\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010fH\u0002J\u0018\u0010i\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010j\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!H\u0002J\u0010\u0010k\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!H\u0002J\b\u0010l\u001a\u00020\u000fH\u0002R\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010rR\u0014\u0010v\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010uR\u0014\u0010y\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010xR'\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020!0z8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010{\u0012\u0004\b~\u0010\u007f\u001a\u0004\b|\u0010}¨\u0006\u0083\u0001"}, m28432d2 = {"LOI;", "LkI;", "Lco/bird/android/model/VehicleDescriptor;", "vehicleDescriptor", "LXn1$a;", "i", "Lco/bird/android/model/persistence/Bird;", "bird", "Lco/bird/android/model/persistence/VehicleVersion;", "vehicleVersion", "Lio/reactivex/c;", "e", "Lio/reactivex/Observable;", DateTokenConverter.CONVERTER_KEY, "n", "", "c", "k", "", "h", "b", "", MessageExtension.FIELD_DATA, "", "f", "", "passcode", "j", "m", "l", "LWn1;", "g", "h1", "LXn1;", "updateState", "Lio/reactivex/F;", "O0", "component", "Ljava/io/InputStream;", "firmwareUpdateStream", "", "firmwareUpdateLength", "e1", "(Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;LXn1$a;Ljava/io/InputStream;Ljava/lang/Long;)Lio/reactivex/c;", "o0", "Q0", "q0", "A0", "D0", "I0", "p0", "dataAscii", "K0", "H0", "G0", "F0", "E0", "y0", "v0", "t0", "w0", "r0", "V0", "X0", "W0", "S0", "T0", "U0", "W", "B0", "", "firmwareContent", "Z0", "(Lco/bird/android/model/VehicleDescriptor;LXn1;[Ljava/lang/String;)Lio/reactivex/c;", "", "currentFirmwareLine", "", "l0", "count", "errorEncountered", "M0", "Y", "command", "countId", "T", "U", "", "z0", "r1", "bleData", "P0", "L0", "Q", "R", "S", "componentCurrentVersion", "latestVersionAvailable", "latestVersionUrl", "q1", "LXn1$b;", "unexpectedState", "failureReason", "Lkotlin/Function0;", "onSuccess", "Z", "o1", "n1", "p1", "J0", "LEa;", C17296a.f69688o, "LEa;", "analyticsManager", "Lsu2;", "Lsu2;", "localAssetManager", "LTq4;", "LTq4;", "reactiveConfig", "Lrd5;", "Lrd5;", "rxBleBirdBluetoothManager", "La94;", "La94;", "n0", "()La94;", "getUpdateStateRelay$birdair_release$annotations", "()V", "updateStateRelay", "<init>", "(LEa;Lsu2;LTq4;Lrd5;)V", "birdair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdAirManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdAirManagerImpl.kt\nco/bird/android/manager/birdair/BirdAirManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1033:1\n180#2:1034\n1747#3,3:1035\n1549#3:1038\n1620#3,3:1039\n1855#3:1042\n1856#3:1044\n1#4:1043\n37#5,2:1045\n*S KotlinDebug\n*F\n+ 1 BirdAirManagerImpl.kt\nco/bird/android/manager/birdair/BirdAirManagerImpl\n*L\n95#1:1034\n310#1:1035,3\n748#1:1038\n748#1:1039,3\n778#1:1042\n778#1:1044\n243#1:1045,2\n*E\n"})
/* renamed from: OI */
/* loaded from: classes4.dex */
public final class C5939OI implements InterfaceC25134kI {

    /* renamed from: f */
    public static final C5946a f26302f = new C5946a(null);

    /* renamed from: g */
    public static final long f26303g = AbstractComponentTracker.LINGERING_TIMEOUT;

    /* renamed from: h */
    public static final List<Byte> f26304h;

    /* renamed from: i */
    public static final String f26305i;

    /* renamed from: j */
    public static final Set<String> f26306j;

    /* renamed from: a */
    public final InterfaceC1880Ea f26307a;

    /* renamed from: b */
    public final InterfaceC48923su2 f26308b;

    /* renamed from: c */
    public final C36207Tq4 f26309c;

    /* renamed from: d */
    public final InterfaceC48164rd5 f26310d;

    /* renamed from: e */
    public final C37791a94<C37113Xn1> f26311e;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LXn1;", "it", C17296a.f69688o, "(LXn1;)LXn1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$A */
    /* loaded from: classes4.dex */
    public static final class C5940A extends Lambda implements Function1<C37113Xn1, C37113Xn1> {

        /* renamed from: g */
        public final /* synthetic */ Ref.IntRef f26312g;

        /* renamed from: h */
        public final /* synthetic */ byte[] f26313h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5940A(Ref.IntRef intRef, byte[] bArr) {
            super(1);
            this.f26312g = intRef;
            this.f26313h = bArr;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C37113Xn1 invoke(C37113Xn1 it) {
            C37113Xn1 m76349a;
            Intrinsics.checkNotNullParameter(it, "it");
            m76349a = it.m76349a((r35 & 1) != 0 ? it.f43910a : it.m76345e() + 1, (r35 & 2) != 0 ? it.f43911b : null, (r35 & 4) != 0 ? it.f43912c : null, (r35 & 8) != 0 ? it.f43913d : null, (r35 & 16) != 0 ? it.f43914e : null, (r35 & 32) != 0 ? it.f43915f : null, (r35 & 64) != 0 ? it.f43916g : this.f26313h, (r35 & 128) != 0 ? it.f43917h : null, (r35 & 256) != 0 ? it.f43918i : null, (r35 & 512) != 0 ? it.f43919j : null, (r35 & 1024) != 0 ? it.f43920k : this.f26312g.element, (r35 & 2048) != 0 ? it.f43921l : 0, (r35 & 4096) != 0 ? it.f43922m : 0, (r35 & 8192) != 0 ? it.f43923n : false, (r35 & 16384) != 0 ? it.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.f43925p : null, (r35 & 65536) != 0 ? it.f43926q : null);
            return m76349a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXn1;", "first", "second", "", C17296a.f69688o, "(LXn1;LXn1;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$B */
    /* loaded from: classes4.dex */
    public static final class C5941B extends Lambda implements Function2<C37113Xn1, C37113Xn1, Boolean> {

        /* renamed from: g */
        public static final C5941B f26314g = new C5941B();

        public C5941B() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(C37113Xn1 first, C37113Xn1 second) {
            boolean z;
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            if (first.m76334p() == second.m76334p() && first.m76339k() == second.m76339k()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXn1;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LXn1;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$C */
    /* loaded from: classes4.dex */
    public static final class C5942C extends Lambda implements Function1<C37113Xn1, Unit> {

        /* renamed from: g */
        public static final C5942C f26315g = new C5942C();

        public C5942C() {
            super(1);
        }

        /* renamed from: a */
        public final void m92449a(C37113Xn1 c37113Xn1) {
            C41318g46.m40163a("BirdAirOTAUpdate.state change: " + c37113Xn1, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37113Xn1 c37113Xn1) {
            m92449a(c37113Xn1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXn1;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LXn1;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$D */
    /* loaded from: classes4.dex */
    public static final class C5943D extends Lambda implements Function1<C37113Xn1, InterfaceC23447K<? extends C37113Xn1>> {
        public C5943D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends C37113Xn1> invoke(C37113Xn1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C5939OI.this.m92531O0(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXn1;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LXn1;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$E */
    /* loaded from: classes4.dex */
    public static final class C5944E extends Lambda implements Function1<C37113Xn1, Unit> {

        /* renamed from: g */
        public static final C5944E f26317g = new C5944E();

        public C5944E() {
            super(1);
        }

        /* renamed from: a */
        public final void m92447a(C37113Xn1 c37113Xn1) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37113Xn1 c37113Xn1) {
            m92447a(c37113Xn1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OI$F */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C5945F extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C5945F f26318b = new C5945F();

        public C5945F() {
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

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\bR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\bR\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\f¨\u0006*"}, m28432d2 = {"LOI$a;", "", "", "BIRD_AIR_DASH_FIRMWARE_UPDATE_COMMAND_HEADER_LENGTH", "I", "BIRD_AIR_DASH_FIRMWARE_UPDATE_COMMAND_PACKET_LENGTH", "", "BIRD_AIR_INITIATE_OTA_UPDATE_SECOND_WRITE_DELAY_MILLIS", "J", "BIRD_AIR_INITIATE_OTA_UPDATE_THIRD_WRITE_DELAY_MILLIS", "", "ERROR_RESPONSE", "Ljava/lang/String;", "OTA_ABORTED_BY_USER", "OTA_FAILED_DASH_INCORRECT_CHECKSUM", "OTA_FAIL_PCM_DID_NOT_RECEIVE_MPC_RESPONSE", "OTA_FAIL_PCM_DID_NOT_RECEIVE_UPDATE_RESPONSE", "OTA_FAIL_PCM_EXCEED_MAX_ERROR_COUNT", "OTA_FAIL_PCM_UPDATE_ERROR_ON_44_CMD", "OTA_FIRMWARE_COOLDOWN_PERDIOD_MS", "PCM_44_CMD_DELAY_MILLIS", "PCM_44_CMD_FREQUENCY", "PCM_ERROR_DELAY_RESEND_PREV_COMMAND_MILLIS", "PCM_FIRMWARE_LINE_INDEX_MOD_LONGER_DELAY", "PCM_FIRMWARE_MPC_RESPONSE_TIMEOUT_MILLIS", "PCM_FIRMWARE_UPDATE_ERROR_DELAY_MILLIS", "PCM_FIRMWARE_UPDATE_LONG_DELAY_MILLIS", "PCM_FIRMWARE_UPDATE_MAX_ERROR_COUNT", "PCM_FIRMWARE_UPDATE_RESPONSE", "PCM_FIRMWARE_UPDATE_RESPONSE_WAIT_TIME_LIMIT_MILLIS", "PCM_FIRMWARE_UPDATE_SHORT_DELAY_MILLIS", "PCM_MODE_MPC_RESPONSE", "", "", "PCM_MODE_RESPONSE", "Ljava/util/List;", "", "PCM_UPDATE_ERROR_RESPONSES", "Ljava/util/Set;", "SUCCESS_RESPONSE", "<init>", "()V", "birdair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: OI$a */
    /* loaded from: classes4.dex */
    public static final class C5946a {
        public /* synthetic */ C5946a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5946a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OI$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C5947b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[C37113Xn1.EnumC9494b.values().length];
            try {
                iArr[C37113Xn1.EnumC9494b.PASSCODE_VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C37113Xn1.EnumC9494b.UPDATE_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C37113Xn1.EnumC9494b.FIRMWARE_UPDATING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C37113Xn1.EnumC9494b.UPDATE_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C37113Xn1.EnumC9494b.CHALLENGE_INITIATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C37113Xn1.EnumC9494b.VERIFYING_PASSCODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C37113Xn1.EnumC9494b.SYNC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[C37113Xn1.EnumC9493a.values().length];
            try {
                iArr2[C37113Xn1.EnumC9493a.DASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[C37113Xn1.EnumC9493a.PCM.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lokhttp3/ResponseBody;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$c */
    /* loaded from: classes4.dex */
    public static final class C5948c extends Lambda implements Function1<HM4<ResponseBody>, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ Bird f26320h;

        /* renamed from: i */
        public final /* synthetic */ VehicleVersion f26321i;

        /* renamed from: j */
        public final /* synthetic */ C37113Xn1.EnumC9493a f26322j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5948c(Bird bird, VehicleVersion vehicleVersion, C37113Xn1.EnumC9493a enumC9493a) {
            super(1);
            this.f26320h = bird;
            this.f26321i = vehicleVersion;
            this.f26322j = enumC9493a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(HM4<ResponseBody> it) {
            InputStream inputStream;
            Long l;
            Intrinsics.checkNotNullParameter(it, "it");
            C5939OI c5939oi = C5939OI.this;
            Bird bird = this.f26320h;
            VehicleVersion vehicleVersion = this.f26321i;
            C37113Xn1.EnumC9493a enumC9493a = this.f26322j;
            ResponseBody m103944a = it.m103944a();
            if (m103944a != null) {
                inputStream = m103944a.byteStream();
            } else {
                inputStream = null;
            }
            ResponseBody m103944a2 = it.m103944a();
            if (m103944a2 != null) {
                l = Long.valueOf(m103944a2.contentLength());
            } else {
                l = null;
            }
            return c5939oi.m92498e1(bird, vehicleVersion, enumC9493a, inputStream, l);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LXn1;", "it", "", C17296a.f69688o, "(LXn1;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$d */
    /* loaded from: classes4.dex */
    public static final class C5949d extends Lambda implements Function1<C37113Xn1, Boolean> {

        /* renamed from: g */
        public static final C5949d f26323g = new C5949d();

        public C5949d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C37113Xn1 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m76334p() == C37113Xn1.EnumC9494b.CHALLENGE_INITIATED) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXn1;", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/VehicleDescriptor;", C17296a.f69688o, "(LXn1;)Lco/bird/android/model/VehicleDescriptor;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$e */
    /* loaded from: classes4.dex */
    public static final class C5950e extends Lambda implements Function1<C37113Xn1, VehicleDescriptor> {

        /* renamed from: g */
        public static final C5950e f26324g = new C5950e();

        public C5950e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final VehicleDescriptor invoke(C37113Xn1 c37113Xn1) {
            return c37113Xn1.m76331s();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXn1;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LXn1;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$f */
    /* loaded from: classes4.dex */
    public static final class C5951f extends Lambda implements Function1<C37113Xn1, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ VehicleDescriptor f26325g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5951f(VehicleDescriptor vehicleDescriptor) {
            super(1);
            this.f26325g = vehicleDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C37113Xn1 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (Intrinsics.areEqual(it.m76331s(), this.f26325g) && it.m76334p() == C37113Xn1.EnumC9494b.UPDATE_SUCCESS) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXn1;", "first", "second", "", C17296a.f69688o, "(LXn1;LXn1;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$g */
    /* loaded from: classes4.dex */
    public static final class C5952g extends Lambda implements Function2<C37113Xn1, C37113Xn1, Boolean> {

        /* renamed from: g */
        public static final C5952g f26326g = new C5952g();

        public C5952g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(C37113Xn1 first, C37113Xn1 second) {
            boolean z;
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            if (first.m76334p() == second.m76334p()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LXn1;", "it", "", C17296a.f69688o, "(LXn1;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$h */
    /* loaded from: classes4.dex */
    public static final class C5953h extends Lambda implements Function1<C37113Xn1, Boolean> {

        /* renamed from: g */
        public static final C5953h f26327g = new C5953h();

        public C5953h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C37113Xn1 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m76334p() == C37113Xn1.EnumC9494b.UPDATE_FAILED) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OI$i */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C5954i extends FunctionReferenceImpl implements Function1<C37113Xn1, Unit> {
        public C5954i(Object obj) {
            super(1, obj, C5939OI.class, "trackFirmwareUpdateFail", "trackFirmwareUpdateFail(Lco/bird/android/coreinterface/model/FirmwareUpdateState;)V", 0);
        }

        /* renamed from: a */
        public final void m92440a(C37113Xn1 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C5939OI) this.receiver).m92480n1(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37113Xn1 c37113Xn1) {
            m92440a(c37113Xn1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXn1;", "it", "LXn1$a;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LXn1;)LXn1$a;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$j */
    /* loaded from: classes4.dex */
    public static final class C5955j extends Lambda implements Function1<C37113Xn1, C37113Xn1.EnumC9493a> {

        /* renamed from: g */
        public static final C5955j f26328g = new C5955j();

        public C5955j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C37113Xn1.EnumC9493a invoke(C37113Xn1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m76344f();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXn1;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LXn1;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$k */
    /* loaded from: classes4.dex */
    public static final class C5956k extends Lambda implements Function1<C37113Xn1, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ VehicleDescriptor f26329g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5956k(VehicleDescriptor vehicleDescriptor) {
            super(1);
            this.f26329g = vehicleDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C37113Xn1 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (Intrinsics.areEqual(it.m76331s(), this.f26329g) && it.m76334p() != C37113Xn1.EnumC9494b.NONE && it.m76334p() != C37113Xn1.EnumC9494b.UPDATE_FAILED) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LXn1;", "it", "", C17296a.f69688o, "(LXn1;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$l */
    /* loaded from: classes4.dex */
    public static final class C5957l extends Lambda implements Function1<C37113Xn1, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ VehicleDescriptor f26330g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5957l(VehicleDescriptor vehicleDescriptor) {
            super(1);
            this.f26330g = vehicleDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C37113Xn1 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (Intrinsics.areEqual(it.m76331s(), this.f26330g) && it.m76334p() == C37113Xn1.EnumC9494b.FIRMWARE_UPDATING) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXn1;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LXn1;)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$m */
    /* loaded from: classes4.dex */
    public static final class C5958m extends Lambda implements Function1<C37113Xn1, Float> {

        /* renamed from: g */
        public static final C5958m f26331g = new C5958m();

        public C5958m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Float invoke(C37113Xn1 it) {
            float coerceAtMost;
            Intrinsics.checkNotNullParameter(it, "it");
            Long m76337m = it.m76337m();
            if (m76337m != null) {
                coerceAtMost = RangesKt___RangesKt.coerceAtMost(it.m76339k() / ((float) m76337m.longValue()), 1.0f);
            } else {
                coerceAtMost = 0.0f;
            }
            return Float.valueOf(coerceAtMost);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LXn1;", "it", C17296a.f69688o, "(LXn1;)LXn1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$n */
    /* loaded from: classes4.dex */
    public static final class C5959n extends Lambda implements Function1<C37113Xn1, C37113Xn1> {

        /* renamed from: g */
        public static final C5959n f26332g = new C5959n();

        public C5959n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C37113Xn1 invoke(C37113Xn1 it) {
            C37113Xn1 m76349a;
            Intrinsics.checkNotNullParameter(it, "it");
            m76349a = it.m76349a((r35 & 1) != 0 ? it.f43910a : 0, (r35 & 2) != 0 ? it.f43911b : null, (r35 & 4) != 0 ? it.f43912c : null, (r35 & 8) != 0 ? it.f43913d : null, (r35 & 16) != 0 ? it.f43914e : null, (r35 & 32) != 0 ? it.f43915f : null, (r35 & 64) != 0 ? it.f43916g : null, (r35 & 128) != 0 ? it.f43917h : null, (r35 & 256) != 0 ? it.f43918i : null, (r35 & 512) != 0 ? it.f43919j : null, (r35 & 1024) != 0 ? it.f43920k : 0, (r35 & 2048) != 0 ? it.f43921l : 0, (r35 & 4096) != 0 ? it.f43922m : 0, (r35 & 8192) != 0 ? it.f43923n : false, (r35 & 16384) != 0 ? it.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.f43925p : null, (r35 & 65536) != 0 ? it.f43926q : null);
            return m76349a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$o */
    /* loaded from: classes4.dex */
    public static final class C5960o extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ VehicleDescriptor f26334h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5960o(VehicleDescriptor vehicleDescriptor) {
            super(1);
            this.f26334h = vehicleDescriptor;
        }

        /* renamed from: a */
        public final void m92434a(InterfaceC23465c interfaceC23465c) {
            C37113Xn1 m76349a;
            C37791a94<C37113Xn1> m92481n0 = C5939OI.this.m92481n0();
            m76349a = r3.m76349a((r35 & 1) != 0 ? r3.f43910a : 0, (r35 & 2) != 0 ? r3.f43911b : null, (r35 & 4) != 0 ? r3.f43912c : null, (r35 & 8) != 0 ? r3.f43913d : this.f26334h, (r35 & 16) != 0 ? r3.f43914e : null, (r35 & 32) != 0 ? r3.f43915f : C37113Xn1.EnumC9494b.CHALLENGE_INITIATED, (r35 & 64) != 0 ? r3.f43916g : null, (r35 & 128) != 0 ? r3.f43917h : null, (r35 & 256) != 0 ? r3.f43918i : null, (r35 & 512) != 0 ? r3.f43919j : null, (r35 & 1024) != 0 ? r3.f43920k : 0, (r35 & 2048) != 0 ? r3.f43921l : 0, (r35 & 4096) != 0 ? r3.f43922m : 0, (r35 & 8192) != 0 ? r3.f43923n : false, (r35 & 16384) != 0 ? r3.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.f43925p : null, (r35 & 65536) != 0 ? C5939OI.this.m92481n0().getValue().f43926q : null);
            m92481n0.accept(m76349a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m92434a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$p */
    /* loaded from: classes4.dex */
    public static final class C5961p extends Lambda implements Function1<Long, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ Ref.IntRef f26336h;

        /* renamed from: i */
        public final /* synthetic */ VehicleDescriptor f26337i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5961p(Ref.IntRef intRef, VehicleDescriptor vehicleDescriptor) {
            super(1);
            this.f26336h = intRef;
            this.f26337i = vehicleDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Long it) {
            C37113Xn1 m76349a;
            Intrinsics.checkNotNullParameter(it, "it");
            byte[] m92518V = C5939OI.m92518V(C5939OI.this, Command.BIRD_AIR_INITIATE_OTA_UPDATE.getData(), this.f26336h.element, null, 4, null);
            this.f26336h.element += 2;
            C37791a94<C37113Xn1> m92481n0 = C5939OI.this.m92481n0();
            m76349a = r8.m76349a((r35 & 1) != 0 ? r8.f43910a : this.f26336h.element, (r35 & 2) != 0 ? r8.f43911b : null, (r35 & 4) != 0 ? r8.f43912c : null, (r35 & 8) != 0 ? r8.f43913d : null, (r35 & 16) != 0 ? r8.f43914e : null, (r35 & 32) != 0 ? r8.f43915f : null, (r35 & 64) != 0 ? r8.f43916g : m92518V, (r35 & 128) != 0 ? r8.f43917h : null, (r35 & 256) != 0 ? r8.f43918i : null, (r35 & 512) != 0 ? r8.f43919j : null, (r35 & 1024) != 0 ? r8.f43920k : 0, (r35 & 2048) != 0 ? r8.f43921l : 0, (r35 & 4096) != 0 ? r8.f43922m : 0, (r35 & 8192) != 0 ? r8.f43923n : false, (r35 & 16384) != 0 ? r8.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r8.f43925p : null, (r35 & 65536) != 0 ? C5939OI.this.m92481n0().getValue().f43926q : null);
            m92481n0.accept(m76349a);
            return C5939OI.this.f26310d.mo15673m(this.f26337i, m92518V);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "count", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$q */
    /* loaded from: classes4.dex */
    public static final class C5962q extends Lambda implements Function1<Long, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ VehicleDescriptor f26339h;

        /* renamed from: i */
        public final /* synthetic */ byte[] f26340i;

        /* renamed from: j */
        public final /* synthetic */ C37113Xn1.EnumC9494b f26341j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5962q(VehicleDescriptor vehicleDescriptor, byte[] bArr, C37113Xn1.EnumC9494b enumC9494b) {
            super(1);
            this.f26339h = vehicleDescriptor;
            this.f26340i = bArr;
            this.f26341j = enumC9494b;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Long count) {
            Intrinsics.checkNotNullParameter(count, "count");
            C41318g46.m40163a("BirdAirOTAUpdate.initiatePCMUpdate.count: " + count, new Object[0]);
            int longValue = (int) count.longValue();
            if (longValue != 0 && longValue != 1) {
                C5939OI c5939oi = C5939OI.this;
                AbstractC23461c m33057c0 = AbstractC23461c.m33057c0(500L, TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(m33057c0, "timer(PCM_FIRMWARE_MPC_R…S, TimeUnit.MILLISECONDS)");
                return C5939OI.m92507a0(c5939oi, m33057c0, this.f26341j, "pcm_did_not_receive_mpc_response", null, 4, null);
            }
            return C5939OI.this.f26310d.mo15680f(this.f26339h, this.f26340i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LXn1;", "it", C17296a.f69688o, "(LXn1;)LXn1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$r */
    /* loaded from: classes4.dex */
    public static final class C5963r extends Lambda implements Function1<C37113Xn1, C37113Xn1> {

        /* renamed from: g */
        public static final C5963r f26342g = new C5963r();

        public C5963r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C37113Xn1 invoke(C37113Xn1 it) {
            C37113Xn1 m76349a;
            Intrinsics.checkNotNullParameter(it, "it");
            m76349a = it.m76349a((r35 & 1) != 0 ? it.f43910a : it.m76345e() + 1, (r35 & 2) != 0 ? it.f43911b : null, (r35 & 4) != 0 ? it.f43912c : null, (r35 & 8) != 0 ? it.f43913d : null, (r35 & 16) != 0 ? it.f43914e : null, (r35 & 32) != 0 ? it.f43915f : C37113Xn1.EnumC9494b.UPDATE_SUCCESS, (r35 & 64) != 0 ? it.f43916g : null, (r35 & 128) != 0 ? it.f43917h : null, (r35 & 256) != 0 ? it.f43918i : null, (r35 & 512) != 0 ? it.f43919j : null, (r35 & 1024) != 0 ? it.f43920k : 0, (r35 & 2048) != 0 ? it.f43921l : 0, (r35 & 4096) != 0 ? it.f43922m : 0, (r35 & 8192) != 0 ? it.f43923n : false, (r35 & 16384) != 0 ? it.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.f43925p : null, (r35 & 65536) != 0 ? it.f43926q : null);
            return m76349a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LXn1;", "it", C17296a.f69688o, "(LXn1;)LXn1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$s */
    /* loaded from: classes4.dex */
    public static final class C5964s extends Lambda implements Function1<C37113Xn1, C37113Xn1> {

        /* renamed from: g */
        public static final C5964s f26343g = new C5964s();

        public C5964s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C37113Xn1 invoke(C37113Xn1 it) {
            C37113Xn1 m76349a;
            Intrinsics.checkNotNullParameter(it, "it");
            m76349a = it.m76349a((r35 & 1) != 0 ? it.f43910a : 0, (r35 & 2) != 0 ? it.f43911b : null, (r35 & 4) != 0 ? it.f43912c : null, (r35 & 8) != 0 ? it.f43913d : null, (r35 & 16) != 0 ? it.f43914e : null, (r35 & 32) != 0 ? it.f43915f : C37113Xn1.EnumC9494b.UPDATE_FAILED, (r35 & 64) != 0 ? it.f43916g : null, (r35 & 128) != 0 ? it.f43917h : null, (r35 & 256) != 0 ? it.f43918i : null, (r35 & 512) != 0 ? it.f43919j : null, (r35 & 1024) != 0 ? it.f43920k : 0, (r35 & 2048) != 0 ? it.f43921l : 0, (r35 & 4096) != 0 ? it.f43922m : 0, (r35 & 8192) != 0 ? it.f43923n : false, (r35 & 16384) != 0 ? it.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.f43925p : "pcm_error_on_44_cmd", (r35 & 65536) != 0 ? it.f43926q : null);
            return m76349a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LXn1;", "it", C17296a.f69688o, "(LXn1;)LXn1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$t */
    /* loaded from: classes4.dex */
    public static final class C5965t extends Lambda implements Function1<C37113Xn1, C37113Xn1> {

        /* renamed from: g */
        public static final C5965t f26344g = new C5965t();

        public C5965t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C37113Xn1 invoke(C37113Xn1 it) {
            C37113Xn1 m76349a;
            Intrinsics.checkNotNullParameter(it, "it");
            m76349a = it.m76349a((r35 & 1) != 0 ? it.f43910a : 0, (r35 & 2) != 0 ? it.f43911b : null, (r35 & 4) != 0 ? it.f43912c : null, (r35 & 8) != 0 ? it.f43913d : null, (r35 & 16) != 0 ? it.f43914e : null, (r35 & 32) != 0 ? it.f43915f : C37113Xn1.EnumC9494b.UPDATE_FAILED, (r35 & 64) != 0 ? it.f43916g : null, (r35 & 128) != 0 ? it.f43917h : null, (r35 & 256) != 0 ? it.f43918i : null, (r35 & 512) != 0 ? it.f43919j : null, (r35 & 1024) != 0 ? it.f43920k : 0, (r35 & 2048) != 0 ? it.f43921l : 0, (r35 & 4096) != 0 ? it.f43922m : 0, (r35 & 8192) != 0 ? it.f43923n : false, (r35 & 16384) != 0 ? it.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.f43925p : "pcm_exceed_max_error_count", (r35 & 65536) != 0 ? it.f43926q : null);
            return m76349a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LXn1;", "it", C17296a.f69688o, "(LXn1;)LXn1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$u */
    /* loaded from: classes4.dex */
    public static final class C5966u extends Lambda implements Function1<C37113Xn1, C37113Xn1> {

        /* renamed from: g */
        public final /* synthetic */ int f26345g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5966u(int i) {
            super(1);
            this.f26345g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C37113Xn1 invoke(C37113Xn1 it) {
            C37113Xn1 m76349a;
            Intrinsics.checkNotNullParameter(it, "it");
            m76349a = it.m76349a((r35 & 1) != 0 ? it.f43910a : 0, (r35 & 2) != 0 ? it.f43911b : null, (r35 & 4) != 0 ? it.f43912c : null, (r35 & 8) != 0 ? it.f43913d : null, (r35 & 16) != 0 ? it.f43914e : null, (r35 & 32) != 0 ? it.f43915f : null, (r35 & 64) != 0 ? it.f43916g : null, (r35 & 128) != 0 ? it.f43917h : null, (r35 & 256) != 0 ? it.f43918i : null, (r35 & 512) != 0 ? it.f43919j : null, (r35 & 1024) != 0 ? it.f43920k : 0, (r35 & 2048) != 0 ? it.f43921l : 0, (r35 & 4096) != 0 ? it.f43922m : it.m76343g() + 1, (r35 & 8192) != 0 ? it.f43923n : true, (r35 & 16384) != 0 ? it.f43924o : this.f26345g, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.f43925p : null, (r35 & 65536) != 0 ? it.f43926q : null);
            return m76349a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXn1;", TransferTable.COLUMN_STATE, "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LXn1;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$v */
    /* loaded from: classes4.dex */
    public static final class C5967v extends Lambda implements Function1<C37113Xn1, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ VehicleDescriptor f26346g;

        /* renamed from: h */
        public final /* synthetic */ C5939OI f26347h;

        /* renamed from: i */
        public final /* synthetic */ String f26348i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5967v(VehicleDescriptor vehicleDescriptor, C5939OI c5939oi, String str) {
            super(1);
            this.f26346g = vehicleDescriptor;
            this.f26347h = c5939oi;
            this.f26348i = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(C37113Xn1 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (!Intrinsics.areEqual(state.m76331s(), this.f26346g)) {
                return AbstractC23461c.m33080F(new IllegalStateException("VehicleDescriptor does not match the target VehicleDescriptor"));
            }
            return this.f26347h.f26310d.mo15662x(this.f26346g, this.f26348i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$w */
    /* loaded from: classes4.dex */
    public static final class C5968w extends Lambda implements Function1<Long, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ VehicleDescriptor f26350h;

        /* renamed from: i */
        public final /* synthetic */ byte[] f26351i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5968w(VehicleDescriptor vehicleDescriptor, byte[] bArr) {
            super(1);
            this.f26350h = vehicleDescriptor;
            this.f26351i = bArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C5939OI.this.f26310d.mo15680f(this.f26350h, this.f26351i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OI$x */
    /* loaded from: classes4.dex */
    public static final class C5969x extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ byte[] f26353h;

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LXn1;", "it", C17296a.f69688o, "(LXn1;)LXn1;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: OI$x$a */
        /* loaded from: classes4.dex */
        public static final class C5970a extends Lambda implements Function1<C37113Xn1, C37113Xn1> {

            /* renamed from: g */
            public final /* synthetic */ byte[] f26354g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5970a(byte[] bArr) {
                super(1);
                this.f26354g = bArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C37113Xn1 invoke(C37113Xn1 it) {
                C37113Xn1 m76349a;
                Intrinsics.checkNotNullParameter(it, "it");
                m76349a = it.m76349a((r35 & 1) != 0 ? it.f43910a : 0, (r35 & 2) != 0 ? it.f43911b : null, (r35 & 4) != 0 ? it.f43912c : null, (r35 & 8) != 0 ? it.f43913d : null, (r35 & 16) != 0 ? it.f43914e : null, (r35 & 32) != 0 ? it.f43915f : C37113Xn1.EnumC9494b.FIRMWARE_UPDATING, (r35 & 64) != 0 ? it.f43916g : this.f26354g, (r35 & 128) != 0 ? it.f43917h : null, (r35 & 256) != 0 ? it.f43918i : null, (r35 & 512) != 0 ? it.f43919j : null, (r35 & 1024) != 0 ? it.f43920k : 0, (r35 & 2048) != 0 ? it.f43921l : 0, (r35 & 4096) != 0 ? it.f43922m : 0, (r35 & 8192) != 0 ? it.f43923n : false, (r35 & 16384) != 0 ? it.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.f43925p : null, (r35 & 65536) != 0 ? it.f43926q : null);
                return m76349a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5969x(byte[] bArr) {
            super(0);
            this.f26353h = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C5939OI.this.m92481n0().m71837i(new C5970a(this.f26353h));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LXn1;", "it", C17296a.f69688o, "(LXn1;)LXn1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$y */
    /* loaded from: classes4.dex */
    public static final class C5971y extends Lambda implements Function1<C37113Xn1, C37113Xn1> {

        /* renamed from: g */
        public static final C5971y f26355g = new C5971y();

        public C5971y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C37113Xn1 invoke(C37113Xn1 it) {
            C37113Xn1 m76349a;
            Intrinsics.checkNotNullParameter(it, "it");
            m76349a = it.m76349a((r35 & 1) != 0 ? it.f43910a : 0, (r35 & 2) != 0 ? it.f43911b : null, (r35 & 4) != 0 ? it.f43912c : null, (r35 & 8) != 0 ? it.f43913d : null, (r35 & 16) != 0 ? it.f43914e : null, (r35 & 32) != 0 ? it.f43915f : null, (r35 & 64) != 0 ? it.f43916g : null, (r35 & 128) != 0 ? it.f43917h : null, (r35 & 256) != 0 ? it.f43918i : null, (r35 & 512) != 0 ? it.f43919j : null, (r35 & 1024) != 0 ? it.f43920k : 0, (r35 & 2048) != 0 ? it.f43921l : 0, (r35 & 4096) != 0 ? it.f43922m : 0, (r35 & 8192) != 0 ? it.f43923n : false, (r35 & 16384) != 0 ? it.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.f43925p : null, (r35 & 65536) != 0 ? it.f43926q : null);
            return m76349a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/c;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lio/reactivex/c;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OI$z */
    /* loaded from: classes4.dex */
    public static final class C5972z extends Lambda implements Function1<AbstractC23461c, InterfaceC23496h> {

        /* renamed from: g */
        public static final C5972z f26356g = new C5972z();

        public C5972z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(AbstractC23461c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    static {
        List<Byte> listOf;
        Set<String> of;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{(byte) 77, (byte) 80, (byte) 67});
        f26304h = listOf;
        f26305i = "MPC";
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"ER", "ET"});
        f26306j = of;
    }

    public C5939OI(InterfaceC1880Ea analyticsManager, InterfaceC48923su2 localAssetManager, C36207Tq4 reactiveConfig, InterfaceC48164rd5 rxBleBirdBluetoothManager) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(rxBleBirdBluetoothManager, "rxBleBirdBluetoothManager");
        this.f26307a = analyticsManager;
        this.f26308b = localAssetManager;
        this.f26309c = reactiveConfig;
        this.f26310d = rxBleBirdBluetoothManager;
        this.f26311e = C37791a94.C10586a.create$default(C37791a94.f49908h, new C37113Xn1(0, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, 0, null, null, 131071, null), null, 2, null);
        m92492h1();
    }

    /* renamed from: C0 */
    public static final void m92555C0(C5939OI this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f26311e.accept(new C37113Xn1(0, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, 0, null, null, 131071, null));
    }

    /* renamed from: N0 */
    public static /* synthetic */ long m92533N0(C5939OI c5939oi, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return c5939oi.m92535M0(i, z);
    }

    /* renamed from: R0 */
    public static final InterfaceC23496h m92525R0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static /* synthetic */ byte[] m92518V(C5939OI c5939oi, byte[] bArr, int i, byte[] bArr2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            bArr2 = null;
        }
        return c5939oi.m92522T(bArr, i, bArr2);
    }

    /* renamed from: X */
    public static final InterfaceC23496h m92514X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: Y0 */
    public static final InterfaceC23496h m92511Y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a0 */
    public static /* synthetic */ AbstractC23461c m92507a0(C5939OI c5939oi, AbstractC23461c abstractC23461c, C37113Xn1.EnumC9494b enumC9494b, String str, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        return c5939oi.m92510Z(abstractC23461c, enumC9494b, str, function0);
    }

    /* renamed from: a1 */
    public static final void m92506a1(C5939OI this$0, InterfaceC23476f it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AbstractC23461c m33057c0 = AbstractC23461c.m33057c0(5000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(m33057c0, "timer(PCM_FIRMWARE_UPDAT…S, TimeUnit.MILLISECONDS)");
        m92507a0(this$0, m33057c0, C37113Xn1.EnumC9494b.FIRMWARE_UPDATING, "pcm_did_not_receive_update_response", null, 4, null);
    }

    /* renamed from: b0 */
    public static final void m92505b0(C5939OI this$0, C37113Xn1.EnumC9494b unexpectedState, String failureReason, Function0 function0) {
        C37113Xn1 m76349a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(unexpectedState, "$unexpectedState");
        Intrinsics.checkNotNullParameter(failureReason, "$failureReason");
        C37113Xn1.EnumC9494b m76334p = this$0.f26311e.getValue().m76334p();
        C41318g46.m40163a("BirdAirOTAUpdate.failUpdateIfStateUnchanged.currentState: " + m76334p, new Object[0]);
        if (m76334p == unexpectedState) {
            C37791a94<C37113Xn1> c37791a94 = this$0.f26311e;
            m76349a = r3.m76349a((r35 & 1) != 0 ? r3.f43910a : 0, (r35 & 2) != 0 ? r3.f43911b : null, (r35 & 4) != 0 ? r3.f43912c : null, (r35 & 8) != 0 ? r3.f43913d : null, (r35 & 16) != 0 ? r3.f43914e : null, (r35 & 32) != 0 ? r3.f43915f : C37113Xn1.EnumC9494b.UPDATE_FAILED, (r35 & 64) != 0 ? r3.f43916g : null, (r35 & 128) != 0 ? r3.f43917h : null, (r35 & 256) != 0 ? r3.f43918i : null, (r35 & 512) != 0 ? r3.f43919j : null, (r35 & 1024) != 0 ? r3.f43920k : 0, (r35 & 2048) != 0 ? r3.f43921l : 0, (r35 & 4096) != 0 ? r3.f43922m : 0, (r35 & 8192) != 0 ? r3.f43923n : false, (r35 & 16384) != 0 ? r3.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.f43925p : failureReason, (r35 & 65536) != 0 ? c37791a94.getValue().f43926q : null);
            c37791a94.accept(m76349a);
        } else if (function0 != null) {
            C41318g46.m40163a("BirdAirOTAUpdate.invoking onSuccess", new Object[0]);
            function0.invoke();
        }
    }

    /* renamed from: b1 */
    public static final void m92504b1(C5939OI this$0, Ref.IntRef bytesWritten, byte[] firmwarePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bytesWritten, "$bytesWritten");
        Intrinsics.checkNotNullParameter(firmwarePayload, "$firmwarePayload");
        this$0.f26311e.m71837i(new C5940A(bytesWritten, firmwarePayload));
    }

    /* renamed from: c0 */
    public static final boolean m92503c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: c1 */
    public static final void m92502c1(long j) {
        C41318g46.m40163a("BirdAirOTAUpdate.sendPCMFirmwareUpdate.initial delay done: " + j, new Object[0]);
    }

    /* renamed from: d0 */
    public static final Boolean m92501d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: d1 */
    public static final InterfaceC23496h m92500d1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m92499e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final C37113Xn1.EnumC9493a m92497f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C37113Xn1.EnumC9493a) tmp0.invoke(obj);
    }

    /* renamed from: f1 */
    public static final Unit m92496f1(C37113Xn1.EnumC9493a component, InputStream inputStream, C5939OI this$0, Bird bird, VehicleVersion vehicleVersion, Long l) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(component, "$component");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        Intrinsics.checkNotNullParameter(vehicleVersion, "$vehicleVersion");
        String[] strArr2 = new String[0];
        if (component == C37113Xn1.EnumC9493a.PCM) {
            try {
                byte[] bArr = new byte[1024];
                StringBuilder sb = new StringBuilder("");
                while (true) {
                    Intrinsics.checkNotNull(inputStream);
                    try {
                        int read = inputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        Charset forName = Charset.forName(Constants.DEFAULT_ENCODING);
                        Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
                        sb.append(new String(bArr, 0, read, forName));
                    } catch (Exception e) {
                        e = e;
                        C41318g46.m40160d("BirdAirOTAUpdate.setupFirmwareUpdateState: " + e, new Object[0]);
                        strArr = strArr2;
                        this$0.f26311e.accept(new C37113Xn1(0, bird, vehicleVersion, null, component, null, null, strArr, inputStream, l, 0, 0, 0, false, 0, null, null, 130153, null));
                        return Unit.INSTANCE;
                    }
                }
                inputStream.close();
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
                strArr = (String[]) new Regex("\n").split(sb2, 0).toArray(new String[0]);
            } catch (Exception e2) {
                e = e2;
            }
            this$0.f26311e.accept(new C37113Xn1(0, bird, vehicleVersion, null, component, null, null, strArr, inputStream, l, 0, 0, 0, false, 0, null, null, 130153, null));
            return Unit.INSTANCE;
        }
        strArr = strArr2;
        this$0.f26311e.accept(new C37113Xn1(0, bird, vehicleVersion, null, component, null, null, strArr, inputStream, l, 0, 0, 0, false, 0, null, null, 130153, null));
        return Unit.INSTANCE;
    }

    /* renamed from: g0 */
    public static final boolean m92495g0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: g1 */
    public static final void m92494g1(C5939OI this$0, C37113Xn1 currentState) {
        C37113Xn1 m76349a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentState, "$currentState");
        C37791a94<C37113Xn1> c37791a94 = this$0.f26311e;
        m76349a = currentState.m76349a((r35 & 1) != 0 ? currentState.f43910a : 0, (r35 & 2) != 0 ? currentState.f43911b : null, (r35 & 4) != 0 ? currentState.f43912c : null, (r35 & 8) != 0 ? currentState.f43913d : null, (r35 & 16) != 0 ? currentState.f43914e : null, (r35 & 32) != 0 ? currentState.f43915f : C37113Xn1.EnumC9494b.UPDATE_FAILED, (r35 & 64) != 0 ? currentState.f43916g : null, (r35 & 128) != 0 ? currentState.f43917h : null, (r35 & 256) != 0 ? currentState.f43918i : null, (r35 & 512) != 0 ? currentState.f43919j : null, (r35 & 1024) != 0 ? currentState.f43920k : 0, (r35 & 2048) != 0 ? currentState.f43921l : 0, (r35 & 4096) != 0 ? currentState.f43922m : 0, (r35 & 8192) != 0 ? currentState.f43923n : false, (r35 & 16384) != 0 ? currentState.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? currentState.f43925p : "update_cancel", (r35 & 65536) != 0 ? currentState.f43926q : null);
        c37791a94.accept(m76349a);
    }

    public static /* synthetic */ void getUpdateStateRelay$birdair_release$annotations() {
    }

    /* renamed from: h0 */
    public static final boolean m92493h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: i0 */
    public static final Boolean m92491i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: i1 */
    public static final boolean m92490i1(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: j0 */
    public static final boolean m92489j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: j1 */
    public static final void m92488j1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final Float m92487k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Float) tmp0.invoke(obj);
    }

    /* renamed from: k1 */
    public static final InterfaceC23447K m92486k1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: l1 */
    public static final void m92484l1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m92483m0(C5939OI this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("BirdAirOTAUpdate.resetting errorReceived and errorResendLineCount", new Object[0]);
        this$0.f26311e.m71837i(C5959n.f26332g);
    }

    /* renamed from: m1 */
    public static final void m92482m1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m92466s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final InterfaceC23496h m92462u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final InterfaceC23496h m92456x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: A0 */
    public final void m92559A0() {
        C37113Xn1 m76349a;
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        m76349a = r3.m76349a((r35 & 1) != 0 ? r3.f43910a : 0, (r35 & 2) != 0 ? r3.f43911b : null, (r35 & 4) != 0 ? r3.f43912c : null, (r35 & 8) != 0 ? r3.f43913d : null, (r35 & 16) != 0 ? r3.f43914e : null, (r35 & 32) != 0 ? r3.f43915f : C37113Xn1.EnumC9494b.VERIFYING_PASSCODE, (r35 & 64) != 0 ? r3.f43916g : null, (r35 & 128) != 0 ? r3.f43917h : null, (r35 & 256) != 0 ? r3.f43918i : null, (r35 & 512) != 0 ? r3.f43919j : null, (r35 & 1024) != 0 ? r3.f43920k : 0, (r35 & 2048) != 0 ? r3.f43921l : 0, (r35 & 4096) != 0 ? r3.f43922m : 0, (r35 & 8192) != 0 ? r3.f43923n : false, (r35 & 16384) != 0 ? r3.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.f43925p : null, (r35 & 65536) != 0 ? c37791a94.getValue().f43926q : null);
        c37791a94.accept(m76349a);
    }

    /* renamed from: B0 */
    public final AbstractC23461c m92557B0(C37113Xn1 c37113Xn1) {
        m92474p1(c37113Xn1);
        AbstractC23461c m33029z = AbstractC23461c.m33057c0(f26303g, TimeUnit.MILLISECONDS).m33029z(new InterfaceC23478a() { // from class: LI
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C5939OI.m92555C0(C5939OI.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "timer(OTA_FIRMWARE_COOLD…(FirmwareUpdateState()) }");
        return m33029z;
    }

    /* renamed from: D0 */
    public final void m92553D0() {
        C37113Xn1 m76349a;
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        m76349a = r3.m76349a((r35 & 1) != 0 ? r3.f43910a : 0, (r35 & 2) != 0 ? r3.f43911b : null, (r35 & 4) != 0 ? r3.f43912c : null, (r35 & 8) != 0 ? r3.f43913d : null, (r35 & 16) != 0 ? r3.f43914e : null, (r35 & 32) != 0 ? r3.f43915f : C37113Xn1.EnumC9494b.UPDATE_CONNECTED, (r35 & 64) != 0 ? r3.f43916g : null, (r35 & 128) != 0 ? r3.f43917h : null, (r35 & 256) != 0 ? r3.f43918i : null, (r35 & 512) != 0 ? r3.f43919j : null, (r35 & 1024) != 0 ? r3.f43920k : 0, (r35 & 2048) != 0 ? r3.f43921l : 0, (r35 & 4096) != 0 ? r3.f43922m : 0, (r35 & 8192) != 0 ? r3.f43923n : false, (r35 & 16384) != 0 ? r3.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.f43925p : null, (r35 & 65536) != 0 ? c37791a94.getValue().f43926q : null);
        c37791a94.accept(m76349a);
    }

    /* renamed from: E0 */
    public final void m92551E0() {
        C37113Xn1 m76349a;
        C37113Xn1 value = this.f26311e.getValue();
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        m76349a = value.m76349a((r35 & 1) != 0 ? value.f43910a : 0, (r35 & 2) != 0 ? value.f43911b : null, (r35 & 4) != 0 ? value.f43912c : null, (r35 & 8) != 0 ? value.f43913d : null, (r35 & 16) != 0 ? value.f43914e : null, (r35 & 32) != 0 ? value.f43915f : null, (r35 & 64) != 0 ? value.f43916g : null, (r35 & 128) != 0 ? value.f43917h : null, (r35 & 256) != 0 ? value.f43918i : null, (r35 & 512) != 0 ? value.f43919j : null, (r35 & 1024) != 0 ? value.f43920k : value.m76339k() + value.m76340j(), (r35 & 2048) != 0 ? value.f43921l : 0, (r35 & 4096) != 0 ? value.f43922m : 0, (r35 & 8192) != 0 ? value.f43923n : false, (r35 & 16384) != 0 ? value.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? value.f43925p : null, (r35 & 65536) != 0 ? value.f43926q : null);
        c37791a94.accept(m76349a);
    }

    /* renamed from: F0 */
    public final void m92549F0() {
        C37113Xn1 m76349a;
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        m76349a = r3.m76349a((r35 & 1) != 0 ? r3.f43910a : 0, (r35 & 2) != 0 ? r3.f43911b : null, (r35 & 4) != 0 ? r3.f43912c : null, (r35 & 8) != 0 ? r3.f43913d : null, (r35 & 16) != 0 ? r3.f43914e : null, (r35 & 32) != 0 ? r3.f43915f : C37113Xn1.EnumC9494b.FIRMWARE_UPDATING, (r35 & 64) != 0 ? r3.f43916g : null, (r35 & 128) != 0 ? r3.f43917h : null, (r35 & 256) != 0 ? r3.f43918i : null, (r35 & 512) != 0 ? r3.f43919j : null, (r35 & 1024) != 0 ? r3.f43920k : 0, (r35 & 2048) != 0 ? r3.f43921l : 0, (r35 & 4096) != 0 ? r3.f43922m : 0, (r35 & 8192) != 0 ? r3.f43923n : false, (r35 & 16384) != 0 ? r3.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.f43925p : null, (r35 & 65536) != 0 ? c37791a94.getValue().f43926q : null);
        c37791a94.accept(m76349a);
    }

    /* renamed from: G0 */
    public final void m92547G0() {
        this.f26311e.m71837i(C5963r.f26342g);
    }

    /* renamed from: H0 */
    public final void m92545H0(String str) {
        int m76343g = this.f26311e.getValue().m76343g();
        int m76340j = this.f26311e.getValue().m76340j();
        int m76339k = this.f26311e.getValue().m76339k();
        C41318g46.m40163a("BirdAirOTAUpdate.onPCMUpdateError: " + str, new Object[0]);
        C41318g46.m40163a("BirdAirOTAUpdate.onPCMUpdateError.bytesPending: " + m76340j, new Object[0]);
        C41318g46.m40163a("BirdAirOTAUpdate.onPCMUpdateError.bytesWritten: " + m76339k, new Object[0]);
        if (m76340j == 0 && m76339k == 0 && m76343g == 0) {
            this.f26311e.m71837i(C5964s.f26343g);
        } else if (m76343g >= 5) {
            this.f26311e.m71837i(C5965t.f26344g);
        } else {
            int m92512Y = m92512Y(str);
            C41318g46.m40163a("BirdAirOTAUpdate.onPCMUpdateError.numErrors: " + m92512Y, new Object[0]);
            this.f26311e.m71837i(new C5966u(m92512Y));
        }
    }

    /* renamed from: I0 */
    public final void m92543I0() {
        C37113Xn1 m76349a;
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        m76349a = r3.m76349a((r35 & 1) != 0 ? r3.f43910a : 0, (r35 & 2) != 0 ? r3.f43911b : null, (r35 & 4) != 0 ? r3.f43912c : null, (r35 & 8) != 0 ? r3.f43913d : null, (r35 & 16) != 0 ? r3.f43914e : null, (r35 & 32) != 0 ? r3.f43915f : C37113Xn1.EnumC9494b.PASSCODE_VERIFIED, (r35 & 64) != 0 ? r3.f43916g : null, (r35 & 128) != 0 ? r3.f43917h : null, (r35 & 256) != 0 ? r3.f43918i : null, (r35 & 512) != 0 ? r3.f43919j : null, (r35 & 1024) != 0 ? r3.f43920k : 0, (r35 & 2048) != 0 ? r3.f43921l : 0, (r35 & 4096) != 0 ? r3.f43922m : 0, (r35 & 8192) != 0 ? r3.f43923n : false, (r35 & 16384) != 0 ? r3.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.f43925p : null, (r35 & 65536) != 0 ? c37791a94.getValue().f43926q : null);
        c37791a94.accept(m76349a);
    }

    /* renamed from: J0 */
    public final boolean m92541J0() {
        C37113Xn1 value = this.f26311e.getValue();
        if (value.m76344f() == C37113Xn1.EnumC9493a.PCM && value.m76334p() == C37113Xn1.EnumC9494b.FIRMWARE_UPDATING) {
            return true;
        }
        return false;
    }

    /* renamed from: K0 */
    public final boolean m92539K0(String str) {
        boolean contains$default;
        boolean z;
        if (!m92541J0()) {
            return false;
        }
        Set<String> set = f26306j;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (String str2 : set) {
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) str2, false, 2, (Object) null);
                if (contains$default) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: L0 */
    public final boolean m92537L0(byte[] bArr) {
        C37113Xn1 value = this.f26311e.getValue();
        if (value.m76334p() == C37113Xn1.EnumC9494b.FIRMWARE_UPDATING && value.m76344f() == C37113Xn1.EnumC9493a.PCM && value.m76347c() && Intrinsics.areEqual(new String(bArr, Charsets.UTF_8), "OK")) {
            return true;
        }
        return false;
    }

    /* renamed from: M0 */
    public final long m92535M0(int i, boolean z) {
        if (i % 64 == 0) {
            return 150L;
        }
        return z ? 40L : 75L;
    }

    /* renamed from: O0 */
    public final AbstractC23442F<C37113Xn1> m92531O0(C37113Xn1 c37113Xn1) {
        AbstractC23461c m92460v0;
        int i = C5947b.$EnumSwitchMapping$0[c37113Xn1.m76334p().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        m92460v0 = AbstractC23461c.m33039p();
                    } else {
                        m92460v0 = m92557B0(c37113Xn1);
                    }
                } else {
                    m92460v0 = m92515W0(c37113Xn1);
                }
            } else {
                m92460v0 = m92469r0(c37113Xn1);
            }
        } else {
            m92460v0 = m92460v0(c37113Xn1);
        }
        AbstractC23442F<C37113Xn1> m33042m = m92460v0.m33042m(AbstractC23442F.m33158H(c37113Xn1));
        Intrinsics.checkNotNullExpressionValue(m33042m, "when (updateState.state)…Single.just(updateState))");
        return m33042m;
    }

    /* renamed from: P0 */
    public final boolean m92529P0(byte[] bArr) {
        C37113Xn1 value = this.f26311e.getValue();
        C41318g46.m40163a("BirdAirOTAUpdate.processUpdateBleData.currentState: " + value, new Object[0]);
        if (bArr.length < 2 || value.m76334p() == C37113Xn1.EnumC9494b.NONE) {
            return false;
        }
        if (value.m76334p() != C37113Xn1.EnumC9494b.PASSCODE_VERIFIED) {
            if ((value.m76334p() != C37113Xn1.EnumC9494b.UPDATE_CONNECTED && value.m76334p() != C37113Xn1.EnumC9494b.FIRMWARE_UPDATING) || bArr.length <= 5) {
                return false;
            }
            int m92528Q = m92528Q(value.m76335o());
            byte m92468r1 = m92468r1(m92528Q);
            byte m92452z0 = m92452z0(m92528Q);
            String m90797a = P70.m90797a(m92468r1);
            C41318g46.m40163a("BirdAirOTAUpdate.checksumUpper: " + m90797a, new Object[0]);
            String m90797a2 = P70.m90797a(m92452z0);
            C41318g46.m40163a("BirdAirOTAUpdate.checksumLower: " + m90797a2, new Object[0]);
            if (m92452z0 != bArr[0] || m92468r1 != bArr[1]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Q */
    public final int m92528Q(byte[] bArr) {
        int i = 0;
        for (byte b : bArr) {
            i += b & UByte.MAX_VALUE;
        }
        return i;
    }

    /* renamed from: Q0 */
    public final void m92527Q0() {
        C37113Xn1 m76349a;
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        m76349a = r3.m76349a((r35 & 1) != 0 ? r3.f43910a : 0, (r35 & 2) != 0 ? r3.f43911b : null, (r35 & 4) != 0 ? r3.f43912c : null, (r35 & 8) != 0 ? r3.f43913d : null, (r35 & 16) != 0 ? r3.f43914e : null, (r35 & 32) != 0 ? r3.f43915f : C37113Xn1.EnumC9494b.CHALLENGE_INITIATED, (r35 & 64) != 0 ? r3.f43916g : null, (r35 & 128) != 0 ? r3.f43917h : null, (r35 & 256) != 0 ? r3.f43918i : null, (r35 & 512) != 0 ? r3.f43919j : null, (r35 & 1024) != 0 ? r3.f43920k : 0, (r35 & 2048) != 0 ? r3.f43921l : 0, (r35 & 4096) != 0 ? r3.f43922m : 0, (r35 & 8192) != 0 ? r3.f43923n : false, (r35 & 16384) != 0 ? r3.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.f43925p : null, (r35 & 65536) != 0 ? c37791a94.getValue().f43926q : null);
        c37791a94.accept(m76349a);
    }

    /* renamed from: R */
    public final C37113Xn1.EnumC9493a m92526R(VehicleVersion vehicleVersion) {
        PrivateBirdFirmwareConfig birdAirFirmwareConfig = this.f26309c.m82623f8().m73665a().getPrivateBirdConfig().getBirdAirFirmwareConfig();
        boolean m92471q1 = m92471q1(vehicleVersion.getDashVersion(), birdAirFirmwareConfig.getDashFirmwareVersion(), birdAirFirmwareConfig.getDashFirmwareUrl());
        boolean m92471q12 = m92471q1(vehicleVersion.getPcmVersion(), birdAirFirmwareConfig.getPcmFirmwareVersion(), birdAirFirmwareConfig.getPcmFirmwareUrl());
        if (m92471q1) {
            return C37113Xn1.EnumC9493a.DASH;
        }
        if (m92471q12) {
            return C37113Xn1.EnumC9493a.PCM;
        }
        return C37113Xn1.EnumC9493a.NONE;
    }

    /* renamed from: S */
    public final String m92524S(C37113Xn1.EnumC9493a enumC9493a) {
        PrivateBirdFirmwareConfig birdAirFirmwareConfig = this.f26309c.m82623f8().m73665a().getPrivateBirdConfig().getBirdAirFirmwareConfig();
        int i = C5947b.$EnumSwitchMapping$1[enumC9493a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return birdAirFirmwareConfig.getPcmFirmwareUrl();
        }
        return birdAirFirmwareConfig.getDashFirmwareUrl();
    }

    /* renamed from: S0 */
    public final AbstractC23461c m92523S0(VehicleDescriptor vehicleDescriptor, C37113Xn1 c37113Xn1, long j, InputStream inputStream) {
        long m76339k = c37113Xn1.m76339k();
        if (m76339k == 0) {
            return m92521T0(vehicleDescriptor, c37113Xn1, j, inputStream);
        }
        if (m76339k == j) {
            return m92516W(c37113Xn1);
        }
        return m92519U0(vehicleDescriptor, c37113Xn1, j, inputStream);
    }

    /* renamed from: T */
    public final byte[] m92522T(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        bArr3[0] = bArr[0];
        bArr3[1] = bArr[1];
        bArr3[2] = bArr[2];
        bArr3[3] = bArr[3];
        bArr3[4] = m92452z0(i);
        bArr3[5] = m92468r1(i);
        bArr3[6] = 0;
        bArr3[7] = 0;
        if (bArr2 != null) {
            int length = bArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                bArr3[i2 + 8] = bArr2[i2];
            }
        }
        return bArr3;
    }

    /* renamed from: T0 */
    public final AbstractC23461c m92521T0(VehicleDescriptor vehicleDescriptor, C37113Xn1 c37113Xn1, long j, InputStream inputStream) {
        C37113Xn1 m76349a;
        byte[] bArr = new byte[56];
        bArr[4] = UByte.m116801constructorimpl((byte) (UByte.m116801constructorimpl((byte) j) & UByte.m116801constructorimpl((byte) KotlinVersion.MAX_COMPONENT_VALUE)));
        bArr[5] = (byte) (j >> 8);
        for (int i = 0; i < 48; i++) {
            bArr[i + 8] = (byte) inputStream.read();
        }
        byte[] m92520U = m92520U(Command.BIRD_AIR_OTA_UPDATE_HEADER.getData(), bArr);
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        m76349a = c37113Xn1.m76349a((r35 & 1) != 0 ? c37113Xn1.f43910a : 0, (r35 & 2) != 0 ? c37113Xn1.f43911b : null, (r35 & 4) != 0 ? c37113Xn1.f43912c : null, (r35 & 8) != 0 ? c37113Xn1.f43913d : null, (r35 & 16) != 0 ? c37113Xn1.f43914e : null, (r35 & 32) != 0 ? c37113Xn1.f43915f : null, (r35 & 64) != 0 ? c37113Xn1.f43916g : m92520U, (r35 & 128) != 0 ? c37113Xn1.f43917h : null, (r35 & 256) != 0 ? c37113Xn1.f43918i : null, (r35 & 512) != 0 ? c37113Xn1.f43919j : null, (r35 & 1024) != 0 ? c37113Xn1.f43920k : 0, (r35 & 2048) != 0 ? c37113Xn1.f43921l : 48, (r35 & 4096) != 0 ? c37113Xn1.f43922m : 0, (r35 & 8192) != 0 ? c37113Xn1.f43923n : false, (r35 & 16384) != 0 ? c37113Xn1.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? c37113Xn1.f43925p : null, (r35 & 65536) != 0 ? c37113Xn1.f43926q : null);
        c37791a94.accept(m76349a);
        List<String> m14770b = C48457s70.m14770b(m92520U);
        C41318g46.m40163a("BirdAirOTAUpdate.sending initial packet: " + m14770b, new Object[0]);
        return this.f26310d.mo15673m(vehicleDescriptor, m92520U);
    }

    /* renamed from: U */
    public final byte[] m92520U(byte[] bArr, byte[] bArr2) {
        C37113Xn1 m76349a;
        byte[] m92522T = m92522T(bArr, this.f26311e.getValue().m76345e(), bArr2);
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        m76349a = r4.m76349a((r35 & 1) != 0 ? r4.f43910a : this.f26311e.getValue().m76345e() + 2, (r35 & 2) != 0 ? r4.f43911b : null, (r35 & 4) != 0 ? r4.f43912c : null, (r35 & 8) != 0 ? r4.f43913d : null, (r35 & 16) != 0 ? r4.f43914e : null, (r35 & 32) != 0 ? r4.f43915f : C37113Xn1.EnumC9494b.FIRMWARE_UPDATING, (r35 & 64) != 0 ? r4.f43916g : null, (r35 & 128) != 0 ? r4.f43917h : null, (r35 & 256) != 0 ? r4.f43918i : null, (r35 & 512) != 0 ? r4.f43919j : null, (r35 & 1024) != 0 ? r4.f43920k : 0, (r35 & 2048) != 0 ? r4.f43921l : 0, (r35 & 4096) != 0 ? r4.f43922m : 0, (r35 & 8192) != 0 ? r4.f43923n : false, (r35 & 16384) != 0 ? r4.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r4.f43925p : null, (r35 & 65536) != 0 ? c37791a94.getValue().f43926q : null);
        c37791a94.accept(m76349a);
        return m92522T;
    }

    /* renamed from: U0 */
    public final AbstractC23461c m92519U0(VehicleDescriptor vehicleDescriptor, C37113Xn1 c37113Xn1, long j, InputStream inputStream) {
        C37113Xn1 m76349a;
        int i = 56;
        byte[] bArr = new byte[56];
        int m76339k = c37113Xn1.m76339k();
        if (m76339k + 56 > j) {
            i = (int) (j - m76339k);
        }
        int i2 = i;
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) inputStream.read();
        }
        byte[] m92520U = m92520U(Command.BIRD_AIR_OTA_UPDATE_FILE_WRITE.getData(), bArr);
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        m76349a = c37113Xn1.m76349a((r35 & 1) != 0 ? c37113Xn1.f43910a : 0, (r35 & 2) != 0 ? c37113Xn1.f43911b : null, (r35 & 4) != 0 ? c37113Xn1.f43912c : null, (r35 & 8) != 0 ? c37113Xn1.f43913d : null, (r35 & 16) != 0 ? c37113Xn1.f43914e : null, (r35 & 32) != 0 ? c37113Xn1.f43915f : null, (r35 & 64) != 0 ? c37113Xn1.f43916g : m92520U, (r35 & 128) != 0 ? c37113Xn1.f43917h : null, (r35 & 256) != 0 ? c37113Xn1.f43918i : null, (r35 & 512) != 0 ? c37113Xn1.f43919j : null, (r35 & 1024) != 0 ? c37113Xn1.f43920k : 0, (r35 & 2048) != 0 ? c37113Xn1.f43921l : i2, (r35 & 4096) != 0 ? c37113Xn1.f43922m : 0, (r35 & 8192) != 0 ? c37113Xn1.f43923n : false, (r35 & 16384) != 0 ? c37113Xn1.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? c37113Xn1.f43925p : null, (r35 & 65536) != 0 ? c37113Xn1.f43926q : null);
        c37791a94.accept(m76349a);
        List<String> m14770b = C48457s70.m14770b(m92520U);
        C41318g46.m40163a("BirdAirOTAUpdate.sending next packet: " + m14770b, new Object[0]);
        return this.f26310d.mo15673m(vehicleDescriptor, m92520U);
    }

    /* renamed from: V0 */
    public final AbstractC23461c m92517V0(VehicleDescriptor vehicleDescriptor) {
        C37113Xn1 m76349a;
        byte[] m92522T = m92522T(Command.BIRD_AIR_SYNC_OTA_UPDATE.getData(), 1, new byte[]{1});
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        m76349a = r5.m76349a((r35 & 1) != 0 ? r5.f43910a : 1, (r35 & 2) != 0 ? r5.f43911b : null, (r35 & 4) != 0 ? r5.f43912c : null, (r35 & 8) != 0 ? r5.f43913d : null, (r35 & 16) != 0 ? r5.f43914e : null, (r35 & 32) != 0 ? r5.f43915f : null, (r35 & 64) != 0 ? r5.f43916g : m92522T, (r35 & 128) != 0 ? r5.f43917h : null, (r35 & 256) != 0 ? r5.f43918i : null, (r35 & 512) != 0 ? r5.f43919j : null, (r35 & 1024) != 0 ? r5.f43920k : 0, (r35 & 2048) != 0 ? r5.f43921l : 0, (r35 & 4096) != 0 ? r5.f43922m : 0, (r35 & 8192) != 0 ? r5.f43923n : false, (r35 & 16384) != 0 ? r5.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r5.f43925p : null, (r35 & 65536) != 0 ? c37791a94.getValue().f43926q : null);
        c37791a94.accept(m76349a);
        return this.f26310d.mo15673m(vehicleDescriptor, m92522T);
    }

    /* renamed from: W */
    public final AbstractC23461c m92516W(C37113Xn1 c37113Xn1) {
        C37113Xn1 m76349a;
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        m76349a = c37113Xn1.m76349a((r35 & 1) != 0 ? c37113Xn1.f43910a : 0, (r35 & 2) != 0 ? c37113Xn1.f43911b : null, (r35 & 4) != 0 ? c37113Xn1.f43912c : null, (r35 & 8) != 0 ? c37113Xn1.f43913d : null, (r35 & 16) != 0 ? c37113Xn1.f43914e : null, (r35 & 32) != 0 ? c37113Xn1.f43915f : C37113Xn1.EnumC9494b.UPDATE_SUCCESS, (r35 & 64) != 0 ? c37113Xn1.f43916g : null, (r35 & 128) != 0 ? c37113Xn1.f43917h : null, (r35 & 256) != 0 ? c37113Xn1.f43918i : null, (r35 & 512) != 0 ? c37113Xn1.f43919j : null, (r35 & 1024) != 0 ? c37113Xn1.f43920k : 0, (r35 & 2048) != 0 ? c37113Xn1.f43921l : 0, (r35 & 4096) != 0 ? c37113Xn1.f43922m : 0, (r35 & 8192) != 0 ? c37113Xn1.f43923n : false, (r35 & 16384) != 0 ? c37113Xn1.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? c37113Xn1.f43925p : null, (r35 & 65536) != 0 ? c37113Xn1.f43926q : null);
        c37791a94.accept(m76349a);
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
        return m33039p;
    }

    /* renamed from: W0 */
    public final AbstractC23461c m92515W0(C37113Xn1 c37113Xn1) {
        Long m76337m = c37113Xn1.m76337m();
        if (m76337m != null) {
            long longValue = m76337m.longValue();
            InputStream m76336n = c37113Xn1.m76336n();
            if (m76336n == null) {
                AbstractC23461c m33080F = AbstractC23461c.m33080F(new IllegalStateException("Firmware update not set"));
                Intrinsics.checkNotNullExpressionValue(m33080F, "error(IllegalStateExcept…irmware update not set\"))");
                return m33080F;
            }
            VehicleDescriptor m76331s = c37113Xn1.m76331s();
            if (m76331s == null) {
                AbstractC23461c m33080F2 = AbstractC23461c.m33080F(new IllegalStateException("VehicleDescriptor is null"));
                Intrinsics.checkNotNullExpressionValue(m33080F2, "error(IllegalStateExcept…icleDescriptor is null\"))");
                return m33080F2;
            }
            String[] m76338l = c37113Xn1.m76338l();
            int i = C5947b.$EnumSwitchMapping$1[c37113Xn1.m76344f().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    AbstractC23461c m33039p = AbstractC23461c.m33039p();
                    Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
                    return m33039p;
                }
                return m92509Z0(m76331s, c37113Xn1, m76338l);
            }
            return m92523S0(m76331s, c37113Xn1, longValue, m76336n);
        }
        AbstractC23461c m33080F3 = AbstractC23461c.m33080F(new IllegalStateException("Invalid firmware file length."));
        Intrinsics.checkNotNullExpressionValue(m33080F3, "error(IllegalStateExcept… firmware file length.\"))");
        return m33080F3;
    }

    /* renamed from: X0 */
    public final AbstractC23461c m92513X0(VehicleDescriptor vehicleDescriptor) {
        byte[] data = Command.BIRD_AIR_PCM_UPDATE_START.getData();
        Observable<Long> intervalRange = Observable.intervalRange(0L, 5L, 0L, 100L, TimeUnit.MILLISECONDS);
        final C5968w c5968w = new C5968w(vehicleDescriptor, data);
        AbstractC23461c flatMapCompletable = intervalRange.flatMapCompletable(new InterfaceC23492o() { // from class: MI
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m92511Y0;
                m92511Y0 = C5939OI.m92511Y0(Function1.this, obj);
                return m92511Y0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "private fun sendOTAPCMSt…  }\n        }\n      )\n  }");
        return m92510Z(flatMapCompletable, C37113Xn1.EnumC9494b.UPDATE_FAILED, "pcm_error_on_44_cmd", new C5969x(data));
    }

    /* renamed from: Y */
    public final int m92512Y(String str) {
        int indexOf$default;
        int i = 0;
        for (String str2 : f26306j) {
            int i2 = 0;
            while (true) {
                indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, i2, false, 4, (Object) null);
                if (indexOf$default != -1) {
                    i2 = indexOf$default + str2.length();
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: Z */
    public final AbstractC23461c m92510Z(AbstractC23461c abstractC23461c, final C37113Xn1.EnumC9494b enumC9494b, final String str, final Function0<Unit> function0) {
        C41318g46.m40163a("BirdAirOTAUpdate.failUpdateIfStateUnchanged.unexpectedState: " + enumC9494b, new Object[0]);
        AbstractC23461c m33029z = abstractC23461c.m33029z(new InterfaceC23478a() { // from class: rI
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C5939OI.m92505b0(C5939OI.this, enumC9494b, str, function0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "this.doOnComplete {\n    …)\n        }\n      }\n    }");
        return m33029z;
    }

    /* renamed from: Z0 */
    public final AbstractC23461c m92509Z0(VehicleDescriptor vehicleDescriptor, C37113Xn1 c37113Xn1, String[] strArr) {
        final long j;
        List mutableListOf;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = c37113Xn1.m76339k();
        int m76345e = c37113Xn1.m76345e();
        C41318g46.m40163a("BirdAirOTAUpdate.sendPCMFirmwareUpdate.bytesRead: " + intRef.element, new Object[0]);
        C41318g46.m40163a("BirdAirOTAUpdate.sendPCMFirmwareUpdate.numLinesWritten: " + m76345e, new Object[0]);
        if (m76345e >= strArr.length - 1) {
            C41318g46.m40163a("BirdAirOTAUpdate.sendPCMFirmwareUpdate.completed!", new Object[0]);
            AbstractC23461c m33049i = this.f26310d.mo15680f(vehicleDescriptor, Command.BIRD_AIR_PCM_UPDATE_END.getData()).m33049i(new InterfaceC23496h() { // from class: NI
                @Override // io.reactivex.InterfaceC23496h
                /* renamed from: g */
                public final void mo33003g(InterfaceC23476f interfaceC23476f) {
                    C5939OI.m92506a1(C5939OI.this, interfaceC23476f);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33049i, "rxBleBirdBluetoothManage…E\n            )\n        }");
            return m33049i;
        }
        List<AbstractC23461c> m92485l0 = m92485l0(vehicleDescriptor, c37113Xn1, m76345e);
        String str = strArr[m76345e];
        intRef.element += str.length() + 1;
        final byte[] m25600f = C45097mS5.m25600f(str, true);
        AbstractC23461c mo15680f = this.f26310d.mo15680f(vehicleDescriptor, m25600f);
        long m92533N0 = m92533N0(this, m76345e, false, 2, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC23461c m33029z = mo15680f.m33034u(m92533N0, timeUnit).m33029z(new InterfaceC23478a() { // from class: mI
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C5939OI.m92504b1(C5939OI.this, intRef, m25600f);
            }
        });
        if (c37113Xn1.m76342h()) {
            j = 200;
        } else {
            j = 0;
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(AbstractC23461c.m33057c0(j, timeUnit).m33029z(new InterfaceC23478a() { // from class: nI
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C5939OI.m92502c1(j);
            }
        }));
        mutableListOf.addAll(m92485l0);
        mutableListOf.add(m33029z);
        this.f26311e.m71837i(C5971y.f26355g);
        Observable fromIterable = Observable.fromIterable(mutableListOf);
        final C5972z c5972z = C5972z.f26356g;
        AbstractC23461c concatMapCompletable = fromIterable.concatMapCompletable(new InterfaceC23492o() { // from class: oI
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m92500d1;
                m92500d1 = C5939OI.m92500d1(Function1.this, obj);
                return m92500d1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(concatMapCompletable, "fromIterable(payloadWrit…ncatMapCompletable { it }");
        return concatMapCompletable;
    }

    @Override // p000.InterfaceC25134kI
    /* renamed from: b */
    public AbstractC23461c mo29102b(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        AbstractC23461c mo15684b = this.f26310d.mo15684b(vehicleDescriptor);
        final C5960o c5960o = new C5960o(vehicleDescriptor);
        AbstractC23461c m33081E = mo15684b.m33081E(new InterfaceC23484g() { // from class: FI
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C5939OI.m92466s0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33081E, "override fun initiateCha…E_INITIATED))\n      }\n  }");
        return m33081E;
    }

    @Override // p000.InterfaceC25134kI
    /* renamed from: c */
    public Observable<Boolean> mo29101c(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        final C5956k c5956k = new C5956k(vehicleDescriptor);
        Observable map = c37791a94.map(new InterfaceC23492o() { // from class: EI
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m92491i0;
                m92491i0 = C5939OI.m92491i0(Function1.this, obj);
                return m92491i0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "vehicleDescriptor: Vehic…ate.UPDATE_FAILED\n      }");
        return map;
    }

    @Override // p000.InterfaceC25134kI
    /* renamed from: d */
    public Observable<VehicleDescriptor> mo29100d() {
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        final C5949d c5949d = C5949d.f26323g;
        Observable<C37113Xn1> filter = c37791a94.filter(new InterfaceC23494q() { // from class: uI
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m92503c0;
                m92503c0 = C5939OI.m92503c0(Function1.this, obj);
                return m92503c0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "updateStateRelay\n      .…ate.CHALLENGE_INITIATED }");
        return C37279Yf5.m74575T(filter, C5950e.f26324g);
    }

    @Override // p000.InterfaceC25134kI
    /* renamed from: e */
    public AbstractC23461c mo29099e(Bird bird, VehicleVersion vehicleVersion) {
        AbstractC23461c abstractC23461c;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(vehicleVersion, "vehicleVersion");
        m92477o1(bird, vehicleVersion);
        C37113Xn1.EnumC9493a m92526R = m92526R(vehicleVersion);
        String m92524S = m92524S(m92526R);
        if (m92524S != null) {
            AbstractC23442F<HM4<ResponseBody>> mo13529f = this.f26308b.mo13529f(m92524S);
            final C5948c c5948c = new C5948c(bird, vehicleVersion, m92526R);
            abstractC23461c = mo13529f.m33164B(new InterfaceC23492o() { // from class: CI
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m92514X;
                    m92514X = C5939OI.m92514X(Function1.this, obj);
                    return m92514X;
                }
            });
        } else {
            abstractC23461c = null;
        }
        if (abstractC23461c == null) {
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
            return m33039p;
        }
        return abstractC23461c;
    }

    /* renamed from: e1 */
    public final AbstractC23461c m92498e1(final Bird bird, final VehicleVersion vehicleVersion, final C37113Xn1.EnumC9493a enumC9493a, final InputStream inputStream, final Long l) {
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: lI
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m92496f1;
                m92496f1 = C5939OI.m92496f1(C37113Xn1.EnumC9493a.this, inputStream, this, bird, vehicleVersion, l);
                return m92496f1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n      var…ateStream,\n      ))\n    }");
        return m33078H;
    }

    @Override // p000.InterfaceC25134kI
    /* renamed from: f */
    public void mo29098f(byte[] data) {
        boolean startsWith;
        boolean startsWith2;
        List list;
        Intrinsics.checkNotNullParameter(data, "data");
        String str = new String(data, Charsets.UTF_8);
        List<String> m14770b = C48457s70.m14770b(data);
        C41318g46.m40163a("BirdAirOTAUpdate.processBleNotifyData.data: " + m14770b, new Object[0]);
        C41318g46.m40163a("BirdAirOTAUpdate.processBleNotifyData.dataAscii: " + str, new Object[0]);
        if (m92539K0(str)) {
            m92545H0(str);
        } else if (!m92537L0(data)) {
            startsWith = StringsKt__StringsJVMKt.startsWith(str, "ERRERRERR", true);
            if (!startsWith) {
                startsWith2 = StringsKt__StringsJVMKt.startsWith(str, "OK OK OK", true);
                if (!startsWith2) {
                    list = ArraysKt___ArraysKt.toList(data);
                    if (!list.containsAll(f26304h) && !Intrinsics.areEqual(str, f26305i)) {
                        if (m92529P0(data)) {
                            m92475p0();
                            return;
                        } else {
                            m92454y0(data);
                            return;
                        }
                    }
                }
                m92472q0(data);
                return;
            }
            m92478o0(data);
        } else {
            m92547G0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000.InterfaceC25134kI
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C36879Wn1 mo29097g(Bird bird, VehicleVersion vehicleVersion) {
        Pair pair;
        Pair pair2;
        String str;
        String str2;
        float f;
        float parseFloat;
        String id;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(vehicleVersion, "vehicleVersion");
        C37113Xn1.EnumC9493a m92526R = m92526R(vehicleVersion);
        if (m92526R == C37113Xn1.EnumC9493a.NONE) {
            return null;
        }
        int i = C5947b.$EnumSwitchMapping$1[m92526R.ordinal()];
        if (i != 1) {
            if (i != 2) {
                pair2 = new Pair("0", "0");
                str = (String) pair2.component1();
                str2 = (String) pair2.component2();
                float f2 = 0.0f;
                if (str == null) {
                    try {
                        parseFloat = Float.parseFloat(str);
                    } catch (NumberFormatException unused) {
                        f = 0.0f;
                    }
                } else {
                    parseFloat = 0.0f;
                }
                f = parseFloat;
                if (str2 != null) {
                    try {
                        f2 = Float.parseFloat(str2);
                    } catch (NumberFormatException unused2) {
                    }
                }
                float f3 = f2;
                if (!Bird_Kt.isBirdAir(bird)) {
                    id = bird.getSerialNumber();
                } else {
                    id = bird.getId();
                }
                return new C36879Wn1(id, bird.getModel(), m92526R.name(), f, f3);
            }
            pair = new Pair(vehicleVersion.getPcmVersion(), this.f26309c.m82623f8().m73665a().getPrivateBirdConfig().getBirdAirFirmwareConfig().getPcmFirmwareVersion());
        } else {
            pair = new Pair(vehicleVersion.getDashVersion(), this.f26309c.m82623f8().m73665a().getPrivateBirdConfig().getBirdAirFirmwareConfig().getDashFirmwareVersion());
        }
        pair2 = pair;
        str = (String) pair2.component1();
        str2 = (String) pair2.component2();
        float f22 = 0.0f;
        if (str == null) {
        }
        f = parseFloat;
        if (str2 != null) {
        }
        float f32 = f22;
        if (!Bird_Kt.isBirdAir(bird)) {
        }
        return new C36879Wn1(id, bird.getModel(), m92526R.name(), f, f32);
    }

    @Override // p000.InterfaceC25134kI
    /* renamed from: h */
    public Observable<Float> mo29096h(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        final C5957l c5957l = new C5957l(vehicleDescriptor);
        Observable<C37113Xn1> filter = c37791a94.filter(new InterfaceC23494q() { // from class: AI
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m92489j0;
                m92489j0 = C5939OI.m92489j0(Function1.this, obj);
                return m92489j0;
            }
        });
        final C5958m c5958m = C5958m.f26331g;
        Observable map = filter.map(new InterfaceC23492o() { // from class: BI
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Float m92487k0;
                m92487k0 = C5939OI.m92487k0(Function1.this, obj);
                return m92487k0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "vehicleDescriptor: Vehic….coerceAtMost(1f)\n      }");
        return map;
    }

    /* renamed from: h1 */
    public final void m92492h1() {
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        final C5941B c5941b = C5941B.f26314g;
        Observable<C37113Xn1> distinctUntilChanged = c37791a94.distinctUntilChanged(new InterfaceC23481d() { // from class: wI
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m92490i1;
                m92490i1 = C5939OI.m92490i1(Function2.this, obj, obj2);
                return m92490i1;
            }
        });
        final C5942C c5942c = C5942C.f26315g;
        Observable<C37113Xn1> doOnNext = distinctUntilChanged.doOnNext(new InterfaceC23484g() { // from class: GI
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C5939OI.m92488j1(Function1.this, obj);
            }
        });
        final C5943D c5943d = new C5943D();
        Observable retry = doOnNext.switchMapSingle(new InterfaceC23492o() { // from class: HI
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m92486k1;
                m92486k1 = C5939OI.m92486k1(Function1.this, obj);
                return m92486k1;
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun subscribeOTA…cribe({ }, Timber::e)\n  }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5944E c5944e = C5944E.f26317g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: II
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C5939OI.m92484l1(Function1.this, obj);
            }
        };
        final C5945F c5945f = C5945F.f26318b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: JI
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C5939OI.m92482m1(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC25134kI
    /* renamed from: i */
    public C37113Xn1.EnumC9493a mo29095i(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        return this.f26311e.getValue().m76344f();
    }

    @Override // p000.InterfaceC25134kI
    /* renamed from: j */
    public AbstractC23461c mo29094j(VehicleDescriptor vehicleDescriptor, String passcode) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        C41318g46.m40163a("BirdAirOTAUpdate.sendChallengePasscode.passcode: " + passcode, new Object[0]);
        AbstractC23442F<C37113Xn1> firstOrError = this.f26311e.firstOrError();
        final C5967v c5967v = new C5967v(vehicleDescriptor, this, passcode);
        AbstractC23461c m33164B = firstOrError.m33164B(new InterfaceC23492o() { // from class: sI
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m92525R0;
                m92525R0 = C5939OI.m92525R0(Function1.this, obj);
                return m92525R0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun sendChallen…de)\n        }\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC25134kI
    /* renamed from: k */
    public Observable<Boolean> mo29093k(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        final C5951f c5951f = new C5951f(vehicleDescriptor);
        Observable map = c37791a94.map(new InterfaceC23492o() { // from class: DI
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m92501d0;
                m92501d0 = C5939OI.m92501d0(Function1.this, obj);
                return m92501d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "vehicleDescriptor: Vehic…te.UPDATE_SUCCESS\n      }");
        return map;
    }

    @Override // p000.InterfaceC25134kI
    /* renamed from: l */
    public boolean mo29092l(VehicleVersion vehicleVersion) {
        Intrinsics.checkNotNullParameter(vehicleVersion, "vehicleVersion");
        if (m92526R(vehicleVersion) != C37113Xn1.EnumC9493a.NONE) {
            return true;
        }
        return false;
    }

    /* renamed from: l0 */
    public final List<AbstractC23461c> m92485l0(VehicleDescriptor vehicleDescriptor, C37113Xn1 c37113Xn1, int i) {
        List<AbstractC23461c> listOf;
        IntProgression downTo;
        int collectionSizeOrDefault;
        int coerceAtLeast;
        int m76341i = c37113Xn1.m76341i();
        if (m76341i == 0 || !c37113Xn1.m76342h()) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: qI
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C5939OI.m92483m0(C5939OI.this);
                }
            }));
            return listOf;
        }
        downTo = RangesKt___RangesKt.downTo(m76341i, 0);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(downTo, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = downTo.iterator();
        while (it.hasNext()) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i - ((IntIterator) it).nextInt(), 0);
            byte[] m25600f = C45097mS5.m25600f(c37113Xn1.m76338l()[coerceAtLeast], true);
            arrayList.add(this.f26310d.mo15680f(vehicleDescriptor, m25600f).m33034u(m92535M0(coerceAtLeast, true), TimeUnit.MILLISECONDS));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC25134kI
    /* renamed from: m */
    public AbstractC23461c mo29091m() {
        AbstractC23461c m33080F;
        final C37113Xn1 value = this.f26311e.getValue();
        VehicleDescriptor m76331s = value.m76331s();
        if (m76331s != null) {
            m33080F = this.f26310d.mo15673m(m76331s, m92518V(this, Command.BIRD_AIR_STOP_UPDATE.getData(), value.m76345e(), null, 4, null));
        } else {
            m33080F = AbstractC23461c.m33080F(new IllegalStateException("VehicleDescriptor is null"));
        }
        AbstractC23461c m33029z = m33080F.m33029z(new InterfaceC23478a() { // from class: tI
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C5939OI.m92494g1(C5939OI.this, value);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "if (vehicleDescriptor !=…_USER,\n        ))\n      }");
        return m33029z;
    }

    @Override // p000.InterfaceC25134kI
    /* renamed from: n */
    public Observable<C37113Xn1.EnumC9493a> mo29090n() {
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        final C5952g c5952g = C5952g.f26326g;
        Observable<C37113Xn1> distinctUntilChanged = c37791a94.distinctUntilChanged(new InterfaceC23481d() { // from class: vI
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m92495g0;
                m92495g0 = C5939OI.m92495g0(Function2.this, obj, obj2);
                return m92495g0;
            }
        });
        final C5953h c5953h = C5953h.f26327g;
        Observable<C37113Xn1> filter = distinctUntilChanged.filter(new InterfaceC23494q() { // from class: xI
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m92493h0;
                m92493h0 = C5939OI.m92493h0(Function1.this, obj);
                return m92493h0;
            }
        });
        final C5954i c5954i = new C5954i(this);
        Observable<C37113Xn1> doOnNext = filter.doOnNext(new InterfaceC23484g() { // from class: yI
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C5939OI.m92499e0(Function1.this, obj);
            }
        });
        final C5955j c5955j = C5955j.f26328g;
        Observable map = doOnNext.map(new InterfaceC23492o() { // from class: zI
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C37113Xn1.EnumC9493a m92497f0;
                m92497f0 = C5939OI.m92497f0(Function1.this, obj);
                return m92497f0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "updateStateRelay\n      .…    .map { it.component }");
        return map;
    }

    /* renamed from: n0 */
    public final C37791a94<C37113Xn1> m92481n0() {
        return this.f26311e;
    }

    /* renamed from: n1 */
    public final void m92480n1(C37113Xn1 c37113Xn1) {
        C36879Wn1 mo29097g;
        Pair pair = new Pair(c37113Xn1.m76346d(), c37113Xn1.m76330t());
        Bird bird = (Bird) pair.component1();
        VehicleVersion vehicleVersion = (VehicleVersion) pair.component2();
        if (bird != null && vehicleVersion != null && (mo29097g = mo29097g(bird, vehicleVersion)) != null) {
            this.f26307a.mo55905y(new C44874m44(null, null, null, mo29097g.m77834b(), mo29097g.m77833c(), mo29097g.m77830f(), Float.valueOf(mo29097g.m77832d()), Float.valueOf(mo29097g.m77831e()), Long.valueOf(c37113Xn1.m76348b()), Long.valueOf(DateTime.now().getMillis() - c37113Xn1.m76332r().getMillis()), c37113Xn1.m76333q(), 7, null));
        }
    }

    /* renamed from: o0 */
    public final void m92478o0(byte[] bArr) {
        if (C5947b.$EnumSwitchMapping$0[this.f26311e.getValue().m76334p().ordinal()] == 5) {
            m92527Q0();
        } else {
            m92454y0(bArr);
        }
    }

    /* renamed from: o1 */
    public final void m92477o1(Bird bird, VehicleVersion vehicleVersion) {
        C36879Wn1 mo29097g = mo29097g(bird, vehicleVersion);
        if (mo29097g != null) {
            this.f26307a.mo55905y(new C45467n44(null, null, null, mo29097g.m77834b(), mo29097g.m77833c(), mo29097g.m77830f(), Float.valueOf(mo29097g.m77832d()), Float.valueOf(mo29097g.m77831e()), 7, null));
        }
    }

    /* renamed from: p0 */
    public final void m92475p0() {
        int i = C5947b.$EnumSwitchMapping$0[this.f26311e.getValue().m76334p().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 7) {
                        return;
                    }
                } else {
                    m92551E0();
                    return;
                }
            }
            m92549F0();
            return;
        }
        m92553D0();
    }

    /* renamed from: p1 */
    public final void m92474p1(C37113Xn1 c37113Xn1) {
        C36879Wn1 mo29097g;
        Pair pair = new Pair(c37113Xn1.m76346d(), c37113Xn1.m76330t());
        Bird bird = (Bird) pair.component1();
        VehicleVersion vehicleVersion = (VehicleVersion) pair.component2();
        if (bird != null && vehicleVersion != null && (mo29097g = mo29097g(bird, vehicleVersion)) != null) {
            this.f26307a.mo55905y(new C46060o44(null, null, null, mo29097g.m77834b(), mo29097g.m77833c(), mo29097g.m77830f(), Float.valueOf(mo29097g.m77832d()), Float.valueOf(mo29097g.m77831e()), Long.valueOf(DateTime.now().getMillis() - c37113Xn1.m76332r().getMillis()), 7, null));
        }
    }

    /* renamed from: q0 */
    public final void m92472q0(byte[] bArr) {
        int i = C5947b.$EnumSwitchMapping$0[this.f26311e.getValue().m76334p().ordinal()];
        if (i != 1) {
            if (i != 5) {
                if (i != 6) {
                    m92454y0(bArr);
                    return;
                } else {
                    m92543I0();
                    return;
                }
            }
            m92559A0();
            return;
        }
        m92553D0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
        if (r5.doubleValue() < r7.doubleValue()) goto L19;
     */
    /* renamed from: q1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m92471q1(String str, String str2, String str3) {
        boolean z;
        Double doubleOrNull;
        boolean z2 = true;
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return false;
        }
        Double d = null;
        if (str != null) {
            try {
                doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str);
            } catch (NumberFormatException e) {
                C41318g46.m40159e(e);
                return false;
            }
        } else {
            doubleOrNull = null;
        }
        if (str2 != null) {
            d = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str2);
        }
        if (doubleOrNull != null && d != null) {
        }
        z2 = false;
        return z2;
    }

    /* renamed from: r0 */
    public final AbstractC23461c m92469r0(C37113Xn1 c37113Xn1) {
        VehicleDescriptor m76331s = c37113Xn1.m76331s();
        if (m76331s == null) {
            AbstractC23461c m33080F = AbstractC23461c.m33080F(new IllegalStateException("VehicleDescriptor is null"));
            Intrinsics.checkNotNullExpressionValue(m33080F, "error(IllegalStateExcept…icleDescriptor is null\"))");
            return m33080F;
        }
        int i = C5947b.$EnumSwitchMapping$1[c37113Xn1.m76344f().ordinal()];
        if (i != 1) {
            if (i != 2) {
                AbstractC23461c m33039p = AbstractC23461c.m33039p();
                Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
                return m33039p;
            }
            return m92513X0(m76331s);
        }
        return m92517V0(m76331s);
    }

    /* renamed from: r1 */
    public final byte m92468r1(int i) {
        return (byte) (i >> 8);
    }

    /* renamed from: t0 */
    public final AbstractC23461c m92464t0(VehicleDescriptor vehicleDescriptor) {
        Ref.IntRef intRef = new Ref.IntRef();
        Observable<Long> intervalRange = Observable.intervalRange(0L, 3L, 350L, 250L, TimeUnit.MILLISECONDS);
        final C5961p c5961p = new C5961p(intRef, vehicleDescriptor);
        AbstractC23461c flatMapCompletable = intervalRange.flatMapCompletable(new InterfaceC23492o() { // from class: pI
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m92462u0;
                m92462u0 = C5939OI.m92462u0(Function1.this, obj);
                return m92462u0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "private fun initiateDash…tor, command)\n      }\n  }");
        return flatMapCompletable;
    }

    /* renamed from: v0 */
    public final AbstractC23461c m92460v0(C37113Xn1 c37113Xn1) {
        VehicleDescriptor m76331s = c37113Xn1.m76331s();
        if (m76331s == null) {
            AbstractC23461c m33080F = AbstractC23461c.m33080F(new IllegalStateException("VehicleDescriptor is null"));
            Intrinsics.checkNotNullExpressionValue(m33080F, "error(IllegalStateExcept…icleDescriptor is null\"))");
            return m33080F;
        }
        int i = C5947b.$EnumSwitchMapping$1[c37113Xn1.m76344f().ordinal()];
        if (i != 1) {
            if (i != 2) {
                AbstractC23461c m33039p = AbstractC23461c.m33039p();
                Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
                return m33039p;
            }
            return m92458w0(m76331s);
        }
        return m92464t0(m76331s);
    }

    /* renamed from: w0 */
    public final AbstractC23461c m92458w0(VehicleDescriptor vehicleDescriptor) {
        C37113Xn1 m76349a;
        byte[] data = Command.BIRD_AIR_PCM_MODE.getData();
        C37791a94<C37113Xn1> c37791a94 = this.f26311e;
        m76349a = r2.m76349a((r35 & 1) != 0 ? r2.f43910a : 0, (r35 & 2) != 0 ? r2.f43911b : null, (r35 & 4) != 0 ? r2.f43912c : null, (r35 & 8) != 0 ? r2.f43913d : null, (r35 & 16) != 0 ? r2.f43914e : null, (r35 & 32) != 0 ? r2.f43915f : null, (r35 & 64) != 0 ? r2.f43916g : data, (r35 & 128) != 0 ? r2.f43917h : null, (r35 & 256) != 0 ? r2.f43918i : null, (r35 & 512) != 0 ? r2.f43919j : null, (r35 & 1024) != 0 ? r2.f43920k : 0, (r35 & 2048) != 0 ? r2.f43921l : 0, (r35 & 4096) != 0 ? r2.f43922m : 0, (r35 & 8192) != 0 ? r2.f43923n : false, (r35 & 16384) != 0 ? r2.f43924o : 0, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r2.f43925p : null, (r35 & 65536) != 0 ? c37791a94.getValue().f43926q : null);
        c37791a94.accept(m76349a);
        C37113Xn1.EnumC9494b m76334p = this.f26311e.getValue().m76334p();
        Observable<Long> intervalRange = Observable.intervalRange(0L, 3L, 0L, 500L, TimeUnit.MILLISECONDS);
        final C5962q c5962q = new C5962q(vehicleDescriptor, data, m76334p);
        AbstractC23461c flatMapCompletable = intervalRange.flatMapCompletable(new InterfaceC23492o() { // from class: KI
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m92456x0;
                m92456x0 = C5939OI.m92456x0(Function1.this, obj);
                return m92456x0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "private fun initiatePCMU…  )\n        }\n      }\n  }");
        return flatMapCompletable;
    }

    /* renamed from: y0 */
    public final void m92454y0(byte[] bArr) {
        List<String> m14770b = C48457s70.m14770b(bArr);
        C41318g46.m40157g("BirdAirManager did not process BLE data: " + m14770b + "}", new Object[0]);
    }

    /* renamed from: z0 */
    public final byte m92452z0(int i) {
        return (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
    }
}
