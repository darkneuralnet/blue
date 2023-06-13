.class public final Lph9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWe9;


# instance fields
.field public a:LX94;

.field public final b:LX94;

.field public final c:Lmf9;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lmf9;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lph9;->c:Lmf9;

    sget-object p2, LW70;->g:LW70;

    invoke-static {p1}, Lia6;->f(Landroid/content/Context;)V

    invoke-static {}, Lia6;->c()Lia6;

    move-result-object p1

    invoke-virtual {p1, p2}, Lia6;->g(LG01;)LU96;

    move-result-object p1

    invoke-virtual {p2}, LW70;->a()Ljava/util/Set;

    move-result-object p2

    const-string v0, "json"

    invoke-static {v0}, LPc1;->b(Ljava/lang/String;)LPc1;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, LYm2;

    new-instance v0, LRg9;

    invoke-direct {v0, p1}, LRg9;-><init>(LU96;)V

    invoke-direct {p2, v0}, LYm2;-><init>(LX94;)V

    iput-object p2, p0, Lph9;->a:LX94;

    :cond_0
    new-instance p2, LYm2;

    new-instance v0, LZg9;

    invoke-direct {v0, p1}, LZg9;-><init>(LU96;)V

    invoke-direct {p2, v0}, LYm2;-><init>(LX94;)V

    iput-object p2, p0, Lph9;->b:LX94;

    return-void
.end method
