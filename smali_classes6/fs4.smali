.class public final Lfs4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lcom/google/android/gms/common/GoogleApiAvailabilityLight; = null

.field public static b:I = 0x1


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailabilityLight;

    move-result-object v0

    sput-object v0, Lfs4;->a:Lcom/google/android/gms/common/GoogleApiAvailabilityLight;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lgs4;
    .locals 1

    invoke-static {p0}, Lfs4;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LGt7;->a(Landroid/content/Context;)LGt7;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LvE7;

    invoke-direct {v0, p0}, LvE7;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 5

    sget-object v0, LeP7;->a:Ljava/lang/String;

    sget v0, Lfs4;->b:I

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-ne v0, v3, :cond_2

    sget-object v0, Lfs4;->a:Lcom/google/android/gms/common/GoogleApiAvailabilityLight;

    const v4, 0x1160f98

    invoke-virtual {v0, p0, v4}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->isGooglePlayServicesAvailable(Landroid/content/Context;I)I

    move-result p0

    if-eq p0, v3, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    if-ne p0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    sput p0, Lfs4;->b:I

    goto :goto_1

    :cond_1
    :goto_0
    sput v2, Lfs4;->b:I

    :cond_2
    :goto_1
    sget p0, Lfs4;->b:I

    if-eqz p0, :cond_4

    if-ne p0, v2, :cond_3

    return v3

    :cond_3
    const/4 p0, 0x0

    return p0

    :cond_4
    throw v1

    :cond_5
    throw v1
.end method
