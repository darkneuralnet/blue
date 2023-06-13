.class public Lcom/bumptech/glide/integration/webp/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/integration/webp/a$d;,
        Lcom/bumptech/glide/integration/webp/a$b;,
        Lcom/bumptech/glide/integration/webp/a$a;,
        Lcom/bumptech/glide/integration/webp/a$c;,
        Lcom/bumptech/glide/integration/webp/a$e;
    }
.end annotation


# static fields
.field public static final a:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/bumptech/glide/integration/webp/a;->f()Z

    move-result v0

    sput-boolean v0, Lcom/bumptech/glide/integration/webp/a;->a:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/bumptech/glide/integration/webp/a$c;)Lcom/bumptech/glide/integration/webp/a$e;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p0}, Lcom/bumptech/glide/integration/webp/a$c;->a()I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    const/high16 v1, -0x10000

    and-int/2addr v0, v1

    invoke-interface {p0}, Lcom/bumptech/glide/integration/webp/a$c;->a()I

    move-result v2

    const v3, 0xffff

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    const v2, 0x52494646

    if-eq v0, v2, :cond_0

    sget-object p0, Lcom/bumptech/glide/integration/webp/a$e;->j:Lcom/bumptech/glide/integration/webp/a$e;

    return-object p0

    :cond_0
    const-wide/16 v4, 0x4

    invoke-interface {p0, v4, v5}, Lcom/bumptech/glide/integration/webp/a$c;->skip(J)J

    invoke-interface {p0}, Lcom/bumptech/glide/integration/webp/a$c;->a()I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    and-int/2addr v0, v1

    invoke-interface {p0}, Lcom/bumptech/glide/integration/webp/a$c;->a()I

    move-result v2

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    const v2, 0x57454250

    if-eq v0, v2, :cond_1

    sget-object p0, Lcom/bumptech/glide/integration/webp/a$e;->j:Lcom/bumptech/glide/integration/webp/a$e;

    return-object p0

    :cond_1
    invoke-interface {p0}, Lcom/bumptech/glide/integration/webp/a$c;->a()I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    and-int/2addr v0, v1

    invoke-interface {p0}, Lcom/bumptech/glide/integration/webp/a$c;->a()I

    move-result v1

    and-int/2addr v1, v3

    or-int/2addr v0, v1

    const v1, 0x56503820

    if-ne v0, v1, :cond_2

    sget-object p0, Lcom/bumptech/glide/integration/webp/a$e;->d:Lcom/bumptech/glide/integration/webp/a$e;

    return-object p0

    :cond_2
    const v1, 0x5650384c

    if-ne v0, v1, :cond_4

    invoke-interface {p0, v4, v5}, Lcom/bumptech/glide/integration/webp/a$c;->skip(J)J

    invoke-interface {p0}, Lcom/bumptech/glide/integration/webp/a$c;->b()I

    move-result p0

    and-int/lit8 p0, p0, 0x8

    if-eqz p0, :cond_3

    sget-object p0, Lcom/bumptech/glide/integration/webp/a$e;->f:Lcom/bumptech/glide/integration/webp/a$e;

    goto :goto_0

    :cond_3
    sget-object p0, Lcom/bumptech/glide/integration/webp/a$e;->e:Lcom/bumptech/glide/integration/webp/a$e;

    :goto_0
    return-object p0

    :cond_4
    const v1, 0x56503858

    if-ne v0, v1, :cond_7

    invoke-interface {p0, v4, v5}, Lcom/bumptech/glide/integration/webp/a$c;->skip(J)J

    invoke-interface {p0}, Lcom/bumptech/glide/integration/webp/a$c;->b()I

    move-result p0

    and-int/lit8 v0, p0, 0x2

    if-eqz v0, :cond_5

    sget-object p0, Lcom/bumptech/glide/integration/webp/a$e;->i:Lcom/bumptech/glide/integration/webp/a$e;

    return-object p0

    :cond_5
    and-int/lit8 p0, p0, 0x10

    if-eqz p0, :cond_6

    sget-object p0, Lcom/bumptech/glide/integration/webp/a$e;->h:Lcom/bumptech/glide/integration/webp/a$e;

    return-object p0

    :cond_6
    sget-object p0, Lcom/bumptech/glide/integration/webp/a$e;->g:Lcom/bumptech/glide/integration/webp/a$e;

    return-object p0

    :cond_7
    sget-object p0, Lcom/bumptech/glide/integration/webp/a$e;->j:Lcom/bumptech/glide/integration/webp/a$e;

    return-object p0
.end method

.method public static b(Ljava/io/InputStream;Lto;)Lcom/bumptech/glide/integration/webp/a$e;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, Lcom/bumptech/glide/integration/webp/a$e;->j:Lcom/bumptech/glide/integration/webp/a$e;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lbt4;

    invoke-direct {v0, p0, p1}, Lbt4;-><init>(Ljava/io/InputStream;Lto;)V

    move-object p0, v0

    :cond_1
    const/16 p1, 0x15

    invoke-virtual {p0, p1}, Ljava/io/InputStream;->mark(I)V

    :try_start_0
    new-instance p1, Lcom/bumptech/glide/integration/webp/a$d;

    invoke-static {p0}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    invoke-direct {p1, v0}, Lcom/bumptech/glide/integration/webp/a$d;-><init>(Ljava/io/InputStream;)V

    invoke-static {p1}, Lcom/bumptech/glide/integration/webp/a;->a(Lcom/bumptech/glide/integration/webp/a$c;)Lcom/bumptech/glide/integration/webp/a$e;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V

    throw p1
.end method

.method public static c(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/integration/webp/a$e;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, Lcom/bumptech/glide/integration/webp/a$e;->j:Lcom/bumptech/glide/integration/webp/a$e;

    return-object p0

    :cond_0
    new-instance v0, Lcom/bumptech/glide/integration/webp/a$b;

    invoke-static {p0}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/nio/ByteBuffer;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/integration/webp/a$b;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-static {v0}, Lcom/bumptech/glide/integration/webp/a;->a(Lcom/bumptech/glide/integration/webp/a$c;)Lcom/bumptech/glide/integration/webp/a$e;

    move-result-object p0

    return-object p0
.end method

.method public static d([BII)Lcom/bumptech/glide/integration/webp/a$e;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lcom/bumptech/glide/integration/webp/a$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/bumptech/glide/integration/webp/a$a;-><init>([BII)V

    invoke-static {v0}, Lcom/bumptech/glide/integration/webp/a;->a(Lcom/bumptech/glide/integration/webp/a$c;)Lcom/bumptech/glide/integration/webp/a$e;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lcom/bumptech/glide/integration/webp/a$e;)Z
    .locals 1

    sget-object v0, Lcom/bumptech/glide/integration/webp/a$e;->i:Lcom/bumptech/glide/integration/webp/a$e;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static g(Lcom/bumptech/glide/integration/webp/a$e;)Z
    .locals 1

    sget-object v0, Lcom/bumptech/glide/integration/webp/a$e;->d:Lcom/bumptech/glide/integration/webp/a$e;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/bumptech/glide/integration/webp/a$e;->e:Lcom/bumptech/glide/integration/webp/a$e;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/bumptech/glide/integration/webp/a$e;->f:Lcom/bumptech/glide/integration/webp/a$e;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/bumptech/glide/integration/webp/a$e;->g:Lcom/bumptech/glide/integration/webp/a$e;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/bumptech/glide/integration/webp/a$e;->h:Lcom/bumptech/glide/integration/webp/a$e;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
