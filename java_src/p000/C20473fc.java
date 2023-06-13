package p000;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a%\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b*\f\b\u0000\u0010\t\"\u00020\u00012\u00020\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, m28432d2 = {"Lsm0;", "Landroid/graphics/ColorFilter;", "b", "Lpm0;", "color", "LLW;", "blendMode", C17296a.f69688o, "(JI)Lsm0;", "NativeColorFilter", "ui-graphics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: fc */
/* loaded from: classes.dex */
public final class C20473fc {
    /* renamed from: a */
    public static final C48841sm0 m41122a(long j, int i) {
        BlendModeColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            porterDuffColorFilter = C6019OW.f26714a.m92125a(j, i);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(C50619vm0.m8173h(j), C9817Yb.m74839b(i));
        }
        return new C48841sm0(porterDuffColorFilter);
    }

    /* renamed from: b */
    public static final ColorFilter m41121b(C48841sm0 c48841sm0) {
        Intrinsics.checkNotNullParameter(c48841sm0, "<this>");
        return c48841sm0.m13701a();
    }
}
