package p000;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC11663c;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C17216a;
import com.facebook.FacebookException;
import p000.DialogC37226Xz6;
/* renamed from: kj1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C44069kj1 extends DialogInterface$OnCancelListenerC11663c {

    /* renamed from: b */
    public Dialog f94825b;

    /* renamed from: kj1$a */
    /* loaded from: classes5.dex */
    public class C25219a implements DialogC37226Xz6.InterfaceC9582g {
        public C25219a() {
        }

        @Override // p000.DialogC37226Xz6.InterfaceC9582g
        /* renamed from: a */
        public void mo28565a(Bundle bundle, FacebookException facebookException) {
            C44069kj1.this.m28566t8(bundle, facebookException);
        }
    }

    /* renamed from: kj1$b */
    /* loaded from: classes5.dex */
    public class C25220b implements DialogC37226Xz6.InterfaceC9582g {
        public C25220b() {
        }

        @Override // p000.DialogC37226Xz6.InterfaceC9582g
        /* renamed from: a */
        public void mo28565a(Bundle bundle, FacebookException facebookException) {
            C44069kj1.this.m28570A9(bundle);
        }
    }

    /* renamed from: A9 */
    public final void m28570A9(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    /* renamed from: B9 */
    public void m28569B9(Dialog dialog) {
        this.f94825b = dialog;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f94825b instanceof DialogC37226Xz6) && isResumed()) {
            ((DialogC37226Xz6) this.f94825b).m75906s();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        DialogC37226Xz6 m17185A;
        super.onCreate(bundle);
        if (this.f94825b == null) {
            FragmentActivity activity = getActivity();
            Bundle m8464x = C50483vY2.m8464x(activity.getIntent());
            if (!m8464x.getBoolean("is_fallback", false)) {
                String string = m8464x.getString("action");
                Bundle bundle2 = m8464x.getBundle("params");
                if (C52364yi6.m2860R(string)) {
                    C52364yi6.m2853Y("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                }
                m17185A = new DialogC37226Xz6.C9580e(activity, string, bundle2).m75893h(new C25219a()).mo52539a();
            } else {
                String string2 = m8464x.getString("url");
                if (C52364yi6.m2860R(string2)) {
                    C52364yi6.m2853Y("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                m17185A = DialogC47627qj1.m17185A(activity, string2, String.format("fb%s://bridge/", C17216a.m52740f()));
                m17185A.m75902w(new C25220b());
            }
            this.f94825b = m17185A;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f94825b == null) {
            m28566t8(null, null);
            setShowsDialog(false);
        }
        return this.f94825b;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.f94825b;
        if (dialog instanceof DialogC37226Xz6) {
            ((DialogC37226Xz6) dialog).m75906s();
        }
    }

    /* renamed from: t8 */
    public final void m28566t8(Bundle bundle, FacebookException facebookException) {
        int i;
        FragmentActivity activity = getActivity();
        Intent m8474n = C50483vY2.m8474n(activity.getIntent(), bundle, facebookException);
        if (facebookException == null) {
            i = -1;
        } else {
            i = 0;
        }
        activity.setResult(i, m8474n);
        activity.finish();
    }
}
