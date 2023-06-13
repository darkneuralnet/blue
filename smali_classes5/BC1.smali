.class public final LBC1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LbM4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LbM4<",
        "LtC1;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LeU;


# direct methods
.method public constructor <init>(LeU;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBC1;->a:LeU;

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

    check-cast p1, LtC1;

    invoke-virtual {p0, p1, p2}, LBC1;->d(LtC1;Lsy3;)Z

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

    check-cast p1, LtC1;

    invoke-virtual {p0, p1, p2, p3, p4}, LBC1;->c(LtC1;IILsy3;)LVL4;

    move-result-object p1

    return-object p1
.end method

.method public c(LtC1;IILsy3;)LVL4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LtC1;",
            "II",
            "Lsy3;",
            ")",
            "LVL4<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, LtC1;->e()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object p2, p0, LBC1;->a:LeU;

    invoke-static {p1, p2}, LgU;->f(Landroid/graphics/Bitmap;LeU;)LgU;

    move-result-object p1

    return-object p1
.end method

.method public d(LtC1;Lsy3;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
