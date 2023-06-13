.class public final LQj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LRv0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/persistence/announcements/ConfigurableTutorialDatabase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhj;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/persistence/announcements/ConfigurableTutorialDatabase;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQj;->a:Lhj;

    iput-object p2, p0, LQj;->b:LY94;

    return-void
.end method

.method public static a(Lhj;LY94;)LQj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/persistence/announcements/ConfigurableTutorialDatabase;",
            ">;)",
            "LQj;"
        }
    .end annotation

    new-instance v0, LQj;

    invoke-direct {v0, p0, p1}, LQj;-><init>(Lhj;LY94;)V

    return-object v0
.end method

.method public static c(Lhj;Lco/bird/android/persistence/announcements/ConfigurableTutorialDatabase;)LRv0;
    .locals 0

    invoke-virtual {p0, p1}, Lhj;->J(Lco/bird/android/persistence/announcements/ConfigurableTutorialDatabase;)LRv0;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LRv0;

    return-object p0
.end method


# virtual methods
.method public b()LRv0;
    .locals 2

    iget-object v0, p0, LQj;->a:Lhj;

    iget-object v1, p0, LQj;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/persistence/announcements/ConfigurableTutorialDatabase;

    invoke-static {v0, v1}, LQj;->c(Lhj;Lco/bird/android/persistence/announcements/ConfigurableTutorialDatabase;)LRv0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQj;->b()LRv0;

    move-result-object v0

    return-object v0
.end method
