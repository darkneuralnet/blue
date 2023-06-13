package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: bR5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38548bR5 {

    /* renamed from: b */
    public static final C33460Hx2 f57498b = new C33460Hx2(C38548bR5.class.getSimpleName());

    /* renamed from: a */
    public C37339Ym2<SharedPreferences> f57499a;

    /* renamed from: bR5$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12392a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57500a;

        static {
            int[] iArr = new int[EnumC12393b.values().length];
            f57500a = iArr;
            try {
                iArr[EnumC12393b.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57500a[EnumC12393b.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: bR5$b */
    /* loaded from: classes6.dex */
    public enum EnumC12393b {
        DEFAULT_APP_CHECK_TOKEN,
        UNKNOWN_APP_CHECK_TOKEN
    }

    public C38548bR5(final Context context, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        final String format = String.format("com.google.firebase.appcheck.store.%s", str);
        this.f57499a = new C37339Ym2<>(new X94() { // from class: aR5
            @Override // p000.X94
            public final Object get() {
                Object sharedPreferences;
                sharedPreferences = context.getSharedPreferences(format, 0);
                return sharedPreferences;
            }
        });
    }

    /* renamed from: b */
    public void m64530b() {
        this.f57499a.get().edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
    }

    /* renamed from: d */
    public AbstractC8723Vh m64528d() {
        String string = this.f57499a.get().getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
        String string2 = this.f57499a.get().getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
        if (string != null && string2 != null) {
            try {
                int i = C12392a.f57500a[EnumC12393b.valueOf(string).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        f57498b.m103198d("Reached unreachable section in #retrieveAppCheckToken()");
                        return null;
                    }
                    return C46907pW0.m19168d(string2);
                }
                return C46907pW0.m19167e(string2);
            } catch (IllegalArgumentException e) {
                C33460Hx2 c33460Hx2 = f57498b;
                c33460Hx2.m103198d("Failed to parse TokenType of stored token  with type [" + string + "] with exception: " + e.getMessage());
                m64530b();
            }
        }
        return null;
    }

    /* renamed from: e */
    public void m64527e(AbstractC8723Vh abstractC8723Vh) {
        if (abstractC8723Vh instanceof C46907pW0) {
            this.f57499a.get().edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", ((C46907pW0) abstractC8723Vh).m19163i()).putString("com.google.firebase.appcheck.TOKEN_TYPE", EnumC12393b.DEFAULT_APP_CHECK_TOKEN.name()).apply();
        } else {
            this.f57499a.get().edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", abstractC8723Vh.mo19170b()).putString("com.google.firebase.appcheck.TOKEN_TYPE", EnumC12393b.UNKNOWN_APP_CHECK_TOKEN.name()).apply();
        }
    }
}
