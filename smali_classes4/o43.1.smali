.class public final Lo43;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ln43;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTk3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le43;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTk3;",
            ">;",
            "LY94<",
            "Le43;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo43;->a:LY94;

    iput-object p2, p0, Lo43;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)Lo43;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTk3;",
            ">;",
            "LY94<",
            "Le43;",
            ">;)",
            "Lo43;"
        }
    .end annotation

    new-instance v0, Lo43;

    invoke-direct {v0, p0, p1}, Lo43;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTk3;Le43;)Ln43;
    .locals 1

    new-instance v0, Ln43;

    invoke-direct {v0, p0, p1}, Ln43;-><init>(LTk3;Le43;)V

    return-object v0
.end method


# virtual methods
.method public b()Ln43;
    .locals 2

    iget-object v0, p0, Lo43;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTk3;

    iget-object v1, p0, Lo43;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le43;

    invoke-static {v0, v1}, Lo43;->c(LTk3;Le43;)Ln43;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo43;->b()Ln43;

    move-result-object v0

    return-object v0
.end method
