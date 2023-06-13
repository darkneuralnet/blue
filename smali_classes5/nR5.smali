.class public LnR5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LbM4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LnR5$a;
    }
.end annotation

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
.field public final a:Li61;

.field public final b:Lto;


# direct methods
.method public constructor <init>(Li61;Lto;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnR5;->a:Li61;

    iput-object p2, p0, LnR5;->b:Lto;

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

    invoke-virtual {p0, p1, p2}, LnR5;->d(Ljava/io/InputStream;Lsy3;)Z

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

    invoke-virtual {p0, p1, p2, p3, p4}, LnR5;->c(Ljava/io/InputStream;IILsy3;)LVL4;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/io/InputStream;IILsy3;)LVL4;
    .locals 9
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

    instance-of v0, p1, Lbt4;

    if-eqz v0, :cond_0

    check-cast p1, Lbt4;

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lbt4;

    iget-object v1, p0, LnR5;->b:Lto;

    invoke-direct {v0, p1, v1}, Lbt4;-><init>(Ljava/io/InputStream;Lto;)V

    const/4 p1, 0x1

    move-object v8, v0

    move v0, p1

    move-object p1, v8

    :goto_0
    invoke-static {p1}, LZg1;->b(Ljava/io/InputStream;)LZg1;

    move-result-object v1

    new-instance v3, LdM2;

    invoke-direct {v3, v1}, LdM2;-><init>(Ljava/io/InputStream;)V

    new-instance v7, LnR5$a;

    invoke-direct {v7, p1, v1}, LnR5$a;-><init>(Lbt4;LZg1;)V

    :try_start_0
    iget-object v2, p0, LnR5;->a:Li61;

    move v4, p2

    move v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Li61;->f(Ljava/io/InputStream;IILsy3;Li61$b;)LVL4;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, LZg1;->release()V

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lbt4;->release()V

    :cond_1
    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {v1}, LZg1;->release()V

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lbt4;->release()V

    :cond_2
    throw p2
.end method

.method public d(Ljava/io/InputStream;Lsy3;)Z
    .locals 0

    iget-object p2, p0, LnR5;->a:Li61;

    invoke-virtual {p2, p1}, Li61;->p(Ljava/io/InputStream;)Z

    move-result p1

    return p1
.end method
