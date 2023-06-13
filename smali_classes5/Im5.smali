.class public final LIm5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrj1<",
        "LFG6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LQg1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lym5;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbl0;",
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
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LQg1;",
            ">;",
            "LY94<",
            "Lym5;",
            ">;",
            "LY94<",
            "Lbl0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIm5;->a:LY94;

    iput-object p2, p0, LIm5;->b:LY94;

    iput-object p3, p0, LIm5;->c:LY94;

    iput-object p4, p0, LIm5;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LIm5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LQg1;",
            ">;",
            "LY94<",
            "Lym5;",
            ">;",
            "LY94<",
            "Lbl0;",
            ">;)",
            "LIm5;"
        }
    .end annotation

    new-instance v0, LIm5;

    invoke-direct {v0, p0, p1, p2, p3}, LIm5;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;LQg1;Lym5;Lbl0;)LFG6;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LHm5;->a(Landroid/content/Context;LQg1;Lym5;Lbl0;)LFG6;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, LCZ3;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LFG6;

    return-object p0
.end method


# virtual methods
.method public b()LFG6;
    .locals 4

    iget-object v0, p0, LIm5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, LIm5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQg1;

    iget-object v2, p0, LIm5;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lym5;

    iget-object v3, p0, LIm5;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbl0;

    invoke-static {v0, v1, v2, v3}, LIm5;->c(Landroid/content/Context;LQg1;Lym5;Lbl0;)LFG6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIm5;->b()LFG6;

    move-result-object v0

    return-object v0
.end method
