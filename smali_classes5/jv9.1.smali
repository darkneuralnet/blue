.class public abstract Ljv9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Byte;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Ljv9;

.field public static final d:Lyh7;

.field public static final e:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljv9;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldl7;

    sget-object v1, LlF7;->c:[B

    invoke-direct {v0, v1}, Ldl7;-><init>([B)V

    sput-object v0, Ljv9;->c:Ljv9;

    invoke-static {}, Lgd9;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lgk7;

    invoke-direct {v0, v1}, Lgk7;-><init>(LLt9;)V

    goto :goto_0

    :cond_0
    new-instance v0, LCf7;

    invoke-direct {v0, v1}, LCf7;-><init>(LLt9;)V

    :goto_0
    sput-object v0, Ljv9;->d:Lyh7;

    new-instance v0, Lsx9;

    invoke-direct {v0}, Lsx9;-><init>()V

    sput-object v0, Ljv9;->e:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ljv9;->b:I

    return-void
.end method

.method public static C(I)Lmj7;
    .locals 2

    new-instance v0, Lmj7;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lmj7;-><init>(ILLt9;)V

    return-object v0
.end method

.method public static f(B)I
    .locals 0

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static synthetic v(B)I
    .locals 0

    invoke-static {p0}, Ljv9;->f(B)I

    move-result p0

    return p0
.end method

.method public static w(III)I
    .locals 3

    sub-int v0, p1, p0

    or-int v1, p0, p1

    or-int/2addr v1, v0

    sub-int v2, p2, p1

    or-int/2addr v1, v2

    if-gez v1, :cond_2

    if-ltz p0, :cond_1

    if-ge p1, p0, :cond_0

    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x42

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Beginning index larger than ending index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x25

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "End index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " >= "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    new-instance p2, Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Beginning index: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " < 0"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return v0
.end method

.method public static x([BII)Ljv9;
    .locals 2

    add-int v0, p1, p2

    array-length v1, p0

    invoke-static {p1, v0, v1}, Ljv9;->w(III)I

    new-instance v0, Ldl7;

    sget-object v1, Ljv9;->d:Lyh7;

    invoke-interface {v1, p0, p1, p2}, Lyh7;->a([BII)[B

    move-result-object p0

    invoke-direct {v0, p0}, Ldl7;-><init>([B)V

    return-object v0
.end method

.method public static z(Ljava/lang/String;)Ljv9;
    .locals 2

    new-instance v0, Ldl7;

    sget-object v1, LlF7;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Ldl7;-><init>([B)V

    return-object v0
.end method


# virtual methods
.method public abstract A(I)B
.end method

.method public final a()[B
    .locals 3

    invoke-virtual {p0}, Ljv9;->size()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, LlF7;->c:[B

    return-object v0

    :cond_0
    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v2, v0}, Ljv9;->u([BIII)V

    return-object v1
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    sget-object v0, LlF7;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Ljv9;->size()I

    move-result v1

    if-nez v1, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {p0, v0}, Ljv9;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract c()Z
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Ljv9;->b:I

    return v0
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public abstract h(III)I
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Ljv9;->b:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljv9;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0}, Ljv9;->h(III)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput v0, p0, Ljv9;->b:I

    :cond_1
    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LLt9;

    invoke-direct {v0, p0}, LLt9;-><init>(Ljv9;)V

    return-object v0
.end method

.method public abstract j(Ljava/nio/charset/Charset;)Ljava/lang/String;
.end method

.method public abstract o(II)Ljv9;
.end method

.method public abstract s(LDq9;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract size()I
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Ljv9;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "<ByteString@%s size=%d>"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract u([BIII)V
.end method

.method public abstract y(I)B
.end method
