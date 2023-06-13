.class public final Lcom/google/firebase/dynamiclinks/internal/FirebaseDynamicLinkRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-dl"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LOs0;)LKm1;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/dynamiclinks/internal/FirebaseDynamicLinkRegistrar;->lambda$getComponents$0(LOs0;)LKm1;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LOs0;)LKm1;
    .locals 3

    new-instance v0, LLm1;

    const-class v1, LAm1;

    invoke-interface {p0, v1}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAm1;

    const-class v2, Lba;

    invoke-interface {p0, v2}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LLm1;-><init>(LAm1;LX94;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LEs0<",
            "*>;>;"
        }
    .end annotation

    const-class v0, LKm1;

    invoke-static {v0}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v0

    const-string v1, "fire-dl"

    invoke-virtual {v0, v1}, LEs0$b;->h(Ljava/lang/String;)LEs0$b;

    move-result-object v0

    const-class v2, LAm1;

    invoke-static {v2}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v2

    invoke-virtual {v0, v2}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v0

    const-class v2, Lba;

    invoke-static {v2}, Lk01;->i(Ljava/lang/Class;)Lk01;

    move-result-object v2

    invoke-virtual {v0, v2}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v0

    new-instance v2, LJm1;

    invoke-direct {v2}, LJm1;-><init>()V

    invoke-virtual {v0, v2}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v0

    invoke-virtual {v0}, LEs0$b;->d()LEs0;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [LEs0;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const-string v0, "21.1.0"

    invoke-static {v1, v0}, Lvq2;->b(Ljava/lang/String;Ljava/lang/String;)LEs0;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
