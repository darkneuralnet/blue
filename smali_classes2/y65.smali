.class public final Ly65;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LVa5;",
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
            "LVa5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly65;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Ly65;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LVa5;",
            ">;)",
            "Ly65;"
        }
    .end annotation

    new-instance v0, Ly65;

    invoke-direct {v0, p0}, Ly65;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LVa5;Lcom/uber/autodispose/ScopeProvider;LZa5;Lco/bird/android/model/ridertutorial/TutorialKind;)Lv65;
    .locals 1

    new-instance v0, Lv65;

    invoke-direct {v0, p0, p1, p2, p3}, Lv65;-><init>(LVa5;Lcom/uber/autodispose/ScopeProvider;LZa5;Lco/bird/android/model/ridertutorial/TutorialKind;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;LZa5;Lco/bird/android/model/ridertutorial/TutorialKind;)Lv65;
    .locals 1

    iget-object v0, p0, Ly65;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVa5;

    invoke-static {v0, p1, p2, p3}, Ly65;->c(LVa5;Lcom/uber/autodispose/ScopeProvider;LZa5;Lco/bird/android/model/ridertutorial/TutorialKind;)Lv65;

    move-result-object p1

    return-object p1
.end method
