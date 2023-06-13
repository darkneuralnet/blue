.class public final La98;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:LL88;

.field public static final A0:LL88;

.field public static final B:LL88;

.field public static final B0:LL88;

.field public static final C:LL88;

.field public static final C0:LL88;

.field public static final D:LL88;

.field public static final D0:LL88;

.field public static final E:LL88;

.field public static final E0:LL88;

.field public static final F:LL88;

.field public static final F0:LL88;

.field public static final G:LL88;

.field public static final G0:LL88;

.field public static final H:LL88;

.field public static final H0:LL88;

.field public static final I:LL88;

.field public static final I0:LL88;

.field public static final J:LL88;

.field public static final J0:LL88;

.field public static final K:LL88;

.field public static final L:LL88;

.field public static final M:LL88;

.field public static final N:LL88;

.field public static final O:LL88;

.field public static final P:LL88;

.field public static final Q:LL88;

.field public static final R:LL88;

.field public static final S:LL88;

.field public static final T:LL88;

.field public static final U:LL88;

.field public static final V:LL88;

.field public static final W:LL88;

.field public static final X:LL88;

.field public static final Y:LL88;

.field public static final Z:LL88;

.field public static final a:Ljava/util/List;

.field public static final a0:LL88;

.field public static final b:Ljava/util/Set;

.field public static final b0:LL88;

.field public static final c:LL88;

.field public static final c0:LL88;

.field public static final d:LL88;

.field public static final d0:LL88;

.field public static final e:LL88;

.field public static final e0:LL88;

.field public static final f:LL88;

.field public static final f0:LL88;

.field public static final g:LL88;

.field public static final g0:LL88;

.field public static final h:LL88;

.field public static final h0:LL88;

.field public static final i:LL88;

.field public static final i0:LL88;

.field public static final j:LL88;

.field public static final j0:LL88;

.field public static final k:LL88;

.field public static final k0:LL88;

.field public static final l:LL88;

.field public static final l0:LL88;

.field public static final m:LL88;

.field public static final m0:LL88;

.field public static final n:LL88;

.field public static final n0:LL88;

.field public static final o:LL88;

.field public static final o0:LL88;

.field public static final p:LL88;

.field public static final p0:LL88;

.field public static final q:LL88;

.field public static final q0:LL88;

.field public static final r:LL88;

.field public static final r0:LL88;

.field public static final s:LL88;

.field public static final s0:LL88;

.field public static final t:LL88;

.field public static final t0:LL88;

.field public static final u:LL88;

.field public static final u0:LL88;

.field public static final v:LL88;

.field public static final v0:LL88;

.field public static final w:LL88;

.field public static final w0:LL88;

.field public static final x:LL88;

.field public static final x0:LL88;

.field public static final y:LL88;

.field public static final y0:LL88;

.field public static final z:LL88;

.field public static final z0:LL88;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, La98;->a:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, La98;->b:Ljava/util/Set;

    const-wide/16 v0, 0x2710

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, LiK7;->a:LiK7;

    const-string v2, "measurement.ad_id_cache_time"

    invoke-static {v2, v0, v0, v1}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v1

    sput-object v1, La98;->c:LL88;

    const-wide/32 v1, 0x36ee80

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, LID7;->a:LID7;

    const-string v3, "measurement.app_uninstalled_additional_ad_id_cache_time"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->d:LL88;

    const-wide/32 v2, 0x5265c00

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v3, LAL7;->a:LAL7;

    const-string v4, "measurement.monitoring.sample_period_millis"

    invoke-static {v4, v2, v2, v3}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v3

    sput-object v3, La98;->e:LL88;

    sget-object v3, LgP7;->a:LgP7;

    const-string v4, "measurement.config.cache_time"

    invoke-static {v4, v2, v1, v3}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v3

    sput-object v3, La98;->f:LL88;

    sget-object v3, LNT7;->a:LNT7;

    const-string v4, "measurement.config.url_scheme"

    const-string v5, "https"

    invoke-static {v4, v5, v5, v3}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v3

    sput-object v3, La98;->g:LL88;

    sget-object v3, LUW7;->a:LUW7;

    const-string v4, "measurement.config.url_authority"

    const-string v5, "app-measurement.com"

    invoke-static {v4, v5, v5, v3}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v3

    sput-object v3, La98;->h:LL88;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Lm18;->a:Lm18;

    const-string v5, "measurement.upload.max_bundles"

    invoke-static {v5, v3, v3, v4}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v4

    sput-object v4, La98;->i:LL88;

    const/high16 v4, 0x10000

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, LB48;->a:LB48;

    const-string v6, "measurement.upload.max_batch_size"

    invoke-static {v6, v4, v4, v5}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v5

    sput-object v5, La98;->j:LL88;

    sget-object v5, LL58;->a:LL58;

    const-string v6, "measurement.upload.max_bundle_size"

    invoke-static {v6, v4, v4, v5}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v4

    sput-object v4, La98;->k:LL88;

    const/16 v4, 0x3e8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, LW68;->a:LW68;

    const-string v6, "measurement.upload.max_events_per_bundle"

    invoke-static {v6, v4, v4, v5}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v5

    sput-object v5, La98;->l:LL88;

    const v5, 0x186a0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v6, LJN7;->a:LJN7;

    const-string v7, "measurement.upload.max_events_per_day"

    invoke-static {v7, v5, v5, v6}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v6

    sput-object v6, La98;->m:LL88;

    sget-object v6, LeS7;->a:LeS7;

    const-string v7, "measurement.upload.max_error_events_per_day"

    invoke-static {v7, v4, v4, v6}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v4

    sput-object v4, La98;->n:LL88;

    const v4, 0xc350

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v6, LcV7;->a:LcV7;

    const-string v7, "measurement.upload.max_public_events_per_day"

    invoke-static {v7, v4, v4, v6}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v4

    sput-object v4, La98;->o:LL88;

    const/16 v4, 0x2710

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v6, LbZ7;->a:LbZ7;

    const-string v7, "measurement.upload.max_conversions_per_day"

    invoke-static {v7, v4, v4, v6}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v4

    sput-object v4, La98;->p:LL88;

    const/16 v4, 0xa

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v6, Lc28;->a:Lc28;

    const-string v7, "measurement.upload.max_realtime_events_per_day"

    invoke-static {v7, v4, v4, v6}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v4

    sput-object v4, La98;->q:LL88;

    sget-object v4, Lg58;->a:Lg58;

    const-string v6, "measurement.store.max_stored_events_per_app"

    invoke-static {v6, v5, v5, v4}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v4

    sput-object v4, La98;->r:LL88;

    sget-object v4, Ll78;->a:Ll78;

    const-string v5, "measurement.upload.url"

    const-string v6, "https://app-measurement.com/a"

    invoke-static {v5, v6, v6, v4}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v4

    sput-object v4, La98;->s:LL88;

    const-wide/32 v4, 0x2932e00

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    sget-object v5, LA78;->a:LA78;

    const-string v6, "measurement.upload.backoff_period"

    invoke-static {v6, v4, v4, v5}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v4

    sput-object v4, La98;->t:LL88;

    sget-object v4, LRA7;->a:LRA7;

    const-string v5, "measurement.upload.window_interval"

    invoke-static {v5, v1, v1, v4}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v4

    sput-object v4, La98;->u:LL88;

    sget-object v4, LTC7;->a:LTC7;

    const-string v5, "measurement.upload.interval"

    invoke-static {v5, v1, v1, v4}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v1

    sput-object v1, La98;->v:LL88;

    sget-object v1, LwE7;->a:LwE7;

    const-string v4, "measurement.upload.realtime_upload_interval"

    invoke-static {v4, v0, v0, v1}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v0

    sput-object v0, La98;->w:LL88;

    const-wide/16 v0, 0x3e8

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, LnF7;->a:LnF7;

    const-string v4, "measurement.upload.debug_upload_interval"

    invoke-static {v4, v0, v0, v1}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v0

    sput-object v0, La98;->x:LL88;

    const-wide/16 v0, 0x1f4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, LdG7;->a:LdG7;

    const-string v4, "measurement.upload.minimum_delay"

    invoke-static {v4, v0, v0, v1}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v0

    sput-object v0, La98;->y:LL88;

    const-wide/32 v0, 0xea60

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, LVG7;->a:LVG7;

    const-string v4, "measurement.alarm_manager.minimum_interval"

    invoke-static {v4, v0, v0, v1}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v0

    sput-object v0, La98;->z:LL88;

    sget-object v0, LMH7;->a:LMH7;

    const-string v1, "measurement.upload.stale_data_deletion_interval"

    invoke-static {v1, v2, v2, v0}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v0

    sput-object v0, La98;->A:LL88;

    const-wide/32 v0, 0x240c8400

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, LEI7;->a:LEI7;

    const-string v2, "measurement.upload.refresh_blacklisted_config_interval"

    invoke-static {v2, v0, v0, v1}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v1

    sput-object v1, La98;->B:LL88;

    const-wide/16 v1, 0x3a98

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, LtJ7;->a:LtJ7;

    const-string v4, "measurement.upload.initial_upload_delay_time"

    invoke-static {v4, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v1

    sput-object v1, La98;->C:LL88;

    const-wide/32 v1, 0x1b7740

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, LFK7;->a:LFK7;

    const-string v4, "measurement.upload.retry_time"

    invoke-static {v4, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v1

    sput-object v1, La98;->D:LL88;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, LVK7;->a:LVK7;

    const-string v4, "measurement.upload.retry_count"

    invoke-static {v4, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v1

    sput-object v1, La98;->E:LL88;

    const-wide v1, 0x90321000L

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, LlL7;->a:LlL7;

    const-string v4, "measurement.upload.max_queue_time"

    invoke-static {v4, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v1

    sput-object v1, La98;->F:LL88;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, LQL7;->a:LQL7;

    const-string v4, "measurement.lifetimevalue.max_currency_tracked"

    invoke-static {v4, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v1

    sput-object v1, La98;->G:LL88;

    const/16 v1, 0xc8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, LgM7;->a:LgM7;

    const-string v4, "measurement.audience.filter_result_max_count"

    invoke-static {v4, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v1

    sput-object v1, La98;->H:LL88;

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "measurement.upload.max_public_user_properties"

    const/4 v4, 0x0

    invoke-static {v2, v1, v1, v4}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->I:LL88;

    const/16 v2, 0x1f4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v5, "measurement.upload.max_event_name_cardinality"

    invoke-static {v5, v2, v2, v4}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->J:LL88;

    const-string v2, "measurement.upload.max_public_event_params"

    invoke-static {v2, v1, v1, v4}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v1

    sput-object v1, La98;->K:LL88;

    const-wide/16 v1, 0x1388

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, LxM7;->a:LxM7;

    const-string v5, "measurement.service_client.idle_disconnect_millis"

    invoke-static {v5, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v1

    sput-object v1, La98;->L:LL88;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v2, LNM7;->a:LNM7;

    const-string v5, "measurement.test.boolean_flag"

    invoke-static {v5, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->M:LL88;

    sget-object v2, LeN7;->a:LeN7;

    const-string v5, "measurement.test.string_flag"

    const-string v6, "---"

    invoke-static {v5, v6, v6, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->N:LL88;

    const-wide/16 v5, -0x1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v5, LuN7;->a:LuN7;

    const-string v6, "measurement.test.long_flag"

    invoke-static {v6, v2, v2, v5}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->O:LL88;

    const/4 v2, -0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v5, LZN7;->a:LZN7;

    const-string v6, "measurement.test.int_flag"

    invoke-static {v6, v2, v2, v5}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->P:LL88;

    const-wide/high16 v5, -0x3ff8000000000000L    # -3.0

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    sget-object v5, LnO7;->a:LnO7;

    const-string v6, "measurement.test.double_flag"

    invoke-static {v6, v2, v2, v5}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->Q:LL88;

    const/16 v2, 0x32

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v5, LCO7;->a:LCO7;

    const-string v6, "measurement.experiment.max_ids"

    invoke-static {v6, v2, v2, v5}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->R:LL88;

    const/16 v2, 0x1b

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v5, LRO7;->a:LRO7;

    const-string v6, "measurement.upload.max_item_scoped_custom_parameters"

    invoke-static {v6, v2, v2, v5}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->S:LL88;

    sget-object v2, LFQ7;->a:LFQ7;

    const-string v5, "measurement.max_bundles_per_iteration"

    invoke-static {v5, v3, v3, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->T:LL88;

    sget-object v2, LUQ7;->a:LUQ7;

    const-string v3, "measurement.sdk.attribution.cache.ttl"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v0

    sput-object v0, La98;->U:LL88;

    const-wide/32 v2, 0x6ddd00

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v2, LkR7;->a:LkR7;

    const-string v3, "measurement.redaction.app_instance_id.ttl"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v0

    sput-object v0, La98;->V:LL88;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v2, LzR7;->a:LzR7;

    const-string v3, "measurement.collection.log_event_and_bundle_v2"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->W:LL88;

    const-string v2, "measurement.quality.checksum"

    invoke-static {v2, v1, v1, v4}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->X:LL88;

    sget-object v2, LOR7;->a:LOR7;

    const-string v3, "measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->Y:LL88;

    sget-object v2, LsS7;->a:LsS7;

    const-string v3, "measurement.audience.refresh_event_count_filters_timestamp"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->Z:LL88;

    sget-object v2, LIS7;->a:LIS7;

    const-string v3, "measurement.audience.use_bundle_timestamp_for_event_count_filters"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->a0:LL88;

    sget-object v2, LYS7;->a:LYS7;

    const-string v3, "measurement.sdk.collection.retrieve_deeplink_from_bow_2"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->b0:LL88;

    sget-object v2, LnT7;->a:LnT7;

    const-string v3, "measurement.sdk.collection.last_deep_link_referrer_campaign2"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->c0:LL88;

    sget-object v2, LBT7;->a:LBT7;

    const-string v3, "measurement.lifecycle.app_in_background_parameter"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->d0:LL88;

    sget-object v2, LbU7;->a:LbU7;

    const-string v3, "measurement.integration.disable_firebase_instance_id"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->e0:LL88;

    sget-object v2, LoU7;->a:LoU7;

    const-string v3, "measurement.collection.service.update_with_analytics_fix"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->f0:LL88;

    sget-object v2, LBU7;->a:LBU7;

    const-string v3, "measurement.client.firebase_feature_rollout.v1.enable"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->g0:LL88;

    sget-object v2, LPU7;->a:LPU7;

    const-string v3, "measurement.client.sessions.check_on_reset_and_enable2"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->h0:LL88;

    sget-object v2, LqV7;->a:LqV7;

    const-string v3, "measurement.collection.synthetic_data_mitigation"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->i0:LL88;

    const v2, 0x31b50

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, LEV7;->a:LEV7;

    const-string v4, "measurement.service.storage_consent_support_version"

    invoke-static {v4, v2, v2, v3}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->j0:LL88;

    sget-object v2, LSV7;->a:LSV7;

    const-string v3, "measurement.client.click_identifier_control.dev"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->k0:LL88;

    sget-object v2, LgW7;->a:LgW7;

    const-string v3, "measurement.service.click_identifier_control"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->l0:LL88;

    sget-object v2, LtW7;->a:LtW7;

    const-string v3, "measurement.service.store_null_safelist"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->m0:LL88;

    sget-object v2, LGW7;->a:LGW7;

    const-string v3, "measurement.service.store_safelist"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->n0:LL88;

    sget-object v2, LjX7;->a:LjX7;

    const-string v3, "measurement.collection.enable_session_stitching_token.first_open_fix"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->o0:LL88;

    sget-object v2, LyX7;->a:LyX7;

    const-string v3, "measurement.collection.enable_session_stitching_token.client.dev"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->p0:LL88;

    sget-object v2, LMY7;->a:LMY7;

    const-string v3, "measurement.session_stitching_token_enabled"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->q0:LL88;

    sget-object v2, LpZ7;->a:LpZ7;

    const-string v3, "measurement.sgtm.client.dev"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->r0:LL88;

    sget-object v2, LDZ7;->a:LDZ7;

    const-string v3, "measurement.sgtm.service"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->s0:LL88;

    sget-object v2, LRZ7;->a:LRZ7;

    const-string v3, "measurement.redaction.retain_major_os_version"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->t0:LL88;

    sget-object v2, Lg08;->a:Lg08;

    const-string v3, "measurement.redaction.scion_payload_generator"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->u0:LL88;

    sget-object v2, Lv08;->a:Lv08;

    const-string v3, "measurement.service.clear_global_params_on_uninstall"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->v0:LL88;

    sget-object v2, LI08;->a:LI08;

    const-string v3, "measurement.sessionid.enable_client_session_id"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->w0:LL88;

    sget-object v2, LX08;->a:LX08;

    const-string v3, "measurement.sfmc.client"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->x0:LL88;

    sget-object v2, LA18;->a:LA18;

    const-string v3, "measurement.sfmc.service"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->y0:LL88;

    sget-object v2, LO18;->a:LO18;

    const-string v3, "measurement.gmscore_feature_tracking"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->z0:LL88;

    sget-object v2, Lr28;->a:Lr28;

    const-string v3, "measurement.fix_health_monitor_stack_trace"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->A0:LL88;

    sget-object v2, LF28;->a:LF28;

    const-string v3, "measurement.item_scoped_custom_parameters.client"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->B0:LL88;

    sget-object v2, LS28;->a:LS28;

    const-string v3, "measurement.item_scoped_custom_parameters.service"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->C0:LL88;

    sget-object v2, Li38;->a:Li38;

    const-string v3, "measurement.remove_app_background.client"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->D0:LL88;

    sget-object v2, Lw38;->a:Lw38;

    const-string v3, "measurement.rb.attribution.service"

    invoke-static {v3, v1, v1, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->E0:LL88;

    sget-object v2, LK38;->a:LK38;

    const-string v3, "measurement.collection.client.log_target_api_version"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->F0:LL88;

    sget-object v2, LZ38;->a:LZ38;

    const-string v3, "measurement.collection.service.log_target_api_version"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v2

    sput-object v2, La98;->G0:LL88;

    sget-object v2, Ln48;->a:Ln48;

    const-string v3, "measurement.client.deep_link_referrer_fix"

    invoke-static {v3, v0, v0, v2}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v0

    sput-object v0, La98;->H0:LL88;

    sget-object v0, LR48;->a:LR48;

    const-string v2, "measurement.client.sessions.enable_fix_background_engagement"

    invoke-static {v2, v1, v1, v0}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v0

    sput-object v0, La98;->I0:LL88;

    sget-object v0, Lv58;->a:Lv58;

    const-string v2, "measurement.link_sst_to_sid"

    invoke-static {v2, v1, v1, v0}, La98;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;

    move-result-object v0

    sput-object v0, La98;->J0:LL88;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;)LL88;
    .locals 7

    new-instance v6, LL88;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, LL88;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LQ78;Lv88;)V

    sget-object p0, La98;->a:Ljava/util/List;

    invoke-interface {p0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v6
.end method

.method public static bridge synthetic b()Ljava/util/List;
    .locals 1

    sget-object v0, La98;->a:Ljava/util/List;

    return-object v0
.end method
