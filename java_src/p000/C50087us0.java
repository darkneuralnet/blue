package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: us0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50087us0 {

    /* renamed from: a */
    public final Shader f113108a;

    /* renamed from: b */
    public final ColorStateList f113109b;

    /* renamed from: c */
    public int f113110c;

    public C50087us0(Shader shader, ColorStateList colorStateList, int i) {
        this.f113108a = shader;
        this.f113109b = colorStateList;
        this.f113110c = i;
    }

    /* renamed from: a */
    public static C50087us0 m9644a(Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    return m9642c(C33125Gm0.m104773b(resources, xml, asAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return m9641d(ID1.m102780b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static C50087us0 m9643b(int i) {
        return new C50087us0(null, null, i);
    }

    /* renamed from: c */
    public static C50087us0 m9642c(ColorStateList colorStateList) {
        return new C50087us0(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    public static C50087us0 m9641d(Shader shader) {
        return new C50087us0(shader, null, 0);
    }

    /* renamed from: g */
    public static C50087us0 m9638g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m9644a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int m9640e() {
        return this.f113110c;
    }

    /* renamed from: f */
    public Shader m9639f() {
        return this.f113108a;
    }

    /* renamed from: h */
    public boolean m9637h() {
        return this.f113108a != null;
    }

    /* renamed from: i */
    public boolean m9636i() {
        ColorStateList colorStateList;
        return this.f113108a == null && (colorStateList = this.f113109b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m9635j(int[] iArr) {
        if (m9636i()) {
            ColorStateList colorStateList = this.f113109b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f113110c) {
                this.f113110c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m9634k(int i) {
        this.f113110c = i;
    }

    /* renamed from: l */
    public boolean m9633l() {
        return m9637h() || this.f113110c != 0;
    }
}
