.class public final LQx2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LPx2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lei0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lei0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQx2;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)LQx2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lei0;",
            ">;)",
            "LQx2;"
        }
    .end annotation

    new-instance v0, LQx2;

    invoke-direct {v0, p0}, LQx2;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(Lei0;)LPx2;
    .locals 1

    new-instance v0, LPx2;

    invoke-direct {v0, p0}, LPx2;-><init>(Lei0;)V

    return-object v0
.end method


# virtual methods
.method public b()LPx2;
    .locals 1

    iget-object v0, p0, LQx2;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lei0;

    invoke-static {v0}, LQx2;->c(Lei0;)LPx2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQx2;->b()LPx2;

    move-result-object v0

    return-object v0
.end method
