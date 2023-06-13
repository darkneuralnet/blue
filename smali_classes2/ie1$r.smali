.class public final Lie1$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lie1;->T()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LCf0;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LCf0;",
        "it",
        "Lio/reactivex/K;",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(LCf0;)Lio/reactivex/K;"
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

    iput-object p1, p0, Lie1$r;->g:Lie1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LCf0;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCf0;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lie1$r;->g:Lie1;

    invoke-static {v0}, Lie1;->access$getPaymentManagerV3$p(Lie1;)LVM3;

    move-result-object v0

    iget-object v1, p0, Lie1$r;->g:Lie1;

    invoke-static {v1}, Lie1;->access$getActivity$p(Lie1;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    iget-object v2, p0, Lie1$r;->g:Lie1;

    invoke-static {v2}, Lie1;->access$getCardConfiguration(Lie1;)Lcom/adyen/checkout/card/CardConfiguration;

    move-result-object v2

    invoke-interface {v0, v1, p1, v2}, LVM3;->B(Landroid/content/Context;LCf0;Lcom/adyen/checkout/card/CardConfiguration;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCf0;

    invoke-virtual {p0, p1}, Lie1$r;->a(LCf0;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
