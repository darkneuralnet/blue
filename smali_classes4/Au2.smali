.class public final synthetic LAu2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lco/bird/android/model/constant/AssetManagerType;

.field public final synthetic d:Lco/bird/android/model/constant/TaskPriority;

.field public final synthetic e:LIu2;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Lco/bird/android/model/constant/TaskPriority;LIu2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAu2;->b:Ljava/lang/String;

    iput-object p2, p0, LAu2;->c:Lco/bird/android/model/constant/AssetManagerType;

    iput-object p3, p0, LAu2;->d:Lco/bird/android/model/constant/TaskPriority;

    iput-object p4, p0, LAu2;->e:LIu2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LAu2;->b:Ljava/lang/String;

    iget-object v1, p0, LAu2;->c:Lco/bird/android/model/constant/AssetManagerType;

    iget-object v2, p0, LAu2;->d:Lco/bird/android/model/constant/TaskPriority;

    iget-object v3, p0, LAu2;->e:LIu2;

    invoke-static {v0, v1, v2, v3}, LIu2;->n(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Lco/bird/android/model/constant/TaskPriority;LIu2;)V

    return-void
.end method
