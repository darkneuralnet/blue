.class public final LyD6$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyD6;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/WorkOrder;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/WorkOrder;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/WorkOrder;",
        "workOrder",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LyD6;


# direct methods
.method public constructor <init>(LyD6;)V
    .locals 0

    iput-object p1, p0, LyD6$f;->g:LyD6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/WorkOrder;
    .locals 0

    invoke-static {p0, p1}, LyD6$f;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/WorkOrder;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/WorkOrder;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/WorkOrder;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/WorkOrder;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/WorkOrder;",
            ">;"
        }
    .end annotation

    const-string v0, "workOrder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/reactivex/rxkotlin/g;->a:Lio/reactivex/rxkotlin/g;

    iget-object v1, p0, LyD6$f;->g:LyD6;

    invoke-static {v1}, LyD6;->access$getWorkOrderManager$p(LyD6;)LaG6;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/WorkOrder;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, LaG6;->e(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {v1}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v1

    iget-object v2, p0, LyD6$f;->g:LyD6;

    invoke-static {v2}, LyD6;->access$getWorkOrderManager$p(LyD6;)LaG6;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/WorkOrder;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, LaG6;->c(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v2

    invoke-static {v2}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/reactivex/rxkotlin/g;->a(Lio/reactivex/K;Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LyD6$f$a;

    invoke-direct {v1, p1}, LyD6$f$a;-><init>(Lco/bird/android/model/WorkOrder;)V

    new-instance p1, LzD6;

    invoke-direct {p1, v1}, LzD6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/WorkOrder;

    invoke-virtual {p0, p1}, LyD6$f;->b(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
