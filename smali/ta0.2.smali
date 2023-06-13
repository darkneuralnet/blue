.class public final enum Lta0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lta0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lta0;

.field public static final enum c:Lta0;

.field public static final enum d:Lta0;

.field public static final enum e:Lta0;

.field public static final synthetic f:[Lta0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lta0;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lta0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lta0;->b:Lta0;

    new-instance v0, Lta0;

    const-string v1, "OFF"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lta0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lta0;->c:Lta0;

    new-instance v0, Lta0;

    const-string v1, "ON_MANUAL_AUTO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lta0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lta0;->d:Lta0;

    new-instance v0, Lta0;

    const-string v1, "ON_CONTINUOUS_AUTO"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lta0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lta0;->e:Lta0;

    invoke-static {}, Lta0;->a()[Lta0;

    move-result-object v0

    sput-object v0, Lta0;->f:[Lta0;

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

.method public static synthetic a()[Lta0;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lta0;

    const/4 v1, 0x0

    sget-object v2, Lta0;->b:Lta0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lta0;->c:Lta0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lta0;->d:Lta0;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lta0;->e:Lta0;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lta0;
    .locals 1

    const-class v0, Lta0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lta0;

    return-object p0
.end method

.method public static values()[Lta0;
    .locals 1

    sget-object v0, Lta0;->f:[Lta0;

    invoke-virtual {v0}, [Lta0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lta0;

    return-object v0
.end method
