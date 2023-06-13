package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0002\b\u001d¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, m28432d2 = {"LVm2;", "LSE3;", "LT42;", "Lg01;", "", "parentData", "LXc5;", C17296a.f69688o, LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "", "c", "F", "getWeight", "()F", "weight", DateTokenConverter.CONVERTER_KEY, "Z", "getFill", "()Z", "fill", "Lkotlin/Function1;", "LS42;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(FZLkotlin/jvm/functions/Function1;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36637Vm2 extends T42 implements SE3 {

    /* renamed from: c */
    public final float f39735c;

    /* renamed from: d */
    public final boolean f39736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36637Vm2(float f, boolean z, Function1<? super S42, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f39735c = f;
        this.f39736d = z;
    }

    @Override // p000.SE3
    /* renamed from: a */
    public C37018Xc5 mo62029B(InterfaceC41273g01 interfaceC41273g01, Object obj) {
        C37018Xc5 c37018Xc5;
        Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
        if (obj instanceof C37018Xc5) {
            c37018Xc5 = (C37018Xc5) obj;
        } else {
            c37018Xc5 = null;
        }
        if (c37018Xc5 == null) {
            c37018Xc5 = new C37018Xc5(0.0f, false, null, 7, null);
        }
        c37018Xc5.m76754f(this.f39735c);
        c37018Xc5.m76755e(this.f39736d);
        return c37018Xc5;
    }

    public boolean equals(Object obj) {
        C36637Vm2 c36637Vm2;
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36637Vm2) {
            c36637Vm2 = (C36637Vm2) obj;
        } else {
            c36637Vm2 = null;
        }
        if (c36637Vm2 == null) {
            return false;
        }
        if (this.f39735c == c36637Vm2.f39735c) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f39736d == c36637Vm2.f39736d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f39735c) * 31) + Boolean.hashCode(this.f39736d);
    }

    public String toString() {
        return "LayoutWeightImpl(weight=" + this.f39735c + ", fill=" + this.f39736d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
