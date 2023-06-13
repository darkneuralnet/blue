package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b1\u00102Ju\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b \u00100¨\u00063"}, m28432d2 = {"Lvz6;", "", "", "archiveId", "name", "", "loadRemotely", "", "progress", "LNz6;", TransferTable.COLUMN_STATE, "Lorg/joda/time/DateTime;", "updatedAt", "failureReason", "initialUrl", "lastAccessedAt", "Ljava/io/File;", "localFile", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getArchiveId", "()Ljava/lang/String;", "b", "e", "c", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "F", "getProgress", "()F", "LNz6;", "f", "()LNz6;", "Lorg/joda/time/DateTime;", "g", "()Lorg/joda/time/DateTime;", "getFailureReason", "h", "i", "getLastAccessedAt", "j", "Ljava/io/File;", "()Ljava/io/File;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZFLNz6;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/io/File;)V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vz6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50755vz6 {

    /* renamed from: a */
    public final String f115089a;

    /* renamed from: b */
    public final String f115090b;

    /* renamed from: c */
    public final boolean f115091c;

    /* renamed from: d */
    public final float f115092d;

    /* renamed from: e */
    public final EnumC34886Nz6 f115093e;

    /* renamed from: f */
    public final DateTime f115094f;

    /* renamed from: g */
    public final String f115095g;

    /* renamed from: h */
    public final String f115096h;

    /* renamed from: i */
    public final DateTime f115097i;

    /* renamed from: j */
    public final File f115098j;

    public C50755vz6(String archiveId, String name, boolean z, float f, EnumC34886Nz6 state, DateTime updatedAt, String str, String str2, DateTime dateTime, File file) {
        Intrinsics.checkNotNullParameter(archiveId, "archiveId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f115089a = archiveId;
        this.f115090b = name;
        this.f115091c = z;
        this.f115092d = f;
        this.f115093e = state;
        this.f115094f = updatedAt;
        this.f115095g = str;
        this.f115096h = str2;
        this.f115097i = dateTime;
        this.f115098j = file;
    }

    /* renamed from: a */
    public final C50755vz6 m7619a(String archiveId, String name, boolean z, float f, EnumC34886Nz6 state, DateTime updatedAt, String str, String str2, DateTime dateTime, File file) {
        Intrinsics.checkNotNullParameter(archiveId, "archiveId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new C50755vz6(archiveId, name, z, f, state, updatedAt, str, str2, dateTime, file);
    }

    /* renamed from: b */
    public final String m7618b() {
        return this.f115096h;
    }

    /* renamed from: c */
    public final boolean m7617c() {
        return this.f115091c;
    }

    /* renamed from: d */
    public final File m7616d() {
        return this.f115098j;
    }

    /* renamed from: e */
    public final String m7615e() {
        return this.f115090b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50755vz6) {
            C50755vz6 c50755vz6 = (C50755vz6) obj;
            return Intrinsics.areEqual(this.f115089a, c50755vz6.f115089a) && Intrinsics.areEqual(this.f115090b, c50755vz6.f115090b) && this.f115091c == c50755vz6.f115091c && Float.compare(this.f115092d, c50755vz6.f115092d) == 0 && this.f115093e == c50755vz6.f115093e && Intrinsics.areEqual(this.f115094f, c50755vz6.f115094f) && Intrinsics.areEqual(this.f115095g, c50755vz6.f115095g) && Intrinsics.areEqual(this.f115096h, c50755vz6.f115096h) && Intrinsics.areEqual(this.f115097i, c50755vz6.f115097i) && Intrinsics.areEqual(this.f115098j, c50755vz6.f115098j);
        }
        return false;
    }

    /* renamed from: f */
    public final EnumC34886Nz6 m7614f() {
        return this.f115093e;
    }

    /* renamed from: g */
    public final DateTime m7613g() {
        return this.f115094f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f115089a.hashCode() * 31) + this.f115090b.hashCode()) * 31;
        boolean z = this.f115091c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((((hashCode + i) * 31) + Float.hashCode(this.f115092d)) * 31) + this.f115093e.hashCode()) * 31) + this.f115094f.hashCode()) * 31;
        String str = this.f115095g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f115096h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateTime dateTime = this.f115097i;
        int hashCode5 = (hashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        File file = this.f115098j;
        return hashCode5 + (file != null ? file.hashCode() : 0);
    }

    public String toString() {
        String str = this.f115089a;
        String str2 = this.f115090b;
        boolean z = this.f115091c;
        float f = this.f115092d;
        EnumC34886Nz6 enumC34886Nz6 = this.f115093e;
        DateTime dateTime = this.f115094f;
        String str3 = this.f115095g;
        String str4 = this.f115096h;
        DateTime dateTime2 = this.f115097i;
        File file = this.f115098j;
        return "WebArchive(archiveId=" + str + ", name=" + str2 + ", loadRemotely=" + z + ", progress=" + f + ", state=" + enumC34886Nz6 + ", updatedAt=" + dateTime + ", failureReason=" + str3 + ", initialUrl=" + str4 + ", lastAccessedAt=" + dateTime2 + ", localFile=" + file + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C50755vz6(String str, String str2, boolean z, float f, EnumC34886Nz6 enumC34886Nz6, DateTime dateTime, String str3, String str4, DateTime dateTime2, File file, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, f, r7, r8, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : dateTime2, (i & 512) != 0 ? null : file);
        DateTime dateTime3;
        EnumC34886Nz6 enumC34886Nz62 = (i & 16) != 0 ? EnumC34886Nz6.UNINITIALIZED : enumC34886Nz6;
        if ((i & 32) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
    }
}
