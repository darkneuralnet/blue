.class public final LPH2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LrH2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LwH2$c;


# direct methods
.method public constructor <init>(LwH2$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPH2;->a:LwH2$c;

    return-void
.end method

.method public static a(LwH2$c;)LrH2;
    .locals 0

    invoke-virtual {p0}, LwH2$c;->b()LrH2;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LrH2;

    return-object p0
.end method

.method public static b(LwH2$c;)LPH2;
    .locals 1

    new-instance v0, LPH2;

    invoke-direct {v0, p0}, LPH2;-><init>(LwH2$c;)V

    return-object v0
.end method


# virtual methods
.method public c()LrH2;
    .locals 1

    iget-object v0, p0, LPH2;->a:LwH2$c;

    invoke-static {v0}, LPH2;->a(LwH2$c;)LrH2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPH2;->c()LrH2;

    move-result-object v0

    return-object v0
.end method
