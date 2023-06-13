.class public final enum LO79;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LO79;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LO79;

.field public static final enum c:LO79;

.field public static final enum d:LO79;

.field public static final synthetic e:[LO79;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LO79;

    const-string v1, "NOT_RUN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LO79;-><init>(Ljava/lang/String;I)V

    sput-object v0, LO79;->b:LO79;

    new-instance v1, LO79;

    const-string v3, "CANCELLED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LO79;-><init>(Ljava/lang/String;I)V

    sput-object v1, LO79;->c:LO79;

    new-instance v3, LO79;

    const-string v5, "STARTED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LO79;-><init>(Ljava/lang/String;I)V

    sput-object v3, LO79;->d:LO79;

    const/4 v5, 0x3

    new-array v5, v5, [LO79;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, LO79;->e:[LO79;

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

.method public static values()[LO79;
    .locals 1

    sget-object v0, LO79;->e:[LO79;

    invoke-virtual {v0}, [LO79;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LO79;

    return-object v0
.end method
