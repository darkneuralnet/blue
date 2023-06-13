package p000;

import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzmd;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzmh;
import java.util.List;
/* renamed from: mC7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44955mC7 {

    /* renamed from: a */
    public final C42188hY7 f97612a;

    public C44955mC7(Context context) {
        this.f97612a = new C42188hY7(context);
    }

    /* renamed from: a */
    public final void m26020a(zzmh zzmhVar, zzmd zzmdVar, List list, long j) {
        this.f97612a.m36219a(zzmhVar, IH8.OPTIONAL_MODULE_FACE_DETECTION_INFERENCE, EnumC51522xH8.NO_ERROR);
    }

    /* renamed from: b */
    public final void m26019b(zzmh zzmhVar, String str, long j) {
        EnumC51522xH8 enumC51522xH8;
        C42188hY7 c42188hY7 = this.f97612a;
        IH8 ih8 = IH8.OPTIONAL_MODULE_FACE_DETECTION_CREATE;
        if (str != null) {
            enumC51522xH8 = EnumC51522xH8.OPTIONAL_MODULE_CREATE_ERROR;
        } else {
            enumC51522xH8 = EnumC51522xH8.NO_ERROR;
        }
        c42188hY7.m36219a(zzmhVar, ih8, enumC51522xH8);
    }

    /* renamed from: c */
    public final void m26018c(zzmh zzmhVar) {
        this.f97612a.m36219a(zzmhVar, IH8.OPTIONAL_MODULE_FACE_DETECTION_INIT, EnumC51522xH8.NO_ERROR);
    }
}
