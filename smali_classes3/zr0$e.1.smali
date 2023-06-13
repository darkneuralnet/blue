.class public final Lzr0$e;
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
        Lzr0$e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/constant/ComplaintResolutionField;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
        "+",
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001aZ\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lco/bird/android/model/constant/ComplaintResolutionField;",
        "field",
        "Lio/reactivex/K;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        "kotlin.jvm.PlatformType",
        "d",
        "(Lco/bird/android/model/constant/ComplaintResolutionField;)Lio/reactivex/K;"
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

    iput-object p1, p0, Lzr0$e;->g:Lzr0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1, p2}, Lzr0$e;->g(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lzr0;Lco/bird/android/model/constant/ComplaintResolutionField;)V
    .locals 0

    invoke-static {p0, p1}, Lzr0$e;->e(Lzr0;Lco/bird/android/model/constant/ComplaintResolutionField;)V

    return-void
.end method

.method public static synthetic c(Lzr0;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0}, Lzr0$e;->f(Lzr0;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lzr0;Lco/bird/android/model/constant/ComplaintResolutionField;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lzr0;->access$fieldCheck(Lzr0;Lco/bird/android/model/constant/ComplaintResolutionField;Z)V

    return-void
.end method

.method public static final f(Lzr0;)Lio/reactivex/K;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lzr0;->access$getOperatorManager$p(Lzr0;)Lom3;

    move-result-object v0

    invoke-interface {v0}, Lom3;->o1()Lio/reactivex/F;

    move-result-object v0

    invoke-static {p0}, Lzr0;->access$getOperatorManager$p(Lzr0;)Lom3;

    move-result-object v1

    invoke-static {p0}, Lzr0;->access$getComplaintIds$p(Lzr0;)Ljava/util/List;

    move-result-object p0

    invoke-interface {v1, p0}, Lom3;->E(Ljava/util/List;)Lio/reactivex/p;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/p;->e0()Lio/reactivex/F;

    move-result-object p0

    sget-object v1, Lzr0$e$a;->g:Lzr0$e$a;

    new-instance v2, LFr0;

    invoke-direct {v2, v1}, LFr0;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v0, p0, v2}, Lio/reactivex/F;->r0(Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/functions/c;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final d(Lco/bird/android/model/constant/ComplaintResolutionField;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/ComplaintResolutionField;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
            "Lco/bird/android/model/persistence/ComplaintResolution;",
            ">;>;"
        }
    .end annotation

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lzr0$e$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzr0$e;->g:Lzr0;

    invoke-static {v0}, Lzr0;->access$getOperatorManager$p(Lzr0;)Lom3;

    move-result-object v0

    iget-object v1, p0, Lzr0$e;->g:Lzr0;

    invoke-static {v1}, Lzr0;->access$getComplaintIds$p(Lzr0;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Lom3;->P0(Ljava/util/List;Lco/bird/android/model/FileUploadReceipt;)Lio/reactivex/c;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lzr0$e;->g:Lzr0;

    invoke-static {v0}, Lzr0;->access$getOperatorManager$p(Lzr0;)Lom3;

    move-result-object v0

    iget-object v1, p0, Lzr0$e;->g:Lzr0;

    invoke-static {v1}, Lzr0;->access$getComplaintIds$p(Lzr0;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Lom3;->U0(Ljava/util/List;Lco/bird/android/model/FileUploadReceipt;)Lio/reactivex/c;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lzr0$e;->g:Lzr0;

    new-instance v2, LDr0;

    invoke-direct {v2, v1, p1}, LDr0;-><init>(Lzr0;Lco/bird/android/model/constant/ComplaintResolutionField;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, Lzr0$e;->g:Lzr0;

    new-instance v1, LEr0;

    invoke-direct {v1, v0}, LEr0;-><init>(Lzr0;)V

    invoke-static {v1}, Lio/reactivex/F;->k(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/constant/ComplaintResolutionField;

    invoke-virtual {p0, p1}, Lzr0$e;->d(Lco/bird/android/model/constant/ComplaintResolutionField;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
