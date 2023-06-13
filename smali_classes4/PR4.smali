.class public final LPR4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LOR4;",
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


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTk3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPR4;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LPR4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTk3;",
            ">;)",
            "LPR4;"
        }
    .end annotation

    new-instance v0, LPR4;

    invoke-direct {v0, p0}, LPR4;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LTk3;)LOR4;
    .locals 1

    new-instance v0, LOR4;

    invoke-direct {v0, p0}, LOR4;-><init>(LTk3;)V

    return-object v0
.end method


# virtual methods
.method public b()LOR4;
    .locals 1

    iget-object v0, p0, LPR4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTk3;

    invoke-static {v0}, LPR4;->c(LTk3;)LOR4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPR4;->b()LOR4;

    move-result-object v0

    return-object v0
.end method
