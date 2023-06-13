.class public final LmI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LaX;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;


# direct methods
.method public constructor <init>(LVH2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmI2;->a:LVH2;

    return-void
.end method

.method public static a(LVH2;)LmI2;
    .locals 1

    new-instance v0, LmI2;

    invoke-direct {v0, p0}, LmI2;-><init>(LVH2;)V

    return-object v0
.end method

.method public static c(LVH2;)LaX;
    .locals 0

    invoke-virtual {p0}, LVH2;->q()LaX;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LaX;

    return-object p0
.end method


# virtual methods
.method public b()LaX;
    .locals 1

    iget-object v0, p0, LmI2;->a:LVH2;

    invoke-static {v0}, LmI2;->c(LVH2;)LaX;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LmI2;->b()LaX;

    move-result-object v0

    return-object v0
.end method
