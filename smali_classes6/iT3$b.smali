.class public LiT3$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LiT3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lb61;

.field public c:Ljava/util/concurrent/ExecutorService;

.field public d:La80;

.field public e:LiT3$g;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LPI4;",
            ">;"
        }
    .end annotation
.end field

.field public g:Landroid/graphics/Bitmap$Config;

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LiT3$b;->a:Landroid/content/Context;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Context must not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()LiT3;
    .locals 14

    iget-object v7, p0, LiT3$b;->a:Landroid/content/Context;

    iget-object v0, p0, LiT3$b;->b:Lb61;

    if-nez v0, :cond_0

    new-instance v0, LKe3;

    invoke-direct {v0, v7}, LKe3;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LiT3$b;->b:Lb61;

    :cond_0
    iget-object v0, p0, LiT3$b;->d:La80;

    if-nez v0, :cond_1

    new-instance v0, LsE2;

    invoke-direct {v0, v7}, LsE2;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LiT3$b;->d:La80;

    :cond_1
    iget-object v0, p0, LiT3$b;->c:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_2

    new-instance v0, LkT3;

    invoke-direct {v0}, LkT3;-><init>()V

    iput-object v0, p0, LiT3$b;->c:Ljava/util/concurrent/ExecutorService;

    :cond_2
    iget-object v0, p0, LiT3$b;->e:LiT3$g;

    if-nez v0, :cond_3

    sget-object v0, LiT3$g;->a:LiT3$g;

    iput-object v0, p0, LiT3$b;->e:LiT3$g;

    :cond_3
    new-instance v8, LlQ5;

    iget-object v0, p0, LiT3$b;->d:La80;

    invoke-direct {v8, v0}, LlQ5;-><init>(La80;)V

    new-instance v9, LQ41;

    iget-object v2, p0, LiT3$b;->c:Ljava/util/concurrent/ExecutorService;

    sget-object v3, LiT3;->o:Landroid/os/Handler;

    iget-object v4, p0, LiT3$b;->b:Lb61;

    iget-object v5, p0, LiT3$b;->d:La80;

    move-object v0, v9

    move-object v1, v7

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, LQ41;-><init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;Landroid/os/Handler;Lb61;La80;LlQ5;)V

    new-instance v11, LiT3;

    iget-object v3, p0, LiT3$b;->d:La80;

    const/4 v4, 0x0

    iget-object v5, p0, LiT3$b;->e:LiT3$g;

    iget-object v6, p0, LiT3$b;->f:Ljava/util/List;

    iget-object v10, p0, LiT3$b;->g:Landroid/graphics/Bitmap$Config;

    iget-boolean v12, p0, LiT3$b;->h:Z

    iget-boolean v13, p0, LiT3$b;->i:Z

    move-object v0, v11

    move-object v2, v9

    move-object v7, v8

    move-object v8, v10

    move v9, v12

    move v10, v13

    invoke-direct/range {v0 .. v10}, LiT3;-><init>(Landroid/content/Context;LQ41;La80;LiT3$d;LiT3$g;Ljava/util/List;LlQ5;Landroid/graphics/Bitmap$Config;ZZ)V

    return-object v11
.end method

.method public b(Landroid/graphics/Bitmap$Config;)LiT3$b;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, LiT3$b;->g:Landroid/graphics/Bitmap$Config;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Bitmap config must not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Lb61;)LiT3$b;
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, LiT3$b;->b:Lb61;

    if-nez v0, :cond_0

    iput-object p1, p0, LiT3$b;->b:Lb61;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Downloader already set."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Downloader must not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Ljava/util/concurrent/ExecutorService;)LiT3$b;
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, LiT3$b;->c:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    iput-object p1, p0, LiT3$b;->c:Ljava/util/concurrent/ExecutorService;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Executor service already set."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Executor service must not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
