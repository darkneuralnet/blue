.class public abstract enum LhR5;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LhR5;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LhR5;

.field public static final enum d:LhR5;

.field public static final enum e:LhR5;

.field public static final enum f:LhR5;

.field public static final enum g:LhR5;

.field public static final synthetic h:[LhR5;


# instance fields
.field public b:J


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v0, LhR5$a;

    const-wide v1, 0x10000000000L

    const-string v3, "TERABYTES"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, LhR5$a;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, LhR5;->c:LhR5;

    new-instance v1, LhR5$b;

    const-wide/32 v2, 0x40000000

    const-string v5, "GIGABYTES"

    const/4 v6, 0x1

    invoke-direct {v1, v5, v6, v2, v3}, LhR5$b;-><init>(Ljava/lang/String;IJ)V

    sput-object v1, LhR5;->d:LhR5;

    new-instance v2, LhR5$c;

    const-wide/32 v7, 0x100000

    const-string v3, "MEGABYTES"

    const/4 v5, 0x2

    invoke-direct {v2, v3, v5, v7, v8}, LhR5$c;-><init>(Ljava/lang/String;IJ)V

    sput-object v2, LhR5;->e:LhR5;

    new-instance v3, LhR5$d;

    const-wide/16 v7, 0x400

    const-string v9, "KILOBYTES"

    const/4 v10, 0x3

    invoke-direct {v3, v9, v10, v7, v8}, LhR5$d;-><init>(Ljava/lang/String;IJ)V

    sput-object v3, LhR5;->f:LhR5;

    new-instance v7, LhR5$e;

    const-wide/16 v8, 0x1

    const-string v11, "BYTES"

    const/4 v12, 0x4

    invoke-direct {v7, v11, v12, v8, v9}, LhR5$e;-><init>(Ljava/lang/String;IJ)V

    sput-object v7, LhR5;->g:LhR5;

    const/4 v8, 0x5

    new-array v8, v8, [LhR5;

    aput-object v0, v8, v4

    aput-object v1, v8, v6

    aput-object v2, v8, v5

    aput-object v3, v8, v10

    aput-object v7, v8, v12

    sput-object v8, LhR5;->h:[LhR5;

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

    iput-wide p3, p0, LhR5;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IJLhR5$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LhR5;-><init>(Ljava/lang/String;IJ)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LhR5;
    .locals 1

    const-class v0, LhR5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LhR5;

    return-object p0
.end method

.method public static values()[LhR5;
    .locals 1

    sget-object v0, LhR5;->h:[LhR5;

    invoke-virtual {v0}, [LhR5;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LhR5;

    return-object v0
.end method


# virtual methods
.method public a(J)J
    .locals 2

    iget-wide v0, p0, LhR5;->b:J

    mul-long/2addr p1, v0

    sget-object v0, LhR5;->f:LhR5;

    iget-wide v0, v0, LhR5;->b:J

    div-long/2addr p1, v0

    return-wide p1
.end method
