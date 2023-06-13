.class public abstract LDV5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDV5$b;,
        LDV5$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LDV5$b;LDV5$a;)LDV5;
    .locals 1

    new-instance v0, Lju;

    invoke-direct {v0, p0, p1}, Lju;-><init>(LDV5$b;LDV5$a;)V

    return-object v0
.end method

.method public static d(I)LDV5$b;
    .locals 1

    const/16 v0, 0x23

    if-ne p0, v0, :cond_0

    sget-object p0, LDV5$b;->c:LDV5$b;

    return-object p0

    :cond_0
    const/16 v0, 0x100

    if-ne p0, v0, :cond_1

    sget-object p0, LDV5$b;->d:LDV5$b;

    return-object p0

    :cond_1
    const/16 v0, 0x20

    if-ne p0, v0, :cond_2

    sget-object p0, LDV5$b;->e:LDV5$b;

    return-object p0

    :cond_2
    sget-object p0, LDV5$b;->b:LDV5$b;

    return-object p0
.end method

.method public static f(ZILandroid/util/Size;LlW5;Landroid/util/Size;)LDV5;
    .locals 1

    invoke-static {p1}, LDV5;->d(I)LDV5$b;

    move-result-object p1

    sget-object v0, LDV5$a;->i:LDV5$a;

    invoke-static {p2}, LIB5;->a(Landroid/util/Size;)I

    move-result p2

    if-eqz p0, :cond_2

    if-eqz p4, :cond_0

    invoke-static {p4}, LIB5;->a(Landroid/util/Size;)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {p3}, LlW5;->f()Landroid/util/Size;

    move-result-object p4

    invoke-static {p4}, LIB5;->a(Landroid/util/Size;)I

    move-result p4

    invoke-static {p0, p4}, Ljava/lang/Math;->min(II)I

    move-result p4

    if-gt p2, p4, :cond_1

    sget-object v0, LDV5$a;->d:LDV5$a;

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, LlW5;->e()Landroid/util/Size;

    move-result-object p3

    invoke-static {p3}, LIB5;->a(Landroid/util/Size;)I

    move-result p3

    invoke-static {p0, p3}, Ljava/lang/Math;->min(II)I

    move-result p0

    if-gt p2, p0, :cond_6

    sget-object v0, LDV5$a;->f:LDV5$a;

    goto :goto_1

    :cond_2
    invoke-virtual {p3}, LlW5;->b()Landroid/util/Size;

    move-result-object p0

    invoke-static {p0}, LIB5;->a(Landroid/util/Size;)I

    move-result p0

    if-gt p2, p0, :cond_3

    sget-object v0, LDV5$a;->c:LDV5$a;

    goto :goto_1

    :cond_3
    invoke-virtual {p3}, LlW5;->c()Landroid/util/Size;

    move-result-object p0

    invoke-static {p0}, LIB5;->a(Landroid/util/Size;)I

    move-result p0

    if-gt p2, p0, :cond_4

    sget-object v0, LDV5$a;->e:LDV5$a;

    goto :goto_1

    :cond_4
    invoke-virtual {p3}, LlW5;->d()Landroid/util/Size;

    move-result-object p0

    invoke-static {p0}, LIB5;->a(Landroid/util/Size;)I

    move-result p0

    if-gt p2, p0, :cond_5

    sget-object v0, LDV5$a;->g:LDV5$a;

    goto :goto_1

    :cond_5
    sget-object v0, LDV5$a;->h:LDV5$a;

    :cond_6
    :goto_1
    invoke-static {p1, v0}, LDV5;->a(LDV5$b;LDV5$a;)LDV5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()LDV5$a;
.end method

.method public abstract c()LDV5$b;
.end method

.method public final e(LDV5;)Z
    .locals 2

    invoke-virtual {p1}, LDV5;->c()LDV5$b;

    move-result-object v0

    invoke-virtual {p1}, LDV5;->b()LDV5$a;

    move-result-object p1

    invoke-virtual {p1}, LDV5$a;->b()I

    move-result p1

    invoke-virtual {p0}, LDV5;->b()LDV5$a;

    move-result-object v1

    invoke-virtual {v1}, LDV5$a;->b()I

    move-result v1

    if-gt p1, v1, :cond_0

    invoke-virtual {p0}, LDV5;->c()LDV5$b;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
