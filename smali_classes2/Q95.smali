.class public final synthetic LQ95;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LY95;

.field public final synthetic c:Lco/bird/android/model/constant/ConfigurableTutorialContext;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LY95;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ95;->b:LY95;

    iput-object p2, p0, LQ95;->c:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    iput-object p3, p0, LQ95;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LQ95;->b:LY95;

    iget-object v1, p0, LQ95;->c:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    iget-object v2, p0, LQ95;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, LY95;->y(LY95;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
