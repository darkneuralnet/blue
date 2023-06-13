.class public Lcom/facebook/login/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/d$e;,
        Lcom/facebook/login/d$d;,
        Lcom/facebook/login/d$c;
    }
.end annotation


# static fields
.field public static final g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static volatile h:Lcom/facebook/login/d;


# instance fields
.field public a:Lay2;

.field public b:LrW0;

.field public final c:Landroid/content/SharedPreferences;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/facebook/login/d;->d()Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/facebook/login/d;->g:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lay2;->h:Lay2;

    iput-object v0, p0, Lcom/facebook/login/d;->a:Lay2;

    sget-object v0, LrW0;->e:LrW0;

    iput-object v0, p0, Lcom/facebook/login/d;->b:LrW0;

    const-string v0, "rerequest"

    iput-object v0, p0, Lcom/facebook/login/d;->d:Ljava/lang/String;

    invoke-static {}, Lsj6;->o()V

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.facebook.loginManager"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/login/d;->c:Landroid/content/SharedPreferences;

    sget-boolean v0, Lcom/facebook/a;->q:Z

    if-eqz v0, :cond_0

    invoke-static {}, LtF0;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, LsF0;

    invoke-direct {v0}, LsF0;-><init>()V

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.android.chrome"

    invoke-static {v1, v2, v0}, LvF0;->a(Landroid/content/Context;Ljava/lang/String;LyF0;)Z

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LvF0;->b(Landroid/content/Context;Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public static c()Lcom/facebook/login/d;
    .locals 2

    sget-object v0, Lcom/facebook/login/d;->h:Lcom/facebook/login/d;

    if-nez v0, :cond_1

    const-class v0, Lcom/facebook/login/d;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/facebook/login/d;->h:Lcom/facebook/login/d;

    if-nez v1, :cond_0

    new-instance v1, Lcom/facebook/login/d;

    invoke-direct {v1}, Lcom/facebook/login/d;-><init>()V

    sput-object v1, Lcom/facebook/login/d;->h:Lcom/facebook/login/d;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/facebook/login/d;->h:Lcom/facebook/login/d;

    return-object v0
.end method

.method public static d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/login/d$a;

    invoke-direct {v0}, Lcom/facebook/login/d$a;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 1

    if-eqz p0, :cond_1

    const-string v0, "publish"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "manage"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/login/d;->g:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a(Ljava/util/Collection;)Lcom/facebook/login/LoginClient$Request;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/login/LoginClient$Request;"
        }
    .end annotation

    new-instance v7, Lcom/facebook/login/LoginClient$Request;

    iget-object v1, p0, Lcom/facebook/login/d;->a:Lay2;

    new-instance v0, Ljava/util/HashSet;

    if-eqz p1, :cond_0

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    :goto_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/login/d;->b:LrW0;

    iget-object v4, p0, Lcom/facebook/login/d;->d:Ljava/lang/String;

    invoke-static {}, Lcom/facebook/a;->f()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/facebook/login/LoginClient$Request;-><init>(Lay2;Ljava/util/Set;LrW0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/AccessToken;->o()Z

    move-result p1

    invoke-virtual {v7, p1}, Lcom/facebook/login/LoginClient$Request;->r(Z)V

    iget-object p1, p0, Lcom/facebook/login/d;->e:Ljava/lang/String;

    invoke-virtual {v7, p1}, Lcom/facebook/login/LoginClient$Request;->p(Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/facebook/login/d;->f:Z

    invoke-virtual {v7, p1}, Lcom/facebook/login/LoginClient$Request;->s(Z)V

    return-object v7
.end method

.method public b(Lcom/facebook/login/LoginClient$Request;)Landroid/content/Intent;
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/FacebookActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/facebook/login/LoginClient$Request;->h()Lay2;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "request"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "com.facebook.LoginFragment:Request"

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-object v0
.end method

.method public final f(Landroid/content/Context;Lcom/facebook/login/LoginClient$Result$b;Ljava/util/Map;Ljava/lang/Exception;ZLcom/facebook/login/LoginClient$Request;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/login/LoginClient$Result$b;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Exception;",
            "Z",
            "Lcom/facebook/login/LoginClient$Request;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Lcom/facebook/login/d$e;->a(Landroid/content/Context;)Lcom/facebook/login/c;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p6, :cond_1

    const-string p1, "fb_mobile_login_complete"

    const-string p2, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest."

    invoke-virtual {v0, p1, p2}, Lcom/facebook/login/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    if-eqz p5, :cond_2

    const-string p1, "1"

    goto :goto_0

    :cond_2
    const-string p1, "0"

    :goto_0
    const-string p5, "try_login_activity"

    invoke-virtual {v2, p5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p6}, Lcom/facebook/login/LoginClient$Request;->b()Ljava/lang/String;

    move-result-object v1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/login/c;->f(Ljava/lang/String;Ljava/util/Map;Lcom/facebook/login/LoginClient$Result$b;Ljava/util/Map;Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method public g(LIy1;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LIy1;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/facebook/login/d;->a(Ljava/util/Collection;)Lcom/facebook/login/LoginClient$Request;

    move-result-object p2

    new-instance v0, Lcom/facebook/login/d$d;

    invoke-direct {v0, p1}, Lcom/facebook/login/d$d;-><init>(LIy1;)V

    invoke-virtual {p0, v0, p2}, Lcom/facebook/login/d;->t(LGO5;Lcom/facebook/login/LoginClient$Request;)V

    return-void
.end method

.method public h(Landroid/app/Activity;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/facebook/login/d;->a(Ljava/util/Collection;)Lcom/facebook/login/LoginClient$Request;

    move-result-object p2

    new-instance v0, Lcom/facebook/login/d$c;

    invoke-direct {v0, p1}, Lcom/facebook/login/d$c;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p0, v0, p2}, Lcom/facebook/login/d;->t(LGO5;Lcom/facebook/login/LoginClient$Request;)V

    return-void
.end method

.method public i(Landroid/app/Fragment;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Fragment;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, LIy1;

    invoke-direct {v0, p1}, LIy1;-><init>(Landroid/app/Fragment;)V

    invoke-virtual {p0, v0, p2}, Lcom/facebook/login/d;->g(LIy1;Ljava/util/Collection;)V

    return-void
.end method

.method public j(Landroidx/fragment/app/Fragment;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/Fragment;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, LIy1;

    invoke-direct {v0, p1}, LIy1;-><init>(Landroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, v0, p2}, Lcom/facebook/login/d;->g(LIy1;Ljava/util/Collection;)V

    return-void
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/facebook/AccessToken;->q(Lcom/facebook/AccessToken;)V

    invoke-static {v0}, Lcom/facebook/Profile;->e(Lcom/facebook/Profile;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/login/d;->p(Z)V

    return-void
.end method

.method public final l(Landroid/content/Context;Lcom/facebook/login/LoginClient$Request;)V
    .locals 0

    invoke-static {p1}, Lcom/facebook/login/d$e;->a(Landroid/content/Context;)Lcom/facebook/login/c;

    move-result-object p1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lcom/facebook/login/c;->h(Lcom/facebook/login/LoginClient$Request;)V

    :cond_0
    return-void
.end method

.method public final m(Landroid/content/Intent;)Z
    .locals 2

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public n(Ljava/lang/String;)Lcom/facebook/login/d;
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/d;->d:Ljava/lang/String;

    return-object p0
.end method

.method public o(LrW0;)Lcom/facebook/login/d;
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/d;->b:LrW0;

    return-object p0
.end method

.method public final p(Z)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/login/d;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "express_login_allowed"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public q(Lay2;)Lcom/facebook/login/d;
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/d;->a:Lay2;

    return-object p0
.end method

.method public r(Ljava/lang/String;)Lcom/facebook/login/d;
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/d;->e:Ljava/lang/String;

    return-object p0
.end method

.method public s(Z)Lcom/facebook/login/d;
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/login/d;->f:Z

    return-object p0
.end method

.method public final t(LGO5;Lcom/facebook/login/LoginClient$Request;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/facebook/FacebookException;
        }
    .end annotation

    invoke-interface {p1}, LGO5;->a()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/facebook/login/d;->l(Landroid/content/Context;Lcom/facebook/login/LoginClient$Request;)V

    sget-object v0, LM80$c;->c:LM80$c;

    invoke-virtual {v0}, LM80$c;->a()I

    move-result v0

    new-instance v1, Lcom/facebook/login/d$b;

    invoke-direct {v1, p0}, Lcom/facebook/login/d$b;-><init>(Lcom/facebook/login/d;)V

    invoke-static {v0, v1}, LM80;->b(ILM80$a;)V

    invoke-virtual {p0, p1, p2}, Lcom/facebook/login/d;->u(LGO5;Lcom/facebook/login/LoginClient$Request;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest."

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    invoke-interface {p1}, LGO5;->a()Landroid/app/Activity;

    move-result-object v2

    sget-object v3, Lcom/facebook/login/LoginClient$Result$b;->e:Lcom/facebook/login/LoginClient$Result$b;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v5, v0

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, Lcom/facebook/login/d;->f(Landroid/content/Context;Lcom/facebook/login/LoginClient$Result$b;Ljava/util/Map;Ljava/lang/Exception;ZLcom/facebook/login/LoginClient$Request;)V

    throw v0
.end method

.method public final u(LGO5;Lcom/facebook/login/LoginClient$Request;)Z
    .locals 2

    invoke-virtual {p0, p2}, Lcom/facebook/login/d;->b(Lcom/facebook/login/LoginClient$Request;)Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/facebook/login/d;->m(Landroid/content/Intent;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/facebook/login/LoginClient;->q()I

    move-result v0

    invoke-interface {p1, p2, v0}, LGO5;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    return v1
.end method
