.class public final LDB6$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LDB6$f;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, LDB6$e;

    invoke-direct {v0}, LDB6$e;-><init>()V

    iput-object v0, p0, LDB6$b;->a:LDB6$f;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, LDB6$d;

    invoke-direct {v0}, LDB6$d;-><init>()V

    iput-object v0, p0, LDB6$b;->a:LDB6$f;

    goto :goto_0

    :cond_1
    new-instance v0, LDB6$c;

    invoke-direct {v0}, LDB6$c;-><init>()V

    iput-object v0, p0, LDB6$b;->a:LDB6$f;

    :goto_0
    return-void
.end method

.method public constructor <init>(LDB6;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, LDB6$e;

    invoke-direct {v0, p1}, LDB6$e;-><init>(LDB6;)V

    iput-object v0, p0, LDB6$b;->a:LDB6$f;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, LDB6$d;

    invoke-direct {v0, p1}, LDB6$d;-><init>(LDB6;)V

    iput-object v0, p0, LDB6$b;->a:LDB6$f;

    goto :goto_0

    :cond_1
    new-instance v0, LDB6$c;

    invoke-direct {v0, p1}, LDB6$c;-><init>(LDB6;)V

    iput-object v0, p0, LDB6$b;->a:LDB6$f;

    :goto_0
    return-void
.end method


# virtual methods
.method public a()LDB6;
    .locals 1

    iget-object v0, p0, LDB6$b;->a:LDB6$f;

    invoke-virtual {v0}, LDB6$f;->b()LDB6;

    move-result-object v0

    return-object v0
.end method

.method public b(ILD32;)LDB6$b;
    .locals 1

    iget-object v0, p0, LDB6$b;->a:LDB6$f;

    invoke-virtual {v0, p1, p2}, LDB6$f;->c(ILD32;)V

    return-object p0
.end method

.method public c(LD32;)LDB6$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LDB6$b;->a:LDB6$f;

    invoke-virtual {v0, p1}, LDB6$f;->e(LD32;)V

    return-object p0
.end method

.method public d(LD32;)LDB6$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LDB6$b;->a:LDB6$f;

    invoke-virtual {v0, p1}, LDB6$f;->g(LD32;)V

    return-object p0
.end method
