.class public final enum Lco/bird/android/model/ContractorLevel;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/ContractorLevel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/ContractorLevel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0086\u0001\u0018\u0000 \u00112\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B)\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\u0007\u0010\u0008R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\n\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/bird/android/model/ContractorLevel;",
        "",
        "roleLabel",
        "",
        "menuItemIcon",
        "roleIcon",
        "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V",
        "getMenuItemIcon",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getRoleIcon",
        "getRoleLabel",
        "()I",
        "FLEDGLING",
        "FLYER",
        "CHARGER",
        "SUPERCHARGER",
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


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/ContractorLevel;

.field public static final enum CHARGER:Lco/bird/android/model/ContractorLevel;

.field public static final Companion:Lco/bird/android/model/ContractorLevel$Companion;

.field public static final enum FLEDGLING:Lco/bird/android/model/ContractorLevel;

.field public static final enum FLYER:Lco/bird/android/model/ContractorLevel;

.field private static final SHOW_PROMOTION_LEVELS_IN_RIDER:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lco/bird/android/model/ContractorLevel;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum SUPERCHARGER:Lco/bird/android/model/ContractorLevel;


# instance fields
.field private final menuItemIcon:Ljava/lang/Integer;

.field private final roleIcon:Ljava/lang/Integer;

.field private final roleLabel:I


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/ContractorLevel;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lco/bird/android/model/ContractorLevel;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/ContractorLevel;->FLEDGLING:Lco/bird/android/model/ContractorLevel;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/ContractorLevel;->FLYER:Lco/bird/android/model/ContractorLevel;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/ContractorLevel;->CHARGER:Lco/bird/android/model/ContractorLevel;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/ContractorLevel;->SUPERCHARGER:Lco/bird/android/model/ContractorLevel;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 20

    new-instance v6, Lco/bird/android/model/ContractorLevel;

    const-string v1, "FLEDGLING"

    const/4 v2, 0x0

    sget v10, Lnl4;->flyer_level_1:I

    sget v13, Lrg4;->ic_menu_item_flyer:I

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v0, Lrg4;->ic_role_flyer:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object v0, v6

    move v3, v10

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/ContractorLevel;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V

    sput-object v6, Lco/bird/android/model/ContractorLevel;->FLEDGLING:Lco/bird/android/model/ContractorLevel;

    new-instance v0, Lco/bird/android/model/ContractorLevel;

    const-string v8, "FLYER"

    const/4 v9, 0x1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    sget v1, Lrg4;->ic_role_flyer_level_1:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lco/bird/android/model/ContractorLevel;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V

    sput-object v0, Lco/bird/android/model/ContractorLevel;->FLYER:Lco/bird/android/model/ContractorLevel;

    new-instance v1, Lco/bird/android/model/ContractorLevel;

    const-string v15, "CHARGER"

    const/16 v16, 0x2

    sget v17, Lnl4;->flyer_level_2:I

    sget v2, Lrg4;->ic_menu_item_flyer_level_two:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    sget v2, Lrg4;->ic_role_flyer_level_2:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    move-object v14, v1

    invoke-direct/range {v14 .. v19}, Lco/bird/android/model/ContractorLevel;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V

    sput-object v1, Lco/bird/android/model/ContractorLevel;->CHARGER:Lco/bird/android/model/ContractorLevel;

    new-instance v1, Lco/bird/android/model/ContractorLevel;

    const-string v8, "SUPERCHARGER"

    const/4 v9, 0x3

    sget v10, Lnl4;->flyer_level_3:I

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    sget v2, Lrg4;->ic_role_flyer_level_3:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, Lco/bird/android/model/ContractorLevel;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V

    sput-object v1, Lco/bird/android/model/ContractorLevel;->SUPERCHARGER:Lco/bird/android/model/ContractorLevel;

    invoke-static {}, Lco/bird/android/model/ContractorLevel;->$values()[Lco/bird/android/model/ContractorLevel;

    move-result-object v1

    sput-object v1, Lco/bird/android/model/ContractorLevel;->$VALUES:[Lco/bird/android/model/ContractorLevel;

    new-instance v1, Lco/bird/android/model/ContractorLevel$Companion;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lco/bird/android/model/ContractorLevel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lco/bird/android/model/ContractorLevel;->Companion:Lco/bird/android/model/ContractorLevel$Companion;

    const/4 v1, 0x2

    new-array v1, v1, [Lco/bird/android/model/ContractorLevel;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/ContractorLevel;->SHOW_PROMOTION_LEVELS_IN_RIDER:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lco/bird/android/model/ContractorLevel;->roleLabel:I

    iput-object p4, p0, Lco/bird/android/model/ContractorLevel;->menuItemIcon:Ljava/lang/Integer;

    iput-object p5, p0, Lco/bird/android/model/ContractorLevel;->roleIcon:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, p4

    :goto_0
    and-int/lit8 p4, p6, 0x4

    if-eqz p4, :cond_1

    move-object v6, v0

    goto :goto_1

    :cond_1
    move-object v6, p5

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/ContractorLevel;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public static final synthetic access$getSHOW_PROMOTION_LEVELS_IN_RIDER$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lco/bird/android/model/ContractorLevel;->SHOW_PROMOTION_LEVELS_IN_RIDER:Ljava/util/Set;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/ContractorLevel;
    .locals 1

    const-class v0, Lco/bird/android/model/ContractorLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/ContractorLevel;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/ContractorLevel;
    .locals 1

    sget-object v0, Lco/bird/android/model/ContractorLevel;->$VALUES:[Lco/bird/android/model/ContractorLevel;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/ContractorLevel;

    return-object v0
.end method


# virtual methods
.method public final getMenuItemIcon()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ContractorLevel;->menuItemIcon:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRoleIcon()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ContractorLevel;->roleIcon:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRoleLabel()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/ContractorLevel;->roleLabel:I

    return v0
.end method
