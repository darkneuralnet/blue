.class public final LSt7;
.super Lpq7;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lpq7;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)LSt7;
    .locals 0

    invoke-super {p0, p1}, Lpq7;->b(Ljava/lang/Object;)Lpq7;

    return-object p0
.end method

.method public final e()Lbw7;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpq7;->c:Z

    iget-object v0, p0, Lpq7;->a:[Ljava/lang/Object;

    iget v1, p0, Lpq7;->b:I

    invoke-static {v0, v1}, Lbw7;->o([Ljava/lang/Object;I)Lbw7;

    move-result-object v0

    return-object v0
.end method
