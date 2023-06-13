package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u001d\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001d\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, m28432d2 = {"LsY0;", "LTm4;", "", "enabled", "selected", "LsP5;", "Lpm0;", C17296a.f69688o, "(ZZLEt0;I)LsP5;", "", LegacyRepairType.OTHER_KEY, "equals", "", "hashCode", "J", "selectedColor", "b", "unselectedColor", "c", "disabledColor", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sY0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48703sY0 implements InterfaceC36171Tm4 {

    /* renamed from: a */
    public final long f108952a;

    /* renamed from: b */
    public final long f108953b;

    /* renamed from: c */
    public final long f108954c;

    public /* synthetic */ C48703sY0(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    @Override // p000.InterfaceC36171Tm4
    /* renamed from: a */
    public InterfaceC48627sP5<C47063pm0> mo14058a(boolean z, boolean z2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        InterfaceC48627sP5<C47063pm0> m105193n;
        interfaceC32720Et0.mo89638F(1243421834);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1243421834, i, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:187)");
        }
        if (!z) {
            j = this.f108954c;
        } else if (!z2) {
            j = this.f108953b;
        } else {
            j = this.f108952a;
        }
        long j2 = j;
        if (z) {
            interfaceC32720Et0.mo89638F(-1052799107);
            m105193n = C46130oB5.m21645a(j2, C26160mf.m25219k(100, 0, null, 6, null), null, interfaceC32720Et0, 48, 4);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-1052799002);
            m105193n = GM5.m105193n(C47063pm0.m18747i(j2), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C48703sY0.class != obj.getClass()) {
            return false;
        }
        C48703sY0 c48703sY0 = (C48703sY0) obj;
        if (C47063pm0.m18741o(this.f108952a, c48703sY0.f108952a) && C47063pm0.m18741o(this.f108953b, c48703sY0.f108953b) && C47063pm0.m18741o(this.f108954c, c48703sY0.f108954c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((C47063pm0.m18735u(this.f108952a) * 31) + C47063pm0.m18735u(this.f108953b)) * 31) + C47063pm0.m18735u(this.f108954c);
    }

    public C48703sY0(long j, long j2, long j3) {
        this.f108952a = j;
        this.f108953b = j2;
        this.f108954c = j3;
    }
}
