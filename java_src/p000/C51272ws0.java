package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¨\u0006\u0007"}, m28432d2 = {"", C17296a.f69688o, "b", "c", "Lkotlin/Pair;", "Lvs0;", "num", "animation-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,112:1\n103#1:113\n107#1:119\n103#1:123\n103#1:134\n35#2,2:114\n72#2,3:116\n66#2,3:120\n35#2,2:124\n72#2,3:126\n35#2,2:129\n66#2,3:131\n35#2,2:135\n54#2,3:137\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n*L\n86#1:113\n87#1:119\n87#1:123\n107#1:134\n86#1:114,2\n86#1:116,3\n87#1:120,3\n87#1:124,2\n87#1:126,3\n103#1:129,2\n107#1:131,3\n107#1:135,2\n111#1:137,3\n*E\n"})
/* renamed from: ws0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51272ws0 {
    /* renamed from: a */
    public static final Pair<C50679vs0, C50679vs0> m6203a(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        double d12 = -d2;
        double d13 = (d2 * d2) - ((4.0d * d) * d3);
        C50679vs0 m6202b = m6202b(d13);
        d4 = m6202b.f114810a;
        m6202b.f114810a = d4 + d12;
        double d14 = d * 2.0d;
        d5 = m6202b.f114810a;
        m6202b.f114810a = d5 / d14;
        d6 = m6202b.f114811b;
        m6202b.f114811b = d6 / d14;
        C50679vs0 m6202b2 = m6202b(d13);
        d7 = m6202b2.f114810a;
        double d15 = -1;
        m6202b2.f114810a = d7 * d15;
        d8 = m6202b2.f114811b;
        m6202b2.f114811b = d8 * d15;
        d9 = m6202b2.f114810a;
        m6202b2.f114810a = d9 + d12;
        d10 = m6202b2.f114810a;
        m6202b2.f114810a = d10 / d14;
        d11 = m6202b2.f114811b;
        m6202b2.f114811b = d11 / d14;
        return TuplesKt.m28425to(m6202b, m6202b2);
    }

    /* renamed from: b */
    public static final C50679vs0 m6202b(double d) {
        if (d < 0.0d) {
            return new C50679vs0(0.0d, Math.sqrt(Math.abs(d)));
        }
        return new C50679vs0(Math.sqrt(d), 0.0d);
    }
}
