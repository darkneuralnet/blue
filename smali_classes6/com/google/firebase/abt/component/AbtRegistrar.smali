.class public Lcom/google/firebase/abt/component/AbtRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-abt"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LOs0;)Lx1;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/abt/component/AbtRegistrar;->lambda$getComponents$0(LOs0;)Lx1;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LOs0;)Lx1;
    .locals 3

    new-instance v0, Lx1;

    const-class v1, Landroid/content/Context;

    invoke-interface {p0, v1}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lba;

    invoke-interface {p0, v2}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lx1;-><init>(Landroid/content/Context;LX94;)V

    return-object v0
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

    const-class v1, Lx1;

    invoke-static {v1}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v1

    const-string v2, "fire-abt"

    invoke-virtual {v1, v2}, LEs0$b;->h(Ljava/lang/String;)LEs0$b;

    move-result-object v1

    const-class v3, Landroid/content/Context;

    invoke-static {v3}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, Lba;

    invoke-static {v3}, Lk01;->i(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    new-instance v3, Lz1;

    invoke-direct {v3}, Lz1;-><init>()V

    invoke-virtual {v1, v3}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v1

    invoke-virtual {v1}, LEs0$b;->d()LEs0;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "21.1.1"

    invoke-static {v2, v1}, Lvq2;->b(Ljava/lang/String;Ljava/lang/String;)LEs0;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
