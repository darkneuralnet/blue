.class public final LmO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LlO;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LeT2;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/google/android/libraries/places/api/net/PlacesClient;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LeT2;",
            ">;",
            "LY94<",
            "Lcom/google/android/libraries/places/api/net/PlacesClient;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmO;->a:LY94;

    iput-object p2, p0, LmO;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LmO;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LeT2;",
            ">;",
            "LY94<",
            "Lcom/google/android/libraries/places/api/net/PlacesClient;",
            ">;)",
            "LmO;"
        }
    .end annotation

    new-instance v0, LmO;

    invoke-direct {v0, p0, p1}, LmO;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LeT2;Lcom/google/android/libraries/places/api/net/PlacesClient;)LlO;
    .locals 1

    new-instance v0, LlO;

    invoke-direct {v0, p0, p1}, LlO;-><init>(LeT2;Lcom/google/android/libraries/places/api/net/PlacesClient;)V

    return-object v0
.end method


# virtual methods
.method public b()LlO;
    .locals 2

    iget-object v0, p0, LmO;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LeT2;

    iget-object v1, p0, LmO;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/libraries/places/api/net/PlacesClient;

    invoke-static {v0, v1}, LmO;->c(LeT2;Lcom/google/android/libraries/places/api/net/PlacesClient;)LlO;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LmO;->b()LlO;

    move-result-object v0

    return-object v0
.end method
