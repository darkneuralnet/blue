.class public final LD93$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "[",
        "Ljava/lang/Object;",
        "LRe4<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Lco/bird/android/model/RepairCategory;",
        "+",
        "Lco/bird/android/model/NonRepair;",
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
        "\u0000(\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\n\u001aR\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\t \u0002*(\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\t\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "",
        "",
        "kotlin.jvm.PlatformType",
        "items",
        "LRe4;",
        "",
        "Lco/bird/android/model/RepairCategory;",
        "Lco/bird/android/model/NonRepair;",
        "Lco/bird/android/model/NonRepairReason;",
        "Lco/bird/android/buava/Optional;",
        "a",
        "([Ljava/lang/Object;)LRe4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LD93$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LD93$d;

    invoke-direct {v0}, LD93$d;-><init>()V

    sput-object v0, LD93$d;->g:LD93$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)LRe4;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "LRe4<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/RepairCategory;",
            "Lco/bird/android/model/NonRepair;",
            "Lco/bird/android/model/NonRepairReason;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/NonRepairReason;",
            ">;>;"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LRe4;

    const/4 v1, 0x1

    aget-object v1, p1, v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v1, p1, v1

    const-string v3, "null cannot be cast to non-null type co.bird.android.model.RepairCategory"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Lco/bird/android/model/RepairCategory;

    const/4 v1, 0x3

    aget-object v1, p1, v1

    const-string v4, "null cannot be cast to non-null type co.bird.android.model.NonRepair"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v1

    check-cast v4, Lco/bird/android/model/NonRepair;

    const/4 v1, 0x4

    aget-object v1, p1, v1

    const-string v5, "null cannot be cast to non-null type co.bird.android.model.NonRepairReason"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v1

    check-cast v5, Lco/bird/android/model/NonRepairReason;

    const/4 v1, 0x5

    aget-object p1, p1, v1

    const-string v1, "null cannot be cast to non-null type co.bird.android.buava.Optional<co.bird.android.model.NonRepairReason>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p1

    check-cast v6, Lco/bird/android/buava/Optional;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LRe4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, LD93$d;->a([Ljava/lang/Object;)LRe4;

    move-result-object p1

    return-object p1
.end method
