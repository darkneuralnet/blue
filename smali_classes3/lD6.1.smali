.class public final synthetic LlD6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LmD6;

.field public final synthetic c:Lco/bird/android/model/BirdSummaryBody;

.field public final synthetic d:Lco/bird/android/model/WorkOrder;


# direct methods
.method public synthetic constructor <init>(LmD6;Lco/bird/android/model/BirdSummaryBody;Lco/bird/android/model/WorkOrder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlD6;->b:LmD6;

    iput-object p2, p0, LlD6;->c:Lco/bird/android/model/BirdSummaryBody;

    iput-object p3, p0, LlD6;->d:Lco/bird/android/model/WorkOrder;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LlD6;->b:LmD6;

    iget-object v1, p0, LlD6;->c:Lco/bird/android/model/BirdSummaryBody;

    iget-object v2, p0, LlD6;->d:Lco/bird/android/model/WorkOrder;

    invoke-static {v0, v1, v2}, LmD6;->b(LmD6;Lco/bird/android/model/BirdSummaryBody;Lco/bird/android/model/WorkOrder;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
