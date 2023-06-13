.class public final LyJ6;
.super Lwo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwo<",
        "Landroidx/camera/core/i;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(ILmb5$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lmb5$a<",
            "Landroidx/camera/core/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lwo;-><init>(ILmb5$a;)V

    return-void
.end method


# virtual methods
.method public c(Landroidx/camera/core/i;)V
    .locals 1

    invoke-interface {p1}, Landroidx/camera/core/i;->i1()LwX1;

    move-result-object v0

    invoke-virtual {p0, v0}, LyJ6;->d(LwX1;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lwo;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lwo;->d:Lmb5$a;

    invoke-interface {v0, p1}, Lmb5$a;->a(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final d(LwX1;)Z
    .locals 3

    invoke-static {p1}, Lza0;->a(LwX1;)Lxa0;

    move-result-object p1

    invoke-interface {p1}, Lxa0;->c()Lua0;

    move-result-object v0

    sget-object v1, Lua0;->g:Lua0;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    invoke-interface {p1}, Lxa0;->c()Lua0;

    move-result-object v0

    sget-object v1, Lua0;->e:Lua0;

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    invoke-interface {p1}, Lxa0;->e()Lsa0;

    move-result-object v0

    sget-object v1, Lsa0;->f:Lsa0;

    if-eq v0, v1, :cond_1

    return v2

    :cond_1
    invoke-interface {p1}, Lxa0;->d()Lva0;

    move-result-object p1

    sget-object v0, Lva0;->e:Lva0;

    if-eq p1, v0, :cond_2

    return v2

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
