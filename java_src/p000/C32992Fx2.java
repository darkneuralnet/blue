package p000;

import android.util.Log;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 %2\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J)\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0001J\b\u0010\u0011\u001a\u00020\u0010H\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\u001b\u001a\u00060\u0018j\u0002`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR*\u0010\"\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006&"}, m28432d2 = {"LFx2;", "", "", "e", "", "string", "i", "b", "format", "", "args", "c", "(Ljava/lang/String;[Ljava/lang/Object;)V", "key", "value", DateTokenConverter.CONVERTER_KEY, "", "j", "LSx2;", C17296a.f69688o, "LSx2;", "behavior", "Ljava/lang/String;", "tag", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "contents", "", "I", "getPriority", "()I", "setPriority", "(I)V", "priority", "<init>", "(LSx2;Ljava/lang/String;)V", "f", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Fx2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32992Fx2 {

    /* renamed from: a */
    public final EnumC36034Sx2 f10540a;

    /* renamed from: b */
    public final String f10541b;

    /* renamed from: c */
    public StringBuilder f10542c;

    /* renamed from: d */
    public int f10543d;

    /* renamed from: f */
    public static final C2516a f10539f = new C2516a(null);

    /* renamed from: e */
    public static final HashMap<String, String> f10538e = new HashMap<>();

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0007J \u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0007J;\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0017\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0007J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR0\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001bj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, m28432d2 = {"LFx2$a;", "", "", "original", Parser.REPLACE_CONVERTER_WORD, "", "f", "accessToken", "e", "LSx2;", "behavior", "tag", "string", "c", "format", "", "args", DateTokenConverter.CONVERTER_KEY, "(LSx2;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "", "priority", "b", "(LSx2;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", C17296a.f69688o, "g", "LOG_TAG_BASE", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "stringsToReplace", "Ljava/util/HashMap;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Fx2$a */
    /* loaded from: classes5.dex */
    public static final class C2516a {
        private C2516a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void m106216a(EnumC36034Sx2 behavior, int i, String tag, String string) {
            boolean startsWith$default;
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            if (C17216a.m52720z(behavior)) {
                String m106210g = m106210g(string);
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(tag, "FacebookSDK.", false, 2, null);
                if (!startsWith$default) {
                    tag = "FacebookSDK." + tag;
                }
                Log.println(i, tag, m106210g);
                if (behavior == EnumC36034Sx2.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        @JvmStatic
        /* renamed from: b */
        public final void m106215b(EnumC36034Sx2 behavior, int i, String tag, String format, Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (C17216a.m52720z(behavior)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                m106216a(behavior, i, tag, format2);
            }
        }

        @JvmStatic
        /* renamed from: c */
        public final void m106214c(EnumC36034Sx2 behavior, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            m106216a(behavior, 3, tag, string);
        }

        @JvmStatic
        /* renamed from: d */
        public final void m106213d(EnumC36034Sx2 behavior, String tag, String format, Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (C17216a.m52720z(behavior)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                m106216a(behavior, 3, tag, format2);
            }
        }

        @JvmStatic
        /* renamed from: e */
        public final synchronized void m106212e(String accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            if (!C17216a.m52720z(EnumC36034Sx2.INCLUDE_ACCESS_TOKENS)) {
                m106211f(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        @JvmStatic
        /* renamed from: f */
        public final synchronized void m106211f(String original, String replace) {
            Intrinsics.checkNotNullParameter(original, "original");
            Intrinsics.checkNotNullParameter(replace, "replace");
            C32992Fx2.f10538e.put(original, replace);
        }

        /* renamed from: g */
        public final synchronized String m106210g(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : C32992Fx2.f10538e.entrySet()) {
                str2 = StringsKt__StringsJVMKt.replace$default(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
            }
            return str2;
        }

        public /* synthetic */ C2516a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C32992Fx2(EnumC36034Sx2 behavior, String tag) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f10543d = 3;
        C48817sj6.m13764n(tag, "tag");
        this.f10540a = behavior;
        this.f10541b = "FacebookSDK." + tag;
        this.f10542c = new StringBuilder();
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m106221f(EnumC36034Sx2 enumC36034Sx2, int i, String str, String str2) {
        f10539f.m106216a(enumC36034Sx2, i, str, str2);
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m106220g(EnumC36034Sx2 enumC36034Sx2, String str, String str2) {
        f10539f.m106214c(enumC36034Sx2, str, str2);
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m106219h(EnumC36034Sx2 enumC36034Sx2, String str, String str2, Object... objArr) {
        f10539f.m106213d(enumC36034Sx2, str, str2, objArr);
    }

    /* renamed from: b */
    public final void m106225b(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (m106217j()) {
            this.f10542c.append(string);
        }
    }

    /* renamed from: c */
    public final void m106224c(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (m106217j()) {
            StringBuilder sb = this.f10542c;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
            sb.append(format2);
        }
    }

    /* renamed from: d */
    public final void m106223d(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        m106224c("  %s:\t%s\n", key, value);
    }

    /* renamed from: e */
    public final void m106222e() {
        String sb = this.f10542c.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "contents.toString()");
        m106218i(sb);
        this.f10542c = new StringBuilder();
    }

    /* renamed from: i */
    public final void m106218i(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        f10539f.m106216a(this.f10540a, this.f10543d, this.f10541b, string);
    }

    /* renamed from: j */
    public final boolean m106217j() {
        return C17216a.m52720z(this.f10540a);
    }
}
