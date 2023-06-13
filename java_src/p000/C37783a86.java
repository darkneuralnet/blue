package p000;

import androidx.lifecycle.LiveData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u001f\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u001d\u0010\u000f¨\u0006#"}, m28432d2 = {"La86;", "LOr6;", "", "l", "", "encode", "e", "LuX2;", C17296a.f69688o, "LuX2;", "mutableEncodeUrl", "Landroidx/lifecycle/LiveData;", "b", "Landroidx/lifecycle/LiveData;", "h", "()Landroidx/lifecycle/LiveData;", "encodeUrl", "", "c", "k", "transactionTitle", DateTokenConverter.CONVERTER_KEY, "g", "doesUrlRequireEncoding", "f", "doesRequestBodyRequireEncoding", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "j", "transaction", "i", "formatRequestBody", "", "transactionId", "<init>", "(J)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: a86  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37783a86 extends AbstractC35048Or6 {

    /* renamed from: a */
    public final C49882uX2<Boolean> f49885a;

    /* renamed from: b */
    public final LiveData<Boolean> f49886b;

    /* renamed from: c */
    public final LiveData<String> f49887c;

    /* renamed from: d */
    public final LiveData<Boolean> f49888d;

    /* renamed from: e */
    public final LiveData<Boolean> f49889e;

    /* renamed from: f */
    public final LiveData<HttpTransaction> f49890f;

    /* renamed from: g */
    public final LiveData<Boolean> f49891g;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00070\u0003¢\u0006\u0002\b\u00012\r\u0010\u0002\u001a\t\u0018\u00010\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "Lkotlin/jvm/JvmSuppressWildcards;", "transaction", "", C17296a.f69688o, "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a86$a */
    /* loaded from: classes5.dex */
    public static final class C10576a extends Lambda implements Function1<HttpTransaction, Boolean> {

        /* renamed from: g */
        public static final C10576a f49892g = new C10576a();

        public C10576a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(HttpTransaction httpTransaction) {
            String requestContentType;
            return Boolean.valueOf((httpTransaction == null || (requestContentType = httpTransaction.getRequestContentType()) == null) ? false : StringsKt__StringsKt.contains((CharSequence) requestContentType, (CharSequence) "x-www-form-urlencoded", true));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00070\u0003¢\u0006\u0002\b\u00012\r\u0010\u0002\u001a\t\u0018\u00010\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "Lkotlin/jvm/JvmSuppressWildcards;", "transaction", "", C17296a.f69688o, "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a86$b */
    /* loaded from: classes5.dex */
    public static final class C10577b extends Lambda implements Function1<HttpTransaction, Boolean> {

        /* renamed from: g */
        public static final C10577b f49893g = new C10577b();

        public C10577b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(HttpTransaction httpTransaction) {
            boolean z = false;
            if (httpTransaction != null && !Intrinsics.areEqual(httpTransaction.getFormattedPath(true), httpTransaction.getFormattedPath(false))) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "requiresEncoding", "encodeUrl", C17296a.f69688o, "(ZZ)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a86$c */
    /* loaded from: classes5.dex */
    public static final class C10578c extends Lambda implements Function2<Boolean, Boolean, Boolean> {

        /* renamed from: g */
        public static final C10578c f49894g = new C10578c();

        public C10578c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean m71850a(boolean z, boolean z2) {
            return Boolean.valueOf((z && z2) ? false : true);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return m71850a(bool.booleanValue(), bool2.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "", "encodeUrl", "", C17296a.f69688o, "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Z)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a86$d */
    /* loaded from: classes5.dex */
    public static final class C10579d extends Lambda implements Function2<HttpTransaction, Boolean, String> {

        /* renamed from: g */
        public static final C10579d f49895g = new C10579d();

        public C10579d() {
            super(2);
        }

        /* renamed from: a */
        public final String m71849a(HttpTransaction httpTransaction, boolean z) {
            if (httpTransaction != null) {
                String method = httpTransaction.getMethod();
                String formattedPath = httpTransaction.getFormattedPath(z);
                return method + " " + formattedPath;
            }
            return "";
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ String invoke(HttpTransaction httpTransaction, Boolean bool) {
            return m71849a(httpTransaction, bool.booleanValue());
        }
    }

    public C37783a86(long j) {
        C49882uX2<Boolean> c49882uX2 = new C49882uX2<>(Boolean.FALSE);
        this.f49885a = c49882uX2;
        this.f49886b = c49882uX2;
        C42041hI4 c42041hI4 = C42041hI4.f84975a;
        this.f49887c = C37159Xs2.m76190c(c42041hI4.m36551b().mo94004g(j), c49882uX2, C10579d.f49895g);
        this.f49888d = C49669u96.m10729b(c42041hI4.m36551b().mo94004g(j), C10577b.f49893g);
        LiveData<Boolean> m10729b = C49669u96.m10729b(c42041hI4.m36551b().mo94004g(j), C10576a.f49892g);
        this.f49889e = m10729b;
        this.f49890f = c42041hI4.m36551b().mo94004g(j);
        this.f49891g = C37159Xs2.m76190c(m10729b, c49882uX2, C10578c.f49894g);
    }

    /* renamed from: e */
    public final void m71860e(boolean z) {
        this.f49885a.setValue(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final LiveData<Boolean> m71859f() {
        return this.f49889e;
    }

    /* renamed from: g */
    public final LiveData<Boolean> m71858g() {
        return this.f49888d;
    }

    /* renamed from: h */
    public final LiveData<Boolean> m71857h() {
        return this.f49886b;
    }

    /* renamed from: i */
    public final LiveData<Boolean> m71856i() {
        return this.f49891g;
    }

    /* renamed from: j */
    public final LiveData<HttpTransaction> m71855j() {
        return this.f49890f;
    }

    /* renamed from: k */
    public final LiveData<String> m71854k() {
        return this.f49887c;
    }

    /* renamed from: l */
    public final void m71853l() {
        Boolean value = this.f49886b.getValue();
        Intrinsics.checkNotNull(value);
        m71860e(!value.booleanValue());
    }
}
