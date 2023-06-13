.class public final LG83;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000/\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0005*\u0001\u000e\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a$\u0010\t\u001a\u00020\u0005\"\u0008\u0008\u0000\u0010\u0006*\u00020\u0005*\u0008\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0008\u001a\u00020\u0005H\u0002\u001a \u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u000b*\u00020\n2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u000bH\u0002\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "LgV2$b;",
        "prev",
        "next",
        "",
        "d",
        "LgV2$c;",
        "T",
        "LrV2;",
        "node",
        "f",
        "LgV2;",
        "LLX2;",
        "result",
        "e",
        "G83$a",
        "a",
        "LG83$a;",
        "SentinelHead",
        "ui_release"
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
        "SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,751:1\n1162#2:752\n1#3:753\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n*L\n735#1:752\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LG83$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LG83$a;

    invoke-direct {v0}, LG83$a;-><init>()V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, LgV2$c;->V(I)V

    sput-object v0, LG83;->a:LG83$a;

    return-void
.end method

.method public static final synthetic a(LgV2;LLX2;)LLX2;
    .locals 0

    invoke-static {p0, p1}, LG83;->e(LgV2;LLX2;)LLX2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()LG83$a;
    .locals 1

    sget-object v0, LG83;->a:LG83$a;

    return-object v0
.end method

.method public static final synthetic c(LrV2;LgV2$c;)LgV2$c;
    .locals 0

    invoke-static {p0, p1}, LG83;->f(LrV2;LgV2$c;)LgV2$c;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LgV2$b;LgV2$b;)I
    .locals 1

    const-string v0, "prev"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "next"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x2

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LC6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final e(LgV2;LLX2;)LLX2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "LLX2<",
            "LgV2$b;",
            ">;)",
            "LLX2<",
            "LgV2$b;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, LLX2;->u()I

    move-result v0

    new-instance v1, LLX2;

    new-array v0, v0, [LgV2;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, LLX2;-><init>([Ljava/lang/Object;I)V

    invoke-virtual {v1, p0}, LLX2;->b(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v1}, LLX2;->x()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {v1}, LLX2;->u()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {v1, p0}, LLX2;->C(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LgV2;

    instance-of v0, p0, LWm0;

    if-eqz v0, :cond_0

    check-cast p0, LWm0;

    invoke-virtual {p0}, LWm0;->a()LgV2;

    move-result-object v0

    invoke-virtual {v1, v0}, LLX2;->b(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LWm0;->b()LgV2;

    move-result-object p0

    invoke-virtual {v1, p0}, LLX2;->b(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v0, p0, LgV2$b;

    if-eqz v0, :cond_1

    invoke-virtual {p1, p0}, LLX2;->b(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, LG83$b;

    invoke-direct {v0, p1}, LG83$b;-><init>(LLX2;)V

    invoke-interface {p0, v0}, LgV2;->o(Lkotlin/jvm/functions/Function1;)Z

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public static final f(LrV2;LgV2$c;)LgV2$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LgV2$c;",
            ">(",
            "LrV2<",
            "TT;>;",
            "LgV2$c;",
            ")",
            "LgV2$c;"
        }
    .end annotation

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LrV2;->g(LgV2$c;)LgV2$c;

    move-result-object p0

    return-object p0
.end method
