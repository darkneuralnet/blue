.class public abstract Lyb0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:LTV5;

.field public final d:LHX1;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Integer;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lyb0;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()LUV5;
    .locals 3

    new-instance v0, LbW5;

    invoke-virtual {p0}, Lyb0;->d()LTV5;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, LTV5;

    invoke-virtual {p0}, Lyb0;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LbW5;-><init>(LTV5;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public b()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lyb0;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public c()LHX1;
    .locals 1

    iget-object v0, p0, Lyb0;->d:LHX1;

    return-object v0
.end method

.method public d()LTV5;
    .locals 1

    iget-object v0, p0, Lyb0;->c:LTV5;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lyb0;->a:I

    return v0
.end method
