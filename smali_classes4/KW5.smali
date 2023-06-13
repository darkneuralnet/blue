.class public final LKW5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LIW5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lsu2;",
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
            "Lsu2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKW5;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LKW5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lsu2;",
            ">;)",
            "LKW5;"
        }
    .end annotation

    new-instance v0, LKW5;

    invoke-direct {v0, p0}, LKW5;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lsu2;)LIW5;
    .locals 1

    new-instance v0, LIW5;

    invoke-direct {v0, p0}, LIW5;-><init>(Lsu2;)V

    return-object v0
.end method


# virtual methods
.method public b()LIW5;
    .locals 1

    iget-object v0, p0, LKW5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsu2;

    invoke-static {v0}, LKW5;->c(Lsu2;)LIW5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LKW5;->b()LIW5;

    move-result-object v0

    return-object v0
.end method
