.class public final LoS0$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoS0;-><init>(LFk1;Landroid/os/Handler;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LtS0;Le13;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)V"
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
.field public final synthetic g:LoS0;


# direct methods
.method public constructor <init>(LoS0;)V
    .locals 0

    iput-object p1, p0, LoS0$c;->g:LoS0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LoS0;)V
    .locals 0

    invoke-static {p0}, LoS0$c;->b(LoS0;)V

    return-void
.end method

.method public static final b(LoS0;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LoS0;->access$getNavigator$p(LoS0;)Le13;

    move-result-object p0

    invoke-interface {p0}, Le13;->e3()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LoS0$c;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 4

    iget-object v0, p0, LoS0$c;->g:LoS0;

    invoke-static {v0}, LoS0;->access$getUi$p(LoS0;)LtS0;

    move-result-object v0

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lnl4;->damage_feedback_feedback_thank_you:I

    goto :goto_0

    :cond_0
    sget p1, Lnl4;->feedback_thank_you:I

    :goto_0
    invoke-interface {v0, p1}, LaM5;->success(I)V

    iget-object p1, p0, LoS0$c;->g:LoS0;

    invoke-static {p1}, LoS0;->access$getHandler$p(LoS0;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, LoS0$c;->g:LoS0;

    new-instance v1, LpS0;

    invoke-direct {v1, v0}, LpS0;-><init>(LoS0;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
