package p000;

import android.view.MotionEvent;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"LVV2;", "", "Landroid/view/MotionEvent;", "motionEvent", "", "index", "LCe3;", C17296a.f69688o, "(Landroid/view/MotionEvent;I)J", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: VV2 */
/* loaded from: classes.dex */
public final class VV2 {

    /* renamed from: a */
    public static final VV2 f39170a = new VV2();

    private VV2() {
    }

    /* renamed from: a */
    public final long m79839a(MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        rawX = motionEvent.getRawX(i);
        rawY = motionEvent.getRawY(i);
        return C33056Ge3.m104938a(rawX, rawY);
    }
}
