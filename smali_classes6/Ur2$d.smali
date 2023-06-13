.class public abstract LUr2$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUr2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public b:LUr2$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LUr2$e<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public c:LUr2$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LUr2$e<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public d:I

.field public final synthetic e:LUr2;


# direct methods
.method public constructor <init>(LUr2;)V
    .locals 1

    iput-object p1, p0, LUr2$d;->e:LUr2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, LUr2;->g:LUr2$e;

    iget-object v0, v0, LUr2$e;->e:LUr2$e;

    iput-object v0, p0, LUr2$d;->b:LUr2$e;

    const/4 v0, 0x0

    iput-object v0, p0, LUr2$d;->c:LUr2$e;

    iget p1, p1, LUr2;->f:I

    iput p1, p0, LUr2$d;->d:I

    return-void
.end method


# virtual methods
.method public final a()LUr2$e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LUr2$e<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LUr2$d;->b:LUr2$e;

    iget-object v1, p0, LUr2$d;->e:LUr2;

    iget-object v2, v1, LUr2;->g:LUr2$e;

    if-eq v0, v2, :cond_1

    iget v1, v1, LUr2;->f:I

    iget v2, p0, LUr2$d;->d:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, LUr2$e;->e:LUr2$e;

    iput-object v1, p0, LUr2$d;->b:LUr2$e;

    iput-object v0, p0, LUr2$d;->c:LUr2$e;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, LUr2$d;->b:LUr2$e;

    iget-object v1, p0, LUr2$d;->e:LUr2;

    iget-object v1, v1, LUr2;->g:LUr2$e;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, LUr2$d;->c:LUr2$e;

    if-eqz v0, :cond_0

    iget-object v1, p0, LUr2$d;->e:LUr2;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LUr2;->f(LUr2$e;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, LUr2$d;->c:LUr2$e;

    iget-object v0, p0, LUr2$d;->e:LUr2;

    iget v0, v0, LUr2;->f:I

    iput v0, p0, LUr2$d;->d:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
