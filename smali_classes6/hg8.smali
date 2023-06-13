.class public final Lhg8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz78;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz78<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lhg8;
    .locals 1

    new-instance v0, Lhg8;

    invoke-direct {v0}, Lhg8;-><init>()V

    return-object v0
.end method

.method public static final c(Lk78;)Ljava/io/InputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lk78;->b()LMg8;

    move-result-object v0

    invoke-virtual {p0}, Lk78;->a()Landroid/net/Uri;

    move-result-object v1

    invoke-interface {v0, v1}, LMg8;->d(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {p0, v0}, Lk78;->c(Ljava/io/InputStream;)Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/io/InputStream;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic a(Lk78;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Lhg8;->c(Lk78;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
