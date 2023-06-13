.class public abstract enum Lco/bird/android/model/PlanItemDescription;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/PlanItemDescription$BEST_VALUE;,
        Lco/bird/android/model/PlanItemDescription$MOST_POPULAR;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/PlanItemDescription;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lco/bird/android/model/PlanItemDescription;",
        "",
        "(Ljava/lang/String;I)V",
        "text",
        "",
        "getText",
        "()I",
        "MOST_POPULAR",
        "BEST_VALUE",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/PlanItemDescription;

.field public static final enum BEST_VALUE:Lco/bird/android/model/PlanItemDescription;

.field public static final enum MOST_POPULAR:Lco/bird/android/model/PlanItemDescription;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/PlanItemDescription;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/model/PlanItemDescription;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/PlanItemDescription;->MOST_POPULAR:Lco/bird/android/model/PlanItemDescription;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/PlanItemDescription;->BEST_VALUE:Lco/bird/android/model/PlanItemDescription;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/PlanItemDescription$MOST_POPULAR;

    const-string v1, "MOST_POPULAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/PlanItemDescription$MOST_POPULAR;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/PlanItemDescription;->MOST_POPULAR:Lco/bird/android/model/PlanItemDescription;

    new-instance v0, Lco/bird/android/model/PlanItemDescription$BEST_VALUE;

    const-string v1, "BEST_VALUE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/PlanItemDescription$BEST_VALUE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/PlanItemDescription;->BEST_VALUE:Lco/bird/android/model/PlanItemDescription;

    invoke-static {}, Lco/bird/android/model/PlanItemDescription;->$values()[Lco/bird/android/model/PlanItemDescription;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/PlanItemDescription;->$VALUES:[Lco/bird/android/model/PlanItemDescription;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/PlanItemDescription;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/PlanItemDescription;
    .locals 1

    const-class v0, Lco/bird/android/model/PlanItemDescription;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/PlanItemDescription;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/PlanItemDescription;
    .locals 1

    sget-object v0, Lco/bird/android/model/PlanItemDescription;->$VALUES:[Lco/bird/android/model/PlanItemDescription;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/PlanItemDescription;

    return-object v0
.end method


# virtual methods
.method public abstract getText()I
.end method
