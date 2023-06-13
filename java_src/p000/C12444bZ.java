package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"LbZ;", "", "LcJ3;", "g", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LMW1;", C17296a.f69688o, "LMW1;", "imageBitmap", "Lme0;", "b", "Lme0;", "canvas", "Loe0;", "c", "Loe0;", "canvasDrawScope", DateTokenConverter.CONVERTER_KEY, "LcJ3;", "borderPath", "<init>", "(LMW1;Lme0;Loe0;LcJ3;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,459:1\n1#2:460\n558#3,17:461\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n*L\n207#1:461,17\n*E\n"})
/* renamed from: bZ */
/* loaded from: classes.dex */
public final class C12444bZ {

    /* renamed from: a */
    public MW1 f57686a;

    /* renamed from: b */
    public InterfaceC45204me0 f57687b;

    /* renamed from: c */
    public C46390oe0 f57688c;

    /* renamed from: d */
    public InterfaceC39067cJ3 f57689d;

    public C12444bZ() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12444bZ) {
            C12444bZ c12444bZ = (C12444bZ) obj;
            return Intrinsics.areEqual(this.f57686a, c12444bZ.f57686a) && Intrinsics.areEqual(this.f57687b, c12444bZ.f57687b) && Intrinsics.areEqual(this.f57688c, c12444bZ.f57688c) && Intrinsics.areEqual(this.f57689d, c12444bZ.f57689d);
        }
        return false;
    }

    /* renamed from: g */
    public final InterfaceC39067cJ3 m64369g() {
        InterfaceC39067cJ3 interfaceC39067cJ3 = this.f57689d;
        if (interfaceC39067cJ3 == null) {
            InterfaceC39067cJ3 m12007a = C28793td.m12007a();
            this.f57689d = m12007a;
            return m12007a;
        }
        return interfaceC39067cJ3;
    }

    public int hashCode() {
        MW1 mw1 = this.f57686a;
        int hashCode = (mw1 == null ? 0 : mw1.hashCode()) * 31;
        InterfaceC45204me0 interfaceC45204me0 = this.f57687b;
        int hashCode2 = (hashCode + (interfaceC45204me0 == null ? 0 : interfaceC45204me0.hashCode())) * 31;
        C46390oe0 c46390oe0 = this.f57688c;
        int hashCode3 = (hashCode2 + (c46390oe0 == null ? 0 : c46390oe0.hashCode())) * 31;
        InterfaceC39067cJ3 interfaceC39067cJ3 = this.f57689d;
        return hashCode3 + (interfaceC39067cJ3 != null ? interfaceC39067cJ3.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f57686a + ", canvas=" + this.f57687b + ", canvasDrawScope=" + this.f57688c + ", borderPath=" + this.f57689d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C12444bZ(MW1 mw1, InterfaceC45204me0 interfaceC45204me0, C46390oe0 c46390oe0, InterfaceC39067cJ3 interfaceC39067cJ3) {
        this.f57686a = mw1;
        this.f57687b = interfaceC45204me0;
        this.f57688c = c46390oe0;
        this.f57689d = interfaceC39067cJ3;
    }

    public /* synthetic */ C12444bZ(MW1 mw1, InterfaceC45204me0 interfaceC45204me0, C46390oe0 c46390oe0, InterfaceC39067cJ3 interfaceC39067cJ3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mw1, (i & 2) != 0 ? null : interfaceC45204me0, (i & 4) != 0 ? null : c46390oe0, (i & 8) != 0 ? null : interfaceC39067cJ3);
    }
}
