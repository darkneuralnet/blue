.class public final Llj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Landroid/location/LocationManager;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;


# direct methods
.method public constructor <init>(Lhj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llj;->a:Lhj;

    return-void
.end method

.method public static a(Lhj;)Llj;
    .locals 1

    new-instance v0, Llj;

    invoke-direct {v0, p0}, Llj;-><init>(Lhj;)V

    return-object v0
.end method

.method public static c(Lhj;)Landroid/location/LocationManager;
    .locals 0

    invoke-virtual {p0}, Lhj;->d()Landroid/location/LocationManager;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/location/LocationManager;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/location/LocationManager;
    .locals 1

    iget-object v0, p0, Llj;->a:Lhj;

    invoke-static {v0}, Llj;->c(Lhj;)Landroid/location/LocationManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llj;->b()Landroid/location/LocationManager;

    move-result-object v0

    return-object v0
.end method
