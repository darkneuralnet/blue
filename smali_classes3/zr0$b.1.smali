.class public final Lzr0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzr0;->V(LXr0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzr0$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/constant/ComplaintResolutionField;",
        "+",
        "Lco/bird/android/model/FileUploadReceipt;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/constant/ComplaintResolutionField;",
        "Lco/bird/android/model/FileUploadReceipt;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lkotlin/Pair;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lzr0;


# direct methods
.method public constructor <init>(Lzr0;)V
    .locals 0

    iput-object p1, p0, Lzr0$b;->g:Lzr0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lzr0;Lco/bird/android/model/constant/ComplaintResolutionField;)V
    .locals 0

    invoke-static {p0, p1}, Lzr0$b;->d(Lzr0;Lco/bird/android/model/constant/ComplaintResolutionField;)V

    return-void
.end method

.method public static synthetic b(Lzr0;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0}, Lzr0$b;->e(Lzr0;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lzr0;Lco/bird/android/model/constant/ComplaintResolutionField;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lzr0;->access$fieldCheck(Lzr0;Lco/bird/android/model/constant/ComplaintResolutionField;Z)V

    return-void
.end method

.method public static final e(Lzr0;)Lio/reactivex/K;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lzr0;->access$getOperatorManager$p(Lzr0;)Lom3;

    move-result-object v0

    invoke-static {p0}, Lzr0;->access$getComplaintIds$p(Lzr0;)Ljava/util/List;

    move-result-object p0

    invoke-interface {v0, p0}, Lom3;->E(Ljava/util/List;)Lio/reactivex/p;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/p;->e0()Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Lkotlin/Pair;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Lco/bird/android/model/constant/ComplaintResolutionField;",
            "Lco/bird/android/model/FileUploadReceipt;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/persistence/ComplaintResolution;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/constant/ComplaintResolutionField;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/FileUploadReceipt;

    sget-object v1, Lzr0$b$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lzr0$b;->g:Lzr0;

    invoke-static {v1}, Lzr0;->access$getOperatorManager$p(Lzr0;)Lom3;

    move-result-object v1

    iget-object v2, p0, Lzr0$b;->g:Lzr0;

    invoke-static {v2}, Lzr0;->access$getComplaintIds$p(Lzr0;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Lom3;->P0(Ljava/util/List;Lco/bird/android/model/FileUploadReceipt;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lzr0$b;->g:Lzr0;

    invoke-static {v1}, Lzr0;->access$getOperatorManager$p(Lzr0;)Lom3;

    move-result-object v1

    iget-object v2, p0, Lzr0$b;->g:Lzr0;

    invoke-static {v2}, Lzr0;->access$getComplaintIds$p(Lzr0;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Lom3;->U0(Ljava/util/List;Lco/bird/android/model/FileUploadReceipt;)Lio/reactivex/c;

    move-result-object p1

    :goto_0
    iget-object v1, p0, Lzr0$b;->g:Lzr0;

    new-instance v2, LAr0;

    invoke-direct {v2, v1, v0}, LAr0;-><init>(Lzr0;Lco/bird/android/model/constant/ComplaintResolutionField;)V

    invoke-virtual {p1, v2}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, Lzr0$b;->g:Lzr0;

    new-instance v1, LBr0;

    invoke-direct {v1, v0}, LBr0;-><init>(Lzr0;)V

    invoke-static {v1}, Lio/reactivex/F;->k(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lzr0$b;->c(Lkotlin/Pair;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
