package p000;

import kotlin.KotlinVersion;
/* renamed from: RA1 */
/* loaded from: classes2.dex */
public class RA1 {
    /* renamed from: a */
    public static float m87230a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* renamed from: b */
    public static float m87229b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: c */
    public static int m87228c(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float m87230a = m87230a(((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float m87230a2 = m87230a(((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float m87230a3 = m87230a((i & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float m87230a4 = m87230a(((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float m87230a5 = m87230a(((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float m87230a6 = m87230a3 + (f * (m87230a((i2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f) - m87230a3));
        return (Math.round(m87229b(m87230a + ((m87230a4 - m87230a) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(m87229b(m87230a2 + ((m87230a5 - m87230a2) * f)) * 255.0f) << 8) | Math.round(m87229b(m87230a6) * 255.0f);
    }
}
