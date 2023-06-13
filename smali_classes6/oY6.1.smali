.class public final LoY6;
.super LL77;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:LI57;


# direct methods
.method public constructor <init>(ILI57;)V
    .locals 0

    invoke-direct {p0}, LL77;-><init>()V

    iput p1, p0, LoY6;->a:I

    iput-object p2, p0, LoY6;->b:LI57;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LoY6;->a:I

    return v0
.end method

.method public final b()LI57;
    .locals 1

    iget-object v0, p0, LoY6;->b:LI57;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LL77;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, LL77;

    iget v1, p0, LoY6;->a:I

    invoke-virtual {p1}, LL77;->a()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, LoY6;->b:LI57;

    invoke-virtual {p1}, LL77;->b()LI57;

    move-result-object p1

    invoke-virtual {v1, p1}, LI57;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, LoY6;->a:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    iget-object v2, p0, LoY6;->b:LI57;

    invoke-virtual {v2}, LI57;->hashCode()I

    move-result v2

    mul-int/2addr v0, v1

    xor-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, LoY6;->a:I

    iget-object v1, p0, LoY6;->b:LI57;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "VkpStatus{exceptionType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remoteException="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
