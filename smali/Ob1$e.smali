.class public final enum LOb1$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LOb1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LOb1$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LOb1$e;

.field public static final enum c:LOb1$e;

.field public static final enum d:LOb1$e;

.field public static final enum e:LOb1$e;

.field public static final enum f:LOb1$e;

.field public static final enum g:LOb1$e;

.field public static final enum h:LOb1$e;

.field public static final enum i:LOb1$e;

.field public static final enum j:LOb1$e;

.field public static final synthetic k:[LOb1$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LOb1$e;

    const-string v1, "CONFIGURED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LOb1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOb1$e;->b:LOb1$e;

    new-instance v0, LOb1$e;

    const-string v1, "STARTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LOb1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOb1$e;->c:LOb1$e;

    new-instance v0, LOb1$e;

    const-string v1, "PAUSED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LOb1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOb1$e;->d:LOb1$e;

    new-instance v0, LOb1$e;

    const-string v1, "STOPPING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LOb1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOb1$e;->e:LOb1$e;

    new-instance v0, LOb1$e;

    const-string v1, "PENDING_START"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LOb1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOb1$e;->f:LOb1$e;

    new-instance v0, LOb1$e;

    const-string v1, "PENDING_START_PAUSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LOb1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOb1$e;->g:LOb1$e;

    new-instance v0, LOb1$e;

    const-string v1, "PENDING_RELEASE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LOb1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOb1$e;->h:LOb1$e;

    new-instance v0, LOb1$e;

    const-string v1, "ERROR"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LOb1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOb1$e;->i:LOb1$e;

    new-instance v0, LOb1$e;

    const-string v1, "RELEASED"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, LOb1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOb1$e;->j:LOb1$e;

    invoke-static {}, LOb1$e;->a()[LOb1$e;

    move-result-object v0

    sput-object v0, LOb1$e;->k:[LOb1$e;

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

.method public static synthetic a()[LOb1$e;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [LOb1$e;

    const/4 v1, 0x0

    sget-object v2, LOb1$e;->b:LOb1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LOb1$e;->c:LOb1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LOb1$e;->d:LOb1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LOb1$e;->e:LOb1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LOb1$e;->f:LOb1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LOb1$e;->g:LOb1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LOb1$e;->h:LOb1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, LOb1$e;->i:LOb1$e;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, LOb1$e;->j:LOb1$e;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LOb1$e;
    .locals 1

    const-class v0, LOb1$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LOb1$e;

    return-object p0
.end method

.method public static values()[LOb1$e;
    .locals 1

    sget-object v0, LOb1$e;->k:[LOb1$e;

    invoke-virtual {v0}, [LOb1$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LOb1$e;

    return-object v0
.end method
