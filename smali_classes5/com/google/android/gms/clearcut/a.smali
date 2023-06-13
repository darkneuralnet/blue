.class public final Lcom/google/android/gms/clearcut/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/clearcut/a$a;,
        Lcom/google/android/gms/clearcut/a$d;,
        Lcom/google/android/gms/clearcut/a$b;,
        Lcom/google/android/gms/clearcut/a$c;
    }
.end annotation


# static fields
.field public static final n:Lcom/google/android/gms/common/api/Api$ClientKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api$ClientKey<",
            "LmH8;",
            ">;"
        }
    .end annotation
.end field

.field public static final o:Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api$AbstractClientBuilder<",
            "LmH8;",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final p:Lcom/google/android/gms/common/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api<",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final q:[Lcom/google/android/gms/phenotype/ExperimentTokens;

.field public static final r:[Ljava/lang/String;

.field public static final s:[[B


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public final h:Z

.field public i:LMn8;

.field public final j:LYB7;

.field public final k:Lcom/google/android/gms/common/util/Clock;

.field public l:Lcom/google/android/gms/clearcut/a$d;

.field public final m:Lcom/google/android/gms/clearcut/a$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/Api$ClientKey;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/Api$ClientKey;-><init>()V

    sput-object v0, Lcom/google/android/gms/clearcut/a;->n:Lcom/google/android/gms/common/api/Api$ClientKey;

    new-instance v1, LCe7;

    invoke-direct {v1}, LCe7;-><init>()V

    sput-object v1, Lcom/google/android/gms/clearcut/a;->o:Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;

    new-instance v2, Lcom/google/android/gms/common/api/Api;

    const-string v3, "ClearcutLogger.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;Lcom/google/android/gms/common/api/Api$ClientKey;)V

    sput-object v2, Lcom/google/android/gms/clearcut/a;->p:Lcom/google/android/gms/common/api/Api;

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/google/android/gms/phenotype/ExperimentTokens;

    sput-object v1, Lcom/google/android/gms/clearcut/a;->q:[Lcom/google/android/gms/phenotype/ExperimentTokens;

    new-array v1, v0, [Ljava/lang/String;

    sput-object v1, Lcom/google/android/gms/clearcut/a;->r:[Ljava/lang/String;

    new-array v0, v0, [[B

    sput-object v0, Lcom/google/android/gms/clearcut/a;->s:[[B

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLYB7;Lcom/google/android/gms/common/util/Clock;Lcom/google/android/gms/clearcut/a$d;Lcom/google/android/gms/clearcut/a$b;)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, -0x1

    iput p2, p0, Lcom/google/android/gms/clearcut/a;->e:I

    sget-object p5, LMn8;->c:LMn8;

    iput-object p5, p0, Lcom/google/android/gms/clearcut/a;->i:LMn8;

    iput-object p1, p0, Lcom/google/android/gms/clearcut/a;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p9

    iput-object p9, p0, Lcom/google/android/gms/clearcut/a;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/clearcut/a;->b(Landroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/clearcut/a;->c:I

    iput p2, p0, Lcom/google/android/gms/clearcut/a;->e:I

    iput-object p3, p0, Lcom/google/android/gms/clearcut/a;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/clearcut/a;->f:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/clearcut/a;->g:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/google/android/gms/clearcut/a;->h:Z

    iput-object p7, p0, Lcom/google/android/gms/clearcut/a;->j:LYB7;

    iput-object p8, p0, Lcom/google/android/gms/clearcut/a;->k:Lcom/google/android/gms/common/util/Clock;

    new-instance p1, Lcom/google/android/gms/clearcut/a$d;

    invoke-direct {p1}, Lcom/google/android/gms/clearcut/a$d;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/clearcut/a;->l:Lcom/google/android/gms/clearcut/a$d;

    iput-object p5, p0, Lcom/google/android/gms/clearcut/a;->i:LMn8;

    iput-object p10, p0, Lcom/google/android/gms/clearcut/a;->m:Lcom/google/android/gms/clearcut/a$b;

    if-eqz p6, :cond_1

    if-nez p4, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string p2, "can\'t be anonymous with an upload account"

    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    const/4 v2, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {p1}, LO68;->i(Landroid/content/Context;)LYB7;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v8

    const/4 v9, 0x0

    new-instance v10, Lcom/google/android/gms/internal/clearcut/p;

    invoke-direct {v10, p1}, Lcom/google/android/gms/internal/clearcut/p;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/clearcut/a;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLYB7;Lcom/google/android/gms/common/util/Clock;Lcom/google/android/gms/clearcut/a$d;Lcom/google/android/gms/clearcut/a$b;)V

    return-void
.end method

.method public static b(Landroid/content/Context;)I
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget v0, p0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string v1, "ClearcutLogger"

    const-string v2, "This can\'t happen."

    invoke-static {v1, v2, p0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return v0
.end method

.method public static synthetic c(Lcom/google/android/gms/clearcut/a;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/clearcut/a;->e:I

    return p0
.end method

.method public static d(Ljava/util/ArrayList;)[I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)[I"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [I

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v2, v2, 0x1

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/lit8 v5, v3, 0x1

    aput v4, v0, v3

    move v3, v5

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static synthetic e(Lcom/google/android/gms/clearcut/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/clearcut/a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic f(Ljava/util/ArrayList;)[I
    .locals 0

    const/4 p0, 0x0

    invoke-static {p0}, Lcom/google/android/gms/clearcut/a;->d(Ljava/util/ArrayList;)[I

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/google/android/gms/clearcut/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/clearcut/a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic h(Lcom/google/android/gms/clearcut/a;)LMn8;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/clearcut/a;->i:LMn8;

    return-object p0
.end method

.method public static synthetic i(Lcom/google/android/gms/clearcut/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/clearcut/a;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic j(Lcom/google/android/gms/clearcut/a;)Lcom/google/android/gms/common/util/Clock;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/clearcut/a;->k:Lcom/google/android/gms/common/util/Clock;

    return-object p0
.end method

.method public static synthetic k(Lcom/google/android/gms/clearcut/a;)Lcom/google/android/gms/clearcut/a$d;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/clearcut/a;->l:Lcom/google/android/gms/clearcut/a$d;

    return-object p0
.end method

.method public static synthetic l(Lcom/google/android/gms/clearcut/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/clearcut/a;->h:Z

    return p0
.end method

.method public static synthetic m(Lcom/google/android/gms/clearcut/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/clearcut/a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic n(Lcom/google/android/gms/clearcut/a;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/clearcut/a;->c:I

    return p0
.end method

.method public static synthetic o(Lcom/google/android/gms/clearcut/a;)Lcom/google/android/gms/clearcut/a$b;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/clearcut/a;->m:Lcom/google/android/gms/clearcut/a$b;

    return-object p0
.end method

.method public static synthetic p(Lcom/google/android/gms/clearcut/a;)LYB7;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/clearcut/a;->j:LYB7;

    return-object p0
.end method


# virtual methods
.method public final a([B)Lcom/google/android/gms/clearcut/a$a;
    .locals 2
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    new-instance v0, Lcom/google/android/gms/clearcut/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/clearcut/a$a;-><init>(Lcom/google/android/gms/clearcut/a;[BLCe7;)V

    return-object v0
.end method
