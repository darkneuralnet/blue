.class public final LkG2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LjG2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
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
            "Lgl;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkG2;->a:LY94;

    iput-object p2, p0, LkG2;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LkG2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "LkG2;"
        }
    .end annotation

    new-instance v0, LkG2;

    invoke-direct {v0, p0, p1}, LkG2;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lgl;Le13;)LjG2;
    .locals 1

    new-instance v0, LjG2;

    invoke-direct {v0, p0, p1}, LjG2;-><init>(Lgl;Le13;)V

    return-object v0
.end method


# virtual methods
.method public b()LjG2;
    .locals 2

    iget-object v0, p0, LkG2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    iget-object v1, p0, LkG2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le13;

    invoke-static {v0, v1}, LkG2;->c(Lgl;Le13;)LjG2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LkG2;->b()LjG2;

    move-result-object v0

    return-object v0
.end method
