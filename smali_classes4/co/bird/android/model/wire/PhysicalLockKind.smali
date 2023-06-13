.class public final enum Lco/bird/android/model/wire/PhysicalLockKind;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/wire/PhysicalLockKind$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/wire/PhysicalLockKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lco/bird/android/model/wire/PhysicalLockKind;",
        "",
        "(Ljava/lang/String;I)V",
        "isBrainLock",
        "",
        "()Z",
        "toString",
        "",
        "COMBINATION",
        "CARABINER",
        "SMARTLOCK_CABLE_NOKELOCK_BIRDV1",
        "SMARTLOCK_CABLE_OKLOCK_HELMET",
        "SMARTLOCK_OKAI_HELMET_CLIP",
        "EB100_CABLE_LOCK",
        "SMARTLOCK_SOLEBE_HELMET_CLIP",
        "model-wire_release"
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/wire/PhysicalLockKind;

.field public static final enum CARABINER:Lco/bird/android/model/wire/PhysicalLockKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "carabiner1"
    .end annotation

    .annotation runtime Lft5;
        value = "carabiner1"
    .end annotation
.end field

.field public static final enum COMBINATION:Lco/bird/android/model/wire/PhysicalLockKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "combination"
    .end annotation

    .annotation runtime Lft5;
        value = "combination"
    .end annotation
.end field

.field public static final enum EB100_CABLE_LOCK:Lco/bird/android/model/wire/PhysicalLockKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "eb100_cable_lock"
    .end annotation

    .annotation runtime Lft5;
        value = "eb100_cable_lock"
    .end annotation
.end field

.field public static final enum SMARTLOCK_CABLE_NOKELOCK_BIRDV1:Lco/bird/android/model/wire/PhysicalLockKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "smartlock_cable_nokelock_birdv1"
    .end annotation

    .annotation runtime Lft5;
        value = "smartlock_cable_nokelock_birdv1"
    .end annotation
.end field

.field public static final enum SMARTLOCK_CABLE_OKLOCK_HELMET:Lco/bird/android/model/wire/PhysicalLockKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "smartlock_cable_oklock_helmet"
    .end annotation

    .annotation runtime Lft5;
        value = "smartlock_cable_oklock_helmet"
    .end annotation
.end field

.field public static final enum SMARTLOCK_OKAI_HELMET_CLIP:Lco/bird/android/model/wire/PhysicalLockKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "smartlock_okai_helmet_clip"
    .end annotation

    .annotation runtime Lft5;
        value = "smartlock_okai_helmet_clip"
    .end annotation
.end field

.field public static final enum SMARTLOCK_SOLEBE_HELMET_CLIP:Lco/bird/android/model/wire/PhysicalLockKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "smartlock_solebe_helmet_clip"
    .end annotation

    .annotation runtime Lft5;
        value = "smartlock_solebe_helmet_clip"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/wire/PhysicalLockKind;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lco/bird/android/model/wire/PhysicalLockKind;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/wire/PhysicalLockKind;->COMBINATION:Lco/bird/android/model/wire/PhysicalLockKind;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/wire/PhysicalLockKind;->CARABINER:Lco/bird/android/model/wire/PhysicalLockKind;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/wire/PhysicalLockKind;->SMARTLOCK_CABLE_NOKELOCK_BIRDV1:Lco/bird/android/model/wire/PhysicalLockKind;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/wire/PhysicalLockKind;->SMARTLOCK_CABLE_OKLOCK_HELMET:Lco/bird/android/model/wire/PhysicalLockKind;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/wire/PhysicalLockKind;->SMARTLOCK_OKAI_HELMET_CLIP:Lco/bird/android/model/wire/PhysicalLockKind;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/wire/PhysicalLockKind;->EB100_CABLE_LOCK:Lco/bird/android/model/wire/PhysicalLockKind;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/wire/PhysicalLockKind;->SMARTLOCK_SOLEBE_HELMET_CLIP:Lco/bird/android/model/wire/PhysicalLockKind;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/wire/PhysicalLockKind;

    const-string v1, "COMBINATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/wire/PhysicalLockKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/wire/PhysicalLockKind;->COMBINATION:Lco/bird/android/model/wire/PhysicalLockKind;

    new-instance v0, Lco/bird/android/model/wire/PhysicalLockKind;

    const-string v1, "CARABINER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/wire/PhysicalLockKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/wire/PhysicalLockKind;->CARABINER:Lco/bird/android/model/wire/PhysicalLockKind;

    new-instance v0, Lco/bird/android/model/wire/PhysicalLockKind;

    const-string v1, "SMARTLOCK_CABLE_NOKELOCK_BIRDV1"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/wire/PhysicalLockKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/wire/PhysicalLockKind;->SMARTLOCK_CABLE_NOKELOCK_BIRDV1:Lco/bird/android/model/wire/PhysicalLockKind;

    new-instance v0, Lco/bird/android/model/wire/PhysicalLockKind;

    const-string v1, "SMARTLOCK_CABLE_OKLOCK_HELMET"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/wire/PhysicalLockKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/wire/PhysicalLockKind;->SMARTLOCK_CABLE_OKLOCK_HELMET:Lco/bird/android/model/wire/PhysicalLockKind;

    new-instance v0, Lco/bird/android/model/wire/PhysicalLockKind;

    const-string v1, "SMARTLOCK_OKAI_HELMET_CLIP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/wire/PhysicalLockKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/wire/PhysicalLockKind;->SMARTLOCK_OKAI_HELMET_CLIP:Lco/bird/android/model/wire/PhysicalLockKind;

    new-instance v0, Lco/bird/android/model/wire/PhysicalLockKind;

    const-string v1, "EB100_CABLE_LOCK"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/wire/PhysicalLockKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/wire/PhysicalLockKind;->EB100_CABLE_LOCK:Lco/bird/android/model/wire/PhysicalLockKind;

    new-instance v0, Lco/bird/android/model/wire/PhysicalLockKind;

    const-string v1, "SMARTLOCK_SOLEBE_HELMET_CLIP"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/wire/PhysicalLockKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/wire/PhysicalLockKind;->SMARTLOCK_SOLEBE_HELMET_CLIP:Lco/bird/android/model/wire/PhysicalLockKind;

    invoke-static {}, Lco/bird/android/model/wire/PhysicalLockKind;->$values()[Lco/bird/android/model/wire/PhysicalLockKind;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/wire/PhysicalLockKind;->$VALUES:[Lco/bird/android/model/wire/PhysicalLockKind;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/wire/PhysicalLockKind;
    .locals 1

    const-class v0, Lco/bird/android/model/wire/PhysicalLockKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/PhysicalLockKind;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/wire/PhysicalLockKind;
    .locals 1

    sget-object v0, Lco/bird/android/model/wire/PhysicalLockKind;->$VALUES:[Lco/bird/android/model/wire/PhysicalLockKind;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/wire/PhysicalLockKind;

    return-object v0
.end method


# virtual methods
.method public final isBrainLock()Z
    .locals 3

    sget-object v0, Lco/bird/android/model/wire/PhysicalLockKind$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v1, 0x0

    :cond_0
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
