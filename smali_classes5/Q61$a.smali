.class public LQ61$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ61;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x12c

    invoke-direct {p0, v0}, LQ61$a;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LQ61$a;->a:I

    return-void
.end method


# virtual methods
.method public a()LQ61;
    .locals 3

    new-instance v0, LQ61;

    iget v1, p0, LQ61$a;->a:I

    iget-boolean v2, p0, LQ61$a;->b:Z

    invoke-direct {v0, v1, v2}, LQ61;-><init>(IZ)V

    return-object v0
.end method
