.class public LOE2;
.super LRd3$a;
.source "SourceFile"


# static fields
.field public static e:LRd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRd3<",
            "LOE2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public c:D

.field public d:D


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LOE2;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, LOE2;-><init>(DD)V

    const/16 v1, 0x40

    invoke-static {v1, v0}, LRd3;->a(ILRd3$a;)LRd3;

    move-result-object v0

    sput-object v0, LOE2;->e:LRd3;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, LRd3;->g(F)V

    return-void
.end method

.method public constructor <init>(DD)V
    .locals 0

    invoke-direct {p0}, LRd3$a;-><init>()V

    iput-wide p1, p0, LOE2;->c:D

    iput-wide p3, p0, LOE2;->d:D

    return-void
.end method

.method public static b(DD)LOE2;
    .locals 1

    sget-object v0, LOE2;->e:LRd3;

    invoke-virtual {v0}, LRd3;->b()LRd3$a;

    move-result-object v0

    check-cast v0, LOE2;

    iput-wide p0, v0, LOE2;->c:D

    iput-wide p2, v0, LOE2;->d:D

    return-object v0
.end method

.method public static c(LOE2;)V
    .locals 1

    sget-object v0, LOE2;->e:LRd3;

    invoke-virtual {v0, p0}, LRd3;->c(LRd3$a;)V

    return-void
.end method


# virtual methods
.method public a()LRd3$a;
    .locals 3

    new-instance v0, LOE2;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, LOE2;-><init>(DD)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MPPointD, x: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LOE2;->c:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", y: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LOE2;->d:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
