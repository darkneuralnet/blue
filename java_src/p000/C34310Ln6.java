package p000;

import android.bluetooth.BluetoothDevice;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Vehicle;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002R'\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LLn6;", "LKn6;", "Lco/bird/android/model/wire/WireBird;", "bird", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "", "forRide", "", "e", "b", "c", "Lco/bird/android/model/Vehicle;", "vehicle", DateTokenConverter.CONVERTER_KEY, "", "T0", C17296a.f69688o, "g", "LZ84;", "", "Lk66;", "Lkotlin/Lazy;", "f", "()LZ84;", "trackedBirds", "La94;", "La94;", "mutableTrackedBirds", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleTrackerManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleTrackerManagerImpl.kt\nco/bird/android/manager/bluetooth/VehicleTrackerManagerImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n37#2,2:65\n766#3:67\n857#3,2:68\n1747#3,3:70\n1747#3,3:73\n288#3,2:76\n*S KotlinDebug\n*F\n+ 1 VehicleTrackerManagerImpl.kt\nco/bird/android/manager/bluetooth/VehicleTrackerManagerImpl\n*L\n25#1:65,2\n36#1:67\n36#1:68,2\n40#1:70,3\n49#1:73,3\n60#1:76,2\n*E\n"})
/* renamed from: Ln6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34310Ln6 implements InterfaceC34076Kn6 {

    /* renamed from: a */
    public final Lazy f22070a;

    /* renamed from: b */
    public final C37791a94<List<C43710k66>> f22071b;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "Lk66;", "birds", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVehicleTrackerManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleTrackerManagerImpl.kt\nco/bird/android/manager/bluetooth/VehicleTrackerManagerImpl$stopTrackingAllRideBirds$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n766#2:65\n857#2,2:66\n*S KotlinDebug\n*F\n+ 1 VehicleTrackerManagerImpl.kt\nco/bird/android/manager/bluetooth/VehicleTrackerManagerImpl$stopTrackingAllRideBirds$2\n*L\n42#1:65\n42#1:66,2\n*E\n"})
    /* renamed from: Ln6$a */
    /* loaded from: classes4.dex */
    public static final class C5087a extends Lambda implements Function1<List<? extends C43710k66>, List<? extends C43710k66>> {

        /* renamed from: g */
        public static final C5087a f22072g = new C5087a();

        public C5087a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C43710k66> invoke(List<C43710k66> birds) {
            Intrinsics.checkNotNullParameter(birds, "birds");
            ArrayList arrayList = new ArrayList();
            for (Object obj : birds) {
                if (!((C43710k66) obj).m29282f()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lk66;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ln6$b */
    /* loaded from: classes4.dex */
    public static final class C5088b extends Lambda implements Function0<Z84<List<? extends C43710k66>>> {
        public C5088b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends C43710k66>> invoke2() {
            return Z84.f47888d.m73663b(C34310Ln6.this.f22071b);
        }
    }

    public C34310Ln6() {
        Lazy lazy;
        List emptyList;
        lazy = LazyKt__LazyJVMKt.lazy(new C5088b());
        this.f22070a = lazy;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f22071b = C37791a94.C10586a.createNonRedundant$default(c10586a, emptyList, null, 2, null);
    }

    @Override // p000.InterfaceC34076Kn6
    /* renamed from: T0 */
    public int mo96354T0() {
        return mo96348f().getValue().size();
    }

    @Override // p000.InterfaceC34076Kn6
    /* renamed from: a */
    public void mo96353a() {
        List<C43710k66> emptyList;
        if (!this.f22071b.getValue().isEmpty()) {
            C37791a94<List<C43710k66>> c37791a94 = this.f22071b;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            c37791a94.accept(emptyList);
        }
    }

    @Override // p000.InterfaceC34076Kn6
    /* renamed from: b */
    public void mo96352b(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        C37791a94<List<C43710k66>> c37791a94 = this.f22071b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c37791a94.getValue()) {
            if (!Intrinsics.areEqual(((C43710k66) obj).m29287a().getId(), bird.getId())) {
                arrayList.add(obj);
            }
        }
        c37791a94.accept(arrayList);
    }

    @Override // p000.InterfaceC34076Kn6
    /* renamed from: c */
    public void mo96351c() {
        List<C43710k66> value = this.f22071b.getValue();
        boolean z = false;
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C43710k66) it.next()).m29282f()) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.f22071b.m71837i(C5087a.f22072g);
        }
    }

    @Override // p000.InterfaceC34076Kn6
    /* renamed from: d */
    public boolean mo96350d(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        List<C43710k66> value = mo96348f().getValue();
        if ((value instanceof Collection) && value.isEmpty()) {
            return false;
        }
        for (C43710k66 c43710k66 : value) {
            if (c43710k66.m29284d().isSame(vehicle.getBird())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC34076Kn6
    /* renamed from: e */
    public void mo96349e(WireBird bird, BluetoothDevice bluetoothDevice, boolean z) {
        List<C43710k66> listOf;
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (m96347g(bird, bluetoothDevice)) {
            mo96352b(bird);
            C37791a94<List<C43710k66>> c37791a94 = this.f22071b;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(this.f22071b.getValue().toArray(new C43710k66[0]));
            spreadBuilder.add(new C43710k66(bird, bluetoothDevice, z));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C43710k66[spreadBuilder.size()]));
            c37791a94.accept(listOf);
        }
    }

    @Override // p000.InterfaceC34076Kn6
    /* renamed from: f */
    public Z84<List<C43710k66>> mo96348f() {
        return (Z84) this.f22070a.getValue();
    }

    /* renamed from: g */
    public final boolean m96347g(WireBird wireBird, BluetoothDevice bluetoothDevice) {
        Object obj;
        Iterator<T> it = mo96348f().getValue().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((C43710k66) obj).m29284d().getId(), wireBird.getId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C43710k66 c43710k66 = (C43710k66) obj;
        if (c43710k66 != null && (c43710k66.m29283e() != null || bluetoothDevice == null)) {
            return false;
        }
        return true;
    }
}
