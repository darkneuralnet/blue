package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.DialogInterface$OnCancelListenerC11663c;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
@Deprecated
/* loaded from: classes5.dex */
public class DeviceShareDialogFragment extends DialogInterface$OnCancelListenerC11663c {

    /* renamed from: h */
    public static ScheduledThreadPoolExecutor f69651h;

    /* renamed from: b */
    public ProgressBar f69652b;

    /* renamed from: c */
    public TextView f69653c;

    /* renamed from: d */
    public Dialog f69654d;

    /* renamed from: e */
    public volatile RequestState f69655e;

    /* renamed from: f */
    public volatile ScheduledFuture f69656f;

    /* renamed from: g */
    public ShareContent f69657g;

    /* loaded from: classes5.dex */
    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C17287a();

        /* renamed from: b */
        public String f69658b;

        /* renamed from: c */
        public long f69659c;

        /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$RequestState$a */
        /* loaded from: classes5.dex */
        public static class C17287a implements Parcelable.Creator<RequestState> {
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
        public long m52407a() {
            return this.f69659c;
        }

        /* renamed from: b */
        public String m52406b() {
            return this.f69658b;
        }

        /* renamed from: c */
        public void m52405c(long j) {
            this.f69659c = j;
        }

        /* renamed from: d */
        public void m52404d(String str) {
            this.f69658b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f69658b);
            parcel.writeLong(this.f69659c);
        }

        public RequestState(Parcel parcel) {
            this.f69658b = parcel.readString();
            this.f69659c = parcel.readLong();
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$a */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC17288a implements View.OnClickListener {
        public View$OnClickListenerC17288a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                DeviceShareDialogFragment.this.f69654d.dismiss();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$b */
    /* loaded from: classes5.dex */
    public class C17289b implements GraphRequest.InterfaceC17205b {
        public C17289b() {
        }

        @Override // com.facebook.GraphRequest.InterfaceC17205b
        /* renamed from: a */
        public void mo2794a(WD1 wd1) {
            FacebookRequestError m78704b = wd1.m78704b();
            if (m78704b != null) {
                DeviceShareDialogFragment.this.m52416D9(m78704b);
                return;
            }
            JSONObject m78703c = wd1.m78703c();
            RequestState requestState = new RequestState();
            try {
                requestState.m52404d(m78703c.getString("user_code"));
                requestState.m52405c(m78703c.getLong("expires_in"));
                DeviceShareDialogFragment.this.m52413I9(requestState);
            } catch (JSONException unused) {
                DeviceShareDialogFragment.this.m52416D9(new FacebookRequestError(0, "", "Malformed server response"));
            }
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$c */
    /* loaded from: classes5.dex */
    public class RunnableC17290c implements Runnable {
        public RunnableC17290c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                DeviceShareDialogFragment.this.f69654d.dismiss();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: E9 */
    public static synchronized ScheduledThreadPoolExecutor m52415E9() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (f69651h == null) {
                f69651h = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f69651h;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: A9 */
    public final void m52418A9() {
        if (isAdded()) {
            getFragmentManager().m67311q().mo67105s(this).mo67115i();
        }
    }

    /* renamed from: B9 */
    public final void m52417B9(int i, Intent intent) {
        if (this.f69655e != null) {
            Y21.m75811a(this.f69655e.m52406b());
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(getContext(), facebookRequestError.m52865c(), 0).show();
        }
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    /* renamed from: D9 */
    public final void m52416D9(FacebookRequestError facebookRequestError) {
        m52418A9();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        m52417B9(-1, intent);
    }

    /* renamed from: G9 */
    public final Bundle m52414G9() {
        ShareContent shareContent = this.f69657g;
        if (shareContent == null) {
            return null;
        }
        if (shareContent instanceof ShareLinkContent) {
            return C37460Yz6.m73937a((ShareLinkContent) shareContent);
        }
        if (!(shareContent instanceof ShareOpenGraphContent)) {
            return null;
        }
        return C37460Yz6.m73936b((ShareOpenGraphContent) shareContent);
    }

    /* renamed from: I9 */
    public final void m52413I9(RequestState requestState) {
        this.f69655e = requestState;
        this.f69653c.setText(requestState.m52406b());
        this.f69653c.setVisibility(0);
        this.f69652b.setVisibility(8);
        this.f69656f = m52415E9().schedule(new RunnableC17290c(), requestState.m52407a(), TimeUnit.SECONDS);
    }

    /* renamed from: J9 */
    public void m52412J9(ShareContent shareContent) {
        this.f69657g = shareContent;
    }

    /* renamed from: P9 */
    public final void m52410P9() {
        Bundle m52414G9 = m52414G9();
        if (m52414G9 == null || m52414G9.size() == 0) {
            m52416D9(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        m52414G9.putString("access_token", C48817sj6.m13776b() + "|" + C48817sj6.m13775c());
        m52414G9.putString("device_info", Y21.m75808d());
        new GraphRequest(null, "device/share", m52414G9, FN1.POST, new C17289b()).m52836k();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public Dialog onCreateDialog(Bundle bundle) {
        this.f69654d = new Dialog(getActivity(), C32886Fl4.com_facebook_auth_dialog);
        View inflate = getActivity().getLayoutInflater().inflate(C49418tk4.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.f69652b = (ProgressBar) inflate.findViewById(C33327Hi4.progress_bar);
        this.f69653c = (TextView) inflate.findViewById(C33327Hi4.confirmation_code);
        ((Button) inflate.findViewById(C33327Hi4.cancel_button)).setOnClickListener(new View$OnClickListenerC17288a());
        ((TextView) inflate.findViewById(C33327Hi4.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(C38738bl4.com_facebook_device_auth_instructions)));
        this.f69654d.setContentView(inflate);
        m52410P9();
        return this.f69654d;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            m52413I9(requestState);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f69656f != null) {
            this.f69656f.cancel(true);
        }
        m52417B9(-1, new Intent());
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f69655e != null) {
            bundle.putParcelable("request_state", this.f69655e);
        }
    }
}
