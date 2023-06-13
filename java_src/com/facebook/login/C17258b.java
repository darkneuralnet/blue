package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.LoginClient;
/* renamed from: com.facebook.login.b */
/* loaded from: classes5.dex */
public class C17258b extends Fragment {

    /* renamed from: b */
    public String f69562b;

    /* renamed from: c */
    public LoginClient f69563c;

    /* renamed from: d */
    public LoginClient.Request f69564d;

    /* renamed from: com.facebook.login.b$a */
    /* loaded from: classes5.dex */
    public class C17259a implements LoginClient.InterfaceC17253c {
        public C17259a() {
        }

        @Override // com.facebook.login.LoginClient.InterfaceC17253c
        /* renamed from: a */
        public void mo52524a(LoginClient.Result result) {
            C17258b.this.m52528D9(result);
        }
    }

    /* renamed from: com.facebook.login.b$b */
    /* loaded from: classes5.dex */
    public class C17260b implements LoginClient.InterfaceC17252b {

        /* renamed from: a */
        public final /* synthetic */ View f69566a;

        public C17260b(View view) {
            this.f69566a = view;
        }

        @Override // com.facebook.login.LoginClient.InterfaceC17252b
        /* renamed from: a */
        public void mo52523a() {
            this.f69566a.setVisibility(0);
        }

        @Override // com.facebook.login.LoginClient.InterfaceC17252b
        /* renamed from: b */
        public void mo52522b() {
            this.f69566a.setVisibility(8);
        }
    }

    /* renamed from: A9 */
    public LoginClient m52530A9() {
        return this.f69563c;
    }

    /* renamed from: B9 */
    public final void m52529B9(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.f69562b = callingActivity.getPackageName();
    }

    /* renamed from: D9 */
    public final void m52528D9(LoginClient.Result result) {
        int i;
        this.f69564d = null;
        if (result.f69536b == LoginClient.Result.EnumC17250b.CANCEL) {
            i = 0;
        } else {
            i = -1;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (isAdded()) {
            getActivity().setResult(i, intent);
            getActivity().finish();
        }
    }

    /* renamed from: N6 */
    public LoginClient m52527N6() {
        return new LoginClient(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f69563c.m52601x(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle != null) {
            LoginClient loginClient = (LoginClient) bundle.getParcelable("loginClient");
            this.f69563c = loginClient;
            loginClient.m52599z(this);
        } else {
            this.f69563c = m52527N6();
        }
        this.f69563c.m52628A(new C17259a());
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        m52529B9(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f69564d = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(m52525t8(), viewGroup, false);
        this.f69563c.m52600y(new C17260b(inflate.findViewById(C33327Hi4.com_facebook_login_fragment_progress_bar)));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f69563c.m52621c();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        View findViewById;
        super.onPause();
        if (getView() == null) {
            findViewById = null;
        } else {
            findViewById = getView().findViewById(C33327Hi4.com_facebook_login_fragment_progress_bar);
        }
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f69562b == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
            return;
        }
        this.f69563c.m52627B(this.f69564d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.f69563c);
    }

    /* renamed from: t8 */
    public int m52525t8() {
        return C49418tk4.com_facebook_login_fragment;
    }
}
