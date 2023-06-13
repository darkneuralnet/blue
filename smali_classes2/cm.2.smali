.class public final Lcm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
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
            "Llh6;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcm;->a:LY94;

    iput-object p2, p0, Lcm;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)Lcm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)",
            "Lcm;"
        }
    .end annotation

    new-instance v0, Lcm;

    invoke-direct {v0, p0, p1}, Lcm;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Llh6;LRh6;)Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;
    .locals 1

    new-instance v0, Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;

    invoke-direct {v0, p0, p1}, Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;-><init>(Llh6;LRh6;)V

    return-object v0
.end method


# virtual methods
.method public b()Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;
    .locals 2

    iget-object v0, p0, Lcm;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh6;

    iget-object v1, p0, Lcm;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRh6;

    invoke-static {v0, v1}, Lcm;->c(Llh6;LRh6;)Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcm;->b()Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;

    move-result-object v0

    return-object v0
.end method
