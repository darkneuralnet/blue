.class public final LWy8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lzy8;",
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
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lzy8;

    check-cast p2, Lzy8;

    invoke-virtual {p1}, Lzy8;->iterator()Ljava/util/Iterator;

    move-result-object v0

    check-cast v0, LGz8;

    invoke-virtual {p2}, Lzy8;->iterator()Ljava/util/Iterator;

    move-result-object v1

    check-cast v1, LGz8;

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, LGz8;->zza()B

    move-result v2

    invoke-static {v2}, Lzy8;->c(B)I

    move-result v2

    invoke-interface {v1}, LGz8;->zza()B

    move-result v3

    invoke-static {v3}, Lzy8;->c(B)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Integer;->compare(II)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_1
    invoke-virtual {p1}, Lzy8;->b()I

    move-result p1

    invoke-virtual {p2}, Lzy8;->b()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
