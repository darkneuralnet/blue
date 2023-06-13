.class public final Lfu8;
.super LCk8;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LCk8<",
        "Lfu8;",
        ">;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field public static volatile f:[Lfu8;


# instance fields
.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LCk8;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lfu8;->d:Ljava/lang/String;

    iput-object v0, p0, Lfu8;->e:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, LCk8;->c:Lcl8;

    const/4 v0, -0x1

    iput v0, p0, LQl8;->b:I

    return-void
.end method

.method public static k()[Lfu8;
    .locals 2

    sget-object v0, Lfu8;->f:[Lfu8;

    if-nez v0, :cond_1

    sget-object v0, LDl8;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lfu8;->f:[Lfu8;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    new-array v1, v1, [Lfu8;

    sput-object v1, Lfu8;->f:[Lfu8;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lfu8;->f:[Lfu8;

    return-object v0
.end method


# virtual methods
.method public final synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Lfu8;->l()Lfu8;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lck8;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lfu8;->d:Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iget-object v2, p0, Lfu8;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lck8;->b(ILjava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lfu8;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    iget-object v1, p0, Lfu8;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lck8;->b(ILjava/lang/String;)V

    :cond_1
    invoke-super {p0, p1}, LCk8;->d(Lck8;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfu8;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfu8;

    iget-object v1, p0, Lfu8;->d:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lfu8;->d:Ljava/lang/String;

    if-eqz v1, :cond_3

    return v2

    :cond_2
    iget-object v3, p1, Lfu8;->d:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lfu8;->e:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, p1, Lfu8;->e:Ljava/lang/String;

    if-eqz v1, :cond_5

    return v2

    :cond_4
    iget-object v3, p1, Lfu8;->e:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LCk8;->c:Lcl8;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcl8;->d()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p0, LCk8;->c:Lcl8;

    iget-object p1, p1, LCk8;->c:Lcl8;

    invoke-virtual {v0, p1}, Lcl8;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_7
    :goto_0
    iget-object p1, p1, LCk8;->c:Lcl8;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcl8;->d()Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_1

    :cond_8
    return v2

    :cond_9
    :goto_1
    return v0
.end method

.method public final g()I
    .locals 4

    invoke-super {p0}, LCk8;->g()I

    move-result v0

    iget-object v1, p0, Lfu8;->d:Ljava/lang/String;

    const-string v2, ""

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iget-object v3, p0, Lfu8;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lck8;->g(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lfu8;->e:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x2

    iget-object v2, p0, Lfu8;->e:Ljava/lang/String;

    invoke-static {v1, v2}, Lck8;->g(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public final synthetic h()LQl8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LQl8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfu8;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    const-class v0, Lfu8;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lfu8;->d:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lfu8;->e:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LCk8;->c:Lcl8;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcl8;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    iget-object v1, p0, LCk8;->c:Lcl8;

    invoke-virtual {v1}, Lcl8;->hashCode()I

    move-result v2

    :cond_3
    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final synthetic j()LCk8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LQl8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfu8;

    return-object v0
.end method

.method public final l()Lfu8;
    .locals 2

    :try_start_0
    invoke-super {p0}, LCk8;->j()LCk8;

    move-result-object v0

    check-cast v0, Lfu8;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method
