.class public abstract Lcom/google/crypto/tink/shaded/protobuf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/g$e;,
        Lcom/google/crypto/tink/shaded/protobuf/g$j;,
        Lcom/google/crypto/tink/shaded/protobuf/g$h;,
        Lcom/google/crypto/tink/shaded/protobuf/g$i;,
        Lcom/google/crypto/tink/shaded/protobuf/g$c;,
        Lcom/google/crypto/tink/shaded/protobuf/g$g;,
        Lcom/google/crypto/tink/shaded/protobuf/g$d;,
        Lcom/google/crypto/tink/shaded/protobuf/g$k;,
        Lcom/google/crypto/tink/shaded/protobuf/g$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Byte;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final c:Lcom/google/crypto/tink/shaded/protobuf/g;

.field public static final d:Lcom/google/crypto/tink/shaded/protobuf/g$f;

.field public static final e:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/google/crypto/tink/shaded/protobuf/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/g$j;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/v;->d:[B

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/g$j;-><init>([B)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/g;->c:Lcom/google/crypto/tink/shaded/protobuf/g;

    invoke-static {}, Lib;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/g$k;

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/g$k;-><init>(Lcom/google/crypto/tink/shaded/protobuf/g$a;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/g$d;

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/g$d;-><init>(Lcom/google/crypto/tink/shaded/protobuf/g$a;)V

    :goto_0
    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/g;->d:Lcom/google/crypto/tink/shaded/protobuf/g$f;

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/g$b;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/g$b;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/g;->e:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/g;->b:I

    return-void
.end method

.method public static D(B)I
    .locals 0

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static J([B)Lcom/google/crypto/tink/shaded/protobuf/g;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/g$j;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/g$j;-><init>([B)V

    return-object v0
.end method

.method public static K([BII)Lcom/google/crypto/tink/shaded/protobuf/g;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/g$e;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/g$e;-><init>([BII)V

    return-object v0
.end method

.method public static synthetic a(B)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/g;->D(B)I

    move-result p0

    return p0
.end method

.method public static c(II)V
    .locals 3

    add-int/lit8 v0, p0, 0x1

    sub-int v0, p1, v0

    or-int/2addr v0, p0

    if-gez v0, :cond_1

    if-gez p0, :cond_0

    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index > length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public static e(III)I
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

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

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

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

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

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

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

.method public static f([B)Lcom/google/crypto/tink/shaded/protobuf/g;
    .locals 2

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/g;->h([BII)Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p0

    return-object p0
.end method

.method public static h([BII)Lcom/google/crypto/tink/shaded/protobuf/g;
    .locals 2

    add-int v0, p1, p2

    array-length v1, p0

    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/g;->e(III)I

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/g$j;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/g;->d:Lcom/google/crypto/tink/shaded/protobuf/g$f;

    invoke-interface {v1, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/g$f;->a([BII)[B

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/g$j;-><init>([B)V

    return-object v0
.end method

.method public static j(Ljava/lang/String;)Lcom/google/crypto/tink/shaded/protobuf/g;
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/g$j;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/v;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/g$j;-><init>([B)V

    return-object v0
.end method

.method public static w(I)Lcom/google/crypto/tink/shaded/protobuf/g$h;
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/g$h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/g$h;-><init>(ILcom/google/crypto/tink/shaded/protobuf/g$a;)V

    return-object v0
.end method


# virtual methods
.method public abstract A(II)Lcom/google/crypto/tink/shaded/protobuf/g;
.end method

.method public final C()[B
    .locals 3

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/v;->d:[B

    return-object v0

    :cond_0
    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v2, v0}, Lcom/google/crypto/tink/shaded/protobuf/g;->o([BIII)V

    return-object v1
.end method

.method public final E(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-string p1, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->F(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public abstract F(Ljava/nio/charset/Charset;)Ljava/lang/String;
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/v;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/g;->E(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final I()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result v0

    const/16 v1, 0x32

    if-gt v0, v1, :cond_0

    invoke-static {p0}, LK16;->b(Lcom/google/crypto/tink/shaded/protobuf/g;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    const/16 v2, 0x2f

    invoke-virtual {p0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/g;->A(II)Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v1

    invoke-static {v1}, LK16;->b(Lcom/google/crypto/tink/shaded/protobuf/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public abstract L(LJ70;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract b(I)B
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/g;->b:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/g;->y(III)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/g;->b:I

    :cond_1
    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/g;->v()Lcom/google/crypto/tink/shaded/protobuf/g$g;

    move-result-object v0

    return-object v0
.end method

.method public abstract o([BIII)V
.end method

.method public abstract s(I)B
.end method

.method public abstract size()I
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/g;->I()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "<ByteString@%s size=%d contents=\"%s\">"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract u()Z
.end method

.method public v()Lcom/google/crypto/tink/shaded/protobuf/g$g;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/g$a;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/g$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/g;)V

    return-object v0
.end method

.method public abstract x()Lcom/google/crypto/tink/shaded/protobuf/h;
.end method

.method public abstract y(III)I
.end method

.method public final z()I
    .locals 1

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/g;->b:I

    return v0
.end method
