.class public final enum Lwa0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwa0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lwa0;

.field public static final enum c:Lwa0;

.field public static final enum d:Lwa0;

.field public static final enum e:Lwa0;

.field public static final synthetic f:[Lwa0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwa0;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwa0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwa0;->b:Lwa0;

    new-instance v0, Lwa0;

    const-string v1, "NONE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lwa0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwa0;->c:Lwa0;

    new-instance v0, Lwa0;

    const-string v1, "READY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lwa0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwa0;->d:Lwa0;

    new-instance v0, Lwa0;

    const-string v1, "FIRED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lwa0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwa0;->e:Lwa0;

    invoke-static {}, Lwa0;->a()[Lwa0;

    move-result-object v0

    sput-object v0, Lwa0;->f:[Lwa0;

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

.method public static synthetic a()[Lwa0;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lwa0;

    const/4 v1, 0x0

    sget-object v2, Lwa0;->b:Lwa0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lwa0;->c:Lwa0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lwa0;->d:Lwa0;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lwa0;->e:Lwa0;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lwa0;
    .locals 1

    const-class v0, Lwa0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwa0;

    return-object p0
.end method

.method public static values()[Lwa0;
    .locals 1

    sget-object v0, Lwa0;->f:[Lwa0;

    invoke-virtual {v0}, [Lwa0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwa0;

    return-object v0
.end method
