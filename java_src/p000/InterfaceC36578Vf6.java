package p000;

import android.content.Context;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.InterfaceC11197f;
/* renamed from: Vf6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC36578Vf6 {

    /* renamed from: a */
    public static final InterfaceC36578Vf6 f39423a = new C8717a();

    /* renamed from: Vf6$a */
    /* loaded from: classes.dex */
    public class C8717a implements InterfaceC36578Vf6 {
        @Override // p000.InterfaceC36578Vf6
        /* renamed from: a */
        public InterfaceC11197f mo25424a(EnumC8718b enumC8718b, int i) {
            return null;
        }
    }

    /* renamed from: Vf6$b */
    /* loaded from: classes.dex */
    public enum EnumC8718b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE
    }

    /* renamed from: Vf6$c */
    /* loaded from: classes.dex */
    public interface InterfaceC8719c {
        /* renamed from: a */
        InterfaceC36578Vf6 mo41163a(Context context) throws InitializationException;
    }

    /* renamed from: a */
    InterfaceC11197f mo25424a(EnumC8718b enumC8718b, int i);
}
