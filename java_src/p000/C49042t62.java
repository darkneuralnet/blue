package p000;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u0012\u001a\u00020\rø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, m28432d2 = {"Lt62;", "", "LiX3;", "pointerId", "", DateTokenConverter.CONVERTER_KEY, "(J)Z", "", "LjX3;", C17296a.f69688o, "Ljava/util/Map;", "()Ljava/util/Map;", "changes", "LlX3;", "b", "LlX3;", "getPointerInputEvent", "()LlX3;", "pointerInputEvent", "c", "Z", "()Z", "e", "(Z)V", "suppressMovementConsumption", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "<init>", "(Ljava/util/Map;LlX3;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInternalPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,35:1\n116#2,2:36\n33#2,6:38\n118#2:44\n*S KotlinDebug\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n*L\n30#1:36,2\n30#1:38,6\n30#1:44\n*E\n"})
/* renamed from: t62  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49042t62 {

    /* renamed from: a */
    public final Map<C42768iX3, C43361jX3> f109860a;

    /* renamed from: b */
    public final C44547lX3 f109861b;

    /* renamed from: c */
    public boolean f109862c;

    public C49042t62(Map<C42768iX3, C43361jX3> changes, C44547lX3 pointerInputEvent) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        this.f109860a = changes;
        this.f109861b = pointerInputEvent;
    }

    /* renamed from: a */
    public final Map<C42768iX3, C43361jX3> m13077a() {
        return this.f109860a;
    }

    /* renamed from: b */
    public final MotionEvent m13076b() {
        return this.f109861b.m27175a();
    }

    /* renamed from: c */
    public final boolean m13075c() {
        return this.f109862c;
    }

    /* renamed from: d */
    public final boolean m13074d(long j) {
        C45140mX3 c45140mX3;
        List<C45140mX3> m27174b = this.f109861b.m27174b();
        int size = m27174b.size();
        int i = 0;
        while (true) {
            if (i < size) {
                c45140mX3 = m27174b.get(i);
                if (C42768iX3.m33834d(c45140mX3.m25460c(), j)) {
                    break;
                }
                i++;
            } else {
                c45140mX3 = null;
                break;
            }
        }
        C45140mX3 c45140mX32 = c45140mX3;
        if (c45140mX32 == null) {
            return false;
        }
        return c45140mX32.m25459d();
    }

    /* renamed from: e */
    public final void m13073e(boolean z) {
        this.f109862c = z;
    }
}
