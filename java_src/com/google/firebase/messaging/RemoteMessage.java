package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.C18354a;
import java.util.Map;
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C41237fw4();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public Bundle f74304b;

    /* renamed from: c */
    public Map<String, String> f74305c;

    /* renamed from: d */
    public C18353b f74306d;

    /* renamed from: com.google.firebase.messaging.RemoteMessage$b */
    /* loaded from: classes6.dex */
    public static class C18353b {

        /* renamed from: a */
        public final String f74307a;

        /* renamed from: b */
        public final String f74308b;

        /* renamed from: c */
        public final String[] f74309c;

        /* renamed from: d */
        public final String f74310d;

        /* renamed from: e */
        public final String f74311e;

        /* renamed from: f */
        public final String[] f74312f;

        /* renamed from: g */
        public final String f74313g;

        /* renamed from: h */
        public final String f74314h;

        /* renamed from: i */
        public final String f74315i;

        /* renamed from: j */
        public final String f74316j;

        /* renamed from: k */
        public final String f74317k;

        /* renamed from: l */
        public final String f74318l;

        /* renamed from: m */
        public final String f74319m;

        /* renamed from: n */
        public final Uri f74320n;

        /* renamed from: o */
        public final String f74321o;

        /* renamed from: p */
        public final Integer f74322p;

        /* renamed from: q */
        public final Integer f74323q;

        /* renamed from: r */
        public final Integer f74324r;

        /* renamed from: s */
        public final int[] f74325s;

        /* renamed from: t */
        public final Long f74326t;

        /* renamed from: u */
        public final boolean f74327u;

        /* renamed from: v */
        public final boolean f74328v;

        /* renamed from: w */
        public final boolean f74329w;

        /* renamed from: x */
        public final boolean f74330x;

        /* renamed from: y */
        public final boolean f74331y;

        /* renamed from: z */
        public final long[] f74332z;

        /* renamed from: b */
        public static String[] m47204b(C18357c c18357c, String str) {
            Object[] m47165g = c18357c.m47165g(str);
            if (m47165g == null) {
                return null;
            }
            String[] strArr = new String[m47165g.length];
            for (int i = 0; i < m47165g.length; i++) {
                strArr[i] = String.valueOf(m47165g[i]);
            }
            return strArr;
        }

        /* renamed from: a */
        public String m47205a() {
            return this.f74310d;
        }

        /* renamed from: c */
        public String m47203c() {
            return this.f74307a;
        }

        public C18353b(C18357c c18357c) {
            this.f74307a = c18357c.m47156p("gcm.n.title");
            this.f74308b = c18357c.m47164h("gcm.n.title");
            this.f74309c = m47204b(c18357c, "gcm.n.title");
            this.f74310d = c18357c.m47156p("gcm.n.body");
            this.f74311e = c18357c.m47164h("gcm.n.body");
            this.f74312f = m47204b(c18357c, "gcm.n.body");
            this.f74313g = c18357c.m47156p("gcm.n.icon");
            this.f74315i = c18357c.m47157o();
            this.f74316j = c18357c.m47156p("gcm.n.tag");
            this.f74317k = c18357c.m47156p("gcm.n.color");
            this.f74318l = c18357c.m47156p("gcm.n.click_action");
            this.f74319m = c18357c.m47156p("gcm.n.android_channel_id");
            this.f74320n = c18357c.m47166f();
            this.f74314h = c18357c.m47156p("gcm.n.image");
            this.f74321o = c18357c.m47156p("gcm.n.ticker");
            this.f74322p = c18357c.m47170b("gcm.n.notification_priority");
            this.f74323q = c18357c.m47170b("gcm.n.visibility");
            this.f74324r = c18357c.m47170b("gcm.n.notification_count");
            this.f74327u = c18357c.m47171a("gcm.n.sticky");
            this.f74328v = c18357c.m47171a("gcm.n.local_only");
            this.f74329w = c18357c.m47171a("gcm.n.default_sound");
            this.f74330x = c18357c.m47171a("gcm.n.default_vibrate_timings");
            this.f74331y = c18357c.m47171a("gcm.n.default_light_settings");
            this.f74326t = c18357c.m47162j("gcm.n.event_time");
            this.f74325s = c18357c.m47167e();
            this.f74332z = c18357c.m47155q();
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(m51605id = 2) Bundle bundle) {
        this.f74304b = bundle;
    }

    /* renamed from: E */
    public void m47210E(Intent intent) {
        intent.putExtras(this.f74304b);
    }

    @KeepForSdk
    /* renamed from: F */
    public Intent m47209F() {
        Intent intent = new Intent();
        intent.putExtras(this.f74304b);
        return intent;
    }

    /* renamed from: s */
    public Map<String, String> m47208s() {
        if (this.f74305c == null) {
            this.f74305c = C18354a.C18355a.m47201a(this.f74304b);
        }
        return this.f74305c;
    }

    /* renamed from: u */
    public C18353b m47207u() {
        if (this.f74306d == null && C18357c.m47152t(this.f74304b)) {
            this.f74306d = new C18353b(new C18357c(this.f74304b));
        }
        return this.f74306d;
    }

    /* renamed from: v */
    public String m47206v() {
        return this.f74304b.getString("google.to");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C41237fw4.m40429c(this, parcel, i);
    }
}
