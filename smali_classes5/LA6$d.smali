.class public LLA6$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lak2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLA6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final b:Lak2;

.field public final c:I


# direct methods
.method public constructor <init>(Lak2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLA6$d;->b:Lak2;

    iput p2, p0, LLA6$d;->c:I

    return-void
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 2

    const/16 v0, 0xc

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v1, p0, LLA6$d;->c:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    iget-object v0, p0, LLA6$d;->b:Lak2;

    invoke-interface {v0, p1}, Lak2;->a(Ljava/security/MessageDigest;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LLA6$d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LLA6$d;

    iget-object v0, p0, LLA6$d;->b:Lak2;

    iget-object v2, p1, LLA6$d;->b:Lak2;

    invoke-interface {v0, v2}, Lak2;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LLA6$d;->c:I

    iget p1, p1, LLA6$d;->c:I

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LLA6$d;->b:Lak2;

    invoke-interface {v0}, Lak2;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LLA6$d;->c:I

    add-int/2addr v0, v1

    return v0
.end method
