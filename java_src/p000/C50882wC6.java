package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LwC6;", "", "", "url", "type", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wC6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50882wC6 {
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final String type;
    @JsonProperty("url")
    @InterfaceC41208ft5("url")
    private final String url;

    public C50882wC6() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ C50882wC6 copy$default(C50882wC6 c50882wC6, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c50882wC6.url;
        }
        if ((i & 2) != 0) {
            str2 = c50882wC6.type;
        }
        return c50882wC6.m7262a(str, str2);
    }

    /* renamed from: a */
    public final C50882wC6 m7262a(String str, String str2) {
        return new C50882wC6(str, str2);
    }

    /* renamed from: b */
    public final String m7261b() {
        return this.type;
    }

    /* renamed from: c */
    public final String m7260c() {
        return this.url;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50882wC6) {
            C50882wC6 c50882wC6 = (C50882wC6) obj;
            return Intrinsics.areEqual(this.url, c50882wC6.url) && Intrinsics.areEqual(this.type, c50882wC6.type);
        }
        return false;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.url;
        String str2 = this.type;
        return "WireWebArchiveResponse(url=" + str + ", type=" + str2 + ")";
    }

    public C50882wC6(String str, String str2) {
        this.url = str;
        this.type = str2;
    }

    public /* synthetic */ C50882wC6(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
