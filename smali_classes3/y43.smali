.class public final Ly43;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lx43;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/Boolean;",
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
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly43;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Ly43;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ly43;"
        }
    .end annotation

    new-instance v0, Ly43;

    invoke-direct {v0, p0}, Ly43;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Z)Lx43;
    .locals 1

    new-instance v0, Lx43;

    invoke-direct {v0, p0}, Lx43;-><init>(Z)V

    return-object v0
.end method


# virtual methods
.method public b()Lx43;
    .locals 1

    iget-object v0, p0, Ly43;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ly43;->c(Z)Lx43;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly43;->b()Lx43;

    move-result-object v0

    return-object v0
.end method
