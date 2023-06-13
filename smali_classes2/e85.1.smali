.class public final Le85;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbn;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le85;->a:LY94;

    iput-object p2, p0, Le85;->b:LY94;

    iput-object p3, p0, Le85;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Le85;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "Le85;"
        }
    .end annotation

    new-instance v0, Le85;

    invoke-direct {v0, p0, p1, p2}, Le85;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lbn;LTq4;Landroid/content/Context;Lco/bird/android/model/FlightBannerNode$RiderBarType;Landroid/view/View;Z)Lb85;
    .locals 8

    new-instance v7, Lb85;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lb85;-><init>(Lbn;LTq4;Landroid/content/Context;Lco/bird/android/model/FlightBannerNode$RiderBarType;Landroid/view/View;Z)V

    return-object v7
.end method


# virtual methods
.method public b(Lco/bird/android/model/FlightBannerNode$RiderBarType;Landroid/view/View;Z)Lb85;
    .locals 7

    iget-object v0, p0, Le85;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lbn;

    iget-object v0, p0, Le85;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LTq4;

    iget-object v0, p0, Le85;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/content/Context;

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-static/range {v1 .. v6}, Le85;->c(Lbn;LTq4;Landroid/content/Context;Lco/bird/android/model/FlightBannerNode$RiderBarType;Landroid/view/View;Z)Lb85;

    move-result-object p1

    return-object p1
.end method
