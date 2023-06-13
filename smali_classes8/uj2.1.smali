.class public final Luj2;
.super Lqj2;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u0008\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0016"
    }
    d2 = {
        "Luj2;",
        "Lqj2;",
        "",
        "key",
        "Lxi2;",
        "element",
        "",
        "y0",
        "v0",
        "g",
        "Ljava/lang/String;",
        "tag",
        "",
        "h",
        "Z",
        "isKey",
        "Lbi2;",
        "json",
        "Lkotlin/Function1;",
        "nodeConsumer",
        "<init>",
        "(Lbi2;Lkotlin/jvm/functions/Function1;)V",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public g:Ljava/lang/String;

.field public h:Z


# direct methods
.method public constructor <init>(Lbi2;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbi2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lxi2;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nodeConsumer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lqj2;-><init>(Lbi2;Lkotlin/jvm/functions/Function1;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Luj2;->h:Z

    return-void
.end method


# virtual methods
.method public v0()Lxi2;
    .locals 2

    new-instance v0, LSi2;

    invoke-virtual {p0}, Lqj2;->z0()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, LSi2;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public y0(Ljava/lang/String;Lxi2;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "element"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Luj2;->h:Z

    if-eqz p1, :cond_3

    instance-of p1, p2, LYi2;

    if-eqz p1, :cond_0

    check-cast p2, LYi2;

    invoke-virtual {p2}, LYi2;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Luj2;->g:Ljava/lang/String;

    const/4 p1, 0x0

    iput-boolean p1, p0, Luj2;->h:Z

    goto :goto_0

    :cond_0
    instance-of p1, p2, LSi2;

    if-nez p1, :cond_2

    instance-of p1, p2, Lei2;

    if-eqz p1, :cond_1

    sget-object p1, Lgi2;->a:Lgi2;

    invoke-virtual {p1}, Lgi2;->getDescriptor()LMs5;

    move-result-object p1

    invoke-static {p1}, LFi2;->d(LMs5;)Lkotlinx/serialization/json/internal/JsonEncodingException;

    move-result-object p1

    throw p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    sget-object p1, LVi2;->a:LVi2;

    invoke-virtual {p1}, LVi2;->getDescriptor()LMs5;

    move-result-object p1

    invoke-static {p1}, LFi2;->d(LMs5;)Lkotlinx/serialization/json/internal/JsonEncodingException;

    move-result-object p1

    throw p1

    :cond_3
    invoke-virtual {p0}, Lqj2;->z0()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Luj2;->g:Ljava/lang/String;

    if-nez v0, :cond_4

    const-string v0, "tag"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_4
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Luj2;->h:Z

    :goto_0
    return-void
.end method
