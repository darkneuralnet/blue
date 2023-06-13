.class public final Lir;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhr;


# instance fields
.field public final a:Ljr;


# direct methods
.method public constructor <init>(Ljr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lir;->a:Ljr;

    return-void
.end method

.method public static b(Ljr;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljr;",
            ")",
            "LY94<",
            "Lhr;",
            ">;"
        }
    .end annotation

    new-instance v0, Lir;

    invoke-direct {v0, p0}, Lir;-><init>(Ljr;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/res/Resources;Lco/bird/android/app/feature/autopay/b;Le13;Z)Lgr;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Landroid/content/res/Resources;",
            "Lco/bird/android/app/feature/autopay/b;",
            "Le13;",
            "Z)",
            "Lgr;"
        }
    .end annotation

    iget-object v0, p0, Lir;->a:Ljr;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Ljr;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/res/Resources;Lco/bird/android/app/feature/autopay/b;Le13;Z)Lgr;

    move-result-object p1

    return-object p1
.end method
