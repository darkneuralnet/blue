.class public enum Lco/bird/android/model/Banner;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/Banner$CONNECTIVITY;,
        Lco/bird/android/model/Banner$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/Banner;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0086\u0001\u0018\u0000 \u00112\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0013\u0008\u0002\u0012\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0008\u001a\u00020\u0003H\u0017J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0017\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0017\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u000b\u001a\u00020\u0003H\u0017R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/bird/android/model/Banner;",
        "",
        "text",
        "",
        "(Ljava/lang/String;ILjava/lang/Integer;)V",
        "getText",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "backgroundColor",
        "customView",
        "icon",
        "textColor",
        "HOW_TO_RIDE",
        "PERSONAL_RENTALS",
        "CONNECTIVITY",
        "DEAL",
        "NONE",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/Banner;

.field public static final enum CONNECTIVITY:Lco/bird/android/model/Banner;

.field public static final Companion:Lco/bird/android/model/Banner$Companion;

.field public static final enum DEAL:Lco/bird/android/model/Banner;

.field public static final enum HOW_TO_RIDE:Lco/bird/android/model/Banner;

.field public static final enum NONE:Lco/bird/android/model/Banner;

.field public static final enum PERSONAL_RENTALS:Lco/bird/android/model/Banner;


# instance fields
.field private final text:Ljava/lang/Integer;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/Banner;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lco/bird/android/model/Banner;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/Banner;->HOW_TO_RIDE:Lco/bird/android/model/Banner;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/Banner;->PERSONAL_RENTALS:Lco/bird/android/model/Banner;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/Banner;->CONNECTIVITY:Lco/bird/android/model/Banner;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/Banner;->DEAL:Lco/bird/android/model/Banner;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/Banner;->NONE:Lco/bird/android/model/Banner;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lco/bird/android/model/Banner;

    sget v1, Lnl4;->banner_how_to_ride:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "HOW_TO_RIDE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Banner;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lco/bird/android/model/Banner;->HOW_TO_RIDE:Lco/bird/android/model/Banner;

    new-instance v0, Lco/bird/android/model/Banner;

    sget v1, Lnl4;->long_term_rental_banner:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PERSONAL_RENTALS"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Banner;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lco/bird/android/model/Banner;->PERSONAL_RENTALS:Lco/bird/android/model/Banner;

    new-instance v0, Lco/bird/android/model/Banner$CONNECTIVITY;

    const-string v1, "CONNECTIVITY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/Banner$CONNECTIVITY;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/Banner;->CONNECTIVITY:Lco/bird/android/model/Banner;

    new-instance v0, Lco/bird/android/model/Banner;

    const-string v4, "DEAL"

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lco/bird/android/model/Banner;-><init>(Ljava/lang/String;ILjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Banner;->DEAL:Lco/bird/android/model/Banner;

    new-instance v0, Lco/bird/android/model/Banner;

    sget v1, Lol4;->empty:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "NONE"

    const/4 v3, 0x4

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Banner;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lco/bird/android/model/Banner;->NONE:Lco/bird/android/model/Banner;

    invoke-static {}, Lco/bird/android/model/Banner;->$values()[Lco/bird/android/model/Banner;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/Banner;->$VALUES:[Lco/bird/android/model/Banner;

    new-instance v0, Lco/bird/android/model/Banner$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/Banner$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Banner;->Companion:Lco/bird/android/model/Banner$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lco/bird/android/model/Banner;->text:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/Banner;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/Banner;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/Banner;
    .locals 1

    const-class v0, Lco/bird/android/model/Banner;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/Banner;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/Banner;
    .locals 1

    sget-object v0, Lco/bird/android/model/Banner;->$VALUES:[Lco/bird/android/model/Banner;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/Banner;

    return-object v0
.end method


# virtual methods
.method public backgroundColor()I
    .locals 1

    sget v0, LDf4;->colorAccent:I

    return v0
.end method

.method public customView()Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getText()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Banner;->text:Ljava/lang/Integer;

    return-object v0
.end method

.method public icon()Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public textColor()I
    .locals 1

    sget v0, LDf4;->white:I

    return v0
.end method
