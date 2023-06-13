package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0016\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u001a \u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u0013"}, m28432d2 = {"", "bits", "slot", C17296a.f69688o, "f", DateTokenConverter.CONVERTER_KEY, "Lns4;", LegacyRepairType.OTHER_KEY, "", "e", "LEt0;", "composer", "key", "tracked", "", "block", "Lht0;", "b", "c", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposableLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
/* renamed from: jt0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43575jt0 {
    /* renamed from: a */
    public static final int m29792a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    /* renamed from: b */
    public static final InterfaceC42389ht0 m29791b(InterfaceC32720Et0 composer, int i, boolean z, Object block) {
        C42982it0 c42982it0;
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(block, "block");
        composer.mo89638F(i);
        Object mo89635G = composer.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            c42982it0 = new C42982it0(i, z);
            composer.mo89503z(c42982it0);
        } else {
            Intrinsics.checkNotNull(mo89635G, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            c42982it0 = (C42982it0) mo89635G;
        }
        c42982it0.m31685v(block);
        composer.mo89605Q();
        return c42982it0;
    }

    /* renamed from: c */
    public static final InterfaceC42389ht0 m29790c(int i, boolean z, Object block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C42982it0 c42982it0 = new C42982it0(i, z);
        c42982it0.m31685v(block);
        return c42982it0;
    }

    /* renamed from: d */
    public static final int m29789d(int i) {
        return m29792a(2, i);
    }

    /* renamed from: e */
    public static final boolean m29788e(InterfaceC45941ns4 interfaceC45941ns4, InterfaceC45941ns4 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (interfaceC45941ns4 != null) {
            if ((interfaceC45941ns4 instanceof C46534os4) && (other instanceof C46534os4)) {
                C46534os4 c46534os4 = (C46534os4) interfaceC45941ns4;
                if (!c46534os4.m20387s() || Intrinsics.areEqual(interfaceC45941ns4, other) || Intrinsics.areEqual(c46534os4.m20396j(), ((C46534os4) other).m20396j())) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final int m29787f(int i) {
        return m29792a(1, i);
    }
}
