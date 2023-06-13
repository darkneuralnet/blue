.class public final enum LC36;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LC36;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LC36;

.field public static final enum c:LC36;

.field public static final synthetic d:[LC36;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LC36;

    const-string v1, "LOW_POWER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LC36;-><init>(Ljava/lang/String;I)V

    sput-object v0, LC36;->b:LC36;

    new-instance v1, LC36;

    const-string v3, "HIGH_SPEED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LC36;-><init>(Ljava/lang/String;I)V

    sput-object v1, LC36;->c:LC36;

    const/4 v3, 0x2

    new-array v3, v3, [LC36;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, LC36;->d:[LC36;

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

.method public static valueOf(Ljava/lang/String;)LC36;
    .locals 1

    const-class v0, LC36;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LC36;

    return-object p0
.end method

.method public static values()[LC36;
    .locals 1

    sget-object v0, LC36;->d:[LC36;

    invoke-virtual {v0}, [LC36;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LC36;

    return-object v0
.end method
