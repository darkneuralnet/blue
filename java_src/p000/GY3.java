package p000;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.services.p026s3.util.Mimetypes;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u001b"}, m28432d2 = {"LGY3;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", "mimeType", "b", "getText", Entry.TYPE_TEXT, "c", "getComment", "comment", "LNE3;", "params", "<init>", "(Ljava/lang/String;LNE3;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GY3 */
/* loaded from: classes5.dex */
public final class GY3 {
    @InterfaceC41208ft5("mimeType")

    /* renamed from: a */
    public final String f12069a;
    @InterfaceC41208ft5(Entry.TYPE_TEXT)

    /* renamed from: b */
    public final String f12070b;
    @InterfaceC41208ft5("comment")

    /* renamed from: c */
    public final String f12071c;

    public GY3(String mimeType, NE3 ne3, String str, String str2) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.f12069a = mimeType;
        this.f12070b = str;
        this.f12071c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GY3) {
            GY3 gy3 = (GY3) obj;
            return Intrinsics.areEqual(this.f12069a, gy3.f12069a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f12070b, gy3.f12070b) && Intrinsics.areEqual(this.f12071c, gy3.f12071c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f12069a.hashCode() * 31) + 0) * 31;
        String str = this.f12070b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12071c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f12069a;
        String str2 = this.f12070b;
        String str3 = this.f12071c;
        return "PostData(mimeType=" + str + ", params=" + ((Object) null) + ", text=" + str2 + ", comment=" + str3 + ")";
    }

    public /* synthetic */ GY3(String str, NE3 ne3, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : ne3, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GY3(HttpTransaction transaction) {
        this(r0 == null ? Mimetypes.MIMETYPE_OCTET_STREAM : r0, null, transaction.getRequestBody(), null, 10, null);
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String requestContentType = transaction.getRequestContentType();
    }
}
