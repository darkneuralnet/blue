.class public final LI86$d$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI86$d;->b(Lkotlin/Pair;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/ServiceCenterOrderViewResponse;",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/api/response/ServiceCenterOrderViewResponse;",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lorg/joda/time/DateTime;",
        "+",
        "Lorg/joda/time/DateTime;",
        ">;+",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0007\u001aF\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005 \u0006*\"\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lco/bird/api/response/ServiceCenterOrderViewResponse;",
        "response",
        "Lkotlin/Triple;",
        "Lkotlin/Pair;",
        "Lorg/joda/time/DateTime;",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/ServiceCenterOrderViewResponse;)Lkotlin/Triple;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lorg/joda/time/DateTime;

.field public final synthetic h:Lorg/joda/time/DateTime;

.field public final synthetic i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireTransferOrderFilter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireTransferOrderFilter;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LI86$d$a;->g:Lorg/joda/time/DateTime;

    iput-object p2, p0, LI86$d$a;->h:Lorg/joda/time/DateTime;

    iput-object p3, p0, LI86$d$a;->i:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/ServiceCenterOrderViewResponse;)Lkotlin/Triple;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/ServiceCenterOrderViewResponse;",
            ")",
            "Lkotlin/Triple<",
            "Lco/bird/api/response/ServiceCenterOrderViewResponse;",
            "Lkotlin/Pair<",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            ">;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/Triple;

    iget-object v1, p0, LI86$d$a;->g:Lorg/joda/time/DateTime;

    iget-object v2, p0, LI86$d$a;->h:Lorg/joda/time/DateTime;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    iget-object v2, p0, LI86$d$a;->i:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/ServiceCenterOrderViewResponse;

    invoke-virtual {p0, p1}, LI86$d$a;->a(Lco/bird/api/response/ServiceCenterOrderViewResponse;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method
