.class public final Ll16;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a:\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nH\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "LgV2;",
        "LZ06;",
        "observer",
        "",
        "enabled",
        "a",
        "Landroidx/compose/ui/focus/h;",
        "focusRequester",
        "LrX2;",
        "interactionSource",
        "Lkotlin/Function1;",
        "LWv1;",
        "",
        "onFocusChanged",
        "c",
        "LgW2;",
        "b",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LgV2;LZ06;Z)LgV2;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    new-instance p2, Ll16$a;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Ll16$a;-><init>(LZ06;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, p1, p2}, LzW5;->c(LgV2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LgV2;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final b(LgV2;LgW2;Z)LgV2;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    sget-object p0, LgV2;->b0:LgV2$a;

    new-instance p2, Ll16$b;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Ll16$b;-><init>(LgW2;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, p1, p2}, LzW5;->c(LgV2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LgV2;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final c(LgV2;ZLandroidx/compose/ui/focus/h;LrX2;Lkotlin/jvm/functions/Function1;)LgV2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Z",
            "Landroidx/compose/ui/focus/h;",
            "LrX2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LWv1;",
            "Lkotlin/Unit;",
            ">;)",
            "LgV2;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "focusRequester"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFocusChanged"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2}, Landroidx/compose/ui/focus/i;->a(LgV2;Landroidx/compose/ui/focus/h;)LgV2;

    move-result-object p0

    invoke-static {p0, p4}, Landroidx/compose/ui/focus/b;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object p0

    invoke-static {p0, p1, p3}, Law1;->b(LgV2;ZLrX2;)LgV2;

    move-result-object p0

    return-object p0
.end method
