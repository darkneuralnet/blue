.class public final synthetic Lh42;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lj42;

.field public final synthetic c:Lco/bird/android/model/InspectionFlow;


# direct methods
.method public synthetic constructor <init>(Lj42;Lco/bird/android/model/InspectionFlow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh42;->b:Lj42;

    iput-object p2, p0, Lh42;->c:Lco/bird/android/model/InspectionFlow;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lh42;->b:Lj42;

    iget-object v1, p0, Lh42;->c:Lco/bird/android/model/InspectionFlow;

    invoke-static {v0, v1}, Lj42;->a(Lj42;Lco/bird/android/model/InspectionFlow;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
