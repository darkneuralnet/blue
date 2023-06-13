.class public final Lw8;
.super LYE2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw8$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lw8$a;


# direct methods
.method public constructor <init>(ILw8$a;)V
    .locals 0

    invoke-direct {p0}, LYE2;-><init>()V

    iput p1, p0, Lw8;->a:I

    iput-object p2, p0, Lw8;->b:Lw8$a;

    return-void
.end method

.method public static a(ILw8$a;)Lw8;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const/16 v0, 0xa

    if-lt p0, v0, :cond_0

    const/16 v0, 0x10

    if-lt v0, p0, :cond_0

    new-instance v0, Lw8;

    invoke-direct {v0, p0, p1}, Lw8;-><init>(ILw8$a;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid tag size for AesCmacParameters: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lw8;->a:I

    return v0
.end method

.method public c()I
    .locals 2

    iget-object v0, p0, Lw8;->b:Lw8$a;

    sget-object v1, Lw8$a;->e:Lw8$a;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lw8;->b()I

    move-result v0

    return v0

    :cond_0
    sget-object v1, Lw8$a;->b:Lw8$a;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lw8;->b()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, 0x5

    return v0

    :cond_1
    sget-object v1, Lw8$a;->c:Lw8$a;

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lw8;->b()I

    move-result v0

    goto :goto_0

    :cond_2
    sget-object v1, Lw8$a;->d:Lw8$a;

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lw8;->b()I

    move-result v0

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown variant"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Lw8$a;
    .locals 1

    iget-object v0, p0, Lw8;->b:Lw8$a;

    return-object v0
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Lw8;->b:Lw8$a;

    sget-object v1, Lw8$a;->e:Lw8$a;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lw8;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lw8;

    invoke-virtual {p1}, Lw8;->c()I

    move-result v0

    invoke-virtual {p0}, Lw8;->c()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lw8;->d()Lw8$a;

    move-result-object p1

    invoke-virtual {p0}, Lw8;->d()Lw8$a;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lw8;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    iget-object v2, p0, Lw8;->b:Lw8$a;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AES-CMAC Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw8;->b:Lw8$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lw8;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte tags)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
