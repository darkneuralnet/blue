package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B4\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000eø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0016\u001a\u00020\u00128\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00180\u00178F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0019\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006 "}, m28432d2 = {"LGo2;", "", "LKS0;", "index", "LEo2;", C17296a.f69688o, "(I)LEo2;", "Lpo2;", "Lpo2;", "itemProvider", "LVn2;", "b", "LVn2;", "measureScope", "LCO2;", "c", "LCO2;", "measuredItemFactory", "Lkz0;", DateTokenConverter.CONVERTER_KEY, "J", "()J", "childConstraints", "", "", "()Ljava/util/Map;", "keyToIndexMap", "constraints", "", "isVertical", "<init>", "(JZLpo2;LVn2;LCO2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Go2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33145Go2 {

    /* renamed from: a */
    public final InterfaceC47085po2 f12480a;

    /* renamed from: b */
    public final InterfaceC36646Vn2 f12481b;

    /* renamed from: c */
    public final CO2 f12482c;

    /* renamed from: d */
    public final long f12483d;

    public /* synthetic */ C33145Go2(long j, boolean z, InterfaceC47085po2 interfaceC47085po2, InterfaceC36646Vn2 interfaceC36646Vn2, CO2 co2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, interfaceC47085po2, interfaceC36646Vn2, co2);
    }

    /* renamed from: a */
    public final C32677Eo2 m104711a(int i) {
        return this.f12482c.mo13625a(i, this.f12480a.mo15369c(i), this.f12481b.mo77829M(i, this.f12483d));
    }

    /* renamed from: b */
    public final long m104710b() {
        return this.f12483d;
    }

    /* renamed from: c */
    public final Map<Object, Integer> m104709c() {
        return this.f12480a.mo15370b();
    }

    public C33145Go2(long j, boolean z, InterfaceC47085po2 interfaceC47085po2, InterfaceC36646Vn2 interfaceC36646Vn2, CO2 co2) {
        this.f12480a = interfaceC47085po2;
        this.f12481b = interfaceC36646Vn2;
        this.f12482c = co2;
        this.f12483d = C46007nz0.m22042b(0, z ? C44228kz0.m28063n(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : C44228kz0.m28064m(j), 5, null);
    }
}
