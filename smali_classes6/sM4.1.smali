.class public LsM4;
.super LPI4;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, LPI4;-><init>()V

    iput-object p1, p0, LsM4;->a:Landroid/content/Context;

    return-void
.end method

.method public static j(Landroid/content/res/Resources;ILqI4;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-static {p2}, LPI4;->d(LqI4;)Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    invoke-static {v0}, LPI4;->g(Landroid/graphics/BitmapFactory$Options;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget v1, p2, LqI4;->h:I

    iget v2, p2, LqI4;->i:I

    invoke-static {v1, v2, v0, p2}, LPI4;->b(IILandroid/graphics/BitmapFactory$Options;LqI4;)V

    :cond_0
    invoke-static {p0, p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c(LqI4;)Z
    .locals 1

    iget v0, p1, LqI4;->e:I

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object p1, p1, LqI4;->d:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.resource"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(LqI4;I)LPI4$a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object p2, p0, LsM4;->a:Landroid/content/Context;

    invoke-static {p2, p1}, LFi6;->m(Landroid/content/Context;LqI4;)Landroid/content/res/Resources;

    move-result-object p2

    invoke-static {p2, p1}, LFi6;->l(Landroid/content/res/Resources;LqI4;)I

    move-result v0

    new-instance v1, LPI4$a;

    invoke-static {p2, v0, p1}, LsM4;->j(Landroid/content/res/Resources;ILqI4;)Landroid/graphics/Bitmap;

    move-result-object p1

    sget-object p2, LiT3$e;->d:LiT3$e;

    invoke-direct {v1, p1, p2}, LPI4$a;-><init>(Landroid/graphics/Bitmap;LiT3$e;)V

    return-object v1
.end method
