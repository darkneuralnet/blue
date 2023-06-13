.class public final LRM7;
.super LbH7;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/Object;

.field public c:I

.field public final synthetic d:LzN7;


# direct methods
.method public constructor <init>(LzN7;I)V
    .locals 0

    iput-object p1, p0, LRM7;->d:LzN7;

    invoke-direct {p0}, LbH7;-><init>()V

    iget-object p1, p1, LzN7;->d:[Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    aget-object p1, p1, p2

    iput-object p1, p0, LRM7;->b:Ljava/lang/Object;

    iput p2, p0, LRM7;->c:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, LRM7;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v1, p0, LRM7;->d:LzN7;

    invoke-virtual {v1}, LzN7;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v0, p0, LRM7;->b:Ljava/lang/Object;

    iget-object v1, p0, LRM7;->d:LzN7;

    iget v2, p0, LRM7;->c:I

    iget-object v1, v1, LzN7;->d:[Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    aget-object v1, v1, v2

    invoke-static {v0, v1}, LBq7;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, LRM7;->d:LzN7;

    iget-object v1, p0, LRM7;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, LzN7;->d(LzN7;Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, LRM7;->c:I

    return-void
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LRM7;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LRM7;->d:LzN7;

    invoke-virtual {v0}, LzN7;->j()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LRM7;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LRM7;->a()V

    iget v0, p0, LRM7;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v1, p0, LRM7;->d:LzN7;

    iget-object v1, v1, LzN7;->e:[Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    aget-object v0, v1, v0

    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LRM7;->d:LzN7;

    invoke-virtual {v0}, LzN7;->j()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LRM7;->b:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, LRM7;->a()V

    iget v0, p0, LRM7;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LRM7;->d:LzN7;

    iget-object v1, p0, LRM7;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, LzN7;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return-object p1

    :cond_1
    iget-object v1, p0, LRM7;->d:LzN7;

    iget-object v1, v1, LzN7;->e:[Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    aget-object v2, v1, v0

    aput-object p1, v1, v0

    return-object v2
.end method
