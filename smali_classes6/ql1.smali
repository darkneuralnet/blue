.class public Lql1;
.super LGA0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, LGA0;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static k(Landroid/net/Uri;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, LXh1;

    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, LXh1;-><init>(Ljava/lang/String;)V

    const-string p0, "Orientation"

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, LXh1;->i(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public c(LqI4;)Z
    .locals 1

    iget-object p1, p1, LqI4;->d:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v0, "file"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(LqI4;I)LPI4$a;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, LGA0;->j(LqI4;)Ljava/io/InputStream;

    move-result-object p2

    invoke-static {p2}, LOe3;->l(Ljava/io/InputStream;)LAN5;

    move-result-object p2

    new-instance v0, LPI4$a;

    sget-object v1, LiT3$e;->d:LiT3$e;

    iget-object p1, p1, LqI4;->d:Landroid/net/Uri;

    invoke-static {p1}, Lql1;->k(Landroid/net/Uri;)I

    move-result p1

    const/4 v2, 0x0

    invoke-direct {v0, v2, p2, v1, p1}, LPI4$a;-><init>(Landroid/graphics/Bitmap;LAN5;LiT3$e;I)V

    return-object v0
.end method
