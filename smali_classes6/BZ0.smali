.class public LBZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LhF0;


# instance fields
.field public a:LMX3;

.field public b:LjF0;


# direct methods
.method public constructor <init>(LMX3;LjF0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBZ0;->a:LMX3;

    iput-object p2, p0, LBZ0;->b:LjF0;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LBZ0;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LBZ0;

    iget-object v0, p0, LBZ0;->a:LMX3;

    iget-object p1, p1, LBZ0;->a:LMX3;

    invoke-virtual {v0, p1}, LMX3;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LBZ0;->a:LMX3;

    invoke-virtual {v0}, LMX3;->hashCode()I

    move-result v0

    return v0
.end method

.method public remove()V
    .locals 2

    iget-object v0, p0, LBZ0;->b:LjF0;

    iget-object v1, p0, LBZ0;->a:LMX3;

    invoke-virtual {v0, v1}, LjF0;->g(LMX3;)V

    iget-object v0, p0, LBZ0;->a:LMX3;

    invoke-virtual {v0}, LMX3;->a()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LBZ0;->a:LMX3;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
