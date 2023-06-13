.class public abstract LU;
.super LS;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LS;",
        "Ljava/lang/Iterable;"
    }
.end annotation


# instance fields
.field public b:[LE;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LS;-><init>()V

    sget-object v0, LF;->d:[LE;

    iput-object v0, p0, LU;->b:[LE;

    return-void
.end method

.method public constructor <init>(LF;)V
    .locals 1

    invoke-direct {p0}, LS;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LF;->g()[LE;

    move-result-object p1

    iput-object p1, p0, LU;->b:[LE;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "\'elementVector\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([LE;Z)V
    .locals 0

    invoke-direct {p0}, LS;-><init>()V

    if-eqz p2, :cond_0

    invoke-static {p1}, LF;->b([LE;)[LE;

    move-result-object p1

    :cond_0
    iput-object p1, p0, LU;->b:[LE;

    return-void
.end method

.method public static z(Ljava/lang/Object;)LU;
    .locals 3

    if-eqz p0, :cond_4

    instance-of v0, p0, LU;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, LV;

    if-eqz v0, :cond_1

    check-cast p0, LV;

    invoke-interface {p0}, LE;->c()LS;

    move-result-object p0

    invoke-static {p0}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, [B

    if-eqz v0, :cond_2

    :try_start_0
    check-cast p0, [B

    invoke-static {p0}, LS;->v([B)LS;

    move-result-object p0

    invoke-static {p0}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "failed to construct sequence from byte[]: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    instance-of v0, p0, LE;

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, LE;

    invoke-interface {v0}, LE;->c()LS;

    move-result-object v0

    instance-of v1, v0, LU;

    if-eqz v1, :cond_3

    check-cast v0, LU;

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown object in getInstance: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    check-cast p0, LU;

    return-object p0
.end method


# virtual methods
.method public A(I)LE;
    .locals 1

    iget-object v0, p0, LU;->b:[LE;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public C()Ljava/util/Enumeration;
    .locals 1

    new-instance v0, LU$a;

    invoke-direct {v0, p0}, LU$a;-><init>(LU;)V

    return-object v0
.end method

.method public D()[LE;
    .locals 1

    iget-object v0, p0, LU;->b:[LE;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LU;->b:[LE;

    array-length v0, v0

    add-int/lit8 v1, v0, 0x1

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    mul-int/lit16 v1, v1, 0x101

    iget-object v2, p0, LU;->b:[LE;

    aget-object v2, v2, v0

    invoke-interface {v2}, LE;->c()LS;

    move-result-object v2

    invoke-virtual {v2}, LS;->hashCode()I

    move-result v2

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "LE;",
            ">;"
        }
    .end annotation

    new-instance v0, LAo$a;

    iget-object v1, p0, LU;->b:[LE;

    invoke-direct {v0, v1}, LAo$a;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

.method public j(LS;)Z
    .locals 5

    instance-of v0, p1, LU;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LU;

    invoke-virtual {p0}, LU;->size()I

    move-result v0

    invoke-virtual {p1}, LU;->size()I

    move-result v2

    if-eq v2, v0, :cond_1

    return v1

    :cond_1
    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_3

    iget-object v3, p0, LU;->b:[LE;

    aget-object v3, v3, v2

    invoke-interface {v3}, LE;->c()LS;

    move-result-object v3

    iget-object v4, p1, LU;->b:[LE;

    aget-object v4, v4, v2

    invoke-interface {v4}, LE;->c()LS;

    move-result-object v4

    if-eq v3, v4, :cond_2

    invoke-virtual {v3, v4}, LS;->j(LS;)Z

    move-result v3

    if-nez v3, :cond_2

    return v1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LU;->b:[LE;

    array-length v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, LU;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "[]"

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, LU;->b:[LE;

    aget-object v3, v3, v2

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v0, :cond_1

    const/16 v0, 0x5d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v3, ", "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public x()LS;
    .locals 3

    new-instance v0, LZF0;

    iget-object v1, p0, LU;->b:[LE;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LZF0;-><init>([LE;Z)V

    return-object v0
.end method

.method public y()LS;
    .locals 3

    new-instance v0, LnG0;

    iget-object v1, p0, LU;->b:[LE;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LnG0;-><init>([LE;Z)V

    return-object v0
.end method
