.class public Lz70;
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
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LFA6;


# direct methods
.method public constructor <init>(LFA6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz70;->a:LFA6;

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

    invoke-virtual {p0, p1, p2}, Lz70;->d(Ljava/nio/ByteBuffer;Lsy3;)Z

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lz70;->c(Ljava/nio/ByteBuffer;IILsy3;)LVL4;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/nio/ByteBuffer;IILsy3;)LVL4;
    .locals 1
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

    invoke-static {p1}, LE70;->g(Ljava/nio/ByteBuffer;)Ljava/io/InputStream;

    move-result-object p1

    iget-object v0, p0, Lz70;->a:LFA6;

    invoke-virtual {v0, p1, p2, p3, p4}, LFA6;->d(Ljava/io/InputStream;IILsy3;)LVL4;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/nio/ByteBuffer;Lsy3;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lz70;->a:LFA6;

    invoke-virtual {v0, p1, p2}, LFA6;->m(Ljava/nio/ByteBuffer;Lsy3;)Z

    move-result p1

    return p1
.end method
