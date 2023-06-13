.class public final synthetic LZt1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LQt1;

.field public final synthetic c:Lco/bird/android/model/persistence/Bird;


# direct methods
.method public synthetic constructor <init>(LQt1;Lco/bird/android/model/persistence/Bird;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZt1;->b:LQt1;

    iput-object p2, p0, LZt1;->c:Lco/bird/android/model/persistence/Bird;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LZt1;->b:LQt1;

    iget-object v1, p0, LZt1;->c:Lco/bird/android/model/persistence/Bird;

    invoke-static {v0, v1}, LQt1$A;->a(LQt1;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
