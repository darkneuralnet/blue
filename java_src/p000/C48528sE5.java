package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bluetooth.model.ScannedDevice;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.constant.SmartlockVendor;
import co.bird.android.model.persistence.Bird;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bI\u0010JJÊ\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b-\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b5\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b6\u0010?\u001a\u0004\b7\u0010@R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b9\u0010A\u001a\u0004\b%\u0010BR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b'\u0010C\u001a\u0004\b)\u0010DR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\bE\u00104R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u0010F\u001a\u0004\b1\u0010GR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bH\u0010*\u001a\u0004\b;\u0010,¨\u0006K"}, m28432d2 = {"LsE5;", "", "Lco/bird/android/bluetooth/model/ScannedDevice;", "scannedDevice", "LCF5;", "type", "", "macAddress", "", "isConnected", "", "version", "id", "tokenRequest", "", "tokenRequests", "physicalLockId", "Lco/bird/android/model/constant/SmartlockVendor;", "vendor", "Lco/bird/android/model/constant/PhysicalLockPurpose;", "purpose", "Lco/bird/android/model/persistence/Bird;", "bird", "LtE5;", CoreConstants.CONTEXT_SCOPE_VALUE, "batteryLevel", "locked", "rideId", C17296a.f69688o, "(Lco/bird/android/bluetooth/model/ScannedDevice;LCF5;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/constant/SmartlockVendor;Lco/bird/android/model/constant/PhysicalLockPurpose;Lco/bird/android/model/persistence/Bird;LtE5;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)LsE5;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/bluetooth/model/ScannedDevice;", "j", "()Lco/bird/android/bluetooth/model/ScannedDevice;", "b", "LCF5;", "m", "()LCF5;", "c", "Ljava/lang/String;", "f", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Z", "o", "()Z", "e", "Ljava/lang/Integer;", "getVersion", "()Ljava/lang/Integer;", "g", "k", "h", "Ljava/util/List;", "l", "()Ljava/util/List;", "i", "Lco/bird/android/model/constant/SmartlockVendor;", "n", "()Lco/bird/android/model/constant/SmartlockVendor;", "Lco/bird/android/model/constant/PhysicalLockPurpose;", "()Lco/bird/android/model/constant/PhysicalLockPurpose;", "Lco/bird/android/model/persistence/Bird;", "()Lco/bird/android/model/persistence/Bird;", "LtE5;", "()LtE5;", "getBatteryLevel", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "p", "<init>", "(Lco/bird/android/bluetooth/model/ScannedDevice;LCF5;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/constant/SmartlockVendor;Lco/bird/android/model/constant/PhysicalLockPurpose;Lco/bird/android/model/persistence/Bird;LtE5;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sE5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48528sE5 {

    /* renamed from: a */
    public final ScannedDevice f108494a;

    /* renamed from: b */
    public final CF5 f108495b;

    /* renamed from: c */
    public final String f108496c;

    /* renamed from: d */
    public final boolean f108497d;

    /* renamed from: e */
    public final Integer f108498e;

    /* renamed from: f */
    public final String f108499f;

    /* renamed from: g */
    public final String f108500g;

    /* renamed from: h */
    public final List<String> f108501h;

    /* renamed from: i */
    public final String f108502i;

    /* renamed from: j */
    public final SmartlockVendor f108503j;

    /* renamed from: k */
    public final PhysicalLockPurpose f108504k;

    /* renamed from: l */
    public final Bird f108505l;

    /* renamed from: m */
    public final EnumC49121tE5 f108506m;

    /* renamed from: n */
    public final Integer f108507n;

    /* renamed from: o */
    public final Boolean f108508o;

    /* renamed from: p */
    public final String f108509p;

    public C48528sE5(ScannedDevice scannedDevice, CF5 type, String macAddress, boolean z, Integer num, String id, String str, List<String> list, String str2, SmartlockVendor smartlockVendor, PhysicalLockPurpose physicalLockPurpose, Bird bird, EnumC49121tE5 context, Integer num2, Boolean bool, String str3) {
        Intrinsics.checkNotNullParameter(scannedDevice, "scannedDevice");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f108494a = scannedDevice;
        this.f108495b = type;
        this.f108496c = macAddress;
        this.f108497d = z;
        this.f108498e = num;
        this.f108499f = id;
        this.f108500g = str;
        this.f108501h = list;
        this.f108502i = str2;
        this.f108503j = smartlockVendor;
        this.f108504k = physicalLockPurpose;
        this.f108505l = bird;
        this.f108506m = context;
        this.f108507n = num2;
        this.f108508o = bool;
        this.f108509p = str3;
    }

    /* renamed from: a */
    public final C48528sE5 m14514a(ScannedDevice scannedDevice, CF5 type, String macAddress, boolean z, Integer num, String id, String str, List<String> list, String str2, SmartlockVendor smartlockVendor, PhysicalLockPurpose physicalLockPurpose, Bird bird, EnumC49121tE5 context, Integer num2, Boolean bool, String str3) {
        Intrinsics.checkNotNullParameter(scannedDevice, "scannedDevice");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(context, "context");
        return new C48528sE5(scannedDevice, type, macAddress, z, num, id, str, list, str2, smartlockVendor, physicalLockPurpose, bird, context, num2, bool, str3);
    }

    /* renamed from: b */
    public final Bird m14513b() {
        return this.f108505l;
    }

    /* renamed from: c */
    public final EnumC49121tE5 m14512c() {
        return this.f108506m;
    }

    /* renamed from: d */
    public final String m14511d() {
        return this.f108499f;
    }

    /* renamed from: e */
    public final Boolean m14510e() {
        return this.f108508o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C48528sE5) {
            C48528sE5 c48528sE5 = (C48528sE5) obj;
            return Intrinsics.areEqual(this.f108494a, c48528sE5.f108494a) && this.f108495b == c48528sE5.f108495b && Intrinsics.areEqual(this.f108496c, c48528sE5.f108496c) && this.f108497d == c48528sE5.f108497d && Intrinsics.areEqual(this.f108498e, c48528sE5.f108498e) && Intrinsics.areEqual(this.f108499f, c48528sE5.f108499f) && Intrinsics.areEqual(this.f108500g, c48528sE5.f108500g) && Intrinsics.areEqual(this.f108501h, c48528sE5.f108501h) && Intrinsics.areEqual(this.f108502i, c48528sE5.f108502i) && this.f108503j == c48528sE5.f108503j && this.f108504k == c48528sE5.f108504k && Intrinsics.areEqual(this.f108505l, c48528sE5.f108505l) && this.f108506m == c48528sE5.f108506m && Intrinsics.areEqual(this.f108507n, c48528sE5.f108507n) && Intrinsics.areEqual(this.f108508o, c48528sE5.f108508o) && Intrinsics.areEqual(this.f108509p, c48528sE5.f108509p);
        }
        return false;
    }

    /* renamed from: f */
    public final String m14509f() {
        return this.f108496c;
    }

    /* renamed from: g */
    public final String m14508g() {
        return this.f108502i;
    }

    /* renamed from: h */
    public final PhysicalLockPurpose m14507h() {
        return this.f108504k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f108494a.hashCode() * 31) + this.f108495b.hashCode()) * 31) + this.f108496c.hashCode()) * 31;
        boolean z = this.f108497d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Integer num = this.f108498e;
        int hashCode2 = (((i2 + (num == null ? 0 : num.hashCode())) * 31) + this.f108499f.hashCode()) * 31;
        String str = this.f108500g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.f108501h;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f108502i;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SmartlockVendor smartlockVendor = this.f108503j;
        int hashCode6 = (hashCode5 + (smartlockVendor == null ? 0 : smartlockVendor.hashCode())) * 31;
        PhysicalLockPurpose physicalLockPurpose = this.f108504k;
        int hashCode7 = (hashCode6 + (physicalLockPurpose == null ? 0 : physicalLockPurpose.hashCode())) * 31;
        Bird bird = this.f108505l;
        int hashCode8 = (((hashCode7 + (bird == null ? 0 : bird.hashCode())) * 31) + this.f108506m.hashCode()) * 31;
        Integer num2 = this.f108507n;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f108508o;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f108509p;
        return hashCode10 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m14506i() {
        return this.f108509p;
    }

    /* renamed from: j */
    public final ScannedDevice m14505j() {
        return this.f108494a;
    }

    /* renamed from: k */
    public final String m14504k() {
        return this.f108500g;
    }

    /* renamed from: l */
    public final List<String> m14503l() {
        return this.f108501h;
    }

    /* renamed from: m */
    public final CF5 m14502m() {
        return this.f108495b;
    }

    /* renamed from: n */
    public final SmartlockVendor m14501n() {
        return this.f108503j;
    }

    /* renamed from: o */
    public final boolean m14500o() {
        return this.f108497d;
    }

    public String toString() {
        ScannedDevice scannedDevice = this.f108494a;
        CF5 cf5 = this.f108495b;
        String str = this.f108496c;
        boolean z = this.f108497d;
        Integer num = this.f108498e;
        String str2 = this.f108499f;
        String str3 = this.f108500g;
        List<String> list = this.f108501h;
        String str4 = this.f108502i;
        SmartlockVendor smartlockVendor = this.f108503j;
        PhysicalLockPurpose physicalLockPurpose = this.f108504k;
        Bird bird = this.f108505l;
        EnumC49121tE5 enumC49121tE5 = this.f108506m;
        Integer num2 = this.f108507n;
        Boolean bool = this.f108508o;
        String str5 = this.f108509p;
        return "SmartLock(scannedDevice=" + scannedDevice + ", type=" + cf5 + ", macAddress=" + str + ", isConnected=" + z + ", version=" + num + ", id=" + str2 + ", tokenRequest=" + str3 + ", tokenRequests=" + list + ", physicalLockId=" + str4 + ", vendor=" + smartlockVendor + ", purpose=" + physicalLockPurpose + ", bird=" + bird + ", context=" + enumC49121tE5 + ", batteryLevel=" + num2 + ", locked=" + bool + ", rideId=" + str5 + ")";
    }

    public /* synthetic */ C48528sE5(ScannedDevice scannedDevice, CF5 cf5, String str, boolean z, Integer num, String str2, String str3, List list, String str4, SmartlockVendor smartlockVendor, PhysicalLockPurpose physicalLockPurpose, Bird bird, EnumC49121tE5 enumC49121tE5, Integer num2, Boolean bool, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(scannedDevice, cf5, str, z, (i & 16) != 0 ? null : num, (i & 32) != 0 ? "UNKNOWN" : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : smartlockVendor, (i & 1024) != 0 ? null : physicalLockPurpose, (i & 2048) != 0 ? null : bird, (i & 4096) != 0 ? EnumC49121tE5.UNKNOWN : enumC49121tE5, (i & 8192) != 0 ? null : num2, (i & 16384) != 0 ? null : bool, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : str5);
    }
}
