.class public final synthetic LWo1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LOo1;

.field public final synthetic c:Lco/bird/android/model/persistence/nestedstructures/FleetListAction;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LOo1;Lco/bird/android/model/persistence/nestedstructures/FleetListAction;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWo1;->b:LOo1;

    iput-object p2, p0, LWo1;->c:Lco/bird/android/model/persistence/nestedstructures/FleetListAction;

    iput-object p3, p0, LWo1;->d:Ljava/lang/String;

    iput-object p4, p0, LWo1;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LWo1;->b:LOo1;

    iget-object v1, p0, LWo1;->c:Lco/bird/android/model/persistence/nestedstructures/FleetListAction;

    iget-object v2, p0, LWo1;->d:Ljava/lang/String;

    iget-object v3, p0, LWo1;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, LOo1$o;->a(LOo1;Lco/bird/android/model/persistence/nestedstructures/FleetListAction;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
