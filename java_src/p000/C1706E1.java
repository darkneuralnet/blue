package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\f\nB\u0019\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0017"}, m28432d2 = {"LE1;", "Ljava/io/Serializable;", "", "writeReplace", "", "hashCode", "o", "", "equals", "", "b", "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "accessTokenString", "c", NamedConstantsKt.APPLICATION_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/AccessToken;", "accessToken", "(Lcom/facebook/AccessToken;)V", DateTokenConverter.CONVERTER_KEY, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: E1 */
/* loaded from: classes5.dex */
public final class C1706E1 implements Serializable {

    /* renamed from: d */
    public static final C1707a f6844d = new C1707a(null);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final String f6845b;

    /* renamed from: c */
    public final String f6846c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LE1$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: E1$a */
    /* loaded from: classes5.dex */
    public static final class C1707a {
        private C1707a() {
        }

        public /* synthetic */ C1707a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0019\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\u000e"}, m28432d2 = {"LE1$b;", "Ljava/io/Serializable;", "", "readResolve", "", "b", "Ljava/lang/String;", "accessTokenString", "c", "appId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: E1$b */
    /* loaded from: classes5.dex */
    public static final class C1708b implements Serializable {

        /* renamed from: d */
        public static final C1709a f6847d = new C1709a(null);
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: b */
        public final String f6848b;

        /* renamed from: c */
        public final String f6849c;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LE1$b$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: E1$b$a */
        /* loaded from: classes5.dex */
        public static final class C1709a {
            private C1709a() {
            }

            public /* synthetic */ C1709a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C1708b(String str, String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.f6848b = str;
            this.f6849c = appId;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new C1706E1(this.f6848b, this.f6849c);
        }
    }

    public C1706E1(String str, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f6846c = applicationId;
        this.f6845b = C52364yi6.m2860R(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new C1708b(this.f6845b, this.f6846c);
    }

    /* renamed from: a */
    public final String m109495a() {
        return this.f6845b;
    }

    /* renamed from: b */
    public final String m109494b() {
        return this.f6846c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1706E1)) {
            return false;
        }
        C1706E1 c1706e1 = (C1706E1) obj;
        if (!C52364yi6.m2851a(c1706e1.f6845b, this.f6845b) || !C52364yi6.m2851a(c1706e1.f6846c, this.f6846c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f6845b;
        return (str != null ? str.hashCode() : 0) ^ this.f6846c.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1706E1(AccessToken accessToken) {
        this(r3, r0);
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        String m52911m = accessToken.m52911m();
        String m52740f = C17216a.m52740f();
        Intrinsics.checkNotNullExpressionValue(m52740f, "FacebookSdk.getApplicationId()");
    }
}
