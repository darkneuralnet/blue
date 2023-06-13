.class public final LWk9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQk9;


# static fields
.field public static final a:LlB8;

.field public static final b:LlB8;

.field public static final c:LlB8;

.field public static final d:LlB8;

.field public static final e:LlB8;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LRz8;

    const-string v1, "com.google.android.gms.measurement"

    invoke-static {v1}, Lay8;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, LRz8;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, LRz8;->b()LRz8;

    move-result-object v0

    invoke-virtual {v0}, LRz8;->a()LRz8;

    move-result-object v0

    const-string v1, "measurement.client.sessions.background_sessions_enabled"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, LWk9;->a:LlB8;

    const-string v1, "measurement.client.sessions.enable_fix_background_engagement"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, LWk9;->b:LlB8;

    const-string v1, "measurement.client.sessions.immediate_start_enabled_foreground"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, LWk9;->c:LlB8;

    const-string v1, "measurement.client.sessions.remove_expired_session_properties_enabled"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v1

    sput-object v1, LWk9;->d:LlB8;

    const-string v1, "measurement.client.sessions.session_id_enabled"

    invoke-virtual {v0, v1, v2}, LRz8;->f(Ljava/lang/String;Z)LlB8;

    move-result-object v0

    sput-object v0, LWk9;->e:LlB8;

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

    sget-object v0, LWk9;->b:LlB8;

    invoke-virtual {v0}, LlB8;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
