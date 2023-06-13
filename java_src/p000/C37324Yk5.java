package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.support.v18.scanner.ScanFilter;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b'\u0010(JI\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001b\u0010&¨\u0006)"}, m28432d2 = {"LYk5;", "LWX;", "Lbi3;", "opMode", "", "legacy", "", "reportDelayMillis", "useHardwareBatchingIfSupported", "Lno/nordicsemi/android/support/v18/scanner/ScanFilter;", "scanFilter", "Lorg/joda/time/DateTime;", "excludeResultsOlderThan", "b", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Lbi3;", "()Lbi3;", "Z", "getLegacy", "()Z", "c", "J", "getReportDelayMillis", "()J", DateTokenConverter.CONVERTER_KEY, "getUseHardwareBatchingIfSupported", "e", "Lno/nordicsemi/android/support/v18/scanner/ScanFilter;", "()Lno/nordicsemi/android/support/v18/scanner/ScanFilter;", "f", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "<init>", "(Lbi3;ZJZLno/nordicsemi/android/support/v18/scanner/ScanFilter;Lorg/joda/time/DateTime;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yk5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37324Yk5 implements InterfaceC9077WX {

    /* renamed from: a */
    public final EnumC38707bi3 f46523a;

    /* renamed from: b */
    public final boolean f46524b;

    /* renamed from: c */
    public final long f46525c;

    /* renamed from: d */
    public final boolean f46526d;

    /* renamed from: e */
    public final ScanFilter f46527e;

    /* renamed from: f */
    public final DateTime f46528f;

    public C37324Yk5(EnumC38707bi3 opMode, boolean z, long j, boolean z2, ScanFilter scanFilter, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(opMode, "opMode");
        this.f46523a = opMode;
        this.f46524b = z;
        this.f46525c = j;
        this.f46526d = z2;
        this.f46527e = scanFilter;
        this.f46528f = dateTime;
    }

    public static /* synthetic */ C37324Yk5 copy$default(C37324Yk5 c37324Yk5, EnumC38707bi3 enumC38707bi3, boolean z, long j, boolean z2, ScanFilter scanFilter, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC38707bi3 = c37324Yk5.f46523a;
        }
        if ((i & 2) != 0) {
            z = c37324Yk5.f46524b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            j = c37324Yk5.f46525c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z2 = c37324Yk5.f46526d;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            scanFilter = c37324Yk5.f46527e;
        }
        ScanFilter scanFilter2 = scanFilter;
        if ((i & 32) != 0) {
            dateTime = c37324Yk5.f46528f;
        }
        return c37324Yk5.m74336b(enumC38707bi3, z3, j2, z4, scanFilter2, dateTime);
    }

    @Override // p000.InterfaceC9077WX
    /* renamed from: a */
    public EnumC38707bi3 mo7691a() {
        return this.f46523a;
    }

    /* renamed from: b */
    public final C37324Yk5 m74336b(EnumC38707bi3 opMode, boolean z, long j, boolean z2, ScanFilter scanFilter, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(opMode, "opMode");
        return new C37324Yk5(opMode, z, j, z2, scanFilter, dateTime);
    }

    /* renamed from: c */
    public final DateTime m74335c() {
        return this.f46528f;
    }

    /* renamed from: d */
    public final ScanFilter m74334d() {
        return this.f46527e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37324Yk5) {
            C37324Yk5 c37324Yk5 = (C37324Yk5) obj;
            return this.f46523a == c37324Yk5.f46523a && this.f46524b == c37324Yk5.f46524b && this.f46525c == c37324Yk5.f46525c && this.f46526d == c37324Yk5.f46526d && Intrinsics.areEqual(this.f46527e, c37324Yk5.f46527e) && Intrinsics.areEqual(this.f46528f, c37324Yk5.f46528f);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f46523a.hashCode() * 31;
        boolean z = this.f46524b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + Long.hashCode(this.f46525c)) * 31;
        boolean z2 = this.f46526d;
        int i2 = (hashCode2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        ScanFilter scanFilter = this.f46527e;
        int hashCode3 = (i2 + (scanFilter == null ? 0 : scanFilter.hashCode())) * 31;
        DateTime dateTime = this.f46528f;
        return hashCode3 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        EnumC38707bi3 enumC38707bi3 = this.f46523a;
        boolean z = this.f46524b;
        long j = this.f46525c;
        boolean z2 = this.f46526d;
        ScanFilter scanFilter = this.f46527e;
        DateTime dateTime = this.f46528f;
        return "ScanSettings(opMode=" + enumC38707bi3 + ", legacy=" + z + ", reportDelayMillis=" + j + ", useHardwareBatchingIfSupported=" + z2 + ", scanFilter=" + scanFilter + ", excludeResultsOlderThan=" + dateTime + ")";
    }

    public /* synthetic */ C37324Yk5(EnumC38707bi3 enumC38707bi3, boolean z, long j, boolean z2, ScanFilter scanFilter, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC38707bi3, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0L : j, (i & 8) == 0 ? z2 : false, (i & 16) != 0 ? null : scanFilter, (i & 32) == 0 ? dateTime : null);
    }
}
