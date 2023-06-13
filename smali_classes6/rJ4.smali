.class public final enum LrJ4;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LrJ4;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LrJ4;

.field public static final enum c:LrJ4;

.field public static final enum d:LrJ4;

.field public static final synthetic e:[LrJ4;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LrJ4;

    const-string v1, "REQUIRED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LrJ4;-><init>(Ljava/lang/String;I)V

    sput-object v0, LrJ4;->b:LrJ4;

    new-instance v1, LrJ4;

    const-string v3, "RECOMMENDED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LrJ4;-><init>(Ljava/lang/String;I)V

    sput-object v1, LrJ4;->c:LrJ4;

    new-instance v3, LrJ4;

    const-string v5, "OPTIONAL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LrJ4;-><init>(Ljava/lang/String;I)V

    sput-object v3, LrJ4;->d:LrJ4;

    const/4 v5, 0x3

    new-array v5, v5, [LrJ4;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, LrJ4;->e:[LrJ4;

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

.method public static valueOf(Ljava/lang/String;)LrJ4;
    .locals 1

    const-class v0, LrJ4;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LrJ4;

    return-object p0
.end method

.method public static values()[LrJ4;
    .locals 1

    sget-object v0, LrJ4;->e:[LrJ4;

    invoke-virtual {v0}, [LrJ4;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LrJ4;

    return-object v0
.end method
