.class public final Lxi8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LPn8;


# direct methods
.method public constructor <init>(LhV8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LhV8;->c0()LPn8;

    move-result-object p1

    iput-object p1, p0, Lxi8;->a:LPn8;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lxi8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->z()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lxi8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v1

    const-string v2, "Failed to get PackageManager for Install Referrer Play Store compatibility check"

    invoke-virtual {v1, v2}, Lec8;->a(Ljava/lang/String;)V

    return v0

    :cond_0
    const-string v2, "com.android.vending"

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v2, 0x4d17ab4

    if-lt v1, v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    :catch_0
    move-exception v1

    iget-object v2, p0, Lxi8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->s()Lec8;

    move-result-object v2

    const-string v3, "Failed to retrieve Play Store version for Install Referrer"

    invoke-virtual {v2, v3, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return v0
.end method
