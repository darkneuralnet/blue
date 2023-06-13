.class public final LYL4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lak2;


# static fields
.field public static final j:LuE2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuE2<",
            "Ljava/lang/Class<",
            "*>;[B>;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lto;

.field public final c:Lak2;

.field public final d:Lak2;

.field public final e:I

.field public final f:I

.field public final g:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final h:Lsy3;

.field public final i:Lr96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr96<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LuE2;

    const-wide/16 v1, 0x32

    invoke-direct {v0, v1, v2}, LuE2;-><init>(J)V

    sput-object v0, LYL4;->j:LuE2;

    return-void
.end method

.method public constructor <init>(Lto;Lak2;Lak2;IILr96;Ljava/lang/Class;Lsy3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lto;",
            "Lak2;",
            "Lak2;",
            "II",
            "Lr96<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lsy3;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYL4;->b:Lto;

    iput-object p2, p0, LYL4;->c:Lak2;

    iput-object p3, p0, LYL4;->d:Lak2;

    iput p4, p0, LYL4;->e:I

    iput p5, p0, LYL4;->f:I

    iput-object p6, p0, LYL4;->i:Lr96;

    iput-object p7, p0, LYL4;->g:Ljava/lang/Class;

    iput-object p8, p0, LYL4;->h:Lsy3;

    return-void
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 3

    iget-object v0, p0, LYL4;->b:Lto;

    const/16 v1, 0x8

    const-class v2, [B

    invoke-interface {v0, v1, v2}, Lto;->d(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget v2, p0, LYL4;->e:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget v2, p0, LYL4;->f:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    iget-object v1, p0, LYL4;->d:Lak2;

    invoke-interface {v1, p1}, Lak2;->a(Ljava/security/MessageDigest;)V

    iget-object v1, p0, LYL4;->c:Lak2;

    invoke-interface {v1, p1}, Lak2;->a(Ljava/security/MessageDigest;)V

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    iget-object v1, p0, LYL4;->i:Lr96;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lak2;->a(Ljava/security/MessageDigest;)V

    :cond_0
    iget-object v1, p0, LYL4;->h:Lsy3;

    invoke-virtual {v1, p1}, Lsy3;->a(Ljava/security/MessageDigest;)V

    invoke-virtual {p0}, LYL4;->c()[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/security/MessageDigest;->update([B)V

    iget-object p1, p0, LYL4;->b:Lto;

    invoke-interface {p1, v0}, Lto;->put(Ljava/lang/Object;)V

    return-void
.end method

.method public final c()[B
    .locals 3

    sget-object v0, LYL4;->j:LuE2;

    iget-object v1, p0, LYL4;->g:Ljava/lang/Class;

    invoke-virtual {v0, v1}, LuE2;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    if-nez v1, :cond_0

    iget-object v1, p0, LYL4;->g:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lak2;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    iget-object v2, p0, LYL4;->g:Ljava/lang/Class;

    invoke-virtual {v0, v2, v1}, LuE2;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LYL4;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LYL4;

    iget v0, p0, LYL4;->f:I

    iget v2, p1, LYL4;->f:I

    if-ne v0, v2, :cond_0

    iget v0, p0, LYL4;->e:I

    iget v2, p1, LYL4;->e:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, LYL4;->i:Lr96;

    iget-object v2, p1, LYL4;->i:Lr96;

    invoke-static {v0, v2}, Lpi6;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYL4;->g:Ljava/lang/Class;

    iget-object v2, p1, LYL4;->g:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYL4;->c:Lak2;

    iget-object v2, p1, LYL4;->c:Lak2;

    invoke-interface {v0, v2}, Lak2;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYL4;->d:Lak2;

    iget-object v2, p1, LYL4;->d:Lak2;

    invoke-interface {v0, v2}, Lak2;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYL4;->h:Lsy3;

    iget-object p1, p1, LYL4;->h:Lsy3;

    invoke-virtual {v0, p1}, Lsy3;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LYL4;->c:Lak2;

    invoke-interface {v0}, Lak2;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LYL4;->d:Lak2;

    invoke-interface {v1}, Lak2;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LYL4;->e:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LYL4;->f:I

    add-int/2addr v0, v1

    iget-object v1, p0, LYL4;->i:Lr96;

    if-eqz v1, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LYL4;->g:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LYL4;->h:Lsy3;

    invoke-virtual {v1}, Lsy3;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ResourceCacheKey{sourceKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYL4;->c:Lak2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYL4;->d:Lak2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYL4;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYL4;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodedResourceClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYL4;->g:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transformation=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYL4;->i:Lr96;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", options="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYL4;->h:Lsy3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
