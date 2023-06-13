.class public LD;
.super LS;
.source "SourceFile"


# static fields
.field public static final c:LD;

.field public static final d:LD;


# instance fields
.field public final b:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LD;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD;-><init>(B)V

    sput-object v0, LD;->c:LD;

    new-instance v0, LD;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, LD;-><init>(B)V

    sput-object v0, LD;->d:LD;

    return-void
.end method

.method public constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, LS;-><init>()V

    iput-byte p1, p0, LD;->b:B

    return-void
.end method

.method public static z([B)LD;
    .locals 2

    array-length v0, p0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    aget-byte p0, p0, v0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_1

    if-eqz p0, :cond_0

    new-instance v0, LD;

    invoke-direct {v0, p0}, LD;-><init>(B)V

    return-object v0

    :cond_0
    sget-object p0, LD;->c:LD;

    return-object p0

    :cond_1
    sget-object p0, LD;->d:LD;

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "BOOLEAN value should have 1 byte in it"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public A()Z
    .locals 1

    iget-byte v0, p0, LD;->b:B

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, LD;->A()Z

    move-result v0

    return v0
.end method

.method public j(LS;)Z
    .locals 2

    instance-of v0, p1, LD;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LD;

    invoke-virtual {p0}, LD;->A()Z

    move-result v0

    invoke-virtual {p1}, LD;->A()Z

    move-result p1

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public o(LQ;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    iget-byte v1, p0, LD;->b:B

    invoke-virtual {p1, p2, v0, v1}, LQ;->j(ZIB)V

    return-void
.end method

.method public s()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LD;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "TRUE"

    goto :goto_0

    :cond_0
    const-string v0, "FALSE"

    :goto_0
    return-object v0
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public x()LS;
    .locals 1

    invoke-virtual {p0}, LD;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LD;->d:LD;

    goto :goto_0

    :cond_0
    sget-object v0, LD;->c:LD;

    :goto_0
    return-object v0
.end method
