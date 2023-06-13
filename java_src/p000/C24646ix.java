package p000;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u000f"}, m28432d2 = {"Lix;", "", "", "name", "", "counts", "", "g", "", "f", DateTokenConverter.CONVERTER_KEY, "e", "<init>", "()V", C17296a.f69688o, "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: ix */
/* loaded from: classes6.dex */
public final class C24646ix {

    /* renamed from: a */
    public static final C24647a f91751a = new C24647a(null);

    /* renamed from: b */
    public static volatile C24646ix f91752b;

    /* renamed from: c */
    public static SharedPreferences f91753c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lix$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lix;", C17296a.f69688o, "", "name", "b", "SHOWED_UP", "Ljava/lang/String;", "instance", "Lix;", "Landroid/content/SharedPreferences;", "sharedPreferenceManager", "Landroid/content/SharedPreferences;", "<init>", "()V", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ix$a */
    /* loaded from: classes6.dex */
    public static final class C24647a {
        public /* synthetic */ C24647a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C24646ix m31568a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C24646ix c24646ix = C24646ix.f91752b;
            if (c24646ix == null) {
                synchronized (this) {
                    c24646ix = C24646ix.f91752b;
                    if (c24646ix == null) {
                        c24646ix = new C24646ix(null);
                        C24646ix.f91752b = c24646ix;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.skydoves.balloon", 0);
                        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…n\", Context.MODE_PRIVATE)");
                        C24646ix.f91753c = sharedPreferences;
                    }
                }
            }
            return c24646ix;
        }

        @JvmStatic
        /* renamed from: b */
        public final String m31567b(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return "SHOWED_UP" + name;
        }

        private C24647a() {
        }
    }

    public /* synthetic */ C24646ix(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: d */
    public final int m31572d(String str) {
        SharedPreferences sharedPreferences = f91753c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferenceManager");
            sharedPreferences = null;
        }
        return sharedPreferences.getInt(f91751a.m31567b(str), 0);
    }

    /* renamed from: e */
    public final void m31571e(String str, int i) {
        SharedPreferences sharedPreferences = f91753c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferenceManager");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkExpressionValueIsNotNull(editor, "editor");
        editor.putInt(f91751a.m31567b(str), i);
        editor.apply();
    }

    /* renamed from: f */
    public final void m31570f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        m31571e(name, m31572d(name) + 1);
    }

    /* renamed from: g */
    public final boolean m31569g(String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (m31572d(name) < i) {
            return true;
        }
        return false;
    }

    private C24646ix() {
    }
}
