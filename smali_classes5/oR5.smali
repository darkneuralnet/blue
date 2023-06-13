.class public LoR5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LbM4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LbM4<",
        "Ljava/io/InputStream;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LFA6;

.field public final b:Lto;


# direct methods
.method public constructor <init>(LFA6;Lto;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoR5;->a:LFA6;

    iput-object p2, p0, LoR5;->b:Lto;

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

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, LoR5;->d(Ljava/io/InputStream;Lsy3;)Z

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

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3, p4}, LoR5;->c(Ljava/io/InputStream;IILsy3;)LVL4;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/io/InputStream;IILsy3;)LVL4;
    .locals 1
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

    iget-object v0, p0, LoR5;->a:LFA6;

    invoke-virtual {v0, p1, p2, p3, p4}, LFA6;->d(Ljava/io/InputStream;IILsy3;)LVL4;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/io/InputStream;Lsy3;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LoR5;->a:LFA6;

    invoke-virtual {v0, p1, p2}, LFA6;->l(Ljava/io/InputStream;Lsy3;)Z

    move-result p1

    return p1
.end method
