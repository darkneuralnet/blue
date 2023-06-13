.class public final LQ06$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ06;->d(LgV2;)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LI61;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LI61;",
        "",
        "invoke",
        "(LI61;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$drawTextAndSelectionBehind$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,702:1\n214#2,8:703\n261#2,11:711\n245#2:722\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$drawTextAndSelectionBehind$1\n*L\n463#1:703,8\n463#1:711,11\n469#1:722\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LQ06;


# direct methods
.method public constructor <init>(LQ06;)V
    .locals 0

    iput-object p1, p0, LQ06$c;->g:LQ06;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LI61;

    invoke-virtual {p0, p1}, LQ06$c;->invoke(LI61;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LI61;)V
    .locals 6

    const-string v0, "$this$drawBehind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQ06$c;->g:LQ06;

    invoke-virtual {v0}, LQ06;->h()LF26;

    move-result-object v0

    invoke-virtual {v0}, LF26;->d()Li26;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v1, p0, LQ06$c;->g:LQ06;

    invoke-virtual {v1}, LQ06;->h()LF26;

    move-result-object v2

    invoke-virtual {v2}, LF26;->a()Lkotlin/Unit;

    invoke-static {v1}, LQ06;->a(LQ06;)LVr5;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v2}, LVr5;->g()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, LQ06;->h()LF26;

    move-result-object v4

    invoke-virtual {v4}, LF26;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LNr5;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-virtual {v1}, LQ06;->h()LF26;

    move-result-object v1

    invoke-virtual {v1}, LF26;->g()LFr5;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1}, LFr5;->a()I

    :cond_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, LNr5;->b()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v2}, LNr5;->c()LNr5$a;

    throw v3

    :cond_2
    invoke-virtual {v2}, LNr5;->a()LNr5$a;

    throw v3

    :cond_3
    invoke-interface {p1}, LI61;->d0()LC61;

    move-result-object p1

    invoke-interface {p1}, LC61;->a()Lme0;

    move-result-object p1

    sget-object v1, LT06;->l:LT06$a;

    invoke-virtual {v1, p1, v0}, LT06$a;->a(Lme0;Li26;)V

    :cond_4
    return-void
.end method
