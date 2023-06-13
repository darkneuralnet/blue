package p000;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Xml;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.xmlpull.v1.XmlPullParser;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u0012"}, m28432d2 = {"LyY3;", "", "Landroid/content/res/Resources;", "resources", "", "resId", "", "LyY3$a;", C17296a.f69688o, "Lorg/xmlpull/v1/XmlPullParser;", "parser", "Landroid/util/AttributeSet;", "attrs", "b", "Landroid/util/Pair;", "c", "<init>", "()V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yY3  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C52263yY3 {

    /* renamed from: a */
    public static final C52263yY3 f119708a = new C52263yY3();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u000e"}, m28432d2 = {"LyY3$a;", "", "", C17296a.f69688o, "I", "()I", "c", "(I)V", "title", "b", DateTokenConverter.CONVERTER_KEY, "titleCondensed", "<init>", "()V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yY3$a */
    /* loaded from: classes7.dex */
    public static final class C30616a {

        /* renamed from: a */
        public int f119709a;

        /* renamed from: b */
        public int f119710b;

        /* renamed from: a */
        public final int m3330a() {
            return this.f119709a;
        }

        /* renamed from: b */
        public final int m3329b() {
            return this.f119710b;
        }

        /* renamed from: c */
        public final void m3328c(int i) {
            this.f119709a = i;
        }

        /* renamed from: d */
        public final void m3327d(int i) {
            this.f119710b = i;
        }
    }

    private C52263yY3() {
    }

    /* renamed from: a */
    public final Map<Integer, C30616a> m3333a(Resources resources, int i) {
        Map m116783constructorimpl;
        Map emptyMap;
        Map<Integer, C30616a> emptyMap2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (i == 0) {
            emptyMap2 = MapsKt__MapsKt.emptyMap();
            return emptyMap2;
        }
        XmlResourceParser layout = resources.getLayout(i);
        Intrinsics.checkNotNullExpressionValue(layout, "resources.getLayout(resId)");
        AttributeSet attrs = Xml.asAttributeSet(layout);
        try {
            Result.Companion companion = Result.Companion;
            Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
            m116783constructorimpl = Result.m116783constructorimpl(m3332b(layout, attrs));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        emptyMap = MapsKt__MapsKt.emptyMap();
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = emptyMap;
        }
        return (Map) m116783constructorimpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r1 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r1 == 2) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        r1 = r8.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "parser.name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, "item") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        r1 = m3331c(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        r5 = r1.first;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "item.first");
        r1 = r1.second;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "item.second");
        r0.put(r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        r1 = r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
        return r0;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<Integer, C30616a> m3332b(XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "parser.name");
                if (Intrinsics.areEqual(name, "menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new IllegalStateException(("Expecting menu, got " + name).toString());
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    /* renamed from: c */
    public final Pair<Integer, C30616a> m3331c(AttributeSet attributeSet) {
        boolean startsWith$default;
        boolean startsWith$default2;
        int attributeCount = attributeSet.getAttributeCount();
        int i = 0;
        C30616a c30616a = null;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (!Intrinsics.areEqual(attributeSet.getAttributeName(i2), "android:id") && !Intrinsics.areEqual(attributeSet.getAttributeName(i2), "id")) {
                if (!Intrinsics.areEqual(attributeSet.getAttributeName(i2), "android:title") && !Intrinsics.areEqual(attributeSet.getAttributeName(i2), "title")) {
                    if (Intrinsics.areEqual(attributeSet.getAttributeName(i2), "android:titleCondensed") || Intrinsics.areEqual(attributeSet.getAttributeName(i2), "titleCondensed")) {
                        String attributeValue = attributeSet.getAttributeValue(i2);
                        if (attributeValue == null) {
                            break;
                        }
                        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(attributeValue, "@", false, 2, null);
                        if (!startsWith$default2) {
                            break;
                        }
                        if (c30616a == null) {
                            c30616a = new C30616a();
                        }
                        c30616a.m3327d(attributeSet.getAttributeResourceValue(i2, 0));
                    }
                } else {
                    String attributeValue2 = attributeSet.getAttributeValue(i2);
                    if (attributeValue2 == null) {
                        break;
                    }
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(attributeValue2, "@", false, 2, null);
                    if (!startsWith$default) {
                        break;
                    }
                    if (c30616a == null) {
                        c30616a = new C30616a();
                    }
                    c30616a.m3328c(attributeSet.getAttributeResourceValue(i2, 0));
                }
            } else {
                i = attributeSet.getAttributeResourceValue(i2, 0);
            }
        }
        if (i == 0 || c30616a == null) {
            return null;
        }
        return new Pair<>(Integer.valueOf(i), c30616a);
    }
}
