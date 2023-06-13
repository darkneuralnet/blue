package p000;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnz;
import java.nio.ByteBuffer;
/* renamed from: S47 */
/* loaded from: classes6.dex */
public final class S47 {
    /* renamed from: a */
    public static C52266yY6 m86031a(ByteBuffer byteBuffer, zbnz zbnzVar) {
        C51080wY6 c51080wY6 = new C51080wY6();
        c51080wY6.m6678a(byteBuffer.array());
        c51080wY6.m6673f(m86030b(zbnzVar.m51273u()));
        c51080wY6.m6677b(new C39501d07(zbnzVar.m51272v(), zbnzVar.m51271y()));
        c51080wY6.m6676c(zbnzVar.m51275E() * 1000);
        c51080wY6.m6674e(2);
        return c51080wY6.m6675d();
    }

    /* renamed from: b */
    public static int m86030b(int i) {
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 1 : 2;
            }
            return 3;
        }
        return 4;
    }
}
