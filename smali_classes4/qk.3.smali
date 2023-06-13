.class public final Lqk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LBX1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;


# direct methods
.method public constructor <init>(Lhj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqk;->a:Lhj;

    return-void
.end method

.method public static a(Lhj;)Lqk;
    .locals 1

    new-instance v0, Lqk;

    invoke-direct {v0, p0}, Lqk;-><init>(Lhj;)V

    return-object v0
.end method

.method public static c(Lhj;)LBX1;
    .locals 0

    invoke-virtual {p0}, Lhj;->j0()LBX1;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBX1;

    return-object p0
.end method


# virtual methods
.method public b()LBX1;
    .locals 1

    iget-object v0, p0, Lqk;->a:Lhj;

    invoke-static {v0}, Lqk;->c(Lhj;)LBX1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lqk;->b()LBX1;

    move-result-object v0

    return-object v0
.end method
