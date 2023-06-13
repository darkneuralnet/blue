package co.bird.android.feature.coreinventory.scan;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.constant.VehicleInventoryAction;
import co.bird.android.model.wire.WireVehicleInventoryScan;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bA\u0010BJÎ\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0015HÖ\u0001J\u0013\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b'\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b*\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b(\u00101R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b3\u00104R.\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u00108\u001a\u0004\b+\u00109R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b!\u00101R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u001a\u0010\u0017\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010;\u001a\u0004\b%\u0010<R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006C"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/ConfirmExit;", "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;", "", "bulkMode", "enableMlKit", "enablePeripheralScanner", "showCodeInput", "showBluetooth", "showButton", "Lco/bird/android/model/constant/PartKind;", "part", "", "instructions", "Lco/bird/android/model/constant/VehicleInventoryAction;", "action", "", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "vehicleScans", "processEnabled", "warehouse", "", "loadingCount", "unprocessedCount", "", "error", "n", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;Lco/bird/android/model/constant/VehicleInventoryAction;Ljava/util/List;ZLjava/lang/String;IILjava/lang/Throwable;)Lco/bird/android/feature/coreinventory/scan/ConfirmExit;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "b", "g", "j", DateTokenConverter.CONVERTER_KEY, "h", "e", "f", "k", "Lco/bird/android/model/constant/PartKind;", "i", "()Lco/bird/android/model/constant/PartKind;", "Ljava/lang/String;", "()Ljava/lang/String;", "Lco/bird/android/model/constant/VehicleInventoryAction;", "getAction", "()Lco/bird/android/model/constant/VehicleInventoryAction;", "Ljava/util/List;", "l", "()Ljava/util/List;", "Z", "()Z", "m", "I", "()I", "o", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;Lco/bird/android/model/constant/VehicleInventoryAction;Ljava/util/List;ZLjava/lang/String;IILjava/lang/Throwable;)V", "core-inventory_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ConfirmExit implements CoreInventoryScanState {

    /* renamed from: a */
    public final Boolean f63775a;

    /* renamed from: b */
    public final Boolean f63776b;

    /* renamed from: c */
    public final Boolean f63777c;

    /* renamed from: d */
    public final Boolean f63778d;

    /* renamed from: e */
    public final Boolean f63779e;

    /* renamed from: f */
    public final Boolean f63780f;

    /* renamed from: g */
    public final PartKind f63781g;

    /* renamed from: h */
    public final String f63782h;

    /* renamed from: i */
    public final VehicleInventoryAction f63783i;

    /* renamed from: j */
    public final List<Pair<WireVehicleInventoryScan, Boolean>> f63784j;

    /* renamed from: k */
    public final boolean f63785k;

    /* renamed from: l */
    public final String f63786l;

    /* renamed from: m */
    public final int f63787m;

    /* renamed from: n */
    public final int f63788n;

    /* renamed from: o */
    public final Throwable f63789o;

    public ConfirmExit() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, 0, 0, null, 32767, null);
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanState
    /* renamed from: a */
    public String mo58262a() {
        return this.f63786l;
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanState
    /* renamed from: b */
    public int mo58261b() {
        return this.f63788n;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: c */
    public Boolean mo40320c() {
        return this.f63775a;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: d */
    public String mo40319d() {
        return this.f63782h;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: e */
    public Boolean mo40318e() {
        return this.f63779e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfirmExit) {
            ConfirmExit confirmExit = (ConfirmExit) obj;
            return Intrinsics.areEqual(this.f63775a, confirmExit.f63775a) && Intrinsics.areEqual(this.f63776b, confirmExit.f63776b) && Intrinsics.areEqual(this.f63777c, confirmExit.f63777c) && Intrinsics.areEqual(this.f63778d, confirmExit.f63778d) && Intrinsics.areEqual(this.f63779e, confirmExit.f63779e) && Intrinsics.areEqual(this.f63780f, confirmExit.f63780f) && this.f63781g == confirmExit.f63781g && Intrinsics.areEqual(this.f63782h, confirmExit.f63782h) && this.f63783i == confirmExit.f63783i && Intrinsics.areEqual(this.f63784j, confirmExit.f63784j) && this.f63785k == confirmExit.f63785k && Intrinsics.areEqual(this.f63786l, confirmExit.f63786l) && this.f63787m == confirmExit.f63787m && this.f63788n == confirmExit.f63788n && Intrinsics.areEqual(this.f63789o, confirmExit.f63789o);
        }
        return false;
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanState
    /* renamed from: f */
    public boolean mo58260f() {
        return this.f63785k;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: g */
    public Boolean mo40317g() {
        return this.f63776b;
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanState
    public VehicleInventoryAction getAction() {
        return this.f63783i;
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanState
    public Throwable getError() {
        return this.f63789o;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: h */
    public Boolean mo40316h() {
        return this.f63778d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Boolean bool = this.f63775a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f63776b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f63777c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f63778d;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f63779e;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f63780f;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        PartKind partKind = this.f63781g;
        int hashCode7 = (hashCode6 + (partKind == null ? 0 : partKind.hashCode())) * 31;
        String str = this.f63782h;
        int hashCode8 = (((((hashCode7 + (str == null ? 0 : str.hashCode())) * 31) + this.f63783i.hashCode()) * 31) + this.f63784j.hashCode()) * 31;
        boolean z = this.f63785k;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode8 + i) * 31;
        String str2 = this.f63786l;
        int hashCode9 = (((((i2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.f63787m)) * 31) + Integer.hashCode(this.f63788n)) * 31;
        Throwable th = this.f63789o;
        return hashCode9 + (th != null ? th.hashCode() : 0);
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: i */
    public PartKind mo40315i() {
        return this.f63781g;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: j */
    public Boolean mo40314j() {
        return this.f63777c;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: k */
    public Boolean mo40313k() {
        return this.f63780f;
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanState
    /* renamed from: l */
    public List<Pair<WireVehicleInventoryScan, Boolean>> mo58259l() {
        return this.f63784j;
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanState
    /* renamed from: m */
    public int mo58258m() {
        return this.f63787m;
    }

    /* renamed from: n */
    public final ConfirmExit m58384n(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str, VehicleInventoryAction action, List<Pair<WireVehicleInventoryScan, Boolean>> vehicleScans, boolean z, String str2, int i, int i2, Throwable th) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(vehicleScans, "vehicleScans");
        return new ConfirmExit(bool, bool2, bool3, bool4, bool5, bool6, partKind, str, action, vehicleScans, z, str2, i, i2, th);
    }

    public String toString() {
        Boolean bool = this.f63775a;
        Boolean bool2 = this.f63776b;
        Boolean bool3 = this.f63777c;
        Boolean bool4 = this.f63778d;
        Boolean bool5 = this.f63779e;
        Boolean bool6 = this.f63780f;
        PartKind partKind = this.f63781g;
        String str = this.f63782h;
        VehicleInventoryAction vehicleInventoryAction = this.f63783i;
        List<Pair<WireVehicleInventoryScan, Boolean>> list = this.f63784j;
        boolean z = this.f63785k;
        String str2 = this.f63786l;
        int i = this.f63787m;
        int i2 = this.f63788n;
        Throwable th = this.f63789o;
        return "ConfirmExit(bulkMode=" + bool + ", enableMlKit=" + bool2 + ", enablePeripheralScanner=" + bool3 + ", showCodeInput=" + bool4 + ", showBluetooth=" + bool5 + ", showButton=" + bool6 + ", part=" + partKind + ", instructions=" + str + ", action=" + vehicleInventoryAction + ", vehicleScans=" + list + ", processEnabled=" + z + ", warehouse=" + str2 + ", loadingCount=" + i + ", unprocessedCount=" + i2 + ", error=" + th + ")";
    }

    public ConfirmExit(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str, VehicleInventoryAction action, List<Pair<WireVehicleInventoryScan, Boolean>> vehicleScans, boolean z, String str2, int i, int i2, Throwable th) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(vehicleScans, "vehicleScans");
        this.f63775a = bool;
        this.f63776b = bool2;
        this.f63777c = bool3;
        this.f63778d = bool4;
        this.f63779e = bool5;
        this.f63780f = bool6;
        this.f63781g = partKind;
        this.f63782h = str;
        this.f63783i = action;
        this.f63784j = vehicleScans;
        this.f63785k = z;
        this.f63786l = str2;
        this.f63787m = i;
        this.f63788n = i2;
        this.f63789o = th;
    }

    public /* synthetic */ ConfirmExit(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str, VehicleInventoryAction vehicleInventoryAction, List list, boolean z, String str2, int i, int i2, Throwable th, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : bool, (i3 & 2) != 0 ? null : bool2, (i3 & 4) != 0 ? null : bool3, (i3 & 8) != 0 ? null : bool4, (i3 & 16) != 0 ? null : bool5, (i3 & 32) != 0 ? null : bool6, (i3 & 64) != 0 ? null : partKind, (i3 & 128) != 0 ? null : str, (i3 & 256) != 0 ? VehicleInventoryAction.UNKNOWN : vehicleInventoryAction, (i3 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i3 & 1024) != 0 ? true : z, (i3 & 2048) != 0 ? null : str2, (i3 & 4096) != 0 ? 0 : i, (i3 & 8192) == 0 ? i2 : 0, (i3 & 16384) != 0 ? null : th);
    }
}
