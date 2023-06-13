package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: ID1 */
/* loaded from: classes.dex */
public final class ID1 {
    private ID1() {
    }

    /* renamed from: a */
    public static C3407a m102781a(C3407a c3407a, int i, int i2, boolean z, int i3) {
        if (c3407a != null) {
            return c3407a;
        }
        if (z) {
            return new C3407a(i, i3, i2);
        }
        return new C3407a(i, i2);
    }

    /* renamed from: b */
    public static Shader m102780b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray m103665k = C33266Hb6.m103665k(resources, theme, attributeSet, C40544em4.GradientColor);
            float m103670f = C33266Hb6.m103670f(m103665k, xmlPullParser, "startX", C40544em4.GradientColor_android_startX, 0.0f);
            float m103670f2 = C33266Hb6.m103670f(m103665k, xmlPullParser, "startY", C40544em4.GradientColor_android_startY, 0.0f);
            float m103670f3 = C33266Hb6.m103670f(m103665k, xmlPullParser, "endX", C40544em4.GradientColor_android_endX, 0.0f);
            float m103670f4 = C33266Hb6.m103670f(m103665k, xmlPullParser, "endY", C40544em4.GradientColor_android_endY, 0.0f);
            float m103670f5 = C33266Hb6.m103670f(m103665k, xmlPullParser, "centerX", C40544em4.GradientColor_android_centerX, 0.0f);
            float m103670f6 = C33266Hb6.m103670f(m103665k, xmlPullParser, "centerY", C40544em4.GradientColor_android_centerY, 0.0f);
            int m103669g = C33266Hb6.m103669g(m103665k, xmlPullParser, "type", C40544em4.GradientColor_android_type, 0);
            int m103674b = C33266Hb6.m103674b(m103665k, xmlPullParser, "startColor", C40544em4.GradientColor_android_startColor, 0);
            boolean m103666j = C33266Hb6.m103666j(xmlPullParser, "centerColor");
            int m103674b2 = C33266Hb6.m103674b(m103665k, xmlPullParser, "centerColor", C40544em4.GradientColor_android_centerColor, 0);
            int m103674b3 = C33266Hb6.m103674b(m103665k, xmlPullParser, "endColor", C40544em4.GradientColor_android_endColor, 0);
            int m103669g2 = C33266Hb6.m103669g(m103665k, xmlPullParser, "tileMode", C40544em4.GradientColor_android_tileMode, 0);
            float m103670f7 = C33266Hb6.m103670f(m103665k, xmlPullParser, "gradientRadius", C40544em4.GradientColor_android_gradientRadius, 0.0f);
            m103665k.recycle();
            C3407a m102781a = m102781a(m102779c(resources, xmlPullParser, attributeSet, theme), m103674b, m103674b3, m103666j, m103674b2);
            if (m103669g != 1) {
                if (m103669g != 2) {
                    return new LinearGradient(m103670f, m103670f2, m103670f3, m103670f4, m102781a.f14814a, m102781a.f14815b, m102778d(m103669g2));
                }
                return new SweepGradient(m103670f5, m103670f6, m102781a.f14814a, m102781a.f14815b);
            } else if (m103670f7 > 0.0f) {
                return new RadialGradient(m103670f5, m103670f6, m103670f7, m102781a.f14814a, m102781a.f14815b, m102778d(m103669g2));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3407a m102779c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray m103665k = C33266Hb6.m103665k(resources, theme, attributeSet, C40544em4.GradientColorItem);
                int i = C40544em4.GradientColorItem_android_color;
                boolean hasValue = m103665k.hasValue(i);
                int i2 = C40544em4.GradientColorItem_android_offset;
                boolean hasValue2 = m103665k.hasValue(i2);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color = m103665k.getColor(i, 0);
                float f = m103665k.getFloat(i2, 0.0f);
                m103665k.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f));
            }
        }
        if (arrayList2.size() > 0) {
            return new C3407a(arrayList2, arrayList);
        }
        return null;
    }

    /* renamed from: d */
    public static Shader.TileMode m102778d(int i) {
        if (i != 1) {
            if (i != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* renamed from: ID1$a */
    /* loaded from: classes.dex */
    public static final class C3407a {

        /* renamed from: a */
        public final int[] f14814a;

        /* renamed from: b */
        public final float[] f14815b;

        public C3407a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f14814a = new int[size];
            this.f14815b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f14814a[i] = list.get(i).intValue();
                this.f14815b[i] = list2.get(i).floatValue();
            }
        }

        public C3407a(int i, int i2) {
            this.f14814a = new int[]{i, i2};
            this.f14815b = new float[]{0.0f, 1.0f};
        }

        public C3407a(int i, int i2, int i3) {
            this.f14814a = new int[]{i, i2, i3};
            this.f14815b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
