package zendesk.belvedere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.C31132j;
/* loaded from: classes8.dex */
public class BelvedereUi {

    /* renamed from: zendesk.belvedere.BelvedereUi$b */
    /* loaded from: classes8.dex */
    public static class C31075b {

        /* renamed from: a */
        public final Context f121725a;

        /* renamed from: b */
        public final boolean f121726b;

        /* renamed from: c */
        public final List<MediaIntent> f121727c;

        /* renamed from: d */
        public List<MediaResult> f121728d;

        /* renamed from: e */
        public List<MediaResult> f121729e;

        /* renamed from: f */
        public List<Integer> f121730f;

        /* renamed from: g */
        public long f121731g;

        /* renamed from: h */
        public boolean f121732h;

        /* renamed from: zendesk.belvedere.BelvedereUi$b$a */
        /* loaded from: classes8.dex */
        public class C31076a implements C31132j.InterfaceC31136d {

            /* renamed from: a */
            public final /* synthetic */ C31098b f121733a;

            /* renamed from: zendesk.belvedere.BelvedereUi$b$a$a */
            /* loaded from: classes8.dex */
            public class RunnableC31077a implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ List f121735b;

                /* renamed from: c */
                public final /* synthetic */ Activity f121736c;

                /* renamed from: d */
                public final /* synthetic */ ViewGroup f121737d;

                public RunnableC31077a(List list, Activity activity, ViewGroup viewGroup) {
                    this.f121735b = list;
                    this.f121736c = activity;
                    this.f121737d = viewGroup;
                }

                @Override // java.lang.Runnable
                public void run() {
                    UiConfig uiConfig = new UiConfig(this.f121735b, C31075b.this.f121728d, C31075b.this.f121729e, true, C31075b.this.f121730f, C31075b.this.f121731g, C31075b.this.f121732h);
                    C31076a.this.f121733a.m747T9(C31121h.m675v(this.f121736c, this.f121737d, C31076a.this.f121733a, uiConfig), uiConfig);
                }
            }

            /* renamed from: zendesk.belvedere.BelvedereUi$b$a$b */
            /* loaded from: classes8.dex */
            public class View$OnClickListenerC31078b implements View.OnClickListener {

                /* renamed from: b */
                public final /* synthetic */ Activity f121739b;

                public View$OnClickListenerC31078b(Activity activity) {
                    this.f121739b = activity;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", this.f121739b.getPackageName(), null));
                    this.f121739b.startActivity(intent);
                }
            }

            public C31076a(C31098b c31098b) {
                this.f121733a = c31098b;
            }

            @Override // zendesk.belvedere.C31132j.InterfaceC31136d
            /* renamed from: a */
            public void mo648a(List<MediaIntent> list) {
                FragmentActivity activity = this.f121733a.getActivity();
                if (activity != null && !activity.isChangingConfigurations()) {
                    ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
                    viewGroup.post(new RunnableC31077a(list, activity, viewGroup));
                }
            }

            @Override // zendesk.belvedere.C31132j.InterfaceC31136d
            /* renamed from: b */
            public void mo647b() {
                FragmentActivity activity = this.f121733a.getActivity();
                if (activity != null) {
                    C32627Ei6.m108563e((ViewGroup) activity.findViewById(16908290), activity.getString(C44092kl4.belvedere_permissions_rationale), 5000L, activity.getString(C44092kl4.belvedere_navigate_to_settings), new View$OnClickListenerC31078b(activity));
                }
            }
        }

        /* renamed from: f */
        public void m851f(AppCompatActivity appCompatActivity) {
            C31098b m865b = BelvedereUi.m865b(appCompatActivity);
            m865b.m756B9(this.f121727c, new C31076a(m865b));
        }

        /* renamed from: g */
        public C31075b m850g() {
            this.f121727c.add(C31096a.m764c(this.f121725a).m766a().m791a());
            return this;
        }

        /* renamed from: h */
        public C31075b m849h(String str, boolean z) {
            this.f121727c.add(C31096a.m764c(this.f121725a).m765b().m790a(z).m788c(str).m789b());
            return this;
        }

        /* renamed from: i */
        public C31075b m848i(List<MediaResult> list) {
            this.f121729e = new ArrayList(list);
            return this;
        }

        /* renamed from: j */
        public C31075b m847j(boolean z) {
            this.f121732h = z;
            return this;
        }

        /* renamed from: k */
        public C31075b m846k(long j) {
            this.f121731g = j;
            return this;
        }

        /* renamed from: l */
        public C31075b m845l(List<MediaResult> list) {
            this.f121728d = new ArrayList(list);
            return this;
        }

        /* renamed from: m */
        public C31075b m844m(int... iArr) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                arrayList.add(Integer.valueOf(i));
            }
            this.f121730f = arrayList;
            return this;
        }

        public C31075b(Context context) {
            this.f121726b = true;
            this.f121727c = new ArrayList();
            this.f121728d = new ArrayList();
            this.f121729e = new ArrayList();
            this.f121730f = new ArrayList();
            this.f121731g = -1L;
            this.f121732h = false;
            this.f121725a = context;
        }
    }

    /* renamed from: a */
    public static C31075b m866a(Context context) {
        return new C31075b(context);
    }

    /* renamed from: b */
    public static C31098b m865b(AppCompatActivity appCompatActivity) {
        C31098b c31098b;
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        Fragment m67322m0 = supportFragmentManager.m67322m0("belvedere_image_stream");
        if (m67322m0 instanceof C31098b) {
            c31098b = (C31098b) m67322m0;
        } else {
            c31098b = new C31098b();
            supportFragmentManager.m67311q().m67119e(c31098b, "belvedere_image_stream").mo67113k();
        }
        c31098b.m745da(KeyboardHelper.m804r(appCompatActivity));
        return c31098b;
    }

    /* loaded from: classes8.dex */
    public static class UiConfig implements Parcelable {
        public static final Parcelable.Creator<UiConfig> CREATOR = new C31073a();

        /* renamed from: b */
        public final List<MediaIntent> f121718b;

        /* renamed from: c */
        public final List<MediaResult> f121719c;

        /* renamed from: d */
        public final List<MediaResult> f121720d;

        /* renamed from: e */
        public final List<Integer> f121721e;

        /* renamed from: f */
        public final boolean f121722f;

        /* renamed from: g */
        public final long f121723g;

        /* renamed from: h */
        public final boolean f121724h;

        /* renamed from: zendesk.belvedere.BelvedereUi$UiConfig$a */
        /* loaded from: classes8.dex */
        public static class C31073a implements Parcelable.Creator<UiConfig> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public UiConfig createFromParcel(Parcel parcel) {
                return new UiConfig(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public UiConfig[] newArray(int i) {
                return new UiConfig[i];
            }
        }

        public UiConfig() {
            this.f121718b = new ArrayList();
            this.f121719c = new ArrayList();
            this.f121720d = new ArrayList();
            this.f121721e = new ArrayList();
            this.f121722f = true;
            this.f121723g = -1L;
            this.f121724h = false;
        }

        /* renamed from: a */
        public List<MediaResult> m864a() {
            return this.f121720d;
        }

        /* renamed from: b */
        public List<MediaIntent> m863b() {
            return this.f121718b;
        }

        /* renamed from: c */
        public long m862c() {
            return this.f121723g;
        }

        /* renamed from: d */
        public List<MediaResult> m861d() {
            return this.f121719c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public List<Integer> m860e() {
            return this.f121721e;
        }

        /* renamed from: g */
        public boolean m859g() {
            return this.f121724h;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.f121718b);
            parcel.writeTypedList(this.f121719c);
            parcel.writeTypedList(this.f121720d);
            parcel.writeList(this.f121721e);
            parcel.writeInt(this.f121722f ? 1 : 0);
            parcel.writeLong(this.f121723g);
            parcel.writeInt(this.f121724h ? 1 : 0);
        }

        public UiConfig(List<MediaIntent> list, List<MediaResult> list2, List<MediaResult> list3, boolean z, List<Integer> list4, long j, boolean z2) {
            this.f121718b = list;
            this.f121719c = list2;
            this.f121720d = list3;
            this.f121722f = z;
            this.f121721e = list4;
            this.f121723g = j;
            this.f121724h = z2;
        }

        public UiConfig(Parcel parcel) {
            this.f121718b = parcel.createTypedArrayList(MediaIntent.CREATOR);
            Parcelable.Creator<MediaResult> creator = MediaResult.CREATOR;
            this.f121719c = parcel.createTypedArrayList(creator);
            this.f121720d = parcel.createTypedArrayList(creator);
            ArrayList arrayList = new ArrayList();
            this.f121721e = arrayList;
            parcel.readList(arrayList, Integer.class.getClassLoader());
            this.f121722f = parcel.readInt() == 1;
            this.f121723g = parcel.readLong();
            this.f121724h = parcel.readInt() == 1;
        }
    }
}
