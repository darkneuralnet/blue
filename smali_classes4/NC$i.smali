.class public final LNC$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNC;->a(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;)V
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
        "Ljava/util/Map<",
        "Lco/bird/android/model/constant/QCKind;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/QCInspection;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001ar\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003 \u0007*8\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lco/bird/android/model/WorkOrder;",
        "workOrder",
        "Lio/reactivex/K;",
        "",
        "Lco/bird/android/model/constant/QCKind;",
        "",
        "Lco/bird/android/model/QCInspection;",
        "kotlin.jvm.PlatformType",
        "a",
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
.field public final synthetic g:LNC;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LNC;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LNC$i;->g:LNC;

    iput-object p2, p0, LNC$i;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/WorkOrder;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/QCKind;",
            "Ljava/util/List<",
            "Lco/bird/android/model/QCInspection;",
            ">;>;>;"
        }
    .end annotation

    const-string v0, "workOrder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNC$i;->g:LNC;

    invoke-virtual {v0}, LNC;->z()LaG6;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/WorkOrder;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, LNC$i;->h:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, LaG6;->f(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/WorkOrder;

    invoke-virtual {p0, p1}, LNC$i;->a(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
