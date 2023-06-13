package p000;

import android.util.Log;
import bo.app.C13021p5;
import bo.app.C13194w5;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001#B\t\b\u0002¢\u0006\u0004\b3\u00102J\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0002J8\u0010\r\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nJ<\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nJ\n\u0010\u0010\u001a\u00020\u0002*\u00020\u0001J\b\u0010\u0011\u001a\u00020\fH\u0007J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J$\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J.\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J.\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J.\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J \u0010\u001a\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0014\u0010\u001d\u001a\u00020\u00022\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0007J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\"\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0002J$\u0010#\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010$\u001a\u00020\bH\u0002R\u0016\u0010&\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010%R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0014\u0010*\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)R0\u0010+\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00128\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010)\u0012\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00064"}, m28432d2 = {"Lk20;", "", "", "o", "Lk20$a;", "priority", "", "tr", "", "includeInTestUserLog", "Lkotlin/Function0;", "message", "", "c", "tag", DateTokenConverter.CONVERTER_KEY, "b", "h", "", "initialLogLevel", "s", "msg", "x", "k", "q", "B", "m", "Ljava/lang/Class;", "classForTag", "n", "Lbo/app/w5;", "loggingManager", "u", "D", "v", C17296a.f69688o, "g", "Z", "isSystemPropLogLevelSet", "hasLogLevelBeenSetForAppRun", "e", "I", "MAX_REMAINING_LENGTH_FOR_CLASS_TAG", "logLevel", "f", "getLogLevel", "()I", "t", "(I)V", "getLogLevel$annotations", "()V", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: k20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43664k20 {

    /* renamed from: b */
    public static C13194w5 f93783b;

    /* renamed from: c */
    public static boolean f93784c;

    /* renamed from: d */
    public static boolean f93785d;

    /* renamed from: a */
    public static final C43664k20 f93782a = new C43664k20();

    /* renamed from: e */
    public static final int f93786e = 65;

    /* renamed from: f */
    public static int f93787f = 4;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"Lk20$a;", "", "", "b", "I", "()I", "logLevel", "<init>", "(Ljava/lang/String;II)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: k20$a */
    /* loaded from: classes2.dex */
    public enum EnumC25082a {
        D(3),
        I(4),
        E(6),
        V(2),
        W(5);
        

        /* renamed from: b */
        public final int f93794b;

        EnumC25082a(int i) {
            this.f93794b = i;
        }

        /* renamed from: b */
        public final int m29419b() {
            return this.f93794b;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: k20$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C25083b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f93795a;

        static {
            int[] iArr = new int[EnumC25082a.values().length];
            iArr[EnumC25082a.D.ordinal()] = 1;
            iArr[EnumC25082a.I.ordinal()] = 2;
            iArr[EnumC25082a.E.ordinal()] = 3;
            iArr[EnumC25082a.W.ordinal()] = 4;
            iArr[EnumC25082a.V.ordinal()] = 5;
            f93795a = iArr;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: k20$c */
    /* loaded from: classes2.dex */
    public static final class C25084c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Exception f93796g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25084c(Exception exc) {
            super(0);
            this.f93796g = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to append to test user device log. ", this.f93796g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: k20$d */
    /* loaded from: classes2.dex */
    public static final class C25085d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f93797g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25085d(String str) {
            super(0);
            this.f93797g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "BrazeLogger log level set to " + this.f93797g + " via device system property. Note that subsequent calls to BrazeLogger.setLogLevel() will have no effect.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: k20$e */
    /* loaded from: classes2.dex */
    public static final class C25086e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f93798g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25086e(int i) {
            super(0);
            this.f93798g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Log level already set via system property. BrazeLogger.setLogLevel() ignored for level: ", Integer.valueOf(this.f93798g));
        }
    }

    private C43664k20() {
    }

    @JvmStatic
    /* renamed from: A */
    public static final void m29450A(String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        m29448C(tag, msg, th, false, 8, null);
    }

    @JvmStatic
    /* renamed from: B */
    public static final void m29449B(String tag, String msg, Throwable th, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (z) {
            f93782a.m29446a(tag, msg, th);
        }
        if (f93787f <= 5) {
            if (th != null) {
                Log.w(tag, msg, th);
            } else {
                Log.w(tag, msg);
            }
        }
    }

    /* renamed from: C */
    public static /* synthetic */ void m29448C(String str, String str2, Throwable th, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        m29449B(str, str2, th, z);
    }

    /* renamed from: e */
    public static /* synthetic */ void m29442e(C43664k20 c43664k20, Object obj, EnumC25082a enumC25082a, Throwable th, boolean z, Function0 function0, int i, Object obj2) {
        if ((i & 1) != 0) {
            enumC25082a = EnumC25082a.D;
        }
        EnumC25082a enumC25082a2 = enumC25082a;
        if ((i & 2) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i & 4) != 0) {
            z = true;
        }
        c43664k20.m29444c(obj, enumC25082a2, th2, z, function0);
    }

    /* renamed from: f */
    public static /* synthetic */ void m29441f(C43664k20 c43664k20, String str, EnumC25082a enumC25082a, Throwable th, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC25082a = EnumC25082a.D;
        }
        EnumC25082a enumC25082a2 = enumC25082a;
        if ((i & 4) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i & 8) != 0) {
            z = true;
        }
        c43664k20.m29443d(str, enumC25082a2, th2, z, function0);
    }

    @JvmStatic
    /* renamed from: h */
    public static final synchronized void m29439h() {
        synchronized (C43664k20.class) {
            C13021p5 c13021p5 = C13021p5.f59086a;
            C43664k20 c43664k20 = f93782a;
            String m63150a = c13021p5.m63150a("log.tag.APPBOY");
            if (StringsKt.equals("verbose", StringsKt.trim((CharSequence) m63150a).toString(), true)) {
                f93784c = true;
                m29427t(2);
                m29442e(c43664k20, c43664k20, EnumC25082a.I, null, false, new C25085d(m63150a), 6, null);
            }
        }
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m29438i(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        m29435l(tag, msg, null, false, 12, null);
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m29437j(String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        m29435l(tag, msg, th, false, 8, null);
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m29436k(String tag, String msg, Throwable th, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (z) {
            f93782a.m29446a(tag, msg, th);
        }
        if (f93787f <= 3) {
            if (th != null) {
                Log.d(tag, msg, th);
            } else {
                Log.d(tag, msg);
            }
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m29435l(String str, String str2, Throwable th, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        m29436k(str, str2, th, z);
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m29434m(String tag, String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr, "tr");
        f93782a.m29446a(tag, msg, tr);
        if (f93787f <= 6) {
            Log.e(tag, msg, tr);
        }
    }

    @JvmStatic
    /* renamed from: n */
    public static final String m29433n(Class<?> classForTag) {
        Intrinsics.checkNotNullParameter(classForTag, "classForTag");
        String fullClassName = classForTag.getName();
        int length = fullClassName.length();
        int i = f93786e;
        if (length <= i) {
            Intrinsics.checkNotNullExpressionValue(fullClassName, "{\n            // No need…  fullClassName\n        }");
        } else {
            Intrinsics.checkNotNullExpressionValue(fullClassName, "fullClassName");
            fullClassName = fullClassName.substring(length - i);
            Intrinsics.checkNotNullExpressionValue(fullClassName, "this as java.lang.String).substring(startIndex)");
        }
        return Intrinsics.stringPlus("Braze v21.0.0 .", fullClassName);
    }

    @JvmStatic
    /* renamed from: p */
    public static final void m29431p(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        m29429r(tag, msg, null, false, 12, null);
    }

    @JvmStatic
    /* renamed from: q */
    public static final void m29430q(String tag, String msg, Throwable th, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (z) {
            f93782a.m29446a(tag, msg, th);
        }
        if (f93787f <= 4) {
            if (th != null) {
                Log.i(tag, msg, th);
            } else {
                Log.i(tag, msg);
            }
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m29429r(String str, String str2, Throwable th, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        m29430q(str, str2, th, z);
    }

    @JvmStatic
    /* renamed from: s */
    public static final synchronized void m29428s(int i) {
        synchronized (C43664k20.class) {
            if (!f93785d) {
                m29427t(i);
            }
        }
    }

    /* renamed from: t */
    public static final synchronized void m29427t(int i) {
        synchronized (C43664k20.class) {
            if (!f93784c) {
                f93785d = true;
                f93787f = i;
            } else {
                C43664k20 c43664k20 = f93782a;
                m29442e(c43664k20, c43664k20, EnumC25082a.W, null, false, new C25086e(i), 6, null);
            }
        }
    }

    @JvmStatic
    /* renamed from: u */
    public static final void m29426u(C13194w5 loggingManager) {
        Intrinsics.checkNotNullParameter(loggingManager, "loggingManager");
        f93783b = loggingManager;
    }

    @JvmStatic
    /* renamed from: w */
    public static final void m29424w(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        m29422y(tag, msg, null, 4, null);
    }

    @JvmStatic
    /* renamed from: x */
    public static final void m29423x(String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f93787f <= 2) {
            if (th != null) {
                Log.v(tag, msg, th);
            } else {
                Log.v(tag, msg);
            }
        }
    }

    /* renamed from: y */
    public static /* synthetic */ void m29422y(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        m29423x(str, str2, th);
    }

    @JvmStatic
    /* renamed from: z */
    public static final void m29421z(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        m29448C(tag, msg, null, false, 12, null);
    }

    /* renamed from: D */
    public final boolean m29447D(boolean z) {
        return z && m29440g();
    }

    /* renamed from: a */
    public final void m29446a(String str, String str2, Throwable th) {
        try {
            if (m29440g()) {
                C13194w5 c13194w5 = f93783b;
                if (c13194w5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("testUserDeviceLoggingManager");
                    c13194w5 = null;
                }
                c13194w5.m62837a(str, str2, th);
            }
        } catch (Exception e) {
            m29442e(this, this, EnumC25082a.E, e, false, new C25084c(e), 4, null);
        }
    }

    /* renamed from: b */
    public final String m29445b(Object obj) {
        boolean z;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String fullClassName = obj.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(fullClassName, "fullClassName");
        String substringAfterLast$default = StringsKt.substringAfterLast$default(StringsKt.substringBefore$default(fullClassName, '$', (String) null, 2, (Object) null), (char) CoreConstants.DOT, (String) null, 2, (Object) null);
        if (substringAfterLast$default.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m29432o(fullClassName);
        }
        return m29432o(substringAfterLast$default);
    }

    /* renamed from: c */
    public final void m29444c(Object obj, EnumC25082a priority, Throwable th, boolean z, Function0<String> message) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        if (f93787f <= priority.m29419b() || m29447D(z)) {
            m29443d(m29445b(obj), priority, th, z, message);
        }
    }

    /* renamed from: d */
    public final void m29443d(String tag, EnumC25082a priority, Throwable th, boolean z, Function0<String> message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        if (f93787f <= priority.m29419b() || m29447D(z)) {
            int i = C25083b.f93795a[priority.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (th == null) {
                                    Log.v(tag, m29425v(message));
                                } else {
                                    Log.v(tag, m29425v(message), th);
                                }
                            }
                        } else if (th == null) {
                            Log.w(tag, m29425v(message));
                        } else {
                            Log.w(tag, m29425v(message), th);
                        }
                    } else if (th == null) {
                        Log.w(tag, m29425v(message));
                    } else {
                        Log.e(tag, m29425v(message), th);
                    }
                } else if (th == null) {
                    Log.i(tag, m29425v(message));
                } else {
                    Log.i(tag, m29425v(message), th);
                }
            } else if (th == null) {
                Log.d(tag, m29425v(message));
            } else {
                Log.d(tag, m29425v(message), th);
            }
        }
    }

    /* renamed from: g */
    public final boolean m29440g() {
        C13194w5 c13194w5 = f93783b;
        if (c13194w5 == null) {
            return false;
        }
        return c13194w5.m62832e();
    }

    /* renamed from: o */
    public final String m29432o(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Intrinsics.stringPlus("Braze v21.0.0 .", str);
    }

    /* renamed from: v */
    public final String m29425v(Function0<? extends Object> function0) {
        try {
            return String.valueOf(function0.invoke());
        } catch (Exception unused) {
            return "";
        }
    }
}
