.class public final LMD5$n$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMD5$n;->b(Lkotlin/Pair;)Lio/reactivex/K;
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
        "LH6;",
        ">;",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "+",
        "Lco/bird/android/model/wire/WireSkuScannedItems;",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001aZ\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*,\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "LH6;",
        "it",
        "Lkotlin/Triple;",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/wire/WireSkuScannedItems;",
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
.field public final synthetic g:Lco/bird/android/model/wire/WireSkuOrder;

.field public final synthetic h:Lco/bird/android/model/wire/WireSkuScannedItems;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireSkuOrder;Lco/bird/android/model/wire/WireSkuScannedItems;)V
    .locals 0

    iput-object p1, p0, LMD5$n$a;->g:Lco/bird/android/model/wire/WireSkuOrder;

    iput-object p2, p0, LMD5$n$a;->h:Lco/bird/android/model/wire/WireSkuScannedItems;

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
            "LH6;",
            ">;)",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            "Lco/bird/android/model/wire/WireSkuScannedItems;",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/Triple;

    iget-object v1, p0, LMD5$n$a;->g:Lco/bird/android/model/wire/WireSkuOrder;

    iget-object v2, p0, LMD5$n$a;->h:Lco/bird/android/model/wire/WireSkuScannedItems;

    invoke-direct {v0, v1, v2, p1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LMD5$n$a;->a(Ljava/util/List;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method
