package okhttp3.internal.http2;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.M70;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m28432d2 = {"Lokhttp3/internal/http2/Header;", "", "", "toString", "LM70;", "component1", "component2", "name", "value", "copy", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LM70;", "hpackSize", "I", "<init>", "(LM70;LM70;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(LM70;Ljava/lang/String;)V", "Companion", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class Header {
    public static final Companion Companion = new Companion(null);
    @JvmField
    public static final M70 PSEUDO_PREFIX;
    @JvmField
    public static final M70 RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    @JvmField
    public static final M70 TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    @JvmField
    public static final M70 TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    @JvmField
    public static final M70 TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    @JvmField
    public static final M70 TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    @JvmField
    public final int hpackSize;
    @JvmField
    public final M70 name;
    @JvmField
    public final M70 value;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0013"}, m28432d2 = {"Lokhttp3/internal/http2/Header$Companion;", "", "LM70;", "PSEUDO_PREFIX", "LM70;", "RESPONSE_STATUS", "", "RESPONSE_STATUS_UTF8", "Ljava/lang/String;", "TARGET_AUTHORITY", "TARGET_AUTHORITY_UTF8", "TARGET_METHOD", "TARGET_METHOD_UTF8", "TARGET_PATH", "TARGET_PATH_UTF8", "TARGET_SCHEME", "TARGET_SCHEME_UTF8", "<init>", "()V", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        M70.C5195a c5195a = M70.f22644e;
        PSEUDO_PREFIX = c5195a.m95794d(":");
        RESPONSE_STATUS = c5195a.m95794d(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = c5195a.m95794d(TARGET_METHOD_UTF8);
        TARGET_PATH = c5195a.m95794d(TARGET_PATH_UTF8);
        TARGET_SCHEME = c5195a.m95794d(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = c5195a.m95794d(TARGET_AUTHORITY_UTF8);
    }

    public Header(M70 name, M70 value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.size() + 32 + value.size();
    }

    public static /* synthetic */ Header copy$default(Header header, M70 m70, M70 m702, int i, Object obj) {
        if ((i & 1) != 0) {
            m70 = header.name;
        }
        if ((i & 2) != 0) {
            m702 = header.value;
        }
        return header.copy(m70, m702);
    }

    public final M70 component1() {
        return this.name;
    }

    public final M70 component2() {
        return this.value;
    }

    public final Header copy(M70 name, M70 value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new Header(name, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Header) {
            Header header = (Header) obj;
            return Intrinsics.areEqual(this.name, header.name) && Intrinsics.areEqual(this.value, header.value);
        }
        return false;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return this.name.m95798w() + ": " + this.value.m95798w();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Header(String name, String value) {
        this(r0.m95794d(name), r0.m95794d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        M70.C5195a c5195a = M70.f22644e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(M70 name, String value) {
        this(name, M70.f22644e.m95794d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
