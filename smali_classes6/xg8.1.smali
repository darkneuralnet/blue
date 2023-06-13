.class public final Lxg8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz78;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz78<",
        "Ljava/io/OutputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public a:[LDb8;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lxg8;
    .locals 1

    new-instance v0, Lxg8;

    invoke-direct {v0}, Lxg8;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic a(Lk78;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Lk78;->b()LMg8;

    move-result-object v0

    invoke-virtual {p1}, Lk78;->a()Landroid/net/Uri;

    move-result-object v1

    invoke-interface {v0, v1}, LMg8;->a(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {p1, v0}, Lk78;->d(Ljava/io/OutputStream;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lxg8;->a:[LDb8;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, LDb8;->a(Ljava/util/List;)V

    :cond_0
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/OutputStream;

    return-object p1
.end method

.method public final varargs c([LDb8;)Lxg8;
    .locals 0

    iput-object p1, p0, Lxg8;->a:[LDb8;

    return-object p0
.end method
