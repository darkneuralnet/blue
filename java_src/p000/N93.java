package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"LN93;", "T", "LZ21;", "LWX;", "currentOpSettings", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "LWX;", "getCurrentOpSettings", "()LWX;", "<init>", "(LWX;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: N93 */
/* loaded from: classes2.dex */
public final class N93<T> implements Z21<T> {

    /* renamed from: b */
    public final InterfaceC9077WX f24198b;

    public N93(InterfaceC9077WX currentOpSettings) {
        Intrinsics.checkNotNullParameter(currentOpSettings, "currentOpSettings");
        this.f24198b = currentOpSettings;
    }

    public static /* synthetic */ N93 copy$default(N93 n93, InterfaceC9077WX interfaceC9077WX, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC9077WX = n93.f24198b;
        }
        return n93.m94306a(interfaceC9077WX);
    }

    /* renamed from: a */
    public final N93<T> m94306a(InterfaceC9077WX currentOpSettings) {
        Intrinsics.checkNotNullParameter(currentOpSettings, "currentOpSettings");
        return new N93<>(currentOpSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N93) && Intrinsics.areEqual(this.f24198b, ((N93) obj).f24198b);
    }

    public int hashCode() {
        return this.f24198b.hashCode();
    }

    public String toString() {
        InterfaceC9077WX interfaceC9077WX = this.f24198b;
        return "NotScanning(currentOpSettings=" + interfaceC9077WX + ")";
    }
}
