.class public final LuG;
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

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
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
            "Lfa5;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuG;->a:LY94;

    iput-object p2, p0, LuG;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LuG;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lfa5;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "LuG;"
        }
    .end annotation

    new-instance v0, LuG;

    invoke-direct {v0, p0, p1}, LuG;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lfa5;Landroid/content/Context;LZa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeBottomView;Lcom/uber/autodispose/ScopeProvider;)LpG;
    .locals 7

    new-instance v6, LpG;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LpG;-><init>(Lfa5;Landroid/content/Context;LZa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeBottomView;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v6
.end method


# virtual methods
.method public b(LZa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeBottomView;Lcom/uber/autodispose/ScopeProvider;)LpG;
    .locals 2

    iget-object v0, p0, LuG;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfa5;

    iget-object v1, p0, LuG;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1, p1, p2, p3}, LuG;->c(Lfa5;Landroid/content/Context;LZa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeBottomView;Lcom/uber/autodispose/ScopeProvider;)LpG;

    move-result-object p1

    return-object p1
.end method
