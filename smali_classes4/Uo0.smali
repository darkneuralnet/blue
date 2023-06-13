.class public final synthetic LUo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lip0;

.field public final synthetic c:Lco/bird/android/model/persistence/Bird;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lip0;Lco/bird/android/model/persistence/Bird;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUo0;->b:Lip0;

    iput-object p2, p0, LUo0;->c:Lco/bird/android/model/persistence/Bird;

    iput-boolean p3, p0, LUo0;->d:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LUo0;->b:Lip0;

    iget-object v1, p0, LUo0;->c:Lco/bird/android/model/persistence/Bird;

    iget-boolean v2, p0, LUo0;->d:Z

    invoke-static {v0, v1, v2}, Lip0;->n(Lip0;Lco/bird/android/model/persistence/Bird;Z)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
