package p000;

import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzmh;
/* renamed from: hY7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42188hY7 {

    /* renamed from: a */
    public final GX8 f85439a;

    public C42188hY7(Context context) {
        AbstractC51064wW8 mo28872c = AbstractC51064wW8.m6708d("optional-module-face").mo28872c();
        this.f85439a = new GX8(context, new C37684Zy5(context), new HW8(context, mo28872c), mo28872c.mo6710b());
    }

    /* renamed from: a */
    public final void m36219a(zzmh zzmhVar, IH8 ih8, EnumC51522xH8 enumC51522xH8) {
        int i;
        if (ih8 == IH8.OPTIONAL_MODULE_FACE_DETECTION_CREATE) {
            i = 1;
        } else {
            i = 0;
        }
        this.f85439a.m105023c(new C37948aQ7(zzmhVar, enumC51522xH8, i), ih8);
    }
}
