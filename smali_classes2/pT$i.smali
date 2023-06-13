.class public final LpT$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LpT;->onEvent(LeT;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LpT;


# direct methods
.method public constructor <init>(LpT;)V
    .locals 0

    iput-object p1, p0, LpT$i;->g:LpT;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LpT$i;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 7

    instance-of v0, p1, Lco/bird/api/error/RetrofitException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/bird/api/error/RetrofitException;

    invoke-virtual {v0}, Lco/bird/api/error/RetrofitException;->b()Lco/bird/api/error/RetrofitException$a;

    move-result-object v0

    sget-object v1, Lco/bird/api/error/RetrofitException$a;->c:Lco/bird/api/error/RetrofitException$a;

    if-ne v0, v1, :cond_0

    :try_start_0
    check-cast p1, Lco/bird/api/error/RetrofitException;

    const-class v0, Ltg1;

    invoke-virtual {p1, v0}, Lco/bird/api/error/RetrofitException;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltg1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p1, Ltg1;

    const/16 v1, 0x1f4

    iget-object v0, p0, LpT$i;->g:LpT;

    invoke-static {v0}, LpT;->access$getResources$p(LpT;)Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lnl4;->error_500:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v0, "resources.getString(L.string.error_500)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Ltg1;-><init>(ILjava/lang/String;Ljava/lang/String;Lkg1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    iget-object v0, p0, LpT$i;->g:LpT;

    invoke-static {v0}, LpT;->access$getUi$p(LpT;)LtT;

    move-result-object v0

    invoke-virtual {p1}, Ltg1;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LaM5;->error(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, LpT$i;->g:LpT;

    invoke-static {v0}, LpT;->access$getUi$p(LpT;)LtT;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LaM5;->error(Ljava/lang/String;)V

    :goto_1
    return-void
.end method
