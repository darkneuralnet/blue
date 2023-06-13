.class public final Lz96;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aQ\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u0008\u0012\u0004\u0012\u00028\u00010\u0005\u00a8\u0006\n"
    }
    d2 = {
        "T1",
        "R",
        "LtP5;",
        "LZC0;",
        "scope",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "a",
        "transform",
        "coroutine_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTransformedStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedStateFlow.kt\nco/bird/android/lib/coroutine/TransformedStateFlowKt\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,49:1\n190#2:50\n*S KotlinDebug\n*F\n+ 1 TransformedStateFlow.kt\nco/bird/android/lib/coroutine/TransformedStateFlowKt\n*L\n45#1:50\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LtP5;LZC0;Lkotlin/jvm/functions/Function1;)LtP5;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LtP5<",
            "+TT1;>;",
            "LZC0;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT1;+TR;>;)",
            "LtP5<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly96;

    invoke-interface {p0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Lz96$a;

    const/4 v3, 0x0

    invoke-direct {v2, p2, v3}, Lz96$a;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v2}, LVu1;->J(LEu1;Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object p0

    invoke-direct {v0, v1, p0, p1}, Ly96;-><init>(Ljava/lang/Object;LEu1;LZC0;)V

    return-object v0
.end method

.method public static synthetic mapState$default(LtP5;LZC0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LtP5;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lz96;->a(LtP5;LZC0;Lkotlin/jvm/functions/Function1;)LtP5;

    move-result-object p0

    return-object p0
.end method
