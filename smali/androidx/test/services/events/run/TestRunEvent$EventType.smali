.class final enum Landroidx/test/services/events/run/TestRunEvent$EventType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/test/services/events/run/TestRunEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "EventType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/test/services/events/run/TestRunEvent$EventType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Landroidx/test/services/events/run/TestRunEvent$EventType;

.field public static final enum c:Landroidx/test/services/events/run/TestRunEvent$EventType;

.field public static final enum d:Landroidx/test/services/events/run/TestRunEvent$EventType;

.field public static final enum e:Landroidx/test/services/events/run/TestRunEvent$EventType;

.field public static final enum f:Landroidx/test/services/events/run/TestRunEvent$EventType;

.field public static final enum g:Landroidx/test/services/events/run/TestRunEvent$EventType;

.field public static final enum h:Landroidx/test/services/events/run/TestRunEvent$EventType;

.field public static final synthetic i:[Landroidx/test/services/events/run/TestRunEvent$EventType;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/test/services/events/run/TestRunEvent$EventType;

    const-string v1, "STARTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/run/TestRunEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/run/TestRunEvent$EventType;->b:Landroidx/test/services/events/run/TestRunEvent$EventType;

    new-instance v0, Landroidx/test/services/events/run/TestRunEvent$EventType;

    const-string v1, "TEST_STARTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/run/TestRunEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/run/TestRunEvent$EventType;->c:Landroidx/test/services/events/run/TestRunEvent$EventType;

    new-instance v0, Landroidx/test/services/events/run/TestRunEvent$EventType;

    const-string v1, "TEST_FINISHED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/run/TestRunEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/run/TestRunEvent$EventType;->d:Landroidx/test/services/events/run/TestRunEvent$EventType;

    new-instance v0, Landroidx/test/services/events/run/TestRunEvent$EventType;

    const-string v1, "TEST_ASSUMPTION_FAILURE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/run/TestRunEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/run/TestRunEvent$EventType;->e:Landroidx/test/services/events/run/TestRunEvent$EventType;

    new-instance v0, Landroidx/test/services/events/run/TestRunEvent$EventType;

    const-string v1, "TEST_FAILURE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/run/TestRunEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/run/TestRunEvent$EventType;->f:Landroidx/test/services/events/run/TestRunEvent$EventType;

    new-instance v0, Landroidx/test/services/events/run/TestRunEvent$EventType;

    const-string v1, "TEST_IGNORED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/run/TestRunEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/run/TestRunEvent$EventType;->g:Landroidx/test/services/events/run/TestRunEvent$EventType;

    new-instance v0, Landroidx/test/services/events/run/TestRunEvent$EventType;

    const-string v1, "FINISHED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/run/TestRunEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/run/TestRunEvent$EventType;->h:Landroidx/test/services/events/run/TestRunEvent$EventType;

    invoke-static {}, Landroidx/test/services/events/run/TestRunEvent$EventType;->a()[Landroidx/test/services/events/run/TestRunEvent$EventType;

    move-result-object v0

    sput-object v0, Landroidx/test/services/events/run/TestRunEvent$EventType;->i:[Landroidx/test/services/events/run/TestRunEvent$EventType;

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

.method public static synthetic a()[Landroidx/test/services/events/run/TestRunEvent$EventType;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Landroidx/test/services/events/run/TestRunEvent$EventType;

    const/4 v1, 0x0

    sget-object v2, Landroidx/test/services/events/run/TestRunEvent$EventType;->b:Landroidx/test/services/events/run/TestRunEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/test/services/events/run/TestRunEvent$EventType;->c:Landroidx/test/services/events/run/TestRunEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/test/services/events/run/TestRunEvent$EventType;->d:Landroidx/test/services/events/run/TestRunEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/test/services/events/run/TestRunEvent$EventType;->e:Landroidx/test/services/events/run/TestRunEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Landroidx/test/services/events/run/TestRunEvent$EventType;->f:Landroidx/test/services/events/run/TestRunEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Landroidx/test/services/events/run/TestRunEvent$EventType;->g:Landroidx/test/services/events/run/TestRunEvent$EventType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Landroidx/test/services/events/run/TestRunEvent$EventType;->h:Landroidx/test/services/events/run/TestRunEvent$EventType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/test/services/events/run/TestRunEvent$EventType;
    .locals 1

    const-class v0, Landroidx/test/services/events/run/TestRunEvent$EventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/test/services/events/run/TestRunEvent$EventType;

    return-object p0
.end method

.method public static values()[Landroidx/test/services/events/run/TestRunEvent$EventType;
    .locals 1

    sget-object v0, Landroidx/test/services/events/run/TestRunEvent$EventType;->i:[Landroidx/test/services/events/run/TestRunEvent$EventType;

    invoke-virtual {v0}, [Landroidx/test/services/events/run/TestRunEvent$EventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/test/services/events/run/TestRunEvent$EventType;

    return-object v0
.end method
