package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010,\u001a\u00020(\u0012\b\b\u0002\u00102\u001a\u00020\u000f¢\u0006\u0004\b3\u00104J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0018\u00010\u0004R\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ(\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0013J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0015J\u001e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0013J\u001e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0018\u0010\u001a\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000fJ\u001e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0013J8\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0018\u00010\u0004R\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000fJ0\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0018\u00010\u0004R\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000fJ\t\u0010!\u001a\u00020\rHÖ\u0001J\t\u0010\"\u001a\u00020\u000fHÖ\u0001J\u0013\u0010$\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u000fH\u0002R\u0017\u0010,\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+R\"\u00102\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00065"}, m28432d2 = {"Lbe;", "", "Landroid/content/res/Resources;", "res", "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "k", "typedArray", "", "attrName", "", "resId", "defaultValue", "h", "", "g", "", DateTokenConverter.CONVERTER_KEY, "index", "b", "c", "i", "defValue", C17296a.f69688o, "Lus0;", "f", "Landroid/content/res/ColorStateList;", "e", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "resConfig", "", "l", "Lorg/xmlpull/v1/XmlPullParser;", "Lorg/xmlpull/v1/XmlPullParser;", "j", "()Lorg/xmlpull/v1/XmlPullParser;", "xmlParser", "I", "getConfig", "()I", "setConfig", "(I)V", "config", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: be */
/* loaded from: classes.dex */
public final class C12460be {

    /* renamed from: a */
    public final XmlPullParser f57793a;

    /* renamed from: b */
    public int f57794b;

    public C12460be(XmlPullParser xmlParser, int i) {
        Intrinsics.checkNotNullParameter(xmlParser, "xmlParser");
        this.f57793a = xmlParser;
        this.f57794b = i;
    }

    /* renamed from: a */
    public final float m64246a(TypedArray typedArray, int i, float f) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        float dimension = typedArray.getDimension(i, f);
        m64235l(typedArray.getChangingConfigurations());
        return dimension;
    }

    /* renamed from: b */
    public final float m64245b(TypedArray typedArray, int i, float f) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        float f2 = typedArray.getFloat(i, f);
        m64235l(typedArray.getChangingConfigurations());
        return f2;
    }

    /* renamed from: c */
    public final int m64244c(TypedArray typedArray, int i, int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        int i3 = typedArray.getInt(i, i2);
        m64235l(typedArray.getChangingConfigurations());
        return i3;
    }

    /* renamed from: d */
    public final boolean m64243d(TypedArray typedArray, String attrName, int i, boolean z) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        boolean m103675a = C33266Hb6.m103675a(typedArray, this.f57793a, attrName, i, z);
        m64235l(typedArray.getChangingConfigurations());
        return m103675a;
    }

    /* renamed from: e */
    public final ColorStateList m64242e(TypedArray typedArray, Resources.Theme theme, String attrName, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        ColorStateList m103673c = C33266Hb6.m103673c(typedArray, this.f57793a, theme, attrName, i);
        m64235l(typedArray.getChangingConfigurations());
        return m103673c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12460be) {
            C12460be c12460be = (C12460be) obj;
            return Intrinsics.areEqual(this.f57793a, c12460be.f57793a) && this.f57794b == c12460be.f57794b;
        }
        return false;
    }

    /* renamed from: f */
    public final C50087us0 m64241f(TypedArray typedArray, Resources.Theme theme, String attrName, int i, int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        C50087us0 result = C33266Hb6.m103671e(typedArray, this.f57793a, theme, attrName, i, i2);
        m64235l(typedArray.getChangingConfigurations());
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    /* renamed from: g */
    public final float m64240g(TypedArray typedArray, String attrName, int i, float f) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        float m103670f = C33266Hb6.m103670f(typedArray, this.f57793a, attrName, i, f);
        m64235l(typedArray.getChangingConfigurations());
        return m103670f;
    }

    /* renamed from: h */
    public final int m64239h(TypedArray typedArray, String attrName, int i, int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        int m103669g = C33266Hb6.m103669g(typedArray, this.f57793a, attrName, i, i2);
        m64235l(typedArray.getChangingConfigurations());
        return m103669g;
    }

    public int hashCode() {
        return (this.f57793a.hashCode() * 31) + Integer.hashCode(this.f57794b);
    }

    /* renamed from: i */
    public final String m64238i(TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        String string = typedArray.getString(i);
        m64235l(typedArray.getChangingConfigurations());
        return string;
    }

    /* renamed from: j */
    public final XmlPullParser m64237j() {
        return this.f57793a;
    }

    /* renamed from: k */
    public final TypedArray m64236k(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(set, "set");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray m103665k = C33266Hb6.m103665k(res, theme, set, attrs);
        Intrinsics.checkNotNullExpressionValue(m103665k, "obtainAttributes(\n      …          attrs\n        )");
        m64235l(m103665k.getChangingConfigurations());
        return m103665k;
    }

    /* renamed from: l */
    public final void m64235l(int i) {
        this.f57794b = i | this.f57794b;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f57793a + ", config=" + this.f57794b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ C12460be(XmlPullParser xmlPullParser, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}
