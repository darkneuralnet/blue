.class public final Liy6$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liy6;-><init>(Llh6;LSy6;LTq4;Lcom/uber/autodispose/ScopeProvider;Le13;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/User;",
        "+",
        "Lco/bird/android/model/Warehouse;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u00062V\u0010\u0005\u001aR\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004 \u0002*(\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/model/User;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/Warehouse;",
        "",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lkotlin/Triple;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Liy6;


# direct methods
.method public constructor <init>(Liy6;)V
    .locals 0

    iput-object p1, p0, Liy6$f;->g:Liy6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/User;",
            "Lco/bird/android/model/Warehouse;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/User;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/Warehouse;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    iget-object v2, p0, Liy6$f;->g:Liy6;

    invoke-static {v2}, Liy6;->access$getListener$p(Liy6;)LRx6;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, LRx6;->b()V

    :cond_0
    iget-object v2, p0, Liy6$f;->g:Liy6;

    invoke-static {v2}, Liy6;->access$getUi$p(Liy6;)LVx6;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "user"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v0}, LSk3;->Df(Lco/bird/android/model/User;)V

    :cond_1
    iget-object v0, p0, Liy6$f;->g:Liy6;

    invoke-static {v0}, Liy6;->access$getUi$p(Liy6;)LVx6;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0, v1}, LSk3;->S9(Lco/bird/android/model/Warehouse;)V

    :cond_2
    iget-object v0, p0, Liy6$f;->g:Liy6;

    invoke-static {v0}, Liy6;->access$getUi$p(Liy6;)LVx6;

    move-result-object v0

    if-eqz v0, :cond_4

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0, v2}, LSk3;->Zd(Z)V

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lco/bird/android/model/Warehouse;->getActive()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_5
    iget-object v0, p0, Liy6$f;->g:Liy6;

    invoke-static {v0}, Liy6;->access$getListener$p(Liy6;)LRx6;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {v0}, LRx6;->a()V

    :cond_6
    iget-object v0, p0, Liy6$f;->g:Liy6;

    invoke-static {v0}, Liy6;->access$getUi$p(Liy6;)LVx6;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v1, "enableEnterLocationModal"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, p1}, LWW;->rf(Z)V

    :cond_7
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, Liy6$f;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
