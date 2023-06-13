.class public Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;
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
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fcm"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LOs0;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->lambda$getComponents$0(LOs0;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LOs0;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 9

    new-instance v8, Lcom/google/firebase/messaging/FirebaseMessaging;

    const-class v0, LAm1;

    invoke-interface {p0, v0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LAm1;

    const-class v0, LUm1;

    invoke-interface {p0, v0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LUm1;

    const-class v0, Lhg6;

    invoke-interface {p0, v0}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object v3

    const-class v0, LvI1;

    invoke-interface {p0, v0}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object v4

    const-class v0, LSm1;

    invoke-interface {p0, v0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LSm1;

    const-class v0, LU96;

    invoke-interface {p0, v0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LU96;

    const-class v0, LiT5;

    invoke-interface {p0, v0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, LiT5;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(LAm1;LUm1;LX94;LX94;LSm1;LU96;LiT5;)V

    return-object v8
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

    const/4 v0, 0x2

    new-array v0, v0, [LEs0;

    const-class v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-static {v1}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v1

    const-string v2, "fire-fcm"

    invoke-virtual {v1, v2}, LEs0$b;->h(Ljava/lang/String;)LEs0$b;

    move-result-object v1

    const-class v3, LAm1;

    invoke-static {v3}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, LUm1;

    invoke-static {v3}, Lk01;->h(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, Lhg6;

    invoke-static {v3}, Lk01;->i(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, LvI1;

    invoke-static {v3}, Lk01;->i(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, LU96;

    invoke-static {v3}, Lk01;->h(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, LSm1;

    invoke-static {v3}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, LiT5;

    invoke-static {v3}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    new-instance v3, Lin1;

    invoke-direct {v3}, Lin1;-><init>()V

    invoke-virtual {v1, v3}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v1

    invoke-virtual {v1}, LEs0$b;->c()LEs0$b;

    move-result-object v1

    invoke-virtual {v1}, LEs0$b;->d()LEs0;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "23.1.2"

    invoke-static {v2, v1}, Lvq2;->b(Ljava/lang/String;Ljava/lang/String;)LEs0;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
