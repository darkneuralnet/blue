.class public abstract Lj91;
.super LQt5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj91$a;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final f:Lj91$a;


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/16 v3, 0x16

    invoke-direct {p0, v2, v3, v0, v1}, Lj91;-><init>(II[BLj91$a;)V

    return-void

    :array_0
    .array-data 1
        -0x56t
        -0x2t
    .end array-data
.end method

.method public constructor <init>(II[BLj91$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LQt5;-><init>(II[B)V

    iput-object p4, p0, Lj91;->f:Lj91$a;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lj91;->f:Lj91$a;

    aput-object v2, v0, v1

    const-string v1, "EddyStone(FrameType=%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
