package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.InterfaceC12447ba;
/* renamed from: ca */
/* loaded from: classes6.dex */
public class C13600ca implements InterfaceC12447ba {

    /* renamed from: c */
    public static volatile InterfaceC12447ba f60919c;
    @VisibleForTesting

    /* renamed from: a */
    public final C22416gj f60920a;
    @VisibleForTesting

    /* renamed from: b */
    public final Map f60921b;

    /* renamed from: ca$a */
    /* loaded from: classes6.dex */
    public class C13601a implements InterfaceC12447ba.InterfaceC12448a {

        /* renamed from: a */
        public final /* synthetic */ String f60922a;

        public C13601a(String str) {
            this.f60922a = str;
        }
    }

    public C13600ca(C22416gj c22416gj) {
        Preconditions.checkNotNull(c22416gj);
        this.f60920a = c22416gj;
        this.f60921b = new ConcurrentHashMap();
    }

    @KeepForSdk
    /* renamed from: h */
    public static InterfaceC12447ba m61202h(C31722Am1 c31722Am1, Context context, InterfaceC42734iT5 interfaceC42734iT5) {
        Preconditions.checkNotNull(c31722Am1);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(interfaceC42734iT5);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f60919c == null) {
            synchronized (C13600ca.class) {
                if (f60919c == null) {
                    Bundle bundle = new Bundle(1);
                    if (c31722Am1.m115283t()) {
                        interfaceC42734iT5.mo33867a(GS0.class, ExecutorC38088af7.f50915b, C51476xC7.f117211a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", c31722Am1.m115284s());
                    }
                    f60919c = new C13600ca(C52032y88.m4047t(context, null, null, null, bundle).m4050q());
                }
            }
        }
        return f60919c;
    }

    /* renamed from: i */
    public static /* synthetic */ void m61201i(C51746xg1 c51746xg1) {
        boolean z = ((GS0) c51746xg1.m4893a()).f11941a;
        synchronized (C13600ca.class) {
            ((C13600ca) Preconditions.checkNotNull(f60919c)).f60920a.m37871i(z);
        }
    }

    @Override // p000.InterfaceC12447ba
    @KeepForSdk
    /* renamed from: a */
    public void mo61209a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C43302jQ7.m30635d(str) && C43302jQ7.m30637b(str2, bundle) && C43302jQ7.m30638a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f60920a.m37875e(str, str2, bundle);
        }
    }

    @Override // p000.InterfaceC12447ba
    @KeepForSdk
    /* renamed from: b */
    public void mo61208b(String str, String str2, Object obj) {
        if (!C43302jQ7.m30635d(str) || !C43302jQ7.m30634e(str, str2)) {
            return;
        }
        this.f60920a.m37872h(str, str2, obj);
    }

    @Override // p000.InterfaceC12447ba
    @KeepForSdk
    /* renamed from: c */
    public InterfaceC12447ba.InterfaceC12448a mo61207c(String str, InterfaceC12447ba.InterfaceC12449b interfaceC12449b) {
        Object obj;
        Preconditions.checkNotNull(interfaceC12449b);
        if (!C43302jQ7.m30635d(str) || m61200j(str)) {
            return null;
        }
        C22416gj c22416gj = this.f60920a;
        if ("fiam".equals(str)) {
            obj = new C68(c22416gj, interfaceC12449b);
        } else if ("clx".equals(str)) {
            obj = new C51220wm8(c22416gj, interfaceC12449b);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f60921b.put(str, obj);
        return new C13601a(str);
    }

    @Override // p000.InterfaceC12447ba
    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 != null && !C43302jQ7.m30637b(str2, bundle)) {
            return;
        }
        this.f60920a.m37879a(str, str2, bundle);
    }

    @Override // p000.InterfaceC12447ba
    @KeepForSdk
    /* renamed from: d */
    public int mo61206d(String str) {
        return this.f60920a.m37877c(str);
    }

    @Override // p000.InterfaceC12447ba
    @KeepForSdk
    /* renamed from: e */
    public List<InterfaceC12447ba.C12450c> mo61205e(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f60920a.m37878b(str, str2)) {
            NH8 nh8 = C43302jQ7.f92704a;
            Preconditions.checkNotNull(bundle);
            InterfaceC12447ba.C12450c c12450c = new InterfaceC12447ba.C12450c();
            c12450c.f57701a = (String) Preconditions.checkNotNull((String) C35302Pt8.m89461a(bundle, AnalyticsRequestV2.HEADER_ORIGIN, String.class, null));
            c12450c.f57702b = (String) Preconditions.checkNotNull((String) C35302Pt8.m89461a(bundle, "name", String.class, null));
            c12450c.f57703c = C35302Pt8.m89461a(bundle, "value", Object.class, null);
            c12450c.f57704d = (String) C35302Pt8.m89461a(bundle, "trigger_event_name", String.class, null);
            c12450c.f57705e = ((Long) C35302Pt8.m89461a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            c12450c.f57706f = (String) C35302Pt8.m89461a(bundle, "timed_out_event_name", String.class, null);
            c12450c.f57707g = (Bundle) C35302Pt8.m89461a(bundle, "timed_out_event_params", Bundle.class, null);
            c12450c.f57708h = (String) C35302Pt8.m89461a(bundle, "triggered_event_name", String.class, null);
            c12450c.f57709i = (Bundle) C35302Pt8.m89461a(bundle, "triggered_event_params", Bundle.class, null);
            c12450c.f57710j = ((Long) C35302Pt8.m89461a(bundle, "time_to_live", Long.class, 0L)).longValue();
            c12450c.f57711k = (String) C35302Pt8.m89461a(bundle, "expired_event_name", String.class, null);
            c12450c.f57712l = (Bundle) C35302Pt8.m89461a(bundle, "expired_event_params", Bundle.class, null);
            c12450c.f57714n = ((Boolean) C35302Pt8.m89461a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            c12450c.f57713m = ((Long) C35302Pt8.m89461a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            c12450c.f57715o = ((Long) C35302Pt8.m89461a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(c12450c);
        }
        return arrayList;
    }

    @Override // p000.InterfaceC12447ba
    @KeepForSdk
    /* renamed from: f */
    public void mo61204f(InterfaceC12447ba.C12450c c12450c) {
        String str;
        NH8 nh8 = C43302jQ7.f92704a;
        if (c12450c != null && (str = c12450c.f57701a) != null && !str.isEmpty()) {
            Object obj = c12450c.f57703c;
            if ((obj == null || C43195jE8.m30955a(obj) != null) && C43302jQ7.m30635d(str) && C43302jQ7.m30634e(str, c12450c.f57702b)) {
                String str2 = c12450c.f57711k;
                if (str2 == null || (C43302jQ7.m30637b(str2, c12450c.f57712l) && C43302jQ7.m30638a(str, c12450c.f57711k, c12450c.f57712l))) {
                    String str3 = c12450c.f57708h;
                    if (str3 == null || (C43302jQ7.m30637b(str3, c12450c.f57709i) && C43302jQ7.m30638a(str, c12450c.f57708h, c12450c.f57709i))) {
                        String str4 = c12450c.f57706f;
                        if (str4 == null || (C43302jQ7.m30637b(str4, c12450c.f57707g) && C43302jQ7.m30638a(str, c12450c.f57706f, c12450c.f57707g))) {
                            C22416gj c22416gj = this.f60920a;
                            Bundle bundle = new Bundle();
                            String str5 = c12450c.f57701a;
                            if (str5 != null) {
                                bundle.putString(AnalyticsRequestV2.HEADER_ORIGIN, str5);
                            }
                            String str6 = c12450c.f57702b;
                            if (str6 != null) {
                                bundle.putString("name", str6);
                            }
                            Object obj2 = c12450c.f57703c;
                            if (obj2 != null) {
                                C35302Pt8.m89460b(bundle, obj2);
                            }
                            String str7 = c12450c.f57704d;
                            if (str7 != null) {
                                bundle.putString("trigger_event_name", str7);
                            }
                            bundle.putLong("trigger_timeout", c12450c.f57705e);
                            String str8 = c12450c.f57706f;
                            if (str8 != null) {
                                bundle.putString("timed_out_event_name", str8);
                            }
                            Bundle bundle2 = c12450c.f57707g;
                            if (bundle2 != null) {
                                bundle.putBundle("timed_out_event_params", bundle2);
                            }
                            String str9 = c12450c.f57708h;
                            if (str9 != null) {
                                bundle.putString("triggered_event_name", str9);
                            }
                            Bundle bundle3 = c12450c.f57709i;
                            if (bundle3 != null) {
                                bundle.putBundle("triggered_event_params", bundle3);
                            }
                            bundle.putLong("time_to_live", c12450c.f57710j);
                            String str10 = c12450c.f57711k;
                            if (str10 != null) {
                                bundle.putString("expired_event_name", str10);
                            }
                            Bundle bundle4 = c12450c.f57712l;
                            if (bundle4 != null) {
                                bundle.putBundle("expired_event_params", bundle4);
                            }
                            bundle.putLong("creation_timestamp", c12450c.f57713m);
                            bundle.putBoolean("active", c12450c.f57714n);
                            bundle.putLong("triggered_timestamp", c12450c.f57715o);
                            c22416gj.m37873g(bundle);
                        }
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC12447ba
    @KeepForSdk
    /* renamed from: g */
    public Map<String, Object> mo61203g(boolean z) {
        return this.f60920a.m37876d(null, null, z);
    }

    /* renamed from: j */
    public final boolean m61200j(String str) {
        return (str.isEmpty() || !this.f60921b.containsKey(str) || this.f60921b.get(str) == null) ? false : true;
    }
}
