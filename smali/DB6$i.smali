.class public LDB6$i;
.super LDB6$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# direct methods
.method public constructor <init>(LDB6;LDB6$i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LDB6$h;-><init>(LDB6;LDB6$h;)V

    return-void
.end method

.method public constructor <init>(LDB6;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LDB6$h;-><init>(LDB6;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public a()LDB6;
    .locals 1

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LPB6;->a(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LDB6;->y(Landroid/view/WindowInsets;)LDB6;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LDB6$i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LDB6$i;

    iget-object v1, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    iget-object v3, p1, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LDB6$g;->g:LD32;

    iget-object p1, p1, LDB6$g;->g:LD32;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public f()Lf51;
    .locals 1

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LOB6;->a(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    move-result-object v0

    invoke-static {v0}, Lf51;->f(Landroid/view/DisplayCutout;)Lf51;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->hashCode()I

    move-result v0

    return v0
.end method
