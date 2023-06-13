package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lci3;", "LWX;", "Lbi3;", "opMode", "b", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Lbi3;", "()Lbi3;", "<init>", "(Lbi3;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ci3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39300ci3 implements InterfaceC9077WX {

    /* renamed from: a */
    public final EnumC38707bi3 f61089a;

    public C39300ci3(EnumC38707bi3 opMode) {
        Intrinsics.checkNotNullParameter(opMode, "opMode");
        this.f61089a = opMode;
    }

    public static /* synthetic */ C39300ci3 copy$default(C39300ci3 c39300ci3, EnumC38707bi3 enumC38707bi3, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC38707bi3 = c39300ci3.f61089a;
        }
        return c39300ci3.m61028b(enumC38707bi3);
    }

    @Override // p000.InterfaceC9077WX
    /* renamed from: a */
    public EnumC38707bi3 mo7691a() {
        return this.f61089a;
    }

    /* renamed from: b */
    public final C39300ci3 m61028b(EnumC38707bi3 opMode) {
        Intrinsics.checkNotNullParameter(opMode, "opMode");
        return new C39300ci3(opMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39300ci3) && this.f61089a == ((C39300ci3) obj).f61089a;
    }

    public int hashCode() {
        return this.f61089a.hashCode();
    }

    public String toString() {
        EnumC38707bi3 enumC38707bi3 = this.f61089a;
        return "OperationModeSettings(opMode=" + enumC38707bi3 + ")";
    }
}
