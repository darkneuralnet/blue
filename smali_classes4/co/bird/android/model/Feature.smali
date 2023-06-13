.class public final enum Lco/bird/android/model/Feature;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/Feature;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lco/bird/android/model/Feature;",
        "",
        "on",
        "",
        "(Ljava/lang/String;IZ)V",
        "getOn",
        "()Z",
        "SCAN_TO_RELEASE",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/Feature;

.field public static final enum SCAN_TO_RELEASE:Lco/bird/android/model/Feature;


# instance fields
.field private final on:Z


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/Feature;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lco/bird/android/model/Feature;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/Feature;->SCAN_TO_RELEASE:Lco/bird/android/model/Feature;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/model/Feature;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "SCAN_TO_RELEASE"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lco/bird/android/model/Feature;->SCAN_TO_RELEASE:Lco/bird/android/model/Feature;

    invoke-static {}, Lco/bird/android/model/Feature;->$values()[Lco/bird/android/model/Feature;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/Feature;->$VALUES:[Lco/bird/android/model/Feature;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lco/bird/android/model/Feature;->on:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/Feature;
    .locals 1

    const-class v0, Lco/bird/android/model/Feature;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/Feature;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/Feature;
    .locals 1

    sget-object v0, Lco/bird/android/model/Feature;->$VALUES:[Lco/bird/android/model/Feature;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/Feature;

    return-object v0
.end method


# virtual methods
.method public final getOn()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/Feature;->on:Z

    return v0
.end method
