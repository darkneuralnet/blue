.class public final Lco/bird/android/foregroundservice/ForegroundService$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/foregroundservice/ForegroundService;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/Set<",
        "+",
        "Lqx1;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Lqx1;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lqx1;",
        "activePlugins",
        "Lco/bird/android/buava/Optional;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/Set;)Lco/bird/android/buava/Optional;"
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
        "SMAP\nForegroundService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundService.kt\nco/bird/android/foregroundservice/ForegroundService$onCreate$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n2333#2,14:128\n*S KotlinDebug\n*F\n+ 1 ForegroundService.kt\nco/bird/android/foregroundservice/ForegroundService$onCreate$4\n*L\n83#1:128,14\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/foregroundservice/ForegroundService$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/foregroundservice/ForegroundService$e;

    invoke-direct {v0}, Lco/bird/android/foregroundservice/ForegroundService$e;-><init>()V

    sput-object v0, Lco/bird/android/foregroundservice/ForegroundService$e;->g:Lco/bird/android/foregroundservice/ForegroundService$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Lco/bird/android/buava/Optional;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lqx1;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "Lqx1;",
            ">;"
        }
    .end annotation

    const-string v0, "activePlugins"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    move-object p1, v1

    goto :goto_1

    :cond_1
    move-object v2, v1

    check-cast v2, Lqx1;

    invoke-virtual {v2}, Lqx1;->j()I

    move-result v2

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lqx1;

    invoke-virtual {v4}, Lqx1;->j()I

    move-result v4

    if-le v2, v4, :cond_3

    move-object v1, v3

    move v2, v4

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :goto_1
    invoke-virtual {v0, p1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lco/bird/android/foregroundservice/ForegroundService$e;->a(Ljava/util/Set;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
