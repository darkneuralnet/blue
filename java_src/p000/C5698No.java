package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.AssetManagerType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)Jx\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b\"\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b'\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019¨\u0006*"}, m28432d2 = {"LNo;", "", "", "id", "Lco/bird/android/model/constant/AssetManagerType;", "manager", "", "fileSize", "mediaType", "filePath", "createdBy", "Lorg/joda/time/DateTime;", "downloadedAt", "manifestDate", "downloadUrl", C17296a.f69688o, "(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)LNo;", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "Lco/bird/android/model/constant/AssetManagerType;", "h", "()Lco/bird/android/model/constant/AssetManagerType;", "c", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", DateTokenConverter.CONVERTER_KEY, "j", "e", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "i", "<init>", "(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "local-asset_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: No */
/* loaded from: classes4.dex */
public final class C5698No {

    /* renamed from: a */
    public final String f25198a;

    /* renamed from: b */
    public final AssetManagerType f25199b;

    /* renamed from: c */
    public final Long f25200c;

    /* renamed from: d */
    public final String f25201d;

    /* renamed from: e */
    public final String f25202e;

    /* renamed from: f */
    public final String f25203f;

    /* renamed from: g */
    public final DateTime f25204g;

    /* renamed from: h */
    public final DateTime f25205h;

    /* renamed from: i */
    public final String f25206i;

    public C5698No(String id, AssetManagerType manager, Long l, String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f25198a = id;
        this.f25199b = manager;
        this.f25200c = l;
        this.f25201d = str;
        this.f25202e = str2;
        this.f25203f = str3;
        this.f25204g = dateTime;
        this.f25205h = dateTime2;
        this.f25206i = str4;
    }

    /* renamed from: a */
    public final C5698No m93396a(String id, AssetManagerType manager, Long l, String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new C5698No(id, manager, l, str, str2, str3, dateTime, dateTime2, str4);
    }

    /* renamed from: b */
    public final String m93395b() {
        return this.f25203f;
    }

    /* renamed from: c */
    public final String m93394c() {
        return this.f25206i;
    }

    /* renamed from: d */
    public final DateTime m93393d() {
        return this.f25204g;
    }

    /* renamed from: e */
    public final String m93392e() {
        return this.f25202e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5698No) {
            C5698No c5698No = (C5698No) obj;
            return Intrinsics.areEqual(this.f25198a, c5698No.f25198a) && this.f25199b == c5698No.f25199b && Intrinsics.areEqual(this.f25200c, c5698No.f25200c) && Intrinsics.areEqual(this.f25201d, c5698No.f25201d) && Intrinsics.areEqual(this.f25202e, c5698No.f25202e) && Intrinsics.areEqual(this.f25203f, c5698No.f25203f) && Intrinsics.areEqual(this.f25204g, c5698No.f25204g) && Intrinsics.areEqual(this.f25205h, c5698No.f25205h) && Intrinsics.areEqual(this.f25206i, c5698No.f25206i);
        }
        return false;
    }

    /* renamed from: f */
    public final Long m93391f() {
        return this.f25200c;
    }

    /* renamed from: g */
    public final String m93390g() {
        return this.f25198a;
    }

    /* renamed from: h */
    public final AssetManagerType m93389h() {
        return this.f25199b;
    }

    public int hashCode() {
        int hashCode = ((this.f25198a.hashCode() * 31) + this.f25199b.hashCode()) * 31;
        Long l = this.f25200c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f25201d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25202e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25203f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DateTime dateTime = this.f25204g;
        int hashCode6 = (hashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f25205h;
        int hashCode7 = (hashCode6 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        String str4 = this.f25206i;
        return hashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    /* renamed from: i */
    public final DateTime m93388i() {
        return this.f25205h;
    }

    /* renamed from: j */
    public final String m93387j() {
        return this.f25201d;
    }

    public String toString() {
        String str = this.f25198a;
        AssetManagerType assetManagerType = this.f25199b;
        Long l = this.f25200c;
        String str2 = this.f25201d;
        String str3 = this.f25202e;
        String str4 = this.f25203f;
        DateTime dateTime = this.f25204g;
        DateTime dateTime2 = this.f25205h;
        String str5 = this.f25206i;
        return "AssetEntity(id=" + str + ", manager=" + assetManagerType + ", fileSize=" + l + ", mediaType=" + str2 + ", filePath=" + str3 + ", createdBy=" + str4 + ", downloadedAt=" + dateTime + ", manifestDate=" + dateTime2 + ", downloadUrl=" + str5 + ")";
    }

    public /* synthetic */ C5698No(String str, AssetManagerType assetManagerType, Long l, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, assetManagerType, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : dateTime, (i & 128) != 0 ? null : dateTime2, (i & 256) != 0 ? null : str5);
    }
}
