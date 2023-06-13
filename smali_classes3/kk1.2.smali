.class public final synthetic Lkk1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lgk1;

.field public final synthetic c:Lco/bird/android/model/persistence/Announcement;


# direct methods
.method public synthetic constructor <init>(Lgk1;Lco/bird/android/model/persistence/Announcement;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkk1;->b:Lgk1;

    iput-object p2, p0, Lkk1;->c:Lco/bird/android/model/persistence/Announcement;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lkk1;->b:Lgk1;

    iget-object v1, p0, Lkk1;->c:Lco/bird/android/model/persistence/Announcement;

    invoke-static {v0, v1}, Lgk1$e;->b(Lgk1;Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
