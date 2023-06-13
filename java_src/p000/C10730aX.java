package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bluetooth.model.ScannedDevice;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J2\u0010\f\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\nJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u0018R#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\u001a8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LaX;", "", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "scanResult", "", C17296a.f69688o, "", "scanResults", "", "clearStoreFirst", "Lkotlin/Function1;", "filter", "c", "b", "T", "", "", "n", "e", "Lco/bird/android/bluetooth/model/ScannedDevice;", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "devices", "I", "maxDevices", "LGX2;", "LGX2;", "getData", "()LGX2;", MessageExtension.FIELD_DATA, "<init>", "()V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBluetoothDeviceStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothDeviceStore.kt\nco/bird/android/bluetooth/api/BluetoothDeviceStore\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n230#2,5:89\n230#2,5:96\n230#2,5:111\n1855#3,2:94\n288#3,2:101\n350#3,7:103\n1#4:110\n*S KotlinDebug\n*F\n+ 1 BluetoothDeviceStore.kt\nco/bird/android/bluetooth/api/BluetoothDeviceStore\n*L\n24#1:89,5\n42#1:96,5\n60#1:111,5\n36#1:94,2\n47#1:101,2\n48#1:103,7\n*E\n"})
/* renamed from: aX */
/* loaded from: classes2.dex */
public final class C10730aX {

    /* renamed from: d */
    public static final C10731a f50611d = new C10731a(null);

    /* renamed from: a */
    public final List<ScannedDevice> f50612a;

    /* renamed from: b */
    public final int f50613b;

    /* renamed from: c */
    public final GX2<List<ScannedDevice>> f50614c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LaX$a;", "", "", "DEFAULT_MAX_DEVICES", "I", "PRUNE_STRATEGY_THRESHOLD", "<init>", "()V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: aX$a */
    /* loaded from: classes2.dex */
    public static final class C10731a {
        public /* synthetic */ C10731a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10731a() {
        }
    }

    public C10730aX() {
        ArrayList arrayList = new ArrayList();
        this.f50612a = arrayList;
        this.f50613b = 500;
        this.f50614c = C50405vP5.m8742a(arrayList);
    }

    public static /* synthetic */ boolean addNewDevices$default(C10730aX c10730aX, List list, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c10730aX.m71252c(list, z, function1);
    }

    /* renamed from: a */
    public final void m71254a(ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        m71253b(scanResult);
        GX2<List<ScannedDevice>> gx2 = this.f50614c;
        do {
        } while (!gx2.compareAndSet(gx2.getValue(), this.f50612a));
    }

    /* renamed from: b */
    public final void m71253b(ScanResult scanResult) {
        Integer num;
        Object obj;
        Iterator<T> it = this.f50612a.iterator();
        while (true) {
            num = null;
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((ScannedDevice) obj).m59105c(), scanResult.m22434a().getAddress())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ScannedDevice scannedDevice = (ScannedDevice) obj;
        boolean z = false;
        if (scannedDevice != null) {
            Iterator<ScannedDevice> it2 = this.f50612a.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.areEqual(it2.next().m59105c(), scanResult.m22434a().getAddress())) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (this.f50612a.set(i, scannedDevice.m59102g(scanResult)) != null) {
                return;
            }
        }
        this.f50612a.add(C12403bX.m64485a(scanResult));
        Integer valueOf = Integer.valueOf(this.f50612a.size() - this.f50613b);
        if (valueOf.intValue() > 0) {
            z = true;
        }
        if (z) {
            num = valueOf;
        }
        if (num != null) {
            m71250e(this.f50612a, num.intValue());
        }
        Unit unit = Unit.INSTANCE;
    }

    /* renamed from: c */
    public final boolean m71252c(List<ScanResult> scanResults, boolean z, Function1<? super ScanResult, Boolean> filter) {
        Intrinsics.checkNotNullParameter(scanResults, "scanResults");
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (z) {
            this.f50612a.clear();
        }
        boolean z2 = false;
        for (ScanResult scanResult : scanResults) {
            if (filter.invoke(scanResult).booleanValue()) {
                m71253b(scanResult);
                z2 = true;
            }
        }
        GX2<List<ScannedDevice>> gx2 = this.f50614c;
        do {
        } while (!gx2.compareAndSet(gx2.getValue(), this.f50612a));
        return z2;
    }

    /* renamed from: d */
    public final List<ScannedDevice> m71251d() {
        return this.f50612a;
    }

    /* renamed from: e */
    public final <T> List<T> m71250e(List<T> list, int i) {
        List takeLast;
        if (i > 40) {
            takeLast = CollectionsKt___CollectionsKt.takeLast(list, list.size() - i);
            list.clear();
            list.addAll(takeLast);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                CollectionsKt__MutableCollectionsKt.removeFirstOrNull(list);
            }
        }
        return list;
    }
}
