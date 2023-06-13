.class public final LbV8;
.super LES8;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, LES8;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)LbV8;
    .locals 0

    invoke-super {p0, p1}, LES8;->a(Ljava/lang/Object;)LES8;

    return-object p0
.end method

.method public final d()LmV8;
    .locals 3

    iget v0, p0, LES8;->b:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v2, p0, LES8;->a:[Ljava/lang/Object;

    invoke-static {v0, v2}, LmV8;->s(I[Ljava/lang/Object;)LmV8;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    iput v2, p0, LES8;->b:I

    iput-boolean v1, p0, LES8;->c:Z

    return-object v0

    :cond_0
    iget-object v0, p0, LES8;->a:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LxX8;

    invoke-direct {v1, v0}, LxX8;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    sget-object v0, LdX8;->j:LdX8;

    return-object v0
.end method
