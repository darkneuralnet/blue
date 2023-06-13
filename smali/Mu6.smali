.class public LMu6;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)LfJ4;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, LMu6;->b(Landroid/content/Context;LLA;)LfJ4;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;LLA;)LfJ4;
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, LPE;

    new-instance v0, LSN1;

    invoke-direct {v0}, LSN1;-><init>()V

    invoke-direct {p1, v0}, LPE;-><init>(LLA;)V

    goto :goto_0

    :cond_0
    new-instance v0, LPE;

    invoke-direct {v0, p1}, LPE;-><init>(LLA;)V

    move-object p1, v0

    :goto_0
    invoke-static {p0, p1}, LMu6;->c(Landroid/content/Context;Lu73;)LfJ4;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;Lu73;)LfJ4;
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v0, LMu6$a;

    invoke-direct {v0, p0}, LMu6$a;-><init>(Landroid/content/Context;)V

    new-instance p0, LfJ4;

    new-instance v1, Ly41;

    invoke-direct {v1, v0}, Ly41;-><init>(Ly41$c;)V

    invoke-direct {p0, v1, p1}, LfJ4;-><init>(LY70;Lu73;)V

    invoke-virtual {p0}, LfJ4;->g()V

    return-object p0
.end method
