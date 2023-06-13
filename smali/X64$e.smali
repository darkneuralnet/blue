.class public final enum LX64$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX64;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LX64$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LX64$e;

.field public static final enum c:LX64$e;

.field public static final enum d:LX64$e;

.field public static final enum e:LX64$e;

.field public static final enum f:LX64$e;

.field public static final synthetic g:[LX64$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LX64$e;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LX64$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LX64$e;->b:LX64$e;

    new-instance v0, LX64$e;

    const-string v1, "SESSION_INITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LX64$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LX64$e;->c:LX64$e;

    new-instance v0, LX64$e;

    const-string v1, "ON_CAPTURE_SESSION_STARTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LX64$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LX64$e;->d:LX64$e;

    new-instance v0, LX64$e;

    const-string v1, "ON_CAPTURE_SESSION_ENDED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LX64$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LX64$e;->e:LX64$e;

    new-instance v0, LX64$e;

    const-string v1, "DE_INITIALIZED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LX64$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LX64$e;->f:LX64$e;

    invoke-static {}, LX64$e;->a()[LX64$e;

    move-result-object v0

    sput-object v0, LX64$e;->g:[LX64$e;

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

.method public static synthetic a()[LX64$e;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [LX64$e;

    const/4 v1, 0x0

    sget-object v2, LX64$e;->b:LX64$e;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LX64$e;->c:LX64$e;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LX64$e;->d:LX64$e;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LX64$e;->e:LX64$e;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LX64$e;->f:LX64$e;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LX64$e;
    .locals 1

    const-class v0, LX64$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LX64$e;

    return-object p0
.end method

.method public static values()[LX64$e;
    .locals 1

    sget-object v0, LX64$e;->g:[LX64$e;

    invoke-virtual {v0}, [LX64$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LX64$e;

    return-object v0
.end method
