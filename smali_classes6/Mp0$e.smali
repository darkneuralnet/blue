.class public abstract LMp0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMp0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "e"
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
.field public b:I

.field public c:I

.field public d:I

.field public final synthetic e:LMp0;


# direct methods
.method public constructor <init>(LMp0;)V
    .locals 1

    iput-object p1, p0, LMp0$e;->e:LMp0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LMp0;->a(LMp0;)I

    move-result v0

    iput v0, p0, LMp0$e;->b:I

    invoke-virtual {p1}, LMp0;->A()I

    move-result p1

    iput p1, p0, LMp0$e;->c:I

    const/4 p1, -0x1

    iput p1, p0, LMp0$e;->d:I

    return-void
.end method

.method public synthetic constructor <init>(LMp0;LMp0$a;)V
    .locals 0

    invoke-direct {p0, p1}, LMp0$e;-><init>(LMp0;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LMp0$e;->e:LMp0;

    invoke-static {v0}, LMp0;->a(LMp0;)I

    move-result v0

    iget v1, p0, LMp0$e;->b:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public abstract b(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method

.method public c()V
    .locals 1

    iget v0, p0, LMp0$e;->b:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, LMp0$e;->b:I

    return-void
.end method

.method public hasNext()Z
    .locals 1

    iget v0, p0, LMp0$e;->c:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, LMp0$e;->a()V

    invoke-virtual {p0}, LMp0$e;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LMp0$e;->c:I

    iput v0, p0, LMp0$e;->d:I

    invoke-virtual {p0, v0}, LMp0$e;->b(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LMp0$e;->e:LMp0;

    iget v2, p0, LMp0$e;->c:I

    invoke-virtual {v1, v2}, LMp0;->B(I)I

    move-result v1

    iput v1, p0, LMp0$e;->c:I

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 3

    invoke-virtual {p0}, LMp0$e;->a()V

    iget v0, p0, LMp0$e;->d:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ldm0;->d(Z)V

    invoke-virtual {p0}, LMp0$e;->c()V

    iget-object v0, p0, LMp0$e;->e:LMp0;

    iget v1, p0, LMp0$e;->d:I

    invoke-static {v0, v1}, LMp0;->b(LMp0;I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, LMp0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LMp0$e;->e:LMp0;

    iget v1, p0, LMp0$e;->c:I

    iget v2, p0, LMp0$e;->d:I

    invoke-virtual {v0, v1, v2}, LMp0;->o(II)I

    move-result v0

    iput v0, p0, LMp0$e;->c:I

    const/4 v0, -0x1

    iput v0, p0, LMp0$e;->d:I

    return-void
.end method
