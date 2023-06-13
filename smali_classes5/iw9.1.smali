.class public abstract Liw9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public b:Ljw9;

.field public c:Ljw9;

.field public d:I

.field public final synthetic e:Lkw9;


# direct methods
.method public constructor <init>(Lkw9;)V
    .locals 1

    iput-object p1, p0, Liw9;->e:Lkw9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lkw9;->f:Ljw9;

    iget-object v0, v0, Ljw9;->e:Ljw9;

    iput-object v0, p0, Liw9;->b:Ljw9;

    const/4 v0, 0x0

    iput-object v0, p0, Liw9;->c:Ljw9;

    iget p1, p1, Lkw9;->e:I

    iput p1, p0, Liw9;->d:I

    return-void
.end method


# virtual methods
.method public final a()Ljw9;
    .locals 3

    iget-object v0, p0, Liw9;->b:Ljw9;

    iget-object v1, p0, Liw9;->e:Lkw9;

    iget-object v2, v1, Lkw9;->f:Ljw9;

    if-eq v0, v2, :cond_1

    iget v1, v1, Lkw9;->e:I

    iget v2, p0, Liw9;->d:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Ljw9;->e:Ljw9;

    iput-object v1, p0, Liw9;->b:Ljw9;

    iput-object v0, p0, Liw9;->c:Ljw9;

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

    iget-object v0, p0, Liw9;->b:Ljw9;

    iget-object v1, p0, Liw9;->e:Lkw9;

    iget-object v1, v1, Lkw9;->f:Ljw9;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Liw9;->c:Ljw9;

    if-eqz v0, :cond_0

    iget-object v1, p0, Liw9;->e:Lkw9;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkw9;->e(Ljw9;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Liw9;->c:Ljw9;

    iget-object v0, p0, Liw9;->e:Lkw9;

    iget v0, v0, Lkw9;->e:I

    iput v0, p0, Liw9;->d:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
