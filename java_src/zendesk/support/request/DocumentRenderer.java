package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.QuoteSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Xml;
import android.view.View;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.UiUtils;
/* loaded from: classes8.dex */
class DocumentRenderer {
    private final ActionHandlerRegistry actionHandlerRegistry;
    private final C32054Bx0 configHelper;
    private final InterfaceC40057dx0 configuration;
    private final Style.Factory styleFactory;

    /* renamed from: zendesk.support.request.DocumentRenderer$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C314001 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type;

        static {
            int[] iArr = new int[Node.Type.values().length];
            $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type = iArr;
            try {
                iArr[Node.Type.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.H1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.H2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.H3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.H4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.H5.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.H6.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.I.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.Code.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.A.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.P.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.Div.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.Br.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.Img.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.Li.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[Node.Type.Quote.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class Node {
        private final Map<String, String> attributes;
        private final List<Node> children;
        private final Node parent;
        private final String text;
        private final Type type;

        /* loaded from: classes8.dex */
        public enum Type {
            B("b"),
            I("i"),
            Code(PaymentMethodOptionsParams.Blik.PARAM_CODE),
            H1("h1"),
            H2("h2"),
            H3("h3"),
            H4("h4"),
            H5("h5"),
            H6("h6"),
            Strong("strong"),
            U("u"),
            Em("em"),
            Br("br"),
            Hr("hr"),
            Div("div"),
            P("p"),
            Li("li"),
            A(C17296a.f69688o),
            Ol("ol"),
            Ul("ul"),
            Img("img"),
            Quote("blockquote"),
            Text("$text"),
            Document("$document"),
            Unknown("$unknown");
            
            private final String tag;

            Type(String str) {
                this.tag = str;
            }

            public static Type forTag(String str) {
                Type[] values;
                for (Type type : values()) {
                    if (type.getTag().equalsIgnoreCase(str)) {
                        return type;
                    }
                }
                return Unknown;
            }

            public String getTag() {
                return this.tag;
            }
        }

        private Node(Type type, String str, List<Node> list, Node node, Map<String, String> map) {
            this.type = type;
            this.text = str;
            this.children = list;
            this.parent = node;
            this.attributes = map;
        }

        public static Node withContent(Node node, String str, Map<String, String> map) {
            return new Node(Type.Text, str, new ArrayList(), node, map);
        }

        public static Node withTag(String str, Node node, Map<String, String> map) {
            return new Node(Type.forTag(str), null, new ArrayList(), node, map);
        }

        public void addChild(Node node) {
            this.children.add(node);
        }

        public Map<String, String> getAttributes() {
            return this.attributes;
        }

        public List<Node> getChildren() {
            return this.children;
        }

        public Node getParent() {
            return this.parent;
        }

        public CharSequence getText() {
            return this.text;
        }

        public Type getType() {
            return this.type;
        }
    }

    /* loaded from: classes8.dex */
    public static class RichRenderingDocument {
        private final String fallbackText;
        private final Node tree;

        public RichRenderingDocument(Node node, String str) {
            this.tree = node;
            this.fallbackText = str;
        }

        public String getFallbackText() {
            return this.fallbackText;
        }

        public Node getNodeTree() {
            return this.tree;
        }

        public boolean isValid() {
            Node node = this.tree;
            return (node == null || node.getChildren().isEmpty()) ? false : true;
        }
    }

    /* loaded from: classes8.dex */
    public interface Style {

        /* loaded from: classes8.dex */
        public static class Bold implements Style {
            @Override // zendesk.support.request.DocumentRenderer.Style
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                return SpannableHelper.applySpans(SpannableHelper.foldStrings(list), new StyleSpan(1));
            }
        }

        /* renamed from: zendesk.support.request.DocumentRenderer$Style$Br */
        /* loaded from: classes8.dex */
        public static class C31401Br implements Style {
            @Override // zendesk.support.request.DocumentRenderer.Style
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                return SpannableHelper.foldStrings(Arrays.asList(SpannableHelper.foldStrings(list), C44504lS5.f96220b));
            }
        }

        /* loaded from: classes8.dex */
        public static class CodeSpan implements Style {
            @Override // zendesk.support.request.DocumentRenderer.Style
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                return SpannableHelper.applySpans(SpannableHelper.foldStrings(list), new TypefaceSpan("monospace"));
            }
        }

        /* loaded from: classes8.dex */
        public static class Factory {
            private final Context context;

            public Factory(Context context) {
                this.context = context;
            }

            public Style getStyleForType(Node.Type type) {
                switch (C314001.$SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[type.ordinal()]) {
                    case 1:
                        return new Bold();
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return new Header();
                    case 8:
                        return new Italic();
                    case 9:
                        return new CodeSpan();
                    case 10:
                        return new Link();
                    case 11:
                    case 12:
                    case 13:
                        return new C31401Br();
                    case 14:
                        return new Image(this.context.getResources());
                    case 15:
                        return new C31402Li();
                    case 16:
                        return new QuotationSpan(UiUtils.themeAttributeToColor(16842906, this.context, C52925zf4.zs_fallback_text_color));
                    default:
                        return new Unknown();
                }
            }

            @SuppressLint({"InlinedApi"})
            public Spannable getStyledText(CharSequence charSequence) {
                if (charSequence != null) {
                    return new SpannableString(charSequence.toString().replaceAll("&nbsp;", " "));
                }
                return new SpannableString("");
            }
        }

        /* loaded from: classes8.dex */
        public static class Header extends Bold {
            @Override // zendesk.support.request.DocumentRenderer.Style.Bold, zendesk.support.request.DocumentRenderer.Style
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                return SpannableHelper.foldStrings(Arrays.asList(super.applyStyle(list, map), C44504lS5.f96220b));
            }
        }

        /* loaded from: classes8.dex */
        public static class Image implements Style {
            private final Resources resources;

            public Image(Resources resources) {
                this.resources = resources;
            }

            @Override // zendesk.support.request.DocumentRenderer.Style
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                String str = map.get("src");
                String queryParameter = HttpUrl.parse(str).queryParameter("name");
                String string = this.resources.getString(C41720gl4.request_message_inline_image_title_format);
                Object[] objArr = new Object[1];
                if (queryParameter == null) {
                    queryParameter = "Image";
                }
                objArr[0] = queryParameter;
                return SpannableHelper.applySpans(new SpannableString(String.format(string, objArr)), new URLSpan(str));
            }
        }

        /* loaded from: classes8.dex */
        public static class Italic implements Style {
            @Override // zendesk.support.request.DocumentRenderer.Style
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                return SpannableHelper.applySpans(SpannableHelper.foldStrings(list), new StyleSpan(2));
            }
        }

        /* renamed from: zendesk.support.request.DocumentRenderer$Style$Li */
        /* loaded from: classes8.dex */
        public static class C31402Li implements Style {
            public static final String INDEX_ATTRIBUTE = "_index";
            public static final String PARENT_ATTRIBUTE = "_parent";
            public static final String UNICODE_BULLET = "•";

            @Override // zendesk.support.request.DocumentRenderer.Style
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                String str;
                String str2 = "";
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                if (map == null || !map.containsKey(PARENT_ATTRIBUTE)) {
                    str = "";
                } else {
                    str = map.get(PARENT_ATTRIBUTE);
                }
                if (map != null && map.containsKey(INDEX_ATTRIBUTE)) {
                    str2 = map.get(INDEX_ATTRIBUTE);
                }
                for (CharSequence charSequence : list) {
                    if (C44504lS5.m27273b(str)) {
                        if (str.equalsIgnoreCase("ol")) {
                            spannableStringBuilder.append((CharSequence) str2);
                            if (C44504lS5.m27273b(str2)) {
                                spannableStringBuilder.append((CharSequence) ". ");
                            }
                        } else if (str.equalsIgnoreCase("ul")) {
                            spannableStringBuilder.append((CharSequence) UNICODE_BULLET).append((CharSequence) " ");
                        }
                    }
                    spannableStringBuilder.append(charSequence);
                    spannableStringBuilder.append((CharSequence) C44504lS5.f96220b);
                }
                return new SpannableString(spannableStringBuilder);
            }
        }

        /* loaded from: classes8.dex */
        public static class Link implements Style {
            @Override // zendesk.support.request.DocumentRenderer.Style
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                SpannableString foldStrings = SpannableHelper.foldStrings(list);
                String str = map.get("href");
                if (C44504lS5.m27273b(str)) {
                    return SpannableHelper.applySpans(foldStrings, new URLSpan(str));
                }
                return foldStrings;
            }
        }

        /* loaded from: classes8.dex */
        public static class QuotationSpan implements Style {
            private int quoteColor;

            public QuotationSpan(int i) {
                this.quoteColor = i;
            }

            @Override // zendesk.support.request.DocumentRenderer.Style
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(" ");
                arrayList.addAll(list);
                return SpannableHelper.applySpans(SpannableHelper.foldStrings(arrayList), new QuoteSpan(this.quoteColor), new ForegroundColorSpan(this.quoteColor));
            }
        }

        /* loaded from: classes8.dex */
        public static class SpannableHelper {
            private SpannableHelper() {
            }

            public static SpannableString applySpans(CharSequence charSequence, Object... objArr) {
                SpannableString spannableString = new SpannableString(charSequence);
                if (objArr != null) {
                    for (Object obj : objArr) {
                        if (obj != null) {
                            spannableString.setSpan(obj, 0, spannableString.length(), 33);
                        }
                    }
                }
                return spannableString;
            }

            public static SpannableString foldStrings(List<CharSequence> list) {
                return new SpannableString(TextUtils.concat((CharSequence[]) list.toArray(new CharSequence[list.size()])));
            }

            public static SpannableString trimSpannable(Spannable spannable) {
                String obj = spannable.toString();
                int i = 0;
                while (obj.length() > 0 && obj.startsWith("\n")) {
                    obj = obj.substring(1);
                    i++;
                }
                int i2 = 0;
                while (obj.length() > 0 && obj.endsWith("\n")) {
                    obj = obj.substring(0, obj.length() - 1);
                    i2++;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
                if (spannableStringBuilder.length() > 0 && spannable.length() - i2 > 0 && spannable.length() - i2 != spannable.length()) {
                    spannableStringBuilder = spannableStringBuilder.delete(spannable.length() - i2, spannable.length());
                }
                if (i > 0 && i < spannable.length()) {
                    spannableStringBuilder = spannableStringBuilder.delete(0, i);
                }
                return new SpannableString(spannableStringBuilder);
            }
        }

        /* loaded from: classes8.dex */
        public static class Unknown implements Style {
            @Override // zendesk.support.request.DocumentRenderer.Style
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                return SpannableHelper.foldStrings(list);
            }
        }

        Spannable applyStyle(List<CharSequence> list, Map<String, String> map);
    }

    /* loaded from: classes8.dex */
    public static class ZendeskUrlSpan extends URLSpan {
        private final C32054Bx0 configHelper;
        private final InterfaceC40057dx0 configuration;
        private final ActionHandlerRegistry registry;

        public ZendeskUrlSpan(String str, ActionHandlerRegistry actionHandlerRegistry, C32054Bx0 c32054Bx0, InterfaceC40057dx0 interfaceC40057dx0) {
            super(str);
            this.registry = actionHandlerRegistry;
            this.configHelper = c32054Bx0;
            this.configuration = interfaceC40057dx0;
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public void onClick(View view) {
            String url = getURL();
            if (C44504lS5.m27271d(url)) {
                super.onClick(view);
                return;
            }
            ActionHandler handlerByAction = this.registry.handlerByAction(url);
            if (handlerByAction == null) {
                super.onClick(view);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("help_center_view_article", url);
            this.configHelper.m113277d(hashMap, this.configuration);
            handlerByAction.handle(hashMap, view.getContext());
        }
    }

    public DocumentRenderer(Context context, ActionHandlerRegistry actionHandlerRegistry, C32054Bx0 c32054Bx0, InterfaceC40057dx0 interfaceC40057dx0) {
        this.styleFactory = new Style.Factory(context);
        this.actionHandlerRegistry = actionHandlerRegistry;
        this.configHelper = c32054Bx0;
        this.configuration = interfaceC40057dx0;
    }

    private Spannable installClickableLinks(Spannable spannable) {
        return replaceUrlSpans(linkifyAll(spannable));
    }

    private static Spannable linkifyAll(Spannable spannable) {
        URLSpan[] uRLSpanArr;
        SpannableString spannableString = new SpannableString(spannable);
        if (Linkify.addLinks(spannableString, 15)) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                spannable.setSpan(uRLSpan, spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 33);
            }
        }
        return spannable;
    }

    private Spannable replaceUrlSpans(Spannable spannable) {
        URLSpan[] uRLSpanArr;
        SpannableString spannableString = new SpannableString(spannable);
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            String url = uRLSpan.getURL();
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new ZendeskUrlSpan(url, this.actionHandlerRegistry, this.configHelper, this.configuration), spanStart, spanEnd, 33);
        }
        return spannableString;
    }

    public Spannable reduce(Node node) {
        Node.Type type = node.getType();
        List<Node> children = node.getChildren();
        if (type == Node.Type.Text) {
            return this.styleFactory.getStyledText(node.getText());
        }
        if (type == Node.Type.Ol || type == Node.Type.Ul) {
            int i = 0;
            for (Node node2 : node.children) {
                node2.attributes.put(Style.C31402Li.PARENT_ATTRIBUTE, type.name());
                i++;
                node2.attributes.put(Style.C31402Li.INDEX_ATTRIBUTE, String.valueOf(i));
            }
        }
        ArrayList arrayList = new ArrayList(children.size());
        for (Node node3 : children) {
            arrayList.add(reduce(node3));
        }
        return this.styleFactory.getStyleForType(type).applyStyle(arrayList, node.getAttributes());
    }

    public CharSequence render(RichRenderingDocument richRenderingDocument) {
        if (richRenderingDocument.isValid()) {
            return render(richRenderingDocument.getNodeTree());
        }
        return installClickableLinks(new SpannableString(richRenderingDocument.getFallbackText()));
    }

    private CharSequence render(Node node) {
        return Style.SpannableHelper.trimSpannable(installClickableLinks(reduce(node)));
    }

    public DocumentRenderer(Style.Factory factory, ActionHandlerRegistry actionHandlerRegistry, C32054Bx0 c32054Bx0, InterfaceC40057dx0 interfaceC40057dx0) {
        this.styleFactory = factory;
        this.actionHandlerRegistry = actionHandlerRegistry;
        this.configHelper = c32054Bx0;
        this.configuration = interfaceC40057dx0;
    }

    /* loaded from: classes8.dex */
    public static class HtmlParser {
        private static final Set<String> UNCLOSED_TAGS = new HashSet(Arrays.asList("br", "hr", "img"));
        private final XmlPullParser xpp;

        public HtmlParser() {
            try {
                try {
                    XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
                    newInstance.setValidating(false);
                    newInstance.setFeature(Xml.FEATURE_RELAXED, true);
                    this.xpp = newInstance.newPullParser();
                } catch (XmlPullParserException e) {
                    C33694Ix2.m101447l("RequestActivity", "Unable to parse rich text. Error: '%s' | '%s'", e.getLocalizedMessage());
                    this.xpp = null;
                }
            } catch (Throwable th) {
                this.xpp = null;
                throw th;
            }
        }

        private Node endTag(Node node) {
            return node.getParent();
        }

        private Map<String, String> getAttributes() {
            int attributeCount = this.xpp.getAttributeCount();
            HashMap hashMap = new HashMap(Math.max(0, attributeCount));
            if (attributeCount > 0) {
                for (int i = 0; i < attributeCount; i++) {
                    hashMap.put(this.xpp.getAttributeName(i), this.xpp.getAttributeValue(i));
                }
            }
            return hashMap;
        }

        private Node startDocument() {
            return Node.withTag(Node.Type.Document.getTag(), null, getAttributes());
        }

        private Node startTag(Node node) {
            String name = this.xpp.getName();
            Node withTag = Node.withTag(name, node, getAttributes());
            node.addChild(withTag);
            if (!UNCLOSED_TAGS.contains(name)) {
                return withTag;
            }
            return node;
        }

        private void text(Node node) {
            String text = this.xpp.getText();
            if (C44504lS5.m27273b(text)) {
                node.addChild(Node.withContent(node, text, getAttributes()));
            }
        }

        public RichRenderingDocument parse(String str, String str2) {
            try {
                this.xpp.setInput(new StringReader(str));
                int eventType = this.xpp.getEventType();
                Node node = null;
                Node node2 = null;
                while (eventType != 1) {
                    if (eventType == 0) {
                        node = startDocument();
                        node2 = node;
                    } else if (eventType == 2) {
                        node2 = startTag(node2);
                    } else if (eventType == 3) {
                        node2 = endTag(node2);
                    } else if (eventType == 4) {
                        text(node2);
                    }
                    eventType = this.xpp.next();
                }
                if (node == node2) {
                    return new RichRenderingDocument(node, str2);
                }
            } catch (Exception e) {
                C33694Ix2.m101447l("RequestActivity", "Unable to parse rich text. Error: '%s' | '%s'", e.getLocalizedMessage(), str);
            }
            return new RichRenderingDocument(null, str2);
        }

        public HtmlParser(XmlPullParser xmlPullParser) {
            this.xpp = xmlPullParser;
        }
    }
}
