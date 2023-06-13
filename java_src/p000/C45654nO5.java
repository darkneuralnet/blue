package p000;

import android.annotation.SuppressLint;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J'\u0010\t\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002R(\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001b\u0010\r\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006 "}, m28432d2 = {"LnO5;", "", "", "i", "", "Ljava/lang/StackTraceElement;", "stackTrace", "", "index", "f", "([Ljava/lang/StackTraceElement;I)Ljava/lang/StackTraceElement;", "element", "c", "className", "h", "<set-?>", C17296a.f69688o, "Ljava/lang/StackTraceElement;", "e", "()Ljava/lang/StackTraceElement;", "b", "g", "element2", "Lkotlin/Lazy;", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "className2", "", "t", "callStackIndex", "<init>", "(Ljava/lang/Throwable;I)V", "lumberjack-library_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: nO5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45654nO5 {

    /* renamed from: e */
    public static final C26487a f99887e = new C26487a(null);

    /* renamed from: f */
    public static final Pattern f99888f = Pattern.compile("(\\$\\d+)+$");

    /* renamed from: a */
    public StackTraceElement f99889a;

    /* renamed from: b */
    public StackTraceElement f99890b;

    /* renamed from: c */
    public final Lazy f99891c;

    /* renamed from: d */
    public final Lazy f99892d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LnO5$a;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "ANONYMOUS_CLASS", "Ljava/util/regex/Pattern;", "<init>", "()V", "lumberjack-library_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: nO5$a */
    /* loaded from: classes6.dex */
    public static final class C26487a {
        public /* synthetic */ C26487a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C26487a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
    /* renamed from: nO5$b */
    /* loaded from: classes6.dex */
    public static final class C26488b extends Lambda implements Function0<String> {
        public C26488b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            C45654nO5 c45654nO5 = C45654nO5.this;
            return c45654nO5.m23855c(c45654nO5.m23853e());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
    /* renamed from: nO5$c */
    /* loaded from: classes6.dex */
    public static final class C26489c extends Lambda implements Function0<String> {
        public C26489c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            C45654nO5 c45654nO5 = C45654nO5.this;
            return c45654nO5.m23855c(c45654nO5.m23851g());
        }
    }

    public C45654nO5(Throwable th, int i) {
        Lazy lazy;
        Lazy lazy2;
        StackTraceElement[] stackTrace;
        int i2;
        String className;
        List split$default;
        Object lastOrNull;
        lazy = LazyKt__LazyJVMKt.lazy(new C26488b());
        this.f99891c = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C26489c());
        this.f99892d = lazy2;
        Integer num = null;
        if (th == null) {
            stackTrace = null;
        } else {
            stackTrace = th.getStackTrace();
        }
        stackTrace = stackTrace == null ? new Throwable().getStackTrace() : stackTrace;
        if (th != null) {
            i2 = 0;
        } else {
            i2 = i + 1;
        }
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        this.f99889a = m23852f(stackTrace, i2);
        if (C32884Fl2.f10066a.m106624a()) {
            StackTraceElement stackTraceElement = this.f99889a;
            if (stackTraceElement != null && (className = stackTraceElement.getClassName()) != null) {
                split$default = StringsKt__StringsKt.split$default((CharSequence) className, new String[]{"$"}, false, 0, 6, (Object) null);
            } else {
                split$default = null;
            }
            if (split$default != null) {
                lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) split$default);
                String str = (String) lastOrNull;
                if (str != null) {
                    num = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
                }
            }
            if (num != null) {
                this.f99890b = this.f99889a;
                this.f99889a = m23852f(stackTrace, i2 + 2);
            }
        }
    }

    /* renamed from: b */
    public final String m23856b() {
        return (String) this.f99891c.getValue();
    }

    /* renamed from: c */
    public final String m23855c(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return "";
        }
        String tag = stackTraceElement.getClassName();
        Matcher matcher = f99888f.matcher(tag);
        if (matcher.find()) {
            tag = matcher.replaceAll("");
        }
        Intrinsics.checkNotNullExpressionValue(tag, "tag");
        return tag;
    }

    /* renamed from: d */
    public final String m23854d() {
        return (String) this.f99892d.getValue();
    }

    /* renamed from: e */
    public final StackTraceElement m23853e() {
        return this.f99889a;
    }

    @SuppressLint({"LogNotTimber"})
    /* renamed from: f */
    public final StackTraceElement m23852f(StackTraceElement[] stackTraceElementArr, int i) {
        boolean z;
        if (stackTraceElementArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (i >= stackTraceElementArr.length) {
            i = stackTraceElementArr.length - 1;
            Log.e("L", "Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }
        return stackTraceElementArr[i];
    }

    /* renamed from: g */
    public final StackTraceElement m23851g() {
        return this.f99890b;
    }

    /* renamed from: h */
    public final String m23850h(String str) {
        int lastIndexOf$default;
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, (char) CoreConstants.DOT, 0, false, 6, (Object) null);
        int i = lastIndexOf$default + 1;
        if (str != null) {
            String substring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: i */
    public final String m23849i() {
        Integer valueOf;
        StackTraceElement stackTraceElement;
        String replace$default;
        String m23850h = m23850h(m23856b());
        StringBuilder sb = new StringBuilder();
        sb.append(m23850h);
        sb.append(CoreConstants.COLON_CHAR);
        StackTraceElement stackTraceElement2 = this.f99889a;
        String str = null;
        if (stackTraceElement2 == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(stackTraceElement2.getLineNumber());
        }
        sb.append(valueOf);
        sb.append(' ');
        StackTraceElement stackTraceElement3 = this.f99889a;
        if (stackTraceElement3 != null) {
            str = stackTraceElement3.getMethodName();
        }
        sb.append((Object) str);
        String sb2 = sb.toString();
        if (this.f99890b != null) {
            replace$default = StringsKt__StringsJVMKt.replace$default(m23850h(m23854d()), m23850h, "", false, 4, (Object) null);
            return sb2 + " (" + replace$default + CoreConstants.COLON_CHAR + stackTraceElement.getLineNumber() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return sb2;
    }
}
