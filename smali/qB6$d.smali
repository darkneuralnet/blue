.class public LqB6$d;
.super LqB6$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LqB6$d$a;
    }
.end annotation


# instance fields
.field public final e:Landroid/view/WindowInsetsAnimation;


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 0

    invoke-static {}, LwB6;->a()V

    invoke-static {p1, p2, p3, p4}, LvB6;->a(ILandroid/view/animation/Interpolator;J)Landroid/view/WindowInsetsAnimation;

    move-result-object p1

    invoke-direct {p0, p1}, LqB6$d;-><init>(Landroid/view/WindowInsetsAnimation;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation;)V
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v3, v0, v1, v2}, LqB6$e;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object p1, p0, LqB6$d;->e:Landroid/view/WindowInsetsAnimation;

    return-void
.end method

.method public static d(LqB6$a;)Landroid/view/WindowInsetsAnimation$Bounds;
    .locals 1

    invoke-static {}, LyB6;->a()V

    invoke-virtual {p0}, LqB6$a;->a()LD32;

    move-result-object v0

    invoke-virtual {v0}, LD32;->e()Landroid/graphics/Insets;

    move-result-object v0

    invoke-virtual {p0}, LqB6$a;->b()LD32;

    move-result-object p0

    invoke-virtual {p0}, LD32;->e()Landroid/graphics/Insets;

    move-result-object p0

    invoke-static {v0, p0}, LxB6;->a(Landroid/graphics/Insets;Landroid/graphics/Insets;)Landroid/view/WindowInsetsAnimation$Bounds;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/view/WindowInsetsAnimation$Bounds;)LD32;
    .locals 0

    invoke-static {p0}, LAB6;->a(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object p0

    invoke-static {p0}, LD32;->d(Landroid/graphics/Insets;)LD32;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/view/WindowInsetsAnimation$Bounds;)LD32;
    .locals 0

    invoke-static {p0}, LzB6;->a(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object p0

    invoke-static {p0}, LD32;->d(Landroid/graphics/Insets;)LD32;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/view/View;LqB6$b;)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, LqB6$d$a;

    invoke-direct {v0, p1}, LqB6$d$a;-><init>(LqB6$b;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p0, v0}, LtB6;->a(Landroid/view/View;Landroid/view/WindowInsetsAnimation$Callback;)V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, LqB6$d;->e:Landroid/view/WindowInsetsAnimation;

    invoke-static {v0}, LrB6;->a(Landroid/view/WindowInsetsAnimation;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, LqB6$d;->e:Landroid/view/WindowInsetsAnimation;

    invoke-static {v0}, LsB6;->a(Landroid/view/WindowInsetsAnimation;)F

    move-result v0

    return v0
.end method

.method public c(F)V
    .locals 1

    iget-object v0, p0, LqB6$d;->e:Landroid/view/WindowInsetsAnimation;

    invoke-static {v0, p1}, LuB6;->a(Landroid/view/WindowInsetsAnimation;F)V

    return-void
.end method
