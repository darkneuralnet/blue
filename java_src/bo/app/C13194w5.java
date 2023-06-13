package bo.app;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b \u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u000e\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\tH\u0007R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8G¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0003\u0010\u0017R*\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0003\u0010\u001f¨\u0006!"}, m28432d2 = {"Lbo/app/w5;", "", "", C17296a.f69688o, "", "tag", "msg", "", "tr", "", "Lbo/app/y4;", "serverConfig", "b", "", "deviceLogBuffer", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "Lbo/app/y1;", "brazeManager", "Lbo/app/y1;", "c", "()Lbo/app/y1;", "(Lbo/app/y1;)V", "getBrazeManager$annotations", "()V", "enabled", "isTestUserLoggingEnabled", "Z", "e", "()Z", "(Z)V", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.w5 */
/* loaded from: classes.dex */
public class C13194w5 {

    /* renamed from: f */
    public static final C13195a f59396f = new C13195a(null);

    /* renamed from: b */
    private long f59398b;

    /* renamed from: d */
    public InterfaceC13231y1 f59400d;

    /* renamed from: e */
    private boolean f59401e;

    /* renamed from: a */
    private final List<String> f59397a = new ArrayList(32);

    /* renamed from: c */
    private final Object f59399c = new Object();

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\fJ\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087T¢\u0006\f\n\u0004\b\r\u0010\n\u0012\u0004\b\u000e\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lbo/app/w5$a;", "", "", "tag", "msg", "", "tr", C17296a.f69688o, "", "BUFFER_MAX_LINES", "I", "getBUFFER_MAX_LINES$annotations", "()V", "MAX_LINE_LENGTH", "getMAX_LINE_LENGTH$annotations", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.w5$a */
    /* loaded from: classes.dex */
    public static final class C13195a {
        public /* synthetic */ C13195a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m62831a(String tag, String msg, Throwable th) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            String str = C46287oT0.m21030f(EnumC37717a20.ANDROID_LOGCAT) + ' ' + tag + ": " + msg;
            if (th != null) {
                str = str + ": " + ((Object) th.getMessage());
            }
            String substring = str.substring(0, Math.min(str.length(), 1000));
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        private C13195a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.w5$b */
    /* loaded from: classes.dex */
    public static final class C13196b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13196b f59402b = new C13196b();

        public C13196b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Test user device logging is enabled.";
        }
    }

    /* renamed from: a */
    public final void m62839a(InterfaceC13231y1 interfaceC13231y1) {
        Intrinsics.checkNotNullParameter(interfaceC13231y1, "<set-?>");
        this.f59400d = interfaceC13231y1;
    }

    /* renamed from: b */
    public final void m62835b() {
        List<String> mutableList;
        synchronized (this.f59399c) {
            if (this.f59400d != null) {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) m62833d());
                m62834c().mo62751a(mutableList, this.f59398b);
            }
            m62833d().clear();
            this.f59398b = 0L;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: c */
    public final InterfaceC13231y1 m62834c() {
        InterfaceC13231y1 interfaceC13231y1 = this.f59400d;
        if (interfaceC13231y1 != null) {
            return interfaceC13231y1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("brazeManager");
        return null;
    }

    /* renamed from: d */
    public final List<String> m62833d() {
        return this.f59397a;
    }

    /* renamed from: e */
    public final boolean m62832e() {
        return this.f59401e;
    }

    /* renamed from: a */
    public final void m62836a(boolean z) {
        synchronized (this.f59399c) {
            if (!z) {
                m62833d().clear();
            } else {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C13196b.f59402b, 2, null);
            }
            Unit unit = Unit.INSTANCE;
        }
        this.f59401e = z;
    }

    /* renamed from: a */
    public void m62837a(String tag, String msg, Throwable th) {
        boolean contains$default;
        boolean contains$default2;
        boolean isBlank;
        boolean isBlank2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (this.f59401e) {
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) msg, (CharSequence) "device_logs", false, 2, (Object) null);
            if (contains$default) {
                return;
            }
            contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) msg, (CharSequence) "test_user_data", false, 2, (Object) null);
            if (contains$default2 || m62840a()) {
                return;
            }
            synchronized (this.f59399c) {
                if (m62833d().size() >= 32) {
                    m62835b();
                }
                isBlank = StringsKt__StringsJVMKt.isBlank(tag);
                if (!isBlank) {
                    isBlank2 = StringsKt__StringsJVMKt.isBlank(msg);
                    if (!isBlank2) {
                        if (this.f59398b == 0) {
                            this.f59398b = C46287oT0.m21027i();
                        }
                        m62833d().add(f59396f.m62831a(tag, msg, th));
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: a */
    public final void m62838a(C13235y4 serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        m62836a(serverConfig.m62701l());
    }

    /* renamed from: a */
    private final boolean m62840a() {
        StackTraceElement[] stack = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stack, "stack");
        if (stack.length == 0) {
            return true;
        }
        StackTraceElement stackTraceElement = stack[1];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        int length = stack.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            StackTraceElement stackTraceElement2 = stack[i];
            i++;
            if (Intrinsics.areEqual(stackTraceElement2.getClassName(), className) && Intrinsics.areEqual(stackTraceElement2.getMethodName(), methodName)) {
                i2++;
            }
        }
        return i2 != 1;
    }
}
