package p000;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.adyen.checkout.components.model.payments.response.SdkAction;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: Xz6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class DialogC37226Xz6 extends Dialog {

    /* renamed from: n */
    public static final int f44368n = C32886Fl4.com_facebook_activity_theme;

    /* renamed from: o */
    public static volatile int f44369o;

    /* renamed from: b */
    public String f44370b;

    /* renamed from: c */
    public String f44371c;

    /* renamed from: d */
    public InterfaceC9582g f44372d;

    /* renamed from: e */
    public WebView f44373e;

    /* renamed from: f */
    public ProgressDialog f44374f;

    /* renamed from: g */
    public ImageView f44375g;

    /* renamed from: h */
    public FrameLayout f44376h;

    /* renamed from: i */
    public AsyncTaskC9583h f44377i;

    /* renamed from: j */
    public boolean f44378j;

    /* renamed from: k */
    public boolean f44379k;

    /* renamed from: l */
    public boolean f44380l;

    /* renamed from: m */
    public WindowManager.LayoutParams f44381m;

    /* renamed from: Xz6$a */
    /* loaded from: classes5.dex */
    public class DialogInterface$OnCancelListenerC9576a implements DialogInterface.OnCancelListener {
        public DialogInterface$OnCancelListenerC9576a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            DialogC37226Xz6.this.cancel();
        }
    }

    /* renamed from: Xz6$b */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC9577b implements View.OnClickListener {
        public View$OnClickListenerC9577b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                DialogC37226Xz6.this.cancel();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: Xz6$c */
    /* loaded from: classes5.dex */
    public class C9578c extends WebView {
        public C9578c(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: Xz6$d */
    /* loaded from: classes5.dex */
    public class View$OnTouchListenerC9579d implements View.OnTouchListener {
        public View$OnTouchListenerC9579d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!view.hasFocus()) {
                view.requestFocus();
                return false;
            }
            return false;
        }
    }

    /* renamed from: Xz6$f */
    /* loaded from: classes5.dex */
    public class C9581f extends WebViewClient {
        public C9581f() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!DialogC37226Xz6.this.f44379k) {
                DialogC37226Xz6.this.f44374f.dismiss();
            }
            DialogC37226Xz6.this.f44376h.setBackgroundColor(0);
            DialogC37226Xz6.this.f44373e.setVisibility(0);
            DialogC37226Xz6.this.f44375g.setVisibility(0);
            DialogC37226Xz6.this.f44380l = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C52364yi6.m2853Y("FacebookSDK.WebDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (!DialogC37226Xz6.this.f44379k) {
                DialogC37226Xz6.this.f44374f.show();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            DialogC37226Xz6.this.m75905t(new FacebookDialogException(str, i, str2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            DialogC37226Xz6.this.m75905t(new FacebookDialogException(null, -11, null));
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean z;
            int parseInt;
            C52364yi6.m2853Y("FacebookSDK.WebDialog", "Redirect URL: " + str);
            Uri parse = Uri.parse(str);
            if (parse.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", parse.getPath())) {
                z = true;
            } else {
                z = false;
            }
            if (str.startsWith(DialogC37226Xz6.this.f44371c)) {
                Bundle mo17184r = DialogC37226Xz6.this.mo17184r(str);
                String string = mo17184r.getString("error");
                if (string == null) {
                    string = mo17184r.getString("error_type");
                }
                String string2 = mo17184r.getString("error_msg");
                if (string2 == null) {
                    string2 = mo17184r.getString("error_message");
                }
                if (string2 == null) {
                    string2 = mo17184r.getString("error_description");
                }
                String string3 = mo17184r.getString("error_code");
                if (!C52364yi6.m2860R(string3)) {
                    try {
                        parseInt = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                    }
                    if (!C52364yi6.m2860R(string) && C52364yi6.m2860R(string2) && parseInt == -1) {
                        DialogC37226Xz6.this.m75904u(mo17184r);
                    } else if (string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                        DialogC37226Xz6.this.cancel();
                    } else if (parseInt != 4201) {
                        DialogC37226Xz6.this.cancel();
                    } else {
                        DialogC37226Xz6.this.m75905t(new FacebookServiceException(new FacebookRequestError(parseInt, string, string2), string2));
                    }
                    return true;
                }
                parseInt = -1;
                if (!C52364yi6.m2860R(string)) {
                }
                if (string == null) {
                }
                if (parseInt != 4201) {
                }
                return true;
            } else if (str.startsWith("fbconnect://cancel")) {
                DialogC37226Xz6.this.cancel();
                return true;
            } else {
                if (!z && !str.contains("touch")) {
                    try {
                        DialogC37226Xz6.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        return true;
                    } catch (ActivityNotFoundException unused2) {
                    }
                }
                return false;
            }
        }

        public /* synthetic */ C9581f(DialogC37226Xz6 dialogC37226Xz6, DialogInterface$OnCancelListenerC9576a dialogInterface$OnCancelListenerC9576a) {
            this();
        }
    }

    /* renamed from: Xz6$g */
    /* loaded from: classes5.dex */
    public interface InterfaceC9582g {
        /* renamed from: a */
        void mo28565a(Bundle bundle, FacebookException facebookException);
    }

    /* renamed from: Xz6$h */
    /* loaded from: classes5.dex */
    public class AsyncTaskC9583h extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        public String f44394a;

        /* renamed from: b */
        public Bundle f44395b;

        /* renamed from: c */
        public Exception[] f44396c;

        /* renamed from: Xz6$h$a */
        /* loaded from: classes5.dex */
        public class C9584a implements GraphRequest.InterfaceC17205b {

            /* renamed from: a */
            public final /* synthetic */ String[] f44398a;

            /* renamed from: b */
            public final /* synthetic */ int f44399b;

            /* renamed from: c */
            public final /* synthetic */ CountDownLatch f44400c;

            public C9584a(String[] strArr, int i, CountDownLatch countDownLatch) {
                this.f44398a = strArr;
                this.f44399b = i;
                this.f44400c = countDownLatch;
            }

            @Override // com.facebook.GraphRequest.InterfaceC17205b
            /* renamed from: a */
            public void mo2794a(WD1 wd1) {
                FacebookRequestError m78704b;
                String str;
                try {
                    m78704b = wd1.m78704b();
                    str = "Error staging photo.";
                } catch (Exception e) {
                    AsyncTaskC9583h.this.f44396c[this.f44399b] = e;
                }
                if (m78704b != null) {
                    String m52865c = m78704b.m52865c();
                    if (m52865c != null) {
                        str = m52865c;
                    }
                    throw new FacebookGraphResponseException(wd1, str);
                }
                JSONObject m78703c = wd1.m78703c();
                if (m78703c != null) {
                    String optString = m78703c.optString("uri");
                    if (optString != null) {
                        this.f44398a[this.f44399b] = optString;
                        this.f44400c.countDown();
                        return;
                    }
                    throw new FacebookException("Error staging photo.");
                }
                throw new FacebookException("Error staging photo.");
            }
        }

        public AsyncTaskC9583h(String str, Bundle bundle) {
            this.f44394a = str;
            this.f44395b = bundle;
        }

        /* renamed from: b */
        public String[] m75891b(Void... voidArr) {
            if (TD0.m84203d(this)) {
                return null;
            }
            try {
                String[] stringArray = this.f44395b.getStringArray("media");
                String[] strArr = new String[stringArray.length];
                this.f44396c = new Exception[stringArray.length];
                CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                AccessToken m52920c = AccessToken.m52920c();
                for (int i = 0; i < stringArray.length; i++) {
                    try {
                        if (isCancelled()) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                ((AsyncTask) it.next()).cancel(true);
                            }
                            return null;
                        }
                        Uri parse = Uri.parse(stringArray[i]);
                        if (C52364yi6.m2858T(parse)) {
                            strArr[i] = parse.toString();
                            countDownLatch.countDown();
                        } else {
                            concurrentLinkedQueue.add(C34876Ny5.m93083m(m52920c, parse, new C9584a(strArr, i, countDownLatch)).m52836k());
                        }
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((AsyncTask) it2.next()).cancel(true);
                        }
                        return null;
                    }
                }
                countDownLatch.await();
                return strArr;
            } catch (Throwable th) {
                TD0.m84205b(th, this);
                return null;
            }
        }

        /* renamed from: c */
        public void m75890c(String[] strArr) {
            Exception[] excArr;
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                DialogC37226Xz6.this.f44374f.dismiss();
                for (Exception exc : this.f44396c) {
                    if (exc != null) {
                        DialogC37226Xz6.this.m75905t(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    DialogC37226Xz6.this.m75905t(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                List asList = Arrays.asList(strArr);
                if (asList.contains(null)) {
                    DialogC37226Xz6.this.m75905t(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                C52364yi6.m2840f0(this.f44395b, "media", new JSONArray((Collection) asList));
                DialogC37226Xz6.this.f44370b = C52364yi6.m2845d(C53066zt5.m163b(), C17216a.m52729q() + "/dialog/" + this.f44394a, this.f44395b).toString();
                DialogC37226Xz6.this.m75901x((DialogC37226Xz6.this.f44375g.getDrawable().getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (TD0.m84203d(this)) {
                return null;
            }
            try {
                return m75891b(voidArr);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                m75890c(strArr);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    public DialogC37226Xz6(Context context, String str) {
        this(context, str, m75912l());
    }

    /* renamed from: l */
    public static int m75912l() {
        C48817sj6.m13763o();
        return f44369o;
    }

    /* renamed from: n */
    public static void m75910n(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null && f44369o == 0) {
                m75900y(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: q */
    public static DialogC37226Xz6 m75907q(Context context, String str, Bundle bundle, int i, InterfaceC9582g interfaceC9582g) {
        m75910n(context);
        return new DialogC37226Xz6(context, str, bundle, i, interfaceC9582g);
    }

    /* renamed from: y */
    public static void m75900y(int i) {
        if (i == 0) {
            i = f44368n;
        }
        f44369o = i;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f44372d != null && !this.f44378j) {
            m75905t(new FacebookOperationCanceledException());
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f44373e;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f44379k && (progressDialog = this.f44374f) != null && progressDialog.isShowing()) {
            this.f44374f.dismiss();
        }
        super.dismiss();
    }

    /* renamed from: j */
    public final void m75914j() {
        ImageView imageView = new ImageView(getContext());
        this.f44375g = imageView;
        imageView.setOnClickListener(new View$OnClickListenerC9577b());
        this.f44375g.setImageDrawable(getContext().getResources().getDrawable(C50563vg4.com_facebook_close));
        this.f44375g.setVisibility(4);
    }

    /* renamed from: k */
    public final int m75913k(int i, float f, int i2, int i3) {
        int i4 = (int) (i / f);
        return (int) (i * (i4 <= i2 ? 1.0d : i4 >= i3 ? 0.5d : (((i3 - i4) / (i3 - i2)) * 0.5d) + 0.5d));
    }

    /* renamed from: m */
    public WebView m75911m() {
        return this.f44373e;
    }

    /* renamed from: o */
    public boolean m75909o() {
        return this.f44378j;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        this.f44379k = false;
        if (C52364yi6.m2844d0(getContext()) && (layoutParams = this.f44381m) != null && layoutParams.token == null) {
            layoutParams.token = getOwnerActivity().getWindow().getAttributes().token;
            C52364yi6.m2853Y("FacebookSDK.WebDialog", "Set token on onAttachedToWindow(): " + this.f44381m.token);
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f44374f = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f44374f.setMessage(getContext().getString(C38738bl4.com_facebook_loading));
        this.f44374f.setCanceledOnTouchOutside(false);
        this.f44374f.setOnCancelListener(new DialogInterface$OnCancelListenerC9576a());
        requestWindowFeature(1);
        this.f44376h = new FrameLayout(getContext());
        m75906s();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        m75914j();
        if (this.f44370b != null) {
            m75901x((this.f44375g.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f44376h.addView(this.f44375g, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f44376h);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f44379k = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            WebView webView = this.f44373e;
            if (webView != null && webView.canGoBack()) {
                this.f44373e.goBack();
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        AsyncTaskC9583h asyncTaskC9583h = this.f44377i;
        if (asyncTaskC9583h != null && asyncTaskC9583h.getStatus() == AsyncTask.Status.PENDING) {
            this.f44377i.execute(new Void[0]);
            this.f44374f.show();
            return;
        }
        m75906s();
    }

    @Override // android.app.Dialog
    public void onStop() {
        AsyncTaskC9583h asyncTaskC9583h = this.f44377i;
        if (asyncTaskC9583h != null) {
            asyncTaskC9583h.cancel(true);
            this.f44374f.dismiss();
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f44381m = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* renamed from: p */
    public boolean m75908p() {
        return this.f44380l;
    }

    /* renamed from: r */
    public Bundle mo17184r(String str) {
        Uri parse = Uri.parse(str);
        Bundle m2842e0 = C52364yi6.m2842e0(parse.getQuery());
        m2842e0.putAll(C52364yi6.m2842e0(parse.getFragment()));
        return m2842e0;
    }

    /* renamed from: s */
    public void m75906s() {
        int i;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        if (i2 < i3) {
            i = i2;
        } else {
            i = i3;
        }
        if (i2 < i3) {
            i2 = i3;
        }
        getWindow().setLayout(Math.min(m75913k(i, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(m75913k(i2, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    /* renamed from: t */
    public void m75905t(Throwable th) {
        FacebookException facebookException;
        if (this.f44372d != null && !this.f44378j) {
            this.f44378j = true;
            if (th instanceof FacebookException) {
                facebookException = (FacebookException) th;
            } else {
                facebookException = new FacebookException(th);
            }
            this.f44372d.mo28565a(null, facebookException);
            dismiss();
        }
    }

    /* renamed from: u */
    public void m75904u(Bundle bundle) {
        InterfaceC9582g interfaceC9582g = this.f44372d;
        if (interfaceC9582g != null && !this.f44378j) {
            this.f44378j = true;
            interfaceC9582g.mo28565a(bundle, null);
            dismiss();
        }
    }

    /* renamed from: v */
    public void m75903v(String str) {
        this.f44371c = str;
    }

    /* renamed from: w */
    public void m75902w(InterfaceC9582g interfaceC9582g) {
        this.f44372d = interfaceC9582g;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: x */
    public final void m75901x(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        C9578c c9578c = new C9578c(getContext());
        this.f44373e = c9578c;
        c9578c.setVerticalScrollBarEnabled(false);
        this.f44373e.setHorizontalScrollBarEnabled(false);
        this.f44373e.setWebViewClient(new C9581f(this, null));
        this.f44373e.getSettings().setJavaScriptEnabled(true);
        this.f44373e.loadUrl(this.f44370b);
        this.f44373e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f44373e.setVisibility(4);
        this.f44373e.getSettings().setSavePassword(false);
        this.f44373e.getSettings().setSaveFormData(false);
        this.f44373e.setFocusable(true);
        this.f44373e.setFocusableInTouchMode(true);
        this.f44373e.setOnTouchListener(new View$OnTouchListenerC9579d());
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f44373e);
        linearLayout.setBackgroundColor(-872415232);
        this.f44376h.addView(linearLayout);
    }

    public DialogC37226Xz6(Context context, String str, int i) {
        super(context, i == 0 ? m75912l() : i);
        this.f44371c = "fbconnect://success";
        this.f44378j = false;
        this.f44379k = false;
        this.f44380l = false;
        this.f44370b = str;
    }

    /* renamed from: Xz6$e */
    /* loaded from: classes5.dex */
    public static class C9580e {

        /* renamed from: a */
        public Context f44386a;

        /* renamed from: b */
        public String f44387b;

        /* renamed from: c */
        public String f44388c;

        /* renamed from: d */
        public int f44389d;

        /* renamed from: e */
        public InterfaceC9582g f44390e;

        /* renamed from: f */
        public Bundle f44391f;

        /* renamed from: g */
        public AccessToken f44392g;

        public C9580e(Context context, String str, Bundle bundle) {
            this.f44392g = AccessToken.m52920c();
            if (!AccessToken.m52909o()) {
                String m2801z = C52364yi6.m2801z(context);
                if (m2801z != null) {
                    this.f44387b = m2801z;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m75899b(context, str, bundle);
        }

        /* renamed from: a */
        public DialogC37226Xz6 mo52539a() {
            AccessToken accessToken = this.f44392g;
            if (accessToken != null) {
                this.f44391f.putString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, accessToken.m52921b());
                this.f44391f.putString("access_token", this.f44392g.m52911m());
            } else {
                this.f44391f.putString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, this.f44387b);
            }
            return DialogC37226Xz6.m75907q(this.f44386a, this.f44388c, this.f44391f, this.f44389d, this.f44390e);
        }

        /* renamed from: b */
        public final void m75899b(Context context, String str, Bundle bundle) {
            this.f44386a = context;
            this.f44388c = str;
            if (bundle != null) {
                this.f44391f = bundle;
            } else {
                this.f44391f = new Bundle();
            }
        }

        /* renamed from: c */
        public String m75898c() {
            return this.f44387b;
        }

        /* renamed from: d */
        public Context m75897d() {
            return this.f44386a;
        }

        /* renamed from: e */
        public InterfaceC9582g m75896e() {
            return this.f44390e;
        }

        /* renamed from: f */
        public Bundle m75895f() {
            return this.f44391f;
        }

        /* renamed from: g */
        public int m75894g() {
            return this.f44389d;
        }

        /* renamed from: h */
        public C9580e m75893h(InterfaceC9582g interfaceC9582g) {
            this.f44390e = interfaceC9582g;
            return this;
        }

        public C9580e(Context context, String str, String str2, Bundle bundle) {
            str = str == null ? C52364yi6.m2801z(context) : str;
            C48817sj6.m13764n(str, NamedConstantsKt.APPLICATION_ID);
            this.f44387b = str;
            m75899b(context, str2, bundle);
        }
    }

    public DialogC37226Xz6(Context context, String str, Bundle bundle, int i, InterfaceC9582g interfaceC9582g) {
        super(context, i == 0 ? m75912l() : i);
        this.f44371c = "fbconnect://success";
        this.f44378j = false;
        this.f44379k = false;
        this.f44380l = false;
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = C52364yi6.m2865M(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f44371c = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString(AnalyticsRequestV2.PARAM_CLIENT_ID, C17216a.m52740f());
        bundle.putString(SdkAction.ACTION_TYPE, String.format(Locale.ROOT, "android-%s", C17216a.m52725u()));
        this.f44372d = interfaceC9582g;
        if (str.equals("share") && bundle.containsKey("media")) {
            this.f44377i = new AsyncTaskC9583h(str, bundle);
            return;
        }
        String m163b = C53066zt5.m163b();
        this.f44370b = C52364yi6.m2845d(m163b, C17216a.m52729q() + "/dialog/" + str, bundle).toString();
    }
}
