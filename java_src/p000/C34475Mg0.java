package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"LMg0;", "", "", "category", "", "checked", "", "order", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "c", "()Z", "I", DateTokenConverter.CONVERTER_KEY, "()I", "<init>", "(Ljava/lang/String;ZI)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mg0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34475Mg0 {

    /* renamed from: a */
    public final String f23387a;

    /* renamed from: b */
    public final boolean f23388b;

    /* renamed from: c */
    public final int f23389c;

    public C34475Mg0(String category, boolean z, int i) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f23387a = category;
        this.f23388b = z;
        this.f23389c = i;
    }

    public static /* synthetic */ C34475Mg0 copy$default(C34475Mg0 c34475Mg0, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c34475Mg0.f23387a;
        }
        if ((i2 & 2) != 0) {
            z = c34475Mg0.f23388b;
        }
        if ((i2 & 4) != 0) {
            i = c34475Mg0.f23389c;
        }
        return c34475Mg0.m95072a(str, z, i);
    }

    /* renamed from: a */
    public final C34475Mg0 m95072a(String category, boolean z, int i) {
        Intrinsics.checkNotNullParameter(category, "category");
        return new C34475Mg0(category, z, i);
    }

    /* renamed from: b */
    public final String m95071b() {
        return this.f23387a;
    }

    /* renamed from: c */
    public final boolean m95070c() {
        return this.f23388b;
    }

    /* renamed from: d */
    public final int m95069d() {
        return this.f23389c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34475Mg0) {
            C34475Mg0 c34475Mg0 = (C34475Mg0) obj;
            return Intrinsics.areEqual(this.f23387a, c34475Mg0.f23387a) && this.f23388b == c34475Mg0.f23388b && this.f23389c == c34475Mg0.f23389c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f23387a.hashCode() * 31;
        boolean z = this.f23388b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + Integer.hashCode(this.f23389c);
    }

    public String toString() {
        String str = this.f23387a;
        boolean z = this.f23388b;
        int i = this.f23389c;
        return "CategoryViewModel(category=" + str + ", checked=" + z + ", order=" + i + ")";
    }
}
