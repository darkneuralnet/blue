.class public final enum Landroidx/test/services/events/TestStatus$Status;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/test/services/events/TestStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Status"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/test/services/events/TestStatus$Status;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Landroidx/test/services/events/TestStatus$Status;

.field public static final enum c:Landroidx/test/services/events/TestStatus$Status;

.field public static final enum d:Landroidx/test/services/events/TestStatus$Status;

.field public static final enum e:Landroidx/test/services/events/TestStatus$Status;

.field public static final enum f:Landroidx/test/services/events/TestStatus$Status;

.field public static final enum g:Landroidx/test/services/events/TestStatus$Status;

.field public static final synthetic h:[Landroidx/test/services/events/TestStatus$Status;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/test/services/events/TestStatus$Status;

    const-string v1, "CANCELLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/TestStatus$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/TestStatus$Status;->b:Landroidx/test/services/events/TestStatus$Status;

    new-instance v0, Landroidx/test/services/events/TestStatus$Status;

    const-string v1, "IGNORED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/TestStatus$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/TestStatus$Status;->c:Landroidx/test/services/events/TestStatus$Status;

    new-instance v0, Landroidx/test/services/events/TestStatus$Status;

    const-string v1, "SKIPPED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/TestStatus$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/TestStatus$Status;->d:Landroidx/test/services/events/TestStatus$Status;

    new-instance v0, Landroidx/test/services/events/TestStatus$Status;

    const-string v1, "ABORTED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/TestStatus$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/TestStatus$Status;->e:Landroidx/test/services/events/TestStatus$Status;

    new-instance v0, Landroidx/test/services/events/TestStatus$Status;

    const-string v1, "PASSED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/TestStatus$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/TestStatus$Status;->f:Landroidx/test/services/events/TestStatus$Status;

    new-instance v0, Landroidx/test/services/events/TestStatus$Status;

    const-string v1, "FAILED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Landroidx/test/services/events/TestStatus$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/test/services/events/TestStatus$Status;->g:Landroidx/test/services/events/TestStatus$Status;

    invoke-static {}, Landroidx/test/services/events/TestStatus$Status;->a()[Landroidx/test/services/events/TestStatus$Status;

    move-result-object v0

    sput-object v0, Landroidx/test/services/events/TestStatus$Status;->h:[Landroidx/test/services/events/TestStatus$Status;

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

.method public static synthetic a()[Landroidx/test/services/events/TestStatus$Status;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Landroidx/test/services/events/TestStatus$Status;

    const/4 v1, 0x0

    sget-object v2, Landroidx/test/services/events/TestStatus$Status;->b:Landroidx/test/services/events/TestStatus$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/test/services/events/TestStatus$Status;->c:Landroidx/test/services/events/TestStatus$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/test/services/events/TestStatus$Status;->d:Landroidx/test/services/events/TestStatus$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/test/services/events/TestStatus$Status;->e:Landroidx/test/services/events/TestStatus$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Landroidx/test/services/events/TestStatus$Status;->f:Landroidx/test/services/events/TestStatus$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Landroidx/test/services/events/TestStatus$Status;->g:Landroidx/test/services/events/TestStatus$Status;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/test/services/events/TestStatus$Status;
    .locals 1

    const-class v0, Landroidx/test/services/events/TestStatus$Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/test/services/events/TestStatus$Status;

    return-object p0
.end method

.method public static values()[Landroidx/test/services/events/TestStatus$Status;
    .locals 1

    sget-object v0, Landroidx/test/services/events/TestStatus$Status;->h:[Landroidx/test/services/events/TestStatus$Status;

    invoke-virtual {v0}, [Landroidx/test/services/events/TestStatus$Status;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/test/services/events/TestStatus$Status;

    return-object v0
.end method
