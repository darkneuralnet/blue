.class public final Lkg5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ljg5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lfg5;",
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
            "Lfg5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkg5;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lkg5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lfg5;",
            ">;)",
            "Lkg5;"
        }
    .end annotation

    new-instance v0, Lkg5;

    invoke-direct {v0, p0}, Lkg5;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lfg5;)Ljg5;
    .locals 1

    new-instance v0, Ljg5;

    invoke-direct {v0, p0}, Ljg5;-><init>(Lfg5;)V

    return-object v0
.end method


# virtual methods
.method public b()Ljg5;
    .locals 1

    iget-object v0, p0, Lkg5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfg5;

    invoke-static {v0}, Lkg5;->c(Lfg5;)Ljg5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkg5;->b()Ljg5;

    move-result-object v0

    return-object v0
.end method
