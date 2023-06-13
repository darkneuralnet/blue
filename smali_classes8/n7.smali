.class public final Ln7;
.super Lo0;
.source "SourceFile"

# interfaces
.implements LNj6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo0;",
        "LNj6<",
        "Ljava/lang/Number;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x295fd4aad92c66bcL


# instance fields
.field public final e:Ljava/lang/Number;


# direct methods
.method public constructor <init>(Ljava/lang/Number;)V
    .locals 1

    invoke-direct {p0}, Lo0;-><init>()V

    invoke-static {}, Lt80;->c()Lsd3;

    move-result-object v0

    invoke-interface {v0, p1}, Lsd3;->d(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p1

    iput-object p1, p0, Ln7;->e:Ljava/lang/Number;

    return-void
.end method


# virtual methods
.method public D()Z
    .locals 1

    invoke-virtual {p0}, Ln7;->d()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lae6;

    invoke-virtual {p0, p1}, Ln7;->j(Lae6;)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 2

    invoke-static {}, Lt80;->c()Lsd3;

    move-result-object v0

    iget-object v1, p0, Ln7;->e:Ljava/lang/Number;

    invoke-interface {v0, v1}, Lsd3;->e(Ljava/lang/Number;)Z

    move-result v0

    return v0
.end method

.method public e(Lo0;)Z
    .locals 0

    instance-of p1, p1, Ln7;

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ln7;

    if-eqz v0, :cond_1

    check-cast p1, Ln7;

    iget-object v0, p0, Ln7;->e:Ljava/lang/Number;

    iget-object p1, p1, Ln7;->e:Ljava/lang/Number;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic g()Lo0;
    .locals 1

    invoke-virtual {p0}, Ln7;->m()Ln7;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ln7;->l()Ljava/lang/Number;

    move-result-object v0

    return-object v0
.end method

.method public h(Lo0;)Lo0;
    .locals 2

    invoke-static {}, Lt80;->c()Lsd3;

    move-result-object v0

    iget-object v1, p0, Ln7;->e:Ljava/lang/Number;

    check-cast p1, Ln7;

    iget-object p1, p1, Ln7;->e:Ljava/lang/Number;

    invoke-interface {v0, v1, p1}, Lsd3;->g(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p1

    new-instance v0, Ln7;

    invoke-direct {v0, p1}, Ln7;-><init>(Ljava/lang/Number;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ln7;->e:Ljava/lang/Number;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 4

    invoke-static {}, Lt80;->c()Lsd3;

    move-result-object v0

    iget-object v1, p0, Ln7;->e:Ljava/lang/Number;

    invoke-interface {v0, v1}, Lsd3;->i(Ljava/lang/Number;)I

    move-result v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    if-gez v1, :cond_0

    const-string v1, "-"

    goto :goto_0

    :cond_0
    const-string v1, "+"

    :goto_0
    const/4 v3, 0x0

    aput-object v1, v2, v3

    iget-object v1, p0, Ln7;->e:Ljava/lang/Number;

    invoke-interface {v0, v1}, Lsd3;->h(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "x -> x %s %s"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j(Lae6;)I
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    instance-of v0, p1, Ln7;

    if-eqz v0, :cond_1

    invoke-static {}, Lt80;->c()Lsd3;

    move-result-object v0

    invoke-virtual {p0}, Ln7;->l()Ljava/lang/Number;

    move-result-object v1

    check-cast p1, Ln7;

    invoke-virtual {p1}, Ln7;->l()Ljava/lang/Number;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lsd3;->b(Ljava/lang/Number;Ljava/lang/Number;)I

    move-result p1

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public k()Ljava/lang/Number;
    .locals 1

    iget-object v0, p0, Ln7;->e:Ljava/lang/Number;

    return-object v0
.end method

.method public l()Ljava/lang/Number;
    .locals 1

    iget-object v0, p0, Ln7;->e:Ljava/lang/Number;

    return-object v0
.end method

.method public m()Ln7;
    .locals 2

    invoke-static {}, Lt80;->c()Lsd3;

    move-result-object v0

    iget-object v1, p0, Ln7;->e:Ljava/lang/Number;

    invoke-interface {v0, v1}, Lsd3;->j(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object v0

    new-instance v1, Ln7;

    invoke-direct {v1, v0}, Ln7;-><init>(Ljava/lang/Number;)V

    return-object v1
.end method
