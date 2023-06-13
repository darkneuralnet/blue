package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m28432d2 = {"LG61;", "LD61;", "LT42;", "LiA0;", "", "y", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "LEc;", "c", "LEc;", "overscrollEffect", "Lkotlin/Function1;", "LS42;", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(LEc;Lkotlin/jvm/functions/Function1;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: G61 */
/* loaded from: classes.dex */
public final class G61 extends T42 implements D61 {

    /* renamed from: c */
    public final C1906Ec f10957c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G61(C1906Ec overscrollEffect, Function1<? super S42, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(overscrollEffect, "overscrollEffect");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f10957c = overscrollEffect;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G61)) {
            return false;
        }
        return Intrinsics.areEqual(this.f10957c, ((G61) obj).f10957c);
    }

    public int hashCode() {
        return this.f10957c.hashCode();
    }

    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f10957c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.D61
    /* renamed from: y */
    public void mo72302y(InterfaceC42558iA0 interfaceC42558iA0) {
        Intrinsics.checkNotNullParameter(interfaceC42558iA0, "<this>");
        interfaceC42558iA0.mo34387n0();
        this.f10957c.m108665w(interfaceC42558iA0);
    }
}
