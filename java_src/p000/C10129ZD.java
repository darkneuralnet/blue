package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import co.bird.android.model.BleScanResult;
import co.bird.android.model.wire.WireLocation;
import co.bird.api.request.BleScan;
import co.bird.api.request.BleScanReportBody;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.polidea.rxandroidble2.scan.ScanFilter;
import com.polidea.rxandroidble2.scan.ScanSettings;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import io.reactivex.subjects.C24560e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.AbstractC39873de5;
import p000.C10129ZD;
import p000.InterfaceC5225MD;
@Metadata(m28433d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 L2\u00020\u0001:\u0001%BI\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020$\u0012\b\b\u0002\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002J\u0012\u0010\u0014\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0002R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00102\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\t0\t0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00106\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\t0\t038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010:\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00020\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R8\u0010@\u001a&\u0012\f\u0012\n /*\u0004\u0018\u00010\t0\t /*\u0012\u0012\f\u0012\n /*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006M"}, m28432d2 = {"LZD;", "LMD;", "", "scanMode", "", "includeEphemeralCacheResults", "", "bleTrigger", "Lio/reactivex/Observable;", "LTk5;", C17296a.f69688o, "LMD$b;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "Lco/bird/android/model/BleScanResult;", "Lco/bird/api/request/BleScan;", "E", "LLN5;", "x", "Landroid/content/Context;", "Landroid/content/Context;", "appContext", "LEa;", "LEa;", "analyticsManager", "Lde5;", "Lde5;", "rxBleClient", "LhY;", "LhY;", "bluetoothTraceClient", "Lgl;", "Lgl;", "preference", "LDX;", "f", "LDX;", "birdBluetoothManager", "g", "Ljava/lang/String;", "Landroid/bluetooth/BluetoothManager;", "h", "Landroid/bluetooth/BluetoothManager;", "bluetoothManager", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "i", "Lio/reactivex/subjects/d;", "scanSubject", "Lio/reactivex/subjects/e;", "j", "Lio/reactivex/subjects/e;", "scanCache", "Lio/reactivex/subjects/a;", "k", "Lio/reactivex/subjects/a;", "currentScanMode", "l", "LLN5;", "currentScanModes", "m", "Lio/reactivex/Observable;", "scanObservable", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "", "n", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "mainThreadScanningTrackingQueue", "LTq4;", "reactiveConfig", "Lio/reactivex/E;", "timeScheduler", "<init>", "(Landroid/content/Context;LTq4;LEa;Lde5;LhY;Lgl;LDX;Lio/reactivex/E;)V", "o", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseRxBleManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRxBleManagerImpl.kt\nco/bird/android/manager/bluetooth/BaseRxBleManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,287:1\n180#2:288\n180#2:289\n*S KotlinDebug\n*F\n+ 1 BaseRxBleManagerImpl.kt\nco/bird/android/manager/bluetooth/BaseRxBleManagerImpl\n*L\n138#1:288\n142#1:289\n*E\n"})
/* renamed from: ZD */
/* loaded from: classes4.dex */
public final class C10129ZD implements InterfaceC5225MD {

    /* renamed from: o */
    public static final C10136f f47937o = new C10136f(null);

    /* renamed from: p */
    public static final ScanFilter f47938p = new ScanFilter.C18577b().m45844a();

    /* renamed from: a */
    public final Context f47939a;

    /* renamed from: b */
    public final InterfaceC1880Ea f47940b;

    /* renamed from: c */
    public final AbstractC39873de5 f47941c;

    /* renamed from: d */
    public InterfaceC22677hY f47942d;

    /* renamed from: e */
    public final C22454gl f47943e;

    /* renamed from: f */
    public final InterfaceC1510DX f47944f;

    /* renamed from: g */
    public String f47945g;

    /* renamed from: h */
    public final BluetoothManager f47946h;

    /* renamed from: i */
    public final C24558d<C36154Tk5> f47947i;

    /* renamed from: j */
    public final C24560e<C36154Tk5> f47948j;

    /* renamed from: k */
    public final C24552a<Integer> f47949k;

    /* renamed from: l */
    public final LN5<Integer> f47950l;

    /* renamed from: m */
    public final Observable<C36154Tk5> f47951m;

    /* renamed from: n */
    public final ConcurrentLinkedQueue<Long> f47952n;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LTk5;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lco/bird/android/model/BleScanResult;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/BleScanResult;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZD$b */
    /* loaded from: classes4.dex */
    public static final class C10131b extends Lambda implements Function1<Pair<? extends C36154Tk5, ? extends Boolean>, BleScanResult> {
        public C10131b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BleScanResult invoke(Pair<? extends C36154Tk5, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C36154Tk5 scanResult = pair.component1();
            Intrinsics.checkNotNullExpressionValue(scanResult, "scanResult");
            return new BleScanResult(scanResult, C10129ZD.this.f47943e.m37667W());
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052(\u0010\u0004\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "Lco/bird/android/model/BleScanResult;", "kotlin.jvm.PlatformType", "", "bleScanResults", "Lio/reactivex/u;", "LHM4;", "", "b", "(Ljava/util/List;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseRxBleManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRxBleManagerImpl.kt\nco/bird/android/manager/bluetooth/BaseRxBleManagerImpl$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,287:1\n1655#2,8:288\n1549#2:296\n1620#2,3:297\n*S KotlinDebug\n*F\n+ 1 BaseRxBleManagerImpl.kt\nco/bird/android/manager/bluetooth/BaseRxBleManagerImpl$3\n*L\n125#1:288,8\n129#1:296\n129#1:297,3\n*E\n"})
    /* renamed from: ZD$c */
    /* loaded from: classes4.dex */
    public static final class C10132c extends Lambda implements Function1<List<BleScanResult>, InterfaceC24574u<? extends HM4<Unit>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ZD$c$a */
        /* loaded from: classes4.dex */
        public static final class C10133a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C10133a f47956g = new C10133a();

            public C10133a() {
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

        public C10132c() {
            super(1);
        }

        /* renamed from: c */
        public static final void m73577c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends HM4<Unit>> invoke(List<BleScanResult> bleScanResults) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(bleScanResults, "bleScanResults");
            HashSet hashSet = new HashSet();
            ArrayList<BleScanResult> arrayList = new ArrayList();
            for (Object obj : bleScanResults) {
                if (hashSet.add(((BleScanResult) obj).getScanResult().m83016a().mo17280e())) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return AbstractC24507p.m32024u();
            }
            C10129ZD c10129zd = C10129ZD.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (BleScanResult it : arrayList) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                arrayList2.add(c10129zd.m73607E(it));
            }
            AbstractC23442F<HM4<Unit>> m36222a = C10129ZD.this.f47942d.m36222a(new BleScanReportBody(arrayList2, C10129ZD.this.f47945g));
            final C10133a c10133a = C10133a.f47956g;
            return m36222a.m33106t(new InterfaceC23484g() { // from class: aE
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj2) {
                    C10129ZD.C10132c.m73577c(Function1.this, obj2);
                }
            }).m33125j0().m32065J();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZD$d */
    /* loaded from: classes4.dex */
    public static final class C10134d extends Lambda implements Function1<Long, Unit> {
        public C10134d() {
            super(1);
        }

        /* renamed from: a */
        public final void m73576a(Long l) {
            Iterator it = C10129ZD.this.f47952n.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "mainThreadScanningTrackingQueue.iterator()");
            long j = 0;
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "currentValues.next()");
                j += ((Number) next).longValue();
                it.remove();
            }
            if (j > 0) {
                C10129ZD.this.f47940b.mo55905y(new C10286ZX(null, null, null, AbstractComponentTracker.LINGERING_TIMEOUT, j, j / 10000.0d, "BaseRxBleManagerImpl", 7, null));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m73576a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZD$e */
    /* loaded from: classes4.dex */
    public static final class C10135e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C10135e f47958g = new C10135e();

        public C10135e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error in stream reporting main thread operations", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u001c\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, m28432d2 = {"LZD$f;", "", "", "DEFAULT_SCAN_MODE", "I", "", "HEADLESS_SCAN_BUFFER_MS", "J", "SCAN_CACHE_MAX_SIZE", "Lcom/polidea/rxandroidble2/scan/ScanFilter;", "kotlin.jvm.PlatformType", "SCAN_FILTER", "Lcom/polidea/rxandroidble2/scan/ScanFilter;", "SCAN_RESULT_CACHE_TTL_MS", "SCAN_TIME_ON_MAIN_THREAD_REPORTING_PERIOD_MS", "SOLEBE_COMPANY_ID", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ZD$f */
    /* loaded from: classes4.dex */
    public static final class C10136f {
        public /* synthetic */ C10136f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10136f() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lde5$a;", TransferTable.COLUMN_STATE, "LMD$b;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lde5$a;)LMD$b;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZD$g */
    /* loaded from: classes4.dex */
    public static final class C10137g extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, InterfaceC5225MD.EnumC5227b> {

        /* renamed from: g */
        public static final C10137g f47959g = new C10137g();

        public C10137g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC5225MD.EnumC5227b invoke(AbstractC39873de5.EnumC19828a state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return C12325bE.m64811e(state);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "scanMode", "Lio/reactivex/B;", "LTk5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZD$h */
    /* loaded from: classes4.dex */
    public static final class C10138h extends Lambda implements Function1<Integer, InterfaceC23434B<? extends C36154Tk5>> {
        public C10138h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends C36154Tk5> invoke(Integer scanMode) {
            Intrinsics.checkNotNullParameter(scanMode, "scanMode");
            return C10129ZD.this.f47941c.mo33639e(new ScanSettings.C18579b().m45822b(scanMode.intValue()).m45823a(), C10129ZD.f47938p);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZD$i */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C10139i extends FunctionReferenceImpl implements Function1<C36154Tk5, Unit> {
        public C10139i(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m73573a(C36154Tk5 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36154Tk5 c36154Tk5) {
            m73573a(c36154Tk5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZD$j */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C10140j extends FunctionReferenceImpl implements Function1<C36154Tk5, Unit> {
        public C10140j(Object obj) {
            super(1, obj, C24560e.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m73572a(C36154Tk5 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24560e) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36154Tk5 c36154Tk5) {
            m73572a(c36154Tk5);
            return Unit.INSTANCE;
        }
    }

    public C10129ZD(Context appContext, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, AbstractC39873de5 rxBleClient, InterfaceC22677hY bluetoothTraceClient, C22454gl preference, InterfaceC1510DX birdBluetoothManager, AbstractC23437E timeScheduler) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(bluetoothTraceClient, "bluetoothTraceClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(birdBluetoothManager, "birdBluetoothManager");
        Intrinsics.checkNotNullParameter(timeScheduler, "timeScheduler");
        this.f47939a = appContext;
        this.f47940b = analyticsManager;
        this.f47941c = rxBleClient;
        this.f47942d = bluetoothTraceClient;
        this.f47943e = preference;
        this.f47944f = birdBluetoothManager;
        Object systemService = appContext.getSystemService("bluetooth");
        this.f47946h = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
        C24558d<C36154Tk5> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<ScanResult>()");
        this.f47947i = m31902e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C24560e<C36154Tk5> m31894g = C24560e.m31894g(AbstractComponentTracker.LINGERING_TIMEOUT, timeUnit, timeScheduler, 128);
        Intrinsics.checkNotNullExpressionValue(m31894g, "createWithTimeAndSize<Sc…ler, SCAN_CACHE_MAX_SIZE)");
        this.f47948j = m31894g;
        C24552a<Integer> m31921g = C24552a.m31921g(2);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(DEFAULT_SCAN_MODE)");
        this.f47949k = m31921g;
        this.f47950l = new LN5<>();
        Observable<Integer> distinctUntilChanged = m31921g.distinctUntilChanged();
        final C10138h c10138h = new C10138h();
        Observable retryWhen = distinctUntilChanged.switchMap(new InterfaceC23492o() { // from class: ND
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m73610B;
                m73610B = C10129ZD.m73610B(Function1.this, obj);
                return m73610B;
            }
        }).retryWhen(new C48244rl5());
        final C10139i c10139i = new C10139i(m31902e);
        Observable doOnNext = retryWhen.doOnNext(new InterfaceC23484g() { // from class: QD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C10129ZD.m73609C(Function1.this, obj);
            }
        });
        final C10140j c10140j = new C10140j(m31894g);
        this.f47951m = doOnNext.doOnNext(new InterfaceC23484g() { // from class: RD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C10129ZD.m73608D(Function1.this, obj);
            }
        }).share();
        this.f47952n = new ConcurrentLinkedQueue<>();
        Observable observeOn = C24527f.m31950a(m31902e, reactiveConfig.m82433x3()).observeOn(C24542a.m31932c());
        final C10130a c10130a = new C10130a();
        Observable filter = observeOn.filter(new InterfaceC23494q() { // from class: SD
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m73589r;
                m73589r = C10129ZD.m73589r(Function1.this, obj);
                return m73589r;
            }
        });
        final C10131b c10131b = new C10131b();
        Observable buffer = filter.map(new InterfaceC23492o() { // from class: TD
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                BleScanResult m73588s;
                m73588s = C10129ZD.m73588s(Function1.this, obj);
                return m73588s;
            }
        }).buffer(5000L, timeUnit);
        final C10132c c10132c = new C10132c();
        Observable subscribeOn = buffer.flatMapMaybe(new InterfaceC23492o() { // from class: UD
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m73587t;
                m73587t = C10129ZD.m73587t(Function1.this, obj);
                return m73587t;
            }
        }).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "scanSubject\n      .withL…scribeOn(Schedulers.io())");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = subscribeOn.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
        Observable<Long> interval = Observable.interval(AbstractComponentTracker.LINGERING_TIMEOUT, timeUnit);
        Intrinsics.checkNotNullExpressionValue(interval, "interval(SCAN_TIME_ON_MA…S, TimeUnit.MILLISECONDS)");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = interval.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10134d c10134d = new C10134d();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: VD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C10129ZD.m73586u(Function1.this, obj);
            }
        };
        final C10135e c10135e = C10135e.f47958g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: WD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C10129ZD.m73585v(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final void m73611A(C10129ZD this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f47950l) {
            LN5<Integer> ln5 = this$0.f47950l;
            Integer m96983k = ln5.m96983k(i);
            int i2 = 1;
            if (m96983k != null) {
                i2 = 1 + m96983k.intValue();
            }
            ln5.m96978p(i, Integer.valueOf(i2));
            this$0.f47949k.onNext(Integer.valueOf(this$0.m73583x(this$0.f47950l)));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: B */
    public static final InterfaceC23434B m73610B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m73609C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m73608D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final boolean m73589r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: s */
    public static final BleScanResult m73588s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BleScanResult) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC24574u m73587t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m73586u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m73585v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC5225MD.EnumC5227b m73584w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC5225MD.EnumC5227b) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC23434B m73582y(Observable observable) {
        return observable;
    }

    /* renamed from: z */
    public static final void m73581z(C10129ZD this$0, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f47950l) {
            LN5<Integer> ln5 = this$0.f47950l;
            Integer m96983k = ln5.m96983k(i);
            if (m96983k != null) {
                i2 = m96983k.intValue() - 1;
            } else {
                i2 = 0;
            }
            ln5.m96978p(i, Integer.valueOf(i2));
            this$0.f47949k.onNext(Integer.valueOf(this$0.m73583x(this$0.f47950l)));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: E */
    public final BleScan m73607E(BleScanResult bleScanResult) {
        int m83015b = bleScanResult.getScanResult().m83015b();
        String m80922c = C36388Uk5.m80922c(bleScanResult.getScanResult());
        List<UUID> m27819a = new C25620l8().m27819a(bleScanResult.getScanResult().m83014c().mo106631a());
        String m80933R = C36388Uk5.m80933R(bleScanResult.getScanResult());
        String mo17280e = bleScanResult.getScanResult().m83016a().mo17280e();
        WireLocation location = bleScanResult.getLocation();
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        Intrinsics.checkNotNullExpressionValue(m27819a, "extractUUIDs(scanResult.scanRecord.bytes)");
        return new BleScan(m83015b, m80922c, now, m27819a, m80933R, mo17280e, location);
    }

    @Override // p000.InterfaceC5225MD
    /* renamed from: a */
    public Observable<C36154Tk5> mo73606a(final int i, boolean z, String str) {
        final Observable<C36154Tk5> observable;
        this.f47945g = str;
        if (z) {
            observable = Observable.merge(this.f47951m.ignoreElements().m33043l(Observable.never()), this.f47948j);
        } else {
            observable = this.f47951m;
        }
        AbstractC23461c m33079G = AbstractC23461c.m33079G(new InterfaceC23478a() { // from class: XD
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C10129ZD.m73611A(C10129ZD.this, i);
            }
        });
        Observable defer = Observable.defer(new Callable() { // from class: YD
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23434B m73582y;
                m73582y = C10129ZD.m73582y(Observable.this);
                return m73582y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(defer, "defer { scanResultsObservable }");
        Observable<C36154Tk5> doFinally = m33079G.m33043l(C7866TX.m83468l(defer, this.f47944f, EnumC38707bi3.SCAN_LEGACY)).doFinally(new InterfaceC23478a() { // from class: OD
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C10129ZD.m73581z(C10129ZD.this, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doFinally, "fromAction {\n      // Fi…Mode())\n        }\n      }");
        return doFinally;
    }

    @Override // p000.InterfaceC5225MD
    /* renamed from: b */
    public InterfaceC5225MD.EnumC5227b mo73605b() {
        AbstractC39873de5.EnumC19828a mo33641c = this.f47941c.mo33641c();
        Intrinsics.checkNotNullExpressionValue(mo33641c, "rxBleClient.state");
        return C12325bE.m64811e(mo33641c);
    }

    @Override // p000.InterfaceC5225MD
    /* renamed from: c */
    public Observable<InterfaceC5225MD.EnumC5227b> mo73604c() {
        Observable<AbstractC39873de5.EnumC19828a> mo33640d = this.f47941c.mo33640d();
        final C10137g c10137g = C10137g.f47959g;
        Observable map = mo33640d.map(new InterfaceC23492o() { // from class: PD
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC5225MD.EnumC5227b m73584w;
                m73584w = C10129ZD.m73584w(Function1.this, obj);
                return m73584w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "rxBleClient.observeState…tate -> state.toState() }");
        return map;
    }

    @Override // p000.InterfaceC5225MD
    /* renamed from: d */
    public boolean mo73603d() {
        BluetoothManager bluetoothManager;
        BluetoothAdapter adapter;
        if (NA0.m94303a(this.f47939a, "android.permission.BLUETOOTH_CONNECT") != 0 || (bluetoothManager = this.f47946h) == null || (adapter = bluetoothManager.getAdapter()) == null || !adapter.enable()) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC5225MD
    /* renamed from: e */
    public boolean mo73602e() {
        BluetoothManager bluetoothManager;
        BluetoothAdapter adapter;
        if (NA0.m94303a(this.f47939a, "android.permission.BLUETOOTH_CONNECT") != 0 || (bluetoothManager = this.f47946h) == null || (adapter = bluetoothManager.getAdapter()) == null || !adapter.disable()) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final int m73583x(LN5<Integer> ln5) {
        int size = ln5.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            Integer m96975t = ln5.m96975t(i2);
            Intrinsics.checkNotNullExpressionValue(m96975t, "this.valueAt(i)");
            if (m96975t.intValue() > 0 && ln5.m96979o(i2) > i) {
                i = ln5.m96979o(i2);
            }
        }
        if (i <= Integer.MIN_VALUE) {
            return 2;
        }
        return i;
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "LTk5;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZD$a */
    /* loaded from: classes4.dex */
    public static final class C10130a extends Lambda implements Function1<Pair<? extends C36154Tk5, ? extends Boolean>, Boolean> {
        public C10130a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends C36154Tk5, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C36154Tk5 scanResult = pair.component1();
            Boolean enableScanReporting = pair.component2();
            long currentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullExpressionValue(scanResult, "scanResult");
            boolean m80946E = C36388Uk5.m80946E(scanResult);
            boolean m80937N = C36388Uk5.m80937N(scanResult);
            long currentTimeMillis2 = System.currentTimeMillis();
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                C10129ZD.this.f47952n.add(Long.valueOf(currentTimeMillis2 - currentTimeMillis));
            }
            Intrinsics.checkNotNullExpressionValue(enableScanReporting, "enableScanReporting");
            return Boolean.valueOf(enableScanReporting.booleanValue() && (m80946E || m80937N));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends C36154Tk5, ? extends Boolean> pair) {
            return invoke2((Pair<? extends C36154Tk5, Boolean>) pair);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C10129ZD(Context context, C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, AbstractC39873de5 abstractC39873de5, InterfaceC22677hY interfaceC22677hY, C22454gl c22454gl, InterfaceC1510DX interfaceC1510DX, AbstractC23437E abstractC23437E, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, c36207Tq4, interfaceC1880Ea, abstractC39873de5, interfaceC22677hY, c22454gl, interfaceC1510DX, r10);
        AbstractC23437E abstractC23437E2;
        if ((i & 128) != 0) {
            AbstractC23437E m31934a = C24542a.m31934a();
            Intrinsics.checkNotNullExpressionValue(m31934a, "computation()");
            abstractC23437E2 = m31934a;
        } else {
            abstractC23437E2 = abstractC23437E;
        }
    }
}
