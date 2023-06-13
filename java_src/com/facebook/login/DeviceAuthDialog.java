package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC11663c;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.login.LoginClient;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C52364yi6;
/* loaded from: classes5.dex */
public class DeviceAuthDialog extends DialogInterface$OnCancelListenerC11663c {

    /* renamed from: b */
    public View f69474b;

    /* renamed from: c */
    public TextView f69475c;

    /* renamed from: d */
    public TextView f69476d;

    /* renamed from: e */
    public DeviceAuthMethodHandler f69477e;

    /* renamed from: g */
    public volatile UD1 f69479g;

    /* renamed from: h */
    public volatile ScheduledFuture f69480h;

    /* renamed from: i */
    public volatile RequestState f69481i;

    /* renamed from: f */
    public AtomicBoolean f69478f = new AtomicBoolean();

    /* renamed from: j */
    public boolean f69482j = false;

    /* renamed from: k */
    public boolean f69483k = false;

    /* renamed from: l */
    public LoginClient.Request f69484l = null;

    /* loaded from: classes5.dex */
    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C17233a();

        /* renamed from: b */
        public String f69485b;

        /* renamed from: c */
        public String f69486c;

        /* renamed from: d */
        public String f69487d;

        /* renamed from: e */
        public long f69488e;

        /* renamed from: f */
        public long f69489f;

        /* renamed from: com.facebook.login.DeviceAuthDialog$RequestState$a */
        /* loaded from: classes5.dex */
        public static class C17233a implements Parcelable.Creator<RequestState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public RequestState createFromParcel(Parcel parcel) {
                return new RequestState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public RequestState[] newArray(int i) {
                return new RequestState[i];
            }
        }

        public RequestState() {
        }

        /* renamed from: a */
        public String m52656a() {
            return this.f69485b;
        }

        /* renamed from: b */
        public long m52655b() {
            return this.f69488e;
        }

        /* renamed from: c */
        public String m52654c() {
            return this.f69487d;
        }

        /* renamed from: d */
        public String m52653d() {
            return this.f69486c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public void m52652e(long j) {
            this.f69488e = j;
        }

        /* renamed from: g */
        public void m52651g(long j) {
            this.f69489f = j;
        }

        /* renamed from: h */
        public void m52650h(String str) {
            this.f69487d = str;
        }

        /* renamed from: i */
        public void m52649i(String str) {
            this.f69486c = str;
            this.f69485b = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", str);
        }

        /* renamed from: j */
        public boolean m52648j() {
            if (this.f69489f == 0 || (new Date().getTime() - this.f69489f) - (this.f69488e * 1000) >= 0) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f69485b);
            parcel.writeString(this.f69486c);
            parcel.writeString(this.f69487d);
            parcel.writeLong(this.f69488e);
            parcel.writeLong(this.f69489f);
        }

        public RequestState(Parcel parcel) {
            this.f69485b = parcel.readString();
            this.f69486c = parcel.readString();
            this.f69487d = parcel.readString();
            this.f69488e = parcel.readLong();
            this.f69489f = parcel.readLong();
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$a */
    /* loaded from: classes5.dex */
    public class DialogC17234a extends Dialog {
        public DialogC17234a(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            DeviceAuthDialog.this.m52665ha();
            super.onBackPressed();
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$b */
    /* loaded from: classes5.dex */
    public class C17235b implements GraphRequest.InterfaceC17205b {
        public C17235b() {
        }

        @Override // com.facebook.GraphRequest.InterfaceC17205b
        /* renamed from: a */
        public void mo2794a(WD1 wd1) {
            if (DeviceAuthDialog.this.f69482j) {
                return;
            }
            if (wd1.m78704b() != null) {
                DeviceAuthDialog.this.m52663la(wd1.m78704b().m52863e());
                return;
            }
            JSONObject m78703c = wd1.m78703c();
            RequestState requestState = new RequestState();
            try {
                requestState.m52649i(m78703c.getString("user_code"));
                requestState.m52650h(m78703c.getString(PaymentMethodOptionsParams.Blik.PARAM_CODE));
                requestState.m52652e(m78703c.getLong("interval"));
                DeviceAuthDialog.this.m52657ya(requestState);
            } catch (JSONException e) {
                DeviceAuthDialog.this.m52663la(new FacebookException(e));
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$c */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC17236c implements View.OnClickListener {
        public View$OnClickListenerC17236c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                DeviceAuthDialog.this.m52664ia();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$d */
    /* loaded from: classes5.dex */
    public class RunnableC17237d implements Runnable {
        public RunnableC17237d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                DeviceAuthDialog.this.m52661oa();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$e */
    /* loaded from: classes5.dex */
    public class C17238e implements GraphRequest.InterfaceC17205b {
        public C17238e() {
        }

        @Override // com.facebook.GraphRequest.InterfaceC17205b
        /* renamed from: a */
        public void mo2794a(WD1 wd1) {
            if (DeviceAuthDialog.this.f69478f.get()) {
                return;
            }
            FacebookRequestError m78704b = wd1.m78704b();
            if (m78704b != null) {
                int m52860i = m78704b.m52860i();
                if (m52860i != 1349152) {
                    switch (m52860i) {
                        case 1349172:
                        case 1349174:
                            DeviceAuthDialog.this.m52658va();
                            return;
                        case 1349173:
                            DeviceAuthDialog.this.m52664ia();
                            return;
                        default:
                            DeviceAuthDialog.this.m52663la(wd1.m78704b().m52863e());
                            return;
                    }
                }
                if (DeviceAuthDialog.this.f69481i != null) {
                    Y21.m75811a(DeviceAuthDialog.this.f69481i.m52653d());
                }
                if (DeviceAuthDialog.this.f69484l != null) {
                    DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                    deviceAuthDialog.m52680Aa(deviceAuthDialog.f69484l);
                    return;
                }
                DeviceAuthDialog.this.m52664ia();
                return;
            }
            try {
                JSONObject m78703c = wd1.m78703c();
                DeviceAuthDialog.this.m52662ma(m78703c.getString("access_token"), Long.valueOf(m78703c.getLong("expires_in")), Long.valueOf(m78703c.optLong("data_access_expiration_time")));
            } catch (JSONException e) {
                DeviceAuthDialog.this.m52663la(new FacebookException(e));
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$f */
    /* loaded from: classes5.dex */
    public class DialogInterface$OnClickListenerC17239f implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC17239f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DeviceAuthDialog.this.getDialog().setContentView(DeviceAuthDialog.this.m52666fa(false));
            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
            deviceAuthDialog.m52680Aa(deviceAuthDialog.f69484l);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$g */
    /* loaded from: classes5.dex */
    public class DialogInterface$OnClickListenerC17240g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ String f69496b;

        /* renamed from: c */
        public final /* synthetic */ C52364yi6.C30684c f69497c;

        /* renamed from: d */
        public final /* synthetic */ String f69498d;

        /* renamed from: e */
        public final /* synthetic */ Date f69499e;

        /* renamed from: f */
        public final /* synthetic */ Date f69500f;

        public DialogInterface$OnClickListenerC17240g(String str, C52364yi6.C30684c c30684c, String str2, Date date, Date date2) {
            this.f69496b = str;
            this.f69497c = c30684c;
            this.f69498d = str2;
            this.f69499e = date;
            this.f69500f = date2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DeviceAuthDialog.this.m52670T9(this.f69496b, this.f69497c, this.f69498d, this.f69499e, this.f69500f);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$h */
    /* loaded from: classes5.dex */
    public class C17241h implements GraphRequest.InterfaceC17205b {

        /* renamed from: a */
        public final /* synthetic */ String f69502a;

        /* renamed from: b */
        public final /* synthetic */ Date f69503b;

        /* renamed from: c */
        public final /* synthetic */ Date f69504c;

        public C17241h(String str, Date date, Date date2) {
            this.f69502a = str;
            this.f69503b = date;
            this.f69504c = date2;
        }

        @Override // com.facebook.GraphRequest.InterfaceC17205b
        /* renamed from: a */
        public void mo2794a(WD1 wd1) {
            if (DeviceAuthDialog.this.f69478f.get()) {
                return;
            }
            if (wd1.m78704b() != null) {
                DeviceAuthDialog.this.m52663la(wd1.m78704b().m52863e());
                return;
            }
            try {
                JSONObject m78703c = wd1.m78703c();
                String string = m78703c.getString("id");
                C52364yi6.C30684c m2872F = C52364yi6.m2872F(m78703c);
                String string2 = m78703c.getString("name");
                Y21.m75811a(DeviceAuthDialog.this.f69481i.m52653d());
                if (C34746Nk1.m93522j(C17216a.m52740f()).m94968n().contains(DF5.RequireConfirm) && !DeviceAuthDialog.this.f69483k) {
                    DeviceAuthDialog.this.f69483k = true;
                    DeviceAuthDialog.this.m52660sa(string, m2872F, this.f69502a, string2, this.f69503b, this.f69504c);
                    return;
                }
                DeviceAuthDialog.this.m52670T9(string, m2872F, this.f69502a, this.f69503b, this.f69504c);
            } catch (JSONException e) {
                DeviceAuthDialog.this.m52663la(new FacebookException(e));
            }
        }
    }

    /* renamed from: Aa */
    public void m52680Aa(LoginClient.Request request) {
        this.f69484l = request;
        Bundle bundle = new Bundle();
        bundle.putString(Action.SCOPE_ATTRIBUTE, TextUtils.join(",", request.m52590j()));
        String m52593g = request.m52593g();
        if (m52593g != null) {
            bundle.putString("redirect_uri", m52593g);
        }
        String m52594e = request.m52594e();
        if (m52594e != null) {
            bundle.putString("target_user_id", m52594e);
        }
        bundle.putString("access_token", C48817sj6.m13776b() + "|" + C48817sj6.m13775c());
        bundle.putString("device_info", Y21.m75808d());
        new GraphRequest(null, "device/login", bundle, FN1.POST, new C17235b()).m52836k();
    }

    /* renamed from: T9 */
    public final void m52670T9(String str, C52364yi6.C30684c c30684c, String str2, Date date, Date date2) {
        this.f69477e.m52641t(str2, C17216a.m52740f(), str, c30684c.m2795c(), c30684c.m2797a(), c30684c.m2796b(), EnumC3312I1.DEVICE_AUTH, date, null, date2);
        getDialog().dismiss();
    }

    /* renamed from: da */
    public int m52668da(boolean z) {
        return z ? C49418tk4.com_facebook_smart_device_dialog_fragment : C49418tk4.com_facebook_device_auth_dialog_fragment;
    }

    /* renamed from: ea */
    public final GraphRequest m52667ea() {
        Bundle bundle = new Bundle();
        bundle.putString(PaymentMethodOptionsParams.Blik.PARAM_CODE, this.f69481i.m52654c());
        return new GraphRequest(null, "device/login_status", bundle, FN1.POST, new C17238e());
    }

    /* renamed from: fa */
    public View m52666fa(boolean z) {
        View inflate = getActivity().getLayoutInflater().inflate(m52668da(z), (ViewGroup) null);
        this.f69474b = inflate.findViewById(C33327Hi4.progress_bar);
        this.f69475c = (TextView) inflate.findViewById(C33327Hi4.confirmation_code);
        ((Button) inflate.findViewById(C33327Hi4.cancel_button)).setOnClickListener(new View$OnClickListenerC17236c());
        TextView textView = (TextView) inflate.findViewById(C33327Hi4.com_facebook_device_auth_instructions);
        this.f69476d = textView;
        textView.setText(Html.fromHtml(getString(C38738bl4.com_facebook_device_auth_instructions)));
        return inflate;
    }

    /* renamed from: ha */
    public void m52665ha() {
    }

    /* renamed from: ia */
    public void m52664ia() {
        if (!this.f69478f.compareAndSet(false, true)) {
            return;
        }
        if (this.f69481i != null) {
            Y21.m75811a(this.f69481i.m52653d());
        }
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.f69477e;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.m52643r();
        }
        getDialog().dismiss();
    }

    /* renamed from: la */
    public void m52663la(FacebookException facebookException) {
        if (!this.f69478f.compareAndSet(false, true)) {
            return;
        }
        if (this.f69481i != null) {
            Y21.m75811a(this.f69481i.m52653d());
        }
        this.f69477e.m52642s(facebookException);
        getDialog().dismiss();
    }

    /* renamed from: ma */
    public final void m52662ma(String str, Long l, Long l2) {
        Date date;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date2 = null;
        if (l.longValue() != 0) {
            date = new Date(new Date().getTime() + (l.longValue() * 1000));
        } else {
            date = null;
        }
        if (l2.longValue() != 0) {
            date2 = new Date(l2.longValue() * 1000);
        }
        new GraphRequest(new AccessToken(str, C17216a.m52740f(), "0", null, null, null, null, date, null, date2), "me", bundle, FN1.GET, new C17241h(str, date, date2)).m52836k();
    }

    /* renamed from: oa */
    public final void m52661oa() {
        this.f69481i.m52651g(new Date().getTime());
        this.f69479g = m52667ea().m52836k();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        DialogC17234a dialogC17234a = new DialogC17234a(getActivity(), C32886Fl4.com_facebook_auth_dialog);
        if (Y21.m75807e() && !this.f69483k) {
            z = true;
        } else {
            z = false;
        }
        dialogC17234a.setContentView(m52666fa(z));
        return dialogC17234a;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f69477e = (DeviceAuthMethodHandler) ((C17258b) ((FacebookActivity) getActivity()).getCurrentFragment()).m52530A9().m52614k();
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            m52657ya(requestState);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f69482j = true;
        this.f69478f.set(true);
        super.onDestroyView();
        if (this.f69479g != null) {
            this.f69479g.cancel(true);
        }
        if (this.f69480h != null) {
            this.f69480h.cancel(true);
        }
        this.f69474b = null;
        this.f69475c = null;
        this.f69476d = null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f69482j) {
            m52664ia();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f69481i != null) {
            bundle.putParcelable("request_state", this.f69481i);
        }
    }

    /* renamed from: sa */
    public final void m52660sa(String str, C52364yi6.C30684c c30684c, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(C38738bl4.com_facebook_smart_login_confirmation_title);
        String string2 = getResources().getString(C38738bl4.com_facebook_smart_login_confirmation_continue_as);
        String string3 = getResources().getString(C38738bl4.com_facebook_smart_login_confirmation_cancel);
        String format = String.format(string2, str3);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DialogInterface$OnClickListenerC17240g(str, c30684c, str2, date, date2)).setPositiveButton(string3, new DialogInterface$OnClickListenerC17239f());
        builder.create().show();
    }

    /* renamed from: va */
    public final void m52658va() {
        this.f69480h = DeviceAuthMethodHandler.m52644q().schedule(new RunnableC17237d(), this.f69481i.m52655b(), TimeUnit.SECONDS);
    }

    /* renamed from: ya */
    public final void m52657ya(RequestState requestState) {
        this.f69481i = requestState;
        this.f69475c.setText(requestState.m52653d());
        this.f69476d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(getResources(), Y21.m75809c(requestState.m52656a())), (Drawable) null, (Drawable) null);
        this.f69475c.setVisibility(0);
        this.f69474b.setVisibility(8);
        if (!this.f69483k && Y21.m75806f(requestState.m52653d())) {
            new C45485n62(getContext()).m24339g("fb_smart_login_service");
        }
        if (requestState.m52648j()) {
            m52658va();
        } else {
            m52661oa();
        }
    }
}
