.class public LLm1;
.super LKm1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLm1$b;,
        LLm1$d;,
        LLm1$a;,
        LLm1$c;,
        LLm1$e;
    }
.end annotation


# instance fields
.field public final a:Lcom/google/android/gms/common/api/GoogleApi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/GoogleApi<",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "Lba;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LAm1;


# direct methods
.method public constructor <init>(LAm1;LX94;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAm1;",
            "LX94<",
            "Lba;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lz81;

    invoke-virtual {p1}, LAm1;->j()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lz81;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p1, p2}, LLm1;-><init>(Lcom/google/android/gms/common/api/GoogleApi;LAm1;LX94;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/GoogleApi;LAm1;LX94;)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApi<",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;",
            ">;",
            "LAm1;",
            "LX94<",
            "Lba;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, LKm1;-><init>()V

    iput-object p1, p0, LLm1;->a:Lcom/google/android/gms/common/api/GoogleApi;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LAm1;

    iput-object p1, p0, LLm1;->c:LAm1;

    iput-object p3, p0, LLm1;->b:LX94;

    invoke-interface {p3}, LX94;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "FDL"

    const-string p2, "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static h(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "dynamicLink"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    const-string v1, "domainUriPrefix"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain()."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a()Lu81;
    .locals 1

    new-instance v0, Lu81;

    invoke-direct {v0, p0}, Lu81;-><init>(LLm1;)V

    return-object v0
.end method

.method public b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "LbQ3;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LLm1;->a:Lcom/google/android/gms/common/api/GoogleApi;

    new-instance v2, LLm1$e;

    iget-object v3, p0, LLm1;->b:LX94;

    invoke-direct {v2, v3, v0}, LLm1$e;-><init>(LX94;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/GoogleApi;->doWrite(Lcom/google/android/gms/common/api/internal/TaskApiCall;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, LLm1;->g(Landroid/content/Intent;)LbQ3;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public e(Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "LUz5;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, LLm1;->h(Landroid/os/Bundle;)V

    iget-object v0, p0, LLm1;->a:Lcom/google/android/gms/common/api/GoogleApi;

    new-instance v1, LLm1$c;

    invoke-direct {v1, p1}, LLm1$c;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApi;->doWrite(Lcom/google/android/gms/common/api/internal/TaskApiCall;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public f()LAm1;
    .locals 1

    iget-object v0, p0, LLm1;->c:LAm1;

    return-object v0
.end method

.method public g(Landroid/content/Intent;)LbQ3;
    .locals 2

    const-string v0, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA"

    sget-object v1, Lcom/google/firebase/dynamiclinks/internal/DynamicLinkData;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelableSerializer;->deserializeFromIntentExtra(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/dynamiclinks/internal/DynamicLinkData;

    if-eqz p1, :cond_0

    new-instance v0, LbQ3;

    invoke-direct {v0, p1}, LbQ3;-><init>(Lcom/google/firebase/dynamiclinks/internal/DynamicLinkData;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
