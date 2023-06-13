package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import com.google.gson.JsonParseException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007¨\u0006\u0015"}, m28432d2 = {"Lvx1;", "", "", "LDN1;", "httpHeaders", "", "withMarkup", "", "b", "", "bytes", "si", C17296a.f69688o, "json", "c", "xml", "e", "form", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vx1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50730vx1 {

    /* renamed from: a */
    public static final C50730vx1 f114933a = new C50730vx1();

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LDN1;", "header", "", C17296a.f69688o, "(LDN1;)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vx1$a */
    /* loaded from: classes5.dex */
    public static final class C29705a extends Lambda implements Function1<DN1, CharSequence> {

        /* renamed from: g */
        public final /* synthetic */ boolean f114934g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29705a(boolean z) {
            super(1);
            this.f114934g = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(DN1 header) {
            Intrinsics.checkNotNullParameter(header, "header");
            if (this.f114934g) {
                String m110556a = header.m110556a();
                String m110555b = header.m110555b();
                return "<b> " + m110556a + ": </b>" + m110555b + " <br />";
            }
            String m110556a2 = header.m110556a();
            String m110555b2 = header.m110555b();
            return m110556a2 + ": " + m110555b2 + "\n";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "entry", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vx1$b */
    /* loaded from: classes5.dex */
    public static final class C29706b extends Lambda implements Function1<String, CharSequence> {

        /* renamed from: g */
        public static final C29706b f114935g = new C29706b();

        public C29706b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(String entry) {
            List split$default;
            Intrinsics.checkNotNullParameter(entry, "entry");
            split$default = StringsKt__StringsKt.split$default((CharSequence) entry, new String[]{"="}, false, 0, 6, (Object) null);
            String str = (String) split$default.get(0);
            String decode = split$default.size() > 1 ? URLDecoder.decode((String) split$default.get(1), Constants.DEFAULT_ENCODING) : "";
            return str + ": " + decode;
        }
    }

    private C50730vx1() {
    }

    /* renamed from: a */
    public final String m7722a(long j, boolean z) {
        int i;
        String str;
        String str2;
        if (z) {
            i = 1000;
        } else {
            i = 1024;
        }
        if (j < i) {
            return j + " B";
        }
        double d = j;
        double d2 = i;
        int log = (int) (Math.log(d) / Math.log(d2));
        if (z) {
            str = "kMGTPE";
        } else {
            str = "KMGTPE";
        }
        char charAt = str.charAt(log - 1);
        if (z) {
            str2 = "";
        } else {
            str2 = "i";
        }
        String str3 = charAt + str2;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.1f %sB", Arrays.copyOf(new Object[]{Double.valueOf(d / Math.pow(d2, log)), str3}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
        r10 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r10, "", null, null, 0, null, new p000.C50730vx1.C29705a(r11), 30, null);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m7721b(List<DN1> list, boolean z) {
        String joinToString$default;
        return (list == null || joinToString$default == null) ? "" : joinToString$default;
    }

    /* renamed from: c */
    public final String m7720c(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            String m21546w = C44653li2.f96593a.m26934a().m21546w(C36835Wi2.m77957d(json));
            Intrinsics.checkNotNullExpressionValue(m21546w, "{\n            val je = J…ance.toJson(je)\n        }");
            return m21546w;
        } catch (JsonParseException unused) {
            return json;
        }
    }

    /* renamed from: d */
    public final String m7719d(String form) {
        boolean isBlank;
        List split$default;
        String joinToString$default;
        Intrinsics.checkNotNullParameter(form, "form");
        try {
            isBlank = StringsKt__StringsJVMKt.isBlank(form);
            if (!isBlank) {
                split$default = StringsKt__StringsKt.split$default((CharSequence) form, new String[]{"&"}, false, 0, 6, (Object) null);
                joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(split$default, "\n", null, null, 0, null, C29706b.f114935g, 30, null);
                return joinToString$default;
            }
            return form;
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return form;
        }
    }

    /* renamed from: e */
    public final String m7718e(String xml) {
        Intrinsics.checkNotNullParameter(xml, "xml");
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance()");
            newInstance.setExpandEntityReferences(false);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            Intrinsics.checkNotNullExpressionValue(newDocumentBuilder, "documentFactory.newDocumentBuilder()");
            Charset defaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset()");
            byte[] bytes = xml.getBytes(defaultCharset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            Document parse = newDocumentBuilder.parse(new InputSource(new ByteArrayInputStream(bytes)));
            Intrinsics.checkNotNullExpressionValue(parse, "documentBuilder.parse(inputSource)");
            DOMSource dOMSource = new DOMSource(parse);
            StringWriter stringWriter = new StringWriter();
            StreamResult streamResult = new StreamResult(stringWriter);
            TransformerFactory newInstance2 = TransformerFactory.newInstance();
            newInstance2.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            Transformer newTransformer = newInstance2.newTransformer();
            newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            newTransformer.setOutputProperty("indent", "yes");
            newTransformer.transform(dOMSource, streamResult);
            String stringWriter2 = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(stringWriter2, "{\n            val docume…iter.toString()\n        }");
            return stringWriter2;
        } catch (IOException | TransformerException | SAXParseException unused) {
            return xml;
        }
    }
}
