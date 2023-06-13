.class final enum Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/test/services/events/discovery/TestDiscoveryEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "EventType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

.field public static final enum c:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

.field public static final enum d:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

.field public static final enum e:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

.field public static final synthetic f:[Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    const-string v1, "STARTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->b:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    new-instance v0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    const-string v1, "TEST_FOUND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->c:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    new-instance v0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    const-string v1, "ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->d:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    new-instance v0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    const-string v1, "FINISHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->e:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    invoke-static {}, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->a()[Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    move-result-object v0

    sput-object v0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->f:[Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

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

.method public static synthetic a()[Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    const/4 v1, 0x0

    sget-object v2, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->b:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->c:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->d:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->e:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;
    .locals 1

    const-class v0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    return-object p0
.end method

.method public static values()[Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;
    .locals 1

    sget-object v0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->f:[Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    invoke-virtual {v0}, [Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    return-object v0
.end method
