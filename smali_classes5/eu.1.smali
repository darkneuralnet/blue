.class public final Leu;
.super LBs5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leu$b;
    }
.end annotation


# instance fields
.field public final a:LT96;

.field public final b:Ljava/lang/String;

.field public final c:Lyg1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyg1<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:LC96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LC96<",
            "*[B>;"
        }
    .end annotation
.end field

.field public final e:LPc1;


# direct methods
.method public constructor <init>(LT96;Ljava/lang/String;Lyg1;LC96;LPc1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LT96;",
            "Ljava/lang/String;",
            "Lyg1<",
            "*>;",
            "LC96<",
            "*[B>;",
            "LPc1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, LBs5;-><init>()V

    iput-object p1, p0, Leu;->a:LT96;

    iput-object p2, p0, Leu;->b:Ljava/lang/String;

    iput-object p3, p0, Leu;->c:Lyg1;

    iput-object p4, p0, Leu;->d:LC96;

    iput-object p5, p0, Leu;->e:LPc1;

    return-void
.end method

.method public synthetic constructor <init>(LT96;Ljava/lang/String;Lyg1;LC96;LPc1;Leu$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Leu;-><init>(LT96;Ljava/lang/String;Lyg1;LC96;LPc1;)V

    return-void
.end method


# virtual methods
.method public b()LPc1;
    .locals 1

    iget-object v0, p0, Leu;->e:LPc1;

    return-object v0
.end method

.method public c()Lyg1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyg1<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Leu;->c:Lyg1;

    return-object v0
.end method

.method public e()LC96;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LC96<",
            "*[B>;"
        }
    .end annotation

    iget-object v0, p0, Leu;->d:LC96;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LBs5;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, LBs5;

    iget-object v1, p0, Leu;->a:LT96;

    invoke-virtual {p1}, LBs5;->f()LT96;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Leu;->b:Ljava/lang/String;

    invoke-virtual {p1}, LBs5;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Leu;->c:Lyg1;

    invoke-virtual {p1}, LBs5;->c()Lyg1;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Leu;->d:LC96;

    invoke-virtual {p1}, LBs5;->e()LC96;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Leu;->e:LPc1;

    invoke-virtual {p1}, LBs5;->b()LPc1;

    move-result-object p1

    invoke-virtual {v1, p1}, LPc1;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public f()LT96;
    .locals 1

    iget-object v0, p0, Leu;->a:LT96;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Leu;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Leu;->a:LT96;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Leu;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Leu;->c:Lyg1;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Leu;->d:LC96;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Leu;->e:LPc1;

    invoke-virtual {v1}, LPc1;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SendRequest{transportContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leu;->a:LT96;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transportName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leu;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", event="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leu;->c:Lyg1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transformer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leu;->d:LC96;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", encoding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leu;->e:LPc1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
