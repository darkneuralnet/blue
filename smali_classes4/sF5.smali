.class public final LsF5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LDX;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LwF5;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAF5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LDX;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LwF5;",
            ">;",
            "LY94<",
            "LAF5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsF5;->a:LY94;

    iput-object p2, p0, LsF5;->b:LY94;

    iput-object p3, p0, LsF5;->c:LY94;

    iput-object p4, p0, LsF5;->d:LY94;

    iput-object p5, p0, LsF5;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)LsF5;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LDX;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LwF5;",
            ">;",
            "LY94<",
            "LAF5;",
            ">;)",
            "LsF5;"
        }
    .end annotation

    new-instance v6, LsF5;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LsF5;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(LZC0;LTq4;LDX;LEa;LwF5;LAF5;)LpF5;
    .locals 8

    new-instance v7, LpF5;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LpF5;-><init>(LZC0;LTq4;LDX;LEa;LwF5;LAF5;)V

    return-object v7
.end method


# virtual methods
.method public b(LZC0;)LpF5;
    .locals 7

    iget-object v0, p0, LsF5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LTq4;

    iget-object v0, p0, LsF5;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LDX;

    iget-object v0, p0, LsF5;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LEa;

    iget-object v0, p0, LsF5;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LwF5;

    iget-object v0, p0, LsF5;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LAF5;

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LsF5;->c(LZC0;LTq4;LDX;LEa;LwF5;LAF5;)LpF5;

    move-result-object p1

    return-object p1
.end method
