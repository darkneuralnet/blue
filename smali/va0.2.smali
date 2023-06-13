.class public final enum Lva0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lva0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lva0;

.field public static final enum c:Lva0;

.field public static final enum d:Lva0;

.field public static final enum e:Lva0;

.field public static final enum f:Lva0;

.field public static final synthetic g:[Lva0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lva0;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lva0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lva0;->b:Lva0;

    new-instance v0, Lva0;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lva0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lva0;->c:Lva0;

    new-instance v0, Lva0;

    const-string v1, "METERING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lva0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lva0;->d:Lva0;

    new-instance v0, Lva0;

    const-string v1, "CONVERGED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lva0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lva0;->e:Lva0;

    new-instance v0, Lva0;

    const-string v1, "LOCKED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lva0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lva0;->f:Lva0;

    invoke-static {}, Lva0;->a()[Lva0;

    move-result-object v0

    sput-object v0, Lva0;->g:[Lva0;

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

.method public static synthetic a()[Lva0;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lva0;

    const/4 v1, 0x0

    sget-object v2, Lva0;->b:Lva0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lva0;->c:Lva0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lva0;->d:Lva0;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lva0;->e:Lva0;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lva0;->f:Lva0;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lva0;
    .locals 1

    const-class v0, Lva0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lva0;

    return-object p0
.end method

.method public static values()[Lva0;
    .locals 1

    sget-object v0, Lva0;->g:[Lva0;

    invoke-virtual {v0}, [Lva0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lva0;

    return-object v0
.end method
