package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ComponentTracker;
/* renamed from: mb9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45183mb9 implements InterfaceC41032fb9 {

    /* renamed from: A */
    public static final AbstractC44354lB8 f98398A;

    /* renamed from: B */
    public static final AbstractC44354lB8 f98399B;

    /* renamed from: C */
    public static final AbstractC44354lB8 f98400C;

    /* renamed from: D */
    public static final AbstractC44354lB8 f98401D;

    /* renamed from: E */
    public static final AbstractC44354lB8 f98402E;

    /* renamed from: F */
    public static final AbstractC44354lB8 f98403F;

    /* renamed from: G */
    public static final AbstractC44354lB8 f98404G;

    /* renamed from: H */
    public static final AbstractC44354lB8 f98405H;

    /* renamed from: I */
    public static final AbstractC44354lB8 f98406I;

    /* renamed from: J */
    public static final AbstractC44354lB8 f98407J;

    /* renamed from: K */
    public static final AbstractC44354lB8 f98408K;

    /* renamed from: L */
    public static final AbstractC44354lB8 f98409L;

    /* renamed from: M */
    public static final AbstractC44354lB8 f98410M;

    /* renamed from: N */
    public static final AbstractC44354lB8 f98411N;

    /* renamed from: O */
    public static final AbstractC44354lB8 f98412O;

    /* renamed from: a */
    public static final AbstractC44354lB8 f98413a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f98414b;

    /* renamed from: c */
    public static final AbstractC44354lB8 f98415c;

    /* renamed from: d */
    public static final AbstractC44354lB8 f98416d;

    /* renamed from: e */
    public static final AbstractC44354lB8 f98417e;

    /* renamed from: f */
    public static final AbstractC44354lB8 f98418f;

    /* renamed from: g */
    public static final AbstractC44354lB8 f98419g;

    /* renamed from: h */
    public static final AbstractC44354lB8 f98420h;

    /* renamed from: i */
    public static final AbstractC44354lB8 f98421i;

    /* renamed from: j */
    public static final AbstractC44354lB8 f98422j;

    /* renamed from: k */
    public static final AbstractC44354lB8 f98423k;

    /* renamed from: l */
    public static final AbstractC44354lB8 f98424l;

    /* renamed from: m */
    public static final AbstractC44354lB8 f98425m;

    /* renamed from: n */
    public static final AbstractC44354lB8 f98426n;

    /* renamed from: o */
    public static final AbstractC44354lB8 f98427o;

    /* renamed from: p */
    public static final AbstractC44354lB8 f98428p;

    /* renamed from: q */
    public static final AbstractC44354lB8 f98429q;

    /* renamed from: r */
    public static final AbstractC44354lB8 f98430r;

    /* renamed from: s */
    public static final AbstractC44354lB8 f98431s;

    /* renamed from: t */
    public static final AbstractC44354lB8 f98432t;

    /* renamed from: u */
    public static final AbstractC44354lB8 f98433u;

    /* renamed from: v */
    public static final AbstractC44354lB8 f98434v;

    /* renamed from: w */
    public static final AbstractC44354lB8 f98435w;

    /* renamed from: x */
    public static final AbstractC44354lB8 f98436x;

    /* renamed from: y */
    public static final AbstractC44354lB8 f98437y;

    /* renamed from: z */
    public static final AbstractC44354lB8 f98438z;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86143a();
        f98413a = m86143a.m86140d("measurement.ad_id_cache_time", AbstractComponentTracker.LINGERING_TIMEOUT);
        f98414b = m86143a.m86140d("measurement.app_uninstalled_additional_ad_id_cache_time", CoreConstants.MILLIS_IN_ONE_HOUR);
        f98415c = m86143a.m86140d("measurement.max_bundles_per_iteration", 100L);
        f98416d = m86143a.m86140d("measurement.config.cache_time", CoreConstants.MILLIS_IN_ONE_DAY);
        f98417e = m86143a.m86139e("measurement.log_tag", "FA");
        f98418f = m86143a.m86139e("measurement.config.url_authority", "app-measurement.com");
        f98419g = m86143a.m86139e("measurement.config.url_scheme", "https");
        f98420h = m86143a.m86140d("measurement.upload.debug_upload_interval", 1000L);
        f98421i = m86143a.m86140d("measurement.lifetimevalue.max_currency_tracked", 4L);
        f98422j = m86143a.m86140d("measurement.store.max_stored_events_per_app", 100000L);
        f98423k = m86143a.m86140d("measurement.experiment.max_ids", 50L);
        f98424l = m86143a.m86140d("measurement.audience.filter_result_max_count", 200L);
        f98425m = m86143a.m86140d("measurement.upload.max_item_scoped_custom_parameters", 27L);
        f98426n = m86143a.m86140d("measurement.alarm_manager.minimum_interval", 60000L);
        f98427o = m86143a.m86140d("measurement.upload.minimum_delay", 500L);
        f98428p = m86143a.m86140d("measurement.monitoring.sample_period_millis", CoreConstants.MILLIS_IN_ONE_DAY);
        f98429q = m86143a.m86140d("measurement.upload.realtime_upload_interval", AbstractComponentTracker.LINGERING_TIMEOUT);
        f98430r = m86143a.m86140d("measurement.upload.refresh_blacklisted_config_interval", CoreConstants.MILLIS_IN_ONE_WEEK);
        f98431s = m86143a.m86140d("measurement.config.cache_time.service", CoreConstants.MILLIS_IN_ONE_HOUR);
        f98432t = m86143a.m86140d("measurement.service_client.idle_disconnect_millis", 5000L);
        f98433u = m86143a.m86139e("measurement.log_tag.service", "FA-SVC");
        f98434v = m86143a.m86140d("measurement.upload.stale_data_deletion_interval", CoreConstants.MILLIS_IN_ONE_DAY);
        f98435w = m86143a.m86140d("measurement.sdk.attribution.cache.ttl", CoreConstants.MILLIS_IN_ONE_WEEK);
        f98436x = m86143a.m86140d("measurement.redaction.app_instance_id.ttl", 7200000L);
        f98437y = m86143a.m86140d("measurement.upload.backoff_period", 43200000L);
        f98438z = m86143a.m86140d("measurement.upload.initial_upload_delay_time", 15000L);
        f98398A = m86143a.m86140d("measurement.upload.interval", CoreConstants.MILLIS_IN_ONE_HOUR);
        f98399B = m86143a.m86140d("measurement.upload.max_bundle_size", 65536L);
        f98400C = m86143a.m86140d("measurement.upload.max_bundles", 100L);
        f98401D = m86143a.m86140d("measurement.upload.max_conversions_per_day", 500L);
        f98402E = m86143a.m86140d("measurement.upload.max_error_events_per_day", 1000L);
        f98403F = m86143a.m86140d("measurement.upload.max_events_per_bundle", 1000L);
        f98404G = m86143a.m86140d("measurement.upload.max_events_per_day", 100000L);
        f98405H = m86143a.m86140d("measurement.upload.max_public_events_per_day", 50000L);
        f98406I = m86143a.m86140d("measurement.upload.max_queue_time", 2419200000L);
        f98407J = m86143a.m86140d("measurement.upload.max_realtime_events_per_day", 10L);
        f98408K = m86143a.m86140d("measurement.upload.max_batch_size", 65536L);
        f98409L = m86143a.m86140d("measurement.upload.retry_count", 6L);
        f98410M = m86143a.m86140d("measurement.upload.retry_time", ComponentTracker.DEFAULT_TIMEOUT);
        f98411N = m86143a.m86139e("measurement.upload.url", "https://app-measurement.com/a");
        f98412O = m86143a.m86140d("measurement.upload.window_interval", CoreConstants.MILLIS_IN_ONE_HOUR);
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: A */
    public final long mo25342A() {
        return ((Long) f98408K.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: B */
    public final String mo25341B() {
        return (String) f98418f.m27685b();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: C */
    public final long mo25340C() {
        return ((Long) f98400C.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: a */
    public final long mo25339a() {
        return ((Long) f98426n.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: b */
    public final long mo25338b() {
        return ((Long) f98428p.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: c */
    public final long mo25337c() {
        return ((Long) f98425m.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: d */
    public final long mo25336d() {
        return ((Long) f98432t.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: e */
    public final long mo25335e() {
        return ((Long) f98429q.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: f */
    public final long mo25334f() {
        return ((Long) f98430r.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: g */
    public final long mo25333g() {
        return ((Long) f98437y.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: h */
    public final long mo25332h() {
        return ((Long) f98434v.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: i */
    public final long mo25331i() {
        return ((Long) f98438z.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: j */
    public final long mo25330j() {
        return ((Long) f98427o.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: k */
    public final long mo25329k() {
        return ((Long) f98435w.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: l */
    public final long mo25328l() {
        return ((Long) f98407J.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: m */
    public final long mo25327m() {
        return ((Long) f98404G.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: n */
    public final long mo25326n() {
        return ((Long) f98401D.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: o */
    public final long mo25325o() {
        return ((Long) f98409L.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: p */
    public final String mo25324p() {
        return (String) f98419g.m27685b();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: q */
    public final long mo25323q() {
        return ((Long) f98410M.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: r */
    public final long mo25322r() {
        return ((Long) f98412O.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: t */
    public final String mo25321t() {
        return (String) f98411N.m27685b();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: w */
    public final long mo25320w() {
        return ((Long) f98402E.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: x */
    public final long mo25319x() {
        return ((Long) f98421i.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: y */
    public final long mo25318y() {
        return ((Long) f98405H.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    /* renamed from: z */
    public final long mo25317z() {
        return ((Long) f98403F.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    public final long zzD() {
        return ((Long) f98406I.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    public final long zza() {
        return ((Long) f98413a.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    public final long zzb() {
        return ((Long) f98414b.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    public final long zzc() {
        return ((Long) f98415c.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    public final long zzd() {
        return ((Long) f98416d.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    public final long zze() {
        return ((Long) f98420h.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    public final long zzg() {
        return ((Long) f98422j.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    public final long zzh() {
        return ((Long) f98423k.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    public final long zzi() {
        return ((Long) f98424l.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    public final long zzs() {
        return ((Long) f98436x.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    public final long zzv() {
        return ((Long) f98398A.m27685b()).longValue();
    }

    @Override // p000.InterfaceC41032fb9
    public final long zzw() {
        return ((Long) f98399B.m27685b()).longValue();
    }
}
