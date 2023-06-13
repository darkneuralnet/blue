.class public final enum LHs4$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHs4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LHs4$g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LHs4$g;

.field public static final enum c:LHs4$g;

.field public static final enum d:LHs4$g;

.field public static final enum e:LHs4$g;

.field public static final enum f:LHs4$g;

.field public static final enum g:LHs4$g;

.field public static final synthetic h:[LHs4$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LHs4$g;

    const-string v1, "INITIALIZING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LHs4$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$g;->b:LHs4$g;

    new-instance v0, LHs4$g;

    const-string v1, "IDLING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LHs4$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$g;->c:LHs4$g;

    new-instance v0, LHs4$g;

    const-string v1, "DISABLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LHs4$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$g;->d:LHs4$g;

    new-instance v0, LHs4$g;

    const-string v1, "ACTIVE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LHs4$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$g;->e:LHs4$g;

    new-instance v0, LHs4$g;

    const-string v1, "ERROR_ENCODER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LHs4$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$g;->f:LHs4$g;

    new-instance v0, LHs4$g;

    const-string v1, "ERROR_SOURCE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LHs4$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHs4$g;->g:LHs4$g;

    invoke-static {}, LHs4$g;->a()[LHs4$g;

    move-result-object v0

    sput-object v0, LHs4$g;->h:[LHs4$g;

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

.method public static synthetic a()[LHs4$g;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LHs4$g;

    const/4 v1, 0x0

    sget-object v2, LHs4$g;->b:LHs4$g;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LHs4$g;->c:LHs4$g;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LHs4$g;->d:LHs4$g;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LHs4$g;->e:LHs4$g;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LHs4$g;->f:LHs4$g;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LHs4$g;->g:LHs4$g;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LHs4$g;
    .locals 1

    const-class v0, LHs4$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LHs4$g;

    return-object p0
.end method

.method public static values()[LHs4$g;
    .locals 1

    sget-object v0, LHs4$g;->h:[LHs4$g;

    invoke-virtual {v0}, [LHs4$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LHs4$g;

    return-object v0
.end method
