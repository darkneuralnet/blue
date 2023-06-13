.class public final Lcom/stripe/android/paymentsheet/utils/UiUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aD\u0010\n\u001a\u00020\t\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0004\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\u0008\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u000b"
    }
    d2 = {
        "T",
        "LEu1;",
        "LLifecycleOwner;",
        "owner",
        "Landroidx/lifecycle/f$b;",
        "minActiveState",
        "Lkotlin/Function1;",
        "",
        "action",
        "Lzh2;",
        "launchAndCollectIn",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final launchAndCollectIn(LEu1;LLifecycleOwner;Landroidx/lifecycle/f$b;Lkotlin/jvm/functions/Function1;)Lzh2;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LEu1<",
            "+TT;>;",
            "LLifecycleOwner;",
            "Landroidx/lifecycle/f$b;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "minActiveState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcom/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1;

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p0

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1;-><init>(LLifecycleOwner;Landroidx/lifecycle/f$b;LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic launchAndCollectIn$default(LEu1;LLifecycleOwner;Landroidx/lifecycle/f$b;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lzh2;
    .locals 9

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p2, Landroidx/lifecycle/f$b;->e:Landroidx/lifecycle/f$b;

    :cond_0
    move-object v2, p2

    const-string p2, "<this>"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "owner"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "minActiveState"

    invoke-static {v2, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "action"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object p2

    const/4 p4, 0x0

    const/4 p5, 0x0

    new-instance v6, Lcom/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v3, p0

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1;-><init>(LLifecycleOwner;Landroidx/lifecycle/f$b;LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    move-object v3, p2

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v3 .. v8}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object p0

    return-object p0
.end method
