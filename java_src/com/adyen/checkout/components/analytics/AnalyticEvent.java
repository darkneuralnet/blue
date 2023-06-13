package com.adyen.checkout.components.analytics;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.URLUtil;
import com.adyen.checkout.core.exception.CheckoutException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
/* loaded from: classes.dex */
public class AnalyticEvent implements Parcelable {
    public static final Parcelable.Creator<AnalyticEvent> CREATOR = new C16806a();

    /* renamed from: d */
    public final String f68393d;

    /* renamed from: e */
    public final String f68394e;

    /* renamed from: f */
    public final String f68395f;

    /* renamed from: h */
    public final String f68397h;

    /* renamed from: b */
    public final String f68391b = "1";

    /* renamed from: c */
    public final String f68392c = "4.1.1";

    /* renamed from: g */
    public final String f68396g = "android";

    /* renamed from: i */
    public final String f68398i = Build.BRAND;

    /* renamed from: j */
    public final String f68399j = Build.MODEL;

    /* renamed from: k */
    public final String f68400k = String.valueOf(Build.VERSION.SDK_INT);

    /* renamed from: com.adyen.checkout.components.analytics.AnalyticEvent$a */
    /* loaded from: classes.dex */
    public static class C16806a implements Parcelable.Creator<AnalyticEvent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AnalyticEvent createFromParcel(Parcel parcel) {
            return new AnalyticEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AnalyticEvent[] newArray(int i) {
            return new AnalyticEvent[i];
        }
    }

    /* renamed from: com.adyen.checkout.components.analytics.AnalyticEvent$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C16807b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f68401a;

        static {
            int[] iArr = new int[EnumC16808c.values().length];
            f68401a = iArr;
            try {
                iArr[EnumC16808c.DROPIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68401a[EnumC16808c.COMPONENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.adyen.checkout.components.analytics.AnalyticEvent$c */
    /* loaded from: classes.dex */
    public enum EnumC16808c {
        DROPIN,
        COMPONENT
    }

    public AnalyticEvent(Parcel parcel) {
        this.f68393d = parcel.readString();
        this.f68394e = parcel.readString();
        this.f68395f = parcel.readString();
        this.f68397h = parcel.readString();
    }

    /* renamed from: a */
    public static AnalyticEvent m53601a(Context context, EnumC16808c enumC16808c, String str, Locale locale) {
        String str2;
        int i = C16807b.f68401a[enumC16808c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str2 = "components";
            } else {
                throw new CheckoutException("Unexpected flavor - " + enumC16808c.name());
            }
        } else {
            str2 = "dropin";
        }
        return new AnalyticEvent(context.getPackageName(), str2, str, C32740Ev2.m108213b(locale));
    }

    /* renamed from: b */
    public URL m53600b(String str) throws MalformedURLException {
        if (URLUtil.isValidUrl(str)) {
            Uri parse = Uri.parse(str);
            return new URL(new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).appendQueryParameter("payload_version", "1").appendQueryParameter("version", "4.1.1").appendQueryParameter("flavor", this.f68393d).appendQueryParameter("component", this.f68394e).appendQueryParameter("locale", this.f68395f).appendQueryParameter("platform", "android").appendQueryParameter("referer", this.f68397h).appendQueryParameter("device_brand", this.f68398i).appendQueryParameter("device_model", this.f68399j).appendQueryParameter("system_version", this.f68400k).build().toString());
        }
        throw new MalformedURLException("Invalid URL format - " + str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68393d);
        parcel.writeString(this.f68394e);
        parcel.writeString(this.f68395f);
        parcel.writeString(this.f68397h);
    }

    public AnalyticEvent(String str, String str2, String str3, String str4) {
        this.f68397h = str;
        this.f68395f = str4;
        this.f68393d = str2;
        this.f68394e = str3;
    }
}
