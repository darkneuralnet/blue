.class public final enum Lsa0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lsa0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lsa0;

.field public static final enum c:Lsa0;

.field public static final enum d:Lsa0;

.field public static final enum e:Lsa0;

.field public static final enum f:Lsa0;

.field public static final enum g:Lsa0;

.field public static final synthetic h:[Lsa0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsa0;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lsa0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsa0;->b:Lsa0;

    new-instance v0, Lsa0;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lsa0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsa0;->c:Lsa0;

    new-instance v0, Lsa0;

    const-string v1, "SEARCHING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lsa0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsa0;->d:Lsa0;

    new-instance v0, Lsa0;

    const-string v1, "FLASH_REQUIRED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lsa0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsa0;->e:Lsa0;

    new-instance v0, Lsa0;

    const-string v1, "CONVERGED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lsa0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsa0;->f:Lsa0;

    new-instance v0, Lsa0;

    const-string v1, "LOCKED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lsa0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsa0;->g:Lsa0;

    invoke-static {}, Lsa0;->a()[Lsa0;

    move-result-object v0

    sput-object v0, Lsa0;->h:[Lsa0;

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

.method public static synthetic a()[Lsa0;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lsa0;

    const/4 v1, 0x0

    sget-object v2, Lsa0;->b:Lsa0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lsa0;->c:Lsa0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lsa0;->d:Lsa0;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lsa0;->e:Lsa0;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lsa0;->f:Lsa0;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lsa0;->g:Lsa0;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lsa0;
    .locals 1

    const-class v0, Lsa0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsa0;

    return-object p0
.end method

.method public static values()[Lsa0;
    .locals 1

    sget-object v0, Lsa0;->h:[Lsa0;

    invoke-virtual {v0}, [Lsa0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsa0;

    return-object v0
.end method
