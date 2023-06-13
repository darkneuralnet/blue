.class public final Lmp5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Llp5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lhp5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lh86;",
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
            "Lhp5;",
            ">;",
            "LY94<",
            "Lh86;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp5;->a:LY94;

    iput-object p2, p0, Lmp5;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)Lmp5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lhp5;",
            ">;",
            "LY94<",
            "Lh86;",
            ">;)",
            "Lmp5;"
        }
    .end annotation

    new-instance v0, Lmp5;

    invoke-direct {v0, p0, p1}, Lmp5;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lhp5;Lh86;)Llp5;
    .locals 1

    new-instance v0, Llp5;

    invoke-direct {v0, p0, p1}, Llp5;-><init>(Lhp5;Lh86;)V

    return-object v0
.end method


# virtual methods
.method public b()Llp5;
    .locals 2

    iget-object v0, p0, Lmp5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhp5;

    iget-object v1, p0, Lmp5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh86;

    invoke-static {v0, v1}, Lmp5;->c(Lhp5;Lh86;)Llp5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmp5;->b()Llp5;

    move-result-object v0

    return-object v0
.end method
