package p000;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\b\u001a&\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000\u001a=\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"LYW3;", "LCe3;", "offset", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "block", "c", "(LYW3;JLkotlin/jvm/functions/Function1;)V", "b", "", "nowMillis", C17296a.f69688o, "", "cancel", DateTokenConverter.CONVERTER_KEY, "(LYW3;JLkotlin/jvm/functions/Function1;Z)V", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: wX3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51068wX3 {
    /* renamed from: a */
    public static final void m6700a(long j, Function1<? super MotionEvent, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MotionEvent motionEvent = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        motionEvent.setSource(0);
        Intrinsics.checkNotNullExpressionValue(motionEvent, "motionEvent");
        block.invoke(motionEvent);
        motionEvent.recycle();
    }

    /* renamed from: b */
    public static final void m6699b(YW3 toCancelMotionEventScope, long j, Function1<? super MotionEvent, Unit> block) {
        Intrinsics.checkNotNullParameter(toCancelMotionEventScope, "$this$toCancelMotionEventScope");
        Intrinsics.checkNotNullParameter(block, "block");
        m6697d(toCancelMotionEventScope, j, block, true);
    }

    /* renamed from: c */
    public static final void m6698c(YW3 toMotionEventScope, long j, Function1<? super MotionEvent, Unit> block) {
        Intrinsics.checkNotNullParameter(toMotionEventScope, "$this$toMotionEventScope");
        Intrinsics.checkNotNullParameter(block, "block");
        m6697d(toMotionEventScope, j, block, false);
    }

    /* renamed from: d */
    public static final void m6697d(YW3 yw3, long j, Function1<? super MotionEvent, Unit> function1, boolean z) {
        MotionEvent m74943e = yw3.m74943e();
        if (m74943e != null) {
            int action = m74943e.getAction();
            if (z) {
                m74943e.setAction(3);
            }
            m74943e.offsetLocation(-C32120Ce3.m111944o(j), -C32120Ce3.m111943p(j));
            function1.invoke(m74943e);
            m74943e.offsetLocation(C32120Ce3.m111944o(j), C32120Ce3.m111943p(j));
            m74943e.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }
}
