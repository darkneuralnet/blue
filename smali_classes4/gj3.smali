.class public final Lgj3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lfj3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lh86;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lri3;",
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
            "Lh86;",
            ">;",
            "LY94<",
            "Lri3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgj3;->a:LY94;

    iput-object p2, p0, Lgj3;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)Lgj3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lh86;",
            ">;",
            "LY94<",
            "Lri3;",
            ">;)",
            "Lgj3;"
        }
    .end annotation

    new-instance v0, Lgj3;

    invoke-direct {v0, p0, p1}, Lgj3;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lh86;Lri3;)Lfj3;
    .locals 1

    new-instance v0, Lfj3;

    invoke-direct {v0, p0, p1}, Lfj3;-><init>(Lh86;Lri3;)V

    return-object v0
.end method


# virtual methods
.method public b()Lfj3;
    .locals 2

    iget-object v0, p0, Lgj3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh86;

    iget-object v1, p0, Lgj3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lri3;

    invoke-static {v0, v1}, Lgj3;->c(Lh86;Lri3;)Lfj3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgj3;->b()Lfj3;

    move-result-object v0

    return-object v0
.end method
