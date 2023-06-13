.class public LQM2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)LQC0;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    invoke-static {}, LQM2;->b()LQC0;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, LEF0;

    invoke-direct {p0}, LEF0;-><init>()V

    return-object p0

    :cond_1
    new-instance p0, Ldc5;

    invoke-direct {p0}, Ldc5;-><init>()V

    return-object p0
.end method

.method public static b()LQC0;
    .locals 1

    new-instance v0, Ldc5;

    invoke-direct {v0}, Ldc5;-><init>()V

    return-object v0
.end method

.method public static c()LL91;
    .locals 1

    new-instance v0, LL91;

    invoke-direct {v0}, LL91;-><init>()V

    return-object v0
.end method

.method public static d(Landroid/view/View;F)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    instance-of v0, p0, LPM2;

    if-eqz v0, :cond_0

    check-cast p0, LPM2;

    invoke-virtual {p0, p1}, LPM2;->Z(F)V

    :cond_0
    return-void
.end method

.method public static e(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, LPM2;

    if-eqz v1, :cond_0

    check-cast v0, LPM2;

    invoke-static {p0, v0}, LQM2;->f(Landroid/view/View;LPM2;)V

    :cond_0
    return-void
.end method

.method public static f(Landroid/view/View;LPM2;)V
    .locals 1

    invoke-virtual {p1}, LPM2;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LVt6;->k(Landroid/view/View;)F

    move-result p0

    invoke-virtual {p1, p0}, LPM2;->e0(F)V

    :cond_0
    return-void
.end method
