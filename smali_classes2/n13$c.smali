.class public final Ln13$c;
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
        "Lkotlin/Pair<",
        "+",
        "Lkotlin/Unit;",
        "+",
        "LFH3;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a\u00020\u00012F\u0010\u0004\u001aB\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "kotlin.jvm.PlatformType",
        "LFH3;",
        "<name for destructuring parameter 0>",
        "invoke",
        "(Lkotlin/Pair;)V",
        "<anonymous>"
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

    iput-object p1, p0, Ln13$c;->g:Ln13;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Ln13$c;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lkotlin/Unit;",
            "+",
            "LFH3;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LFH3;

    instance-of v0, p1, LCd1;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ln13$c;->g:Ln13;

    invoke-static {v0}, Ln13;->access$getParkingManager$p(Ln13;)LoF3;

    move-result-object v0

    invoke-interface {v0}, LoF3;->g()LbF0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LbF0;->e()Lco/bird/android/model/ParkingNest;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/ParkingNest;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ln13$c;->g:Ln13;

    invoke-static {v1}, Ln13;->access$getNearParkingNestBannerUi$p(Ln13;)Lr13;

    move-result-object v1

    new-instance v2, Ln13$c$a;

    iget-object v3, p0, Ln13$c;->g:Ln13;

    invoke-direct {v2, v3, v0}, Ln13$c$a;-><init>(Ln13;Ljava/lang/String;)V

    new-instance v3, Ln13$c$b;

    iget-object v4, p0, Ln13$c;->g:Ln13;

    invoke-direct {v3, v4, v0}, Ln13$c$b;-><init>(Ln13;Ljava/lang/String;)V

    sget-object v0, Lxx1;->a:Lxx1;

    iget-object v4, p0, Ln13$c;->g:Ln13;

    invoke-static {v4}, Ln13;->access$getContext$p(Ln13;)Landroid/content/Context;

    move-result-object v4

    check-cast p1, LCd1;

    invoke-virtual {p1}, LCd1;->h()Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    float-to-double v5, p1

    goto :goto_1

    :cond_1
    const-wide/16 v5, 0x0

    :goto_1
    invoke-virtual {v0, v4, v5, v6}, Lxx1;->i(Landroid/content/Context;D)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, v3, p1}, Lr13;->Kg(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
