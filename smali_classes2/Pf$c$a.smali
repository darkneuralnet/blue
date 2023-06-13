.class public final LPf$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPf$c;->d(Lkotlin/Unit;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LcW0;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LcW0;",
        "result",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "c",
        "(LcW0;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LPf;

.field public final synthetic h:Landroid/content/Intent;


# direct methods
.method public constructor <init>(LPf;Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, LPf$c$a;->g:LPf;

    iput-object p2, p0, LPf$c$a;->h:Landroid/content/Intent;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LPf$c$a;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(LPf;)V
    .locals 0

    invoke-static {p0}, LPf$c$a;->d(LPf;)V

    return-void
.end method

.method public static final d(LPf;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LPf;->access$getCloseRelay$p(LPf;)Lma4;

    move-result-object p0

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, v0}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(LcW0;)Lio/reactivex/h;
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LPf$c$a;->g:LPf;

    invoke-static {v0}, LPf;->access$getDeeplinkResolver$p(LPf;)LNV0;

    move-result-object v0

    iget-object v1, p0, LPf$c$a;->h:Landroid/content/Intent;

    invoke-static {p1, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    const-string v1, "just(result to intent)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, LNV0;->d(Lio/reactivex/p;Z)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LPf$c$a$a;

    iget-object v1, p0, LPf$c$a;->g:LPf;

    invoke-direct {v0, v1}, LPf$c$a$a;-><init>(LPf;)V

    new-instance v1, LTf;

    invoke-direct {v1, v0}, LTf;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LPf$c$a;->g:LPf;

    new-instance v1, LUf;

    invoke-direct {v1, v0}, LUf;-><init>(LPf;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LcW0;

    invoke-virtual {p0, p1}, LPf$c$a;->c(LcW0;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
