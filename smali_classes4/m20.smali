.class public final Lm20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll20;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J(\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00022\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\r*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Lm20;",
        "Ll20;",
        "",
        "token",
        "",
        "c",
        "userId",
        "a",
        "event",
        "",
        "",
        "properties",
        "b",
        "Ls20;",
        "d",
        "LP10;",
        "LP10;",
        "braze",
        "<init>",
        "(LP10;)V",
        "braze_release"
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
        "SMAP\nBrazeManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeManagerImpl.kt\nco/bird/android/manager/braze/BrazeManagerImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n215#2:50\n216#2:52\n1#3:51\n*S KotlinDebug\n*F\n+ 1 BrazeManagerImpl.kt\nco/bird/android/manager/braze/BrazeManagerImpl\n*L\n34#1:50\n34#1:52\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LP10;


# direct methods
.method public constructor <init>(LP10;)V
    .locals 1

    const-string v0, "braze"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm20;->a:LP10;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm20;->a:LP10;

    invoke-virtual {v0, p1}, Lcom/appboy/Appboy;->changeUser(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lm20;->d(Ljava/util/Map;)Ls20;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Lm20;->a:LP10;

    invoke-virtual {v0, p1, p2}, Lcom/appboy/Appboy;->logCustomEvent(Ljava/lang/String;Ls20;)V

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lm20;->a:LP10;

    invoke-virtual {p2, p1}, Lcom/appboy/Appboy;->logCustomEvent(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm20;->a:LP10;

    invoke-virtual {v0, p1}, Lcom/appboy/Appboy;->registerPushToken(Ljava/lang/String;)V

    return-void
.end method

.method public final d(Ljava/util/Map;)Ls20;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ls20;"
        }
    .end annotation

    new-instance v0, Ls20;

    invoke-direct {v0}, Ls20;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Long;

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2, v1}, Ls20;->a(Ljava/lang/String;Ljava/lang/Object;)Ls20;

    goto :goto_0

    :cond_1
    instance-of v3, v1, Ljava/lang/Float;

    if-eqz v3, :cond_2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ls20;->a(Ljava/lang/String;Ljava/lang/Object;)Ls20;

    goto :goto_0

    :cond_2
    instance-of v3, v1, Ljava/lang/Double;

    if-eqz v3, :cond_3

    invoke-virtual {v0, v2, v1}, Ls20;->a(Ljava/lang/String;Ljava/lang/Object;)Ls20;

    goto :goto_0

    :cond_3
    instance-of v3, v1, Ljava/lang/Integer;

    if-eqz v3, :cond_4

    invoke-virtual {v0, v2, v1}, Ls20;->a(Ljava/lang/String;Ljava/lang/Object;)Ls20;

    goto :goto_0

    :cond_4
    instance-of v3, v1, Ljava/lang/Boolean;

    if-eqz v3, :cond_5

    invoke-virtual {v0, v2, v1}, Ls20;->a(Ljava/lang/String;Ljava/lang/Object;)Ls20;

    goto :goto_0

    :cond_5
    instance-of v3, v1, Lorg/joda/time/DateTime;

    if-eqz v3, :cond_6

    check-cast v1, Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ls20;->a(Ljava/lang/String;Ljava/lang/Object;)Ls20;

    goto :goto_0

    :cond_6
    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_7

    invoke-virtual {v0, v2, v1}, Ls20;->a(Ljava/lang/String;Ljava/lang/Object;)Ls20;

    goto :goto_0

    :cond_7
    if-eqz v3, :cond_8

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_8
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_0

    invoke-virtual {v0, v2, v1}, Ls20;->a(Ljava/lang/String;Ljava/lang/Object;)Ls20;

    goto :goto_0

    :cond_9
    return-object v0
.end method
