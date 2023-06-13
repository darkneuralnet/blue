.class public final LjA1$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjA1;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "selectedTabIndex",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Integer;)V"
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
.field public final synthetic g:LjA1;


# direct methods
.method public constructor <init>(LjA1;)V
    .locals 0

    iput-object p1, p0, LjA1$a;->g:LjA1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, LjA1$a;->invoke(Ljava/lang/Integer;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Integer;)V
    .locals 3

    iget-object v0, p0, LjA1$a;->g:LjA1;

    invoke-static {v0}, LjA1;->access$getUi$p(LjA1;)LnA1;

    move-result-object v0

    iget-object v1, p0, LjA1$a;->g:LjA1;

    invoke-static {v1}, LjA1;->access$getData$p(LjA1;)Lco/bird/android/model/wire/WireFrequentFlyerView;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireFrequentFlyerView;->getTierViews()Ljava/util/List;

    move-result-object v1

    const-string v2, "selectedTabIndex"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireTierView;

    invoke-static {v1}, LlA1;->a(Lco/bird/android/model/wire/WireTierView;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, LnA1;->k2(Ljava/util/List;)V

    iget-object v0, p0, LjA1$a;->g:LjA1;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, LjA1;->access$trackLoyaltyBenefitsTabViewed(LjA1;I)V

    return-void
.end method
