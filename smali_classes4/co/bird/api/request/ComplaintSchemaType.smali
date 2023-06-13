.class public final enum Lco/bird/api/request/ComplaintSchemaType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/api/request/ComplaintSchemaType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lco/bird/api/request/ComplaintSchemaType;",
        "",
        "(Ljava/lang/String;I)V",
        "toString",
        "",
        "COMMUNITY",
        "co.bird.android.api"
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
.field private static final synthetic $VALUES:[Lco/bird/api/request/ComplaintSchemaType;

.field public static final enum COMMUNITY:Lco/bird/api/request/ComplaintSchemaType;


# direct methods
.method private static final synthetic $values()[Lco/bird/api/request/ComplaintSchemaType;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lco/bird/api/request/ComplaintSchemaType;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/api/request/ComplaintSchemaType;->COMMUNITY:Lco/bird/api/request/ComplaintSchemaType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/api/request/ComplaintSchemaType;

    const-string v1, "COMMUNITY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/api/request/ComplaintSchemaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/request/ComplaintSchemaType;->COMMUNITY:Lco/bird/api/request/ComplaintSchemaType;

    invoke-static {}, Lco/bird/api/request/ComplaintSchemaType;->$values()[Lco/bird/api/request/ComplaintSchemaType;

    move-result-object v0

    sput-object v0, Lco/bird/api/request/ComplaintSchemaType;->$VALUES:[Lco/bird/api/request/ComplaintSchemaType;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/api/request/ComplaintSchemaType;
    .locals 1

    const-class v0, Lco/bird/api/request/ComplaintSchemaType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/api/request/ComplaintSchemaType;

    return-object p0
.end method

.method public static values()[Lco/bird/api/request/ComplaintSchemaType;
    .locals 1

    sget-object v0, Lco/bird/api/request/ComplaintSchemaType;->$VALUES:[Lco/bird/api/request/ComplaintSchemaType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/api/request/ComplaintSchemaType;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
