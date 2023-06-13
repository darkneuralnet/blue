.class public LVx5$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVx5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:LVx5$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LVx5$b;
    .locals 2

    iget-object v0, p0, LVx5$c;->a:LVx5$b;

    if-nez v0, :cond_0

    new-instance v0, LVx5$b;

    invoke-direct {v0}, LVx5$b;-><init>()V

    goto :goto_0

    :cond_0
    iget-object v1, v0, LVx5$b;->c:LVx5$b;

    iput-object v1, p0, LVx5$c;->a:LVx5$b;

    :goto_0
    return-object v0
.end method

.method public b(LVx5$b;)V
    .locals 1

    iget-object v0, p0, LVx5$c;->a:LVx5$b;

    iput-object v0, p1, LVx5$b;->c:LVx5$b;

    iput-object p1, p0, LVx5$c;->a:LVx5$b;

    return-void
.end method
