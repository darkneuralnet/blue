.class public final enum Lco/bird/android/model/BountyOption;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/BountyOption$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/BountyOption;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0086\u0001\u0018\u0000 \u000c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000cB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lco/bird/android/model/BountyOption;",
        "",
        "value",
        "",
        "(Ljava/lang/String;II)V",
        "getValue",
        "()I",
        "CHARGE",
        "DAMAGED_CHARGE",
        "REBALANCE",
        "DAMAGED_TRANSPORT",
        "UNKNOWN",
        "Companion",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBountyOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyOption.kt\nco/bird/android/model/BountyOption\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,18:1\n8811#2,2:19\n9071#2,4:21\n*S KotlinDebug\n*F\n+ 1 BountyOption.kt\nco/bird/android/model/BountyOption\n*L\n13#1:19,2\n13#1:21,4\n*E\n"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/BountyOption;

.field public static final enum CHARGE:Lco/bird/android/model/BountyOption;

.field public static final Companion:Lco/bird/android/model/BountyOption$Companion;

.field public static final enum DAMAGED_CHARGE:Lco/bird/android/model/BountyOption;

.field public static final enum DAMAGED_TRANSPORT:Lco/bird/android/model/BountyOption;

.field public static final enum REBALANCE:Lco/bird/android/model/BountyOption;

.field public static final enum UNKNOWN:Lco/bird/android/model/BountyOption;

.field private static final map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lco/bird/android/model/BountyOption;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/BountyOption;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lco/bird/android/model/BountyOption;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/BountyOption;->CHARGE:Lco/bird/android/model/BountyOption;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/BountyOption;->DAMAGED_CHARGE:Lco/bird/android/model/BountyOption;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/BountyOption;->REBALANCE:Lco/bird/android/model/BountyOption;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/BountyOption;->DAMAGED_TRANSPORT:Lco/bird/android/model/BountyOption;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/BountyOption;->UNKNOWN:Lco/bird/android/model/BountyOption;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lco/bird/android/model/BountyOption;

    const-string v1, "CHARGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lco/bird/android/model/BountyOption;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/BountyOption;->CHARGE:Lco/bird/android/model/BountyOption;

    new-instance v0, Lco/bird/android/model/BountyOption;

    const-string v1, "DAMAGED_CHARGE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lco/bird/android/model/BountyOption;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/BountyOption;->DAMAGED_CHARGE:Lco/bird/android/model/BountyOption;

    new-instance v0, Lco/bird/android/model/BountyOption;

    const-string v1, "REBALANCE"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v3}, Lco/bird/android/model/BountyOption;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/BountyOption;->REBALANCE:Lco/bird/android/model/BountyOption;

    new-instance v0, Lco/bird/android/model/BountyOption;

    const-string v1, "DAMAGED_TRANSPORT"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v3}, Lco/bird/android/model/BountyOption;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/BountyOption;->DAMAGED_TRANSPORT:Lco/bird/android/model/BountyOption;

    new-instance v0, Lco/bird/android/model/BountyOption;

    const-string v1, "UNKNOWN"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v3}, Lco/bird/android/model/BountyOption;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/BountyOption;->UNKNOWN:Lco/bird/android/model/BountyOption;

    invoke-static {}, Lco/bird/android/model/BountyOption;->$values()[Lco/bird/android/model/BountyOption;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/BountyOption;->$VALUES:[Lco/bird/android/model/BountyOption;

    new-instance v0, Lco/bird/android/model/BountyOption$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/BountyOption$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/BountyOption;->Companion:Lco/bird/android/model/BountyOption$Companion;

    invoke-static {}, Lco/bird/android/model/BountyOption;->values()[Lco/bird/android/model/BountyOption;

    move-result-object v0

    array-length v1, v0

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v1

    const/16 v3, 0x10

    invoke-static {v1, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    iget v5, v4, Lco/bird/android/model/BountyOption;->value:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sput-object v3, Lco/bird/android/model/BountyOption;->map:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lco/bird/android/model/BountyOption;->value:I

    return-void
.end method

.method public static final synthetic access$getMap$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lco/bird/android/model/BountyOption;->map:Ljava/util/Map;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/BountyOption;
    .locals 1

    const-class v0, Lco/bird/android/model/BountyOption;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/BountyOption;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/BountyOption;
    .locals 1

    sget-object v0, Lco/bird/android/model/BountyOption;->$VALUES:[Lco/bird/android/model/BountyOption;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/BountyOption;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/BountyOption;->value:I

    return v0
.end method
