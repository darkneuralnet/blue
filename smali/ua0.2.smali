.class public final enum Lua0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lua0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lua0;

.field public static final enum c:Lua0;

.field public static final enum d:Lua0;

.field public static final enum e:Lua0;

.field public static final enum f:Lua0;

.field public static final enum g:Lua0;

.field public static final enum h:Lua0;

.field public static final synthetic i:[Lua0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lua0;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lua0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lua0;->b:Lua0;

    new-instance v0, Lua0;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lua0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lua0;->c:Lua0;

    new-instance v0, Lua0;

    const-string v1, "SCANNING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lua0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lua0;->d:Lua0;

    new-instance v0, Lua0;

    const-string v1, "PASSIVE_FOCUSED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lua0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lua0;->e:Lua0;

    new-instance v0, Lua0;

    const-string v1, "PASSIVE_NOT_FOCUSED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lua0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lua0;->f:Lua0;

    new-instance v0, Lua0;

    const-string v1, "LOCKED_FOCUSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lua0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lua0;->g:Lua0;

    new-instance v0, Lua0;

    const-string v1, "LOCKED_NOT_FOCUSED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lua0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lua0;->h:Lua0;

    invoke-static {}, Lua0;->a()[Lua0;

    move-result-object v0

    sput-object v0, Lua0;->i:[Lua0;

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

.method public static synthetic a()[Lua0;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lua0;

    const/4 v1, 0x0

    sget-object v2, Lua0;->b:Lua0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lua0;->c:Lua0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lua0;->d:Lua0;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lua0;->e:Lua0;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lua0;->f:Lua0;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lua0;->g:Lua0;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lua0;->h:Lua0;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lua0;
    .locals 1

    const-class v0, Lua0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lua0;

    return-object p0
.end method

.method public static values()[Lua0;
    .locals 1

    sget-object v0, Lua0;->i:[Lua0;

    invoke-virtual {v0}, [Lua0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lua0;

    return-object v0
.end method
