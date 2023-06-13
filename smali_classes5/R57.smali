.class public LR57;
.super LS57;
.source "SourceFile"


# instance fields
.field public a:[Ljava/lang/Object;

.field public b:I

.field public c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, LS57;-><init>()V

    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, LR57;->a:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, LR57;->b:I

    return-void
.end method
