package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u0018"}, m28432d2 = {"LTS5;", "", "", "title", "message", "", "showHelpButton", "helpArticleId", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "c", "Z", "()Z", "getHelpArticleId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "core-basemvp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TS5 */
/* loaded from: classes2.dex */
public final class TS5 {

    /* renamed from: a */
    public final String f35505a;

    /* renamed from: b */
    public final String f35506b;

    /* renamed from: c */
    public final boolean f35507c;

    /* renamed from: d */
    public final String f35508d;

    public TS5(String title, String message, boolean z, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f35505a = title;
        this.f35506b = message;
        this.f35507c = z;
        this.f35508d = str;
    }

    public static /* synthetic */ TS5 copy$default(TS5 ts5, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ts5.f35505a;
        }
        if ((i & 2) != 0) {
            str2 = ts5.f35506b;
        }
        if ((i & 4) != 0) {
            z = ts5.f35507c;
        }
        if ((i & 8) != 0) {
            str3 = ts5.f35508d;
        }
        return ts5.m83591a(str, str2, z, str3);
    }

    /* renamed from: a */
    public final TS5 m83591a(String title, String message, boolean z, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        return new TS5(title, message, z, str);
    }

    /* renamed from: b */
    public final String m83590b() {
        return this.f35506b;
    }

    /* renamed from: c */
    public final boolean m83589c() {
        return this.f35507c;
    }

    /* renamed from: d */
    public final String m83588d() {
        return this.f35505a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TS5) {
            TS5 ts5 = (TS5) obj;
            return Intrinsics.areEqual(this.f35505a, ts5.f35505a) && Intrinsics.areEqual(this.f35506b, ts5.f35506b) && this.f35507c == ts5.f35507c && Intrinsics.areEqual(this.f35508d, ts5.f35508d);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f35505a.hashCode() * 31) + this.f35506b.hashCode()) * 31;
        boolean z = this.f35507c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.f35508d;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f35505a;
        String str2 = this.f35506b;
        boolean z = this.f35507c;
        String str3 = this.f35508d;
        return "StyledError(title=" + str + ", message=" + str2 + ", showHelpButton=" + z + ", helpArticleId=" + str3 + ")";
    }

    public /* synthetic */ TS5(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3);
    }
}
