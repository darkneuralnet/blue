.class final enum Landroidx/test/services/events/platform/TestPlatformEvent$EventType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/test/services/events/platform/TestPlatformEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "EventType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/test/services/events/platform/TestPlatformEvent$EventType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

.field public static final enum c:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

.field public static final enum d:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

.field public static final enum e:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

.field public static final enum f:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

.field public static final enum g:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

.field public static final synthetic h:[Landroidx/test/services/events/platform/TestPlatformEvent$EventType;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    const-string v1, "TEST_RUN_STARTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->b:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    new-instance v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    const-string v1, "TEST_RUN_ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->c:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    new-instance v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    const-string v1, "TEST_RUN_FINISHED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->d:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    new-instance v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    const-string v1, "TEST_CASE_STARTED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->e:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    new-instance v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    const-string v1, "TEST_CASE_ERROR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->f:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    new-instance v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    const-string v1, "TEST_CASE_FINISHED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->g:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    invoke-static {}, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->a()[Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    move-result-object v0

    sput-object v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->h:[Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

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

.method public static synthetic a()[Landroidx/test/services/events/platform/TestPlatformEvent$EventType;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    const/4 v1, 0x0

    sget-object v2, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->b:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->c:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->d:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->e:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->f:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->g:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/test/services/events/platform/TestPlatformEvent$EventType;
    .locals 1

    const-class v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    return-object p0
.end method

.method public static values()[Landroidx/test/services/events/platform/TestPlatformEvent$EventType;
    .locals 1

    sget-object v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->h:[Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    invoke-virtual {v0}, [Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    return-object v0
.end method
