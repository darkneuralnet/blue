.class public final LEQ3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LDQ3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
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


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/app/Activity;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEQ3;->a:LY94;

    iput-object p2, p0, LEQ3;->b:LY94;

    iput-object p3, p0, LEQ3;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LEQ3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/app/Activity;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)",
            "LEQ3;"
        }
    .end annotation

    new-instance v0, LEQ3;

    invoke-direct {v0, p0, p1, p2}, LEQ3;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Landroid/app/Activity;Lgl;LEa;)LDQ3;
    .locals 1

    new-instance v0, LDQ3;

    invoke-direct {v0, p0, p1, p2}, LDQ3;-><init>(Landroid/app/Activity;Lgl;LEa;)V

    return-object v0
.end method


# virtual methods
.method public b()LDQ3;
    .locals 3

    iget-object v0, p0, LEQ3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    iget-object v1, p0, LEQ3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgl;

    iget-object v2, p0, LEQ3;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEa;

    invoke-static {v0, v1, v2}, LEQ3;->c(Landroid/app/Activity;Lgl;LEa;)LDQ3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LEQ3;->b()LDQ3;

    move-result-object v0

    return-object v0
.end method
