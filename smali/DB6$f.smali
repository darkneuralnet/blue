.class public LDB6$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field public final a:LDB6;

.field public b:[LD32;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, LDB6;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LDB6;-><init>(LDB6;)V

    invoke-direct {p0, v0}, LDB6$f;-><init>(LDB6;)V

    return-void
.end method

.method public constructor <init>(LDB6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDB6$f;->a:LDB6;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, LDB6$f;->b:[LD32;

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    invoke-static {v1}, LDB6$m;->d(I)I

    move-result v2

    aget-object v0, v0, v2

    iget-object v2, p0, LDB6$f;->b:[LD32;

    const/4 v3, 0x2

    invoke-static {v3}, LDB6$m;->d(I)I

    move-result v4

    aget-object v2, v2, v4

    if-nez v2, :cond_0

    iget-object v2, p0, LDB6$f;->a:LDB6;

    invoke-virtual {v2, v3}, LDB6;->f(I)LD32;

    move-result-object v2

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, p0, LDB6$f;->a:LDB6;

    invoke-virtual {v0, v1}, LDB6;->f(I)LD32;

    move-result-object v0

    :cond_1
    invoke-static {v0, v2}, LD32;->a(LD32;LD32;)LD32;

    move-result-object v0

    invoke-virtual {p0, v0}, LDB6$f;->g(LD32;)V

    iget-object v0, p0, LDB6$f;->b:[LD32;

    const/16 v1, 0x10

    invoke-static {v1}, LDB6$m;->d(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, LDB6$f;->f(LD32;)V

    :cond_2
    iget-object v0, p0, LDB6$f;->b:[LD32;

    const/16 v1, 0x20

    invoke-static {v1}, LDB6$m;->d(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, LDB6$f;->d(LD32;)V

    :cond_3
    iget-object v0, p0, LDB6$f;->b:[LD32;

    const/16 v1, 0x40

    invoke-static {v1}, LDB6$m;->d(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, LDB6$f;->h(LD32;)V

    :cond_4
    return-void
.end method

.method public b()LDB6;
    .locals 1

    invoke-virtual {p0}, LDB6$f;->a()V

    iget-object v0, p0, LDB6$f;->a:LDB6;

    return-object v0
.end method

.method public c(ILD32;)V
    .locals 3

    iget-object v0, p0, LDB6$f;->b:[LD32;

    if-nez v0, :cond_0

    const/16 v0, 0x9

    new-array v0, v0, [LD32;

    iput-object v0, p0, LDB6$f;->b:[LD32;

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x100

    if-gt v0, v1, :cond_2

    and-int v1, p1, v0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, LDB6$f;->b:[LD32;

    invoke-static {v0}, LDB6$m;->d(I)I

    move-result v2

    aput-object p2, v1, v2

    :goto_1
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public d(LD32;)V
    .locals 0

    return-void
.end method

.method public e(LD32;)V
    .locals 0

    return-void
.end method

.method public f(LD32;)V
    .locals 0

    return-void
.end method

.method public g(LD32;)V
    .locals 0

    return-void
.end method

.method public h(LD32;)V
    .locals 0

    return-void
.end method
