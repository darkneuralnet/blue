.class public final LHS7;
.super LXT7;
.source "SourceFile"


# instance fields
.field public final b:LvQ8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LvQ8<",
            "Ljava/lang/Integer;",
            "Lnh9;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwu9;


# direct methods
.method public constructor <init>(LvQ8;Lwu9;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LvQ8<",
            "Ljava/lang/Integer;",
            "Lnh9;",
            ">;",
            "Lwu9;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, LXT7;-><init>()V

    iput-object p1, p0, LHS7;->b:LvQ8;

    if-eqz p2, :cond_0

    iput-object p2, p0, LHS7;->c:Lwu9;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null mobileDynamicChallengeSignalsResults"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()LvQ8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LvQ8<",
            "Ljava/lang/Integer;",
            "Lnh9;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LHS7;->b:LvQ8;

    return-object v0
.end method

.method public final b()Lwu9;
    .locals 1

    iget-object v0, p0, LHS7;->c:Lwu9;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LXT7;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, LXT7;

    iget-object v1, p0, LHS7;->b:LvQ8;

    invoke-virtual {p1}, LXT7;->a()LvQ8;

    move-result-object v3

    invoke-virtual {v1, v3}, LvQ8;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LHS7;->c:Lwu9;

    invoke-virtual {p1}, LXT7;->b()Lwu9;

    move-result-object p1

    invoke-virtual {v1, p1}, LEm9;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, LHS7;->b:LvQ8;

    invoke-virtual {v0}, LvQ8;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v1, p0, LHS7;->c:Lwu9;

    invoke-virtual {v1}, LEm9;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, LHS7;->b:LvQ8;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LHS7;->c:Lwu9;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x4e

    add-int/2addr v2, v3

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "OutOfGuardsSignalResults{signalValues="

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mobileDynamicChallengeSignalsResults="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
