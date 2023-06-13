.class public final enum LPP2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LPP2;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LPP2;

.field public static final enum d:LPP2;

.field public static final enum e:LPP2;

.field public static final synthetic f:[LPP2;


# instance fields
.field public final b:F


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, LPP2;

    const/high16 v1, 0x3f000000    # 0.5f

    const-string v2, "LOW"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LPP2;-><init>(Ljava/lang/String;IF)V

    sput-object v0, LPP2;->c:LPP2;

    new-instance v1, LPP2;

    const/high16 v2, 0x3f800000    # 1.0f

    const-string v4, "NORMAL"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LPP2;-><init>(Ljava/lang/String;IF)V

    sput-object v1, LPP2;->d:LPP2;

    new-instance v2, LPP2;

    const/high16 v4, 0x3fc00000    # 1.5f

    const-string v6, "HIGH"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LPP2;-><init>(Ljava/lang/String;IF)V

    sput-object v2, LPP2;->e:LPP2;

    const/4 v4, 0x3

    new-array v4, v4, [LPP2;

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    aput-object v2, v4, v7

    sput-object v4, LPP2;->f:[LPP2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LPP2;->b:F

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LPP2;
    .locals 1

    const-class v0, LPP2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LPP2;

    return-object p0
.end method

.method public static values()[LPP2;
    .locals 1

    sget-object v0, LPP2;->f:[LPP2;

    invoke-virtual {v0}, [LPP2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LPP2;

    return-object v0
.end method
