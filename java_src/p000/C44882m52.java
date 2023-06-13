package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"Lm52;", "", "", "textResId", "", "requiresFineStringToShow", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "I", "c", "()I", "b", "Z", "()Z", "<init>", "(IZ)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: m52  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44882m52 {

    /* renamed from: a */
    public final int f97313a;

    /* renamed from: b */
    public final boolean f97314b;

    public C44882m52(int i, boolean z) {
        this.f97313a = i;
        this.f97314b = z;
    }

    public static /* synthetic */ C44882m52 copy$default(C44882m52 c44882m52, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c44882m52.f97313a;
        }
        if ((i2 & 2) != 0) {
            z = c44882m52.f97314b;
        }
        return c44882m52.m26364a(i, z);
    }

    /* renamed from: a */
    public final C44882m52 m26364a(int i, boolean z) {
        return new C44882m52(i, z);
    }

    /* renamed from: b */
    public final boolean m26363b() {
        return this.f97314b;
    }

    /* renamed from: c */
    public final int m26362c() {
        return this.f97313a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44882m52) {
            C44882m52 c44882m52 = (C44882m52) obj;
            return this.f97313a == c44882m52.f97313a && this.f97314b == c44882m52.f97314b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f97313a) * 31;
        boolean z = this.f97314b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        int i = this.f97313a;
        boolean z = this.f97314b;
        return "InstructionsBodyLine(textResId=" + i + ", requiresFineStringToShow=" + z + ")";
    }

    public /* synthetic */ C44882m52(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z);
    }
}
