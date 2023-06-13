.class public final LqB6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LqB6$d;,
        LqB6$c;,
        LqB6$e;,
        LqB6$b;,
        LqB6$a;
    }
.end annotation


# instance fields
.field public a:LqB6$e;


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, LqB6$d;

    invoke-direct {v0, p1, p2, p3, p4}, LqB6$d;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object v0, p0, LqB6;->a:LqB6$e;

    goto :goto_0

    :cond_0
    new-instance v0, LqB6$c;

    invoke-direct {v0, p1, p2, p3, p4}, LqB6$c;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object v0, p0, LqB6;->a:LqB6$e;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation;)V
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v3, v0, v1, v2}, LqB6;-><init>(ILandroid/view/animation/Interpolator;J)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, LqB6$d;

    invoke-direct {v0, p1}, LqB6$d;-><init>(Landroid/view/WindowInsetsAnimation;)V

    iput-object v0, p0, LqB6;->a:LqB6$e;

    :cond_0
    return-void
.end method

.method public static c(Landroid/view/View;LqB6$b;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LqB6$d;->g(Landroid/view/View;LqB6$b;)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LqB6$c;->n(Landroid/view/View;LqB6$b;)V

    :goto_0
    return-void
.end method

.method public static e(Landroid/view/WindowInsetsAnimation;)LqB6;
    .locals 1

    new-instance v0, LqB6;

    invoke-direct {v0, p0}, LqB6;-><init>(Landroid/view/WindowInsetsAnimation;)V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, LqB6;->a:LqB6$e;

    invoke-virtual {v0}, LqB6$e;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, LqB6;->a:LqB6$e;

    invoke-virtual {v0}, LqB6$e;->b()F

    move-result v0

    return v0
.end method

.method public d(F)V
    .locals 1

    iget-object v0, p0, LqB6;->a:LqB6$e;

    invoke-virtual {v0, p1}, LqB6$e;->c(F)V

    return-void
.end method
