.class public final LzG;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lfa5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lfa5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzG;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LzG;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lfa5;",
            ">;)",
            "LzG;"
        }
    .end annotation

    new-instance v0, LzG;

    invoke-direct {v0, p0}, LzG;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lfa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;Lcom/uber/autodispose/ScopeProvider;)LwG;
    .locals 1

    new-instance v0, LwG;

    invoke-direct {v0, p0, p1, p2}, LwG;-><init>(Lfa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v0
.end method


# virtual methods
.method public b(Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;Lcom/uber/autodispose/ScopeProvider;)LwG;
    .locals 1

    iget-object v0, p0, LzG;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfa5;

    invoke-static {v0, p1, p2}, LzG;->c(Lfa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;Lcom/uber/autodispose/ScopeProvider;)LwG;

    move-result-object p1

    return-object p1
.end method
