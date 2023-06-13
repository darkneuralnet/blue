package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"Lyc;", "LRp5;", "Lg01;", "LYW3;", "event", "LG52;", "bounds", "LCe3;", C17296a.f69688o, "(Lg01;LYW3;J)J", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,35:1\n59#2,3:36\n62#2,2:43\n64#2:46\n33#3,4:39\n38#3:45\n154#4:47\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n33#1:36,3\n33#1:43,2\n33#1:46\n33#1:39,4\n33#1:45\n33#1:47\n*E\n"})
/* renamed from: yc */
/* loaded from: classes.dex */
public final class C30635yc implements InterfaceC35731Rp5 {

    /* renamed from: a */
    public static final C30635yc f119814a = new C30635yc();

    private C30635yc() {
    }

    @Override // p000.InterfaceC35731Rp5
    /* renamed from: a */
    public long mo3191a(InterfaceC41273g01 calculateMouseWheelScroll, YW3 event, long j) {
        Intrinsics.checkNotNullParameter(calculateMouseWheelScroll, "$this$calculateMouseWheelScroll");
        Intrinsics.checkNotNullParameter(event, "event");
        List<C43361jX3> m74945c = event.m74945c();
        C32120Ce3 m111955d = C32120Ce3.m111955d(C32120Ce3.f4427b.m111932c());
        int size = m74945c.size();
        for (int i = 0; i < size; i++) {
            m111955d = C32120Ce3.m111955d(C32120Ce3.m111939t(m111955d.m111935x(), m74945c.get(i).m30354k()));
        }
        return C32120Ce3.m111938u(m111955d.m111935x(), -calculateMouseWheelScroll.mo3411T0(C43705k61.m29303g(64)));
    }
}
