package p000;

import co.bird.android.bluetooth.model.ScannedDevice;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.support.v18.scanner.ScanFilter;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a$\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006¨\u0006\f"}, m28432d2 = {"LYl5;", "Lno/nordicsemi/android/support/v18/scanner/ScanFilter;", "scanFilter", "Lorg/joda/time/DateTime;", "excludeResultsOlderThan", "b", "", "Lkotlin/Function1;", "Lco/bird/android/bluetooth/model/ScannedDevice;", "", "filters", C17296a.f69688o, "interface_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScannedDevices+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScannedDevices+.kt\nco/bird/android/bluetooth/util/ScannedDevices_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1#2:31\n766#3:32\n857#3:33\n1855#3,2:34\n858#3:36\n*S KotlinDebug\n*F\n+ 1 ScannedDevices+.kt\nco/bird/android/bluetooth/util/ScannedDevices_Kt\n*L\n20#1:32\n20#1:33\n21#1:34,2\n20#1:36\n*E\n"})
/* renamed from: Zl5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37567Zl5 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/bluetooth/model/ScannedDevice;", "device", "", C17296a.f69688o, "(Lco/bird/android/bluetooth/model/ScannedDevice;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zl5$a */
    /* loaded from: classes2.dex */
    public static final class C10370a extends Lambda implements Function1<ScannedDevice, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ DateTime f49192g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10370a(DateTime dateTime) {
            super(1);
            this.f49192g = dateTime;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(ScannedDevice device) {
            boolean z;
            Intrinsics.checkNotNullParameter(device, "device");
            if (device.m59106b().compareTo((ReadableInstant) this.f49192g) >= 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/bluetooth/model/ScannedDevice;", "device", "", C17296a.f69688o, "(Lco/bird/android/bluetooth/model/ScannedDevice;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zl5$b */
    /* loaded from: classes2.dex */
    public static final class C10371b extends Lambda implements Function1<ScannedDevice, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ ScanFilter f49193g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10371b(ScanFilter scanFilter) {
            super(1);
            this.f49193g = scanFilter;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(ScannedDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            return Boolean.valueOf(this.f49193g.m22449l(device.m59103e()));
        }
    }

    /* renamed from: a */
    public static final C37333Yl5 m72550a(C37333Yl5 c37333Yl5, List<? extends Function1<? super ScannedDevice, Boolean>> filters) {
        boolean z;
        Intrinsics.checkNotNullParameter(c37333Yl5, "<this>");
        Intrinsics.checkNotNullParameter(filters, "filters");
        List<ScannedDevice> arrayList = new ArrayList<>();
        for (Object obj : c37333Yl5.m74314b()) {
            ScannedDevice scannedDevice = (ScannedDevice) obj;
            Iterator<T> it = filters.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((Boolean) ((Function1) it.next()).invoke(scannedDevice)).booleanValue()) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return c37333Yl5.m74315a(arrayList);
    }

    public static /* synthetic */ C37333Yl5 applyScanFilters$default(C37333Yl5 c37333Yl5, ScanFilter scanFilter, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            scanFilter = null;
        }
        if ((i & 2) != 0) {
            dateTime = null;
        }
        return m72549b(c37333Yl5, scanFilter, dateTime);
    }

    /* renamed from: b */
    public static final C37333Yl5 m72549b(C37333Yl5 c37333Yl5, ScanFilter scanFilter, DateTime dateTime) {
        C10371b c10371b;
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(c37333Yl5, "<this>");
        C10370a c10370a = null;
        if (scanFilter != null) {
            c10371b = new C10371b(scanFilter);
        } else {
            c10371b = null;
        }
        if (dateTime != null) {
            c10370a = new C10370a(dateTime);
        }
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Function1[]{c10371b, c10370a});
        return m72550a(c37333Yl5, listOfNotNull);
    }
}
