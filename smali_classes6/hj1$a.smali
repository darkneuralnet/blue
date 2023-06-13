.class public Lhj1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Z

.field public f:F

.field public g:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lhj1$a;->a:I

    iput v0, p0, Lhj1$a;->b:I

    iput v0, p0, Lhj1$a;->c:I

    iput v0, p0, Lhj1$a;->d:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhj1$a;->e:Z

    const v0, 0x3dcccccd    # 0.1f

    iput v0, p0, Lhj1$a;->f:F

    return-void
.end method


# virtual methods
.method public a()Lhj1;
    .locals 10

    new-instance v9, Lhj1;

    iget v1, p0, Lhj1$a;->a:I

    iget v2, p0, Lhj1$a;->b:I

    iget v3, p0, Lhj1$a;->c:I

    iget v4, p0, Lhj1$a;->d:I

    iget-boolean v5, p0, Lhj1$a;->e:Z

    iget v6, p0, Lhj1$a;->f:F

    iget-object v7, p0, Lhj1$a;->g:Ljava/util/concurrent/Executor;

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lhj1;-><init>(IIIIZFLjava/util/concurrent/Executor;Lhf7;)V

    return-object v9
.end method

.method public b(I)Lhj1$a;
    .locals 0

    iput p1, p0, Lhj1$a;->c:I

    return-object p0
.end method

.method public c(I)Lhj1$a;
    .locals 0

    iput p1, p0, Lhj1$a;->b:I

    return-object p0
.end method

.method public d(I)Lhj1$a;
    .locals 0

    iput p1, p0, Lhj1$a;->a:I

    return-object p0
.end method

.method public e(I)Lhj1$a;
    .locals 0

    iput p1, p0, Lhj1$a;->d:I

    return-object p0
.end method
