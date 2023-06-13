.class public final LJX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LFX;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lde5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaX;",
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
            "Lde5;",
            ">;",
            "LY94<",
            "LaX;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJX;->a:LY94;

    iput-object p2, p0, LJX;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LJX;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lde5;",
            ">;",
            "LY94<",
            "LaX;",
            ">;)",
            "LJX;"
        }
    .end annotation

    new-instance v0, LJX;

    invoke-direct {v0, p0, p1}, LJX;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lde5;LaX;)LFX;
    .locals 1

    new-instance v0, LFX;

    invoke-direct {v0, p0, p1}, LFX;-><init>(Lde5;LaX;)V

    return-object v0
.end method


# virtual methods
.method public b()LFX;
    .locals 2

    iget-object v0, p0, LJX;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde5;

    iget-object v1, p0, LJX;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LaX;

    invoke-static {v0, v1}, LJX;->c(Lde5;LaX;)LFX;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJX;->b()LFX;

    move-result-object v0

    return-object v0
.end method
