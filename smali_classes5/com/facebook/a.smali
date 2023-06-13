.class public final Lcom/facebook/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/a$i;,
        Lcom/facebook/a$j;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "com.facebook.a"

.field public static final b:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "LSx2;",
            ">;"
        }
    .end annotation
.end field

.field public static c:Ljava/util/concurrent/Executor;

.field public static volatile d:Ljava/lang/String;

.field public static volatile e:Ljava/lang/String;

.field public static volatile f:Ljava/lang/String;

.field public static volatile g:Ljava/lang/Boolean;

.field public static volatile h:Ljava/lang/String;

.field public static i:Ljava/util/concurrent/atomic/AtomicLong;

.field public static volatile j:Z

.field public static k:Z

.field public static l:Lfx2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfx2<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public static m:Landroid/content/Context;

.field public static n:I

.field public static final o:Ljava/lang/Object;

.field public static p:Ljava/lang/String;

.field public static q:Z

.field public static r:Z

.field public static final s:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static t:Ljava/lang/Boolean;

.field public static u:Lcom/facebook/a$i;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    new-array v1, v1, [LSx2;

    sget-object v2, LSx2;->g:LSx2;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/facebook/a;->b:Ljava/util/HashSet;

    const-string v0, "facebook.com"

    sput-object v0, Lcom/facebook/a;->h:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/32 v1, 0x10000

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lcom/facebook/a;->i:Ljava/util/concurrent/atomic/AtomicLong;

    sput-boolean v3, Lcom/facebook/a;->j:Z

    sput-boolean v3, Lcom/facebook/a;->k:Z

    const v0, 0xface

    sput v0, Lcom/facebook/a;->n:I

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/a;->o:Ljava/lang/Object;

    invoke-static {}, Lzt5;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/a;->p:Ljava/lang/String;

    sput-boolean v3, Lcom/facebook/a;->q:Z

    sput-boolean v3, Lcom/facebook/a;->r:Z

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/facebook/a;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Lcom/facebook/a;->t:Ljava/lang/Boolean;

    new-instance v0, Lcom/facebook/a$a;

    invoke-direct {v0}, Lcom/facebook/a$a;-><init>()V

    sput-object v0, Lcom/facebook/a;->u:Lcom/facebook/a$i;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Landroid/content/Context;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x80

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_9

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    sget-object v0, Lcom/facebook/a;->d:Ljava/lang/String;

    if-nez v0, :cond_5

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "com.facebook.sdk.ApplicationId"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_3

    check-cast v0, Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "fb"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/a;->d:Ljava/lang/String;

    goto :goto_0

    :cond_2
    sput-object v0, Lcom/facebook/a;->d:Ljava/lang/String;

    goto :goto_0

    :cond_3
    instance-of v0, v0, Ljava/lang/Number;

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    new-instance p0, Lcom/facebook/FacebookException;

    const-string v0, "App Ids cannot be directly placed in the manifest.They must be prefixed by \'fb\' or be placed in the string resource file."

    invoke-direct {p0, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_0
    sget-object v0, Lcom/facebook/a;->e:Ljava/lang/String;

    if-nez v0, :cond_6

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "com.facebook.sdk.ApplicationName"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/a;->e:Ljava/lang/String;

    :cond_6
    sget-object v0, Lcom/facebook/a;->f:Ljava/lang/String;

    if-nez v0, :cond_7

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "com.facebook.sdk.ClientToken"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/a;->f:Ljava/lang/String;

    :cond_7
    sget v0, Lcom/facebook/a;->n:I

    const v1, 0xface

    if-ne v0, v1, :cond_8

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "com.facebook.sdk.CallbackOffset"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/facebook/a;->n:I

    :cond_8
    sget-object v0, Lcom/facebook/a;->g:Ljava/lang/Boolean;

    if-nez v0, :cond_9

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v0, "com.facebook.sdk.CodelessDebugLogEnabled"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sput-object p0, Lcom/facebook/a;->g:Ljava/lang/Boolean;

    :catch_0
    :cond_9
    :goto_1
    return-void
.end method

.method public static B(Landroid/content/Context;Ljava/lang/String;)V
    .locals 12

    const-class v0, Lcom/facebook/a;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-static {p0}, Lvp;->m(Landroid/content/Context;)Lvp;

    move-result-object v1

    const-string v2, "com.facebook.sdk.attributionTracking"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "ping"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-wide/16 v5, 0x0

    invoke-interface {v2, v4, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v9, LZi$a;->b:LZi$a;

    invoke-static {p0}, LXi;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    invoke-static {p0}, Lcom/facebook/a;->s(Landroid/content/Context;)Z

    move-result v11

    invoke-static {v9, v1, v10, v11, p0}, LZi;->a(LZi$a;Lvp;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;

    move-result-object p0
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string v1, "%s/activities"

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    aput-object p1, v9, v3

    invoke-static {v1, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/facebook/a;->u:Lcom/facebook/a$i;

    const/4 v3, 0x0

    invoke-interface {v1, v3, p1, p0, v3}, Lcom/facebook/a$i;->a(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;

    move-result-object p0

    cmp-long p1, v7, v5

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/facebook/GraphRequest;->j()LWD1;

    move-result-object p0

    invoke-virtual {p0}, LWD1;->b()Lcom/facebook/FacebookRequestError;

    move-result-object p0

    if-nez p0, :cond_2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-interface {p0, v4, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/facebook/FacebookException;

    const-string v1, "An error occurred while publishing install."

    invoke-direct {p1, v1, p0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Both context and applicationId must be non-null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    :try_start_3
    const-string p1, "Facebook-publish"

    invoke-static {p1, p0}, Lyi6;->X(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_2
    :goto_0
    return-void

    :goto_1
    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static C(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const-class v0, Lcom/facebook/a;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {}, Lcom/facebook/a;->o()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/facebook/a$h;

    invoke-direct {v2, p0, p1}, Lcom/facebook/a$h;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object p0, LCk1$b;->n:LCk1$b;

    invoke-static {p0}, LCk1;->g(LCk1$b;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LMg3;->b()Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "com.facebook.sdk.attributionTracking"

    invoke-static {p1, p0}, LMg3;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static declared-synchronized D(Landroid/content/Context;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class v0, Lcom/facebook/a;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v1}, Lcom/facebook/a;->E(Landroid/content/Context;Lcom/facebook/a$j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized E(Landroid/content/Context;Lcom/facebook/a$j;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class v0, Lcom/facebook/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/facebook/a;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/facebook/a$j;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    const-string v2, "applicationContext"

    invoke-static {p0, v2}, Lsj6;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-static {p0, v2}, Lsj6;->g(Landroid/content/Context;Z)V

    invoke-static {p0, v2}, Lsj6;->i(Landroid/content/Context;Z)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sput-object v2, Lcom/facebook/a;->m:Landroid/content/Context;

    invoke-static {p0}, LXi;->c(Landroid/content/Context;)Ljava/lang/String;

    sget-object v2, Lcom/facebook/a;->m:Landroid/content/Context;

    invoke-static {v2}, Lcom/facebook/a;->A(Landroid/content/Context;)V

    sget-object v2, Lcom/facebook/a;->d:Ljava/lang/String;

    invoke-static {v2}, Lyi6;->R(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-static {}, Lcom/facebook/a;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/facebook/a;->c()V

    :cond_2
    sget-object v1, Lcom/facebook/a;->m:Landroid/content/Context;

    instance-of v1, v1, Landroid/app/Application;

    if-eqz v1, :cond_3

    invoke-static {}, Lcom/facebook/b;->g()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lcom/facebook/a;->m:Landroid/content/Context;

    check-cast v1, Landroid/app/Application;

    sget-object v2, Lcom/facebook/a;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Lg4;->x(Landroid/app/Application;Ljava/lang/String;)V

    :cond_3
    invoke-static {}, LNk1;->k()V

    invoke-static {}, LvY2;->C()V

    sget-object v1, Lcom/facebook/a;->m:Landroid/content/Context;

    invoke-static {v1}, Lcom/facebook/internal/BoltsMeasurementEventListener;->e(Landroid/content/Context;)Lcom/facebook/internal/BoltsMeasurementEventListener;

    new-instance v1, Lfx2;

    new-instance v2, Lcom/facebook/a$b;

    invoke-direct {v2}, Lcom/facebook/a$b;-><init>()V

    invoke-direct {v1, v2}, Lfx2;-><init>(Ljava/util/concurrent/Callable;)V

    sput-object v1, Lcom/facebook/a;->l:Lfx2;

    sget-object v1, LCk1$b;->r:LCk1$b;

    new-instance v2, Lcom/facebook/a$c;

    invoke-direct {v2}, Lcom/facebook/a$c;-><init>()V

    invoke-static {v1, v2}, LCk1;->a(LCk1$b;LCk1$a;)V

    sget-object v1, LCk1$b;->e:LCk1$b;

    new-instance v2, Lcom/facebook/a$d;

    invoke-direct {v2}, Lcom/facebook/a$d;-><init>()V

    invoke-static {v1, v2}, LCk1;->a(LCk1$b;LCk1$a;)V

    sget-object v1, LCk1$b;->z:LCk1$b;

    new-instance v2, Lcom/facebook/a$e;

    invoke-direct {v2}, Lcom/facebook/a$e;-><init>()V

    invoke-static {v1, v2}, LCk1;->a(LCk1$b;LCk1$a;)V

    sget-object v1, LCk1$b;->A:LCk1$b;

    new-instance v2, Lcom/facebook/a$f;

    invoke-direct {v2}, Lcom/facebook/a$f;-><init>()V

    invoke-static {v1, v2}, LCk1;->a(LCk1$b;LCk1$a;)V

    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v2, Lcom/facebook/a$g;

    invoke-direct {v2, p1, p0}, Lcom/facebook/a$g;-><init>(Lcom/facebook/a$j;Landroid/content/Context;)V

    invoke-direct {v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {}, Lcom/facebook/a;->o()Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :cond_4
    :try_start_2
    new-instance p0, Lcom/facebook/FacebookException;

    const-string p1, "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."

    invoke-direct {p0, p1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static F(Z)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/b;->q(Z)V

    return-void
.end method

.method public static G(Z)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/b;->r(Z)V

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/facebook/a;->c()V

    :cond_0
    return-void
.end method

.method public static H(Z)V
    .locals 0

    sput-boolean p0, Lcom/facebook/a;->j:Z

    return-void
.end method

.method public static synthetic a()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/facebook/a;->m:Landroid/content/Context;

    return-object v0
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public static c()V
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v0, Lcom/facebook/a;->t:Ljava/lang/Boolean;

    return-void
.end method

.method public static d()Z
    .locals 1

    invoke-static {}, Lcom/facebook/b;->e()Z

    move-result v0

    return v0
.end method

.method public static e()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lsj6;->o()V

    sget-object v0, Lcom/facebook/a;->m:Landroid/content/Context;

    return-object v0
.end method

.method public static f()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lsj6;->o()V

    sget-object v0, Lcom/facebook/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public static g()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lsj6;->o()V

    sget-object v0, Lcom/facebook/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static h(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const-class v0, Lcom/facebook/a;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    invoke-static {}, Lsj6;->o()V

    if-nez p0, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    if-nez v1, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v3, 0x40

    :try_start_1
    invoke-virtual {v1, p0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz v1, :cond_4

    array-length v1, v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    :try_start_3
    const-string v1, "SHA-1"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1
    :try_end_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v3, 0x0

    aget-object p0, p0, v3

    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    const/16 v1, 0x9

    invoke-static {p0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object p0

    :catch_0
    :cond_4
    :goto_0
    return-object v2

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static i()Z
    .locals 1

    invoke-static {}, Lcom/facebook/b;->f()Z

    move-result v0

    return v0
.end method

.method public static j()Z
    .locals 1

    invoke-static {}, Lcom/facebook/b;->g()Z

    move-result v0

    return v0
.end method

.method public static k()Ljava/io/File;
    .locals 1

    invoke-static {}, Lsj6;->o()V

    sget-object v0, Lcom/facebook/a;->l:Lfx2;

    invoke-virtual {v0}, Lfx2;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    return-object v0
.end method

.method public static l()I
    .locals 1

    invoke-static {}, Lsj6;->o()V

    sget v0, Lcom/facebook/a;->n:I

    return v0
.end method

.method public static m()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lsj6;->o()V

    sget-object v0, Lcom/facebook/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public static n()Z
    .locals 1

    invoke-static {}, Lcom/facebook/b;->h()Z

    move-result v0

    return v0
.end method

.method public static o()Ljava/util/concurrent/Executor;
    .locals 2

    sget-object v0, Lcom/facebook/a;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/facebook/a;->c:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_0

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    sput-object v1, Lcom/facebook/a;->c:Ljava/util/concurrent/Executor;

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/facebook/a;->c:Ljava/util/concurrent/Executor;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static p()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/a;->h:Ljava/lang/String;

    return-object v0
.end method

.method public static q()Ljava/lang/String;
    .locals 4

    sget-object v0, Lcom/facebook/a;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    sget-object v3, Lcom/facebook/a;->p:Ljava/lang/String;

    aput-object v3, v1, v2

    const-string v2, "getGraphApiVersion: %s"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lyi6;->Y(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/a;->p:Ljava/lang/String;

    return-object v0
.end method

.method public static r()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/facebook/AccessToken;->c()Lcom/facebook/AccessToken;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lcom/facebook/a;->h:Ljava/lang/String;

    goto :goto_1

    :cond_1
    const-string v1, "gaming"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/facebook/a;->h:Ljava/lang/String;

    const-string v1, "facebook.com"

    const-string v2, "fb.gg"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/facebook/a;->h:Ljava/lang/String;

    :goto_1
    return-object v0
.end method

.method public static s(Landroid/content/Context;)Z
    .locals 2

    invoke-static {}, Lsj6;->o()V

    const-string v0, "com.facebook.sdk.appEventPreferences"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "limitEventUsage"

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static t()J
    .locals 2

    invoke-static {}, Lsj6;->o()V

    sget-object v0, Lcom/facebook/a;->i:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public static u()Ljava/lang/String;
    .locals 1

    const-string v0, "11.1.0"

    return-object v0
.end method

.method public static v()Z
    .locals 1

    sget-boolean v0, Lcom/facebook/a;->j:Z

    return v0
.end method

.method public static declared-synchronized w()Z
    .locals 2

    const-class v0, Lcom/facebook/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/facebook/a;->t:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static x()Z
    .locals 1

    sget-object v0, Lcom/facebook/a;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public static y()Z
    .locals 1

    sget-boolean v0, Lcom/facebook/a;->k:Z

    return v0
.end method

.method public static z(LSx2;)Z
    .locals 2

    sget-object v0, Lcom/facebook/a;->b:Ljava/util/HashSet;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/facebook/a;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
