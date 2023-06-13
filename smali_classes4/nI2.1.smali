.class public final LnI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LaY;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;


# direct methods
.method public constructor <init>(LVH2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnI2;->a:LVH2;

    return-void
.end method

.method public static a(LVH2;)LnI2;
    .locals 1

    new-instance v0, LnI2;

    invoke-direct {v0, p0}, LnI2;-><init>(LVH2;)V

    return-object v0
.end method

.method public static c(LVH2;)LaY;
    .locals 0

    invoke-virtual {p0}, LVH2;->r()LaY;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LaY;

    return-object p0
.end method


# virtual methods
.method public b()LaY;
    .locals 1

    iget-object v0, p0, LnI2;->a:LVH2;

    invoke-static {v0}, LnI2;->c(LVH2;)LaY;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LnI2;->b()LaY;

    move-result-object v0

    return-object v0
.end method
