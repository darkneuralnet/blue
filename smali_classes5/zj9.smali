.class public final Lzj9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj9;


# static fields
.field public static final a:LlB8;

.field public static final b:LlB8;

.field public static final c:LlB8;

.field public static final d:LlB8;

.field public static final e:LlB8;

.field public static final f:LlB8;

.field public static final g:LlB8;

.field public static final h:LlB8;

.field public static final i:LlB8;

.field public static final j:LlB8;

.field public static final k:LlB8;

.field public static final l:LlB8;

.field public static final m:LlB8;

.field public static final n:LlB8;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LRz8;

    const-string v1, "com.google.android.gms.measurement"

    invoke-static {v1}, Lay8;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, LRz8;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, LRz8;->b()LRz8;

    move-result-object v0

    invoke-virtual {v0}, LRz8;->a()LRz8;

    move-result-object v0

    const-string v1, "measurement.redaction.app_instance_id"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, Lzj9;->a:LlB8;

    const-string v1, "measurement.redaction.client_ephemeral_aiid_generation"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, Lzj9;->b:LlB8;

    const-string v1, "measurement.redaction.config_redacted_fields"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, Lzj9;->c:LlB8;

    const-string v1, "measurement.redaction.device_info"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, Lzj9;->d:LlB8;

    const-string v1, "measurement.redaction.e_tag"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, Lzj9;->e:LlB8;

    const-string v1, "measurement.redaction.enhanced_uid"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, Lzj9;->f:LlB8;

    const-string v1, "measurement.redaction.populate_ephemeral_app_instance_id"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, Lzj9;->g:LlB8;

    const-string v1, "measurement.redaction.google_signals"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, Lzj9;->h:LlB8;

    const-string v1, "measurement.redaction.no_aiid_in_config_request"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, Lzj9;->i:LlB8;

    const-string v1, "measurement.redaction.retain_major_os_version"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, Lzj9;->j:LlB8;

    const-string v1, "measurement.redaction.scion_payload_generator"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, Lzj9;->k:LlB8;

    const-string v1, "measurement.redaction.upload_redacted_fields"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, Lzj9;->l:LlB8;

    const-string v1, "measurement.redaction.upload_subdomain_override"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, Lzj9;->m:LlB8;

    const-string v1, "measurement.redaction.user_id"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v0

    sput-object v0, Lzj9;->n:LlB8;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    sget-object v0, Lzj9;->j:LlB8;

    invoke-virtual {v0}, LlB8;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzb()Z
    .locals 1

    sget-object v0, Lzj9;->k:LlB8;

    invoke-virtual {v0}, LlB8;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
