package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
@KeepForSdk
/* renamed from: my3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45407my3 {
    @KeepForSdk

    /* renamed from: a */
    public static final Feature[] f99159a = new Feature[0];
    @KeepForSdk

    /* renamed from: b */
    public static final Feature f99160b;
    @KeepForSdk

    /* renamed from: c */
    public static final Feature f99161c;
    @KeepForSdk

    /* renamed from: d */
    public static final Feature f99162d;
    @KeepForSdk

    /* renamed from: e */
    public static final Feature f99163e;
    @KeepForSdk

    /* renamed from: f */
    public static final Feature f99164f;
    @KeepForSdk

    /* renamed from: g */
    public static final Feature f99165g;
    @KeepForSdk

    /* renamed from: h */
    public static final Feature f99166h;
    @KeepForSdk

    /* renamed from: i */
    public static final Feature f99167i;
    @KeepForSdk

    /* renamed from: j */
    public static final Feature f99168j;
    @KeepForSdk

    /* renamed from: k */
    public static final Feature f99169k;
    @KeepForSdk

    /* renamed from: l */
    public static final Feature f99170l;
    @KeepForSdk

    /* renamed from: m */
    public static final Feature f99171m;
    @KeepForSdk

    /* renamed from: n */
    public static final Feature f99172n;
    @KeepForSdk

    /* renamed from: o */
    public static final Feature f99173o;
    @KeepForSdk

    /* renamed from: p */
    public static final Feature f99174p;
    @KeepForSdk

    /* renamed from: q */
    public static final Feature f99175q;
    @KeepForSdk

    /* renamed from: r */
    public static final Feature f99176r;
    @KeepForSdk

    /* renamed from: s */
    public static final Feature f99177s;
    @KeepForSdk

    /* renamed from: t */
    public static final Feature f99178t;
    @KeepForSdk

    /* renamed from: u */
    public static final Feature f99179u;
    @KeepForSdk

    /* renamed from: v */
    public static final Feature f99180v;

    /* renamed from: w */
    public static final AbstractC37434Yw7 f99181w;

    /* renamed from: x */
    public static final AbstractC37434Yw7 f99182x;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        f99160b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        f99161c = feature2;
        Feature feature3 = new Feature("vision.face", 1L);
        f99162d = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        f99163e = feature4;
        Feature feature5 = new Feature("vision.ocr", 1L);
        f99164f = feature5;
        f99165g = new Feature("mlkit.ocr.chinese", 1L);
        f99166h = new Feature("mlkit.ocr.common", 1L);
        f99167i = new Feature("mlkit.ocr.devanagari", 1L);
        f99168j = new Feature("mlkit.ocr.japanese", 1L);
        f99169k = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        f99170l = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        f99171m = feature7;
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        f99172n = feature8;
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        f99173o = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        f99174p = feature10;
        f99175q = new Feature("mlkit.image.caption", 1L);
        f99176r = new Feature("mlkit.docscan.detect", 1L);
        f99177s = new Feature("mlkit.docscan.crop", 1L);
        f99178t = new Feature("mlkit.docscan.enhance", 1L);
        f99179u = new Feature("mlkit.quality.aesthetic", 1L);
        f99180v = new Feature("mlkit.quality.technical", 1L);
        C43612jw7 c43612jw7 = new C43612jw7();
        c43612jw7.m29681a("barcode", feature);
        c43612jw7.m29681a("custom_ica", feature2);
        c43612jw7.m29681a("face", feature3);
        c43612jw7.m29681a("ica", feature4);
        c43612jw7.m29681a("ocr", feature5);
        c43612jw7.m29681a("langid", feature6);
        c43612jw7.m29681a("nlclassifier", feature7);
        c43612jw7.m29681a("tflite_dynamite", feature8);
        c43612jw7.m29681a("barcode_ui", feature9);
        c43612jw7.m29681a("smart_reply", feature10);
        f99181w = c43612jw7.m29680b();
        C43612jw7 c43612jw72 = new C43612jw7();
        c43612jw72.m29681a("com.google.android.gms.vision.barcode", feature);
        c43612jw72.m29681a("com.google.android.gms.vision.custom.ica", feature2);
        c43612jw72.m29681a("com.google.android.gms.vision.face", feature3);
        c43612jw72.m29681a("com.google.android.gms.vision.ica", feature4);
        c43612jw72.m29681a("com.google.android.gms.vision.ocr", feature5);
        c43612jw72.m29681a("com.google.android.gms.mlkit.langid", feature6);
        c43612jw72.m29681a("com.google.android.gms.mlkit.nlclassifier", feature7);
        c43612jw72.m29681a("com.google.android.gms.tflite_dynamite", feature8);
        c43612jw72.m29681a("com.google.android.gms.mlkit_smartreply", feature10);
        f99182x = c43612jw72.m29680b();
    }

    private C45407my3() {
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static boolean m24612a(Context context, List<String> list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            return m24611b(context, m24607f(f99182x, list));
        }
        try {
            for (String str : list) {
                DynamiteModule.m51591e(context, DynamiteModule.f70338b, str);
            }
            return true;
        } catch (DynamiteModule.LoadingException unused) {
            return false;
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static boolean m24611b(Context context, final Feature[] featureArr) {
        try {
            return ((ModuleAvailabilityResponse) Tasks.await(ModuleInstall.getClient(context).areModulesAvailable(new OptionalModuleApi() { // from class: u99
                @Override // com.google.android.gms.common.api.OptionalModuleApi
                public final Feature[] getOptionalFeatures() {
                    Feature[] featureArr2 = featureArr;
                    Feature[] featureArr3 = C45407my3.f99159a;
                    return featureArr2;
                }
            }).addOnFailureListener(C49946ud9.f112690a))).areModulesAvailable();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
            return false;
        }
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public static void m24610c(Context context, String str) {
        m24609d(context, AbstractC32268Cu7.m111360o(str));
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: d */
    public static void m24609d(Context context, List<String> list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            m24608e(context, m24607f(f99181w, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    @KeepForSdk
    /* renamed from: e */
    public static void m24608e(Context context, final Feature[] featureArr) {
        ModuleInstall.getClient(context).installModules(ModuleInstallRequest.newBuilder().addApi(new OptionalModuleApi() { // from class: Lh9
            @Override // com.google.android.gms.common.api.OptionalModuleApi
            public final Feature[] getOptionalFeatures() {
                Feature[] featureArr2 = featureArr;
                Feature[] featureArr3 = C45407my3.f99159a;
                return featureArr2;
            }
        }).build()).addOnFailureListener(Fl9.f10077a);
    }

    /* renamed from: f */
    public static Feature[] m24607f(Map map, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i = 0; i < list.size(); i++) {
            featureArr[i] = (Feature) Preconditions.checkNotNull((Feature) map.get(list.get(i)));
        }
        return featureArr;
    }
}
