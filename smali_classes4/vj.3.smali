.class public final Lvj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Landroid/app/Application;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;


# direct methods
.method public constructor <init>(Lhj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvj;->a:Lhj;

    return-void
.end method

.method public static a(Lhj;)Lvj;
    .locals 1

    new-instance v0, Lvj;

    invoke-direct {v0, p0}, Lvj;-><init>(Lhj;)V

    return-object v0
.end method

.method public static c(Lhj;)Landroid/app/Application;
    .locals 0

    invoke-virtual {p0}, Lhj;->m()Landroid/app/Application;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Application;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/app/Application;
    .locals 1

    iget-object v0, p0, Lvj;->a:Lhj;

    invoke-static {v0}, Lvj;->c(Lhj;)Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvj;->b()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method
