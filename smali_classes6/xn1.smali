.class public Lxn1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:Lad;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LBv0;

.field public final c:LPY1;

.field public d:Ljava/lang/Boolean;

.field public final e:LAm1;

.field public final f:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "LUv4;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LSm1;

.field public final h:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "LU96;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lad;->e()Lad;

    move-result-object v0

    sput-object v0, Lxn1;->i:Lad;

    return-void
.end method

.method public constructor <init>(LAm1;LX94;LSm1;LX94;Lcom/google/firebase/perf/config/RemoteConfigManager;LBv0;Lcom/google/firebase/perf/session/SessionManager;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAm1;",
            "LX94<",
            "LUv4;",
            ">;",
            "LSm1;",
            "LX94<",
            "LU96;",
            ">;",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            "LBv0;",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lxn1;->a:Ljava/util/Map;

    const/4 v0, 0x0

    iput-object v0, p0, Lxn1;->d:Ljava/lang/Boolean;

    iput-object p1, p0, Lxn1;->e:LAm1;

    iput-object p2, p0, Lxn1;->f:LX94;

    iput-object p3, p0, Lxn1;->g:LSm1;

    iput-object p4, p0, Lxn1;->h:LX94;

    if-nez p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lxn1;->d:Ljava/lang/Boolean;

    iput-object p6, p0, Lxn1;->b:LBv0;

    new-instance p1, LPY1;

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p1, p2}, LPY1;-><init>(Landroid/os/Bundle;)V

    iput-object p1, p0, Lxn1;->c:LPY1;

    return-void

    :cond_0
    invoke-static {}, Lga6;->k()Lga6;

    move-result-object v0

    invoke-virtual {v0, p1, p3, p4}, Lga6;->r(LAm1;LSm1;LX94;)V

    invoke-virtual {p1}, LAm1;->j()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lxn1;->a(Landroid/content/Context;)LPY1;

    move-result-object p4

    iput-object p4, p0, Lxn1;->c:LPY1;

    invoke-virtual {p5, p2}, Lcom/google/firebase/perf/config/RemoteConfigManager;->setFirebaseRemoteConfigProvider(LX94;)V

    iput-object p6, p0, Lxn1;->b:LBv0;

    invoke-virtual {p6, p4}, LBv0;->P(LPY1;)V

    invoke-virtual {p6, p3}, LBv0;->O(Landroid/content/Context;)V

    invoke-virtual {p7, p3}, Lcom/google/firebase/perf/session/SessionManager;->setApplicationContext(Landroid/content/Context;)V

    invoke-virtual {p6}, LBv0;->j()Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lxn1;->d:Ljava/lang/Boolean;

    sget-object p2, Lxn1;->i:Lad;

    invoke-virtual {p2}, Lad;->h()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-virtual {p0}, Lxn1;->d()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, 0x1

    new-array p4, p4, [Ljava/lang/Object;

    invoke-virtual {p1}, LAm1;->m()Lpn1;

    move-result-object p1

    invoke-virtual {p1}, Lpn1;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, LNy0;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    aput-object p1, p4, p3

    const-string p1, "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s"

    invoke-static {p1, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lad;->f(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static a(Landroid/content/Context;)LPY1;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x80

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No perf enable meta data found "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "isEnabled"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    :goto_1
    new-instance v0, LPY1;

    if-eqz p0, :cond_0

    invoke-direct {v0, p0}, LPY1;-><init>(Landroid/os/Bundle;)V

    goto :goto_2

    :cond_0
    invoke-direct {v0}, LPY1;-><init>()V

    :goto_2
    return-object v0
.end method

.method public static c()Lxn1;
    .locals 2

    invoke-static {}, LAm1;->k()LAm1;

    move-result-object v0

    const-class v1, Lxn1;

    invoke-virtual {v0, v1}, LAm1;->i(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxn1;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lxn1;->a:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lxn1;->d:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {}, LAm1;->k()LAm1;

    move-result-object v0

    invoke-virtual {v0}, LAm1;->s()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public e(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/Trace;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/perf/metrics/Trace;->c(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/Trace;

    move-result-object p1

    return-object p1
.end method
