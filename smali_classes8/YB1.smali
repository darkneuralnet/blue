.class public LYB1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public b:LWB1;

.field public c:Z

.field public d:I

.field public e:I

.field public f:LYB1;


# direct methods
.method public constructor <init>(LWB1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYB1;->b:LWB1;

    const/4 v0, 0x1

    iput-boolean v0, p0, LYB1;->c:Z

    const/4 v0, 0x0

    iput v0, p0, LYB1;->e:I

    invoke-virtual {p1}, LWB1;->f0()I

    move-result p1

    iput p1, p0, LYB1;->d:I

    return-void
.end method

.method public static a(LWB1;)Z
    .locals 0

    instance-of p0, p0, LXB1;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public hasNext()Z
    .locals 3

    iget-boolean v0, p0, LYB1;->c:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LYB1;->f:LYB1;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LYB1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, LYB1;->f:LYB1;

    :cond_2
    iget v0, p0, LYB1;->e:I

    iget v2, p0, LYB1;->d:I

    if-lt v0, v2, :cond_3

    const/4 v0, 0x0

    return v0

    :cond_3
    return v1
.end method

.method public next()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, LYB1;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, LYB1;->c:Z

    iget-object v0, p0, LYB1;->b:LWB1;

    invoke-static {v0}, LYB1;->a(LWB1;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LYB1;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LYB1;->e:I

    :cond_0
    iget-object v0, p0, LYB1;->b:LWB1;

    return-object v0

    :cond_1
    iget-object v0, p0, LYB1;->f:LYB1;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LYB1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LYB1;->f:LYB1;

    invoke-virtual {v0}, LYB1;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, LYB1;->f:LYB1;

    :cond_3
    iget v0, p0, LYB1;->e:I

    iget v1, p0, LYB1;->d:I

    if-ge v0, v1, :cond_5

    iget-object v1, p0, LYB1;->b:LWB1;

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, LYB1;->e:I

    invoke-virtual {v1, v0}, LWB1;->d0(I)LWB1;

    move-result-object v0

    instance-of v1, v0, LXB1;

    if-eqz v1, :cond_4

    new-instance v1, LYB1;

    check-cast v0, LXB1;

    invoke-direct {v1, v0}, LYB1;-><init>(LWB1;)V

    iput-object v1, p0, LYB1;->f:LYB1;

    invoke-virtual {v1}, LYB1;->next()Ljava/lang/Object;

    move-result-object v0

    :cond_4
    return-object v0

    :cond_5
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
