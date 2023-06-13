.class public final Lco/bird/gson/android/typeadapters/PointTypeAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvi2;
.implements Llj2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lvi2<",
        "Lco/bird/android/model/Point;",
        ">;",
        "Llj2<",
        "Lco/bird/android/model/Point;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016J&\u0010\u000e\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\rH\u0016\u00a8\u0006\u0011"
    }
    d2 = {
        "Lco/bird/gson/android/typeadapters/PointTypeAdapter;",
        "Lvi2;",
        "Lco/bird/android/model/Point;",
        "Llj2;",
        "Lyi2;",
        "json",
        "Ljava/lang/reflect/Type;",
        "type",
        "Lui2;",
        "context",
        "a",
        "src",
        "typeOfSrc",
        "Lkj2;",
        "b",
        "<init>",
        "()V",
        "gson_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lyi2;Ljava/lang/reflect/Type;Lui2;)Lco/bird/android/model/Point;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonParseException;
        }
    .end annotation

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "context"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lyi2;->u()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object p2

    const-string p3, "latitude"

    invoke-virtual {p2, p3}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p2

    invoke-virtual {p2}, Lyi2;->b()D

    move-result-wide p2

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object p1

    const-string v0, "longitude"

    invoke-virtual {p1, v0}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p1

    invoke-virtual {p1}, Lyi2;->b()D

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lyi2;->c()Lfi2;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lfi2;->y(I)Lyi2;

    move-result-object p2

    invoke-virtual {p2}, Lyi2;->b()D

    move-result-wide v0

    invoke-virtual {p1}, Lyi2;->c()Lfi2;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lfi2;->y(I)Lyi2;

    move-result-object p1

    invoke-virtual {p1}, Lyi2;->b()D

    move-result-wide p2

    :goto_0
    new-instance p1, Lco/bird/android/model/Point;

    invoke-direct {p1, v0, v1, p2, p3}, Lco/bird/android/model/Point;-><init>(DD)V

    return-object p1
.end method

.method public b(Lco/bird/android/model/Point;Ljava/lang/reflect/Type;Lkj2;)Lyi2;
    .locals 2

    new-instance p2, Lfi2;

    invoke-direct {p2}, Lfi2;-><init>()V

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    iget-wide v0, p1, Lco/bird/android/model/Point;->x:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p3

    :goto_0
    invoke-virtual {p2, v0}, Lfi2;->x(Ljava/lang/Number;)V

    if-eqz p1, :cond_1

    iget-wide v0, p1, Lco/bird/android/model/Point;->y:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    :cond_1
    invoke-virtual {p2, p3}, Lfi2;->x(Ljava/lang/Number;)V

    return-object p2
.end method

.method public bridge synthetic deserialize(Lyi2;Ljava/lang/reflect/Type;Lui2;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/gson/android/typeadapters/PointTypeAdapter;->a(Lyi2;Ljava/lang/reflect/Type;Lui2;)Lco/bird/android/model/Point;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic serialize(Ljava/lang/Object;Ljava/lang/reflect/Type;Lkj2;)Lyi2;
    .locals 0

    check-cast p1, Lco/bird/android/model/Point;

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/gson/android/typeadapters/PointTypeAdapter;->b(Lco/bird/android/model/Point;Ljava/lang/reflect/Type;Lkj2;)Lyi2;

    move-result-object p1

    return-object p1
.end method
