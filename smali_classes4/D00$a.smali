.class public final LD00$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD00;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJN\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008\u00a8\u0006\u000f"
    }
    d2 = {
        "LD00$a;",
        "",
        "Lco/bird/android/buava/Optional;",
        "",
        "minLastRidden",
        "maxLastRidden",
        "minLastLocated",
        "maxLastLocated",
        "",
        "enableBirdTypeFilter",
        "enableLastRideFilter",
        "LD00;",
        "a",
        "<init>",
        "()V",
        "contractor_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LD00$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;ZZ)LD00;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Integer;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Integer;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Integer;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Integer;",
            ">;ZZ)",
            "LD00;"
        }
    .end annotation

    const-string v0, "minLastRidden"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "maxLastRidden"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "minLastLocated"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "maxLastLocated"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD00;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, LD00;-><init>(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;ZZ)V

    return-object v0
.end method
