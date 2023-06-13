.class public final Lco/bird/android/app/feature/map/ui/renderer/MutableLazy$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\u0008\u0001\u0010\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u0002H\u00050\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/renderer/MutableLazy$Companion;",
        "",
        "()V",
        "resettableLazy",
        "Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;",
        "T",
        "value",
        "Lkotlin/Function0;",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/renderer/MutableLazy$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final resettableLazy(Lkotlin/jvm/functions/Function0;)Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;)",
            "Lco/bird/android/app/feature/map/ui/renderer/MutableLazy<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;-><init>(Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method
