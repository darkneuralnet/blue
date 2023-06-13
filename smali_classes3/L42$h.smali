.class public final LL42$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL42;->x(Ljava/lang/String;Lco/bird/android/model/constant/InspectionContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/InspectionFlow;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/DialogResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/InspectionFlow;",
        "inspectionFlow",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/DialogResponse;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/InspectionFlow;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LL42;

.field public final synthetic h:Lco/bird/android/model/constant/InspectionContext;


# direct methods
.method public constructor <init>(LL42;Lco/bird/android/model/constant/InspectionContext;)V
    .locals 0

    iput-object p1, p0, LL42$h;->g:LL42;

    iput-object p2, p0, LL42$h;->h:Lco/bird/android/model/constant/InspectionContext;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/InspectionFlow;)Lio/reactivex/B;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/InspectionFlow;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "inspectionFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LL42$h;->g:LL42;

    invoke-static {v0}, LL42;->access$getUi$p(LL42;)LR42;

    move-result-object v0

    iget-object v1, p0, LL42$h;->h:Lco/bird/android/model/constant/InspectionContext;

    invoke-virtual {v0, p1, v1}, LR42;->Vl(Lco/bird/android/model/InspectionFlow;Lco/bird/android/model/constant/InspectionContext;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/InspectionFlow;

    invoke-virtual {p0, p1}, LL42$h;->a(Lco/bird/android/model/InspectionFlow;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
