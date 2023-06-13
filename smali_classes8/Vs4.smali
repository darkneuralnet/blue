.class public LVs4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LCX3;

.field public b:Lsf1;


# direct methods
.method public constructor <init>(LCX3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVs4;->a:LCX3;

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object p1

    iput-object p1, p0, LVs4;->b:Lsf1;

    return-void
.end method

.method public static b(LCX3;LWB1;)Z
    .locals 1

    new-instance v0, LVs4;

    invoke-direct {v0, p0}, LVs4;-><init>(LCX3;)V

    invoke-virtual {v0, p1}, LVs4;->a(LWB1;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a(LWB1;)Z
    .locals 4

    iget-object v0, p0, LVs4;->b:Lsf1;

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsf1;->K(Lsf1;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    new-instance v0, Ltf1;

    iget-object v2, p0, LVs4;->b:Lsf1;

    invoke-direct {v0, v2}, Ltf1;-><init>(Lsf1;)V

    invoke-virtual {v0, p1}, LTz5;->a(LWB1;)V

    invoke-virtual {v0}, Ltf1;->d()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    new-instance v0, LaC1;

    iget-object v3, p0, LVs4;->a:LCX3;

    invoke-direct {v0, v3}, LaC1;-><init>(LCX3;)V

    invoke-virtual {v0, p1}, LTz5;->a(LWB1;)V

    invoke-virtual {v0}, LaC1;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    new-instance v0, LWs4;

    iget-object v3, p0, LVs4;->a:LCX3;

    invoke-direct {v0, v3}, LWs4;-><init>(LCX3;)V

    invoke-virtual {v0, p1}, LTz5;->a(LWB1;)V

    invoke-virtual {v0}, LWs4;->f()Z

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v1
.end method
