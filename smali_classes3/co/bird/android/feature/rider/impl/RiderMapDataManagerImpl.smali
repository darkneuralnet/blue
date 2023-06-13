.class public final Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq95;
.implements LVX0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u008f\u0001\u0008\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u0012\u0010\u0008\u0001\u0010\u0013\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f\u0012\u0010\u0008\u0001\u0010\u0015\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f\u0012\u0010\u0008\u0001\u0010\u0017\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f\u0012\u0010\u0008\u0001\u0010\u0019\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f\u0012\u0010\u0008\u0001\u0010\u001b\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f\u0012\u0010\u0008\u0001\u0010\u001d\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0008\u0008\u0001\u0010$\u001a\u00020\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0012R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0012R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0012R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0012R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\"\u0010(\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f0%8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'R\"\u0010*\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f0%8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010\'\u00a8\u0006-"
    }
    d2 = {
        "Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;",
        "Lq95;",
        "LVX0;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onCreate",
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        "region",
        "Lio/reactivex/c;",
        "a",
        "b",
        "LTq4;",
        "LTq4;",
        "reactiveConfig",
        "Lwu6;",
        "Lvt4;",
        "c",
        "Lwu6;",
        "pointRadiusBirdManager",
        "d",
        "geocachedBirdManager",
        "e",
        "pointRadiusAreaManager",
        "f",
        "geocachedAreaManager",
        "g",
        "pointRadiusNestManager",
        "h",
        "geocachedNestManager",
        "Lbn;",
        "i",
        "Lbn;",
        "areaManager",
        "j",
        "LLifecycleOwner;",
        "processLifecycleOwner",
        "",
        "s",
        "()Ljava/util/List;",
        "birdManagers",
        "q",
        "areaManagers",
        "<init>",
        "(LTq4;Lwu6;Lwu6;Lwu6;Lwu6;Lwu6;Lwu6;Lbn;LLifecycleOwner;)V",
        "impl_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRiderMapDataManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderMapDataManagerImpl.kt\nco/bird/android/feature/rider/impl/RiderMapDataManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n44#2:132\n180#3:133\n1#4:134\n1549#5:135\n1620#5,3:136\n1549#5:139\n1620#5,3:140\n1549#5:143\n1620#5,3:144\n*S KotlinDebug\n*F\n+ 1 RiderMapDataManagerImpl.kt\nco/bird/android/feature/rider/impl/RiderMapDataManagerImpl\n*L\n49#1:132\n49#1:133\n90#1:135\n90#1:136,3\n110#1:139\n110#1:140,3\n121#1:143\n121#1:144,3\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LTq4;

.field public final c:Lwu6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwu6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lwu6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lwu6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lwu6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lwu6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lbn;

.field public final j:LLifecycleOwner;


# direct methods
.method public constructor <init>(LTq4;Lwu6;Lwu6;Lwu6;Lwu6;Lwu6;Lwu6;Lbn;LLifecycleOwner;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTq4;",
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;",
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;",
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;",
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;",
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;",
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;",
            "Lbn;",
            "LLifecycleOwner;",
            ")V"
        }
    .end annotation

    const-string v0, "reactiveConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pointRadiusBirdManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "geocachedBirdManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pointRadiusAreaManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "geocachedAreaManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pointRadiusNestManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "geocachedNestManager"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "areaManager"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processLifecycleOwner"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->b:LTq4;

    iput-object p2, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->c:Lwu6;

    iput-object p3, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->d:Lwu6;

    iput-object p4, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->e:Lwu6;

    iput-object p5, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->f:Lwu6;

    iput-object p6, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->g:Lwu6;

    iput-object p7, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->h:Lwu6;

    iput-object p8, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->i:Lbn;

    iput-object p9, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->j:LLifecycleOwner;

    return-void
.end method

.method public static final A(Lwu6;)V
    .locals 1

    const-string v0, "$manager"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " successfully refreshed nearby birds"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getAreaManager$p(Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;)Lbn;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->i:Lbn;

    return-object p0
.end method

.method public static synthetic d(Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->v(Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->y(Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lwu6;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->A(Lwu6;)V

    return-void
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final v(Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$region"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->q()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwu6;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, p1, v3, v2, v3}, Lwu6$a;->refresh$default(Lwu6;Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/util/List;ILjava/lang/Object;)Lio/reactivex/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final y(Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$region"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->s()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwu6;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, p1, v3, v2, v3}, Lwu6$a;->refresh$default(Lwu6;Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/util/List;ILjava/lang/Object;)Lio/reactivex/c;

    move-result-object v2

    new-instance v3, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$d;

    invoke-direct {v3, v1}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$d;-><init>(Lwu6;)V

    new-instance v4, Lx95;

    invoke-direct {v4, v3}, Lx95;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v4}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v2

    new-instance v3, Ly95;

    invoke-direct {v3, v1}, Ly95;-><init>(Lwu6;)V

    invoke-virtual {v2, v3}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v2

    new-instance v3, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$e;

    invoke-direct {v3, v1}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$e;-><init>(Lwu6;)V

    new-instance v1, Lz95;

    invoke-direct {v1, v3}, Lz95;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/LatLngBounds;)Lio/reactivex/c;
    .locals 2

    const-string v0, "region"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv95;

    invoke-direct {v0, p0, p1}, Lv95;-><init>(Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$f;->g:Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$f;

    new-instance v1, Lw95;

    invoke-direct {v1, v0}, Lw95;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "fromCallable {\n      bir\u2026s.toTypedArray())\n      }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Lcom/google/android/gms/maps/model/LatLngBounds;)Lio/reactivex/c;
    .locals 2

    const-string v0, "region"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt95;

    invoke-direct {v0, p0, p1}, Lt95;-><init>(Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$c;->g:Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$c;

    new-instance v1, Lu95;

    invoke-direct {v1, v0}, Lu95;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "fromCallable {\n      are\u2026s.toTypedArray())\n      }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onCreate(LLifecycleOwner;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onCreate(LLifecycleOwner;)V

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->b:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    sget-object v1, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$a;->g:Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$a;

    new-instance v2, Lr95;

    invoke-direct {v2, v1}, Lr95;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->skip(J)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "reactiveConfig.config\n  \u2026lChanged()\n      .skip(1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p1

    const-string v1, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$b;

    invoke-direct {v0, p0}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$b;-><init>(Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;)V

    new-instance v1, Ls95;

    invoke-direct {v1, v0}, Ls95;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final q()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lwu6;

    iget-object v1, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->f:Lwu6;

    invoke-interface {v1}, Lwu6;->isEnabled()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    iget-object v2, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->e:Lwu6;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final s()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lwu6<",
            "+",
            "Lvt4;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lwu6;

    iget-object v1, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->d:Lwu6;

    invoke-interface {v1}, Lwu6;->isEnabled()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    iget-object v2, p0, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->c:Lwu6;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
