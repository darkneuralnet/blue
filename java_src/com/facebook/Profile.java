package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.AccessToken;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.Scopes;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C52364yi6;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 ,2\u00020\u0001:\u0001\u0011BE\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0010\u0012\b\u0010%\u001a\u0004\u0018\u00010!¢\u0006\u0004\b&\u0010'B\u0011\b\u0017\u0012\u0006\u0010(\u001a\u00020\b¢\u0006\u0004\b&\u0010)B\u0011\b\u0012\u0012\u0006\u0010*\u001a\u00020\u000b¢\u0006\u0004\b&\u0010+J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010 \u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u0019\u0010%\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$¨\u0006-"}, m28432d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Lorg/json/JSONObject;", "g", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "c", "getFirstName", "firstName", DateTokenConverter.CONVERTER_KEY, "getMiddleName", "middleName", "e", "getLastName", "lastName", "f", "name", "Landroid/net/Uri;", "Landroid/net/Uri;", "getLinkUri", "()Landroid/net/Uri;", "linkUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "jsonObject", "(Lorg/json/JSONObject;)V", Stripe3ds2AuthParams.FIELD_SOURCE, "(Landroid/os/Parcel;)V", "i", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class Profile implements Parcelable {
    @JvmField
    public static final Parcelable.Creator<Profile> CREATOR;

    /* renamed from: h */
    public static final String f69417h;

    /* renamed from: i */
    public static final C17214b f69418i = new C17214b(null);

    /* renamed from: b */
    public final String f69419b;

    /* renamed from: c */
    public final String f69420c;

    /* renamed from: d */
    public final String f69421d;

    /* renamed from: e */
    public final String f69422e;

    /* renamed from: f */
    public final String f69423f;

    /* renamed from: g */
    public final Uri f69424g;

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"com/facebook/Profile$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/Profile;", "Landroid/os/Parcel;", Stripe3ds2AuthParams.FIELD_SOURCE, C17296a.f69688o, "", "size", "", "b", "(I)[Lcom/facebook/Profile;", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.Profile$a */
    /* loaded from: classes5.dex */
    public static final class C17213a implements Parcelable.Creator<Profile> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Profile createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Profile(source, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Profile[] newArray(int i) {
            return new Profile[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0016"}, m28432d2 = {"Lcom/facebook/Profile$b;", "", "Lcom/facebook/Profile;", "b", Scopes.PROFILE, "", "c", C17296a.f69688o, "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "FIRST_NAME_KEY", "Ljava/lang/String;", "ID_KEY", "LAST_NAME_KEY", "LINK_URI_KEY", "MIDDLE_NAME_KEY", "NAME_KEY", "TAG", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.Profile$b */
    /* loaded from: classes5.dex */
    public static final class C17214b {

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\t"}, m28432d2 = {"com/facebook/Profile$b$a", "Lyi6$a;", "Lorg/json/JSONObject;", "userInfo", "", C17296a.f69688o, "Lcom/facebook/FacebookException;", "error", "b", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: com.facebook.Profile$b$a */
        /* loaded from: classes5.dex */
        public static final class C17215a implements C52364yi6.InterfaceC30682a {
            @Override // p000.C52364yi6.InterfaceC30682a
            /* renamed from: a */
            public void mo2799a(JSONObject jSONObject) {
                String str;
                Uri uri = null;
                if (jSONObject != null) {
                    str = jSONObject.optString("id");
                } else {
                    str = null;
                }
                if (str == null) {
                    Log.w(Profile.f69417h, "No user ID returned on Me request");
                    return;
                }
                String optString = jSONObject.optString("link");
                String optString2 = jSONObject.optString("first_name");
                String optString3 = jSONObject.optString("middle_name");
                String optString4 = jSONObject.optString("last_name");
                String optString5 = jSONObject.optString("name");
                if (optString != null) {
                    uri = Uri.parse(optString);
                }
                Profile.f69418i.m52754c(new Profile(str, optString2, optString3, optString4, optString5, uri));
            }

            @Override // p000.C52364yi6.InterfaceC30682a
            /* renamed from: b */
            public void mo2798b(FacebookException facebookException) {
                String str = Profile.f69417h;
                Log.e(str, "Got unexpected exception: " + facebookException);
            }
        }

        private C17214b() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void m52756a() {
            AccessToken.C17188c c17188c = AccessToken.f69314q;
            AccessToken m52897e = c17188c.m52897e();
            if (m52897e != null) {
                if (!c17188c.m52895g()) {
                    m52754c(null);
                } else {
                    C52364yi6.m2803y(m52897e.m52911m(), new C17215a());
                }
            }
        }

        @JvmStatic
        /* renamed from: b */
        public final Profile m52755b() {
            return A74.f173e.m116079a().m116085c();
        }

        @JvmStatic
        /* renamed from: c */
        public final void m52754c(Profile profile) {
            A74.f173e.m116079a().m116081g(profile);
        }

        public /* synthetic */ C17214b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = Profile.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "Profile::class.java.simpleName");
        f69417h = simpleName;
        CREATOR = new C17213a();
    }

    public /* synthetic */ Profile(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m52763b() {
        f69418i.m52756a();
    }

    @JvmStatic
    /* renamed from: c */
    public static final Profile m52762c() {
        return f69418i.m52755b();
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m52760e(Profile profile) {
        f69418i.m52754c(profile);
    }

    /* renamed from: d */
    public final String m52761d() {
        return this.f69423f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.f69419b;
        if (((str5 == null && ((Profile) obj).f69419b == null) || Intrinsics.areEqual(str5, ((Profile) obj).f69419b)) && ((((str = this.f69420c) == null && ((Profile) obj).f69420c == null) || Intrinsics.areEqual(str, ((Profile) obj).f69420c)) && ((((str2 = this.f69421d) == null && ((Profile) obj).f69421d == null) || Intrinsics.areEqual(str2, ((Profile) obj).f69421d)) && ((((str3 = this.f69422e) == null && ((Profile) obj).f69422e == null) || Intrinsics.areEqual(str3, ((Profile) obj).f69422e)) && ((((str4 = this.f69423f) == null && ((Profile) obj).f69423f == null) || Intrinsics.areEqual(str4, ((Profile) obj).f69423f)) && (((uri = this.f69424g) == null && ((Profile) obj).f69424g == null) || Intrinsics.areEqual(uri, ((Profile) obj).f69424g))))))) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final JSONObject m52759g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f69419b);
            jSONObject.put("first_name", this.f69420c);
            jSONObject.put("middle_name", this.f69421d);
            jSONObject.put("last_name", this.f69422e);
            jSONObject.put("name", this.f69423f);
            Uri uri = this.f69424g;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int hashCode() {
        int i;
        String str = this.f69419b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i2 = 527 + i;
        String str2 = this.f69420c;
        if (str2 != null) {
            i2 = (i2 * 31) + str2.hashCode();
        }
        String str3 = this.f69421d;
        if (str3 != null) {
            i2 = (i2 * 31) + str3.hashCode();
        }
        String str4 = this.f69422e;
        if (str4 != null) {
            i2 = (i2 * 31) + str4.hashCode();
        }
        String str5 = this.f69423f;
        if (str5 != null) {
            i2 = (i2 * 31) + str5.hashCode();
        }
        Uri uri = this.f69424g;
        if (uri != null) {
            return (i2 * 31) + uri.hashCode();
        }
        return i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        String str;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69419b);
        dest.writeString(this.f69420c);
        dest.writeString(this.f69421d);
        dest.writeString(this.f69422e);
        dest.writeString(this.f69423f);
        Uri uri = this.f69424g;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        dest.writeString(str);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        C48817sj6.m13764n(str, "id");
        this.f69419b = str;
        this.f69420c = str2;
        this.f69421d = str3;
        this.f69422e = str4;
        this.f69423f = str5;
        this.f69424g = uri;
    }

    public Profile(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f69419b = jsonObject.optString("id", null);
        this.f69420c = jsonObject.optString("first_name", null);
        this.f69421d = jsonObject.optString("middle_name", null);
        this.f69422e = jsonObject.optString("last_name", null);
        this.f69423f = jsonObject.optString("name", null);
        String optString = jsonObject.optString("link_uri", null);
        this.f69424g = optString != null ? Uri.parse(optString) : null;
    }

    public Profile(Parcel parcel) {
        this.f69419b = parcel.readString();
        this.f69420c = parcel.readString();
        this.f69421d = parcel.readString();
        this.f69422e = parcel.readString();
        this.f69423f = parcel.readString();
        String readString = parcel.readString();
        this.f69424g = readString == null ? null : Uri.parse(readString);
    }
}
