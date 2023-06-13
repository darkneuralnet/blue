package p000;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Locale;
/* renamed from: Px6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35336Px6 {

    /* renamed from: a */
    public static final Api<C6596a> f29467a;

    /* renamed from: b */
    public static final Api.ClientKey f29468b;

    /* renamed from: c */
    public static final Api.AbstractClientBuilder f29469c;

    /* renamed from: d */
    public static final InterfaceC35570Qx6 f29470d;
    @Deprecated

    /* renamed from: e */
    public static final C50618vl9 f29471e;
    @ShowFirstParty

    /* renamed from: f */
    public static final C50156uy9 f29472f;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f29468b = clientKey;
        C36462Us7 c36462Us7 = new C36462Us7();
        f29469c = c36462Us7;
        f29467a = new Api<>("Wallet.API", c36462Us7, clientKey);
        f29471e = new C50618vl9();
        f29470d = new C32142Cg7();
        f29472f = new C50156uy9();
    }

    private C35336Px6() {
    }

    /* renamed from: a */
    public static EP3 m89237a(Activity activity, C6596a c6596a) {
        return new EP3(activity, c6596a);
    }

    /* renamed from: b */
    public static EP3 m89236b(Context context, C6596a c6596a) {
        return new EP3(context, c6596a);
    }

    /* renamed from: Px6$a */
    /* loaded from: classes6.dex */
    public static final class C6596a implements Api.ApiOptions.HasAccountOptions {

        /* renamed from: b */
        public final int f29473b;

        /* renamed from: c */
        public final int f29474c;
        @ShowFirstParty

        /* renamed from: d */
        public final Account f29475d;

        /* renamed from: e */
        public final boolean f29476e;

        /* renamed from: Px6$a$a */
        /* loaded from: classes6.dex */
        public static final class C6597a {

            /* renamed from: a */
            public int f29477a = 3;

            /* renamed from: b */
            public int f29478b = 1;

            /* renamed from: c */
            public boolean f29479c = true;

            /* renamed from: a */
            public C6596a m89235a() {
                return new C6596a(this);
            }

            /* renamed from: b */
            public C6597a m89234b(int i) {
                if (i != 0) {
                    if (i != 0) {
                        if (i != 2 && i != 1 && i != 23 && i != 3) {
                            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i)));
                        }
                    } else {
                        i = 0;
                    }
                }
                this.f29477a = i;
                return this;
            }
        }

        public C6596a(C6597a c6597a) {
            this.f29473b = c6597a.f29477a;
            this.f29474c = c6597a.f29478b;
            this.f29476e = c6597a.f29479c;
            this.f29475d = null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6596a) {
                C6596a c6596a = (C6596a) obj;
                if (Objects.equal(Integer.valueOf(this.f29473b), Integer.valueOf(c6596a.f29473b)) && Objects.equal(Integer.valueOf(this.f29474c), Integer.valueOf(c6596a.f29474c)) && Objects.equal(null, null) && Objects.equal(Boolean.valueOf(this.f29476e), Boolean.valueOf(c6596a.f29476e))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions
        public Account getAccount() {
            return null;
        }

        public int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.f29473b), Integer.valueOf(this.f29474c), null, Boolean.valueOf(this.f29476e));
        }

        private C6596a() {
            this(new C6597a());
        }
    }
}
