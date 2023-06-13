.class public final Lhp3$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhp3;->H(Llp3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LIO5;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/persistence/OperatorOrderView;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LIO5;",
        "state",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/persistence/OperatorOrderView;",
        "kotlin.jvm.PlatformType",
        "b",
        "(LIO5;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lhp3;


# direct methods
.method public constructor <init>(Lhp3;)V
    .locals 0

    iput-object p1, p0, Lhp3$m;->g:Lhp3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lco/bird/android/model/persistence/OperatorOrderView;
    .locals 0

    invoke-static {p0, p1, p2}, Lhp3$m;->c(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lco/bird/android/model/persistence/OperatorOrderView;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lco/bird/android/model/persistence/OperatorOrderView;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/persistence/OperatorOrderView;

    return-object p0
.end method


# virtual methods
.method public final b(LIO5;)Lio/reactivex/B;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LIO5;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/persistence/OperatorOrderView;",
            ">;"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhp3$m;->g:Lhp3;

    invoke-static {v0}, Lhp3;->access$getTransferOrderManager$p(Lhp3;)LO86;

    move-result-object v0

    invoke-virtual {p1}, LIO5;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LIO5;->c()Lco/bird/android/model/constant/OperatorOrderViewType;

    move-result-object p1

    invoke-interface {v0, v1, p1}, LO86;->W(Ljava/lang/String;Lco/bird/android/model/constant/OperatorOrderViewType;)Lio/reactivex/Observable;

    move-result-object p1

    iget-object v0, p0, Lhp3$m;->g:Lhp3;

    invoke-static {v0}, Lhp3;->access$getScannedItemsRelay$p(Lhp3;)Lma4;

    move-result-object v0

    new-instance v1, Lhp3$m$a;

    iget-object v2, p0, Lhp3$m;->g:Lhp3;

    invoke-direct {v1, v2}, Lhp3$m$a;-><init>(Lhp3;)V

    new-instance v2, Lip3;

    invoke-direct {v2, v1}, Lip3;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {p1, v0, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIO5;

    invoke-virtual {p0, p1}, Lhp3$m;->b(LIO5;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
