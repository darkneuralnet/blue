.class public final Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->b(Lcom/google/android/gms/maps/model/LatLngBounds;)Lio/reactivex/c;
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
        "Lio/reactivex/c;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lio/reactivex/c;",
        "sources",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lio/reactivex/h;"
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
        "SMAP\nRiderMapDataManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderMapDataManagerImpl.kt\nco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$refreshNearbyAreas$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,131:1\n37#2,2:132\n*S KotlinDebug\n*F\n+ 1 RiderMapDataManagerImpl.kt\nco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$refreshNearbyAreas$2\n*L\n115#1:132,2\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$c;

    invoke-direct {v0}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$c;-><init>()V

    sput-object v0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$c;->g:Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lio/reactivex/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/reactivex/c;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "sources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    new-array v0, v0, [Lio/reactivex/c;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lio/reactivex/c;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lio/reactivex/c;

    invoke-static {p1}, LYf5;->z([Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$c;->a(Ljava/util/List;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
