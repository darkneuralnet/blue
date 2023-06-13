.class public final enum Lco/bird/android/model/identification/IdentificationEntryMethod;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/identification/IdentificationEntryMethod$Companion;,
        Lco/bird/android/model/identification/IdentificationEntryMethod$Side;,
        Lco/bird/android/model/identification/IdentificationEntryMethod$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/identification/IdentificationEntryMethod;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0086\u0001\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000f\u0010B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u0006\u0010\u0006\u001a\u00020\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationEntryMethod;",
        "",
        "(Ljava/lang/String;I)V",
        "requiredSides",
        "",
        "Lco/bird/android/model/identification/IdentificationEntryMethod$Side;",
        "toWire",
        "",
        "LEGACY",
        "BARCODE_ONLY",
        "SCAN_FRONT",
        "SCAN_BACK",
        "SCAN_FRONT_AND_BACK",
        "MANUAL_ENTRY",
        "UNKNOWN",
        "Companion",
        "Side",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/identification/IdentificationEntryMethod;

.field public static final enum BARCODE_ONLY:Lco/bird/android/model/identification/IdentificationEntryMethod;

.field public static final Companion:Lco/bird/android/model/identification/IdentificationEntryMethod$Companion;

.field public static final enum LEGACY:Lco/bird/android/model/identification/IdentificationEntryMethod;

.field public static final enum MANUAL_ENTRY:Lco/bird/android/model/identification/IdentificationEntryMethod;

.field public static final enum SCAN_BACK:Lco/bird/android/model/identification/IdentificationEntryMethod;

.field public static final enum SCAN_FRONT:Lco/bird/android/model/identification/IdentificationEntryMethod;

.field public static final enum SCAN_FRONT_AND_BACK:Lco/bird/android/model/identification/IdentificationEntryMethod;

.field public static final enum UNKNOWN:Lco/bird/android/model/identification/IdentificationEntryMethod;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/identification/IdentificationEntryMethod;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lco/bird/android/model/identification/IdentificationEntryMethod;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/identification/IdentificationEntryMethod;->LEGACY:Lco/bird/android/model/identification/IdentificationEntryMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/identification/IdentificationEntryMethod;->BARCODE_ONLY:Lco/bird/android/model/identification/IdentificationEntryMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/identification/IdentificationEntryMethod;->SCAN_FRONT:Lco/bird/android/model/identification/IdentificationEntryMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/identification/IdentificationEntryMethod;->SCAN_BACK:Lco/bird/android/model/identification/IdentificationEntryMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/identification/IdentificationEntryMethod;->SCAN_FRONT_AND_BACK:Lco/bird/android/model/identification/IdentificationEntryMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/identification/IdentificationEntryMethod;->MANUAL_ENTRY:Lco/bird/android/model/identification/IdentificationEntryMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/identification/IdentificationEntryMethod;->UNKNOWN:Lco/bird/android/model/identification/IdentificationEntryMethod;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/identification/IdentificationEntryMethod;

    const-string v1, "LEGACY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationEntryMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationEntryMethod;->LEGACY:Lco/bird/android/model/identification/IdentificationEntryMethod;

    new-instance v0, Lco/bird/android/model/identification/IdentificationEntryMethod;

    const-string v1, "BARCODE_ONLY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationEntryMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationEntryMethod;->BARCODE_ONLY:Lco/bird/android/model/identification/IdentificationEntryMethod;

    new-instance v0, Lco/bird/android/model/identification/IdentificationEntryMethod;

    const-string v1, "SCAN_FRONT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationEntryMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationEntryMethod;->SCAN_FRONT:Lco/bird/android/model/identification/IdentificationEntryMethod;

    new-instance v0, Lco/bird/android/model/identification/IdentificationEntryMethod;

    const-string v1, "SCAN_BACK"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationEntryMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationEntryMethod;->SCAN_BACK:Lco/bird/android/model/identification/IdentificationEntryMethod;

    new-instance v0, Lco/bird/android/model/identification/IdentificationEntryMethod;

    const-string v1, "SCAN_FRONT_AND_BACK"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationEntryMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationEntryMethod;->SCAN_FRONT_AND_BACK:Lco/bird/android/model/identification/IdentificationEntryMethod;

    new-instance v0, Lco/bird/android/model/identification/IdentificationEntryMethod;

    const-string v1, "MANUAL_ENTRY"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationEntryMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationEntryMethod;->MANUAL_ENTRY:Lco/bird/android/model/identification/IdentificationEntryMethod;

    new-instance v0, Lco/bird/android/model/identification/IdentificationEntryMethod;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationEntryMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationEntryMethod;->UNKNOWN:Lco/bird/android/model/identification/IdentificationEntryMethod;

    invoke-static {}, Lco/bird/android/model/identification/IdentificationEntryMethod;->$values()[Lco/bird/android/model/identification/IdentificationEntryMethod;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/identification/IdentificationEntryMethod;->$VALUES:[Lco/bird/android/model/identification/IdentificationEntryMethod;

    new-instance v0, Lco/bird/android/model/identification/IdentificationEntryMethod$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/identification/IdentificationEntryMethod$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationEntryMethod;->Companion:Lco/bird/android/model/identification/IdentificationEntryMethod$Companion;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/identification/IdentificationEntryMethod;
    .locals 1

    const-class v0, Lco/bird/android/model/identification/IdentificationEntryMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/identification/IdentificationEntryMethod;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/identification/IdentificationEntryMethod;
    .locals 1

    sget-object v0, Lco/bird/android/model/identification/IdentificationEntryMethod;->$VALUES:[Lco/bird/android/model/identification/IdentificationEntryMethod;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/identification/IdentificationEntryMethod;

    return-object v0
.end method


# virtual methods
.method public final requiredSides()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationEntryMethod$Side;",
            ">;"
        }
    .end annotation

    sget-object v0, Lco/bird/android/model/identification/IdentificationEntryMethod$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/model/identification/IdentificationEntryMethod$Side;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/identification/IdentificationEntryMethod$Side;->FRONT:Lco/bird/android/model/identification/IdentificationEntryMethod$Side;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/identification/IdentificationEntryMethod$Side;->BACK:Lco/bird/android/model/identification/IdentificationEntryMethod$Side;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    sget-object v0, Lco/bird/android/model/identification/IdentificationEntryMethod$Side;->BACK:Lco/bird/android/model/identification/IdentificationEntryMethod$Side;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    sget-object v0, Lco/bird/android/model/identification/IdentificationEntryMethod$Side;->FRONT:Lco/bird/android/model/identification/IdentificationEntryMethod$Side;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final toWire()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "getDefault()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
