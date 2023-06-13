package p000;

import android.graphics.Canvas;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m28432d2 = {"Lxe0;", "", "Landroid/graphics/Canvas;", "canvas", "", "enable", "", C17296a.f69688o, "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xe0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51725xe0 {

    /* renamed from: a */
    public static final C51725xe0 f117915a = new C51725xe0();

    private C51725xe0() {
    }

    /* renamed from: a */
    public final void m4912a(Canvas canvas, boolean z) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
