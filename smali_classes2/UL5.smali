.class public final LUL5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUL5$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a8\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/model/constant/MapMode;",
        "",
        "private",
        "unlocking",
        "isHelmetLock",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "physicalLock",
        "",
        "fineString",
        "Lgx2;",
        "a",
        "app_birdRelease"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/constant/MapMode;ZZZLco/bird/android/model/wire/WirePhysicalLock;Ljava/lang/String;)Lgx2;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LUL5$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_1

    const/4 p1, 0x2

    if-eq p0, p1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_b

    sget-object v0, Lgx2;->u:Lgx2;

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    if-eqz p4, :cond_2

    invoke-virtual {p4}, Lco/bird/android/model/wire/WirePhysicalLock;->isBrainBasedBluetooth()Z

    move-result p4

    if-ne p4, v1, :cond_2

    goto :goto_0

    :cond_2
    move v1, p0

    :goto_0
    if-eqz v1, :cond_5

    if-eqz p2, :cond_3

    sget-object v0, Lgx2;->v:Lgx2;

    goto :goto_1

    :cond_3
    if-eqz p5, :cond_4

    sget-object v0, Lgx2;->x:Lgx2;

    goto :goto_1

    :cond_4
    sget-object v0, Lgx2;->w:Lgx2;

    goto :goto_1

    :cond_5
    if-eqz p3, :cond_7

    if-eqz p2, :cond_6

    sget-object v0, Lgx2;->y:Lgx2;

    goto :goto_1

    :cond_6
    sget-object v0, Lgx2;->z:Lgx2;

    goto :goto_1

    :cond_7
    if-nez p1, :cond_9

    if-eqz p2, :cond_8

    sget-object v0, Lgx2;->o:Lgx2;

    goto :goto_1

    :cond_8
    sget-object v0, Lgx2;->p:Lgx2;

    goto :goto_1

    :cond_9
    if-eqz p1, :cond_b

    if-eqz p2, :cond_a

    sget-object v0, Lgx2;->t:Lgx2;

    goto :goto_1

    :cond_a
    sget-object v0, Lgx2;->s:Lgx2;

    :cond_b
    :goto_1
    if-nez v0, :cond_c

    sget-object v0, Lgx2;->n:Lgx2;

    :cond_c
    return-object v0
.end method

.method public static synthetic lockState$default(Lco/bird/android/model/constant/MapMode;ZZZLco/bird/android/model/wire/WirePhysicalLock;Ljava/lang/String;ILjava/lang/Object;)Lgx2;
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-static/range {v0 .. v5}, LUL5;->a(Lco/bird/android/model/constant/MapMode;ZZZLco/bird/android/model/wire/WirePhysicalLock;Ljava/lang/String;)Lgx2;

    move-result-object p0

    return-object p0
.end method
