.class public final LVw5$L;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVw5;->c(Landroid/content/Intent;LsJ4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/User;",
        "+",
        "Lco/bird/android/model/Warehouse;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012:\u0010\u0002\u001a6\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006 \u0005*\u001a\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/User;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/Warehouse;",
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
.field public final synthetic g:LVw5;


# direct methods
.method public constructor <init>(LVw5;)V
    .locals 0

    iput-object p1, p0, LVw5$L;->g:LVw5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LVw5$L;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/User;",
            "Lco/bird/android/model/Warehouse;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/User;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/Warehouse;

    iget-object v1, p0, LVw5$L;->g:LVw5;

    invoke-static {v1}, LVw5;->access$getUi$p(LVw5;)Lex5;

    move-result-object v1

    const-string v2, "user"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v0}, Lex5;->Ic(Lco/bird/android/model/User;)V

    iget-object v1, p0, LVw5$L;->g:LVw5;

    invoke-static {v1}, LVw5;->access$getReactiveConfig$p(LVw5;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getServiceCenterConfig()Lco/bird/android/model/wire/configs/ServiceCenterConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/ServiceCenterConfig;->getEnableServiceCenterPicker()Z

    move-result v1

    iget-object v2, p0, LVw5$L;->g:LVw5;

    invoke-static {v2}, LVw5;->access$getUi$p(LVw5;)Lex5;

    move-result-object v2

    invoke-interface {v2, v1}, Lex5;->bk(Z)V

    invoke-static {v0}, Lco/bird/android/model/UserKt;->isOperator(Lco/bird/android/model/User;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    if-eqz p1, :cond_1

    :cond_0
    iget-object v0, p0, LVw5$L;->g:LVw5;

    invoke-static {v0}, LVw5;->access$getUi$p(LVw5;)Lex5;

    move-result-object v0

    invoke-interface {v0}, Lex5;->qk()V

    iget-object v0, p0, LVw5$L;->g:LVw5;

    invoke-static {v0}, LVw5;->access$getUi$p(LVw5;)Lex5;

    move-result-object v0

    invoke-interface {v0, p1}, Lex5;->Ld(Lco/bird/android/model/Warehouse;)V

    :cond_1
    iget-object p1, p0, LVw5$L;->g:LVw5;

    invoke-static {p1}, LVw5;->access$getUi$p(LVw5;)Lex5;

    move-result-object p1

    invoke-interface {p1}, Lex5;->xc()V

    return-void
.end method
