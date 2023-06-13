.class public final Lie1$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lie1;-><init>(LfL;Lpx5;LpM3;LAM3;LVM3;LTq4;Lw10;LRh6;LEa;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lpe1;Le13;LDQ3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/adyen/checkout/card/CardConfiguration;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lcom/adyen/checkout/card/CardConfiguration;",
        "b",
        "()Lcom/adyen/checkout/card/CardConfiguration;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lie1;


# direct methods
.method public constructor <init>(Lie1;)V
    .locals 0

    iput-object p1, p0, Lie1$h;->g:Lie1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lcom/adyen/checkout/card/CardConfiguration;
    .locals 3

    iget-object v0, p0, Lie1$h;->g:Lie1;

    invoke-static {v0}, Lie1;->access$getPaymentManagerV3$p(Lie1;)LVM3;

    move-result-object v1

    iget-object v2, p0, Lie1$h;->g:Lie1;

    invoke-static {v2}, Lie1;->access$getActivity$p(Lie1;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v2

    invoke-interface {v1, v2}, LVM3;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lie1$h;->g:Lie1;

    invoke-static {v2}, Lie1;->access$getPaymentManagerV3$p(Lie1;)LVM3;

    move-result-object v2

    invoke-interface {v2}, LVM3;->f()Lcom/adyen/checkout/core/api/Environment;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lie1;->access$initAdyenCardConfiguration(Lie1;Ljava/lang/String;Lcom/adyen/checkout/core/api/Environment;)Lcom/adyen/checkout/card/CardConfiguration;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lie1$h;->b()Lcom/adyen/checkout/card/CardConfiguration;

    move-result-object v0

    return-object v0
.end method
