.class public final synthetic Lpr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Ltr;

.field public final synthetic c:Lco/bird/android/model/PlanItemModel;


# direct methods
.method public synthetic constructor <init>(Ltr;Lco/bird/android/model/PlanItemModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpr;->b:Ltr;

    iput-object p2, p0, Lpr;->c:Lco/bird/android/model/PlanItemModel;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lpr;->b:Ltr;

    iget-object v1, p0, Lpr;->c:Lco/bird/android/model/PlanItemModel;

    invoke-static {v0, v1}, Ltr;->g(Ltr;Lco/bird/android/model/PlanItemModel;)V

    return-void
.end method
