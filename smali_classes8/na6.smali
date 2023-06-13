.class public final Lna6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a/\u0010\u0006\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u0018\u0010\u000c\u001a\u00020\t*\u00020\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "T",
        "Lbi2;",
        "value",
        "Let5;",
        "serializer",
        "Lxi2;",
        "c",
        "(Lbi2;Ljava/lang/Object;Let5;)Lxi2;",
        "LMs5;",
        "",
        "b",
        "(LMs5;)Z",
        "requiresTopLevelTag",
        "kotlinx-serialization-json"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final synthetic a(LMs5;)Z
    .locals 0

    invoke-static {p0}, Lna6;->b(LMs5;)Z

    move-result p0

    return p0
.end method

.method public static final b(LMs5;)Z
    .locals 1

    invoke-interface {p0}, LMs5;->getKind()LTs5;

    move-result-object v0

    instance-of v0, v0, LE24;

    if-nez v0, :cond_1

    invoke-interface {p0}, LMs5;->getKind()LTs5;

    move-result-object p0

    sget-object v0, LTs5$b;->a:LTs5$b;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final c(Lbi2;Ljava/lang/Object;Let5;)Lxi2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbi2;",
            "TT;",
            "Let5<",
            "-TT;>;)",
            "Lxi2;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v1, Lqj2;

    new-instance v2, Lna6$a;

    invoke-direct {v2, v0}, Lna6$a;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-direct {v1, p0, v2}, Lqj2;-><init>(Lbi2;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p2, p1}, LF0;->B(Let5;Ljava/lang/Object;)V

    iget-object p0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-nez p0, :cond_0

    const-string p0, "result"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    check-cast p0, Lxi2;

    :goto_0
    return-object p0
.end method
