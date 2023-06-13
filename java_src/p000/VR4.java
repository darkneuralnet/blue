package p000;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\f"}, m28432d2 = {"LVR4;", "", "", "instructionsTitle", "instructions", "", "instructionsIcon", "", "showScooterIcon", "scooterIconRes", "", "Ik", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: VR4 */
/* loaded from: classes2.dex */
public interface VR4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VR4$a */
    /* loaded from: classes2.dex */
    public static final class C8651a {
        public static /* synthetic */ void renderPrePhotoCapture$default(VR4 vr4, String str, String str2, int i, boolean z, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderPrePhotoCapture");
            }
            if ((i3 & 1) != 0) {
                str = null;
            }
            String str3 = str;
            if ((i3 & 8) != 0) {
                z = false;
            }
            vr4.mo78458Ik(str3, str2, i, z, i2);
        }
    }

    /* renamed from: Ik */
    void mo78458Ik(String str, String str2, int i, boolean z, int i2);
}
