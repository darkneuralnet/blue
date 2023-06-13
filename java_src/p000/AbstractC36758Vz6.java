package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0006B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m28432d2 = {"LVz6;", "", "", C17296a.f69688o, "<init>", "()V", "b", "LVz6$a;", "LVz6$b;", "web_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Vz6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC36758Vz6 {

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LVz6$a;", "LVz6;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "c", "()Ljava/lang/String;", MessageExtension.FIELD_DATA, "b", "baseUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "web_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Vz6$a */
    /* loaded from: classes5.dex */
    public static final class C8886a extends AbstractC36758Vz6 {

        /* renamed from: a */
        public final String f40174a;

        /* renamed from: b */
        public final String f40175b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8886a(String data, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.f40174a = data;
            this.f40175b = str;
        }

        /* renamed from: b */
        public final String m79022b() {
            return this.f40175b;
        }

        /* renamed from: c */
        public final String m79021c() {
            return this.f40174a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8886a) {
                C8886a c8886a = (C8886a) obj;
                return Intrinsics.areEqual(this.f40174a, c8886a.f40174a) && Intrinsics.areEqual(this.f40175b, c8886a.f40175b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f40174a.hashCode() * 31;
            String str = this.f40175b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Data(data=" + this.f40174a + ", baseUrl=" + this.f40175b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ AbstractC36758Vz6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final String m79023a() {
        if (this instanceof C8887b) {
            return ((C8887b) this).m79017e();
        }
        if (this instanceof C8886a) {
            return ((C8886a) this).m79022b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LVz6$b;", "LVz6;", "", "url", "", "additionalHttpHeaders", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "web_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Vz6$b */
    /* loaded from: classes5.dex */
    public static final class C8887b extends AbstractC36758Vz6 {

        /* renamed from: a */
        public final String f40176a;

        /* renamed from: b */
        public final Map<String, String> f40177b;

        public /* synthetic */ C8887b(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? MapsKt__MapsKt.emptyMap() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public static /* synthetic */ C8887b m79019c(C8887b c8887b, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c8887b.f40176a;
            }
            if ((i & 2) != 0) {
                map = c8887b.f40177b;
            }
            return c8887b.m79020b(str, map);
        }

        /* renamed from: b */
        public final C8887b m79020b(String url, Map<String, String> additionalHttpHeaders) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(additionalHttpHeaders, "additionalHttpHeaders");
            return new C8887b(url, additionalHttpHeaders);
        }

        /* renamed from: d */
        public final Map<String, String> m79018d() {
            return this.f40177b;
        }

        /* renamed from: e */
        public final String m79017e() {
            return this.f40176a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8887b) {
                C8887b c8887b = (C8887b) obj;
                return Intrinsics.areEqual(this.f40176a, c8887b.f40176a) && Intrinsics.areEqual(this.f40177b, c8887b.f40177b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f40176a.hashCode() * 31) + this.f40177b.hashCode();
        }

        public String toString() {
            return "Url(url=" + this.f40176a + ", additionalHttpHeaders=" + this.f40177b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8887b(String url, Map<String, String> additionalHttpHeaders) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(additionalHttpHeaders, "additionalHttpHeaders");
            this.f40176a = url;
            this.f40177b = additionalHttpHeaders;
        }
    }

    private AbstractC36758Vz6() {
    }
}
