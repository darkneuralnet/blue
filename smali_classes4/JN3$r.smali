.class public final LJN3$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJN3;->e(Z)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/Map<",
        "Lco/bird/android/model/constant/PaymentMethod;",
        "+",
        "Lco/bird/android/model/constant/PaymentProvider;",
        ">;",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/constant/PaymentMethod;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0005*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "Lco/bird/android/model/constant/PaymentMethod;",
        "Lco/bird/android/model/constant/PaymentProvider;",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/Map;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LJN3$r;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LJN3$r;

    invoke-direct {v0}, LJN3$r;-><init>()V

    sput-object v0, LJN3$r;->g:LJN3$r;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentMethod;",
            "+",
            "Lco/bird/android/model/constant/PaymentProvider;",
            ">;)",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/PaymentMethod;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, LJN3$r;->a(Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
