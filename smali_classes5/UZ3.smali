.class public final enum LUZ3;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LUZ3;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LUZ3;

.field public static final enum c:LUZ3;

.field public static final synthetic d:[LUZ3;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LUZ3;

    const-string v1, "SRGB"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LUZ3;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUZ3;->b:LUZ3;

    new-instance v1, LUZ3;

    const-string v3, "DISPLAY_P3"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LUZ3;-><init>(Ljava/lang/String;I)V

    sput-object v1, LUZ3;->c:LUZ3;

    const/4 v3, 0x2

    new-array v3, v3, [LUZ3;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, LUZ3;->d:[LUZ3;

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

.method public static valueOf(Ljava/lang/String;)LUZ3;
    .locals 1

    const-class v0, LUZ3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUZ3;

    return-object p0
.end method

.method public static values()[LUZ3;
    .locals 1

    sget-object v0, LUZ3;->d:[LUZ3;

    invoke-virtual {v0}, [LUZ3;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUZ3;

    return-object v0
.end method
