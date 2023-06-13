package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: Dw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C32514Dw1 {

    /* renamed from: Dw1$a */
    /* loaded from: classes.dex */
    public static class C1669a {
        private C1669a() {
        }

        /* renamed from: a */
        public static int m109611a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: Dw1$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1670b {
    }

    /* renamed from: Dw1$c */
    /* loaded from: classes.dex */
    public static final class C1671c implements InterfaceC1670b {

        /* renamed from: a */
        public final C1672d[] f6623a;

        public C1671c(C1672d[] c1672dArr) {
            this.f6623a = c1672dArr;
        }

        /* renamed from: a */
        public C1672d[] m109610a() {
            return this.f6623a;
        }
    }

    /* renamed from: Dw1$d */
    /* loaded from: classes.dex */
    public static final class C1672d {

        /* renamed from: a */
        public final String f6624a;

        /* renamed from: b */
        public final int f6625b;

        /* renamed from: c */
        public final boolean f6626c;

        /* renamed from: d */
        public final String f6627d;

        /* renamed from: e */
        public final int f6628e;

        /* renamed from: f */
        public final int f6629f;

        public C1672d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f6624a = str;
            this.f6625b = i;
            this.f6626c = z;
            this.f6627d = str2;
            this.f6628e = i2;
            this.f6629f = i3;
        }

        /* renamed from: a */
        public String m109609a() {
            return this.f6624a;
        }

        /* renamed from: b */
        public int m109608b() {
            return this.f6629f;
        }

        /* renamed from: c */
        public int m109607c() {
            return this.f6628e;
        }

        /* renamed from: d */
        public String m109606d() {
            return this.f6627d;
        }

        /* renamed from: e */
        public int m109605e() {
            return this.f6625b;
        }

        /* renamed from: f */
        public boolean m109604f() {
            return this.f6626c;
        }
    }

    /* renamed from: Dw1$e */
    /* loaded from: classes.dex */
    public static final class C1673e implements InterfaceC1670b {

        /* renamed from: a */
        public final C53092zw1 f6630a;

        /* renamed from: b */
        public final int f6631b;

        /* renamed from: c */
        public final int f6632c;

        /* renamed from: d */
        public final String f6633d;

        public C1673e(C53092zw1 c53092zw1, int i, int i2, String str) {
            this.f6630a = c53092zw1;
            this.f6632c = i;
            this.f6631b = i2;
            this.f6633d = str;
        }

        /* renamed from: a */
        public int m109603a() {
            return this.f6632c;
        }

        /* renamed from: b */
        public C53092zw1 m109602b() {
            return this.f6630a;
        }

        /* renamed from: c */
        public String m109601c() {
            return this.f6633d;
        }

        /* renamed from: d */
        public int m109600d() {
            return this.f6631b;
        }
    }

    private C32514Dw1() {
    }

    /* renamed from: a */
    public static int m109619a(TypedArray typedArray, int i) {
        return C1669a.m109611a(typedArray, i);
    }

    /* renamed from: b */
    public static InterfaceC1670b m109618b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m109616d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m109617c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m109619a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m109612h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m109612h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    public static InterfaceC1670b m109616d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m109615e(xmlPullParser, resources);
        }
        m109613g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    public static InterfaceC1670b m109615e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C40544em4.FontFamily);
        String string = obtainAttributes.getString(C40544em4.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C40544em4.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C40544em4.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C40544em4.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C40544em4.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C40544em4.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = obtainAttributes.getString(C40544em4.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m109613g(xmlPullParser);
            }
            return new C1673e(new C53092zw1(string, string2, string3, m109617c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(PaymentSheetEvent.FIELD_FONT)) {
                    arrayList.add(m109614f(xmlPullParser, resources));
                } else {
                    m109613g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1671c((C1672d[]) arrayList.toArray(new C1672d[0]));
    }

    /* renamed from: f */
    public static C1672d m109614f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C40544em4.FontFamilyFont);
        int i = C40544em4.FontFamilyFont_fontWeight;
        if (!obtainAttributes.hasValue(i)) {
            i = C40544em4.FontFamilyFont_android_fontWeight;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C40544em4.FontFamilyFont_fontStyle;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C40544em4.FontFamilyFont_android_fontStyle;
        }
        if (1 == obtainAttributes.getInt(i3, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i4 = C40544em4.FontFamilyFont_ttcIndex;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C40544em4.FontFamilyFont_android_ttcIndex;
        }
        int i5 = C40544em4.FontFamilyFont_fontVariationSettings;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C40544em4.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C40544em4.FontFamilyFont_font;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C40544em4.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m109613g(xmlPullParser);
        }
        return new C1672d(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    public static void m109613g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    public static List<byte[]> m109612h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
