.class public final enum Lco/bird/android/model/constant/MapMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/constant/MapMode$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/MapMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lco/bird/android/model/constant/MapMode;",
        "",
        "(Ljava/lang/String;I)V",
        "toDefaultUserRole",
        "Lco/bird/android/model/constant/UserRole;",
        "toScanMode",
        "Lco/bird/android/model/constant/ScanMode;",
        "toString",
        "",
        "RIDER",
        "CHARGER",
        "OPERATOR",
        "MERCHANT",
        "SERVICE_CENTER",
        "model-constant"
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/MapMode;

.field public static final enum CHARGER:Lco/bird/android/model/constant/MapMode;

.field public static final enum MERCHANT:Lco/bird/android/model/constant/MapMode;

.field public static final enum OPERATOR:Lco/bird/android/model/constant/MapMode;

.field public static final enum RIDER:Lco/bird/android/model/constant/MapMode;

.field public static final enum SERVICE_CENTER:Lco/bird/android/model/constant/MapMode;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/MapMode;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lco/bird/android/model/constant/MapMode;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/MapMode;->CHARGER:Lco/bird/android/model/constant/MapMode;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/MapMode;->OPERATOR:Lco/bird/android/model/constant/MapMode;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/MapMode;->MERCHANT:Lco/bird/android/model/constant/MapMode;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/MapMode;->SERVICE_CENTER:Lco/bird/android/model/constant/MapMode;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/MapMode;

    const-string v1, "RIDER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/MapMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    new-instance v0, Lco/bird/android/model/constant/MapMode;

    const-string v1, "CHARGER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/MapMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/MapMode;->CHARGER:Lco/bird/android/model/constant/MapMode;

    new-instance v0, Lco/bird/android/model/constant/MapMode;

    const-string v1, "OPERATOR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/MapMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/MapMode;->OPERATOR:Lco/bird/android/model/constant/MapMode;

    new-instance v0, Lco/bird/android/model/constant/MapMode;

    const-string v1, "MERCHANT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/MapMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/MapMode;->MERCHANT:Lco/bird/android/model/constant/MapMode;

    new-instance v0, Lco/bird/android/model/constant/MapMode;

    const-string v1, "SERVICE_CENTER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/MapMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/MapMode;->SERVICE_CENTER:Lco/bird/android/model/constant/MapMode;

    invoke-static {}, Lco/bird/android/model/constant/MapMode;->$values()[Lco/bird/android/model/constant/MapMode;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/MapMode;->$VALUES:[Lco/bird/android/model/constant/MapMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/MapMode;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/MapMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/MapMode;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/MapMode;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/MapMode;->$VALUES:[Lco/bird/android/model/constant/MapMode;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/MapMode;

    return-object v0
.end method


# virtual methods
.method public final toDefaultUserRole()Lco/bird/android/model/constant/UserRole;
    .locals 2

    sget-object v0, Lco/bird/android/model/constant/MapMode$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget-object v0, Lco/bird/android/model/constant/UserRole;->MERCHANT:Lco/bird/android/model/constant/UserRole;

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Lco/bird/android/model/constant/UserRole;->OPERATOR:Lco/bird/android/model/constant/UserRole;

    goto :goto_0

    :cond_2
    sget-object v0, Lco/bird/android/model/constant/UserRole;->OPERATOR:Lco/bird/android/model/constant/UserRole;

    goto :goto_0

    :cond_3
    sget-object v0, Lco/bird/android/model/constant/UserRole;->RIDER:Lco/bird/android/model/constant/UserRole;

    goto :goto_0

    :cond_4
    sget-object v0, Lco/bird/android/model/constant/UserRole;->RIDER:Lco/bird/android/model/constant/UserRole;

    :goto_0
    return-object v0
.end method

.method public final toScanMode()Lco/bird/android/model/constant/ScanMode;
    .locals 2

    sget-object v0, Lco/bird/android/model/constant/MapMode$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget-object v0, Lco/bird/android/model/constant/ScanMode;->RIDER:Lco/bird/android/model/constant/ScanMode;

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Lco/bird/android/model/constant/ScanMode;->SERVICE_CENTER:Lco/bird/android/model/constant/ScanMode;

    goto :goto_0

    :cond_2
    sget-object v0, Lco/bird/android/model/constant/ScanMode;->WATCHER:Lco/bird/android/model/constant/ScanMode;

    goto :goto_0

    :cond_3
    sget-object v0, Lco/bird/android/model/constant/ScanMode;->RIDER:Lco/bird/android/model/constant/ScanMode;

    goto :goto_0

    :cond_4
    sget-object v0, Lco/bird/android/model/constant/ScanMode;->RIDER:Lco/bird/android/model/constant/ScanMode;

    :goto_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "US"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
