.class public LGA0;
.super LPI4;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, LPI4;-><init>()V

    iput-object p1, p0, LGA0;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public c(LqI4;)Z
    .locals 1

    iget-object p1, p1, LqI4;->d:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v0, "content"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(LqI4;I)LPI4$a;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, LGA0;->j(LqI4;)Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1}, LOe3;->l(Ljava/io/InputStream;)LAN5;

    move-result-object p1

    new-instance p2, LPI4$a;

    sget-object v0, LiT3$e;->d:LiT3$e;

    invoke-direct {p2, p1, v0}, LPI4$a;-><init>(LAN5;LiT3$e;)V

    return-object p2
.end method

.method public j(LqI4;)Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    iget-object v0, p0, LGA0;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object p1, p1, LqI4;->d:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
