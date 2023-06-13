.class public LVe;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Liy3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Liy3<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lto;

.field public final b:LeU;

.field public final c:LsC1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "com.bumptech.glide.integration.webp.decoder.AnimatedWebpBitmapDecoder.DisableBitmap"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Liy3;->f(Ljava/lang/String;Ljava/lang/Object;)Liy3;

    move-result-object v0

    sput-object v0, LVe;->d:Liy3;

    return-void
.end method

.method public constructor <init>(Lto;LeU;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVe;->a:Lto;

    iput-object p2, p0, LVe;->b:LeU;

    new-instance v0, LsC1;

    invoke-direct {v0, p2, p1}, LsC1;-><init>(LeU;Lto;)V

    iput-object v0, p0, LVe;->c:LsC1;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;IILsy3;)LVL4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "II",
            "Lsy3;",
            ")",
            "LVL4<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, LLi6;->b(Ljava/io/InputStream;)[B

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, p4}, LVe;->b(Ljava/nio/ByteBuffer;IILsy3;)LVL4;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/nio/ByteBuffer;IILsy3;)LVL4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            "II",
            "Lsy3;",
            ")",
            "LVL4<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p4

    new-array v0, p4, [B

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lcom/bumptech/glide/integration/webp/WebpImage;->create([B)Lcom/bumptech/glide/integration/webp/WebpImage;

    move-result-object p4

    invoke-virtual {p4}, Lcom/bumptech/glide/integration/webp/WebpImage;->getWidth()I

    move-result v0

    invoke-virtual {p4}, Lcom/bumptech/glide/integration/webp/WebpImage;->getHeight()I

    move-result v1

    invoke-static {v0, v1, p2, p3}, LLi6;->a(IIII)I

    move-result p2

    new-instance p3, LEA6;

    iget-object v0, p0, LVe;->c:LsC1;

    invoke-direct {p3, v0, p4, p1, p2}, LEA6;-><init>(LtC1$a;Lcom/bumptech/glide/integration/webp/WebpImage;Ljava/nio/ByteBuffer;I)V

    :try_start_0
    invoke-virtual {p3}, LEA6;->f()V

    invoke-virtual {p3}, LEA6;->e()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object p2, p0, LVe;->b:LeU;

    invoke-static {p1, p2}, LgU;->f(Landroid/graphics/Bitmap;LeU;)LgU;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3}, LEA6;->clear()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p3}, LEA6;->clear()V

    throw p1
.end method

.method public c(Ljava/io/InputStream;Lsy3;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LVe;->d:Liy3;

    invoke-virtual {p2, v0}, Lsy3;->c(Liy3;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p2, p0, LVe;->a:Lto;

    invoke-static {p1, p2}, Lcom/bumptech/glide/integration/webp/a;->b(Ljava/io/InputStream;Lto;)Lcom/bumptech/glide/integration/webp/a$e;

    move-result-object p1

    invoke-static {p1}, Lcom/bumptech/glide/integration/webp/a;->e(Lcom/bumptech/glide/integration/webp/a$e;)Z

    move-result p1

    return p1
.end method

.method public d(Ljava/nio/ByteBuffer;Lsy3;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LVe;->d:Liy3;

    invoke-virtual {p2, v0}, Lsy3;->c(Liy3;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/integration/webp/a;->c(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/integration/webp/a$e;

    move-result-object p1

    invoke-static {p1}, Lcom/bumptech/glide/integration/webp/a;->e(Lcom/bumptech/glide/integration/webp/a$e;)Z

    move-result p1

    return p1
.end method
