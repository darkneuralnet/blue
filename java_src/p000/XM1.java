package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m28432d2 = {"LXM1;", "LSE3;", "LT42;", "Lg01;", "", "parentData", "LXc5;", C17296a.f69688o, LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "LK9$b;", "c", "LK9$b;", "getHorizontal", "()LK9$b;", "horizontal", "Lkotlin/Function1;", "LS42;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(LK9$b;Lkotlin/jvm/functions/Function1;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XM1 */
/* loaded from: classes.dex */
public final class XM1 extends T42 implements SE3 {

    /* renamed from: c */
    public final InterfaceC4360K9.InterfaceC4362b f43081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XM1(InterfaceC4360K9.InterfaceC4362b horizontal, Function1<? super S42, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(horizontal, "horizontal");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f43081c = horizontal;
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
        c37018Xc5.m76756d(QE0.f30070a.m88712a(this.f43081c));
        return c37018Xc5;
    }

    public boolean equals(Object obj) {
        XM1 xm1;
        if (this == obj) {
            return true;
        }
        if (obj instanceof XM1) {
            xm1 = (XM1) obj;
        } else {
            xm1 = null;
        }
        if (xm1 == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f43081c, xm1.f43081c);
    }

    public int hashCode() {
        return this.f43081c.hashCode();
    }

    public String toString() {
        return "HorizontalAlignModifier(horizontal=" + this.f43081c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
