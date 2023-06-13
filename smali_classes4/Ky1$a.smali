.class public LKy1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKy1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LKy1;
    .locals 5

    new-instance v0, LKy1;

    iget v1, p0, LKy1$a;->a:I

    iget v2, p0, LKy1$a;->b:I

    iget v3, p0, LKy1$a;->c:I

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, LKy1;-><init>(IIILLy1;)V

    return-object v0
.end method

.method public b(I)LKy1$a;
    .locals 0

    iput p1, p0, LKy1$a;->b:I

    return-object p0
.end method

.method public c(I)LKy1$a;
    .locals 0

    iput p1, p0, LKy1$a;->c:I

    return-object p0
.end method

.method public d(I)LKy1$a;
    .locals 0

    iput p1, p0, LKy1$a;->a:I

    return-object p0
.end method
