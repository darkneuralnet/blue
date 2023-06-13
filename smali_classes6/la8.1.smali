.class public final Lla8;
.super Lwe8;
.source "SourceFile"


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:J

.field public final i:J

.field public j:Ljava/util/List;

.field public k:Ljava/lang/String;

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:J

.field public q:Ljava/lang/String;


# direct methods
.method public constructor <init>(LPn8;J)V
    .locals 2

    invoke-direct {p0, p1}, Lwe8;-><init>(LPn8;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lla8;->p:J

    const/4 p1, 0x0

    iput-object p1, p0, Lla8;->q:Ljava/lang/String;

    iput-wide p2, p0, Lla8;->i:J

    return-void
.end method


# virtual methods
.method public final i()V
    .locals 11

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->z()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/high16 v2, -0x80000000

    const-string v3, ""

    const/4 v4, 0x0

    const-string v5, "Unknown"

    const-string v6, "unknown"

    if-nez v1, :cond_1

    iget-object v7, p0, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->a()LFc8;

    move-result-object v7

    invoke-virtual {v7}, LFc8;->o()Lec8;

    move-result-object v7

    invoke-static {v0}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "PackageManager is null, app identity information might be inaccurate. appId"

    invoke-virtual {v7, v9, v8}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    move-object v8, v5

    goto/16 :goto_4

    :cond_1
    :try_start_0
    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v7, p0, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->a()LFc8;

    move-result-object v7

    invoke-virtual {v7}, LFc8;->o()Lec8;

    move-result-object v7

    invoke-static {v0}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "Error retrieving app installer package name. appId"

    invoke-virtual {v7, v9, v8}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    if-nez v6, :cond_2

    const-string v6, "manual_install"

    goto :goto_1

    :cond_2
    const-string v7, "com.android.vending"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move-object v6, v3

    :cond_3
    :goto_1
    :try_start_1
    iget-object v7, p0, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->z()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v7

    if-eqz v7, :cond_0

    iget-object v8, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v1, v8}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_4

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_2

    :cond_4
    move-object v8, v5

    :goto_2
    :try_start_2
    iget-object v5, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iget v2, v7, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    move-object v7, v5

    move-object v5, v8

    goto :goto_3

    :catch_2
    move-object v7, v5

    :goto_3
    iget-object v8, p0, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->a()LFc8;

    move-result-object v8

    invoke-virtual {v8}, LFc8;->o()Lec8;

    move-result-object v8

    invoke-static {v0}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    const-string v10, "Error retrieving package info. appId, appName"

    invoke-virtual {v8, v10, v9, v5}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v8, v5

    move-object v5, v7

    :goto_4
    iput-object v0, p0, Lla8;->c:Ljava/lang/String;

    iput-object v6, p0, Lla8;->f:Ljava/lang/String;

    iput-object v5, p0, Lla8;->d:Ljava/lang/String;

    iput v2, p0, Lla8;->e:I

    iput-object v8, p0, Lla8;->g:Ljava/lang/String;

    const-wide/16 v5, 0x0

    iput-wide v5, p0, Lla8;->h:J

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->O()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->P()Ljava/lang/String;

    move-result-object v2

    const-string v5, "am"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x1

    goto :goto_5

    :cond_5
    move v2, v4

    :goto_5
    iget-object v5, p0, Lns8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->u()I

    move-result v5

    packed-switch v5, :pswitch_data_0

    iget-object v6, p0, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->r()Lec8;

    move-result-object v6

    const-string v7, "App measurement disabled due to denied storage consent"

    invoke-virtual {v6, v7}, Lec8;->a(Ljava/lang/String;)V

    goto/16 :goto_6

    :pswitch_0
    iget-object v6, p0, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->r()Lec8;

    move-result-object v6

    const-string v7, "App measurement disabled via the global data collection setting"

    invoke-virtual {v6, v7}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_6

    :pswitch_1
    iget-object v6, p0, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->u()Lec8;

    move-result-object v6

    const-string v7, "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"

    invoke-virtual {v6, v7}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_6

    :pswitch_2
    iget-object v6, p0, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->s()Lec8;

    move-result-object v6

    const-string v7, "App measurement disabled via the init parameters"

    invoke-virtual {v6, v7}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_6

    :pswitch_3
    iget-object v6, p0, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->r()Lec8;

    move-result-object v6

    const-string v7, "App measurement disabled via the manifest"

    invoke-virtual {v6, v7}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_6

    :pswitch_4
    iget-object v6, p0, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->r()Lec8;

    move-result-object v6

    const-string v7, "App measurement disabled by setAnalyticsCollectionEnabled(false)"

    invoke-virtual {v6, v7}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_6

    :pswitch_5
    iget-object v6, p0, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->s()Lec8;

    move-result-object v6

    const-string v7, "App measurement deactivated via the init parameters"

    invoke-virtual {v6, v7}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_6

    :pswitch_6
    iget-object v6, p0, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->r()Lec8;

    move-result-object v6

    const-string v7, "App measurement deactivated via the manifest"

    invoke-virtual {v6, v7}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_6

    :pswitch_7
    iget-object v6, p0, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->s()Lec8;

    move-result-object v6

    const-string v7, "App measurement collection enabled"

    invoke-virtual {v6, v7}, Lec8;->a(Ljava/lang/String;)V

    :goto_6
    iput-object v3, p0, Lla8;->m:Ljava/lang/String;

    iput-object v3, p0, Lla8;->n:Ljava/lang/String;

    iget-object v6, p0, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->C()LFg7;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->O()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lla8;->n:Ljava/lang/String;

    :cond_6
    :try_start_3
    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->z()Landroid/content/Context;

    move-result-object v2

    iget-object v6, p0, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->R()Ljava/lang/String;

    move-result-object v6

    const-string v7, "google_app_id"

    invoke-static {v2, v7, v6}, LjE8;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_7

    :cond_7
    move-object v3, v2

    :goto_7
    iput-object v3, p0, Lla8;->m:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->z()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->R()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_8

    :cond_8
    invoke-static {v2}, Lbl8;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    :goto_8
    const-string v2, "admob_app_id"

    invoke-static {v2, v6, v3}, Lbl8;->b(Ljava/lang/String;Landroid/content/res/Resources;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lla8;->n:Ljava/lang/String;

    :cond_9
    if-nez v5, :cond_b

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->s()Lec8;

    move-result-object v2

    const-string v3, "App measurement enabled for app package, google app id"

    iget-object v5, p0, Lla8;->c:Ljava/lang/String;

    iget-object v6, p0, Lla8;->m:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_a

    iget-object v6, p0, Lla8;->n:Ljava/lang/String;

    goto :goto_9

    :cond_a
    iget-object v6, p0, Lla8;->m:Ljava/lang/String;

    :goto_9
    invoke-virtual {v2, v3, v5, v6}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_a

    :catch_3
    move-exception v2

    iget-object v3, p0, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    invoke-static {v0}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v5, "Fetching Google App Id failed with exception. appId"

    invoke-virtual {v3, v5, v0, v2}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    :goto_a
    const/4 v0, 0x0

    iput-object v0, p0, Lla8;->j:Ljava/util/List;

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->C()LFg7;

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    const-string v2, "analytics.safelisted_events"

    invoke-virtual {v0, v2}, Lgl7;->v(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_c

    goto :goto_b

    :cond_c
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->u()Lec8;

    move-result-object v0

    const-string v2, "Safelisted event list is empty. Ignoring"

    invoke-virtual {v0, v2}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_c

    :cond_d
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v5, p0, Lns8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->N()LOW8;

    move-result-object v5

    const-string v6, "safelisted event"

    invoke-virtual {v5, v6, v3}, LOW8;->R(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_c

    :cond_f
    :goto_b
    iput-object v0, p0, Lla8;->j:Ljava/util/List;

    :goto_c
    if-eqz v1, :cond_10

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/InstantApps;->isInstantApp(Landroid/content/Context;)Z

    move-result v0

    iput v0, p0, Lla8;->l:I

    return-void

    :cond_10
    iput v4, p0, Lla8;->l:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final l()I
    .locals 1

    invoke-virtual {p0}, Lwe8;->f()V

    iget v0, p0, Lla8;->l:I

    return v0
.end method

.method public final m()I
    .locals 1

    invoke-virtual {p0}, Lwe8;->f()V

    iget v0, p0, Lla8;->e:I

    return v0
.end method

.method public final n(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzq;
    .locals 40

    move-object/from16 v1, p0

    invoke-virtual/range {p0 .. p0}, Lns8;->e()V

    new-instance v36, Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual/range {p0 .. p0}, Lla8;->p()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lla8;->q()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lwe8;->f()V

    iget-object v5, v1, Lla8;->d:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lwe8;->f()V

    iget v0, v1, Lla8;->e:I

    int-to-long v6, v0

    invoke-virtual/range {p0 .. p0}, Lwe8;->f()V

    iget-object v0, v1, Lla8;->f:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v1, Lla8;->f:Ljava/lang/String;

    iget-object v0, v1, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->n()J

    invoke-virtual/range {p0 .. p0}, Lwe8;->f()V

    invoke-virtual/range {p0 .. p0}, Lns8;->e()V

    iget-wide v9, v1, Lla8;->h:J

    const-wide/16 v11, 0x0

    cmp-long v0, v9, v11

    const/4 v2, 0x0

    if-nez v0, :cond_4

    iget-object v0, v1, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->N()LOW8;

    move-result-object v9

    iget-object v0, v1, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    iget-object v10, v1, Lns8;->a:LPn8;

    invoke-virtual {v10}, LPn8;->z()Landroid/content/Context;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9}, Lns8;->e()V

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v13

    invoke-static {}, LOW8;->q()Ljava/security/MessageDigest;

    move-result-object v14

    const-wide/16 v15, -0x1

    if-nez v14, :cond_0

    iget-object v0, v9, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    const-string v9, "Could not get MD5 instance"

    invoke-virtual {v0, v9}, Lec8;->a(Ljava/lang/String;)V

    :goto_0
    move-wide v9, v15

    goto :goto_1

    :cond_0
    if-eqz v13, :cond_3

    :try_start_0
    invoke-virtual {v9, v0, v10}, LOW8;->W(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v0

    iget-object v10, v9, Lns8;->a:LPn8;

    invoke-virtual {v10}, LPn8;->z()Landroid/content/Context;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    const/16 v13, 0x40

    invoke-virtual {v0, v10, v13}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz v0, :cond_1

    array-length v10, v0

    if-lez v10, :cond_1

    aget-object v0, v0, v2

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    invoke-static {v0}, LOW8;->s0([B)J

    move-result-wide v9

    move-wide v15, v9

    goto :goto_0

    :cond_1
    iget-object v0, v9, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->t()Lec8;

    move-result-object v0

    const-string v10, "Could not get signatures"

    invoke-virtual {v0, v10}, Lec8;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    move-wide v15, v11

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v9, v9, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->a()LFc8;

    move-result-object v9

    invoke-virtual {v9}, LFc8;->o()Lec8;

    move-result-object v9

    const-string v10, "Package name not found"

    invoke-virtual {v9, v10, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    move-wide v9, v11

    :goto_1
    iput-wide v9, v1, Lla8;->h:J

    :cond_4
    move-wide v13, v9

    iget-object v0, v1, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->l()Z

    move-result v0

    iget-object v9, v1, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->F()LIh8;

    move-result-object v9

    iget-boolean v9, v9, LIh8;->q:Z

    const/4 v10, 0x1

    xor-int/lit8 v15, v9, 0x1

    invoke-virtual/range {p0 .. p0}, Lns8;->e()V

    iget-object v9, v1, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->l()Z

    move-result v9

    const/4 v11, 0x0

    if-nez v9, :cond_5

    :goto_2
    move-object/from16 v20, v11

    goto/16 :goto_4

    :cond_5
    invoke-static {}, LFm9;->b()Z

    iget-object v9, v1, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->w()Lgl7;

    move-result-object v9

    sget-object v12, La98;->e0:LL88;

    invoke-virtual {v9, v11, v12}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v9

    if-eqz v9, :cond_6

    iget-object v9, v1, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->a()LFc8;

    move-result-object v9

    invoke-virtual {v9}, LFc8;->s()Lec8;

    move-result-object v9

    const-string v12, "Disabled IID for tests."

    invoke-virtual {v9, v12}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    :try_start_1
    iget-object v9, v1, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->z()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    const-string v12, "com.google.firebase.analytics.FirebaseAnalytics"

    invoke-virtual {v9, v12}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_3

    if-nez v9, :cond_7

    goto :goto_2

    :cond_7
    :try_start_2
    const-string v12, "getInstance"

    new-array v11, v10, [Ljava/lang/Class;

    const-class v19, Landroid/content/Context;

    aput-object v19, v11, v2

    invoke-virtual {v9, v12, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    new-array v12, v10, [Ljava/lang/Object;

    iget-object v10, v1, Lns8;->a:LPn8;

    invoke-virtual {v10}, LPn8;->z()Landroid/content/Context;

    move-result-object v10

    aput-object v10, v12, v2

    const/4 v10, 0x0

    invoke-virtual {v11, v10, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-nez v11, :cond_8

    goto :goto_3

    :cond_8
    :try_start_3
    const-string v10, "getFirebaseInstanceId"

    new-array v12, v2, [Ljava/lang/Class;

    invoke-virtual {v9, v10, v12}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    new-array v10, v2, [Ljava/lang/Object;

    invoke-virtual {v9, v11, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-object/from16 v20, v9

    goto :goto_4

    :catch_1
    iget-object v9, v1, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->a()LFc8;

    move-result-object v9

    invoke-virtual {v9}, LFc8;->u()Lec8;

    move-result-object v9

    const-string v10, "Failed to retrieve Firebase Instance Id"

    invoke-virtual {v9, v10}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_3

    :catch_2
    iget-object v9, v1, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->a()LFc8;

    move-result-object v9

    invoke-virtual {v9}, LFc8;->v()Lec8;

    move-result-object v9

    const-string v10, "Failed to obtain Firebase Analytics instance"

    invoke-virtual {v9, v10}, Lec8;->a(Ljava/lang/String;)V

    :catch_3
    :goto_3
    const/16 v20, 0x0

    :goto_4
    iget-object v9, v1, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->F()LIh8;

    move-result-object v10

    iget-object v10, v10, LIh8;->e:Lzg8;

    invoke-virtual {v10}, Lzg8;->a()J

    move-result-wide v10

    const-wide/16 v16, 0x0

    cmp-long v12, v10, v16

    if-nez v12, :cond_9

    iget-wide v9, v9, LPn8;->G:J

    move-object v12, v3

    move-wide/from16 v22, v9

    goto :goto_5

    :cond_9
    move-object v12, v3

    iget-wide v2, v9, LPn8;->G:J

    invoke-static {v2, v3, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    move-wide/from16 v22, v2

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lwe8;->f()V

    iget v11, v1, Lla8;->l:I

    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->w()Lgl7;

    move-result-object v2

    invoke-virtual {v2}, Lgl7;->x()Z

    move-result v24

    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->F()LIh8;

    move-result-object v2

    invoke-virtual {v2}, Lns8;->e()V

    invoke-virtual {v2}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "deferred_analytics_collection"

    const/4 v9, 0x0

    invoke-interface {v2, v3, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v25

    invoke-virtual/range {p0 .. p0}, Lwe8;->f()V

    iget-object v3, v1, Lla8;->n:Ljava/lang/String;

    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->w()Lgl7;

    move-result-object v2

    const-string v9, "google_analytics_default_allow_ad_personalization_signals"

    invoke-virtual {v2, v9}, Lgl7;->q(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    if-nez v2, :cond_a

    const/16 v26, 0x0

    goto :goto_6

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v9, 0x1

    xor-int/2addr v2, v9

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    move-object/from16 v26, v2

    :goto_6
    iget-wide v9, v1, Lla8;->i:J

    iget-object v2, v1, Lla8;->j:Ljava/util/List;

    move-object/from16 v19, v2

    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->F()LIh8;

    move-result-object v2

    invoke-virtual {v2}, LIh8;->n()LXm7;

    move-result-object v2

    invoke-virtual {v2}, LXm7;->h()Ljava/lang/String;

    move-result-object v30

    iget-object v2, v1, Lla8;->k:Ljava/lang/String;

    if-nez v2, :cond_b

    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->N()LOW8;

    move-result-object v2

    invoke-virtual {v2}, LOW8;->n()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lla8;->k:Ljava/lang/String;

    :cond_b
    iget-object v2, v1, Lla8;->k:Ljava/lang/String;

    invoke-static {}, Ltk9;->b()Z

    move-object/from16 v27, v2

    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->w()Lgl7;

    move-result-object v2

    move-object/from16 v28, v3

    sget-object v3, La98;->p0:LL88;

    move-wide/from16 v31, v9

    const/4 v9, 0x0

    invoke-virtual {v2, v9, v3}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual/range {p0 .. p0}, Lns8;->e()V

    iget-wide v2, v1, Lla8;->p:J

    const-wide/16 v9, 0x0

    cmp-long v2, v2, v9

    if-nez v2, :cond_c

    goto :goto_7

    :cond_c
    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v9, v1, Lla8;->p:J

    sub-long/2addr v2, v9

    iget-object v9, v1, Lla8;->o:Ljava/lang/String;

    if-eqz v9, :cond_d

    const-wide/32 v9, 0x5265c00

    cmp-long v2, v2, v9

    if-lez v2, :cond_d

    iget-object v2, v1, Lla8;->q:Ljava/lang/String;

    if-nez v2, :cond_d

    invoke-virtual/range {p0 .. p0}, Lla8;->s()V

    :cond_d
    :goto_7
    iget-object v2, v1, Lla8;->o:Ljava/lang/String;

    if-nez v2, :cond_e

    invoke-virtual/range {p0 .. p0}, Lla8;->s()V

    :cond_e
    iget-object v2, v1, Lla8;->o:Ljava/lang/String;

    move-object/from16 v33, v2

    goto :goto_8

    :cond_f
    const/16 v33, 0x0

    :goto_8
    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->w()Lgl7;

    move-result-object v2

    iget-object v3, v2, Lns8;->a:LPn8;

    const-string v3, "google_analytics_sgtm_upload_enabled"

    invoke-virtual {v2, v3}, Lgl7;->q(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    if-nez v2, :cond_10

    const/16 v34, 0x0

    goto :goto_9

    :cond_10
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move/from16 v34, v2

    :goto_9
    invoke-static {}, LYg9;->b()Z

    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->w()Lgl7;

    move-result-object v2

    sget-object v3, La98;->F0:LL88;

    const/4 v9, 0x0

    invoke-virtual {v2, v9, v3}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->N()LOW8;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lla8;->p()Ljava/lang/String;

    move-result-object v3

    iget-object v9, v2, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->z()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v9

    if-nez v9, :cond_11

    const-wide/16 v16, 0x0

    goto :goto_b

    :cond_11
    :try_start_4
    iget-object v9, v2, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->z()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v9
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_4

    const/4 v10, 0x0

    :try_start_5
    invoke-virtual {v9, v3, v10}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v9

    if-eqz v9, :cond_12

    iget v2, v9, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_a

    :catch_4
    const/4 v10, 0x0

    :catch_5
    iget-object v9, v2, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->C()LFg7;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->r()Lec8;

    move-result-object v2

    const-string v9, "PackageManager failed to find running app: app_id"

    invoke-virtual {v2, v9, v3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_12
    move v2, v10

    :goto_a
    int-to-long v2, v2

    move-wide/from16 v16, v2

    :goto_b
    move-wide/from16 v37, v16

    goto :goto_c

    :cond_13
    const-wide/16 v37, 0x0

    :goto_c
    const-wide/32 v9, 0x12cc8

    const-wide/16 v17, 0x0

    const/16 v29, 0x0

    move-object/from16 v35, v19

    move-object/from16 v39, v27

    move-object/from16 v2, v36

    move-object/from16 v27, v28

    move-object v3, v12

    move/from16 v21, v11

    move-wide v11, v13

    move-object/from16 v13, p1

    move v14, v0

    move-object/from16 v16, v20

    move-wide/from16 v19, v22

    move/from16 v22, v24

    move/from16 v23, v25

    move-object/from16 v24, v27

    move-object/from16 v25, v26

    move-wide/from16 v26, v31

    move-object/from16 v28, v35

    move-object/from16 v31, v39

    move-object/from16 v32, v33

    move/from16 v33, v34

    move-wide/from16 v34, v37

    invoke-direct/range {v2 .. v35}, Lcom/google/android/gms/measurement/internal/zzq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V

    return-object v36
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lwe8;->f()V

    iget-object v0, p0, Lla8;->n:Ljava/lang/String;

    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lwe8;->f()V

    iget-object v0, p0, Lla8;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lla8;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    iget-object v0, p0, Lla8;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lla8;->m:Ljava/lang/String;

    return-object v0
.end method

.method public final r()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lla8;->j:Ljava/util/List;

    return-object v0
.end method

.method public final s()V
    .locals 6

    invoke-virtual {p0}, Lns8;->e()V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    invoke-virtual {v0}, LIh8;->n()LXm7;

    move-result-object v0

    sget-object v1, Lcm7;->d:Lcm7;

    invoke-virtual {v0, v1}, LXm7;->i(Lcm7;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    const-string v3, "Analytics Storage consent is not granted"

    invoke-virtual {v0, v3}, Lec8;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    new-array v0, v0, [B

    iget-object v3, p0, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->N()LOW8;

    move-result-object v3

    invoke-virtual {v3}, LOW8;->r()Ljava/security/SecureRandom;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v4, v2, [Ljava/lang/Object;

    new-instance v5, Ljava/math/BigInteger;

    invoke-direct {v5, v2, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    aput-object v5, v4, v1

    const-string v0, "%032x"

    invoke-static {v3, v0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v3, p0, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->n()Lec8;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/Object;

    if-nez v0, :cond_1

    const-string v4, "null"

    goto :goto_1

    :cond_1
    const-string v4, "not null"

    :goto_1
    aput-object v4, v2, v1

    const-string v1, "Resetting session stitching token to %s"

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lec8;->a(Ljava/lang/String;)V

    iput-object v0, p0, Lla8;->o:Ljava/lang/String;

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lla8;->p:J

    return-void
.end method

.method public final t(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lla8;->q:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    iput-object p1, p0, Lla8;->q:Ljava/lang/String;

    return v1
.end method
