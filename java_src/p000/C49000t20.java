package p000;

import bo.app.C13147t4;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\r"}, m28432d2 = {"Lt20;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lbo/app/t4;", "sdkAuthError", "<init>", "(Lbo/app/t4;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: t20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49000t20 {

    /* renamed from: a */
    public final C13147t4 f109759a;

    public C49000t20(C13147t4 sdkAuthError) {
        Intrinsics.checkNotNullParameter(sdkAuthError, "sdkAuthError");
        this.f109759a = sdkAuthError;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C49000t20) && Intrinsics.areEqual(this.f109759a, ((C49000t20) obj).f109759a);
    }

    public int hashCode() {
        return this.f109759a.hashCode();
    }

    public String toString() {
        return this.f109759a.toString();
    }
}
