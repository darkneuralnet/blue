package bo.app;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¨\u0006\u000e"}, m28432d2 = {"Lbo/app/i;", "LaP1;", "", "toString", "e", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "apiKey", "<init>", "(Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.i */
/* loaded from: classes.dex */
public final class C12730i implements InterfaceC37933aP1<String> {

    /* renamed from: b */
    private final String f58624b;

    public C12730i(String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f58624b = apiKey;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public String forJsonPut() {
        return this.f58624b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12730i) && Intrinsics.areEqual(this.f58624b, ((C12730i) obj).f58624b);
    }

    public int hashCode() {
        return this.f58624b.hashCode();
    }

    public String toString() {
        return this.f58624b;
    }
}
