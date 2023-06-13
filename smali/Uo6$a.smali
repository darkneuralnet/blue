.class public LUo6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZd3$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUo6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LZd3$a<",
        "LuR5;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:LUo6;


# direct methods
.method public constructor <init>(LUo6;)V
    .locals 0

    iput-object p1, p0, LUo6$a;->a:LUo6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LuR5;

    invoke-virtual {p0, p1}, LUo6$a;->b(LuR5;)V

    return-void
.end method

.method public b(LuR5;)V
    .locals 3

    if-eqz p1, :cond_6

    iget-object v0, p0, LUo6$a;->a:LUo6;

    iget-object v0, v0, LUo6;->t:Ltp6$a;

    sget-object v1, Ltp6$a;->d:Ltp6$a;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Stream info update: old: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LUo6$a;->a:LUo6;

    iget-object v1, v1, LUo6;->p:LuR5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " new: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "VideoCapture"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LUo6$a;->a:LUo6;

    iget-object v1, v0, LUo6;->p:LuR5;

    iput-object p1, v0, LUo6;->p:LuR5;

    sget-object v0, LuR5;->b:Ljava/util/Set;

    invoke-virtual {v1}, LuR5;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, LuR5;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, LuR5;->a()I

    move-result v0

    invoke-virtual {p1}, LuR5;->a()I

    move-result v2

    if-eq v0, v2, :cond_1

    iget-object p1, p0, LUo6$a;->a:LUo6;

    invoke-static {p1}, LUo6;->b0(LUo6;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LUo6$a;->a:LUo6;

    invoke-virtual {v1}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v1

    check-cast v1, LYo6;

    iget-object v2, p0, LUo6$a;->a:LUo6;

    invoke-virtual {v2}, Landroidx/camera/core/p;->d()LBR5;

    move-result-object v2

    invoke-static {v2}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBR5;

    invoke-virtual {p1, v0, v1, v2}, LUo6;->D0(Ljava/lang/String;LYo6;LBR5;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, LuR5;->a()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    invoke-virtual {p1}, LuR5;->a()I

    move-result v0

    if-eq v0, v2, :cond_3

    :cond_2
    invoke-virtual {v1}, LuR5;->a()I

    move-result v0

    if-ne v0, v2, :cond_4

    invoke-virtual {p1}, LuR5;->a()I

    move-result v0

    if-eq v0, v2, :cond_4

    :cond_3
    iget-object v0, p0, LUo6$a;->a:LUo6;

    iget-object v1, v0, LUo6;->q:Landroidx/camera/core/impl/q$b;

    invoke-virtual {v0, v1, p1}, LUo6;->l0(Landroidx/camera/core/impl/q$b;LuR5;)V

    iget-object p1, p0, LUo6$a;->a:LUo6;

    iget-object v0, p1, LUo6;->q:Landroidx/camera/core/impl/q$b;

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object v0

    invoke-static {p1, v0}, LUo6;->c0(LUo6;Landroidx/camera/core/impl/q;)V

    iget-object p1, p0, LUo6$a;->a:LUo6;

    invoke-static {p1}, LUo6;->d0(LUo6;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, LuR5;->b()LuR5$a;

    move-result-object v0

    invoke-virtual {p1}, LuR5;->b()LuR5$a;

    move-result-object v1

    if-eq v0, v1, :cond_5

    iget-object v0, p0, LUo6$a;->a:LUo6;

    iget-object v1, v0, LUo6;->q:Landroidx/camera/core/impl/q$b;

    invoke-virtual {v0, v1, p1}, LUo6;->l0(Landroidx/camera/core/impl/q$b;LuR5;)V

    iget-object p1, p0, LUo6$a;->a:LUo6;

    iget-object v0, p1, LUo6;->q:Landroidx/camera/core/impl/q$b;

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object v0

    invoke-static {p1, v0}, LUo6;->e0(LUo6;Landroidx/camera/core/impl/q;)V

    iget-object p1, p0, LUo6$a;->a:LUo6;

    invoke-static {p1}, LUo6;->f0(LUo6;)V

    :cond_5
    :goto_0
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "StreamInfo can\'t be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "VideoCapture"

    const-string v1, "Receive onError from StreamState observer"

    invoke-static {v0, v1, p1}, LJx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
