.class public abstract LTz5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LTz5;->a:Z

    return-void
.end method


# virtual methods
.method public a(LWB1;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LWB1;->f0()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-boolean v1, p0, LTz5;->a:Z

    if-nez v1, :cond_2

    invoke-virtual {p1, v0}, LWB1;->d0(I)LWB1;

    move-result-object v1

    instance-of v2, v1, LXB1;

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, LTz5;->c(LWB1;)V

    invoke-virtual {p0}, LTz5;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, LTz5;->a:Z

    return-void

    :cond_0
    invoke-virtual {p0, v1}, LTz5;->a(LWB1;)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public abstract b()Z
.end method

.method public abstract c(LWB1;)V
.end method
