.class public final LDL1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LOh;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
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
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LOh;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDL1;->a:LY94;

    iput-object p2, p0, LDL1;->b:LY94;

    iput-object p3, p0, LDL1;->c:LY94;

    iput-object p4, p0, LDL1;->d:LY94;

    iput-object p5, p0, LDL1;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)LDL1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LOh;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LDL1;"
        }
    .end annotation

    new-instance v6, LDL1;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LDL1;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(Landroid/content/Context;LYR4;LOh;LEa;LTq4;)Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;
    .locals 7

    new-instance v6, Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;-><init>(Landroid/content/Context;LYR4;LOh;LEa;LTq4;)V

    return-object v6
.end method


# virtual methods
.method public b()Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;
    .locals 5

    iget-object v0, p0, LDL1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, LDL1;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYR4;

    iget-object v2, p0, LDL1;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LOh;

    iget-object v3, p0, LDL1;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LEa;

    iget-object v4, p0, LDL1;->e:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LTq4;

    invoke-static {v0, v1, v2, v3, v4}, LDL1;->c(Landroid/content/Context;LYR4;LOh;LEa;LTq4;)Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDL1;->b()Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;

    move-result-object v0

    return-object v0
.end method
