.class public final LXA6$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXA6;->onActivityResult(IILandroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/WhitelistResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/WhitelistResponse;",
        "kotlin.jvm.PlatformType",
        "whitelistResponse",
        "",
        "a",
        "(Lco/bird/api/response/WhitelistResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LXA6;


# direct methods
.method public constructor <init>(LXA6;)V
    .locals 0

    iput-object p1, p0, LXA6$e;->g:LXA6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/WhitelistResponse;)V
    .locals 2

    invoke-virtual {p1}, Lco/bird/api/response/WhitelistResponse;->getSuccess()Ljava/lang/Boolean;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LXA6$e;->g:LXA6;

    invoke-static {p1}, LXA6;->access$getNavigator$p(LXA6;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->e3()V

    iget-object p1, p0, LXA6$e;->g:LXA6;

    invoke-static {p1}, LXA6;->access$getUi$p(LXA6;)LZA6;

    move-result-object p1

    sget v0, Lnl4;->whitelist_successful_toast:I

    sget-object v1, Lf56;->e:Lf56;

    invoke-interface {p1, v0, v1}, Lh56;->topToast(ILf56;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LXA6$e;->g:LXA6;

    invoke-static {p1}, LXA6;->access$getUi$p(LXA6;)LZA6;

    move-result-object p1

    sget v0, Lnl4;->whitelist_error_snack:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/WhitelistResponse;

    invoke-virtual {p0, p1}, LXA6$e;->a(Lco/bird/api/response/WhitelistResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
