package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m28432d2 = {"Lc30;", "LH16;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "LLx5;", "b", "LLx5;", "e", "()LLx5;", "value", "", "c", "F", "h", "()F", "alpha", "Lpm0;", C17296a.f69688o, "()J", "color", "La30;", DateTokenConverter.CONVERTER_KEY, "()La30;", "brush", "<init>", "(LLx5;F)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: c30  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38913c30 implements H16 {

    /* renamed from: b */
    public final AbstractC34399Lx5 f60012b;

    /* renamed from: c */
    public final float f60013c;

    public C38913c30(AbstractC34399Lx5 value, float f) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f60012b = value;
        this.f60013c = f;
    }

    @Override // p000.H16
    /* renamed from: a */
    public long mo61991a() {
        return C47063pm0.f104050b.m18726g();
    }

    @Override // p000.H16
    /* renamed from: d */
    public AbstractC37727a30 mo61990d() {
        return this.f60012b;
    }

    /* renamed from: e */
    public final AbstractC34399Lx5 m61989e() {
        return this.f60012b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38913c30) {
            C38913c30 c38913c30 = (C38913c30) obj;
            return Intrinsics.areEqual(this.f60012b, c38913c30.f60012b) && Float.compare(mo61988h(), c38913c30.mo61988h()) == 0;
        }
        return false;
    }

    @Override // p000.H16
    /* renamed from: h */
    public float mo61988h() {
        return this.f60013c;
    }

    public int hashCode() {
        return (this.f60012b.hashCode() * 31) + Float.hashCode(mo61988h());
    }

    public String toString() {
        return "BrushStyle(value=" + this.f60012b + ", alpha=" + mo61988h() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
