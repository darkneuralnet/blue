.class public final enum Lco/bird/android/model/Folder;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/Folder$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/Folder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u0000 \u00182\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/android/model/Folder;",
        "",
        "uploadKind",
        "Lco/bird/android/model/constant/UploadKind;",
        "contentKind",
        "Lco/bird/android/model/constant/ContentKind;",
        "(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;)V",
        "getContentKind",
        "()Lco/bird/android/model/constant/ContentKind;",
        "getUploadKind",
        "()Lco/bird/android/model/constant/UploadKind;",
        "path",
        "",
        "PHOTOS",
        "ID_CARDS",
        "NEST_PHOTOS",
        "DROP_PHOTOS",
        "RIDE_PHOTOS",
        "HELMET_SELFIES",
        "INSPECTION_PHOTOS",
        "REPAIR_PHOTOS",
        "COMPLAINT_PHOTOS",
        "LOCK_ISSUE_PHOTOS",
        "TRANSFER_ORDERS_BOL_PHOTOS",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/Folder;

.field public static final enum COMPLAINT_PHOTOS:Lco/bird/android/model/Folder;

.field public static final Companion:Lco/bird/android/model/Folder$Companion;

.field public static final enum DROP_PHOTOS:Lco/bird/android/model/Folder;

.field public static final enum HELMET_SELFIES:Lco/bird/android/model/Folder;

.field public static final enum ID_CARDS:Lco/bird/android/model/Folder;

.field public static final enum INSPECTION_PHOTOS:Lco/bird/android/model/Folder;

.field public static final enum LOCK_ISSUE_PHOTOS:Lco/bird/android/model/Folder;

.field public static final enum NEST_PHOTOS:Lco/bird/android/model/Folder;

.field public static final enum PHOTOS:Lco/bird/android/model/Folder;

.field public static final enum REPAIR_PHOTOS:Lco/bird/android/model/Folder;

.field public static final enum RIDE_PHOTOS:Lco/bird/android/model/Folder;

.field public static final enum TRANSFER_ORDERS_BOL_PHOTOS:Lco/bird/android/model/Folder;


# instance fields
.field private final contentKind:Lco/bird/android/model/constant/ContentKind;

.field private final uploadKind:Lco/bird/android/model/constant/UploadKind;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/Folder;
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Lco/bird/android/model/Folder;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/Folder;->PHOTOS:Lco/bird/android/model/Folder;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/Folder;->ID_CARDS:Lco/bird/android/model/Folder;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/Folder;->NEST_PHOTOS:Lco/bird/android/model/Folder;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/Folder;->DROP_PHOTOS:Lco/bird/android/model/Folder;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/Folder;->RIDE_PHOTOS:Lco/bird/android/model/Folder;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/Folder;->HELMET_SELFIES:Lco/bird/android/model/Folder;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/Folder;->INSPECTION_PHOTOS:Lco/bird/android/model/Folder;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/Folder;->REPAIR_PHOTOS:Lco/bird/android/model/Folder;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/Folder;->COMPLAINT_PHOTOS:Lco/bird/android/model/Folder;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/Folder;->LOCK_ISSUE_PHOTOS:Lco/bird/android/model/Folder;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/Folder;->TRANSFER_ORDERS_BOL_PHOTOS:Lco/bird/android/model/Folder;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 15

    new-instance v7, Lco/bird/android/model/Folder;

    const-string v1, "PHOTOS"

    const/4 v2, 0x0

    sget-object v3, Lco/bird/android/model/constant/UploadKind;->USER_PHOTOS:Lco/bird/android/model/constant/UploadKind;

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/Folder;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lco/bird/android/model/Folder;->PHOTOS:Lco/bird/android/model/Folder;

    new-instance v0, Lco/bird/android/model/Folder;

    const-string v9, "ID_CARDS"

    const/4 v10, 0x1

    sget-object v11, Lco/bird/android/model/constant/UploadKind;->ID_CARDS:Lco/bird/android/model/constant/UploadKind;

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v14, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/Folder;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Folder;->ID_CARDS:Lco/bird/android/model/Folder;

    new-instance v0, Lco/bird/android/model/Folder;

    const-string v2, "NEST_PHOTOS"

    const/4 v3, 0x2

    sget-object v4, Lco/bird/android/model/constant/UploadKind;->NEST_PHOTOS:Lco/bird/android/model/constant/UploadKind;

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/Folder;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Folder;->NEST_PHOTOS:Lco/bird/android/model/Folder;

    new-instance v0, Lco/bird/android/model/Folder;

    const-string v9, "DROP_PHOTOS"

    const/4 v10, 0x3

    sget-object v11, Lco/bird/android/model/constant/UploadKind;->DROP_PHOTOS:Lco/bird/android/model/constant/UploadKind;

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/Folder;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Folder;->DROP_PHOTOS:Lco/bird/android/model/Folder;

    new-instance v0, Lco/bird/android/model/Folder;

    const-string v2, "RIDE_PHOTOS"

    const/4 v3, 0x4

    sget-object v4, Lco/bird/android/model/constant/UploadKind;->RIDE_PHOTOS:Lco/bird/android/model/constant/UploadKind;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/Folder;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Folder;->RIDE_PHOTOS:Lco/bird/android/model/Folder;

    new-instance v0, Lco/bird/android/model/Folder;

    const-string v9, "HELMET_SELFIES"

    const/4 v10, 0x5

    sget-object v11, Lco/bird/android/model/constant/UploadKind;->HELMET_SELFIES:Lco/bird/android/model/constant/UploadKind;

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/Folder;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Folder;->HELMET_SELFIES:Lco/bird/android/model/Folder;

    new-instance v0, Lco/bird/android/model/Folder;

    const-string v2, "INSPECTION_PHOTOS"

    const/4 v3, 0x6

    sget-object v4, Lco/bird/android/model/constant/UploadKind;->INSPECTION_PHOTOS:Lco/bird/android/model/constant/UploadKind;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/Folder;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Folder;->INSPECTION_PHOTOS:Lco/bird/android/model/Folder;

    new-instance v0, Lco/bird/android/model/Folder;

    const-string v9, "REPAIR_PHOTOS"

    const/4 v10, 0x7

    sget-object v11, Lco/bird/android/model/constant/UploadKind;->REPAIR_PHOTOS:Lco/bird/android/model/constant/UploadKind;

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/Folder;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Folder;->REPAIR_PHOTOS:Lco/bird/android/model/Folder;

    new-instance v0, Lco/bird/android/model/Folder;

    const-string v2, "COMPLAINT_PHOTOS"

    const/16 v3, 0x8

    sget-object v4, Lco/bird/android/model/constant/UploadKind;->COMPLAINT_MODE:Lco/bird/android/model/constant/UploadKind;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/Folder;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Folder;->COMPLAINT_PHOTOS:Lco/bird/android/model/Folder;

    new-instance v0, Lco/bird/android/model/Folder;

    const-string v9, "LOCK_ISSUE_PHOTOS"

    const/16 v10, 0x9

    sget-object v11, Lco/bird/android/model/constant/UploadKind;->LOCK_ISSUE_PHOTOS:Lco/bird/android/model/constant/UploadKind;

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/Folder;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Folder;->LOCK_ISSUE_PHOTOS:Lco/bird/android/model/Folder;

    new-instance v0, Lco/bird/android/model/Folder;

    const-string v2, "TRANSFER_ORDERS_BOL_PHOTOS"

    const/16 v3, 0xa

    sget-object v4, Lco/bird/android/model/constant/UploadKind;->TRANSFER_ORDER_BOL_PHOTOS:Lco/bird/android/model/constant/UploadKind;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/Folder;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Folder;->TRANSFER_ORDERS_BOL_PHOTOS:Lco/bird/android/model/Folder;

    invoke-static {}, Lco/bird/android/model/Folder;->$values()[Lco/bird/android/model/Folder;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/Folder;->$VALUES:[Lco/bird/android/model/Folder;

    new-instance v0, Lco/bird/android/model/Folder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/Folder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Folder;->Companion:Lco/bird/android/model/Folder$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/UploadKind;",
            "Lco/bird/android/model/constant/ContentKind;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lco/bird/android/model/Folder;->uploadKind:Lco/bird/android/model/constant/UploadKind;

    iput-object p4, p0, Lco/bird/android/model/Folder;->contentKind:Lco/bird/android/model/constant/ContentKind;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    sget-object p4, Lco/bird/android/model/constant/ContentKind;->JPG:Lco/bird/android/model/constant/ContentKind;

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/Folder;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/Folder;
    .locals 1

    const-class v0, Lco/bird/android/model/Folder;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/Folder;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/Folder;
    .locals 1

    sget-object v0, Lco/bird/android/model/Folder;->$VALUES:[Lco/bird/android/model/Folder;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/Folder;

    return-object v0
.end method


# virtual methods
.method public final getContentKind()Lco/bird/android/model/constant/ContentKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Folder;->contentKind:Lco/bird/android/model/constant/ContentKind;

    return-object v0
.end method

.method public final getUploadKind()Lco/bird/android/model/constant/UploadKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Folder;->uploadKind:Lco/bird/android/model/constant/UploadKind;

    return-object v0
.end method

.method public final path()Ljava/lang/String;
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v0, "this as java.lang.String).toLowerCase()"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "_"

    const-string v3, "-"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
