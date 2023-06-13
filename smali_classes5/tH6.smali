.class public LtH6;
.super LXu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LtH6$a;
    }
.end annotation


# instance fields
.field public J:I

.field public K:I

.field public L:I

.field public M:I

.field public N:F

.field public O:Z

.field public P:LtH6$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LXu;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, LtH6;->J:I

    iput v0, p0, LtH6;->K:I

    iput v0, p0, LtH6;->L:I

    iput v0, p0, LtH6;->M:I

    const/4 v0, 0x0

    iput v0, p0, LtH6;->N:F

    const/4 v0, 0x0

    iput-boolean v0, p0, LtH6;->O:Z

    sget-object v0, LtH6$a;->b:LtH6$a;

    iput-object v0, p0, LtH6;->P:LtH6$a;

    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, p0, LNs0;->c:F

    return-void
.end method


# virtual methods
.method public P()F
    .locals 1

    iget v0, p0, LtH6;->N:F

    return v0
.end method

.method public Q()LtH6$a;
    .locals 1

    iget-object v0, p0, LtH6;->P:LtH6$a;

    return-object v0
.end method

.method public R()Z
    .locals 1

    iget-boolean v0, p0, LtH6;->O:Z

    return v0
.end method

.method public S(LtH6$a;)V
    .locals 0

    iput-object p1, p0, LtH6;->P:LtH6$a;

    return-void
.end method
