.class public final LZF3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbn;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
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
            "Ldr4;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZF3;->a:LY94;

    iput-object p2, p0, LZF3;->b:LY94;

    iput-object p3, p0, LZF3;->c:LY94;

    iput-object p4, p0, LZF3;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LZF3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;)",
            "LZF3;"
        }
    .end annotation

    new-instance v0, LZF3;

    invoke-direct {v0, p0, p1, p2, p3}, LZF3;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Ldr4;Lbn;LEa;LYR4;Le13;LaG3;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;)LWF3;
    .locals 10

    new-instance v9, LWF3;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LWF3;-><init>(Ldr4;Lbn;LEa;LYR4;Le13;LaG3;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;)V

    return-object v9
.end method


# virtual methods
.method public b(Le13;LaG3;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;)LWF3;
    .locals 9

    iget-object v0, p0, LZF3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ldr4;

    iget-object v0, p0, LZF3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lbn;

    iget-object v0, p0, LZF3;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LEa;

    iget-object v0, p0, LZF3;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LYR4;

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-static/range {v1 .. v8}, LZF3;->c(Ldr4;Lbn;LEa;LYR4;Le13;LaG3;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;)LWF3;

    move-result-object p1

    return-object p1
.end method
