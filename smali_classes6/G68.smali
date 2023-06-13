.class public final LG68;
.super LKn2;
.source "SourceFile"


# instance fields
.field public final b:LyU2;


# direct methods
.method public constructor <init>(LyU2;)V
    .locals 0

    invoke-direct {p0}, LKn2;-><init>()V

    iput-object p1, p0, LG68;->b:LyU2;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lhj1;

    iget-object v0, p0, LG68;->b:LyU2;

    invoke-virtual {v0}, LyU2;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, LhH8;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LK69;->b(Ljava/lang/String;)Ly49;

    move-result-object v1

    invoke-static {v0}, Lkf7;->b(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailabilityLight;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->getApkVersion(Landroid/content/Context;)I

    move-result v2

    const v3, 0xc306c20

    if-lt v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, LzZ8;

    invoke-direct {v2, v0, p1, v1}, LzZ8;-><init>(Landroid/content/Context;Lhj1;Ly49;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v2, Lkf7;

    invoke-direct {v2, v0, p1, v1}, Lkf7;-><init>(Landroid/content/Context;Lhj1;Ly49;)V

    :goto_1
    new-instance v0, LAt8;

    invoke-static {}, LhH8;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LK69;->b(Ljava/lang/String;)Ly49;

    move-result-object v1

    invoke-direct {v0, v1, p1, v2}, LAt8;-><init>(Ly49;Lhj1;LGC7;)V

    return-object v0
.end method
