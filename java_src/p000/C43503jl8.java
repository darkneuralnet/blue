package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.File;
import java.io.IOException;
/* renamed from: jl8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43503jl8 {

    /* renamed from: a */
    public static final VF8 f93302a;

    /* renamed from: b */
    public static final AbstractC50453vU8 f93303b;

    static {
        C44390lF8 m80129D = VF8.m80129D();
        m80129D.m27604q("");
        f93302a = (VF8) m80129D.mo42381i();
        f93303b = AbstractC50453vU8.m8604u("/m/0jbk");
    }

    /* renamed from: a */
    public static C49842uS7 m29972a(C43089j38 c43089j38) {
        C40948fS7 m10263E = C49842uS7.m10263E();
        m10263E.m41306r(c43089j38);
        C41091fh8 m11911D = C49392th8.m11911D();
        m11911D.m41016q(2);
        m10263E.m41305t(m11911D);
        return (C49842uS7) m10263E.mo42381i();
    }

    /* renamed from: b */
    public static C49842uS7 m29971b(C43089j38 c43089j38) {
        C40948fS7 m10263E = C49842uS7.m10263E();
        m10263E.m41306r(c43089j38);
        C41091fh8 m11911D = C49392th8.m11911D();
        m11911D.m41017p(true);
        m11911D.m41016q(1);
        m10263E.m41305t(m11911D);
        return (C49842uS7) m10263E.mo42381i();
    }

    /* renamed from: c */
    public static C43089j38 m29970c(Context context, boolean z, C45995nx8 c45995nx8, VF8 vf8) {
        C34860Nw7 m93186E = C34860Nw7.m93186E();
        C43089j38 m21843D = C46064o48.m21843D();
        m21843D.m31206q(m29963j(m29961l(context.getAssets(), c45995nx8), vf8, z, m93186E, 0));
        String m29967f = m29967f(context);
        if (m29967f != null) {
            m21843D.m31204t(m29967f);
            m21843D.m31213A(m29967f);
        }
        return m21843D;
    }

    /* renamed from: d */
    public static C43089j38 m29969d(Context context, boolean z, C45995nx8 c45995nx8, VF8 vf8, long j, C41250fx7 c41250fx7) {
        FF7 m29961l = m29961l(context.getAssets(), c45995nx8);
        String m29967f = m29967f(context);
        int m29964i = m29964i(z);
        C43089j38 m21843D = C46064o48.m21843D();
        C44908m78 m114340D = B78.m114340D();
        C46896pU7 m36252D = C42170hW7.m36252D();
        CU7 m83508D = TV7.m83508D();
        m83508D.m112199p("MobileObjectLocalizerV3_1TfLiteClient");
        m83508D.m112198q(300000L);
        m36252D.m19213p(m83508D);
        m114340D.m26308p((C42170hW7) m36252D.mo42381i());
        m21843D.m31210D((B78) m114340D.mo42381i());
        if (m29967f != null) {
            m21843D.m31204t(m29967f);
            m21843D.m31213A(m29967f);
        }
        if (c41250fx7 != null) {
            m21843D.m31205r(c41250fx7);
        }
        m21843D.m31212B(true);
        m21843D.m31209G(KM8.m98958E());
        C46249oO7 m85524D = SO7.m85524D();
        m85524D.m21227r(false);
        m85524D.m21228q(m29964i);
        m85524D.m21226t(0.2f);
        m85524D.m21229p(0.0f);
        m85524D.m21230A(3);
        m21843D.m31211C(m85524D);
        m21843D.m31206q(m29963j(m29961l, vf8, z, C34860Nw7.m93186E(), 0));
        return m21843D;
    }

    /* renamed from: e */
    public static VF8 m29968e(C45995nx8 c45995nx8) {
        C34860Nw7 m93186E = C34860Nw7.m93186E();
        C46578ow8 m111226D = C32287Cw8.m111226D();
        m111226D.m20251q(c45995nx8);
        C44390lF8 m80129D = VF8.m80129D();
        m80129D.m27605p(f93303b);
        m80129D.m27603r(m93186E);
        m80129D.m27608B((C32287Cw8) m111226D.mo42381i());
        return (VF8) m80129D.mo42381i();
    }

    /* renamed from: f */
    public static String m29967f(Context context) {
        File file = new File(context.getCodeCacheDir(), "odt/v1");
        if (!file.mkdirs() && !file.exists()) {
            Log.e("MlKitObjectsConfigs", "Unable to create accelerator directory ".concat(file.toString()));
            return null;
        }
        return file.toString();
    }

    /* renamed from: g */
    public static String m29966g() {
        return "mlkit_odt_default_classifier/labeler_with_validation.tflite";
    }

    /* renamed from: h */
    public static String m29965h() {
        return "mlkit_odt_localizer/localizer_with_validation.tflite";
    }

    /* renamed from: i */
    public static int m29964i(boolean z) {
        return z ? 5 : 1;
    }

    /* renamed from: j */
    public static C40014ds7 m29963j(FF7 ff7, VF8 vf8, boolean z, C34860Nw7 c34860Nw7, int i) {
        C40014ds7 m79320D = C36696Vs7.m79320D();
        m79320D.m43558t(true);
        DF7 m100775E = JF7.m100775E();
        m100775E.m110636A("MobileSSDTfLiteClient");
        m100775E.m110635q(true);
        m100775E.m110633t(ff7);
        m100775E.m110634r(c34860Nw7);
        m79320D.m43559r((JF7) m100775E.mo42381i());
        m79320D.m43560q(vf8);
        C34609Mu8 m72307D = C37651Zu8.m72307D();
        C37174Xt8 m24718D = C45372mu8.m24718D();
        m24718D.m76154p("/m/0bl9f");
        m24718D.m76153q(0.46f);
        m72307D.m94581p(m24718D);
        m79320D.m43561p(m72307D);
        m79320D.m43562D(!z);
        m79320D.m43564B(m29964i(z));
        m79320D.m43565A(0.6f);
        m79320D.m43563C(0);
        return m79320D;
    }

    /* renamed from: k */
    public static AbstractC44175kt7 m29962k(AssetManager assetManager, String str, String str2) throws IOException {
        return AbstractC44175kt7.m28225F(assetManager.open("mlkit_odt_localizer/".concat(str2)));
    }

    /* renamed from: l */
    public static FF7 m29961l(AssetManager assetManager, C45995nx8 c45995nx8) {
        try {
            GF7 m104096D = HF7.m104096D();
            m104096D.m105583p(c45995nx8.m22103D());
            m104096D.m105581r(c45995nx8.m22101F());
            m104096D.m105582q(c45995nx8.m22102E());
            EF7 m107375D = FF7.m107375D();
            m107375D.m109269r((HF7) m104096D.mo42381i());
            m107375D.m109270q(m29962k(assetManager, "mlkit_odt_localizer", "mobile_object_localizer_labelmap"));
            m107375D.m109271p(m29962k(assetManager, "mlkit_odt_localizer", "mobile_object_localizer_3_1_anchors.pb"));
            return (FF7) m107375D.mo42381i();
        } catch (IOException e) {
            Log.e("MlKitObjectsConfigs", "Failed to create detector client options: ", e);
            return FF7.m107373F();
        }
    }
}
