package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: Gm0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33125Gm0 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f12402a = new ThreadLocal<>();

    private C33125Gm0() {
    }

    /* renamed from: a */
    public static ColorStateList m104774a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m104773b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static ColorStateList m104773b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m104770e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    public static TypedValue m104772c() {
        ThreadLocal<TypedValue> threadLocal = f12402a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: d */
    public static ColorStateList m104771d(Resources resources, int i, Resources.Theme theme) {
        try {
            return m104774a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m104770e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        int attributeCount;
        int i;
        Resources resources2 = resources;
        int i2 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20];
        int[] iArr2 = new int[20];
        int i3 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i2 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray m104767h = m104767h(resources2, theme, attributeSet, C40544em4.ColorStateListItem);
                int i4 = C40544em4.ColorStateListItem_android_color;
                int resourceId = m104767h.getResourceId(i4, -1);
                if (resourceId != -1 && !m104769f(resources2, resourceId)) {
                    try {
                        color = m104774a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = m104767h.getColor(C40544em4.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = m104767h.getColor(i4, -65281);
                }
                int i5 = C40544em4.ColorStateListItem_android_alpha;
                float f2 = 1.0f;
                if (m104767h.hasValue(i5)) {
                    f2 = m104767h.getFloat(i5, 1.0f);
                } else {
                    int i6 = C40544em4.ColorStateListItem_alpha;
                    if (m104767h.hasValue(i6)) {
                        f2 = m104767h.getFloat(i6, 1.0f);
                    }
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    int i7 = C40544em4.ColorStateListItem_android_lStar;
                    if (m104767h.hasValue(i7)) {
                        f = m104767h.getFloat(i7, -1.0f);
                        m104767h.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr3 = new int[attributeCount];
                        int i8 = 0;
                        for (i = 0; i < attributeCount; i++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C46404of4.alpha && attributeNameResource != C46404of4.lStar) {
                                int i9 = i8 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr3[i8] = attributeNameResource;
                                i8 = i9;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr3, i8);
                        iArr2 = C45560nE1.m24133a(iArr2, i3, m104768g(color, f2, f));
                        iArr = (int[][]) C45560nE1.m24132b(iArr, i3, trimStateSet);
                        i3++;
                    }
                }
                f = m104767h.getFloat(C40544em4.ColorStateListItem_lStar, -1.0f);
                m104767h.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i82 = 0;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i82);
                iArr2 = C45560nE1.m24133a(iArr2, i3, m104768g(color, f2, f));
                iArr = (int[][]) C45560nE1.m24132b(iArr, i3, trimStateSet2);
                i3++;
            }
            i2 = 1;
            resources2 = resources;
        }
        int[] iArr4 = new int[i3];
        int[][] iArr5 = new int[i3];
        System.arraycopy(iArr2, 0, iArr4, 0, i3);
        System.arraycopy(iArr, 0, iArr5, 0, i3);
        return new ColorStateList(iArr5, iArr4);
    }

    /* renamed from: f */
    public static boolean m104769f(Resources resources, int i) {
        TypedValue m104772c = m104772c();
        resources.getValue(i, m104772c, true);
        int i2 = m104772c.type;
        if (i2 >= 28 && i2 <= 31) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static int m104768g(int i, float f, float f2) {
        boolean z;
        if (f2 >= 0.0f && f2 <= 100.0f) {
            z = true;
        } else {
            z = false;
        }
        if (f == 1.0f && !z) {
            return i;
        }
        int m41475c = C40898fN2.m41475c((int) ((Color.alpha(i) * f) + 0.5f), 0, KotlinVersion.MAX_COMPONENT_VALUE);
        if (z) {
            R80 m87264c = R80.m87264c(i);
            i = R80.m87254m(m87264c.m87257j(), m87264c.m87258i(), f2);
        }
        return (i & 16777215) | (m41475c << 24);
    }

    /* renamed from: h */
    public static TypedArray m104767h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
