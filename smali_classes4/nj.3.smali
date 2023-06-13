.class public final Lnj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Landroid/content/pm/PackageManager;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;


# direct methods
.method public constructor <init>(Lhj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnj;->a:Lhj;

    return-void
.end method

.method public static a(Lhj;)Lnj;
    .locals 1

    new-instance v0, Lnj;

    invoke-direct {v0, p0}, Lnj;-><init>(Lhj;)V

    return-object v0
.end method

.method public static c(Lhj;)Landroid/content/pm/PackageManager;
    .locals 0

    invoke-virtual {p0}, Lhj;->f()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/PackageManager;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/content/pm/PackageManager;
    .locals 1

    iget-object v0, p0, Lnj;->a:Lhj;

    invoke-static {v0}, Lnj;->c(Lhj;)Landroid/content/pm/PackageManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnj;->b()Landroid/content/pm/PackageManager;

    move-result-object v0

    return-object v0
.end method
