package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
/* renamed from: pn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47074pn1 {

    /* renamed from: a */
    public final String f104078a;

    /* renamed from: b */
    public final String f104079b;

    /* renamed from: c */
    public final String f104080c;

    /* renamed from: d */
    public final String f104081d;

    /* renamed from: e */
    public final String f104082e;

    /* renamed from: f */
    public final String f104083f;

    /* renamed from: g */
    public final String f104084g;

    public C47074pn1(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f104079b = str;
        this.f104078a = str2;
        this.f104080c = str3;
        this.f104081d = str4;
        this.f104082e = str5;
        this.f104083f = str6;
        this.f104084g = str7;
    }

    /* renamed from: a */
    public static C47074pn1 m18707a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C47074pn1(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    /* renamed from: b */
    public String m18706b() {
        return this.f104078a;
    }

    /* renamed from: c */
    public String m18705c() {
        return this.f104079b;
    }

    /* renamed from: d */
    public String m18704d() {
        return this.f104082e;
    }

    /* renamed from: e */
    public String m18703e() {
        return this.f104084g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C47074pn1)) {
            return false;
        }
        C47074pn1 c47074pn1 = (C47074pn1) obj;
        if (!Objects.equal(this.f104079b, c47074pn1.f104079b) || !Objects.equal(this.f104078a, c47074pn1.f104078a) || !Objects.equal(this.f104080c, c47074pn1.f104080c) || !Objects.equal(this.f104081d, c47074pn1.f104081d) || !Objects.equal(this.f104082e, c47074pn1.f104082e) || !Objects.equal(this.f104083f, c47074pn1.f104083f) || !Objects.equal(this.f104084g, c47074pn1.f104084g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(this.f104079b, this.f104078a, this.f104080c, this.f104081d, this.f104082e, this.f104083f, this.f104084g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add(NamedConstantsKt.APPLICATION_ID, this.f104079b).add("apiKey", this.f104078a).add("databaseUrl", this.f104080c).add("gcmSenderId", this.f104082e).add("storageBucket", this.f104083f).add("projectId", this.f104084g).toString();
    }
}
