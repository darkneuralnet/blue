package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"LKL;", "", "", "versionLabel", "", "showUpdateAvailable", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Z", "()Z", "<init>", "(Ljava/lang/String;Z)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KL */
/* loaded from: classes3.dex */
public final class C4396KL {

    /* renamed from: a */
    public final String f19449a;

    /* renamed from: b */
    public final boolean f19450b;

    public C4396KL(String str, boolean z) {
        this.f19449a = str;
        this.f19450b = z;
    }

    public static /* synthetic */ C4396KL copy$default(C4396KL c4396kl, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4396kl.f19449a;
        }
        if ((i & 2) != 0) {
            z = c4396kl.f19450b;
        }
        return c4396kl.m99009a(str, z);
    }

    /* renamed from: a */
    public final C4396KL m99009a(String str, boolean z) {
        return new C4396KL(str, z);
    }

    /* renamed from: b */
    public final boolean m99008b() {
        return this.f19450b;
    }

    /* renamed from: c */
    public final String m99007c() {
        return this.f19449a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4396KL) {
            C4396KL c4396kl = (C4396KL) obj;
            return Intrinsics.areEqual(this.f19449a, c4396kl.f19449a) && this.f19450b == c4396kl.f19450b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f19449a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.f19450b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f19449a;
        boolean z = this.f19450b;
        return "BirdFirmwareViewModel(versionLabel=" + str + ", showUpdateAvailable=" + z + ")";
    }

    public /* synthetic */ C4396KL(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, z);
    }
}
