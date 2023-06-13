package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u00020\n8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, m28432d2 = {"LHm0;", "LH16;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lpm0;", "b", "J", "getValue-0d7_KjU", "()J", "value", C17296a.f69688o, "color", "La30;", DateTokenConverter.CONVERTER_KEY, "()La30;", "brush", "", "h", "()F", "alpha", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,148:1\n646#2:149\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n*L\n94#1:149\n*E\n"})
/* renamed from: Hm0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33359Hm0 implements H16 {

    /* renamed from: b */
    public final long f13872b;

    public /* synthetic */ C33359Hm0(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // p000.H16
    /* renamed from: a */
    public long mo61991a() {
        return this.f13872b;
    }

    @Override // p000.H16
    /* renamed from: d */
    public AbstractC37727a30 mo61990d() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33359Hm0) && C47063pm0.m18741o(this.f13872b, ((C33359Hm0) obj).f13872b);
    }

    @Override // p000.H16
    /* renamed from: h */
    public float mo61988h() {
        return C47063pm0.m18740p(mo61991a());
    }

    public int hashCode() {
        return C47063pm0.m18735u(this.f13872b);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) C47063pm0.m18734v(this.f13872b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C33359Hm0(long j) {
        this.f13872b = j;
        if (!(j != C47063pm0.f104050b.m18726g())) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }
}
