.class public final synthetic Lls;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lks;

.field public final synthetic c:Lco/bird/android/model/PlanItemModel;


# direct methods
.method public synthetic constructor <init>(Lks;Lco/bird/android/model/PlanItemModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lls;->b:Lks;

    iput-object p2, p0, Lls;->c:Lco/bird/android/model/PlanItemModel;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lls;->b:Lks;

    iget-object v1, p0, Lls;->c:Lco/bird/android/model/PlanItemModel;

    invoke-static {v0, v1}, Lks$e;->a(Lks;Lco/bird/android/model/PlanItemModel;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
