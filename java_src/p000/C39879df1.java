package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.util.DateUtils;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u0000 ?2\u00020\u0001:\u0002\t\u000eBg\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010*\u001a\u00020%\u0012\u0006\u00100\u001a\u00020+\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b:\u0010;B\u0011\b\u0016\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b:\u0010>J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010*\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u00100\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\fR\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b5\u0010\fR\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b8\u0010\f¨\u0006@"}, m28432d2 = {"Ldf1;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "getPageref", "()Ljava/lang/String;", "pageref", "b", "getStartedDateTime", "startedDateTime", "", "c", "J", "getTime", "()J", "setTime", "(J)V", "time", "LoI4;", DateTokenConverter.CONVERTER_KEY, "LoI4;", "getRequest", "()LoI4;", "request", "LGM4;", "e", "LGM4;", "getResponse", "()LGM4;", "response", "LZ70;", "f", "LZ70;", "getCache", "()LZ70;", "cache", "LS46;", "g", "LS46;", "getTimings", "()LS46;", "timings", "h", "getServerIPAddress", "serverIPAddress", "i", "getConnection", "connection", "j", "getComment", "comment", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLoI4;LGM4;LZ70;LS46;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "k", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: df1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39879df1 {

    /* renamed from: k */
    public static final C19835a f77000k = new C19835a(null);
    @InterfaceC41208ft5("pageref")

    /* renamed from: a */
    public final String f77001a;
    @InterfaceC41208ft5("startedDateTime")

    /* renamed from: b */
    public final String f77002b;
    @InterfaceC41208ft5("time")

    /* renamed from: c */
    public long f77003c;
    @InterfaceC41208ft5("request")

    /* renamed from: d */
    public final C46192oI4 f77004d;
    @InterfaceC41208ft5("response")

    /* renamed from: e */
    public final GM4 f77005e;
    @InterfaceC41208ft5("cache")

    /* renamed from: f */
    public final Z70 f77006f;
    @InterfaceC41208ft5("timings")

    /* renamed from: g */
    public final S46 f77007g;
    @InterfaceC41208ft5("serverIPAddress")

    /* renamed from: h */
    public final String f77008h;
    @InterfaceC41208ft5("connection")

    /* renamed from: i */
    public final String f77009i;
    @InterfaceC41208ft5("comment")

    /* renamed from: j */
    public final String f77010j;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"Ldf1$a;", "", "", "", "b", "DATE_FORMAT", "Ljava/lang/String;", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: df1$a */
    /* loaded from: classes5.dex */
    public static final class C19835a {
        public /* synthetic */ C19835a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final String m43932b(long j) {
            SimpleDateFormat simpleDateFormat = C19836b.f77011a.get();
            Intrinsics.checkNotNull(simpleDateFormat);
            String format = simpleDateFormat.format(new Date(j));
            Intrinsics.checkNotNullExpressionValue(format, "DateFormat.get()!!.format(Date(this))");
            return format;
        }

        private C19835a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, m28432d2 = {"Ldf1$b;", "Ljava/lang/ThreadLocal;", "Ljava/text/SimpleDateFormat;", C17296a.f69688o, "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: df1$b */
    /* loaded from: classes5.dex */
    public static final class C19836b extends ThreadLocal<SimpleDateFormat> {

        /* renamed from: a */
        public static final C19836b f77011a = new C19836b();

        private C19836b() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
        }
    }

    public C39879df1(String str, String startedDateTime, long j, C46192oI4 request, GM4 response, Z70 cache, S46 timings, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(startedDateTime, "startedDateTime");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timings, "timings");
        this.f77001a = str;
        this.f77002b = startedDateTime;
        this.f77003c = j;
        this.f77004d = request;
        this.f77005e = response;
        this.f77006f = cache;
        this.f77007g = timings;
        this.f77008h = str2;
        this.f77009i = str3;
        this.f77010j = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39879df1) {
            C39879df1 c39879df1 = (C39879df1) obj;
            return Intrinsics.areEqual(this.f77001a, c39879df1.f77001a) && Intrinsics.areEqual(this.f77002b, c39879df1.f77002b) && this.f77003c == c39879df1.f77003c && Intrinsics.areEqual(this.f77004d, c39879df1.f77004d) && Intrinsics.areEqual(this.f77005e, c39879df1.f77005e) && Intrinsics.areEqual(this.f77006f, c39879df1.f77006f) && Intrinsics.areEqual(this.f77007g, c39879df1.f77007g) && Intrinsics.areEqual(this.f77008h, c39879df1.f77008h) && Intrinsics.areEqual(this.f77009i, c39879df1.f77009i) && Intrinsics.areEqual(this.f77010j, c39879df1.f77010j);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f77001a;
        int hashCode = (((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.f77002b.hashCode()) * 31) + Long.hashCode(this.f77003c)) * 31) + this.f77004d.hashCode()) * 31) + this.f77005e.hashCode()) * 31) + this.f77006f.hashCode()) * 31) + this.f77007g.hashCode()) * 31;
        String str2 = this.f77008h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f77009i;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f77010j;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f77001a;
        String str2 = this.f77002b;
        long j = this.f77003c;
        C46192oI4 c46192oI4 = this.f77004d;
        GM4 gm4 = this.f77005e;
        Z70 z70 = this.f77006f;
        S46 s46 = this.f77007g;
        String str3 = this.f77008h;
        String str4 = this.f77009i;
        String str5 = this.f77010j;
        return "Entry(pageref=" + str + ", startedDateTime=" + str2 + ", time=" + j + ", request=" + c46192oI4 + ", response=" + gm4 + ", cache=" + z70 + ", timings=" + s46 + ", serverIPAddress=" + str3 + ", connection=" + str4 + ", comment=" + str5 + ")";
    }

    public /* synthetic */ C39879df1(String str, String str2, long j, C46192oI4 c46192oI4, GM4 gm4, Z70 z70, S46 s46, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, j, c46192oI4, gm4, z70, s46, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C39879df1(HttpTransaction transaction) {
        this(null, r1 == null ? "" : r1, new S46(transaction).m86032a(), new C46192oI4(transaction), new GM4(transaction), new Z70(null, null, null, 7, null), new S46(transaction), null, null, null, 897, null);
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Long requestDate = transaction.getRequestDate();
        String m43932b = requestDate != null ? f77000k.m43932b(requestDate.longValue()) : null;
    }
}
