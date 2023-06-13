package p000;

import kotlin.KotlinVersion;
/* renamed from: P52 */
/* loaded from: classes6.dex */
public class P52 {
    private P52() {
    }

    /* renamed from: a */
    public static byte[] m90872a(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE), (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE), (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE)};
    }
}
