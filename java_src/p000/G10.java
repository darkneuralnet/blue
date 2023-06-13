package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.exceptions.ConfigurationException;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
import com.braintreepayments.api.internal.AnalyticsIntentService;
import com.braintreepayments.api.models.Authorization;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.braintreepayments.api.models.TokenizationKey;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.UUID;
import org.json.JSONException;
/* renamed from: G10 */
/* loaded from: classes2.dex */
public class G10 extends T20 {

    /* renamed from: A */
    public InterfaceC35156Pd6 f10749A;

    /* renamed from: B */
    public InterfaceC9333X9 f10750B;

    /* renamed from: C */
    public Context f10751C;

    /* renamed from: d */
    public K10 f10752d;

    /* renamed from: e */
    public J10 f10753e;

    /* renamed from: f */
    public GoogleApiClient f10754f;

    /* renamed from: g */
    public SD0 f10755g;

    /* renamed from: h */
    public Authorization f10756h;

    /* renamed from: i */
    public C40650ex0 f10757i;

    /* renamed from: m */
    public boolean f10761m;

    /* renamed from: o */
    public String f10763o;

    /* renamed from: p */
    public String f10764p;

    /* renamed from: q */
    public String f10765q;

    /* renamed from: r */
    public C20467fa f10766r;

    /* renamed from: s */
    public InterfaceC32288Cx0 f10767s;

    /* renamed from: t */
    public N10<Exception> f10768t;

    /* renamed from: u */
    public E10 f10769u;

    /* renamed from: v */
    public PN3 f10770v;

    /* renamed from: w */
    public MN3 f10771w;

    /* renamed from: x */
    public NN3 f10772x;

    /* renamed from: y */
    public F10 f10773y;

    /* renamed from: z */
    public M10 f10774z;

    /* renamed from: j */
    public final Queue<InterfaceC41640gd4> f10758j = new ArrayDeque();

    /* renamed from: k */
    public final List<PaymentMethodNonce> f10759k = new ArrayList();

    /* renamed from: l */
    public boolean f10760l = false;

    /* renamed from: n */
    public int f10762n = 0;

    /* renamed from: G10$a */
    /* loaded from: classes2.dex */
    public class C2604a implements InterfaceC41640gd4 {

        /* renamed from: a */
        public final /* synthetic */ Exception f10775a;

        public C2604a(Exception exc) {
            this.f10775a = exc;
        }

        @Override // p000.InterfaceC41640gd4
        /* renamed from: a */
        public boolean mo37970a() {
            return G10.this.f10773y != null;
        }

        @Override // p000.InterfaceC41640gd4
        public void run() {
            G10.this.f10773y.onError(this.f10775a);
        }
    }

    /* renamed from: G10$b */
    /* loaded from: classes2.dex */
    public class C2605b implements InterfaceC32288Cx0 {
        public C2605b() {
        }

        @Override // p000.InterfaceC32288Cx0
        /* renamed from: k */
        public void mo10872k(C40650ex0 c40650ex0) {
            G10.this.m105972Ga(c40650ex0);
            G10.this.m105979Ba();
            G10.this.m105967S9();
        }
    }

    /* renamed from: G10$c */
    /* loaded from: classes2.dex */
    public class C2606c implements N10<Exception> {

        /* renamed from: G10$c$a */
        /* loaded from: classes2.dex */
        public class C2607a implements InterfaceC41640gd4 {

            /* renamed from: a */
            public final /* synthetic */ ConfigurationException f10779a;

            public C2607a(ConfigurationException configurationException) {
                this.f10779a = configurationException;
            }

            @Override // p000.InterfaceC41640gd4
            /* renamed from: a */
            public boolean mo37970a() {
                return G10.this.f10768t != null;
            }

            @Override // p000.InterfaceC41640gd4
            public void run() {
                G10.this.f10768t.onResponse(this.f10779a);
            }
        }

        public C2606c() {
        }

        @Override // p000.N10
        /* renamed from: a */
        public void onResponse(Exception exc) {
            ConfigurationException configurationException = new ConfigurationException("Request for configuration has failed: " + exc.getMessage() + ". Future requests will retry up to 3 times", exc);
            G10.this.m105954ya(configurationException);
            G10.this.m105978Ca(new C2607a(configurationException));
            G10.this.m105967S9();
        }
    }

    /* renamed from: G10$d */
    /* loaded from: classes2.dex */
    public class C2608d implements InterfaceC41640gd4 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC32288Cx0 f10781a;

        public C2608d(InterfaceC32288Cx0 interfaceC32288Cx0) {
            this.f10781a = interfaceC32288Cx0;
        }

        @Override // p000.InterfaceC41640gd4
        /* renamed from: a */
        public boolean mo37970a() {
            return G10.this.m105964ea() != null && G10.this.isAdded();
        }

        @Override // p000.InterfaceC41640gd4
        public void run() {
            this.f10781a.mo10872k(G10.this.m105964ea());
        }
    }

    /* renamed from: G10$e */
    /* loaded from: classes2.dex */
    public class C2609e implements InterfaceC32288Cx0 {

        /* renamed from: b */
        public final /* synthetic */ C24929ja f10783b;

        public C2609e(C24929ja c24929ja) {
            this.f10783b = c24929ja;
        }

        @Override // p000.InterfaceC32288Cx0
        /* renamed from: k */
        public void mo10872k(C40650ex0 c40650ex0) {
            if (c40650ex0.m42370b().m71211c()) {
                G10.this.f10766r.m41173a(this.f10783b);
            }
        }
    }

    /* renamed from: G10$f */
    /* loaded from: classes2.dex */
    public class C2610f implements InterfaceC41640gd4 {
        public C2610f() {
        }

        @Override // p000.InterfaceC41640gd4
        /* renamed from: a */
        public boolean mo37970a() {
            return G10.this.f10767s != null;
        }

        @Override // p000.InterfaceC41640gd4
        public void run() {
            G10.this.f10767s.mo10872k(G10.this.m105964ea());
        }
    }

    /* renamed from: G10$g */
    /* loaded from: classes2.dex */
    public class C2611g implements InterfaceC41640gd4 {

        /* renamed from: a */
        public final /* synthetic */ int f10786a;

        public C2611g(int i) {
            this.f10786a = i;
        }

        @Override // p000.InterfaceC41640gd4
        /* renamed from: a */
        public boolean mo37970a() {
            return G10.this.f10769u != null;
        }

        @Override // p000.InterfaceC41640gd4
        public void run() {
            G10.this.f10769u.mo59671l(this.f10786a);
        }
    }

    /* renamed from: G10$h */
    /* loaded from: classes2.dex */
    public class C2612h implements InterfaceC41640gd4 {

        /* renamed from: a */
        public final /* synthetic */ PaymentMethodNonce f10788a;

        public C2612h(PaymentMethodNonce paymentMethodNonce) {
            this.f10788a = paymentMethodNonce;
        }

        @Override // p000.InterfaceC41640gd4
        /* renamed from: a */
        public boolean mo37970a() {
            return G10.this.f10771w != null;
        }

        @Override // p000.InterfaceC41640gd4
        public void run() {
            G10.this.f10771w.mo57725i(this.f10788a);
        }
    }

    /* renamed from: oa */
    public static G10 m105958oa(Context context, FragmentManager fragmentManager, String str) throws InvalidArgumentException {
        if (context != null) {
            if (fragmentManager != null) {
                if (str != null) {
                    String str2 = "BraintreeFragment." + UUID.nameUUIDFromBytes(str.getBytes());
                    if (fragmentManager.m67322m0(str2) != null) {
                        return (G10) fragmentManager.m67322m0(str2);
                    }
                    G10 g10 = new G10();
                    Bundle bundle = new Bundle();
                    try {
                        bundle.putParcelable("com.braintreepayments.api.EXTRA_AUTHORIZATION_TOKEN", Authorization.m53398a(str));
                        bundle.putString("com.braintreepayments.api.EXTRA_SESSION_ID", C47572qd6.m17310a());
                        bundle.putString("com.braintreepayments.api.EXTRA_INTEGRATION_TYPE", R52.m87327a(context));
                        g10.setArguments(bundle);
                        try {
                            try {
                                fragmentManager.m67311q().m67119e(g10, str2).mo67113k();
                            } catch (IllegalStateException e) {
                                throw new InvalidArgumentException(e.getMessage());
                            }
                        } catch (IllegalStateException | NullPointerException unused) {
                            fragmentManager.m67311q().m67119e(g10, str2).mo67115i();
                            try {
                                fragmentManager.m67337h0();
                            } catch (IllegalStateException unused2) {
                            }
                        }
                        g10.f10751C = context.getApplicationContext();
                        return g10;
                    } catch (InvalidArgumentException unused3) {
                        throw new InvalidArgumentException("Tokenization Key or client token was invalid.");
                    }
                }
                throw new InvalidArgumentException("Tokenization Key or Client Token is null.");
            }
            throw new InvalidArgumentException("FragmentManager is null");
        }
        throw new InvalidArgumentException("Context is null");
    }

    /* renamed from: sa */
    public static G10 m105957sa(AppCompatActivity appCompatActivity, String str) throws InvalidArgumentException {
        if (appCompatActivity != null) {
            return m105958oa(appCompatActivity, appCompatActivity.getSupportFragmentManager(), str);
        }
        throw new InvalidArgumentException("Activity is null");
    }

    /* renamed from: Aa */
    public void m105981Aa(int i) {
        m105978Ca(new C2611g(i));
    }

    /* renamed from: Ba */
    public void m105979Ba() {
        m105978Ca(new C2610f());
    }

    /* renamed from: Ca */
    public void m105978Ca(InterfaceC41640gd4 interfaceC41640gd4) {
        if (!interfaceC41640gd4.mo37970a()) {
            synchronized (this.f10758j) {
                this.f10758j.add(interfaceC41640gd4);
            }
            return;
        }
        interfaceC41640gd4.run();
    }

    /* renamed from: Da */
    public <T extends L10> void m105976Da(T t) {
        if (t instanceof InterfaceC32288Cx0) {
            this.f10767s = null;
        }
        if (t instanceof E10) {
            this.f10769u = null;
        }
        if (t instanceof PN3) {
            this.f10770v = null;
        }
        if (t instanceof MN3) {
            this.f10771w = null;
        }
        if (t instanceof NN3) {
            this.f10772x = null;
        }
        if (t instanceof M10) {
            this.f10774z = null;
        }
        if (t instanceof F10) {
            this.f10773y = null;
        }
        if (t instanceof InterfaceC35156Pd6) {
            this.f10749A = null;
        }
        if (t instanceof InterfaceC9333X9) {
            this.f10750B = null;
        }
    }

    /* renamed from: Ea */
    public void m105974Ea(String str) {
        m105969Ja(new C2609e(new C24929ja(this.f10751C, m105960la(), this.f10763o, str)));
    }

    /* renamed from: Ga */
    public void m105972Ga(C40650ex0 c40650ex0) {
        this.f10757i = c40650ex0;
        m105962ha().m3544i(c40650ex0.m42369c());
        if (c40650ex0.m42368d().m84199c()) {
            this.f10753e = new J10(c40650ex0.m42368d().m84200b(), this.f10756h.mo53279b());
        }
    }

    /* renamed from: I9 */
    public <T extends L10> void m105971I9(T t) {
        if (t instanceof InterfaceC32288Cx0) {
            this.f10767s = (InterfaceC32288Cx0) t;
        }
        if (t instanceof E10) {
            this.f10769u = (E10) t;
        }
        if (t instanceof PN3) {
            this.f10770v = (PN3) t;
        }
        if (t instanceof MN3) {
            this.f10771w = (MN3) t;
        }
        if (t instanceof NN3) {
            this.f10772x = (NN3) t;
        }
        if (t instanceof M10) {
            this.f10774z = (M10) t;
        }
        if (t instanceof F10) {
            this.f10773y = (F10) t;
        }
        if (t instanceof InterfaceC35156Pd6) {
            this.f10749A = (InterfaceC35156Pd6) t;
        }
        if (t instanceof InterfaceC9333X9) {
            this.f10750B = (InterfaceC9333X9) t;
        }
        m105967S9();
    }

    /* renamed from: J9 */
    public void m105970J9() {
        if (m105964ea() == null && !C32522Dx0.m109589e() && this.f10756h != null && this.f10752d != null) {
            int i = this.f10762n;
            if (i >= 3) {
                m105954ya(new ConfigurationException("Configuration retry limit has been exceeded. Create a new BraintreeFragment and try again."));
                return;
            }
            this.f10762n = i + 1;
            C32522Dx0.m109590d(this, new C2605b(), new C2606c());
        }
    }

    /* renamed from: Ja */
    public void m105969Ja(InterfaceC32288Cx0 interfaceC32288Cx0) {
        m105970J9();
        m105978Ca(new C2608d(interfaceC32288Cx0));
    }

    @Override // p000.T20
    /* renamed from: N6 */
    public String mo84411N6() {
        return this.f10765q;
    }

    /* renamed from: P9 */
    public final void m105968P9() {
        if (m105964ea() != null && m105964ea().m42364h() != null && m105964ea().m42370b().m71211c()) {
            try {
                m105966T9().startService(new Intent(this.f10751C, AnalyticsIntentService.class).putExtra("com.braintreepayments.api.internal.AnalyticsIntentService.EXTRA_AUTHORIZATION", m105965da().toString()).putExtra("com.braintreepayments.api.internal.AnalyticsIntentService.EXTRA_CONFIGURATION", m105964ea().m42364h()));
            } catch (RuntimeException unused) {
                C8678Va.m79739d(m105966T9(), this.f10756h, m105962ha(), m105964ea().m42370b().m71212b(), false);
            }
        }
    }

    /* renamed from: S9 */
    public void m105967S9() {
        synchronized (this.f10758j) {
            for (InterfaceC41640gd4 interfaceC41640gd4 : new ArrayDeque(this.f10758j)) {
                if (interfaceC41640gd4.mo37970a()) {
                    interfaceC41640gd4.run();
                    this.f10758j.remove(interfaceC41640gd4);
                }
            }
        }
    }

    /* renamed from: T9 */
    public Context m105966T9() {
        return this.f10751C;
    }

    @Override // p000.V20
    /* renamed from: d4 */
    public void mo80476d4(int i, Z20 z20, Uri uri) {
        String str;
        int i2 = 1;
        Intent putExtra = new Intent().putExtra("com.braintreepayments.api.WAS_BROWSER_SWITCH_RESULT", true);
        if (i != 13487) {
            if (i != 13591) {
                if (i != 13596) {
                    str = "";
                } else {
                    str = "local-payment";
                }
            } else {
                str = "paypal";
            }
        } else {
            str = "three-d-secure";
        }
        if (z20.m73815b() == 1) {
            m105974Ea(str + ".browser-switch.succeeded");
            i2 = -1;
        } else if (z20.m73815b() == 2) {
            m105974Ea(str + ".browser-switch.canceled");
            i2 = 0;
        } else if (z20.m73815b() == 3) {
            String m73816a = z20.m73816a();
            if (m73816a != null && m73816a.startsWith("No installed activities")) {
                m105974Ea(str + ".browser-switch.failed.no-browser-installed");
            } else {
                m105974Ea(str + ".browser-switch.failed.not-setup");
            }
        }
        onActivityResult(i, i2, putExtra.setData(uri));
    }

    /* renamed from: da */
    public Authorization m105965da() {
        return this.f10756h;
    }

    /* renamed from: ea */
    public C40650ex0 m105964ea() {
        return this.f10757i;
    }

    /* renamed from: fa */
    public J10 m105963fa() {
        return this.f10753e;
    }

    /* renamed from: ha */
    public K10 m105962ha() {
        return this.f10752d;
    }

    /* renamed from: ia */
    public String m105961ia() {
        return this.f10763o;
    }

    /* renamed from: la */
    public String m105960la() {
        return this.f10764p;
    }

    /* renamed from: ma */
    public boolean m105959ma() {
        return isAdded();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 13487) {
            if (i != 13488) {
                if (i != 13596) {
                    if (i != 13597) {
                        switch (i) {
                            case 13591:
                                C40881fL3.m41548m(this, i2, intent);
                                break;
                            case 13592:
                                C32033Bu6.m113374a(this, i2, intent);
                                break;
                            case 13593:
                                C52072yD1.m3841a(this, i2, intent);
                                break;
                        }
                    } else {
                        C48589sL3.m14316a(this, i2, intent);
                    }
                } else {
                    C43597jv2.m29767b(this, i2, intent);
                }
            } else {
                C51831xo6.m4607c(this, i2, intent);
            }
        } else {
            P36.m91030d(this, i2, intent);
        }
        if (i2 == 0) {
            m105981Aa(i);
        }
    }

    @Override // p000.T20, androidx.fragment.app.Fragment
    @TargetApi(23)
    public void onAttach(Context context) {
        super.onAttach(context);
        onAttach((Activity) getActivity());
    }

    @Override // p000.T20, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f10761m = false;
        this.f10755g = SD0.m85840a(this);
        this.f10764p = getArguments().getString("com.braintreepayments.api.EXTRA_SESSION_ID");
        this.f10763o = getArguments().getString("com.braintreepayments.api.EXTRA_INTEGRATION_TYPE");
        this.f10756h = (Authorization) getArguments().getParcelable("com.braintreepayments.api.EXTRA_AUTHORIZATION_TOKEN");
        this.f10766r = C20467fa.m41172b(m105966T9());
        if (this.f10752d == null) {
            this.f10752d = new K10(this.f10756h);
        }
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("com.braintreepayments.api.EXTRA_CACHED_PAYMENT_METHOD_NONCES");
            if (parcelableArrayList != null) {
                this.f10759k.addAll(parcelableArrayList);
            }
            this.f10760l = bundle.getBoolean("com.braintreepayments.api.EXTRA_FETCHED_PAYMENT_METHOD_NONCES");
            try {
                m105972Ga(C40650ex0.m42371a(bundle.getString("com.braintreepayments.api.EXTRA_CONFIGURATION")));
            } catch (JSONException unused) {
            }
        } else if (this.f10756h instanceof TokenizationKey) {
            m105974Ea("started.client-key");
        } else {
            m105974Ea("started.client-token");
        }
        m105970J9();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f10755g.m85839b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        GoogleApiClient googleApiClient = this.f10754f;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
            this.f10754f = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getActivity() instanceof L10) {
            m105976Da((L10) getActivity());
        }
    }

    @Override // p000.T20, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getActivity() instanceof L10) {
            m105971I9((L10) getActivity());
            if (this.f10761m && m105964ea() != null) {
                this.f10761m = false;
                m105979Ba();
            }
        }
        m105967S9();
        GoogleApiClient googleApiClient = this.f10754f;
        if (googleApiClient != null && !googleApiClient.isConnected() && !this.f10754f.isConnecting()) {
            this.f10754f.connect();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("com.braintreepayments.api.EXTRA_CACHED_PAYMENT_METHOD_NONCES", (ArrayList) this.f10759k);
        bundle.putBoolean("com.braintreepayments.api.EXTRA_FETCHED_PAYMENT_METHOD_NONCES", this.f10760l);
        C40650ex0 c40650ex0 = this.f10757i;
        if (c40650ex0 != null) {
            bundle.putString("com.braintreepayments.api.EXTRA_CONFIGURATION", c40650ex0.m42364h());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        GoogleApiClient googleApiClient = this.f10754f;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
        }
        m105968P9();
    }

    @Override // androidx.fragment.app.Fragment
    public void startActivityForResult(Intent intent, int i) {
        if (!isAdded()) {
            m105954ya(new BraintreeException("BraintreeFragment is not attached to an Activity. Please ensure it is attached and try again."));
        } else {
            super.startActivityForResult(intent, i);
        }
    }

    /* renamed from: va */
    public void m105955va(PaymentMethodNonce paymentMethodNonce) {
        this.f10759k.add(0, paymentMethodNonce);
        m105978Ca(new C2612h(paymentMethodNonce));
    }

    /* renamed from: ya */
    public void m105954ya(Exception exc) {
        m105978Ca(new C2604a(exc));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f10761m = true;
        if (this.f10751C == null) {
            this.f10751C = activity.getApplicationContext();
        }
        this.f10765q = this.f10751C.getPackageName().toLowerCase(Locale.ROOT).replace("_", "") + ".braintree";
    }
}
