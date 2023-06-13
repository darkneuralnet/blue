.class public final Ln13$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln13;->onBannerShown()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LFH3;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LFH3;",
        "kotlin.jvm.PlatformType",
        "status",
        "",
        "a",
        "(LFH3;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ln13;


# direct methods
.method public constructor <init>(Ln13;)V
    .locals 0

    iput-object p1, p0, Ln13$a;->g:Ln13;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LFH3;)V
    .locals 7

    instance-of v0, p1, LCd1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln13$a;->g:Ln13;

    invoke-static {v0}, Ln13;->access$getNearParkingNestBannerUi$p(Ln13;)Lr13;

    move-result-object v0

    check-cast p1, LCd1;

    invoke-virtual {p1}, LCd1;->l()Z

    move-result v1

    invoke-interface {v0, v1}, Lr13;->tb(Z)V

    invoke-virtual {p1}, LCd1;->h()Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Ln13$a;->g:Ln13;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    sget-object v1, Lxx1;->a:Lxx1;

    invoke-static {v0}, Ln13;->access$getContext$p(Ln13;)Landroid/content/Context;

    move-result-object v2

    float-to-double v3, p1

    invoke-virtual {v1, v2, v3, v4}, Lxx1;->i(Landroid/content/Context;D)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0}, Ln13;->access$getNearParkingNestBannerUi$p(Ln13;)Lr13;

    move-result-object v1

    invoke-static {v0}, Ln13;->access$getContext$p(Ln13;)Landroid/content/Context;

    move-result-object v2

    sget v3, Lnl4;->parking_nest_almost_title_v2:I

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    invoke-virtual {v2, v3, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "context.getString(\n     \u2026   distance\n            )"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lr13;->t(Ljava/lang/String;)V

    invoke-static {v0}, Ln13;->access$getNearParkingNestBannerUi$p(Ln13;)Lr13;

    move-result-object v1

    invoke-static {v0}, Ln13;->access$getContext$p(Ln13;)Landroid/content/Context;

    move-result-object v0

    sget v2, Lnl4;->parking_nest_almost_subtitle:I

    new-array v3, v4, [Ljava/lang/Object;

    aput-object p1, v3, v6

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "context.getString(\n     \u2026 distance\n              )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lr13;->u0(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LFH3;

    invoke-virtual {p0, p1}, Ln13$a;->a(LFH3;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
