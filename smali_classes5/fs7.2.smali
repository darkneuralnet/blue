.class public final Lfs7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Landroid/net/Uri;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Z


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 7

    const/4 v1, 0x0

    const-string v3, ""

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lfs7;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfs7;->a:Ljava/lang/String;

    iput-object p2, p0, Lfs7;->b:Landroid/net/Uri;

    iput-object p3, p0, Lfs7;->c:Ljava/lang/String;

    iput-object p4, p0, Lfs7;->d:Ljava/lang/String;

    iput-boolean p5, p0, Lfs7;->e:Z

    iput-boolean p6, p0, Lfs7;->f:Z

    return-void
.end method

.method public static synthetic a(Lfs7;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lfs7;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic d(Lfs7;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lfs7;->b:Landroid/net/Uri;

    return-object p0
.end method

.method public static synthetic e(Lfs7;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lfs7;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic h(Lfs7;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lfs7;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic j(Lfs7;)Z
    .locals 0

    iget-boolean p0, p0, Lfs7;->f:Z

    return p0
.end method

.method public static synthetic k(Lfs7;)Z
    .locals 0

    iget-boolean p0, p0, Lfs7;->e:Z

    return p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/Object;Lor7;)Lsj7;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;",
            "Lor7<",
            "TT;>;)",
            "Lsj7<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lsj7;->k(Lfs7;Ljava/lang/String;Ljava/lang/Object;Lor7;)Lsj7;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)Lsj7;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lsj7<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, Lsj7;->l(Lfs7;Ljava/lang/String;Ljava/lang/String;)Lsj7;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ljava/lang/String;Z)Lsj7;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lsj7<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, Lsj7;->m(Lfs7;Ljava/lang/String;Z)Lsj7;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/String;)Lfs7;
    .locals 8

    iget-boolean v5, p0, Lfs7;->e:Z

    if-nez v5, :cond_0

    new-instance v7, Lfs7;

    iget-object v1, p0, Lfs7;->a:Ljava/lang/String;

    iget-object v2, p0, Lfs7;->b:Landroid/net/Uri;

    iget-object v4, p0, Lfs7;->d:Ljava/lang/String;

    iget-boolean v6, p0, Lfs7;->f:Z

    move-object v0, v7

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lfs7;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-object v7

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot set GServices prefix and skip GServices"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Ljava/lang/String;)Lfs7;
    .locals 8

    new-instance v7, Lfs7;

    iget-object v1, p0, Lfs7;->a:Ljava/lang/String;

    iget-object v2, p0, Lfs7;->b:Landroid/net/Uri;

    iget-object v3, p0, Lfs7;->c:Ljava/lang/String;

    iget-boolean v5, p0, Lfs7;->e:Z

    iget-boolean v6, p0, Lfs7;->f:Z

    move-object v0, v7

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lfs7;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-object v7
.end method
