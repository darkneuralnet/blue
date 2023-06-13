.class public final Lnn1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/google/android/libraries/places/api/net/PlacesClient;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljn1;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljn1;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljn1;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnn1;->a:Ljn1;

    iput-object p2, p0, Lnn1;->b:LY94;

    iput-object p3, p0, Lnn1;->c:LY94;

    return-void
.end method

.method public static a(Ljn1;LY94;LY94;)Lnn1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljn1;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;)",
            "Lnn1;"
        }
    .end annotation

    new-instance v0, Lnn1;

    invoke-direct {v0, p0, p1, p2}, Lnn1;-><init>(Ljn1;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Ljn1;Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/libraries/places/api/net/PlacesClient;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ljn1;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/libraries/places/api/net/PlacesClient;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/libraries/places/api/net/PlacesClient;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/google/android/libraries/places/api/net/PlacesClient;
    .locals 3

    iget-object v0, p0, Lnn1;->a:Ljn1;

    iget-object v1, p0, Lnn1;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lnn1;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lnn1;->c(Ljn1;Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/libraries/places/api/net/PlacesClient;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnn1;->b()Lcom/google/android/libraries/places/api/net/PlacesClient;

    move-result-object v0

    return-object v0
.end method
