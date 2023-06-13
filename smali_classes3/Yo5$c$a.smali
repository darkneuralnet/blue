.class public final LYo5$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYo5$c;->f(Lkotlin/Pair;)Lio/reactivex/K;
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
        "Lco/bird/android/model/wire/WireItemScrapReason;",
        ">;",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "+",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireItemScrapReason;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a:\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000 \u0006*\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "Lco/bird/android/model/wire/WireItemScrapReason;",
        "reasons",
        "Lkotlin/Triple;",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lkotlin/Triple;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireSkuScanItem;

.field public final synthetic h:Lco/bird/android/model/wire/WireSkuOrder;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireSkuScanItem;Lco/bird/android/model/wire/WireSkuOrder;)V
    .locals 0

    iput-object p1, p0, LYo5$c$a;->g:Lco/bird/android/model/wire/WireSkuScanItem;

    iput-object p2, p0, LYo5$c$a;->h:Lco/bird/android/model/wire/WireSkuOrder;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lkotlin/Triple;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireItemScrapReason;",
            ">;)",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireItemScrapReason;",
            ">;>;"
        }
    .end annotation

    const-string v0, "reasons"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/Triple;

    iget-object v1, p0, LYo5$c$a;->g:Lco/bird/android/model/wire/WireSkuScanItem;

    iget-object v2, p0, LYo5$c$a;->h:Lco/bird/android/model/wire/WireSkuOrder;

    invoke-direct {v0, v1, v2, p1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LYo5$c$a;->a(Ljava/util/List;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method
