.class public LIy;
.super LGy;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, LGy;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;)LIy;
    .locals 1

    sget-object v0, LsO5;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-static {p0}, LIy;->e([B)LIy;

    move-result-object p0

    return-object p0
.end method

.method public static e([B)LIy;
    .locals 2

    new-instance v0, LIy;

    const/4 v1, 0x1

    invoke-static {p0, v1}, LHy;->g([BZ)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, LIy;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static f(Ljava/lang/String;)LIy;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, LIy;

    invoke-direct {v0, p0}, LIy;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LIy;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LGy;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
