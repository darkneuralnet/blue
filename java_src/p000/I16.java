package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.MovementMethod;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0003\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u0013\u0010\u0010¨\u0006("}, m28432d2 = {"LI16;", "", "", C17296a.f69688o, "Ljava/lang/CharSequence;", "b", "()Ljava/lang/CharSequence;", Entry.TYPE_TEXT, "", "F", "f", "()F", "textSize", "", "c", "I", "()I", "textColor", "", DateTokenConverter.CONVERTER_KEY, "Z", "e", "()Z", "textIsHtml", "Landroid/text/method/MovementMethod;", "Landroid/text/method/MovementMethod;", "()Landroid/text/method/MovementMethod;", "movementMethod", "g", "textStyle", "Landroid/graphics/Typeface;", "Landroid/graphics/Typeface;", "h", "()Landroid/graphics/Typeface;", "textTypeface", "textGravity", "LI16$a;", "builder", "<init>", "(LI16$a;)V", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: I16 */
/* loaded from: classes6.dex */
public final class I16 {

    /* renamed from: a */
    public final CharSequence f14346a;

    /* renamed from: b */
    public final float f14347b;

    /* renamed from: c */
    public final int f14348c;

    /* renamed from: d */
    public final boolean f14349d;

    /* renamed from: e */
    public final MovementMethod f14350e;

    /* renamed from: f */
    public final int f14351f;

    /* renamed from: g */
    public final Typeface f14352g;

    /* renamed from: h */
    public final int f14353h;

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\bB\u0010CJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0005J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010#\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00058\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010)\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&\"\u0004\b'\u0010(R*\u00100\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R.\u00106\u001a\u0004\u0018\u0001012\b\u0010\u0016\u001a\u0004\u0018\u0001018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u00102\u001a\u0004\b\u0017\u00103\"\u0004\b4\u00105R*\u00109\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010%\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R.\u0010?\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010A\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010%\u001a\u0004\b*\u0010&\"\u0004\b@\u0010(¨\u0006D"}, m28432d2 = {"LI16$a;", "", "", "value", "j", "", "n", "", "k", "", "m", "o", "Landroid/graphics/Typeface;", "p", "l", "LI16;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<set-?>", "b", "Ljava/lang/CharSequence;", "c", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", Entry.TYPE_TEXT, "F", "g", "()F", "setTextSize", "(F)V", "textSize", DateTokenConverter.CONVERTER_KEY, "I", "()I", "setTextColor", "(I)V", "textColor", "e", "Z", "f", "()Z", "setTextIsHtml", "(Z)V", "textIsHtml", "Landroid/text/method/MovementMethod;", "Landroid/text/method/MovementMethod;", "()Landroid/text/method/MovementMethod;", "setMovementMethod", "(Landroid/text/method/MovementMethod;)V", "movementMethod", "h", "setTextTypeface", "textTypeface", "Landroid/graphics/Typeface;", "i", "()Landroid/graphics/Typeface;", "setTextTypefaceObject", "(Landroid/graphics/Typeface;)V", "textTypefaceObject", "setTextGravity", "textGravity", "<init>", "(Landroid/content/Context;)V", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: I16$a */
    /* loaded from: classes6.dex */
    public static final class C3313a {

        /* renamed from: a */
        public final Context f14354a;

        /* renamed from: b */
        public CharSequence f14355b;

        /* renamed from: c */
        public float f14356c;

        /* renamed from: d */
        public int f14357d;

        /* renamed from: e */
        public boolean f14358e;

        /* renamed from: f */
        public MovementMethod f14359f;

        /* renamed from: g */
        public int f14360g;

        /* renamed from: h */
        public Typeface f14361h;

        /* renamed from: i */
        public int f14362i;

        public C3313a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f14354a = context;
            this.f14355b = "";
            this.f14356c = 12.0f;
            this.f14357d = -1;
            this.f14362i = 17;
        }

        /* renamed from: a */
        public final I16 m103067a() {
            return new I16(this, null);
        }

        /* renamed from: b */
        public final MovementMethod m103066b() {
            return this.f14359f;
        }

        /* renamed from: c */
        public final CharSequence m103065c() {
            return this.f14355b;
        }

        /* renamed from: d */
        public final int m103064d() {
            return this.f14357d;
        }

        /* renamed from: e */
        public final int m103063e() {
            return this.f14362i;
        }

        /* renamed from: f */
        public final boolean m103062f() {
            return this.f14358e;
        }

        /* renamed from: g */
        public final float m103061g() {
            return this.f14356c;
        }

        /* renamed from: h */
        public final int m103060h() {
            return this.f14360g;
        }

        /* renamed from: i */
        public final Typeface m103059i() {
            return this.f14361h;
        }

        /* renamed from: j */
        public final C3313a m103058j(CharSequence value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f14355b = value;
            return this;
        }

        /* renamed from: k */
        public final C3313a m103057k(int i) {
            this.f14357d = i;
            return this;
        }

        /* renamed from: l */
        public final C3313a m103056l(int i) {
            this.f14362i = i;
            return this;
        }

        /* renamed from: m */
        public final C3313a m103055m(boolean z) {
            this.f14358e = z;
            return this;
        }

        /* renamed from: n */
        public final C3313a m103054n(float f) {
            this.f14356c = f;
            return this;
        }

        /* renamed from: o */
        public final C3313a m103053o(int i) {
            this.f14360g = i;
            return this;
        }

        /* renamed from: p */
        public final C3313a m103052p(Typeface typeface) {
            this.f14361h = typeface;
            return this;
        }
    }

    public /* synthetic */ I16(C3313a c3313a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3313a);
    }

    /* renamed from: a */
    public final MovementMethod m103075a() {
        return this.f14350e;
    }

    /* renamed from: b */
    public final CharSequence m103074b() {
        return this.f14346a;
    }

    /* renamed from: c */
    public final int m103073c() {
        return this.f14348c;
    }

    /* renamed from: d */
    public final int m103072d() {
        return this.f14353h;
    }

    /* renamed from: e */
    public final boolean m103071e() {
        return this.f14349d;
    }

    /* renamed from: f */
    public final float m103070f() {
        return this.f14347b;
    }

    /* renamed from: g */
    public final int m103069g() {
        return this.f14351f;
    }

    /* renamed from: h */
    public final Typeface m103068h() {
        return this.f14352g;
    }

    public I16(C3313a c3313a) {
        this.f14346a = c3313a.m103065c();
        this.f14347b = c3313a.m103061g();
        this.f14348c = c3313a.m103064d();
        this.f14349d = c3313a.m103062f();
        this.f14350e = c3313a.m103066b();
        this.f14351f = c3313a.m103060h();
        this.f14352g = c3313a.m103059i();
        this.f14353h = c3313a.m103063e();
    }
}
