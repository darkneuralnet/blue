.class public final enum Lco/bird/android/model/constant/VehicleHibernationCategory;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/VehicleHibernationCategory;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/model/constant/VehicleHibernationCategory;",
        "",
        "(Ljava/lang/String;I)V",
        "isFailed",
        "",
        "()Z",
        "HIBERNATED",
        "PENDING",
        "NOT_HIBERNATED",
        "FAILED",
        "UNKNOWN",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/VehicleHibernationCategory;

.field public static final enum FAILED:Lco/bird/android/model/constant/VehicleHibernationCategory;

.field public static final enum HIBERNATED:Lco/bird/android/model/constant/VehicleHibernationCategory;

.field public static final enum NOT_HIBERNATED:Lco/bird/android/model/constant/VehicleHibernationCategory;

.field public static final enum PENDING:Lco/bird/android/model/constant/VehicleHibernationCategory;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/VehicleHibernationCategory;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/VehicleHibernationCategory;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lco/bird/android/model/constant/VehicleHibernationCategory;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/VehicleHibernationCategory;->HIBERNATED:Lco/bird/android/model/constant/VehicleHibernationCategory;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/VehicleHibernationCategory;->PENDING:Lco/bird/android/model/constant/VehicleHibernationCategory;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/VehicleHibernationCategory;->NOT_HIBERNATED:Lco/bird/android/model/constant/VehicleHibernationCategory;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/VehicleHibernationCategory;->FAILED:Lco/bird/android/model/constant/VehicleHibernationCategory;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/VehicleHibernationCategory;->UNKNOWN:Lco/bird/android/model/constant/VehicleHibernationCategory;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/VehicleHibernationCategory;

    const-string v1, "HIBERNATED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/VehicleHibernationCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/VehicleHibernationCategory;->HIBERNATED:Lco/bird/android/model/constant/VehicleHibernationCategory;

    new-instance v0, Lco/bird/android/model/constant/VehicleHibernationCategory;

    const-string v1, "PENDING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/VehicleHibernationCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/VehicleHibernationCategory;->PENDING:Lco/bird/android/model/constant/VehicleHibernationCategory;

    new-instance v0, Lco/bird/android/model/constant/VehicleHibernationCategory;

    const-string v1, "NOT_HIBERNATED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/VehicleHibernationCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/VehicleHibernationCategory;->NOT_HIBERNATED:Lco/bird/android/model/constant/VehicleHibernationCategory;

    new-instance v0, Lco/bird/android/model/constant/VehicleHibernationCategory;

    const-string v1, "FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/VehicleHibernationCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/VehicleHibernationCategory;->FAILED:Lco/bird/android/model/constant/VehicleHibernationCategory;

    new-instance v0, Lco/bird/android/model/constant/VehicleHibernationCategory;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/VehicleHibernationCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/VehicleHibernationCategory;->UNKNOWN:Lco/bird/android/model/constant/VehicleHibernationCategory;

    invoke-static {}, Lco/bird/android/model/constant/VehicleHibernationCategory;->$values()[Lco/bird/android/model/constant/VehicleHibernationCategory;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/VehicleHibernationCategory;->$VALUES:[Lco/bird/android/model/constant/VehicleHibernationCategory;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/VehicleHibernationCategory;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/VehicleHibernationCategory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/VehicleHibernationCategory;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/VehicleHibernationCategory;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/VehicleHibernationCategory;->$VALUES:[Lco/bird/android/model/constant/VehicleHibernationCategory;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/VehicleHibernationCategory;

    return-object v0
.end method


# virtual methods
.method public final isFailed()Z
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/model/constant/VehicleHibernationCategory;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/VehicleHibernationCategory;->FAILED:Lco/bird/android/model/constant/VehicleHibernationCategory;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/VehicleHibernationCategory;->NOT_HIBERNATED:Lco/bird/android/model/constant/VehicleHibernationCategory;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
