.class public final LX49;
.super LKn2;
.source "SourceFile"


# instance fields
.field public final b:LyU2;


# direct methods
.method public constructor <init>(LyU2;)V
    .locals 0

    invoke-direct {p0}, LKn2;-><init>()V

    iput-object p1, p0, LX49;->b:LyU2;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Lx26;

    invoke-interface {p1}, Lx26;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzn9;->b(Ljava/lang/String;)Lmm9;

    move-result-object v0

    new-instance v1, Lz26;

    iget-object v2, p0, LX49;->b:LyU2;

    invoke-virtual {v2}, LyU2;->b()Landroid/content/Context;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailabilityLight;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->getApkVersion(Landroid/content/Context;)I

    move-result v3

    const v4, 0xc337960

    if-ge v3, v4, :cond_1

    invoke-interface {p1}, Lx26;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, LAY7;

    invoke-direct {v3, v2}, LAY7;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v3, LsQ7;

    invoke-direct {v3, v2, p1, v0}, LsQ7;-><init>(Landroid/content/Context;Lx26;Lmm9;)V

    :goto_1
    invoke-direct {v1, v0, v3, p1}, Lz26;-><init>(Lmm9;LKT8;Lx26;)V

    return-object v1
.end method
