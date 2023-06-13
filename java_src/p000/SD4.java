package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 B\u0019\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0018\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010!J3\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, m28432d2 = {"LSD4;", "", "", "key", "display", "", "checked", "caption", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "c", "Z", "()Z", "g", "(Z)V", "Lco/bird/android/model/LegacyRepairType;", "Lco/bird/android/model/LegacyRepairType;", "f", "()Lco/bird/android/model/LegacyRepairType;", "setRepairType", "(Lco/bird/android/model/LegacyRepairType;)V", "repairType", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "(Lco/bird/android/model/LegacyRepairType;Z)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: SD4 */
/* loaded from: classes3.dex */
public final class SD4 {

    /* renamed from: a */
    public final String f33348a;

    /* renamed from: b */
    public final String f33349b;

    /* renamed from: c */
    public boolean f33350c;

    /* renamed from: d */
    public final String f33351d;

    /* renamed from: e */
    public LegacyRepairType f33352e;

    public SD4(String key, String display, boolean z, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(display, "display");
        this.f33348a = key;
        this.f33349b = display;
        this.f33350c = z;
        this.f33351d = str;
    }

    public static /* synthetic */ SD4 copy$default(SD4 sd4, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sd4.f33348a;
        }
        if ((i & 2) != 0) {
            str2 = sd4.f33349b;
        }
        if ((i & 4) != 0) {
            z = sd4.f33350c;
        }
        if ((i & 8) != 0) {
            str3 = sd4.f33351d;
        }
        return sd4.m85829a(str, str2, z, str3);
    }

    /* renamed from: a */
    public final SD4 m85829a(String key, String display, boolean z, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(display, "display");
        return new SD4(key, display, z, str);
    }

    /* renamed from: b */
    public final String m85828b() {
        return this.f33351d;
    }

    /* renamed from: c */
    public final boolean m85827c() {
        return this.f33350c;
    }

    /* renamed from: d */
    public final String m85826d() {
        return this.f33349b;
    }

    /* renamed from: e */
    public final String m85825e() {
        return this.f33348a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SD4) {
            SD4 sd4 = (SD4) obj;
            return Intrinsics.areEqual(this.f33348a, sd4.f33348a) && Intrinsics.areEqual(this.f33349b, sd4.f33349b) && this.f33350c == sd4.f33350c && Intrinsics.areEqual(this.f33351d, sd4.f33351d);
        }
        return false;
    }

    /* renamed from: f */
    public final LegacyRepairType m85824f() {
        return this.f33352e;
    }

    /* renamed from: g */
    public final void m85823g(boolean z) {
        this.f33350c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f33348a.hashCode() * 31) + this.f33349b.hashCode()) * 31;
        boolean z = this.f33350c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.f33351d;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f33348a;
        String str2 = this.f33349b;
        boolean z = this.f33350c;
        String str3 = this.f33351d;
        return "RepairTypeViewModel(key=" + str + ", display=" + str2 + ", checked=" + z + ", caption=" + str3 + ")";
    }

    public /* synthetic */ SD4(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? null : str3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SD4(LegacyRepairType repairType, boolean z) {
        this(r0, r1, z, repairType.getParentDisplay() != null ? repairType.getDisplay() : null);
        String parentDisplay;
        Intrinsics.checkNotNullParameter(repairType, "repairType");
        String key = repairType.getKey();
        if (repairType.getParentDisplay() == null) {
            parentDisplay = repairType.getDisplay();
        } else {
            parentDisplay = repairType.getParentDisplay();
            Intrinsics.checkNotNull(parentDisplay);
        }
        this.f33352e = repairType;
    }
}
