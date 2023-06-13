.class public final Ltn6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lsn6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lqn6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lqn6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltn6;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Ltn6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lqn6;",
            ">;)",
            "Ltn6;"
        }
    .end annotation

    new-instance v0, Ltn6;

    invoke-direct {v0, p0}, Ltn6;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lqn6;)Lsn6;
    .locals 1

    new-instance v0, Lsn6;

    invoke-direct {v0, p0}, Lsn6;-><init>(Lqn6;)V

    return-object v0
.end method


# virtual methods
.method public b()Lsn6;
    .locals 1

    iget-object v0, p0, Ltn6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqn6;

    invoke-static {v0}, Ltn6;->c(Lqn6;)Lsn6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ltn6;->b()Lsn6;

    move-result-object v0

    return-object v0
.end method
