.class public Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-cls"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;LOs0;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->buildCrashlytics(LOs0;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    move-result-object p0

    return-object p0
.end method

.method private buildCrashlytics(LOs0;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;
    .locals 4

    const-class v0, LAm1;

    invoke-interface {p1, v0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAm1;

    const-class v1, Lcom/google/firebase/crashlytics/internal/CrashlyticsNativeComponent;

    invoke-interface {p1, v1}, LOs0;->h(Ljava/lang/Class;)LgZ0;

    move-result-object v1

    const-class v2, Lba;

    invoke-interface {p1, v2}, LOs0;->h(Ljava/lang/Class;)LgZ0;

    move-result-object v2

    const-class v3, LSm1;

    invoke-interface {p1, v3}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSm1;

    invoke-static {v0, p1, v1, v2}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->init(LAm1;LSm1;LgZ0;LgZ0;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
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

    const-class v1, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    invoke-static {v1}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v1

    const-string v2, "fire-cls"

    invoke-virtual {v1, v2}, LEs0$b;->h(Ljava/lang/String;)LEs0$b;

    move-result-object v1

    const-class v3, LAm1;

    invoke-static {v3}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, LSm1;

    invoke-static {v3}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, Lcom/google/firebase/crashlytics/internal/CrashlyticsNativeComponent;

    invoke-static {v3}, Lk01;->a(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, Lba;

    invoke-static {v3}, Lk01;->a(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    new-instance v3, LYD0;

    invoke-direct {v3, p0}, LYD0;-><init>(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;)V

    invoke-virtual {v1, v3}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v1

    invoke-virtual {v1}, LEs0$b;->e()LEs0$b;

    move-result-object v1

    invoke-virtual {v1}, LEs0$b;->d()LEs0;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "18.3.7"

    invoke-static {v2, v1}, Lvq2;->b(Ljava/lang/String;Ljava/lang/String;)LEs0;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
