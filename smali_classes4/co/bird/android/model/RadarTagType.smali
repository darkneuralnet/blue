.class public final enum Lco/bird/android/model/RadarTagType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/RadarTagType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0007j\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/model/RadarTagType;",
        "",
        "label",
        "",
        "descriptionHint",
        "(Ljava/lang/String;III)V",
        "getDescriptionHint",
        "()I",
        "getLabel",
        "toString",
        "",
        "EU",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/RadarTagType;

.field public static final enum EU:Lco/bird/android/model/RadarTagType;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "EU"
    .end annotation

    .annotation runtime Lft5;
        value = "EU"
    .end annotation
.end field


# instance fields
.field private final descriptionHint:I

.field private final label:I


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/RadarTagType;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lco/bird/android/model/RadarTagType;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/RadarTagType;->EU:Lco/bird/android/model/RadarTagType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lco/bird/android/model/RadarTagType;

    sget v1, Lnl4;->radar_tag_type_eu_label:I

    sget v2, Lnl4;->radar_tag_type_eu_description_hint:I

    const-string v3, "EU"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lco/bird/android/model/RadarTagType;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lco/bird/android/model/RadarTagType;->EU:Lco/bird/android/model/RadarTagType;

    invoke-static {}, Lco/bird/android/model/RadarTagType;->$values()[Lco/bird/android/model/RadarTagType;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/RadarTagType;->$VALUES:[Lco/bird/android/model/RadarTagType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lco/bird/android/model/RadarTagType;->label:I

    iput p4, p0, Lco/bird/android/model/RadarTagType;->descriptionHint:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/RadarTagType;
    .locals 1

    const-class v0, Lco/bird/android/model/RadarTagType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/RadarTagType;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/RadarTagType;
    .locals 1

    sget-object v0, Lco/bird/android/model/RadarTagType;->$VALUES:[Lco/bird/android/model/RadarTagType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/RadarTagType;

    return-object v0
.end method


# virtual methods
.method public final getDescriptionHint()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/RadarTagType;->descriptionHint:I

    return v0
.end method

.method public final getLabel()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/RadarTagType;->label:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toUpperCase()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
