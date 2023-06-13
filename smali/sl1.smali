.class public final enum Lsl1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lsl1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lsl1;

.field public static final enum d:Lsl1;

.field public static final enum e:Lsl1;

.field public static final enum f:Lsl1;

.field public static final enum g:Lsl1;

.field public static final synthetic h:[Lsl1;


# instance fields
.field public final b:J


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lsl1;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-string v4, "DEX_FILES"

    invoke-direct {v0, v4, v1, v2, v3}, Lsl1;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lsl1;->c:Lsl1;

    new-instance v0, Lsl1;

    const/4 v1, 0x1

    const-wide/16 v2, 0x1

    const-string v4, "EXTRA_DESCRIPTORS"

    invoke-direct {v0, v4, v1, v2, v3}, Lsl1;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lsl1;->d:Lsl1;

    new-instance v0, Lsl1;

    const/4 v1, 0x2

    const-wide/16 v2, 0x2

    const-string v4, "CLASSES"

    invoke-direct {v0, v4, v1, v2, v3}, Lsl1;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lsl1;->e:Lsl1;

    new-instance v0, Lsl1;

    const/4 v1, 0x3

    const-wide/16 v2, 0x3

    const-string v4, "METHODS"

    invoke-direct {v0, v4, v1, v2, v3}, Lsl1;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lsl1;->f:Lsl1;

    new-instance v0, Lsl1;

    const/4 v1, 0x4

    const-wide/16 v2, 0x4

    const-string v4, "AGGREGATION_COUNT"

    invoke-direct {v0, v4, v1, v2, v3}, Lsl1;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lsl1;->g:Lsl1;

    invoke-static {}, Lsl1;->a()[Lsl1;

    move-result-object v0

    sput-object v0, Lsl1;->h:[Lsl1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Lsl1;->b:J

    return-void
.end method

.method public static synthetic a()[Lsl1;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lsl1;

    const/4 v1, 0x0

    sget-object v2, Lsl1;->c:Lsl1;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lsl1;->d:Lsl1;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lsl1;->e:Lsl1;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lsl1;->f:Lsl1;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lsl1;->g:Lsl1;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lsl1;
    .locals 1

    const-class v0, Lsl1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsl1;

    return-object p0
.end method

.method public static values()[Lsl1;
    .locals 1

    sget-object v0, Lsl1;->h:[Lsl1;

    invoke-virtual {v0}, [Lsl1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsl1;

    return-object v0
.end method


# virtual methods
.method public b()J
    .locals 2

    iget-wide v0, p0, Lsl1;->b:J

    return-wide v0
.end method
