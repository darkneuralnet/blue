.class public final LOt;
.super LFP2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOt$b;
    }
.end annotation


# instance fields
.field public final a:Lwp6;

.field public final b:LFp;

.field public final c:I


# direct methods
.method public constructor <init>(Lwp6;LFp;I)V
    .locals 0

    invoke-direct {p0}, LFP2;-><init>()V

    iput-object p1, p0, LOt;->a:Lwp6;

    iput-object p2, p0, LOt;->b:LFp;

    iput p3, p0, LOt;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Lwp6;LFp;ILOt$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LOt;-><init>(Lwp6;LFp;I)V

    return-void
.end method


# virtual methods
.method public b()LFp;
    .locals 1

    iget-object v0, p0, LOt;->b:LFp;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LOt;->c:I

    return v0
.end method

.method public d()Lwp6;
    .locals 1

    iget-object v0, p0, LOt;->a:Lwp6;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LFP2;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, LFP2;

    iget-object v1, p0, LOt;->a:Lwp6;

    invoke-virtual {p1}, LFP2;->d()Lwp6;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LOt;->b:LFp;

    invoke-virtual {p1}, LFP2;->b()LFp;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, LOt;->c:I

    invoke-virtual {p1}, LFP2;->c()I

    move-result p1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LOt;->a:Lwp6;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, LOt;->b:LFp;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, LOt;->c:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public i()LFP2$a;
    .locals 2

    new-instance v0, LOt$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LOt$b;-><init>(LFP2;LOt$a;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MediaSpec{videoSpec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LOt;->a:Lwp6;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", audioSpec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LOt;->b:LFp;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outputFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LOt;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
