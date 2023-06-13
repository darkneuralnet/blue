package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.configs.DeviceVerificationEndpointConfig;
import co.bird.android.model.wire.configs.VerificationMethod;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002J(\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\r0\fH\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Ll21;", "", "", "b", "action", "", DateTokenConverter.CONVERTER_KEY, "siteKey", "e", "token", "f", "c", "", "", "Lkotlin/Pair;", C17296a.f69688o, "Lgl;", "Lgl;", "appPreference", "LTq4;", "LTq4;", "reactiveConfig", "", "Ljava/util/Map;", "verificationMap", "<init>", "(Lgl;LTq4;)V", "device-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceCheckDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceCheckDelegate.kt\nco/bird/android/manager/devicecheck/DeviceCheckDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n1747#2,3:122\n766#2:125\n857#2:126\n1726#2,3:127\n858#2:130\n1855#2:131\n1855#2,2:132\n1856#2:134\n1747#2,3:135\n1747#2,3:138\n1747#2,3:141\n*S KotlinDebug\n*F\n+ 1 DeviceCheckDelegate.kt\nco/bird/android/manager/devicecheck/DeviceCheckDelegate\n*L\n41#1:122,3\n44#1:125\n44#1:126\n44#1:127,3\n44#1:130\n45#1:131\n47#1:132,2\n45#1:134\n87#1:135,3\n97#1:138,3\n107#1:141,3\n*E\n"})
/* renamed from: l21  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44258l21 {

    /* renamed from: d */
    public static final C25588a f95372d = new C25588a(null);

    /* renamed from: a */
    public final C22454gl f95373a;

    /* renamed from: b */
    public final C36207Tq4 f95374b;

    /* renamed from: c */
    public final Map<String, String> f95375c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, m28432d2 = {"Ll21$a;", "", "", "BIRD_PUSH_TOKEN", "Ljava/lang/String;", "FIREBASE_APPCHECK", "KEY_ACTION", "KEY_APP_CHECK_TOKEN", "KEY_PLATFORM", "KEY_RECAPTCHA_ENTERPRISE_ACTION", "KEY_RECAPTCHA_ENTERPRISE_SITE_KEY", "KEY_RECAPTCHA_ENTERPRISE_TOKEN", "KEY_SITE_KEY", "KEY_VALUE", "RECAPTCHA_ENTERPRISE", "VALUE_PLATFORM", "<init>", "()V", "device-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: l21$a */
    /* loaded from: classes4.dex */
    public static final class C25588a {
        public /* synthetic */ C25588a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C25588a() {
        }
    }

    public C44258l21(C22454gl appPreference, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f95373a = appPreference;
        this.f95374b = reactiveConfig;
        this.f95375c = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0102 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, List<Pair<String, String>>> m28015a() {
        boolean z;
        boolean z2;
        Map<String, DeviceVerificationEndpointConfig> endpoints;
        boolean z3;
        Map<String, DeviceVerificationEndpointConfig> endpoints2;
        boolean z4;
        List listOfNotNull;
        Collection<DeviceVerificationEndpointConfig> values;
        Collection<DeviceVerificationEndpointConfig> collection;
        boolean z5;
        boolean z6;
        boolean z7;
        List listOfNotNull2;
        Collection<DeviceVerificationEndpointConfig> values2;
        Collection<DeviceVerificationEndpointConfig> collection2;
        boolean z8;
        boolean z9;
        boolean z10;
        List listOfNotNull3;
        Collection<DeviceVerificationEndpointConfig> values3;
        boolean z11;
        boolean z12;
        boolean z13;
        Map<String, List<Pair<String, String>>> emptyMap;
        Boolean bool = (Boolean) this.f95374b.m82601h8().getValue().getTweak("enableExcludeDeviceCheckTokenValue").m86599e();
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (z) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, DeviceVerificationEndpointConfig> endpoints3 = this.f95374b.m82623f8().m73665a().getSecurityConfig().getDeviceVerificationConfig().getEndpoints();
        if (endpoints3 != null && (values3 = endpoints3.values()) != null) {
            Collection<DeviceVerificationEndpointConfig> collection3 = values3;
            if (!collection3.isEmpty()) {
                for (DeviceVerificationEndpointConfig deviceVerificationEndpointConfig : collection3) {
                    if (deviceVerificationEndpointConfig.getEnabled()) {
                        Set<VerificationMethod> verificationMethods = deviceVerificationEndpointConfig.getVerificationMethods();
                        if (verificationMethods != null && verificationMethods.contains(VerificationMethod.BIRD_PUSH_TOKEN)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            z11 = true;
                            continue;
                            if (z11) {
                                z12 = true;
                                break;
                            }
                        }
                    }
                    z11 = false;
                    continue;
                    if (z11) {
                    }
                }
            }
            z12 = false;
            if (z12) {
                z2 = true;
                if (z2) {
                    listOfNotNull3 = CollectionsKt__CollectionsKt.listOfNotNull(new Pair("value", this.f95373a.m37587p0()));
                    linkedHashMap.put("bird_push_token", listOfNotNull3);
                }
                endpoints = this.f95374b.m82623f8().m73665a().getSecurityConfig().getDeviceVerificationConfig().getEndpoints();
                if (endpoints != null && (values2 = endpoints.values()) != null) {
                    collection2 = values2;
                    if (!collection2.isEmpty()) {
                        for (DeviceVerificationEndpointConfig deviceVerificationEndpointConfig2 : collection2) {
                            if (deviceVerificationEndpointConfig2.getEnabled()) {
                                Set<VerificationMethod> verificationMethods2 = deviceVerificationEndpointConfig2.getVerificationMethods();
                                if (verificationMethods2 != null && verificationMethods2.contains(VerificationMethod.FIREBASE_APPCHECK)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    z8 = true;
                                    continue;
                                    if (z8) {
                                        z9 = true;
                                        break;
                                    }
                                }
                            }
                            z8 = false;
                            continue;
                            if (z8) {
                            }
                        }
                    }
                    z9 = false;
                    if (z9) {
                        z3 = true;
                        if (z3) {
                            listOfNotNull2 = CollectionsKt__CollectionsKt.listOfNotNull(new Pair("value", this.f95375c.get("key_app_check_token")));
                            linkedHashMap.put("firebase_appcheck", listOfNotNull2);
                        }
                        endpoints2 = this.f95374b.m82623f8().m73665a().getSecurityConfig().getDeviceVerificationConfig().getEndpoints();
                        if (endpoints2 != null && (values = endpoints2.values()) != null) {
                            collection = values;
                            if (!collection.isEmpty()) {
                                for (DeviceVerificationEndpointConfig deviceVerificationEndpointConfig3 : collection) {
                                    if (deviceVerificationEndpointConfig3.getEnabled()) {
                                        Set<VerificationMethod> verificationMethods3 = deviceVerificationEndpointConfig3.getVerificationMethods();
                                        if (verificationMethods3 != null && verificationMethods3.contains(VerificationMethod.RECAPTCHA_ENTERPRISE)) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (z7) {
                                            z5 = true;
                                            continue;
                                            if (z5) {
                                                z6 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z5 = false;
                                    continue;
                                    if (z5) {
                                    }
                                }
                            }
                            z6 = false;
                            if (z6) {
                                z4 = true;
                                if (z4) {
                                    listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Pair[]{new Pair("value", this.f95375c.get("key_recaptcha_enterprise_token")), new Pair("action", this.f95375c.get("key_recaptcha_enterprise_action")), new Pair("site_key", this.f95375c.get("key_recaptcha_enterprise_site_key")), new Pair("platform", "android")});
                                    linkedHashMap.put("recaptcha_enterprise", listOfNotNull);
                                }
                                return linkedHashMap;
                            }
                        }
                        z4 = false;
                        if (z4) {
                        }
                        return linkedHashMap;
                    }
                }
                z3 = false;
                if (z3) {
                }
                endpoints2 = this.f95374b.m82623f8().m73665a().getSecurityConfig().getDeviceVerificationConfig().getEndpoints();
                if (endpoints2 != null) {
                    collection = values;
                    if (!collection.isEmpty()) {
                    }
                    z6 = false;
                    if (z6) {
                    }
                }
                z4 = false;
                if (z4) {
                }
                return linkedHashMap;
            }
        }
        z2 = false;
        if (z2) {
        }
        endpoints = this.f95374b.m82623f8().m73665a().getSecurityConfig().getDeviceVerificationConfig().getEndpoints();
        if (endpoints != null) {
            collection2 = values2;
            if (!collection2.isEmpty()) {
            }
            z9 = false;
            if (z9) {
            }
        }
        z3 = false;
        if (z3) {
        }
        endpoints2 = this.f95374b.m82623f8().m73665a().getSecurityConfig().getDeviceVerificationConfig().getEndpoints();
        if (endpoints2 != null) {
        }
        z4 = false;
        if (z4) {
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public final String m28014b() {
        boolean z;
        boolean z2;
        boolean z3;
        Map<String, List<Pair<String, String>>> m28015a = m28015a();
        Collection<List<Pair<String, String>>> values = m28015a.values();
        boolean z4 = false;
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                if (!((List) it.next()).isEmpty()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Set<Map.Entry<String, List<Pair<String, String>>>> entrySet = m28015a.entrySet();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : entrySet) {
            List<Pair> list = (List) ((Map.Entry) obj).getValue();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Pair pair : list) {
                    if (pair.getSecond() != null) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (!z2) {
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = true;
            if (z3) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            String str = (String) entry.getKey();
            JSONObject jSONObject2 = new JSONObject();
            for (Pair pair2 : (List) entry.getValue()) {
                jSONObject2.put((String) pair2.component1(), (String) pair2.component2());
            }
            jSONObject.put(str, jSONObject2);
            z4 = true;
        }
        if (!z4) {
            return null;
        }
        return jSONObject.toString();
    }

    /* renamed from: c */
    public final void m28013c(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f95375c.put("key_app_check_token", token);
    }

    /* renamed from: d */
    public final void m28012d(String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f95375c.put("key_recaptcha_enterprise_action", action);
    }

    /* renamed from: e */
    public final void m28011e(String str) {
        this.f95375c.put("key_recaptcha_enterprise_site_key", str);
    }

    /* renamed from: f */
    public final void m28010f(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f95375c.put("key_recaptcha_enterprise_token", token);
    }
}
