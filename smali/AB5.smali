.class public final enum LAB5;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LAB5;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LAB5;

.field public static final enum c:LAB5;

.field public static final synthetic d:[LAB5;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LAB5;

    const-string v1, "CAMERA_SENSOR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LAB5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAB5;->b:LAB5;

    new-instance v0, LAB5;

    const-string v1, "ANDROID_VIEW"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LAB5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAB5;->c:LAB5;

    invoke-static {}, LAB5;->a()[LAB5;

    move-result-object v0

    sput-object v0, LAB5;->d:[LAB5;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[LAB5;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LAB5;

    const/4 v1, 0x0

    sget-object v2, LAB5;->b:LAB5;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LAB5;->c:LAB5;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LAB5;
    .locals 1

    const-class v0, LAB5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LAB5;

    return-object p0
.end method

.method public static values()[LAB5;
    .locals 1

    sget-object v0, LAB5;->d:[LAB5;

    invoke-virtual {v0}, [LAB5;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LAB5;

    return-object v0
.end method
