.class public final Lug3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltg3;


# instance fields
.field public final a:Lvg3;


# direct methods
.method public constructor <init>(Lvg3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lug3;->a:Lvg3;

    return-void
.end method

.method public static b(Lvg3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg3;",
            ")",
            "LY94<",
            "Ltg3;",
            ">;"
        }
    .end annotation

    new-instance v0, Lug3;

    invoke-direct {v0, p0}, Lug3;-><init>(Lvg3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LQA2;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;)Log3;
    .locals 1

    iget-object v0, p0, Lug3;->a:Lvg3;

    invoke-virtual {v0, p1, p2, p3}, Lvg3;->b(LQA2;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;)Log3;

    move-result-object p1

    return-object p1
.end method
