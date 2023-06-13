.class public final Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;->G(I)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LrD2;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LrD2;",
        "kotlin.jvm.PlatformType",
        "composition",
        "",
        "a",
        "(LrD2;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$a;->g:Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LrD2;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$a;->g:Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;

    const-string v1, "composition"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$a;->g:Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;

    invoke-virtual {v0, p1, v1}, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;->N(LrD2;Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LrD2;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$a;->a(LrD2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
