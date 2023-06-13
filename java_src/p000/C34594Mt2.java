package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"LMt2;", "T", "LZ21;", "LWX;", "currentOpSettings", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "LWX;", "getCurrentOpSettings", "()LWX;", "<init>", "(LWX;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mt2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34594Mt2<T> implements Z21<T> {

    /* renamed from: b */
    public final InterfaceC9077WX f23730b;

    public C34594Mt2(InterfaceC9077WX currentOpSettings) {
        Intrinsics.checkNotNullParameter(currentOpSettings, "currentOpSettings");
        this.f23730b = currentOpSettings;
    }

    public static /* synthetic */ C34594Mt2 copy$default(C34594Mt2 c34594Mt2, InterfaceC9077WX interfaceC9077WX, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC9077WX = c34594Mt2.f23730b;
        }
        return c34594Mt2.m94635a(interfaceC9077WX);
    }

    /* renamed from: a */
    public final C34594Mt2<T> m94635a(InterfaceC9077WX currentOpSettings) {
        Intrinsics.checkNotNullParameter(currentOpSettings, "currentOpSettings");
        return new C34594Mt2<>(currentOpSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34594Mt2) && Intrinsics.areEqual(this.f23730b, ((C34594Mt2) obj).f23730b);
    }

    public int hashCode() {
        return this.f23730b.hashCode();
    }

    public String toString() {
        InterfaceC9077WX interfaceC9077WX = this.f23730b;
        return "LoadingResult(currentOpSettings=" + interfaceC9077WX + ")";
    }
}
