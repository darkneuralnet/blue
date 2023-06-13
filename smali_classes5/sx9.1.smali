.class public final Lsx9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Ljv9;",
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

    check-cast p1, Ljv9;

    check-cast p2, Ljv9;

    invoke-virtual {p1}, Ljv9;->iterator()Ljava/util/Iterator;

    move-result-object v0

    check-cast v0, LAg7;

    invoke-virtual {p2}, Ljv9;->iterator()Ljava/util/Iterator;

    move-result-object v1

    check-cast v1, LAg7;

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, LAg7;->nextByte()B

    move-result v2

    invoke-static {v2}, Ljv9;->v(B)I

    move-result v2

    invoke-interface {v1}, LAg7;->nextByte()B

    move-result v3

    invoke-static {v3}, Ljv9;->v(B)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Integer;->compare(II)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_1
    invoke-virtual {p1}, Ljv9;->size()I

    move-result p1

    invoke-virtual {p2}, Ljv9;->size()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
