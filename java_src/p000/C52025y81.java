package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.stripe.android.model.Stripe3ds2AuthParams;
/* renamed from: y81  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52025y81 {

    /* renamed from: a */
    public final DynamicLinkData f118800a;

    /* renamed from: b */
    public final Bundle f118801b;

    public C52025y81(DynamicLinkData dynamicLinkData) {
        this.f118800a = dynamicLinkData;
        this.f118801b = m4081b(dynamicLinkData);
    }

    /* renamed from: a */
    public static void m4082a(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (!TextUtils.isEmpty(string)) {
            bundle2.putString(str2, string);
        }
    }

    /* renamed from: b */
    public static Bundle m4081b(DynamicLinkData dynamicLinkData) {
        Bundle bundle = new Bundle();
        if (dynamicLinkData != null && dynamicLinkData.m47306E() != null) {
            Bundle bundle2 = dynamicLinkData.m47306E().getBundle("scionData");
            if (bundle2 == null) {
                return bundle;
            }
            Bundle bundle3 = bundle2.getBundle("_cmp");
            if (bundle3 == null) {
                return bundle;
            }
            m4082a("medium", "utm_medium", bundle3, bundle);
            m4082a(Stripe3ds2AuthParams.FIELD_SOURCE, "utm_source", bundle3, bundle);
            m4082a("campaign", "utm_campaign", bundle3, bundle);
        }
        return bundle;
    }
}
