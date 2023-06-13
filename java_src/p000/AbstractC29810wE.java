package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__IndentKt;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JC\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0016\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J;\u0010\u0017\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J1\u0010\u001a\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0015J;\u0010\u001b\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0018J1\u0010\u001c\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0015J;\u0010\u001d\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J1\u0010\u001f\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001f\u0010\u0015J;\u0010 \u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J9\u0010\"\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J,\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0004J4\u0010'\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&J\u001a\u0010(\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, m28432d2 = {"LwE;", "Lg46$b;", "", "t", "", "l", "", "priority", "message", "", "", "args", "", "v", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "LnO5;", "stackData", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "B", "()Ljava/lang/Integer;", "w", "(Ljava/lang/String;[Ljava/lang/Object;)V", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "b", "o", "p", "x", "z", "y", "e", "j", "f", "u", "(ILjava/lang/String;[Ljava/lang/Object;)V", "tag", "", "s", "D", "A", "Ljava/lang/ThreadLocal;", "c", "Ljava/lang/ThreadLocal;", "callStackCorrection", "<init>", "()V", "lumberjack-library_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: wE */
/* loaded from: classes8.dex */
public abstract class AbstractC29810wE extends C41318g46.AbstractC20723b {

    /* renamed from: d */
    public static final C29811a f115610d = new C29811a(null);

    /* renamed from: c */
    public final ThreadLocal<Integer> f115611c = new ThreadLocal<>();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LwE$a;", "", "", "CALL_STACK_INDEX", "I", "<init>", "()V", "lumberjack-library_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: wE$a */
    /* loaded from: classes8.dex */
    public static final class C29811a {
        public /* synthetic */ C29811a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29811a() {
        }
    }

    /* renamed from: l */
    private final String m7222l(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "sw.toString()");
        return stringWriter2;
    }

    /* renamed from: v */
    private final void m7216v(int i, Throwable th, String str, Object... objArr) {
        int intValue;
        String trimIndent;
        boolean z;
        Integer m7231B = m7231B();
        boolean z2 = false;
        if (m7231B == null) {
            intValue = 0;
        } else {
            intValue = m7231B.intValue();
        }
        C45654nO5 c45654nO5 = new C45654nO5(th, intValue + 4);
        String m7230C = m7230C(c45654nO5);
        if (!mo7219s(m7230C, i)) {
            return;
        }
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = null;
            }
        }
        if (str == null) {
            if (th == null) {
                return;
            }
            str = m7222l(th);
        } else {
            if (objArr.length == 0) {
                z2 = true;
            }
            if (true ^ z2) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            }
            if (th != null) {
                trimIndent = StringsKt__IndentKt.trimIndent(String.valueOf(m7222l(th)));
                str = Intrinsics.stringPlus(str, trimIndent);
            }
        }
        mo7229D(i, m7230C, str, th, c45654nO5);
    }

    /* renamed from: A */
    public String m7232A(String str, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return ((Object) str) + ": " + message;
    }

    /* renamed from: B */
    public final Integer m7231B() {
        Integer num = this.f115611c.get();
        if (num != null) {
            this.f115611c.remove();
        }
        return num;
    }

    /* renamed from: C */
    public final String m7230C(C45654nO5 c45654nO5) {
        String m40146n = super.m40146n();
        if (m40146n != null) {
            return "[<" + ((Object) m40146n) + "> " + c45654nO5.m23849i() + ']';
        }
        return '[' + c45654nO5.m23849i() + ']';
    }

    /* renamed from: D */
    public abstract void mo7229D(int i, String str, String str2, Throwable th, C45654nO5 c45654nO5);

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: a */
    public void mo7228a(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        m7216v(3, null, str, Arrays.copyOf(args, args.length));
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: b */
    public void mo7227b(Throwable th) {
        m7216v(3, th, null, new Object[0]);
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: d */
    public void mo7226d(Throwable th, String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        m7216v(3, th, str, Arrays.copyOf(args, args.length));
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: e */
    public void mo7225e(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        m7216v(6, null, str, Arrays.copyOf(args, args.length));
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: f */
    public void mo7224f(Throwable th) {
        m7216v(6, th, null, new Object[0]);
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: j */
    public void mo7223j(Throwable th, String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        m7216v(6, th, str, Arrays.copyOf(args, args.length));
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: o */
    public void mo7221o(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        m7216v(4, null, str, Arrays.copyOf(args, args.length));
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: p */
    public void mo7220p(Throwable th, String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        m7216v(4, th, str, Arrays.copyOf(args, args.length));
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: s */
    public boolean mo7219s(String str, int i) {
        Boolean invoke;
        if (str != null) {
            Function1<String, Boolean> m106623b = C32884Fl2.f10066a.m106623b();
            return (m106623b != null && (invoke = m106623b.invoke(str)) != null) ? invoke.booleanValue() : true;
        }
        return true;
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: t */
    public final void mo7218t(int i, String str, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: u */
    public void mo7217u(int i, String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        m7216v(i, null, str, Arrays.copyOf(args, args.length));
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: w */
    public void mo7215w(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        m7216v(2, null, str, Arrays.copyOf(args, args.length));
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: x */
    public void mo7214x(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        m7216v(5, null, str, Arrays.copyOf(args, args.length));
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: y */
    public void mo7213y(Throwable th) {
        m7216v(5, th, null, new Object[0]);
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: z */
    public void mo7212z(Throwable th, String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        m7216v(5, th, str, Arrays.copyOf(args, args.length));
    }
}
