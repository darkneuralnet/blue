.class public final LGs1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LFs1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LoA;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/base/BaseCoreActivity;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LPZ;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYs1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LoA;",
            ">;",
            "LY94<",
            "Lco/bird/android/core/base/BaseCoreActivity;",
            ">;",
            "LY94<",
            "LPZ;",
            ">;",
            "LY94<",
            "LYs1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGs1;->a:LY94;

    iput-object p2, p0, LGs1;->b:LY94;

    iput-object p3, p0, LGs1;->c:LY94;

    iput-object p4, p0, LGs1;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LGs1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LoA;",
            ">;",
            "LY94<",
            "Lco/bird/android/core/base/BaseCoreActivity;",
            ">;",
            "LY94<",
            "LPZ;",
            ">;",
            "LY94<",
            "LYs1;",
            ">;)",
            "LGs1;"
        }
    .end annotation

    new-instance v0, LGs1;

    invoke-direct {v0, p0, p1, p2, p3}, LGs1;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LoA;Lco/bird/android/core/base/BaseCoreActivity;LPZ;LYs1;)LFs1;
    .locals 1

    new-instance v0, LFs1;

    invoke-direct {v0, p0, p1, p2, p3}, LFs1;-><init>(LoA;Lco/bird/android/core/base/BaseCoreActivity;LPZ;LYs1;)V

    return-object v0
.end method


# virtual methods
.method public b()LFs1;
    .locals 4

    iget-object v0, p0, LGs1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoA;

    iget-object v1, p0, LGs1;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/core/base/BaseCoreActivity;

    iget-object v2, p0, LGs1;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LPZ;

    iget-object v3, p0, LGs1;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYs1;

    invoke-static {v0, v1, v2, v3}, LGs1;->c(LoA;Lco/bird/android/core/base/BaseCoreActivity;LPZ;LYs1;)LFs1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LGs1;->b()LFs1;

    move-result-object v0

    return-object v0
.end method
