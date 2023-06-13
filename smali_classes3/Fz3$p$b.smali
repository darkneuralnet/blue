.class public final LFz3$p$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFz3$p;->c(Lkotlin/Pair;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "Lkotlin/Pair<",
        "+",
        "Ljava/util/List<",
        "+",
        "LPC5;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "+",
        "Ljava/util/List<",
        "+",
        "LPC5;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Ljava/lang/String;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a \u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00030\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u001e\u0010\u0006\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "skuOrder",
        "Lkotlin/Pair;",
        "",
        "LPC5;",
        "",
        "pair",
        "Lkotlin/Triple;",
        "a",
        "(Lco/bird/android/model/wire/WireSkuOrder;Lkotlin/Pair;)Lkotlin/Triple;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LFz3$p$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LFz3$p$b;

    invoke-direct {v0}, LFz3$p$b;-><init>()V

    sput-object v0, LFz3$p$b;->g:LFz3$p$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireSkuOrder;Lkotlin/Pair;)Lkotlin/Triple;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            "Lkotlin/Pair<",
            "+",
            "Ljava/util/List<",
            "LPC5;",
            ">;+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            "Ljava/util/List<",
            "LPC5;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    const-string v0, "skuOrder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pair"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/Triple;

    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    invoke-direct {v0, p1, v1, p2}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireSkuOrder;

    check-cast p2, Lkotlin/Pair;

    invoke-virtual {p0, p1, p2}, LFz3$p$b;->a(Lco/bird/android/model/wire/WireSkuOrder;Lkotlin/Pair;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method
