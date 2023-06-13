.class public final Li43;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lh43;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lj43;",
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
            "Lj43;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li43;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Li43;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lj43;",
            ">;)",
            "Li43;"
        }
    .end annotation

    new-instance v0, Li43;

    invoke-direct {v0, p0}, Li43;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lj43;)Lh43;
    .locals 1

    new-instance v0, Lh43;

    invoke-direct {v0, p0}, Lh43;-><init>(Lj43;)V

    return-object v0
.end method


# virtual methods
.method public b()Lh43;
    .locals 1

    iget-object v0, p0, Li43;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj43;

    invoke-static {v0}, Li43;->c(Lj43;)Lh43;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li43;->b()Lh43;

    move-result-object v0

    return-object v0
.end method
