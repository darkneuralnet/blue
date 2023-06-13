package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC34649Mz3;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u000e\u0012\u0006\u0010\b\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, m28432d2 = {"Lbc5;", "LKC0;", "LxB5;", "size", "", "topStart", "topEnd", "bottomEnd", "bottomStart", "Lpm2;", "layoutDirection", "LMz3;", DateTokenConverter.CONVERTER_KEY, "(JFFFFLpm2;)LMz3;", "LOC0;", "i", "", "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "<init>", "(LOC0;LOC0;LOC0;LOC0;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bc5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38649bc5 extends KC0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38649bc5(OC0 topStart, OC0 topEnd, OC0 bottomEnd, OC0 bottomStart) {
        super(topStart, topEnd, bottomEnd, bottomStart);
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
    }

    @Override // p000.KC0
    /* renamed from: d */
    public AbstractC34649Mz3 mo64274d(long j, float f, float f2, float f3, float f4, EnumC47065pm2 layoutDirection) {
        boolean z;
        float f5;
        float f6;
        float f7;
        float f8;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (f + f2 + f3 + f4 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new AbstractC34649Mz3.C5446b(CB5.m112661c(j));
        }
        C35055Os4 m112661c = CB5.m112661c(j);
        EnumC47065pm2 enumC47065pm2 = EnumC47065pm2.Ltr;
        if (layoutDirection == enumC47065pm2) {
            f5 = f;
        } else {
            f5 = f2;
        }
        long m95598b = MC0.m95598b(f5, 0.0f, 2, null);
        if (layoutDirection == enumC47065pm2) {
            f6 = f2;
        } else {
            f6 = f;
        }
        long m95598b2 = MC0.m95598b(f6, 0.0f, 2, null);
        if (layoutDirection == enumC47065pm2) {
            f7 = f3;
        } else {
            f7 = f4;
        }
        long m95598b3 = MC0.m95598b(f7, 0.0f, 2, null);
        if (layoutDirection == enumC47065pm2) {
            f8 = f4;
        } else {
            f8 = f3;
        }
        return new AbstractC34649Mz3.C5447c(C37477Zb5.m72901b(m112661c, m95598b, m95598b2, m95598b3, MC0.m95598b(f8, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38649bc5)) {
            return false;
        }
        C38649bc5 c38649bc5 = (C38649bc5) obj;
        if (Intrinsics.areEqual(m99101h(), c38649bc5.m99101h()) && Intrinsics.areEqual(m99102g(), c38649bc5.m99102g()) && Intrinsics.areEqual(m99104e(), c38649bc5.m99104e()) && Intrinsics.areEqual(m99103f(), c38649bc5.m99103f())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((m99101h().hashCode() * 31) + m99102g().hashCode()) * 31) + m99104e().hashCode()) * 31) + m99103f().hashCode();
    }

    @Override // p000.KC0
    /* renamed from: i */
    public C38649bc5 mo64275b(OC0 topStart, OC0 topEnd, OC0 bottomEnd, OC0 bottomStart) {
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
        return new C38649bc5(topStart, topEnd, bottomEnd, bottomStart);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + m99101h() + ", topEnd = " + m99102g() + ", bottomEnd = " + m99104e() + ", bottomStart = " + m99103f() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
