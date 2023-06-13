package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LIH1;", "", "", "title", "body", "", "showMainImage", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "c", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: IH1 */
/* loaded from: classes3.dex */
public final class IH1 {

    /* renamed from: a */
    public final String f15053a;

    /* renamed from: b */
    public final String f15054b;

    /* renamed from: c */
    public final boolean f15055c;

    public IH1() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ IH1 copy$default(IH1 ih1, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ih1.f15053a;
        }
        if ((i & 2) != 0) {
            str2 = ih1.f15054b;
        }
        if ((i & 4) != 0) {
            z = ih1.f15055c;
        }
        return ih1.m102625a(str, str2, z);
    }

    /* renamed from: a */
    public final IH1 m102625a(String str, String str2, boolean z) {
        return new IH1(str, str2, z);
    }

    /* renamed from: b */
    public final String m102624b() {
        return this.f15054b;
    }

    /* renamed from: c */
    public final boolean m102623c() {
        return this.f15055c;
    }

    /* renamed from: d */
    public final String m102622d() {
        return this.f15053a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IH1) {
            IH1 ih1 = (IH1) obj;
            return Intrinsics.areEqual(this.f15053a, ih1.f15053a) && Intrinsics.areEqual(this.f15054b, ih1.f15054b) && this.f15055c == ih1.f15055c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f15053a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f15054b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f15055c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f15053a;
        String str2 = this.f15054b;
        boolean z = this.f15055c;
        return "HeaderViewModel(title=" + str + ", body=" + str2 + ", showMainImage=" + z + ")";
    }

    public IH1(String str, String str2, boolean z) {
        this.f15053a = str;
        this.f15054b = str2;
        this.f15055c = z;
    }

    public /* synthetic */ IH1(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}
