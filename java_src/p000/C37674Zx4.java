package p000;

import co.bird.android.model.DeliveryWindow;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/model/DeliveryWindow;", "window", "LBx4;", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Zx4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37674Zx4 {
    /* renamed from: a */
    public static final C32058Bx4 m72191a(DeliveryWindow window) {
        Intrinsics.checkNotNullParameter(window, "window");
        return new C32058Bx4(window.getId(), window.getStart(), window.getEnd(), window.getAddress());
    }
}
