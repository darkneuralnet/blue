package p000;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import android.widget.TextView;
import co.bird.android.model.Detail;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C2898Gd;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0003\u0016\u001a\u001eB\u0007¢\u0006\u0004\b!\u0010\"J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJB\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0010H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"Lzd1;", "", "", "prefix", "Ljava/io/PrintWriter;", "writer", "", "args", "", "g", "(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "Landroid/view/View;", "view", "", "leftOffset", "topOffset", "", "withWebView", "withProps", "f", "i", "LGd;", C17296a.f69688o, "LGd;", "rootResolver", "LoA6;", "b", "LoA6;", "webViewDumpHelper", "Ljava/lang/reflect/Method;", "c", "Ljava/lang/reflect/Method;", "lithoViewToStringMethod", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
@SuppressLint({"HexColorValueUsage", "CatchGeneralException", "BadMethodUse-java.lang.String.length"})
/* renamed from: zd1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52902zd1 {

    /* renamed from: d */
    public static C52902zd1 f121646d;

    /* renamed from: e */
    public static Method f121647e;

    /* renamed from: f */
    public static final C31063c f121648f = new C31063c(null);

    /* renamed from: a */
    public final C2898Gd f121649a = new C2898Gd();

    /* renamed from: b */
    public final C46122oA6 f121650b = new C46122oA6();

    /* renamed from: c */
    public Method f121651c;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"Lzd1$a;", "", "Ljava/io/PrintWriter;", "writer", "Landroid/view/View;", "view", "", "b", "Lorg/json/JSONObject;", C17296a.f69688o, "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Field;", "keyedTagsField", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: zd1$a */
    /* loaded from: classes5.dex */
    public static final class C31061a {

        /* renamed from: a */
        public static Field f121652a;

        /* renamed from: b */
        public static final C31061a f121653b = new C31061a();

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mKeyedTags");
                f121652a = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (NoSuchFieldException unused) {
            }
        }

        private C31061a() {
        }

        /* renamed from: a */
        public final JSONObject m992a(View view) {
            Object obj;
            try {
                if (f121652a == null) {
                    Field declaredField = View.class.getDeclaredField("mKeyedTags");
                    f121652a = declaredField;
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                }
                Field field = f121652a;
                if (field != null) {
                    obj = field.get(view);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    SparseArray sparseArray = (SparseArray) obj;
                    if (sparseArray.size() <= 0) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int size = sparseArray.size();
                        for (int i = 0; i < size; i++) {
                            try {
                                jSONObject.put(BM4.m114077c(view.getResources(), sparseArray.keyAt(i)), sparseArray.valueAt(i));
                            } catch (JSONException unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    return jSONObject;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.util.SparseArray<*>");
            } catch (Exception unused3) {
                return null;
            }
        }

        /* renamed from: b */
        public final void m991b(PrintWriter writer, View view) {
            boolean z;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(view, "view");
            C31063c c31063c = C52902zd1.f121648f;
            AccessibilityNodeInfo m981i = c31063c.m981i(view);
            if (m981i != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (view instanceof TextView) {
                        ColorStateList textColors = ((TextView) view).getTextColors();
                        Intrinsics.checkNotNullExpressionValue(textColors, "view.textColors");
                        jSONObject.put("textColor", textColors.getDefaultColor());
                        jSONObject.put("textSize", ((TextView) view).getTextSize());
                        jSONObject.put("hint", c31063c.m980j(((TextView) view).getHint(), 100));
                    }
                    JSONObject m992a = m992a(view);
                    if (m992a != null) {
                        jSONObject.put("keyedTags", m992a);
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (AccessibilityNodeInfo.AccessibilityAction action : m981i.getActionList()) {
                        Intrinsics.checkNotNullExpressionValue(action, "action");
                        CharSequence label = action.getLabel();
                        if (label != null) {
                            jSONArray.put(C52902zd1.f121648f.m980j((String) label, 50));
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("actions", jSONArray);
                    }
                    C31063c c31063c2 = C52902zd1.f121648f;
                    String m980j = c31063c2.m980j(m981i.getContentDescription(), 50);
                    if (m980j != null) {
                        if (m980j.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            jSONObject.put("content-description", m980j);
                        }
                    }
                    jSONObject.put("accessibility-focused", m981i.isAccessibilityFocused()).put("checkable", m981i.isCheckable()).put("checked", m981i.isChecked()).put("class-name", c31063c2.m980j(m981i.getClassName(), 50)).put("clickable", m981i.isClickable()).put("content-invalid", m981i.isContentInvalid()).put("dismissable", m981i.isDismissable()).put("editable", m981i.isEditable()).put("enabled", m981i.isEnabled()).put("focusable", m981i.isFocusable()).put("focused", m981i.isFocused()).put("long-clickable", m981i.isLongClickable()).put("multiline", m981i.isMultiLine()).put("password", m981i.isPassword()).put("scrollable", m981i.isScrollable()).put("selected", m981i.isSelected()).put("visible-to-user", m981i.isVisibleToUser());
                    C31062b.f121654a.m990a(jSONObject, m981i);
                } catch (Exception e) {
                    try {
                        jSONObject.put("DUMP-ERROR", C52902zd1.f121648f.m980j(e.getMessage(), 50));
                    } catch (JSONException unused) {
                    }
                }
                writer.append(" props=\"").append((CharSequence) jSONObject.toString()).append("\"");
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, m28432d2 = {"Lzd1$b;", "", "Lorg/json/JSONObject;", "props", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "", C17296a.f69688o, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: zd1$b */
    /* loaded from: classes5.dex */
    public static final class C31062b {

        /* renamed from: a */
        public static final C31062b f121654a = new C31062b();

        private C31062b() {
        }

        /* renamed from: a */
        public final void m990a(JSONObject props, AccessibilityNodeInfo nodeInfo) throws JSONException {
            Intrinsics.checkNotNullParameter(props, "props");
            Intrinsics.checkNotNullParameter(nodeInfo, "nodeInfo");
            props.put("context-clickable", nodeInfo.isContextClickable()).put("drawing-order", nodeInfo.getDrawingOrder()).put("important-for-accessibility", nodeInfo.isImportantForAccessibility());
        }
    }

    @Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J(\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0003J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u0010H\u0002J'\u0010\u001d\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\"R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\"R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\"R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, m28432d2 = {"Lzd1$c;", "", "", "prefix", "Ljava/io/PrintWriter;", "writer", "", "args", "", "n", "(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)Z", "Landroid/view/View;", "view", "m", "", "q", "", "leftOffset", "topOffset", "p", "r", "o", "s", "k", "", "str", "maxLength", "j", "argument", "l", "([Ljava/lang/String;Ljava/lang/String;)Z", "Landroid/view/accessibility/AccessibilityNodeInfo;", "i", "ALL_ROOTS_ARGUMENT", "Ljava/lang/String;", "E2E_ARGUMENT", "LITHO_VIEW_CLASS", "LITHO_VIEW_TEST_HELPER_CLASS", "LITHO_VIEW_TO_STRING_METHOD", "RC_TEXT_VIEW_SIMPLE_CLASS_NAME", "TOP_ROOT_ARGUMENT", "WITH_PROPS_ARGUMENT", "WITH_WEBVIEW_ARGUMENT", "Lzd1;", "instance", "Lzd1;", "Ljava/lang/reflect/Method;", "rcTextViewGetTextMethod", "Ljava/lang/reflect/Method;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: zd1$c */
    /* loaded from: classes5.dex */
    public static final class C31063c {
        private C31063c() {
        }

        /* renamed from: i */
        public final AccessibilityNodeInfo m981i(View view) {
            if (view == null) {
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            try {
                view.onInitializeAccessibilityNodeInfo(obtain);
                return obtain;
            } catch (NullPointerException unused) {
                if (obtain != null) {
                    obtain.recycle();
                }
                return null;
            }
        }

        /* renamed from: j */
        public final String m980j(CharSequence charSequence, int i) {
            boolean z;
            String replace$default;
            String replace$default2;
            String replace$default3;
            if (charSequence != null) {
                if (charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    replace$default = StringsKt__StringsJVMKt.replace$default(charSequence.toString(), " \n", " ", false, 4, (Object) null);
                    replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "\n", " ", false, 4, (Object) null);
                    replace$default3 = StringsKt__StringsJVMKt.replace$default(replace$default2, "\"", "", false, 4, (Object) null);
                    if (charSequence.length() > i) {
                        StringBuilder sb = new StringBuilder();
                        if (replace$default3 != null) {
                            String substring = replace$default3.substring(0, i);
                            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            sb.append(substring);
                            sb.append("...");
                            return sb.toString();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    return replace$default3;
                }
                return "";
            }
            return "";
        }

        @SuppressLint({"PrivateApi", "ReflectionMethodUse"})
        /* renamed from: k */
        public final String m979k(View view) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
            Object obj;
            if (C52902zd1.f121647e == null) {
                C52902zd1.f121647e = view.getClass().getDeclaredMethod("getText", new Class[0]);
            }
            Method method = C52902zd1.f121647e;
            if (method != null) {
                obj = method.invoke(view, new Object[0]);
            } else {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            return obj.toString();
        }

        /* renamed from: l */
        public final boolean m978l(String[] strArr, String str) {
            boolean equals;
            if (strArr == null) {
                return false;
            }
            for (String str2 : strArr) {
                equals = StringsKt__StringsJVMKt.equals(str, str2, true);
                if (equals) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: m */
        public final boolean m977m(View view) {
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                if (Intrinsics.areEqual(cls.getName(), "com.facebook.litho.LithoView")) {
                    return true;
                }
            }
            return false;
        }

        @JvmStatic
        /* renamed from: n */
        public final boolean m976n(String prefix, PrintWriter writer, String[] strArr) {
            boolean z;
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (strArr != null) {
                if (strArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((!z) && Intrinsics.areEqual("e2e", strArr[0])) {
                    if (C52902zd1.f121646d == null) {
                        C52902zd1.f121646d = new C52902zd1();
                    }
                    C52902zd1 c52902zd1 = C52902zd1.f121646d;
                    if (c52902zd1 != null) {
                        c52902zd1.m995g(prefix, writer, strArr);
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: o */
        public final void m975o(PrintWriter printWriter, View view) {
            boolean z;
            Object tag = view.getTag();
            if (!(tag instanceof String)) {
                tag = null;
            }
            String str = (String) tag;
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
                printWriter.print(" app:tag/");
                printWriter.print(m980j(str, 60));
            }
        }

        /* renamed from: p */
        public final void m974p(PrintWriter printWriter, View view, int i, int i2) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            printWriter.print(" ");
            printWriter.print(iArr[0] - i);
            printWriter.print(",");
            printWriter.print(iArr[1] - i2);
            printWriter.print(Detail.EMPTY_CHAR);
            printWriter.print((iArr[0] + view.getWidth()) - i);
            printWriter.print(",");
            printWriter.print((iArr[1] + view.getHeight()) - i2);
        }

        /* renamed from: q */
        public final void m973q(PrintWriter printWriter, View view) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            printWriter.print(" ");
            int visibility = view.getVisibility();
            String str8 = "V";
            String str9 = InstructionFileId.DOT;
            if (visibility != 0) {
                if (visibility != 4) {
                    if (visibility != 8) {
                        printWriter.print(InstructionFileId.DOT);
                    } else {
                        printWriter.print("G");
                    }
                } else {
                    printWriter.print("I");
                }
            } else {
                printWriter.print("V");
            }
            String str10 = "F";
            if (view.isFocusable()) {
                str = "F";
            } else {
                str = InstructionFileId.DOT;
            }
            printWriter.print(str);
            if (view.isEnabled()) {
                str2 = "E";
            } else {
                str2 = InstructionFileId.DOT;
            }
            printWriter.print(str2);
            printWriter.print(InstructionFileId.DOT);
            String str11 = "H";
            if (view.isHorizontalScrollBarEnabled()) {
                str3 = "H";
            } else {
                str3 = InstructionFileId.DOT;
            }
            printWriter.print(str3);
            if (!view.isVerticalScrollBarEnabled()) {
                str8 = InstructionFileId.DOT;
            }
            printWriter.print(str8);
            if (view.isClickable()) {
                str4 = Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE;
            } else {
                str4 = InstructionFileId.DOT;
            }
            printWriter.print(str4);
            if (view.isLongClickable()) {
                str5 = "L";
            } else {
                str5 = InstructionFileId.DOT;
            }
            printWriter.print(str5);
            printWriter.print(" ");
            if (!view.isFocused()) {
                str10 = InstructionFileId.DOT;
            }
            printWriter.print(str10);
            if (view.isSelected()) {
                str6 = "S";
            } else {
                str6 = InstructionFileId.DOT;
            }
            printWriter.print(str6);
            if (!view.isHovered()) {
                str11 = InstructionFileId.DOT;
            }
            printWriter.print(str11);
            if (view.isActivated()) {
                str7 = "A";
            } else {
                str7 = InstructionFileId.DOT;
            }
            printWriter.print(str7);
            if (view.isDirty()) {
                str9 = "D";
            }
            printWriter.print(str9);
        }

        /* renamed from: r */
        public final void m972r(PrintWriter printWriter, View view) {
            String str;
            try {
                int id = view.getId();
                if (id == -1) {
                    m975o(printWriter, view);
                    return;
                }
                printWriter.append(" #");
                printWriter.append((CharSequence) Integer.toHexString(id));
                Resources resources = view.getResources();
                if (id > 0 && resources != null) {
                    int i = (-16777216) & id;
                    if (i != 16777216) {
                        if (i != 2130706432) {
                            str = resources.getResourcePackageName(id);
                            Intrinsics.checkNotNullExpressionValue(str, "resources.getResourcePackageName(id)");
                        } else {
                            str = Stripe3ds2AuthParams.FIELD_APP;
                        }
                    } else {
                        str = "android";
                    }
                    printWriter.print(" ");
                    printWriter.print(str);
                    printWriter.print(":");
                    printWriter.print(resources.getResourceTypeName(id));
                    printWriter.print("/");
                    printWriter.print(resources.getResourceEntryName(id));
                    return;
                }
                m975o(printWriter, view);
            } catch (Exception unused) {
                m975o(printWriter, view);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
            if (r3 != false) goto L30;
         */
        @SuppressLint({"ReflectionMethodUse"})
        /* renamed from: s */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m971s(PrintWriter printWriter, View view) {
            String str;
            String obj;
            int i;
            boolean z;
            boolean z2;
            try {
                boolean z3 = false;
                if (view instanceof TextView) {
                    obj = ((TextView) view).getText().toString();
                } else if (Intrinsics.areEqual(view.getClass().getSimpleName(), "RCTextView")) {
                    obj = m979k(view);
                } else {
                    CharSequence contentDescription = view.getContentDescription();
                    if (contentDescription != null) {
                        str = contentDescription.toString();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        if (str.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    Object tag = view.getTag();
                    if (tag != null) {
                        String obj2 = tag.toString();
                        int length = obj2.length() - 1;
                        int i2 = 0;
                        boolean z4 = false;
                        while (i2 <= length) {
                            if (!z4) {
                                i = i2;
                            } else {
                                i = length;
                            }
                            if (Intrinsics.compare((int) obj2.charAt(i), 32) <= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z4) {
                                if (!z) {
                                    z4 = true;
                                } else {
                                    i2++;
                                }
                            } else if (!z) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        obj = obj2.subSequence(i2, length + 1).toString();
                    }
                    obj = str;
                }
                if (obj != null) {
                    if (obj.length() == 0) {
                        z3 = true;
                    }
                    if (!z3) {
                        printWriter.print(" text=\"");
                        printWriter.print(m980j(obj, 600));
                        printWriter.print("\"");
                    }
                }
            } catch (Exception unused) {
            }
        }

        public /* synthetic */ C31063c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    /* renamed from: h */
    public static final boolean m994h(String str, PrintWriter printWriter, String[] strArr) {
        return f121648f.m976n(str, printWriter, strArr);
    }

    /* renamed from: f */
    public final void m996f(String str, PrintWriter printWriter, View view, int i, int i2, boolean z, boolean z2) {
        ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.print(view.getClass().getName());
        printWriter.print("{");
        printWriter.print(Integer.toHexString(view.hashCode()));
        C31063c c31063c = f121648f;
        c31063c.m973q(printWriter, view);
        c31063c.m974p(printWriter, view, i, i2);
        c31063c.m972r(printWriter, view);
        c31063c.m971s(printWriter, view);
        if (z2) {
            C31061a.f121653b.m991b(printWriter, view);
        }
        printWriter.println("}");
        if (c31063c.m977m(view)) {
            m993i(printWriter, view, str, z2);
        }
        if (z && (view instanceof WebView)) {
            this.f121650b.m21674c((WebView) view);
        }
        if (!(view instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) view).getChildCount()) <= 0) {
            return;
        }
        String str2 = str + "  ";
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        for (int i3 = 0; i3 < childCount; i3++) {
            m996f(str2, printWriter, viewGroup.getChildAt(i3), iArr[0], iArr[1], z, z2);
        }
    }

    /* renamed from: g */
    public final void m995g(String str, PrintWriter printWriter, String[] strArr) {
        View m104951b;
        printWriter.print(str);
        printWriter.println("Top Level Window View Hierarchy:");
        C31063c c31063c = f121648f;
        boolean m978l = c31063c.m978l(strArr, "all-roots");
        boolean m978l2 = c31063c.m978l(strArr, "top-root");
        boolean m978l3 = c31063c.m978l(strArr, "webview");
        boolean m978l4 = c31063c.m978l(strArr, "props");
        try {
            List<C2898Gd.C2900b> m104953b = this.f121649a.m104953b();
            if (m104953b != null && !m104953b.isEmpty()) {
                Collections.reverse(m104953b);
                WindowManager.LayoutParams layoutParams = null;
                for (C2898Gd.C2900b c2900b : m104953b) {
                    if (c2900b != null && (m104951b = c2900b.m104951b()) != null && m104951b.getVisibility() == 0) {
                        if (!m978l && layoutParams != null && Math.abs(c2900b.m104952a().type - layoutParams.type) != 1) {
                            break;
                        }
                        m996f(str + "  ", printWriter, c2900b.m104951b(), 0, 0, m978l3, m978l4);
                        layoutParams = c2900b.m104952a();
                        if (m978l2) {
                            break;
                        }
                    }
                }
                this.f121650b.m21675b(printWriter);
            }
        } catch (Exception e) {
            printWriter.println("Failure in view hierarchy dump: " + e.getMessage());
        }
    }

    /* renamed from: i */
    public final void m993i(PrintWriter printWriter, View view, String str, boolean z) {
        try {
            if (this.f121651c == null) {
                Class<?> cls = Class.forName("com.facebook.litho.LithoViewTestHelper");
                Intrinsics.checkNotNullExpressionValue(cls, "Class.forName(LITHO_VIEW_TEST_HELPER_CLASS)");
                this.f121651c = cls.getDeclaredMethod("viewToStringForE2E", View.class, Integer.TYPE, Boolean.TYPE);
            }
            Method method = this.f121651c;
            Object obj = null;
            if (method != null) {
                obj = method.invoke(null, view, Integer.valueOf((str.length() / 2) + 1), Boolean.valueOf(z));
            }
            if (obj != null) {
                Intrinsics.checkNotNullExpressionValue(printWriter.append((CharSequence) ((String) obj)), "writer.append(lithoViewDump)");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e) {
            printWriter.append((CharSequence) str).append("Failed litho view sub hierarch dump: ").append((CharSequence) f121648f.m980j(e.getMessage(), 100)).println();
        }
    }
}
