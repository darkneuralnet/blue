.class public LF70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LbM4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LbM4<",
        "Ljava/nio/ByteBuffer;",
        "LGA6;",
        ">;"
    }
.end annotation


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
.field public final a:Landroid/content/Context;

.field public final b:LeU;

.field public final c:LsC1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "com.bumptech.glide.integration.webp.decoder.ByteBufferWebpDecoder.DisableAnimation"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Liy3;->f(Ljava/lang/String;Ljava/lang/Object;)Liy3;

    move-result-object v0

    sput-object v0, LF70;->d:Liy3;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lto;LeU;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LF70;->a:Landroid/content/Context;

    iput-object p3, p0, LF70;->b:LeU;

    new-instance p1, LsC1;

    invoke-direct {p1, p3, p2}, LsC1;-><init>(LeU;Lto;)V

    iput-object p1, p0, LF70;->c:LsC1;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lsy3;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1, p2}, LF70;->d(Ljava/nio/ByteBuffer;Lsy3;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILsy3;)LVL4;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1, p2, p3, p4}, LF70;->c(Ljava/nio/ByteBuffer;IILsy3;)LVL4;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/nio/ByteBuffer;IILsy3;)LVL4;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            "II",
            "Lsy3;",
            ")",
            "LVL4<",
            "LGA6;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object v0, p0

    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    new-array v2, v1, [B

    const/4 v3, 0x0

    move-object/from16 v7, p1

    invoke-virtual {v7, v2, v3, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-static {v2}, Lcom/bumptech/glide/integration/webp/WebpImage;->create([B)Lcom/bumptech/glide/integration/webp/WebpImage;

    move-result-object v6

    invoke-virtual {v6}, Lcom/bumptech/glide/integration/webp/WebpImage;->getWidth()I

    move-result v1

    invoke-virtual {v6}, Lcom/bumptech/glide/integration/webp/WebpImage;->getHeight()I

    move-result v2

    move/from16 v3, p2

    move/from16 v13, p3

    invoke-static {v1, v2, v3, v13}, LLi6;->a(IIII)I

    move-result v8

    sget-object v1, LLA6;->s:Liy3;

    move-object/from16 v2, p4

    invoke-virtual {v2, v1}, Lsy3;->c(Liy3;)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, LJA6;

    new-instance v1, LEA6;

    iget-object v5, v0, LF70;->c:LsC1;

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, LEA6;-><init>(LtC1$a;Lcom/bumptech/glide/integration/webp/WebpImage;Ljava/nio/ByteBuffer;ILJA6;)V

    invoke-virtual {v1}, LEA6;->f()V

    invoke-virtual {v1}, LEA6;->e()Landroid/graphics/Bitmap;

    move-result-object v14

    if-nez v14, :cond_0

    const/4 v1, 0x0

    return-object v1

    :cond_0
    invoke-static {}, Lhe6;->c()Lhe6;

    move-result-object v11

    new-instance v2, LIA6;

    new-instance v4, LGA6;

    iget-object v8, v0, LF70;->a:Landroid/content/Context;

    iget-object v10, v0, LF70;->b:LeU;

    move-object v7, v4

    move-object v9, v1

    move/from16 v12, p2

    move/from16 v13, p3

    invoke-direct/range {v7 .. v14}, LGA6;-><init>(Landroid/content/Context;LEA6;LeU;Lr96;IILandroid/graphics/Bitmap;)V

    invoke-direct {v2, v4}, LIA6;-><init>(LGA6;)V

    return-object v2
.end method

.method public d(Ljava/nio/ByteBuffer;Lsy3;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LF70;->d:Liy3;

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
