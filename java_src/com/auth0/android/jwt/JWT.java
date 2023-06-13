package com.auth0.android.jwt;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;
/* loaded from: classes.dex */
public class JWT implements Parcelable {
    public static final Parcelable.Creator<JWT> CREATOR = new C16965a();

    /* renamed from: b */
    public final String f68657b;

    /* renamed from: c */
    public Map<String, String> f68658c;

    /* renamed from: d */
    public C45829nh2 f68659d;

    /* renamed from: e */
    public String f68660e;

    /* renamed from: com.auth0.android.jwt.JWT$a */
    /* loaded from: classes.dex */
    public static class C16965a implements Parcelable.Creator<JWT> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public JWT createFromParcel(Parcel parcel) {
            return new JWT(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public JWT[] newArray(int i) {
            return new JWT[i];
        }
    }

    /* renamed from: com.auth0.android.jwt.JWT$b */
    /* loaded from: classes.dex */
    public class C16966b extends C32798Fb6<Map<String, String>> {
        public C16966b() {
        }
    }

    public JWT(String str) {
        m53436b(str);
        this.f68657b = str;
    }

    /* renamed from: d */
    public static C46153oE1 m53434d() {
        return new C46746pE1().m19804f(C45829nh2.class, new JWTDeserializer()).m19808b();
    }

    /* renamed from: a */
    public final String m53437a(String str) {
        try {
            return new String(Base64.decode(str, 11), Charset.defaultCharset());
        } catch (IllegalArgumentException e) {
            throw new DecodeException("Received bytes didn't correspond to a valid Base64 encoded string.", e);
        }
    }

    /* renamed from: b */
    public final void m53436b(String str) {
        String[] m53432g = m53432g(str);
        this.f68658c = (Map) m53433e(m53437a(m53432g[0]), new C16966b().getType());
        this.f68659d = (C45829nh2) m53433e(m53437a(m53432g[1]), C45829nh2.class);
        this.f68660e = m53432g[2];
    }

    /* renamed from: c */
    public Date m53435c() {
        return this.f68659d.f100350c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final <T> T m53433e(String str, Type type) {
        try {
            return (T) m53434d().m21554o(str, type);
        } catch (Exception e) {
            throw new DecodeException("The token's payload had an invalid JSON format.", e);
        }
    }

    /* renamed from: g */
    public final String[] m53432g(String str) {
        String[] split = str.split("\\.");
        if (split.length == 2 && str.endsWith(InstructionFileId.DOT)) {
            split = new String[]{split[0], split[1], ""};
        }
        if (split.length == 3) {
            return split;
        }
        throw new DecodeException(String.format("The token was expected to have 3 parts, but got %s.", Integer.valueOf(split.length)));
    }

    public String toString() {
        return this.f68657b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68657b);
    }
}
