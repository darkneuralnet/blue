package p000;

import android.content.Context;
import android.util.Log;
import lib.android.paypal.com.magnessdk.InvalidInputException;
import p000.VF2;
/* renamed from: mL3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45032mL3 {
    /* renamed from: a */
    public static String m25820a(Context context) {
        return m25819b(context, new C45625nL3().m23958e(Y42.m75781a(context)));
    }

    /* renamed from: b */
    public static String m25819b(Context context, C45625nL3 c45625nL3) {
        if (context == null) {
            return "";
        }
        try {
            UF2 m81767g = UF2.m81767g();
            m81767g.m81766h(new VF2.C8588b(context).m80141n(WF2.BRAINTREE).m80144k(c45625nL3.m23959d()).m80142m(EnumC51736xf1.LIVE).m80143l(c45625nL3.m23961b()).m80145j());
            return m81767g.m81768f(context, c45625nL3.m23960c(), c45625nL3.m23962a()).m84127b();
        } catch (InvalidInputException e) {
            Log.e("Exception", "Error fetching client metadata ID. Contact Braintree Support for assistance.", e);
            return "";
        }
    }

    /* renamed from: c */
    public static String m25818c(Context context, String str) {
        return m25819b(context, new C45625nL3().m23958e(Y42.m75781a(context)).m23957f(str));
    }
}
