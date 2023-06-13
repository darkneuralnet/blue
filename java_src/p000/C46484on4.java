package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"Lon4;", "", "", C17296a.f69688o, "", "b", "label", "rating", "c", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "I", DateTokenConverter.CONVERTER_KEY, "()I", "<init>", "(Ljava/lang/String;I)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: on4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46484on4 {

    /* renamed from: a */
    public final String f102493a;

    /* renamed from: b */
    public final int f102494b;

    public C46484on4(String label, int i) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f102493a = label;
        this.f102494b = i;
    }

    public static /* synthetic */ C46484on4 copy$default(C46484on4 c46484on4, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c46484on4.f102493a;
        }
        if ((i2 & 2) != 0) {
            i = c46484on4.f102494b;
        }
        return c46484on4.m20492c(str, i);
    }

    /* renamed from: a */
    public final String m20494a() {
        return this.f102493a;
    }

    /* renamed from: b */
    public final int m20493b() {
        return this.f102494b;
    }

    /* renamed from: c */
    public final C46484on4 m20492c(String label, int i) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new C46484on4(label, i);
    }

    /* renamed from: d */
    public final int m20491d() {
        return this.f102494b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46484on4) {
            C46484on4 c46484on4 = (C46484on4) obj;
            return Intrinsics.areEqual(this.f102493a, c46484on4.f102493a) && this.f102494b == c46484on4.f102494b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f102493a.hashCode() * 31) + Integer.hashCode(this.f102494b);
    }

    public String toString() {
        String str = this.f102493a;
        int i = this.f102494b;
        return "RatingViewModel(label=" + str + ", rating=" + i + ")";
    }
}
