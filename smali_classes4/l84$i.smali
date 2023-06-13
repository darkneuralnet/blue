.class public final Ll84$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll84;->n0(Ljava/util/List;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LMD0;",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireCoupon;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LMD0;",
        "response",
        "",
        "Lco/bird/android/model/wire/WireCoupon;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LMD0;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPromoManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromoManagerImpl.kt\nco/bird/android/manager/ride/PromoManagerImpl$fetchCouponExtensions$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n1549#2:240\n1620#2,3:241\n*S KotlinDebug\n*F\n+ 1 PromoManagerImpl.kt\nco/bird/android/manager/ride/PromoManagerImpl$fetchCouponExtensions$2\n*L\n219#1:240\n219#1:241,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ll84$i;->g:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LMD0;)Ljava/util/List;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMD0;",
            ")",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "response"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    iget-object v2, v1, Ll84$i;->g:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireCoupon;

    move-object v5, v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireCoupon;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, LMD0;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v21

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireCoupon;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, LMD0;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v22

    const/16 v23, 0x7fff

    const/16 v24, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v24}, Lco/bird/android/model/wire/WireCoupon;->copy$default(Lco/bird/android/model/wire/WireCoupon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/CouponKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLco/bird/android/model/constant/CouponOrigin;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/wire/WireCoupon;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v3
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LMD0;

    invoke-virtual {p0, p1}, Ll84$i;->a(LMD0;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
