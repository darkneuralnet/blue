.class public final LFz3$A$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFz3$A;->b(Lkotlin/Pair;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "+",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a2\u0012\u0004\u0012\u00020\u0000\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "scanItem",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireSkuScanItem;)Lkotlin/Pair;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lco/bird/android/model/wire/WireSkuOrder;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/wire/WireSkuOrder;)V
    .locals 0

    iput-object p1, p0, LFz3$A$a;->g:Ljava/lang/String;

    iput-object p2, p0, LFz3$A$a;->h:Lco/bird/android/model/wire/WireSkuOrder;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireSkuScanItem;)Lkotlin/Pair;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            ")",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            ">;"
        }
    .end annotation

    const-string v0, "scanItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    iget-object v9, p0, LFz3$A$a;->g:Ljava/lang/String;

    const/16 v10, 0x7f

    const/4 v11, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v11}, Lco/bird/android/model/wire/WireSkuScanItem;->copy$default(Lco/bird/android/model/wire/WireSkuScanItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILco/bird/android/model/wire/WireSkuVehicle;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/WireSkuScanItem;

    move-result-object p1

    iget-object v0, p0, LFz3$A$a;->h:Lco/bird/android/model/wire/WireSkuOrder;

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireSkuScanItem;

    invoke-virtual {p0, p1}, LFz3$A$a;->a(Lco/bird/android/model/wire/WireSkuScanItem;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
