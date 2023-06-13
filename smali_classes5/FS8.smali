.class public final LFS8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LQS8;

.field public b:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic c(LFS8;)LQS8;
    .locals 0

    iget-object p0, p0, LFS8;->a:LQS8;

    return-object p0
.end method

.method public static bridge synthetic e(LFS8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LFS8;->b:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final a(LQS8;)LFS8;
    .locals 0

    iput-object p1, p0, LFS8;->a:LQS8;

    return-object p0
.end method

.method public final b(Ljava/lang/Integer;)LFS8;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LFS8;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public final d()LmT8;
    .locals 2

    new-instance v0, LmT8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LmT8;-><init>(LFS8;LbT8;)V

    return-object v0
.end method
