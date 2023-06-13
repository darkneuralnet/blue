.class public final LLe8;
.super LKn2;
.source "SourceFile"


# instance fields
.field public final b:LyU2;


# direct methods
.method public constructor <init>(LyU2;)V
    .locals 0

    invoke-direct {p0}, LKn2;-><init>()V

    iput-object p1, p0, LLe8;->b:LyU2;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, LXx;

    iget-object v0, p0, LLe8;->b:LyU2;

    invoke-virtual {v0}, LyU2;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, LCC7;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Llo9;->b(Ljava/lang/String;)Len9;

    move-result-object v1

    invoke-static {v0}, LIT8;->b(Landroid/content/Context;)Z

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
    new-instance v2, LW49;

    invoke-direct {v2, v0, p1, v1}, LW49;-><init>(Landroid/content/Context;LXx;Len9;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v2, LIT8;

    invoke-direct {v2, v0, p1, v1}, LIT8;-><init>(Landroid/content/Context;LXx;Len9;)V

    :goto_1
    new-instance v0, LBA8;

    iget-object v3, p0, LLe8;->b:LyU2;

    invoke-direct {v0, v3, p1, v2, v1}, LBA8;-><init>(LyU2;LXx;LgH8;Len9;)V

    return-object v0
.end method
