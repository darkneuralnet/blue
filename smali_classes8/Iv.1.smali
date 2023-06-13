.class public LIv;
.super LO;
.source "SourceFile"


# instance fields
.field public final c:I

.field public final d:[LO;


# direct methods
.method public constructor <init>([B)V
    .locals 1

    const/16 v0, 0x3e8

    invoke-direct {p0, p1, v0}, LIv;-><init>([BI)V

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, LIv;-><init>([B[LO;I)V

    return-void
.end method

.method public constructor <init>([B[LO;I)V
    .locals 0

    invoke-direct {p0, p1}, LO;-><init>([B)V

    iput-object p2, p0, LIv;->d:[LO;

    iput p3, p0, LIv;->c:I

    return-void
.end method

.method public constructor <init>([LO;)V
    .locals 1

    const/16 v0, 0x3e8

    invoke-direct {p0, p1, v0}, LIv;-><init>([LO;I)V

    return-void
.end method

.method public constructor <init>([LO;I)V
    .locals 1

    invoke-static {p1}, LIv;->H([LO;)[B

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, LIv;-><init>([B[LO;I)V

    return-void
.end method

.method public static synthetic D(LIv;)I
    .locals 0

    iget p0, p0, LIv;->c:I

    return p0
.end method

.method public static synthetic E(LIv;)[LO;
    .locals 0

    iget-object p0, p0, LIv;->d:[LO;

    return-object p0
.end method

.method public static F(LU;)LIv;
    .locals 4

    invoke-virtual {p0}, LU;->size()I

    move-result v0

    new-array v1, v0, [LO;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p0, v2}, LU;->A(I)LE;

    move-result-object v3

    invoke-static {v3}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, LIv;

    invoke-direct {p0, v1}, LIv;-><init>([LO;)V

    return-object p0
.end method

.method public static H([LO;)[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-eq v1, v2, :cond_0

    :try_start_0
    aget-object v2, p0, v1

    invoke-virtual {v2}, LO;->C()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "exception converting octets "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public G()Ljava/util/Enumeration;
    .locals 1

    iget-object v0, p0, LIv;->d:[LO;

    if-nez v0, :cond_0

    new-instance v0, LIv$a;

    invoke-direct {v0, p0}, LIv$a;-><init>(LIv;)V

    return-object v0

    :cond_0
    new-instance v0, LIv$b;

    invoke-direct {v0, p0}, LIv$b;-><init>(LIv;)V

    return-object v0
.end method

.method public o(LQ;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x24

    invoke-virtual {p0}, LIv;->G()Ljava/util/Enumeration;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LQ;->p(ZILjava/util/Enumeration;)V

    return-void
.end method

.method public s()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LIv;->G()Ljava/util/Enumeration;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LE;

    invoke-interface {v2}, LE;->c()LS;

    move-result-object v2

    invoke-virtual {v2}, LS;->s()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x2

    return v1
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
