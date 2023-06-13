.class public final enum LHs4$j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHs4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LHs4$j;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LHs4$j;

.field public static final enum c:LHs4$j;

.field public static final enum d:LHs4$j;

.field public static final enum e:LHs4$j;

.field public static final enum f:LHs4$j;

.field public static final enum g:LHs4$j;

.field public static final enum h:LHs4$j;

.field public static final enum i:LHs4$j;

.field public static final enum j:LHs4$j;

.field public static final synthetic k:[LHs4$j;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LHs4$j;

    const-string v1, "CONFIGURING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LHs4$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$j;->b:LHs4$j;

    new-instance v0, LHs4$j;

    const-string v1, "PENDING_RECORDING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LHs4$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$j;->c:LHs4$j;

    new-instance v0, LHs4$j;

    const-string v1, "PENDING_PAUSED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LHs4$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$j;->d:LHs4$j;

    new-instance v0, LHs4$j;

    const-string v1, "IDLING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LHs4$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$j;->e:LHs4$j;

    new-instance v0, LHs4$j;

    const-string v1, "RECORDING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LHs4$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$j;->f:LHs4$j;

    new-instance v0, LHs4$j;

    const-string v1, "PAUSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LHs4$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$j;->g:LHs4$j;

    new-instance v0, LHs4$j;

    const-string v1, "STOPPING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LHs4$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$j;->h:LHs4$j;

    new-instance v0, LHs4$j;

    const-string v1, "RESETTING"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LHs4$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$j;->i:LHs4$j;

    new-instance v0, LHs4$j;

    const-string v1, "ERROR"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, LHs4$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$j;->j:LHs4$j;

    invoke-static {}, LHs4$j;->a()[LHs4$j;

    move-result-object v0

    sput-object v0, LHs4$j;->k:[LHs4$j;

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

.method public static synthetic a()[LHs4$j;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [LHs4$j;

    const/4 v1, 0x0

    sget-object v2, LHs4$j;->b:LHs4$j;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LHs4$j;->c:LHs4$j;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LHs4$j;->d:LHs4$j;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LHs4$j;->e:LHs4$j;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LHs4$j;->f:LHs4$j;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LHs4$j;->g:LHs4$j;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LHs4$j;->h:LHs4$j;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, LHs4$j;->i:LHs4$j;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, LHs4$j;->j:LHs4$j;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LHs4$j;
    .locals 1

    const-class v0, LHs4$j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LHs4$j;

    return-object p0
.end method

.method public static values()[LHs4$j;
    .locals 1

    sget-object v0, LHs4$j;->k:[LHs4$j;

    invoke-virtual {v0}, [LHs4$j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LHs4$j;

    return-object v0
.end method
