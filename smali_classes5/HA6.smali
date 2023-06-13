.class public LHA6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LeM4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LeM4<",
        "LGA6;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lsy3;)Lfb1;
    .locals 0

    sget-object p1, Lfb1;->b:Lfb1;

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/io/File;Lsy3;)Z
    .locals 0

    check-cast p1, LVL4;

    invoke-virtual {p0, p1, p2, p3}, LHA6;->c(LVL4;Ljava/io/File;Lsy3;)Z

    move-result p1

    return p1
.end method

.method public c(LVL4;Ljava/io/File;Lsy3;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "LGA6;",
            ">;",
            "Ljava/io/File;",
            "Lsy3;",
            ")Z"
        }
    .end annotation

    invoke-interface {p1}, LVL4;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LGA6;

    :try_start_0
    invoke-virtual {p1}, LGA6;->c()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1, p2}, LE70;->f(Ljava/nio/ByteBuffer;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 p2, 0x5

    const-string p3, "WebpEncoder"

    invoke-static {p3, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "Failed to encode WebP drawable data"

    invoke-static {p3, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
