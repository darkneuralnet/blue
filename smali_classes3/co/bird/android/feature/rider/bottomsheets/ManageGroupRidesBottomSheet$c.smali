.class public final Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "LH6;",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Ljava/util/List;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$c;->g:Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$c;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$c;->d(Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->v()LwZ;

    move-result-object v0

    invoke-virtual {v0, p1}, LwZ;->c(Ljava/util/List;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Ljava/util/List;)Lio/reactivex/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$c;->g:Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;

    new-instance v1, LnH2;

    invoke-direct {v1, v0, p1}, LnH2;-><init>(Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;Ljava/util/List;)V

    invoke-static {v1}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    sget-object v0, Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$c$a;->b:Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$c$a;

    new-instance v1, LoH2;

    invoke-direct {v1, v0}, LoH2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$c;->c(Ljava/util/List;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
