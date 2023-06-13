.class public final LQx4$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQx4;-><init>(LRh6;Lxx4;LTq4;Ldr4;LOn;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/configs/RentalConfig;",
        "Lio/reactivex/B<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/RentalPlan;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/RentalConfig;",
        "it",
        "Lio/reactivex/B;",
        "",
        "Lco/bird/android/model/RentalPlan;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/configs/RentalConfig;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LQx4;


# direct methods
.method public constructor <init>(LQx4;)V
    .locals 0

    iput-object p1, p0, LQx4$b;->g:LQx4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/configs/RentalConfig;)Lio/reactivex/B;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/configs/RentalConfig;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/RentalPlan;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RentalConfig;->getEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LQx4$b;->g:LQx4;

    invoke-static {p1}, LQx4;->access$pollOnDemandRentalPlans(LQx4;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LQx4$b;->g:LQx4;

    invoke-static {p1}, LQx4;->access$getAllOnDemandPlans$p(LQx4;)Lio/reactivex/subjects/a;

    move-result-object p1

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/configs/RentalConfig;

    invoke-virtual {p0, p1}, LQx4$b;->a(Lco/bird/android/model/wire/configs/RentalConfig;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
