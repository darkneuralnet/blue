package androidx.compose.p003ui.draw;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010*\u001a\u00020%\u0012\b\u00100\u001a\u0004\u0018\u00010+¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u00100\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0017¨\u00064"}, m28432d2 = {"Landroidx/compose/ui/draw/PainterModifierNodeElement;", "LrV2;", "LoE3;", "h", "node", "j", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "LnE3;", "b", "LnE3;", "getPainter", "()LnE3;", "painter", "c", "Z", "getSizeToIntrinsics", "()Z", "sizeToIntrinsics", "LK9;", DateTokenConverter.CONVERTER_KEY, "LK9;", "getAlignment", "()LK9;", "alignment", "LBA0;", "e", "LBA0;", "getContentScale", "()LBA0;", "contentScale", "", "f", "F", "getAlpha", "()F", "alpha", "Lsm0;", "g", "Lsm0;", "getColorFilter", "()Lsm0;", "colorFilter", "autoInvalidate", "<init>", "(LnE3;ZLK9;LBA0;FLsm0;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.draw.PainterModifierNodeElement */
/* loaded from: classes.dex */
final class PainterModifierNodeElement extends AbstractC48086rV2<C46155oE3> {

    /* renamed from: b */
    public final AbstractC45562nE3 f52939b;

    /* renamed from: c */
    public final boolean f52940c;

    /* renamed from: d */
    public final InterfaceC4360K9 f52941d;

    /* renamed from: e */
    public final BA0 f52942e;

    /* renamed from: f */
    public final float f52943f;

    /* renamed from: g */
    public final C48841sm0 f52944g;

    public PainterModifierNodeElement(AbstractC45562nE3 painter, boolean z, InterfaceC4360K9 alignment, BA0 contentScale, float f, C48841sm0 c48841sm0) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        this.f52939b = painter;
        this.f52940c = z;
        this.f52941d = alignment;
        this.f52942e = contentScale;
        this.f52943f = f;
        this.f52944g = c48841sm0;
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: b */
    public boolean mo15843b() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PainterModifierNodeElement) {
            PainterModifierNodeElement painterModifierNodeElement = (PainterModifierNodeElement) obj;
            return Intrinsics.areEqual(this.f52939b, painterModifierNodeElement.f52939b) && this.f52940c == painterModifierNodeElement.f52940c && Intrinsics.areEqual(this.f52941d, painterModifierNodeElement.f52941d) && Intrinsics.areEqual(this.f52942e, painterModifierNodeElement.f52942e) && Float.compare(this.f52943f, painterModifierNodeElement.f52943f) == 0 && Intrinsics.areEqual(this.f52944g, painterModifierNodeElement.f52944g);
        }
        return false;
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: h */
    public C46155oE3 mo15844a() {
        return new C46155oE3(this.f52939b, this.f52940c, this.f52941d, this.f52942e, this.f52943f, this.f52944g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f52939b.hashCode() * 31;
        boolean z = this.f52940c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((((hashCode + i) * 31) + this.f52941d.hashCode()) * 31) + this.f52942e.hashCode()) * 31) + Float.hashCode(this.f52943f)) * 31;
        C48841sm0 c48841sm0 = this.f52944g;
        return hashCode2 + (c48841sm0 == null ? 0 : c48841sm0.hashCode());
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: j */
    public C46155oE3 mo15842g(C46155oE3 node) {
        boolean z;
        Intrinsics.checkNotNullParameter(node, "node");
        boolean m21522g0 = node.m21522g0();
        boolean z2 = this.f52940c;
        if (m21522g0 == z2 && (!z2 || C51465xB5.m5733f(node.m21523f0().mo116236getIntrinsicSizeNHjbRc(), this.f52939b.mo116236getIntrinsicSizeNHjbRc()))) {
            z = false;
        } else {
            z = true;
        }
        node.m21512p0(this.f52939b);
        node.m21511q0(this.f52940c);
        node.m21516l0(this.f52941d);
        node.m21513o0(this.f52942e);
        node.m21515m0(this.f52943f);
        node.m21514n0(this.f52944g);
        if (z) {
            C33127Gm2.m104765b(node);
        }
        F61.m107744a(node);
        return node;
    }

    public String toString() {
        return "PainterModifierNodeElement(painter=" + this.f52939b + ", sizeToIntrinsics=" + this.f52940c + ", alignment=" + this.f52941d + ", contentScale=" + this.f52942e + ", alpha=" + this.f52943f + ", colorFilter=" + this.f52944g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
