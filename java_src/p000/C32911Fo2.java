package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00198F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, m28432d2 = {"LFo2;", "", "Luc2;", "index", "", "mainAxisSpacing", "Lkz0;", "constraints", "Lyn2;", C17296a.f69688o, "(IIJ)Lyn2;", "Lon2;", "Lon2;", "itemProvider", "LVn2;", "b", "LVn2;", "measureScope", "c", "I", "defaultMainAxisSpacing", "LBO2;", DateTokenConverter.CONVERTER_KEY, "LBO2;", "measuredItemFactory", "", "()Ljava/util/Map;", "keyToIndexMap", "<init>", "(Lon2;LVn2;ILBO2;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32911Fo2 {

    /* renamed from: a */
    public final InterfaceC46482on2 f10249a;

    /* renamed from: b */
    public final InterfaceC36646Vn2 f10250b;

    /* renamed from: c */
    public final int f10251c;

    /* renamed from: d */
    public final BO2 f10252d;

    public C32911Fo2(InterfaceC46482on2 itemProvider, InterfaceC36646Vn2 measureScope, int i, BO2 measuredItemFactory) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        Intrinsics.checkNotNullParameter(measuredItemFactory, "measuredItemFactory");
        this.f10249a = itemProvider;
        this.f10250b = measureScope;
        this.f10251c = i;
        this.f10252d = measuredItemFactory;
    }

    /* renamed from: b */
    public static /* synthetic */ C52410yn2 m106442b(C32911Fo2 c32911Fo2, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = c32911Fo2.f10251c;
        }
        return c32911Fo2.m106443a(i, i2, j);
    }

    /* renamed from: a */
    public final C52410yn2 m106443a(int i, int i2, long j) {
        int m28062o;
        Object mo15369c = this.f10249a.mo15369c(i);
        List<OU3> mo77829M = this.f10250b.mo77829M(i, j);
        if (C44228kz0.m28065l(j)) {
            m28062o = C44228kz0.m28061p(j);
        } else if (C44228kz0.m28066k(j)) {
            m28062o = C44228kz0.m28062o(j);
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return this.f10252d.mo9770a(i, mo15369c, m28062o, i2, mo77829M);
    }

    /* renamed from: c */
    public final Map<Object, Integer> m106441c() {
        return this.f10249a.mo15370b();
    }
}
