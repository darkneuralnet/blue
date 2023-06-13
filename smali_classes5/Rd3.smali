.class public LRd3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRd3$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "LRd3$a;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static g:I


# instance fields
.field public a:I

.field public b:I

.field public c:[Ljava/lang/Object;

.field public d:I

.field public e:LRd3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public f:F


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILRd3$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_0

    iput p1, p0, LRd3;->b:I

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, LRd3;->c:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, LRd3;->d:I

    iput-object p2, p0, LRd3;->e:LRd3$a;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, LRd3;->f:F

    invoke-virtual {p0}, LRd3;->d()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Object Pool must be instantiated with a capacity greater than 0!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static declared-synchronized a(ILRd3$a;)LRd3;
    .locals 2

    const-class v0, LRd3;

    monitor-enter v0

    :try_start_0
    new-instance v1, LRd3;

    invoke-direct {v1, p0, p1}, LRd3;-><init>(ILRd3$a;)V

    sget p0, LRd3;->g:I

    iput p0, v1, LRd3;->a:I

    add-int/lit8 p0, p0, 0x1

    sput p0, LRd3;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public declared-synchronized b()LRd3$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget v0, p0, LRd3;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, LRd3;->f:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-virtual {p0}, LRd3;->d()V

    :cond_0
    iget-object v0, p0, LRd3;->c:[Ljava/lang/Object;

    iget v1, p0, LRd3;->d:I

    aget-object v0, v0, v1

    check-cast v0, LRd3$a;

    sget v2, LRd3$a;->b:I

    iput v2, v0, LRd3$a;->a:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LRd3;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c(LRd3$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget v0, p1, LRd3$a;->a:I

    sget v1, LRd3$a;->b:I

    if-eq v0, v1, :cond_1

    iget v1, p0, LRd3;->a:I

    if-ne v0, v1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The object passed is already stored in this pool!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The object to recycle already belongs to poolId "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, LRd3$a;->a:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ".  Object cannot belong to two different pool instances simultaneously!"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, LRd3;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LRd3;->d:I

    iget-object v1, p0, LRd3;->c:[Ljava/lang/Object;

    array-length v1, v1

    if-lt v0, v1, :cond_2

    invoke-virtual {p0}, LRd3;->f()V

    :cond_2
    iget v0, p0, LRd3;->a:I

    iput v0, p1, LRd3$a;->a:I

    iget-object v0, p0, LRd3;->c:[Ljava/lang/Object;

    iget v1, p0, LRd3;->d:I

    aput-object p1, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final d()V
    .locals 1

    iget v0, p0, LRd3;->f:F

    invoke-virtual {p0, v0}, LRd3;->e(F)V

    return-void
.end method

.method public final e(F)V
    .locals 4

    iget v0, p0, LRd3;->b:I

    int-to-float v1, v0

    mul-float/2addr v1, p1

    float-to-int p1, v1

    const/4 v1, 0x1

    if-ge p1, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    if-le p1, v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, p1

    :goto_0
    const/4 p1, 0x0

    :goto_1
    if-ge p1, v0, :cond_2

    iget-object v2, p0, LRd3;->c:[Ljava/lang/Object;

    iget-object v3, p0, LRd3;->e:LRd3$a;

    invoke-virtual {v3}, LRd3$a;->a()LRd3$a;

    move-result-object v3

    aput-object v3, v2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    sub-int/2addr v0, v1

    iput v0, p0, LRd3;->d:I

    return-void
.end method

.method public final f()V
    .locals 4

    iget v0, p0, LRd3;->b:I

    mul-int/lit8 v1, v0, 0x2

    iput v1, p0, LRd3;->b:I

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, LRd3;->c:[Ljava/lang/Object;

    aget-object v3, v3, v2

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, LRd3;->c:[Ljava/lang/Object;

    return-void
.end method

.method public g(F)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    :goto_0
    move p1, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    iput p1, p0, LRd3;->f:F

    return-void
.end method
