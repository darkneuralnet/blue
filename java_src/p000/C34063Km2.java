package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J!\u0010\t\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000b*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"LKm2;", "LP9;", "LH83;", "LL9;", "alignmentLine", "", "i", "LCe3;", "position", DateTokenConverter.CONVERTER_KEY, "(LH83;J)J", "", "e", "(LH83;)Ljava/util/Map;", "alignmentLinesMap", "LQ9;", "alignmentLinesOwner", "<init>", "(LQ9;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Km2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34063Km2 extends AbstractC6277P9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34063Km2(InterfaceC6687Q9 alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
        Intrinsics.checkNotNullParameter(alignmentLinesOwner, "alignmentLinesOwner");
    }

    @Override // p000.AbstractC6277P9
    /* renamed from: d */
    public long mo87204d(H83 calculatePositionInParent, long j) {
        Intrinsics.checkNotNullParameter(calculatePositionInParent, "$this$calculatePositionInParent");
        return calculatePositionInParent.m104333P2(j);
    }

    @Override // p000.AbstractC6277P9
    /* renamed from: e */
    public Map<AbstractC4750L9, Integer> mo87203e(H83 h83) {
        Intrinsics.checkNotNullParameter(h83, "<this>");
        return h83.mo84221s1().mo1428d();
    }

    @Override // p000.AbstractC6277P9
    /* renamed from: i */
    public int mo87202i(H83 h83, AbstractC4750L9 alignmentLine) {
        Intrinsics.checkNotNullParameter(h83, "<this>");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return h83.mo35854v(alignmentLine);
    }
}
