.class public final LoX2$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LoX2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final b:LmX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LmX2<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "LmX2$a<",
            "TE;>;>;"
        }
    .end annotation
.end field

.field public d:LmX2$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LmX2$a<",
            "TE;>;"
        }
    .end annotation
.end field

.field public e:I

.field public f:I

.field public g:Z


# direct methods
.method public constructor <init>(LmX2;Ljava/util/Iterator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmX2<",
            "TE;>;",
            "Ljava/util/Iterator<",
            "LmX2$a<",
            "TE;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoX2$f;->b:LmX2;

    iput-object p2, p0, LoX2$f;->c:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget v0, p0, LoX2$f;->e:I

    if-gtz v0, :cond_1

    iget-object v0, p0, LoX2$f;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    invoke-virtual {p0}, LoX2$f;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, LoX2$f;->e:I

    if-nez v0, :cond_0

    iget-object v0, p0, LoX2$f;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LmX2$a;

    iput-object v0, p0, LoX2$f;->d:LmX2$a;

    invoke-interface {v0}, LmX2$a;->getCount()I

    move-result v0

    iput v0, p0, LoX2$f;->e:I

    iput v0, p0, LoX2$f;->f:I

    :cond_0
    iget v0, p0, LoX2$f;->e:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, LoX2$f;->e:I

    iput-boolean v1, p0, LoX2$f;->g:Z

    iget-object v0, p0, LoX2$f;->d:LmX2$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, LmX2$a;

    invoke-interface {v0}, LmX2$a;->getElement()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 3

    iget-boolean v0, p0, LoX2$f;->g:Z

    invoke-static {v0}, Ldm0;->d(Z)V

    iget v0, p0, LoX2$f;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LoX2$f;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LoX2$f;->b:LmX2;

    iget-object v2, p0, LoX2$f;->d:LmX2$a;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, LmX2$a;

    invoke-interface {v2}, LmX2$a;->getElement()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, LmX2;->remove(Ljava/lang/Object;)Z

    :goto_0
    iget v0, p0, LoX2$f;->f:I

    sub-int/2addr v0, v1

    iput v0, p0, LoX2$f;->f:I

    const/4 v0, 0x0

    iput-boolean v0, p0, LoX2$f;->g:Z

    return-void
.end method
