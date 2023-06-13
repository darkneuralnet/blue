.class public final enum LnV0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LnV0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LnV0;

.field public static final enum c:LnV0;

.field public static final d:LnV0;

.field public static final synthetic e:[LnV0;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LnV0;

    const-string v1, "PREFER_ARGB_8888"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LnV0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LnV0;->b:LnV0;

    new-instance v1, LnV0;

    const-string v3, "PREFER_RGB_565"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LnV0;-><init>(Ljava/lang/String;I)V

    sput-object v1, LnV0;->c:LnV0;

    const/4 v3, 0x2

    new-array v3, v3, [LnV0;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, LnV0;->e:[LnV0;

    sput-object v0, LnV0;->d:LnV0;

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

.method public static valueOf(Ljava/lang/String;)LnV0;
    .locals 1

    const-class v0, LnV0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LnV0;

    return-object p0
.end method

.method public static values()[LnV0;
    .locals 1

    sget-object v0, LnV0;->e:[LnV0;

    invoke-virtual {v0}, [LnV0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LnV0;

    return-object v0
.end method
