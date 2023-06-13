package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$B\u001f\b\u0016\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0014\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b#\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f¨\u0006("}, m28432d2 = {"Lkx2;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "version", "LGE0;", "b", "LGE0;", "getCreator", "()LGE0;", "creator", "", "c", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "pages", "Ldf1;", DateTokenConverter.CONVERTER_KEY, "getEntries", "entries", "e", "getComment", "comment", "LQ20;", "browser", "<init>", "(Ljava/lang/String;LGE0;LQ20;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transactions", "(Ljava/util/List;LGE0;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Log.kt\ncom/chuckerteam/chucker/internal/data/har/Log\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n1549#2:26\n1620#2,3:27\n*S KotlinDebug\n*F\n+ 1 Log.kt\ncom/chuckerteam/chucker/internal/data/har/Log\n*L\n22#1:26\n22#1:27,3\n*E\n"})
/* renamed from: kx2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44210kx2 {
    @InterfaceC41208ft5("version")

    /* renamed from: a */
    public final String f95281a;
    @InterfaceC41208ft5("creator")

    /* renamed from: b */
    public final GE0 f95282b;
    @InterfaceC41208ft5("pages")

    /* renamed from: c */
    public final List<Object> f95283c;
    @InterfaceC41208ft5("entries")

    /* renamed from: d */
    public final List<C39879df1> f95284d;
    @InterfaceC41208ft5("comment")

    /* renamed from: e */
    public final String f95285e;

    public C44210kx2(String version, GE0 creator, Q20 q20, List<Object> list, List<C39879df1> entries, String str) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f95281a = version;
        this.f95282b = creator;
        this.f95283c = list;
        this.f95284d = entries;
        this.f95285e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44210kx2) {
            C44210kx2 c44210kx2 = (C44210kx2) obj;
            return Intrinsics.areEqual(this.f95281a, c44210kx2.f95281a) && Intrinsics.areEqual(this.f95282b, c44210kx2.f95282b) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f95283c, c44210kx2.f95283c) && Intrinsics.areEqual(this.f95284d, c44210kx2.f95284d) && Intrinsics.areEqual(this.f95285e, c44210kx2.f95285e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f95281a.hashCode() * 31) + this.f95282b.hashCode()) * 31) + 0) * 31;
        List<Object> list = this.f95283c;
        int hashCode2 = (((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f95284d.hashCode()) * 31;
        String str = this.f95285e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.f95281a;
        GE0 ge0 = this.f95282b;
        List<Object> list = this.f95283c;
        List<C39879df1> list2 = this.f95284d;
        String str2 = this.f95285e;
        return "Log(version=" + str + ", creator=" + ge0 + ", browser=" + ((Object) null) + ", pages=" + list + ", entries=" + list2 + ", comment=" + str2 + ")";
    }

    public /* synthetic */ C44210kx2(String str, GE0 ge0, Q20 q20, List list, List list2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "1.2" : str, ge0, (i & 4) != 0 ? null : q20, (i & 8) != 0 ? null : list, list2, (i & 32) != 0 ? null : str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C44210kx2(List<HttpTransaction> transactions, GE0 creator) {
        this(null, creator, null, null, r6, null, 45, null);
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(creator, "creator");
        List<HttpTransaction> list = transactions;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (HttpTransaction httpTransaction : list) {
            arrayList.add(new C39879df1(httpTransaction));
        }
    }
}
