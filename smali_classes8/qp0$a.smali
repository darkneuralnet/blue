.class public Lqp0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCB0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqp0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lpp0;

.field public b:Lpp0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lpp0;

    invoke-direct {v0}, Lpp0;-><init>()V

    iput-object v0, p0, Lqp0$a;->a:Lpp0;

    new-instance v0, Lpp0;

    invoke-direct {v0}, Lpp0;-><init>()V

    iput-object v0, p0, Lqp0$a;->b:Lpp0;

    return-void
.end method


# virtual methods
.method public a(LyB0;)V
    .locals 3

    iget-object v0, p0, Lqp0$a;->a:Lpp0;

    iget-wide v1, p1, LyB0;->b:D

    invoke-virtual {v0, v1, v2}, Lpp0;->a(D)V

    iget-object v0, p0, Lqp0$a;->b:Lpp0;

    iget-wide v1, p1, LyB0;->c:D

    invoke-virtual {v0, v1, v2}, Lpp0;->a(D)V

    return-void
.end method

.method public b()LyB0;
    .locals 5

    new-instance v0, LyB0;

    iget-object v1, p0, Lqp0$a;->a:Lpp0;

    invoke-virtual {v1}, Lpp0;->c()D

    move-result-wide v1

    iget-object v3, p0, Lqp0$a;->b:Lpp0;

    invoke-virtual {v3}, Lpp0;->c()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, LyB0;-><init>(DD)V

    return-object v0
.end method
