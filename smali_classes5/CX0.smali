.class public LCX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCO1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public h(LwO1;)LAZ1;
    .locals 1

    instance-of v0, p1, LDO1;

    if-eqz v0, :cond_0

    invoke-static {}, Li20;->s()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LWt6;->g(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, LDO1;

    invoke-interface {p1}, LDO1;->v()V

    :cond_0
    sget-object p1, LAZ1;->b:LAZ1;

    return-object p1
.end method
