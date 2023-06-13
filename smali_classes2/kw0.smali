.class public final synthetic Lkw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Llw0;

.field public final synthetic c:Lco/bird/android/model/constant/ConfigurableTutorialContext;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Llw0;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkw0;->b:Llw0;

    iput-object p2, p0, Lkw0;->c:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    iput-object p3, p0, Lkw0;->d:Ljava/lang/String;

    iput-boolean p4, p0, Lkw0;->e:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lkw0;->b:Llw0;

    iget-object v1, p0, Lkw0;->c:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    iget-object v2, p0, Lkw0;->d:Ljava/lang/String;

    iget-boolean v3, p0, Lkw0;->e:Z

    invoke-static {v0, v1, v2, v3}, Llw0$a;->a(Llw0;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;Z)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
