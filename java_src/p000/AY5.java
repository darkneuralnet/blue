package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ComplaintResolutionField;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001b"}, m28432d2 = {"LAY5;", "", "", "header", "", "required", "Lco/bird/android/model/constant/ComplaintResolutionField;", "field", "url", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "Lco/bird/android/model/constant/ComplaintResolutionField;", "()Lco/bird/android/model/constant/ComplaintResolutionField;", "e", "<init>", "(Ljava/lang/String;ZLco/bird/android/model/constant/ComplaintResolutionField;Ljava/lang/String;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AY5 */
/* loaded from: classes3.dex */
public final class AY5 {

    /* renamed from: a */
    public final String f777a;

    /* renamed from: b */
    public final boolean f778b;

    /* renamed from: c */
    public final ComplaintResolutionField f779c;

    /* renamed from: d */
    public final String f780d;

    public AY5(String header, boolean z, ComplaintResolutionField field, String str) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(field, "field");
        this.f777a = header;
        this.f778b = z;
        this.f779c = field;
        this.f780d = str;
    }

    public static /* synthetic */ AY5 copy$default(AY5 ay5, String str, boolean z, ComplaintResolutionField complaintResolutionField, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ay5.f777a;
        }
        if ((i & 2) != 0) {
            z = ay5.f778b;
        }
        if ((i & 4) != 0) {
            complaintResolutionField = ay5.f779c;
        }
        if ((i & 8) != 0) {
            str2 = ay5.f780d;
        }
        return ay5.m115561a(str, z, complaintResolutionField, str2);
    }

    /* renamed from: a */
    public final AY5 m115561a(String header, boolean z, ComplaintResolutionField field, String str) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(field, "field");
        return new AY5(header, z, field, str);
    }

    /* renamed from: b */
    public final ComplaintResolutionField m115560b() {
        return this.f779c;
    }

    /* renamed from: c */
    public final String m115559c() {
        return this.f777a;
    }

    /* renamed from: d */
    public final boolean m115558d() {
        return this.f778b;
    }

    /* renamed from: e */
    public final String m115557e() {
        return this.f780d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AY5) {
            AY5 ay5 = (AY5) obj;
            return Intrinsics.areEqual(this.f777a, ay5.f777a) && this.f778b == ay5.f778b && this.f779c == ay5.f779c && Intrinsics.areEqual(this.f780d, ay5.f780d);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f777a.hashCode() * 31;
        boolean z = this.f778b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.f779c.hashCode()) * 31;
        String str = this.f780d;
        return hashCode2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f777a;
        boolean z = this.f778b;
        ComplaintResolutionField complaintResolutionField = this.f779c;
        String str2 = this.f780d;
        return "TakePhotoViewModel(header=" + str + ", required=" + z + ", field=" + complaintResolutionField + ", url=" + str2 + ")";
    }

    public /* synthetic */ AY5(String str, boolean z, ComplaintResolutionField complaintResolutionField, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, complaintResolutionField, (i & 8) != 0 ? null : str2);
    }
}
