.class public final enum LSy0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LSy0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LSy0;

.field public static final enum d:LSy0;

.field public static final enum e:LSy0;

.field public static final enum f:LSy0;

.field public static final enum g:LSy0;

.field public static final enum h:LSy0;

.field public static final synthetic i:[LSy0;


# instance fields
.field public b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    new-instance v0, LSy0;

    const-string v1, "_fstec"

    const-string v2, "TRACE_EVENT_RATE_LIMITED"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LSy0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LSy0;->c:LSy0;

    new-instance v1, LSy0;

    const-string v2, "_fsntc"

    const-string v4, "NETWORK_TRACE_EVENT_RATE_LIMITED"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LSy0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LSy0;->d:LSy0;

    new-instance v2, LSy0;

    const-string v4, "_tsns"

    const-string v6, "TRACE_STARTED_NOT_STOPPED"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LSy0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LSy0;->e:LSy0;

    new-instance v4, LSy0;

    const-string v6, "_fr_tot"

    const-string v8, "FRAMES_TOTAL"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, LSy0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, LSy0;->f:LSy0;

    new-instance v6, LSy0;

    const-string v8, "_fr_slo"

    const-string v10, "FRAMES_SLOW"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, LSy0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, LSy0;->g:LSy0;

    new-instance v8, LSy0;

    const-string v10, "_fr_fzn"

    const-string v12, "FRAMES_FROZEN"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, LSy0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, LSy0;->h:LSy0;

    const/4 v10, 0x6

    new-array v10, v10, [LSy0;

    aput-object v0, v10, v3

    aput-object v1, v10, v5

    aput-object v2, v10, v7

    aput-object v4, v10, v9

    aput-object v6, v10, v11

    aput-object v8, v10, v13

    sput-object v10, LSy0;->i:[LSy0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LSy0;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LSy0;
    .locals 1

    const-class v0, LSy0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LSy0;

    return-object p0
.end method

.method public static values()[LSy0;
    .locals 1

    sget-object v0, LSy0;->i:[LSy0;

    invoke-virtual {v0}, [LSy0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LSy0;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LSy0;->b:Ljava/lang/String;

    return-object v0
.end method
