package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, m28432d2 = {"LZH6;", "LBm0;", "", "component", "", "f", "e", "", "v", "l", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", C17296a.f69688o, "colorSpace", "Lpm0;", "n", "(FFFFLBm0;)J", "b", "o", "", "name", "id", "<init>", "(Ljava/lang/String;I)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nXyz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,79:1\n25#2,3:80\n*S KotlinDebug\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n*L\n52#1:80,3\n*E\n"})
/* renamed from: ZH6 */
/* loaded from: classes.dex */
public final class ZH6 extends AbstractC31955Bm0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZH6(String name, int i) {
        super(name, C51212wm0.f116470a.m6381c(), i, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: b */
    public float[] mo73366b(float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = m73359o(v[0]);
        v[1] = m73359o(v[1]);
        v[2] = m73359o(v[2]);
        return v;
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: e */
    public float mo73365e(int i) {
        return 2.0f;
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: f */
    public float mo73364f(int i) {
        return -2.0f;
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: j */
    public long mo73363j(float f, float f2, float f3) {
        float m73359o = m73359o(f);
        float m73359o2 = m73359o(f2);
        return (Float.floatToIntBits(m73359o2) & 4294967295L) | (Float.floatToIntBits(m73359o) << 32);
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: l */
    public float[] mo73362l(float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = m73359o(v[0]);
        v[1] = m73359o(v[1]);
        v[2] = m73359o(v[2]);
        return v;
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: m */
    public float mo73361m(float f, float f2, float f3) {
        return m73359o(f3);
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: n */
    public long mo73360n(float f, float f2, float f3, float f4, AbstractC31955Bm0 colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return C50619vm0.m8180a(m73359o(f), m73359o(f2), m73359o(f3), f4, colorSpace);
    }

    /* renamed from: o */
    public final float m73359o(float f) {
        float coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(f, -2.0f, 2.0f);
        return coerceIn;
    }
}
