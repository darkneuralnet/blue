.class public final LQH2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LwH2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LwH2$c;


# direct methods
.method public constructor <init>(LwH2$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQH2;->a:LwH2$c;

    return-void
.end method

.method public static a(LwH2$c;)LQH2;
    .locals 1

    new-instance v0, LQH2;

    invoke-direct {v0, p0}, LQH2;-><init>(LwH2$c;)V

    return-object v0
.end method

.method public static b(LwH2$c;)LwH2;
    .locals 0

    invoke-virtual {p0}, LwH2$c;->c()LwH2;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LwH2;

    return-object p0
.end method


# virtual methods
.method public c()LwH2;
    .locals 1

    iget-object v0, p0, LQH2;->a:LwH2$c;

    invoke-static {v0}, LQH2;->b(LwH2$c;)LwH2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQH2;->c()LwH2;

    move-result-object v0

    return-object v0
.end method
