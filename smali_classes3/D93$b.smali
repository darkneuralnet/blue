.class public final LD93$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD93;->s(LE93;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lco/bird/android/model/NonRepairReason;",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/NonRepairReason;",
        ">;",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/NonRepairReason;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/NonRepairReason;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00000\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/NonRepairReason;",
        "reason",
        "Lco/bird/android/buava/Optional;",
        "subreason",
        "Lkotlin/Pair;",
        "a",
        "(Lco/bird/android/model/NonRepairReason;Lco/bird/android/buava/Optional;)Lkotlin/Pair;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LD93$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LD93$b;

    invoke-direct {v0}, LD93$b;-><init>()V

    sput-object v0, LD93$b;->g:LD93$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/NonRepairReason;Lco/bird/android/buava/Optional;)Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/NonRepairReason;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/NonRepairReason;",
            ">;)",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/NonRepairReason;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/NonRepairReason;",
            ">;>;"
        }
    .end annotation

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subreason"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/NonRepairReason;

    check-cast p2, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1, p2}, LD93$b;->a(Lco/bird/android/model/NonRepairReason;Lco/bird/android/buava/Optional;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
